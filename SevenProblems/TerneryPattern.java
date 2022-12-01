package Practice;

import java.util.Scanner;

public class TerneryPattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input: ");
		int n=sc.nextInt();
		int len=n*2-1,first=0,last=len,s1=0;
		int out[][]=new int[len][len];
		
		while (n!=0) {
				for (int i =first; i <last; i++) {
				for (int j = first; j < last; j++)
					out[i][j] =((i == first || i == last-1 || j == first || j == last-1)? n:s1);
						
			}
				first++;
				last--;
				s1++;
				n--;
				
				

		}
		
		for(int i=0;i<out.length;i++)
		{
			for(int j=0;j<out.length;j++)
			{
				System.out.print(out[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
	
	
	
}
