package ref;

import java.util.List;

public class FP01 {

	public static void main(String[] args) {

		printEvenNumbersFromList(List.of(0,1, 2, 3, 4, 5, 6, 7, 8, 9));
		printOddNumbersFromList(List.of(0,1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 11, 13, 15));
		printAllCources(List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties"));
		printAllCourcesContainSpring(List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties"));
		printAllCourcesAtLeastFourLetters(List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties"));
		printSquaresEvenNumbersFromList(List.of(0,1, 2, 3, 4, 5, 6, 7, 8, 9));
		printCubesEvenNumbersFromList(List.of(0,1, 2, 3, 4, 5, 6, 7, 8, 9));
		printNoOfcharInEachCourseName(List.of("Spring","Spring Boot","API"));
	}

	private static void printNoOfcharInEachCourseName(List<String> courseName) {
		System.out.println("printNoOfcharInEachCourseName   :::  ");
		courseName.stream()
			.map(word->word.length())
			.forEach(System.out::println);
		
	}

	private static void printCubesEvenNumbersFromList(List<Integer> cubes) {
		System.out.println("printCubesEvenNumbersFromList   :::  ");
		cubes.stream()
		.filter(num->num%2==0)
		.map(v->v*v*v)
		.forEach(System.out::println);
	}

	private static void printSquaresEvenNumbersFromList(List<Integer> square) {
		System.out.println("printSquaresEvenNumbersFromList   :::  ");
		square.stream()
			.filter(num->num%2==0)
			.map(v->v * v)
			.forEach(System.out::println);;
	}

	private static void printAllCourcesAtLeastFourLetters(List<String> validations) {
		System.out.println("printAllCourcesAtLeastFourLetters   :::  ");
		validations.stream()
		.filter(value->value.length()>4)
		.forEach(System.out::println);
	}

	private static void printAllCourcesContainSpring(List<String> valid) {
		System.out.println("printAllCourcesContainSpring   :::  ");
		valid.stream()
			.filter(value->value.contains("Spring"))
			.forEach(System.out::println);
			;
			
	}

	private static void printAllCources(List<String> words) {
		words.stream()
			.forEach(System.out::println);
		
	}

	private static void printOddNumbersFromList(List<Integer> list) {
		System.out.println("printOddNumbersFromList   :::  ");
		list.stream()
		.filter(num -> num % 2 != 0)
		.forEach(System.out::println);

	}

//	private static boolean Num(int num) {
//		return num % 2 == 0;
//	}

	private static void printEvenNumbersFromList(List<Integer> numbers) {
		System.out.println("printNumbersFuntional   :::  ");
		numbers.stream()
		.filter(num -> num % 2 == 0)
		.forEach(System.out::println);

	}

}
