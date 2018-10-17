package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		// add
		ll.add("test");
		ll.add("QTP");
		ll.add("Selenium");
		ll.add("RPA");
		ll.add("RFT");

		// Print
		System.out.println("Content of linkedlist " + ll);

		// addfirst
		ll.addFirst("Vamsi");

		// addlast
		ll.addLast("Automation");

		System.out.println("Content of linkedlist " + ll);

		// Get
		System.out.println(ll.get(3));

		// Set
		ll.set(2, "Tom");
		System.out.println(ll.get(3));

		// remove first and last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("Content of linkedlist " + ll);
		ll.remove(2);
		System.out.println("Content of linkedlist " + ll);

		// How to print al the values of LinkedList
		// for Loop
		for (int n = 0; n < ll.size(); n++) {
			System.out.println(ll.get(n));
		}

		// advance for loop
		for (String str : ll) {
			System.out.println(str);
		}

		// iterator
		Iterator<String> it = ll.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// while loop
		int num = 0;
		while (ll.size() > num) {
			System.out.println(ll.get(num));
			num++;
		}

	}

}
