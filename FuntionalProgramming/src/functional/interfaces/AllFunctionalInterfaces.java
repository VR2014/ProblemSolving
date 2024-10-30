package functional.interfaces;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class AllFunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> li = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Predicate<Integer> pi = x -> x % 2 == 0;
		Function<Integer, Integer> mulfunction = x -> x * x;
		Function<Integer, String> stringfunction = x -> x + "";
		Consumer<Integer> printMethod = System.out::println;
		/*
		 * BinaryOperator ->Accept the 2 parameter same type of input and give back same
		 * type of it
		 */
		BinaryOperator<Integer> sumbinary = (x, y) -> x + y;

		// No input return something
		Supplier<Integer> randomIntegerSupplier = () -> {
			Random random = new Random();
			return random.nextInt(1000);
		};
		System.out.println(randomIntegerSupplier.get());

		/*
		 * UnaryOperator ->Accept the 1 parameter same type of input and give back same
		 * type of it
		 */
		UnaryOperator<Integer> unaryOperator = (x) -> x + 1;
		System.out.println(unaryOperator.apply(3));

		/*
		 * similar to predicate here it will accept 2 inputs and returns boolean
		 */
		BiPredicate<Integer, String> biPredicate = (number, str) -> {
			return number < 10 && str.length() > 5;
		};

		System.out.println(biPredicate.test(8, "vamsikishre"));

		/*
		 * similar to BiFunction here it will accept 2 inputs and returns boolean
		 */

		BiFunction<Integer, String, String> biFunction = (number, str) -> {
			return number + " " + str;
		};

		System.out.println(biFunction.apply(21, "Kishore reddy"));

		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println(s1);
			System.out.println(s2);
		};

		biConsumer.accept(15, "Kishore reddy");
		
		
		IntBinaryOperator intbinary=(x,y)->x+y;
		System.out.println(intbinary.applyAsInt(2, 3));
		
	}

}
