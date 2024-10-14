package com.auguest.problems;

import java.util.Scanner;

public class SaleSeason {

	public static void main(String[] args) throws java.lang.Exception {

		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();
		/*
		 * while (noOfTestCases > 0) { int valueOfSpent = s.nextInt();
		 * 
		 * int finalPrice = 0; if (valueOfSpent <= 100) { finalPrice = valueOfSpent; }
		 * else if (valueOfSpent <= 1000) { finalPrice = valueOfSpent - 25; } else if
		 * (valueOfSpent <= 5000) { finalPrice = valueOfSpent - 100; } else if
		 * (valueOfSpent > 5000) { finalPrice = valueOfSpent - 500; } else { finalPrice
		 * = 0; }
		 * 
		 * System.out.println(finalPrice);
		 * 
		 * noOfTestCases--; }
		 */

		while (noOfTestCases-- > 0) {
			int valueOfSpent = s.nextInt();
			int finalPrice = valueOfSpent > 5000 ? valueOfSpent - 500
					: valueOfSpent > 1000 ? valueOfSpent - 100 : valueOfSpent > 100 ? valueOfSpent - 25 : valueOfSpent;
					System.out.println(finalPrice);
		}
	}

}
