package functional.interfaces;

import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleSupplier;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class CombinedFunctionalInterfaces {

	public static void main(String[] args) {

		List<Integer> li = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// Predicate: Accepts one argument and returns boolean (mainly used for
		// filtering).
		Predicate<Integer> isEven = x -> x % 2 == 0;
		System.out.println("Even numbers:");
		li.stream().filter(isEven).forEach(System.out::println);

		// Function: Accepts one argument, returns a result (transformation logic).
		Function<Integer, Integer> squareFunction = x -> x * x;
		System.out.println("Square of each number:");
		li.stream().map(squareFunction).forEach(System.out::println);

		// Another form of Function: Convert Integer to String.
		Function<Integer, String> toStringFunction = x -> x + "";
		System.out.println("Converting to String: " + toStringFunction.apply(10));

		// Consumer: Takes an argument and performs an action but doesn't return
		// anything.
		Consumer<Integer> printConsumer = System.out::println;
		System.out.println("Printing using Consumer:");
		li.forEach(printConsumer);

		// BinaryOperator: Takes two arguments of the same type and returns a result of
		// the same type.
		BinaryOperator<Integer> sumBinaryOperator = Integer::sum;
		System.out.println("Sum using BinaryOperator: " + li.stream().reduce(0, sumBinaryOperator));

		// Supplier: No input, just supplies (like a generator).
		Supplier<Integer> randomSupplier = () -> new Random().nextInt(1000);
		System.out.println("Random number: " + randomSupplier.get());

		// UnaryOperator: Takes one argument of a type and returns a result of the same
		// type.
		UnaryOperator<Integer> incrementUnaryOperator = x -> x + 1;
		System.out.println("Incremented value: " + incrementUnaryOperator.apply(5));

		// BiPredicate: Takes two arguments, returns boolean.
		BiPredicate<Integer, String> biPredicate = (number, str) -> number < 10 && str.length() > 5;
		System.out.println("BiPredicate result: " + biPredicate.test(8, "vamsikishre"));

		// BiFunction: Takes two arguments and returns a result.
		BiFunction<Integer, String, String> biFunction = (number, str) -> number + " " + str;
		System.out.println("BiFunction result: " + biFunction.apply(21, "Kishore reddy"));

		// BiConsumer: Takes two arguments and performs an action.
		BiConsumer<Integer, String> biConsumer = (s1, s2) -> {
			System.out.println("BiConsumer values:");
			System.out.println(s1);
			System.out.println(s2);
		};
		biConsumer.accept(15, "Kishore reddy");

		// IntBinaryOperator: Like BinaryOperator but for primitive int types.
		IntBinaryOperator intBinaryOperator = (x, y) -> x + y;
		System.out.println("IntBinaryOperator result: " + intBinaryOperator.applyAsInt(2, 3));

		// IntSupplier: Supplies a primitive int value.
		IntSupplier intSupplier = () -> new Random().nextInt(50);
		System.out.println("IntSupplier result: " + intSupplier.getAsInt());

		// DoubleSupplier: Supplies a primitive double value.
		DoubleSupplier doubleSupplier = () -> new Random().nextDouble();
		System.out.println("DoubleSupplier result: " + doubleSupplier.getAsDouble());

		// IntConsumer: Consumes a primitive int value and performs an action.
		IntConsumer intConsumer = x -> System.out.println("IntConsumer received: " + x);
		intConsumer.accept(20);

		/*Predicate: Used for filtering. It takes a single argument and returns true or false based on some condition.
		Function: Takes one argument and transforms it. I included two examples: squaring a number and converting an integer to a string.
		Consumer: Takes an argument and performs an action, like printing it. It does not return anything.
		BinaryOperator: A specialized form of BiFunction, where the two inputs and the output are of the same type (e.g., summing two integers).
		Supplier: No inputs, just gives (supplies) values. I used it to generate a random integer and included a new IntSupplier for generating random ints directly.
		UnaryOperator: A Function where the input and output types are the same. I added an increment example.
		BiPredicate: Like Predicate, but it accepts two inputs and returns a boolean.
		BiFunction: Takes two inputs and returns one output (e.g., combining a number and a string).
		BiConsumer: Accepts two inputs and performs actions on them without returning anything.
		IntBinaryOperator: A primitive version of BinaryOperator that works with int values directly.
		IntSupplier: Supplies a random integer.
		DoubleSupplier: Supplies a random double.
		IntConsumer: Like Consumer, but works with int directly.
		*/
	}
}
