package demo;

import java.util.Scanner;

public class SnakeMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("input: ");
	  int input=sc.nextInt(),inc=1,dec=input;
	  for(int i=1;i<=input;i++)
	  {     dec*=i;
		  for(int space=i;space<=input;space++)
		  {
			  System.out.print(" ");
		  }
		  if(i%2!=0)
		  {
			  for(int j=1;j<=input;j++)
			  {
				  System.out.print(inc+++" ");
			  }
		  }
		  if(i%2==0)
		  {    
			  for(int k=input;k>=1;k--)
			  {
				  System.out.print(dec--+" ");
				  inc++;
			  }
		  }
		  dec=input;
		  System.out.println();
		  
		  
	  }

	}

}
