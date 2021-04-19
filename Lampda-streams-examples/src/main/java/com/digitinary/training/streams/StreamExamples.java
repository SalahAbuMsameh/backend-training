package com.digitinary.training.streams;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * Apr 19, 2021
 * @author Salah Abu Msameh
 */
public class StreamExamples {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		//createStream();	
		//streamWithIndex();
		//primitivesStreamExamples();
		//stringStream();
		collectorExample();
	}

	/**
	 * 
	 */
	private static void collectorExample() {
		
		List<StreamExamples.Student> students = Arrays.asList(new Student(18, "Student 1"), 
				new Student(18, "Student 2"), new Student(20, "Student 3"), new Student(21, "Student 4"));
		
		Map<Integer, List<Student>> studentByAge = students.stream()
			.collect(Collectors.groupingBy(Student::getAge));
		
		//System.out.println(studentByAge.get(20));
		
		/*
		 * Map<Integer, Student> studentsMap = students.stream()
		 * .collect(Collectors.toMap(s -> s.getAge(), s -> s));
		 * 
		 * System.out.println(studentsMap);
		 */
		
		List<Student> studentsFromDB = Stream.iterate(1, id -> id + 1)
			.limit(5)
			.map(id -> new Student(id, "Student " + id))
			.collect(Collectors.toList());
		
		System.out.println(studentsFromDB);
		
	}
	
	/**
	 * 
	 * Apr 20, 2021
	 * @author Salah Abu Msameh
	 */
	static class Student {
		
		private int age;
		private String name;
		
		public Student(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public String getName() {
			return name;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
	}

	/**
	 * 
	 */
	private static void stringStream() {
		
		Pattern.compile("\\s+")
			.splitAsStream("a b c");
			//.peek(str -> System.out.println(str))
			//.forEach(str -> System.out.println("str >> " + str));
		
		try {
			Files.lines(Paths.get("D:\\test.txt"), Charset.forName("UTF-8"))
				.forEach(line -> System.out.println(line));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 */
	private static void primitivesStreamExamples() {
		
		System.out.println(IntStream.range(0, 5).average().getAsDouble());
		
		"abc".chars()
			.forEach(c -> System.out.println(c));
	}

	/**
	 * 
	 */
	private static void streamWithIndex() {
		
		List<Integer> list = Stream.iterate(1, n -> n + 1)
			.limit(20)
			.peek(n -> System.out.println(n))
			.collect(Collectors.toList());
			//.peek(n -> System.out.println(n));
		
		//System.out.println(list);
	}

	/**
	 * 
	 */
	private static void createStream() {
		
		List<String> list = Arrays.asList("a", "b", "c", "d");
		
		//default 99%
		list.stream()
			.filter(str -> str.contains("a"))
			.findFirst()
			.get();
		
		//builder example
		Stream.<String>builder()
			.add("a")
			.add("b")
			.add("c")
			.add("d")
			.build()
			.filter(str -> str.contains("a"))
			.findFirst()
			.get();
	}
}
