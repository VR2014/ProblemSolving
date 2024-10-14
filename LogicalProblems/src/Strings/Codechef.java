package Strings;

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		sc.nextLine();
		String S = sc.nextLine();
		String T = sc.nextLine();
		while (k-- > 0) {
			for (int i = 0; i <5; i++) {
				char compare1 = S.charAt(i);
				char compare2 = T.charAt(i);

				if (compare1 == compare2) {
					System.out.print("G");
				} else {
					System.out.print("B");
				}
			}
			k--;
		}
		sc.close();
	}
}