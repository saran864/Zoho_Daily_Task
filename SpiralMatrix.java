package Practice;

import java.util.Scanner;

public class SpiralMatrix {
public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.println("Enter Limit");
	int n=sc.nextInt();
	int a[][]=new int [n][n];
    int i=0,j=0,val=1;

    while(i==0&&j<n)
    {
    	a[i][j]=val++;
    	j++;
    }
    i++;
    j--;
    while(i<n&&j==n-1)
    {
    	a[i][j]=val++;
    	i++;
    }
    i--;//4
    j--;//3
    while(i==n-1&&j>=0)
    {
    	a[i][j]=val++;
    	j--;
    }
   i--;//3
   j=0;
    while(j==0&&i>=1)
    {
    	a[i--][j]=val++;
    }
    
    i=1;
    j=1;
    n=4;
    while(i==1&&j<n)
    {
    	a[i][j++]=val++;
    }
    i++;
    j--;
    while(i<=n-1&&j==n-1)
    {
    	a[i++][j]=val++;
    }
    i=n-1;
    j=n-2;
    while(i==n-1&&j>=1)
    {
    	a[i][j--]=val++;
    }
   i=n-2;
   j=1;
    while(j==1&&i>=2)
    {
    	a[i--][j]=val++;
    }
    a[++i][++j]=val;
 
    for( i=0;i<a.length;i++) //0
    {
    	for(j=0;j<a.length;j++)//00 01 
    	{  
    		System.out.print(a[i][j]+"    ");
    		
    	}
    	System.out.println();
    }
  
}
}

