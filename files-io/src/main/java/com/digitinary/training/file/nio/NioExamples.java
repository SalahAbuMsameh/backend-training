package com.digitinary.training.file.nio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * 
 * Apr 26, 2021
 * @author Salah Abu Msameh
 */
public class NioExamples {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//filesClassExample();
		//readFileUsingFilesClassExample();
		//nioReadWriteExample();
		asynchFileReadingExample();
		
	}

	/**
	 * 
	 */
	private static void readFileUsingFilesClassExample() {
		
		try (BufferedReader br = Files.newBufferedReader(Paths.get("D:\\books\\test.txt"), StandardCharsets.UTF_8)) {
			
			String line = null;
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//use it with small file size
		/*try {
			Files.readAllLines(Paths.get("D:\\books\\test.txt"))
				.forEach(line -> System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}

	/**
	 * 
	 */
	private static void filesClassExample() {
		
		Path path = Paths.get("D:\\books\\Head First Design Patterns (2008).pdf");
		System.out.println(Files.isDirectory(path));
		//copy 
		//file properties
		//check security 
	}

	/**
	 * 
	 */
	private static void nioReadWriteExample() {
		
		try {
			FileInputStream fis = new FileInputStream(new File("D:\\books\\Head First Design Patterns (2008).pdf"));
			FileOutputStream fos = new FileOutputStream(new File("D:\\books\\My File from Java.pdf"));
			
			FileChannel inFileChannel = fis.getChannel();
			FileChannel outFileChannel = fos.getChannel();
			
			//create buffer
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
			
			while(inFileChannel.read(byteBuffer) > 0) {
				
				//swich buffer from put to get mode
				byteBuffer.flip();
				outFileChannel.write(byteBuffer);
				//reset pointers as the initialization state
				byteBuffer.clear();
			}
			
			fis.close();
			fos.close();
			
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
	
	/**
	 * 
	 */
	private static void asynchFileReadingExample() {
		
		AsynchronousFileChannel asyncFilechannel = null;
		
		try {
			asyncFilechannel = AsynchronousFileChannel.open(Paths.get("D:\\books\\Java How to Program 9th Edition.pdf"),
					StandardOpenOption.READ);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//create buffer
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		
		//start new thread
		asyncFilechannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {

			@Override
			public void completed(Integer result, ByteBuffer attachment) {
				System.out.println(Thread.currentThread().getName());
				System.out.println("Reading file is done");
			}

			@Override
			public void failed(Throwable exc, ByteBuffer attachment) {
				exc.printStackTrace();
			}
		});
		
		System.out.println(Thread.currentThread().getName());
		System.out.println("Main thread is done");
		System.out.println("Waiting");
	}
}
