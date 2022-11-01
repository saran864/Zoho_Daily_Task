package leetcode;

import java.util.*;

public class Tripletsd {
public static void main(String[] args) {
	int [] input = {-1,0,1,2,-1,-4};
      Arrays.sort(input);
//ArrayList<Integer> a=new ArrayList<>();
Set<ArrayList>set=new HashSet<ArrayList>();

	for(int i=0;i<input.length;i++)
	{     ArrayList<Integer> a=new ArrayList<>();
		for(int j=i+1;j<input.length;j++)
		{
			for(int k=j+1;k<input.length;k++)
			{
				if(input[i]+input[j]+input[k]==0 )
				{
			    
				    a.add(input[i]);
				    a.add(input[j]);
				    a.add(input[k]);
				    Collections.sort(a);
				    System.out.println(a);
				    a.removeAll(a);	
			     }
				
			}
			
		}
		
	}
	

}
}
