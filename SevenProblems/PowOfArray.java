package Practice;

import java.util.Scanner;

public class PowOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the power: ");
		int pow = sc.nextInt(), temp;
		System.out.println("Enter Elements");
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			int tempPow = pow, power = 1;
			while (tempPow-- != 0) {
				power *= arr[i];
			}
			arr[i] = power;
		}
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		for (int a : arr)
			System.out.print(a + " ");
	}
}
