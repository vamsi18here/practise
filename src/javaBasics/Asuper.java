package javaBasics;

public class Asuper {

	public Asuper() {
		System.out.println("Parent class constructor");
	}

	public Asuper(int i) {
		System.out.println("One Parameter Constructor");
		System.out.println("Parent class constructor with value of i " + i);
	}

	public Asuper(int i, int j) {
		System.out.println("Two parameter Constructor");
		System.out.println("Parent class constructor with value of i " + i);
		System.out.println("Parent class constructor with value of j " + j);
	}

}
