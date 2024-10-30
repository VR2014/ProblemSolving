package stream.apis;

import java.util.Comparator;
import java.util.List;

public class FP02 {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(10,30,1, 2, 3, 4, 5, 6, 7, 8, 9,8);
		List<String> li=List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties");

		int sum = sumOfAllNumbers(numbers);
		System.out.println(sum);

		calsumOfAllNumbersInFunctional(numbers);
		operationsIfvalue(numbers);
		sumOfSquearesInList(numbers);
		sumOfCubesInList(numbers);
		sumOfOddNumbers(numbers);
		distinctNumbers(numbers);
		sortedNumbers(numbers);
		reverseListOfString(li);
		
		

	}



	private static void reverseListOfString(List<String> li) {
		System.out.println("reverseListOfString   :::  ");
		li.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);
		
		System.out.println("based on length   :::  ");
		li.stream()
					.sorted(Comparator.comparing(st->st.length())).forEach(System.out :: println);
		
	}

	private static void sortedNumbers(List<Integer> numbers) {
		System.out.println("sortedNumbers   :::  ");
		numbers.stream().sorted().forEach(System.out :: print);
		
		
		
	}

	private static void distinctNumbers(List<Integer> numbers) {
		System.out.println("distinctNumbers   :::  ");
		numbers.stream().distinct().forEach(System.out :: print);
		System.out.println();
		
	}

	private static void sumOfOddNumbers(List<Integer> numbers) {
		System.out.println("sumOfCubesInList   :::  ");
		int total=numbers.stream()
							.filter(x->x%2 !=0)
												.reduce(0, Integer :: sum);
		
		System.out.println("sumOfOdd   :::  "+total);
	}

	private static void sumOfCubesInList(List<Integer> numbers) {
		System.out.println("sumOfCubesInList   :::  ");
		int cube=numbers.stream().map(x->x*x*x).reduce(0,Integer::sum);
		System.out.println("sumOfCubes  :::  "+cube);
		
	}

	private static void sumOfSquearesInList(List<Integer> numbers) {
		System.out.println("sumOfSquearesInList   :::  ");
		
		int sumofSquares=numbers.stream()
								.map((x)->x*x).reduce(0, Integer::sum);
		System.out.println("sumofSquares  : : "+ sumofSquares);
									
	}

	private static void operationsIfvalue(List<Integer> numbers) {
		System.out.println("operationsIfvalue   :::  ");
		System.out.println("Min value   :::  ");
		int minvalue = numbers.stream()
								.reduce(Integer.MIN_VALUE, (x, y) -> x > y ? y: x);
		
		System.out.println("Min from List   :::  "+ minvalue);
		
		System.out.println("MAX value   :::  ");
		
		int MaxValue=numbers.stream()
								.reduce(Integer.MAX_VALUE, (x,y)->x>y ? y:x);
		System.out.println("MAX value   :::  "+MaxValue);
	}

	@SuppressWarnings("unused")
	private static int sum(int a, int b) {
		return a + b;
	}

	private static void calsumOfAllNumbersInFunctional(List<Integer> numbers) {
		// Stream of number ->one result
		// combine all them into a single value

		System.out.println("calsumOfAllNumbersInFunctional   :::  ");
		// int total =numbers.stream().reduce(0,FP02::sum);
		// int total =numbers.stream().reduce(0,(x,y)->x+y);
		int total = numbers.stream().reduce(0, Integer::sum);

		System.out.println(total);

	}

	private static int sumOfAllNumbers(List<Integer> numbers) {
		System.out.println("sumOfAllNumbers   :::  ");
		int total = 0;
		for (int a : numbers) {
			total = total + a;

		}
		return total;
	}

}
