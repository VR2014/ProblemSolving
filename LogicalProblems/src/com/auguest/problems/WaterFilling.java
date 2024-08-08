package com.auguest.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WaterFilling {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();
		while (noOfTestCases > 0) {

			int bottleOne = s.nextInt();
			int bottleTwo = s.nextInt();
			int bottleThree = s.nextInt();

			List<Integer> noOfbottles = new ArrayList<>(Arrays.asList(bottleOne, bottleTwo, bottleThree));
			int count = 0;

			for (int k : noOfbottles) {
				if (k == 0) {
					count++;
				}
			}

			if (count >= 2) {
				System.out.println("Water filling time");
			} else {
				System.out.println("Not now");
			}

			noOfTestCases--;
		}
		s.close();
	}

}
