package javaBasics;

public class DataTypes {

	//main() Method - Starting/Execution point of a program
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		System.out.println("Data Types");
		//Primitive Data Types - Int, Double, Char, Boolean
		System.out.println("Integers");
		int i = 10;
		int j = 20;
		int k = i+j;
			System.out.println("Value of Integer I:"+" "+i );
			System.out.println("Value of Integer J:"+" "+j);
			System.out.println("Sum of Integers I, J is :"+" "+k);
				
		System.out.println("Double-integer value can be stored in a double, and not vice-versa");
		double d1 = 10.01;
		double d2 = 100;
			System.out.println("Value of double d1:"+" "+d1);
			System.out.println("Value of double d2:"+" "+d2);
			
			
		System.out.println("Char-Only Single digit value, Should be written in single quotes");
			char c1 = 'a';
			char c2 = 'A';
			char c3 = '1';
			char c4 = '#';
	System.out.println("Value of Char c1 - "+c1+" Char c2 - "+c2+" Char c3 - "+c3+" Char c4 - "+c4);
	
	System.out.println("Boolean - True/False");
	boolean b1=true;
	boolean b2=false;
	
	System.out.println("value of Boolean b1 is "+ b1);
	System.out.println("value of Boolean b2 is "+ b2);
	
	System.out.println("String - String is a class, not a Datatype");
	String s1 = "Vamsi Java Practise";
	String s2 = "Hi Vamsi";
	String s3 = "1000";
	String s4 = "100.001";
	System.out.println("Value of Sting s1 - "+s1+" Sting s2 - "+s2+" Sting s3 - "+s3+" Sting s4 - "+s4);

	
	}

}
