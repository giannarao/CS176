package edu.monmouth.cs176.s1319673.mp0;

public class GreetingTester {

	public static void main(String[] args) {
		Greeting greeting1 = new Greeting("Hello World");
		Greeting greeting2 = new Greeting("Hello Monmouth");
		Greeting greeting3 = new Greeting("Hello");
		
		System.out.println("Greeting 1: " + greeting1.getMessage());
		System.out.println("Greeting 2: " + greeting2.getMessage());
		System.out.println("Greeting 3: " + greeting3.getMessage());

	}

}
