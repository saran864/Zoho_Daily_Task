package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class OrderOf2n {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = sc.nextInt();
		int inpt[] = new int[n], sum = 0, rem = 0;
		System.out.println("Enter Elements");
		for (int i = 0; i < n; i++)
			inpt[i] = sc.nextInt();

		for (int i = 0; i < n - 1; i++) {

			rem = findReminder(inpt[i]);
			inpt[i] = inpt[i]-rem;
			inpt[i + 1] = inpt[i + 1] + rem;

		}
		System.out.println(Arrays.toString(inpt));
		System.out.println(findReminder(inpt[n - 1]));

	}

	static int findReminder(int numPowersOf2) {
		int temp = 0;
		int n = 1;
		while (n <= numPowersOf2) {
			temp = n;
			n = n * 2;

		}
		return numPowersOf2 - temp;

	}

}
