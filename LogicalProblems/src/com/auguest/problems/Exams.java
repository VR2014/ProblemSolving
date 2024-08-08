package com.auguest.problems;

import java.util.Scanner;

public class Exams {

	public static void main(String[] args) {
		/*
		 * total students = X * Y to get % = (X * Y )/Z
		 */

		Scanner s = new Scanner(System.in);
		System.out.println();
		int NoOfTestcases = s.nextInt();

		while (NoOfTestcases > 0) {
			int x = s.nextInt();
			int y = s.nextInt();
			int z = s.nextInt();// pased students

			int totalNumberOfStudents = x * y;
			int threshold = totalNumberOfStudents / 2;

			if (z > threshold) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			NoOfTestcases--;

		}s.close();
}

}
