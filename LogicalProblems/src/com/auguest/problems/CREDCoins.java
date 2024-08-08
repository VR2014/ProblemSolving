package com.auguest.problems;

import java.util.Scanner;

public class CREDCoins {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();
		while (noOfTestCases > 0) {
			int credCoins = s.nextInt();
			int totalBillsPaid = s.nextInt();
			int totalCoins = credCoins * totalBillsPaid;
			int totalBags = totalCoins / 100;

			System.out.println(totalBags);
			noOfTestCases--;
		}
		s.close();
	}

}
