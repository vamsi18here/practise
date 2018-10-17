package Oops_Concepts;

public class globalvslocalvariables {

	//Global Variables
	String name = "Tom";
	int age = 10;
	
	public static void main(String[] args) {

		int i = 120;//Local variable of Main Method
		System.out.println(i);

		//Accessing global variables from main method
		//Create an object ref and access the global variables
		globalvslocalvariables gvvslv = new globalvslocalvariables();
		System.out.println(gvvslv.name);
		System.out.println(gvvslv.age);
		
	}
		
	public void sum(){
		int i = 10;//local method for sum method
		
		int j = 20;
		
		
	}
}
