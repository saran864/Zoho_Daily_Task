package demo;

import java.util.Scanner;

public class CommonString {
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  String inpt_array[]=new String[n];
	  String output="",print="*******";
	  for(int i=0;i<n;i++)
	  {
		  inpt_array [i]=sc.next();
	  }
	 String temp=inpt_array[0];
	 for(int i=0;i<temp.length();i++)
	 {
		 if(temp.charAt(i)==inpt_array[i].charAt(i))
		 {
			output +=temp.charAt(i);
		 }
		 if(print.length()>output.length())
		 {
			  print=output;
		 }
	 }
	
	  
	}

}
