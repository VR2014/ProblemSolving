package ref;

import java.util.List;

public class PrintingNumbers {

	public static void main(String[] args) {
		//printNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
		printEvenNumbers(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	private static void printEvenNumbers(List<Integer> num) {
		for (int a : num) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

	}

	private static void printNumbers(List<Integer> of) {
		for (int a : of) {
			System.out.println(a);
		}
	}
}
