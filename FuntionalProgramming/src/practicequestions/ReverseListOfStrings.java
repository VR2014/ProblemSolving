package practicequestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReverseListOfStrings {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("appleee", "orange", "banana", "grape");
		strings.sort(Comparator.reverseOrder());
		strings.sort((s1, s2) -> s2.compareTo(s1));

		System.out.println(strings);
		
		strings.sort((s1,s2)-> Integer.compare(s2.length(),s1.length())
				);
		System.out.println(strings);
		
		System.out.println(strings.get(1));
		
	}

}
