package javaBasics;

public class Bsuper extends Asuper {
	public Bsuper() {
		// super keyword must be the first statement after the constructor
		// must be written inside the child constructor
		super(10);
	}

	// to call all the constructors in the parent class, we need to create
	// multiple constructors in child class
	public Bsuper(int i) {
		super(i);
	}

	public Bsuper(int i, int j) {
		super(i, j);
	}

	public static void main(String args[]) {
		Bsuper obj = new Bsuper();
		Bsuper obj1 = new Bsuper(10);
		Bsuper obj2 = new Bsuper(20, 30);

	}

}
