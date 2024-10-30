package functional.interfaces;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FP05BehaviorParametrerization {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
		// even
		Predicate<Integer> even = x -> x % 2 == 0;
		// odd
		Predicate<Integer> odd = x -> x % 2 != 0;

		System.out.println("even numbers");

		filterAndprint(numbers, even);
		System.out.println("odd numbers");

		filterAndprint(numbers, odd);
		
		System.out.println("list of doubled for even and cube for odd numbers ");
		Function<Integer,Integer> doublefunction=x -> x * x;
		Function<Integer,Integer> cube=x -> x * x *x;
		
		listOffilterAndprint(numbers,even,doublefunction);
		listOffilterAndprint(numbers,odd,cube);
	}

	private static void filterAndprint(List<Integer> numbers, Predicate<Integer> predicate) {

		numbers.stream().filter(predicate).map(x -> x * x).forEach(System.out::println);
	}

	private static void listOffilterAndprint(List<Integer> numbers, Predicate<Integer> predicate,Function<Integer,Integer> mappedFunction) {

		List<Integer>num=
				numbers.stream().filter(predicate).map(mappedFunction).collect(Collectors.toList());
	System.out.println("list of numbers "+num);
	}

}
