package ListConcept;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class HashTableConcept {

	public static void main(String[] args) {
		// Similar to Hashmap, but its Synchronized
		// Stores values on the basis of Key-Val pair
		// key--> Object -- HashCode --> Value
		// Key-Value pair always unique

		Hashtable h1 = new Hashtable();
		h1.put(1, "Harry");
		h1.put(2, "Ra");
		h1.put(3, "Bach");
		h1.put(3, "Bach");// Contains Unique Values
		// h1.put("4", null); // null pointer exception

		System.out.println("Values for h1:");
		System.out.println(h1);

		// Create a clone copy/shallow copy

		Hashtable h2 = new Hashtable();

		h2 = (Hashtable) h1.clone();
		System.out.println("Value from h1" + h1);
		System.out.println("Value from h2" + h2);
		h1.clear();
		System.out.println("Value from h1" + h1);
		System.out.println("Value from h2" + h2);

		// Contains Value:

		Hashtable st = new Hashtable();
		st.put("A", "Vamsi");
		st.put("B", "Test Lead");
		st.put("C", "Selenium");

		if (st.containsValue("Vamsi"))
			System.out.println("Value Found");
		// Print all values from hashtable using - Enumeration --elements()
		Enumeration e = st.elements();
		System.out.println("Print values from St Usint enumeration");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

		// get all the values from hashtable using -- entryset() -- set of
		// hashtable values:
		System.out.println("Print values from St using entryset");

		Set s = st.entrySet();
		System.out.println(s);

		Hashtable st1 = new Hashtable();
		st1.put("A", "Vamsi");
		st1.put("B", "Test Lead");
		st1.put("C", "Selenium");

		// Checking both the hashtables are equal or not
		if (st.equals(st1))
			System.out.println("Both are equal");

		// get value from a key
		System.out.println(st.get("A"));

		// get the hashcode of the hashtable object:
		System.out.println("HashCode value of st1 - " + st1.hashCode());

	}

}
