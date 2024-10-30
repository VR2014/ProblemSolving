package collections;

import java.util.Iterator;
import java.util.Stack;

public class C_StackPPractice {

	public static void main(String[] args) {

		/*
		 * LIFO - Last in First out 
		 *  FIFO - First In First out
		 * Stack is an implemented class in List interface and Extends the vector class 
		 * and also represents the LIFO Principle
		 * 
		 */
		
		Stack<String> s=new Stack<>();
		
		//initial capacity
		System.out.println(s.capacity());
		
		s.add("C++");
		s.add("java");
		s.add("Sql");
		s.add("Spring");
		
		for (String a: s) {
			if(a.contains("sql")) {
				s.remove(a);
			}
		}
		System.out.println(s);
		
		System.out.println();
		
		s.set(0, "Spring Boot");
		System.out.println(s.get(2));
		
		System.out.println("New stack after update :: "+ s);
		
		s.clear();
		
		System.out.println(" stack after clear :: "+ s);
		
		/*
		 * Push : Pop : Peek : search
		 */
		
		s.push("Vamsi");
		s.push("Kishore");
		s.push("Reddy");
		System.out.println("stack methods:: "+s);
		System.out.println(s.peek());
		
		System.out.println(s.pop());
		
		System.out.println(s.search("Kishore"));
	}

}
