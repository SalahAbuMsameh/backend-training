package com.digitinary.training.functionalinterface;


/**
 * 
 * Apr 17, 2021
 * @author Salah Abu Msameh
 */
public class PrintableExample {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Printable test = new TestPrintable();
		//test.print("Hello World"); 
		
		Printable test = t -> System.out.println("from Lambda >> " + t);
		test.print("salah");
	}
}

/**
 * 
 * Apr 17, 2021
 * @author Salah Abu Msameh
 */
class TestPrintable implements Printable<String> {

	@Override
	public void print(String t) {
		System.out.println("message > " + t);
	}
}

@FunctionalInterface
interface Printable<T> {
	
	/**
	 * 
	 * @param <T>
	 * @param t
	 */
	public abstract void print(T t);
	
	/*default void doSomething() {
		System.out.println("Do something");
	}*/
}