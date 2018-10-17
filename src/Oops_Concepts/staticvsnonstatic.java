package Oops_Concepts;

public class staticvsnonstatic {
	String name = "TOM";//Non-Static global variables
	static int age = 25;//Static global variables
	
	public static void main(String[] args) {
	
		//How to call static variables and methods
		//1. Direct calling
		System.out.println("Direct Calling");
		System.out.println("--------------");
		sum();
		System.out.println(age);
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("By Class Name");
		System.out.println("--------------");
		//2. Calling by class name
		staticvsnonstatic.sum();
		System.out.println(staticvsnonstatic.age);
		
		//How to call static Methods and variables
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("calling static Methods and variables");
		System.out.println("------------------------------------");
		staticvsnonstatic obj = new staticvsnonstatic();
		obj.sendMail();
		System.out.println(obj.name);
	}
	public void sendMail(){//Non-static Method
		System.out.println("Non-Static Method");
	}
	
	public static void sum(){//Static Method
		System.out.println("Static Method");
	}
}
