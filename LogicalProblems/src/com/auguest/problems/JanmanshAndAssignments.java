package com.auguest.problems;

import java.util.Scanner;

public class JanmanshAndAssignments {

	public static void main(String[] args) {
		/*
		 * total number of Assign - 3 before 10 pm each will take 1 hr to complete
		 */

		Scanner s = new Scanner(System.in);
		int noOfTestcases = s.nextInt();

		int targetedTime = 10;

		while (noOfTestcases > 0) {
			int startTime = s.nextInt();
			int timeTocomplete = (targetedTime - startTime);
			if (timeTocomplete >= 3) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

			noOfTestcases--;
		}
		s.close();
	}

}
