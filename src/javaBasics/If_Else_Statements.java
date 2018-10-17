package javaBasics;

public class If_Else_Statements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Comparison Operators < > <= >= == !=
		int a = 10;
		int b = 20;
		
		if (a>b)
		{
			System.out.println("a is greater than b");
		}
		else
		{
			System.out.println("b is greater than a");
		}
		//Program to compare highest of 3 numbers
		int a1 = 100;
		int b1 = 200;
		int c1 = 150;
		
		if((a1>b1)&(a1>c1))
		{
			System.out.println("a1 is greatest");
		}
		else if(b1>c1)
		{
			System.out.println("b1 is greatest");
		}
		else
		{
			System.out.println("c1 is greatest");
		}
	}

}
