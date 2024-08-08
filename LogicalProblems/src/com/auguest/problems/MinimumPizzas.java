package com.auguest.problems;

import java.util.Scanner;

public class MinimumPizzas {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int noOfTestcases = s.nextInt();
		while (noOfTestcases-- > 0) {
			int noOfpeople = s.nextInt();
			int noOfSlicesReq = s.nextInt();
			int slices = 4;
			int totalSlicesRequired = noOfpeople * noOfSlicesReq;
			int pizzasToOrder = totalSlicesRequired / slices;

			if (totalSlicesRequired % slices != 0) {
				pizzasToOrder++;
			}

			System.out.println(pizzasToOrder);
		}

	}
}