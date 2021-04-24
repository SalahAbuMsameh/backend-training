package com.digitinary.training.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 
 * Apr 21, 2021
 * @author Salah Abu Msameh
 */
public class FileExamples {

	/**
	 * 
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		//fileClassExample();
		//readCharFileExample();
		readBinaryFileExample();
	}

	/**
	 * 
	 */
	private static void readBinaryFileExample() {
		
		try {
			FileInputStream fis = new FileInputStream(new File("D:\\books\\Head First Design Patterns (2008).pdf"));
			FileOutputStream fos = new FileOutputStream(new File("D:\\books\\My File from Java.pdf"));
			
			//BufferedInputStream
			
			//int b = -1;
			int noOfReadedBytes = -1;
			byte[] buffer = new byte[50000];
			long startTime = System.currentTimeMillis();
			
			while((noOfReadedBytes = fis.read(buffer)) != -1) {
				fos.write(buffer);
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("Done, reading took >> " + ((endTime - startTime) ) + " ms");
			
			fis.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void readCharFileExample() {
		
		//1.character based file
		try (FileReader fileReader = new FileReader(new File("D:\\books\\test.txt"))) {//auto closable
			
			//BufferedReader br = new BufferedReader(new FileReader(new File("D:\\books\\test.txt")));
			//br.readLine()
			
			int c = -1;
			
			while((c = fileReader.read()) != -1) {
				System.out.print((char) c);
			}
			
			//release connection
			fileReader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @throws IOException 
	 * 
	 */
	private static void fileClassExample() throws IOException {
		
		File file = new File("D:\\books\\test.txt");
		
		System.out.println(file.isDirectory());//false
		System.out.println(file.getAbsolutePath());//"D:/asd/asd/asd/asd/asd/file.text"
		System.out.println(file.getPath());//""
		
		System.out.println(file.exists());//true
		System.out.println(file.getCanonicalFile());
		System.out.println(file.getParent());
		
		System.out.println(Arrays.toString(file.getParentFile().list()));
		System.out.println(Arrays.toString(File.listRoots()));
	}
}
