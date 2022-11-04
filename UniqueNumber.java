package Practice;

public class UniqueNumber {
public static void main(String[] args) {

int a[] ={1,1,2,2,3,3,4,50,50,65,65},xor=0;
for(int i=0;i<a.length;i++)
{
	xor=xor^a[i];
}

System.out.println(xor);

}


}
