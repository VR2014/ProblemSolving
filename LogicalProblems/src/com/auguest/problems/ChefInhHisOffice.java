package com.auguest.problems;

import java.util.Scanner;

public class ChefInhHisOffice {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTestCases = s.nextInt();

		while (noOfTestCases > 0) {
			int workingHoursMT = s.nextInt();
			int workingHoursFirday = s.nextInt();

			int totalWorkingHours = (workingHoursMT * 4) + (workingHoursFirday * 1);
			System.out.println(totalWorkingHours);
			noOfTestCases--;
		}
		s.close();
	}

}
