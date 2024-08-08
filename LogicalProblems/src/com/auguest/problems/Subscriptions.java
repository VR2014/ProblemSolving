package com.auguest.problems;

import java.util.Scanner;

public class Subscriptions {

	public static void main(String[] args) {
		/*
		 * per 6 people we need 1 sub to allocate we need to get how many sub were
		 * needed 1st (n+5)/6 --> this will round off and give the result 1+5/6 --->1
		 * 1+6/6 --> 1.20.. -> round of by 2
		 * 
		 */

		Scanner s = new Scanner(System.in);
		int testCases = s.nextInt();

		while (testCases > 0) {
			int n = s.nextInt();
			int x = s.nextInt();
			int requriedSub = (n + 5) / 6;
			int costOfSub = requriedSub * x;
			System.out.println(costOfSub);

			testCases--;

		}
		s.close();
	}

}
