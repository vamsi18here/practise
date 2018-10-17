package javaBasics;

public class ConstructorConcept {
	// Constructor name should be same as the class name
	// Constructor returns nothing
	// By Default, there is a hidden constructor for every class

	public ConstructorConcept() {// passing no arguments -- hence default
									// constructor
		System.out.println("Default Constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("Single Parameter Constructor");
		System.out.println("Value of i " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println("Value of i " + i);
		System.out.println("Value of j " + j);
		// We can overload a Constructor
	}

	public static void main(String[] args) {
		ConstructorConcept con = new ConstructorConcept();
		ConstructorConcept single = new ConstructorConcept(2);
		ConstructorConcept dou = new ConstructorConcept(5, 6);

	}

}
