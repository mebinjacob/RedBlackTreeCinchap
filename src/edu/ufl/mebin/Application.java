package edu.ufl.mebin;

public class Application {
	public static void main(String[] args) {
		Counter counter = new Counter();
		Thread thread1 = new Thread(counter);
		thread1.start();
		
		Thread thread2 = new Thread(counter);
		thread2.start();
		
		Thread thread3 = new Thread(counter);
		thread3.start();
	}
}
