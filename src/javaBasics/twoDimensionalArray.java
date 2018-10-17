package javaBasics;

public class twoDimensionalArray {
	
	public static void main(String[] args){
		
		String x[][] = new String[3][5];
		
		System.out.println("number of rows " + x.length);
		System.out.println("number of coloumns "+x[0].length);
		
		//row 0
		x[0][0]="row 0 column 0";
		x[0][1]="row 0 column 1";
		x[0][2]="row 0 column 2";
		x[0][3]="row 0 column 3";
		x[0][4]="row 0 column 4";
		
		//row 1
		x[1][0]="row 1 column 0";
		x[1][1]="row 1 column 1";
		x[1][2]="row 1 column 2";
		x[1][3]="row 1 column 3";
		x[1][4]="row 1 column 4";
				
		//row 2
		x[2][0]="row 2 column 0";
		x[2][1]="row 2 column 1";
		x[2][2]="row 2 column 2";
		x[2][3]="row 2 column 3";
		x[2][4]="row 2 column 4";		
	for(int i=0;i<x.length;i++)
	{
		for(int j=0;j<x[i].length;j++)
		{
			System.out.println("Value of x["+i+"]["+j+"]is: "+x[i][j]);
		}
	}
	
	}

}
