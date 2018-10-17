package Oops_Concepts;

import java.util.Hashtable;

public class HashTable {
	public static void main(String[] args) {
		
		Hashtable h = new Hashtable();
		
		h.put("A", "Test");
		h.put("B", "Hello");
		h.put("C", "World");
		System.out.println("Size of Hashtable is: "+h.size());
		h.put(1, 200);
		System.out.println("Size of Hashtable is: "+h.size());
		h.put(2, "Krish");
		System.out.println("Size of Hashtable is: "+h.size());
		
		System.out.println("Printing all the values in Hashtable");
		for(int i=0; i<h.size();i++)
		{
			System.out.println("key value pair at index "+i+""+h.get(i));
		}
		Hashtable<Integer, String> h1 = new Hashtable<Integer, String>();
		h1.put(1, "Vamsi");
		

	}
}
