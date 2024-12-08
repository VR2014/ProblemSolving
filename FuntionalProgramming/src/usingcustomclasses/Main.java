package usingcustomclasses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		String str = "I am a Good Programmer";

		List<String> sorted = Arrays.stream(str.split(" "))
				.sorted((word1, word2) -> Integer.compare(word2.length(), word1.length()))
				.collect(Collectors.toList());

		if (sorted.size() > 1) {
			String lu = sorted.get(1);
			System.out.println(lu);
		}
	}

}