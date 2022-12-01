package Practice;

import java.util.Scanner;

public class NearestAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n], sum = 0;
		System.out.println("Enter Elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(findNearest(arr, sum / n));
	}

	public static int findNearest(int[] arr, int avg) {
		int diff = ((arr[0] - avg) < 0) ? -(arr[0] - avg) : (arr[0] - avg);
		int nearest = arr[0];
		for (int i = 1; i < findLength(arr); i++) {
			int currentDiff = ((arr[i] - avg) < 0) ? -(arr[i] - avg) : (arr[i] - avg);
			if (currentDiff < diff) {
				diff = currentDiff;
				nearest = arr[i];
			}
		}
		return nearest;
	}

	static int findLength(int ar[]) {
		int length = 0;
		for (int c : ar) {
			++length;
		}
		return length;
	}
}
