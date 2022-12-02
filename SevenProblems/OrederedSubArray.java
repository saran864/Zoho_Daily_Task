package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class OrederedSubArray {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the Limit : ");
		int n=input.nextInt();
		System.out.println("Enter Elements");
		int[] inpt=new int[n];
		
		for(int i=0;i<n;i++)
		{
			inpt[i]=input.nextInt();
		}
		int k=input.nextInt();
		for(int i=0;i<n;i+=k)
		{
			int left=i;
			int r=i + k - 1;
			int right=(r<n-1)?r:n-1;
    while (left < right) { 
				int temp = inpt[left]; 
				inpt[left] = inpt[right]; 
				inpt[right] = temp; 
				left++; 
				right--; 
			} 
		}
		

		for (int take : inpt)
			System.out.print(take + " ");
	}
}
