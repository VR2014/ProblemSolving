package com.auguest.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mahasena {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int total = s.nextInt();

		List<Integer> noOfSoldiers = new ArrayList<>();

		for (int i = 0; i < total; i++) {
			noOfSoldiers.add(s.nextInt());
		}

		int evenCout = 0;
		int oddCount = 0;
		for (int value : noOfSoldiers) {
			if (value % 2 == 0) {
				evenCout++;
			} else {
				oddCount++;
			}
		}

		if (evenCout > oddCount) {
			System.out.print("READY FOR BATTLE");
		} else {
			System.out.print("NOT READY");
		}
		s.close();
	}

}
