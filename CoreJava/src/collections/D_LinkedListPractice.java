package collections;

import java.util.*;

public class D_LinkedListPractice {

	public static void main(String[] args) {
		/*
		 * LinkedList is an class in Collection framework that implements List and
		 * Dequeue interfaces
		 * 
		 */
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Ankireddy");
		// we can't create LinkedList with predefined size
		LinkedList<String> li = new LinkedList<>();
		System.out.println(li);
		li.add("Vamsi");
		li.add("Kishore");
		li.add("Reddy");
		System.out.println(li);
		li.add(0, "Kanchimireddy");
		System.out.println(li);
		li.addAll(1, arr);
		System.out.println(li);
		
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		System.out.println(li.get(2));
		
		Collections.synchronizedList(li);
	}

}
