package Practice;

import java.util.Scanner;

public class DuplicateString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String 1: ");
		String inpt1 = sc.next();
		System.out.println("Enter the String 2 : ");
		String inpt2 = sc.next();
		String output = "";
		for (int i = 0; i < findLength(inpt1); i++) {//1
			for (int j = 0; j < findLength(inpt2); j++) {//2

				if (inpt1.charAt(i) != inpt2.charAt(j)) {
					output += inpt1.charAt(i);
					output += inpt2.charAt(j);

				}
				i++;
			}

		}
		System.out.println(output);
	}

	static int findLength(String s) {
		char[] a = s.toCharArray();
		int length = 0;
		for (char c : a) {
			++length;
		}
		return length;
	}

}
