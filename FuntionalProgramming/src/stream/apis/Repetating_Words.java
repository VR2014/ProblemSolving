package stream.apis;

import java.util.HashSet;
import java.util.stream.IntStream;

public class Repetating_Words {

	public static void main(String[] args) {
		Repetating_Words word = new Repetating_Words();

		String one = "abcdraf";
		String two = "abcdef";
		int a = word.getfirstRepetatingChar(one);
		int b = word.getfirstRepetatingCharUsingJava8(one);
		System.out.println("   " + a);
		System.out.println("   " + b);

	}

	private int getfirstRepetatingCharUsingJava8(String one) {
		return IntStream.range(0, one.length()).filter(i -> one.indexOf(one.charAt(i)) != i).findFirst().orElse(-1);

	}

	private int getfirstRepetatingChar(String value) {
		int k = -1;

		HashSet<Character> set = new HashSet<>();

		for (int i = 0; i < value.length(); i++) {
			char c = value.charAt(i);
			if (set.contains(c)) {
				return i;
			}
			set.add(c);

		}

		return k;
	}

}
