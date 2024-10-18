package stream.apis;

import java.util.List;
import java.util.stream.Collectors;

public class FP03 {

	public static void main(String[] args) {
		List<Integer> num=List.of(1,2,3,4,5);
		List<String> li=List.of("Spring","Spring Boot","API","Micro services");

		
		doubleList(num);
		lengthOfStrings(li);

	}

	private static void lengthOfStrings(List<String> li) {
		System.out.println("lengthOfStrings   :::  ");
		li.stream()
										.map(x->x.length()).collect(Collectors.toList()).forEach(System.out::println);
	}

	private static void doubleList(List<Integer> num) {
		System.out.println("doubleList   :::  ");
		List<Integer> values=num.stream()
								.map(x->x*x)
											.collect(Collectors.toList());
		System.out.println("doubleList  :: "+values);
		
		System.out.println("doubleList  only even numbers  :: ");
		List<Integer> value=num.stream()
										.filter(x->x%2==0).map(y->y*y)
																.collect(Collectors.toList());
		System.out.println(value);
	}

}
