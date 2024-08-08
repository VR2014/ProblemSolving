package com.auguest.problems;

import java.util.Scanner;

public class GreaterAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t > 0) {
			double a = sc.nextInt();
			double b = sc.nextInt();
			double c = sc.nextInt();
			double check = (a + b) / 2;

			if (check > c) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			t--;
		}
		sc.close();
	}

}
