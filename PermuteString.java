package Practice;

import java.util.*;

public class PermuteString {
	static ArrayList ar = new ArrayList();
	static Set a = new HashSet();

	public static void main(String[] args) {
		String input = "ABC", print = "";
		int len = input.length();
		for (int i = 0; i < input.length(); i++)
			System.out.print(input.charAt(i) + " ");
		System.out.println();
		generatePermutation(input, 0, len);
		System.out.println();
		for (int i = 0; i < ar.size(); i++) {
			System.out.print(ar.get(i)+" ");
		}

	}

	public static String swapString(String a, int i, int j) {
		char[] b = a.toCharArray();
		char ch;
		ch = b[i];
		b[i] = b[j];
		b[j] = ch;
		return String.valueOf(b);
	}

	public static void generatePermutation(String str, int start, int end) {

		if (start == end - 1) {
			ar.add(str);
			System.out.print(str.substring(0, 2) + " ");
		}

		else {
			for (int i = start; i < end; i++) {

				str = swapString(str, start, i);

				generatePermutation(str, start + 1, end);

				str = swapString(str, start, i);
			}
		}
	}
}
