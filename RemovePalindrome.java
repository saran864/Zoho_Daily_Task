package demo;

import java.util.Scanner;

public class RemovePalindrome {
public static void main(String[] args) {
	Scanner sc=new  Scanner(System.in);
	String input=sc.nextLine();
	String rev="";
	String [] splitinput=input.split(" ");
	for(String spinpt:splitinput)
	{
		String temp=spinpt;
		for(int i=temp.length()-1;i>=0;i--)
		{
		     rev+=spinpt.charAt(i);
		}
		System.out.print(!temp.equals(rev) ?   temp : " ");
		rev="";
	}
	
}
}
