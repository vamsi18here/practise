package javaBasics;

public class ConstructorWithThisKeyword {

	// Class Variables - Global Variables
	String name;
	int age;

	public ConstructorWithThisKeyword(String name, int age) {

		// this keyword is used to initialize the global variables with current
		// value of constructor
		this.name = name;
		this.age = age;

		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom",
				30);

	}

}
