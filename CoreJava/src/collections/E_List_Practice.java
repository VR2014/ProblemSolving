package collections;

import java.util.ArrayList;
import java.util.List;

public class E_List_Practice {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		li.add(6);
		li.add(7);

		System.out.println(li);
		int sum = 0;
		for (int a : li) {
			//if (a % 2 == 0) 
				sum += a;

			
		}
		System.out.println(sum);

	}

}