package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class OrederedSubArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int size = sc.nextInt();
		int arr[] = new int[size], temp = 0;
		System.out.println("Enter Elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Consective Element: ");
		int consElement = sc.nextInt();
		int c = consElement, s = size, start = 0, d = c;
		while (d != 0) {
			for (int i = start; i < size; i++) {
				for (int j = i + 1; j < consElement; j++) {
					if (arr[i] < arr[j]) {
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
			int k = s % c;
			if (k > consElement) {
				consElement += c;
				s = s / c;

			} else {
				consElement += k;
			}

			start += c;
			d--;
		}

		System.out.println(Arrays.toString(arr));

	}
}
