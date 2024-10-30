package usingcustomclasses;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExploringOfStreams {

    public static void main(String[] args) {
        // Example of creating a list of numbers
        List<Integer> num = List.of(1, 2, 3, 4, 5, 6, 7);
        num.stream(); // This line starts the stream but doesn't perform any operation.
        
        // Creating a stream from an array of integers
        Stream<Integer> var = Stream.of(1, 2, 3, 4, 5, 6, 7);
        
        // Reduce operation to sum the elements in the stream
        System.out.println("Sum of stream: " + var.reduce(0, Integer::sum)); // Consumes the stream
        
        // Example of an array of integers
        int[] numArray = {8, 0, 5, 5, 5, 5, 3, 23};
        // Finding the max in the array using stream
        System.out.println("Max in array: " + Arrays.stream(numArray).max().orElseThrow());

        // Using IntStream to generate a range of numbers (inclusive)
        System.out.println("Max in range 1-100: " + IntStream.rangeClosed(1, 100).max().orElseThrow());

        // Using IntStream.iterate() with peek for debugging and summing values
        System.out.println("Odd numbers sum (first 10):");
        IntStream.iterate(1, e -> e + 2).limit(10).peek(System.out::println).sum(); // Peeking at elements being summed
        
        // Example with even numbers using iterate
        int sum = IntStream.iterate(2, e -> e + 2).limit(10).peek(System.out::println).sum();
        System.out.println("Sum of first 10 even numbers: " + sum);

        // Generating a list of numbers by doubling the value at each iteration
        List<Integer> doubledValues = IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList());
        System.out.println("Doubled values: " + doubledValues);

        // Showing max values of Integer and Long
        System.out.println("Integer MAX_VALUE: " + Integer.MAX_VALUE);
        System.out.println("Long MAX_VALUE: " + Long.MAX_VALUE);

        // Using LongStream to calculate the product of numbers from 1 to 49
        BigInteger factorial = LongStream.rangeClosed(1, 50)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println("Factorial of 50: " + factorial);
    }
}
