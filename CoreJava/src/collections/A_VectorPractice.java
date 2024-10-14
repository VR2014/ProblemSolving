package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class A_VectorPractice {

	public static void main(String[] args) {
		// Creating a Vector
		Vector<String> va = new Vector<>();

		// Adding elements to the Vector
		va.add("Vamsi");
		va.add("Vamsi");
		va.add("Vamsi");
		va.add("Vamsi");
		va.add("Vamsi");
		va.add("Kishore");
		va.add("reddy");

		// Display the current capacity of the Vector
		// Default capacity of a Vector is 10, which doubles when exceeded
		System.out.println("Capacity of va: " + va.capacity());

		// Print the current elements in the Vector
		System.out.println("Elements in va: " + va);

		// Add more elements to trigger capacity expansion
		va.add("reddy");
		va.add("Kishore");
		va.add("Kishore");
		va.add("Kishore");

		// Capacity increases as elements exceed the initial capacity
		System.out.println("New capacity after adding more elements: " + va.capacity());

		// Insert an element at the 0th index
		va.add(0, "Reddy");
		System.out.println("After inserting at index 0: " + va);

		// Add another element to the Vector
		va.add("Kishore");

		// Print the current size of the Vector (number of elements stored)
		System.out.println("Size of va: " + va.size());

		// Creating another Vector and adding elements
		Vector<Object> v2 = new Vector<>();
		v2.add(va); // Adding the entire 'va' Vector as a single element in 'v2'
		v2.add(0, "Kanchimireddy"); // Insert a string at index 0

		// Print the elements of v2
		System.out.println("Elements in v2: " + v2);

		// Retrieving elements from v2 using a for loop
		System.out.println("Retrieving elements from v2:");
		for (int i = 0; i < v2.size(); i++) {
			System.out.println(v2.get(i)); // Each element is printed
		}

		// Removing elements from va
		va.remove(0); // Removes the first element ("Reddy")
		System.out.println("After removing the first element from va: " + va);

		// Removing elements using a loop (removes element at index 1, and then index 2)
		for (int i = 0; i < 2; i++) {
			System.out.println("Removing element at index " + i + ": " + va.remove(i));
		}

		// Print the remaining elements in va after removal
		System.out.println("Remaining elements in va: " + va);

		// Verifying if specific elements are present
		System.out.println("Does va contain 'Kishore'? " + va.contains("Kishore"));
		System.out.println("Is va empty? " + va.isEmpty());

		// Updating an element at a specific index (replace first element with a new
		// string)
		va.set(0, "vamsikishorerreddy");
		System.out.println("After updating the element at index 0: " + va);

		// Using Iterator to traverse and remove elements

		Iterator<String> iterator = va.iterator();
		while (iterator.hasNext()) {
			String value = iterator.next();
			if (value.equals("Kishore")) {
				iterator.remove();// Remove an element while iterating
			}
		}

		System.out.println("After removal using Iterator: " + va);

		// Using ListIterator to traverse both directions and update elements

		ListIterator<String> li = va.listIterator();
		while (li.hasNext()) {
			String values = li.next();
			if (values.equals("Vamsi")) {
				li.set("Reddy");
			}

		}
		System.out.println("After update using ListIterator: " + va);
		// Sorting elements in a Vector
		Collections.sort(va);
		System.out.println("Sorted Vector: " + va);

		Collections.sort(va, Collections.reverseOrder());
		System.out.println("Reverse Sorted Vector: " + va);
		
		// Converting Vector to ArrayList
		ArrayList<String> arrayList = new ArrayList<>(va);
		System.out.println("Converted to ArrayList: " + arrayList);

		// Converting Vector to LinkedList
		LinkedList<String> linkedList = new LinkedList<>(va);
		System.out.println("Converted to LinkedList: " + linkedList);

		// Converting Vector to Array
		String[] array = va.toArray(new String[0]);
		System.out.println("Converted to Array: " + Arrays.toString(array));

	}
}
