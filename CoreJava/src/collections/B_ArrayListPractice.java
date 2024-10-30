package collections;

import java.util.*;

public class B_ArrayListPractice {

	public static void main(String[] args) {
		// Creating a Collection
		List<String> arr = new ArrayList<>();
		// Checking Collection Capacity
		System.out.println("initial capacity :: " + arr.size());
		// Adding Elements
		arr.add(0, "Kanchimireddy");
		arr.add("Vamsi");
		arr.add("Kishore");
		arr.add(" Reddy");
		System.out.println(arr);
		// Removing Elements
		//. Iterating with Enhanced For-Loop
		for (String value : arr) {
			// Checking for Element Containment (contains() method)
			if (value.contains("Kishore")) {
				arr.remove(value);
			}
		}
		//Checking if Collection is Empty (isEmpty() method)
		System.out.println(arr.isEmpty());
		
		List<Integer> li= Arrays.asList(1,2,3,4,5,6);
		Collection<Integer> co = null;
		co.addAll(li);
		

	}

}
