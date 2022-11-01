package leetcode;

//ip={1,2,3,4};
//op={24,12,8,6};
public class Multiplyarray {
public static void main(String[] args) {
	int arr[]= {1,2,3,4},product=1;
	int b[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{     product=1;
	       
		for(int j=0;j<arr.length;j++)
		if(i!=j)
			product*=arr[j];	

			System.out.println(product);	
	}
	
}
}
