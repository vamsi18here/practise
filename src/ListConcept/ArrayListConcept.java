package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[] = new int[3]; //Static Array - Size is fixed
		
		ArrayList ar = new ArrayList(); //Dynamic array 
		
		ar.add(10);

		//Employee Class Objects:
		Employee e1 = new Employee("Vamsi", 32, "QA");
		Employee e2 = new Employee("Ravi", 23, "Cook");
		Employee e3 = new Employee("Kiriti",30, "Telephone");
		
		//Create Arraylist
		ArrayList a1 = new ArrayList();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);
	
		//iterator to traverse the values
		Iterator<Employee> it = a1.iterator();
		while(it.hasNext()){
		Employee emp = it.next();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.dept);
		}
	
	}

}
