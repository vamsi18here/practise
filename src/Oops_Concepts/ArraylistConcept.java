package Oops_Concepts;

import java.util.ArrayList;

public class ArraylistConcept {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		System.out.println(al.size());
		
		al.add(999);//0
		al.add("Vamsi");//1
		
		System.out.println("Size of Array Listing after adding elements: "+al.size());
		
		al.add(345);//2
		System.out.println("Size of Array Listing after adding elements: "+al.size());
		System.out.println("Content of array list at index 2 is "+al.get(2));
		
		System.out.println("Printing all the elements in ArrayList");
		for(int i=0;i<al.size();i++)
		{
			System.out.println("Content of array list at index " +i +" is "+al.get(i));
		}
		//Restricting the Arraylist to a particular datatype
		
		ArrayList<Integer> ai = new ArrayList<Integer>();//Can add only Interger type to ArrayList
		//ai.add(2.0);
		ai.add(110);
		
		ArrayList<String> as = new ArrayList<String>();//Can add only String type to ArrayList
		//as.add(2.0);
		//as.add(110);
		as.add("Harry");
	}

}
