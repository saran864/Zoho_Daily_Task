package Practice;

/*i/p {5,8,10,13,6,2};threshold = 3;
o/p  count = 17
explanation:
Number  parts               counts
5                       {3,2}.             2
8                      {3,3,2}.            3
10                    {3,3,3,1}.           4
13                    {3,3,3,3,1}.         5
6                      {3,3}.              2
2                      {2}                 1*/


public class NextOne {
    public static void main(String[] args) {
    	int count=0,num2=0;
		int [] input= {5,8,10,13,6,2};
		for(int i=0;i<input.length;i++) 
		{
			int num1=input[i]/3;
			if(input[i]%3!=0)
			num2=1;
			else
		    num2=0;
			//int num2=(input[i]%3==0)?0:1;
			count=count+num1+num2;
		}
		System.out.println(count);

    }
}
