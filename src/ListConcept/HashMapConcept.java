package ListConcept;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
		// HashMap is a class implements Map Interface
		// extends AbstractMap
		// It contains only unique elements
		// Stores values in the form of Key and value pair
		// It may have one null key and multiple null values
		// It Maintains no order
		// Hashmap is non-synchronized -- not thread safe
		// Concurrent Modification Exception -- Fail - Fast Condition

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Selenium");
		hm.put(2, "Java");
		hm.put(3, "Qtest");
		hm.put(4, "Duplicate");

		System.out.println(hm.get(1));
		System.out.println(hm.get(4));

		for (Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println(hm);
		hm.remove(4);
		System.out.println(hm);

		HashMap<Integer, Employee> emp = new HashMap<Integer, Employee>();

		Employee e1 = new Employee("Tom", 25, "admin");
		Employee e2 = new Employee("Dick", 27, "Dev");
		Employee e3 = new Employee("Hary", 29, "QA");

		emp.put(1, e1);
		emp.put(2, e2);
		emp.put(3, e3);

		// traverse the hashmap
		for (Entry<Integer, Employee> m : emp.entrySet()) {
			int Key = m.getKey();
			Employee e = m.getValue();
			System.out.println("Employee " + Key + " Info");

			System.out.println(e.name + " " + e.age + " " + e.dept);
		}

	}

}
