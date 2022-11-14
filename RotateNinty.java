package demo;

import java.util.Scanner;

public class RotatenNinty {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int inpt[][]=new int[n][n];
	   for(int i=0;i<n;i++)
	   {
		   for(int j=0;j<n;j++) {
			   inpt[i][j]=sc.nextInt();
		   }
		   
	   }
	   for(int j=n-1;j>=0;j--)
	   {
		   for(int i=0;i<n;i++) {
			   System.out.print(inpt[i][j]+" "); 
		   }
		   System.out.println();
	   }
		   
	   

	}

}
