package functional.interfaces;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FP04FunctionalInterfaces {
	public static void main(String[] args) {
		List<Integer> li = List.of(1, 2, 3, 4, 5, 6);

		/*
		 * Predicate is an functional interface face having only abstract method -> test
		 * () (which returns boolean)
		 */
		Predicate<Integer> evenPredicate = x -> x % 2 == 0;

		Predicate<Integer> evenPredicate2 = new Predicate<>() {

			@Override
			public boolean test(Integer x) {
				return x % 2 == 0;
			}

		};
		/*
		 * Function is an functional interface face having only abstract method
		 * -->apply() accepts one argument and produces a result <T> the type of the
		 * input to the function <R> the type of the result of the function
		 * 
		 */
		Function<Integer, Integer> squaremapper = x -> x * x;

		Function<Integer, Integer> squaremapper2 = new Function<Integer, Integer>() {

			@Override
			public Integer apply(Integer x) {
				return x * x;
			}

		};
		/*
		 * Consumer is an functional interface face having only abstract method
		 * -->accept() Represents an operation that accepts a single input argument and
		 * returns no result.
		 */

		Consumer<Integer> action = System.out::println;

		Consumer<Integer> action2 = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println(t);
			}

		};

		li.stream().filter(evenPredicate2).map(squaremapper2).forEach(action2);

		/*
		 * BinaryOperator-> method == apply () ... - -> A specialized BiFunction where
		 * both the operands and the result are of the same type.
		 */
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		BinaryOperator<Integer> sumBinaryOperator2 = new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer inPut, Integer outPut) {
				return inPut + outPut;
			}
		};

		int sum = li.stream().reduce(0, sumBinaryOperator2);

		System.out.println(sum);
	}

}
