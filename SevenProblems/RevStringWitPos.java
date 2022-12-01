/*Example :
Input :  House No : 123@ CBE
Output : EBC32 1o : Nes@ uoH
*/
package Practice;

import java.util.Scanner;

public class RevStringWitPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inpt=sc.nextLine();
		//String inpt = "House No : 123@ CBE";
		int length = findLength(inpt);
		String revString = "";
		for (int i = length - 1; i >= 0; i--) {
			if (inpt.charAt(i) != '@' && inpt.charAt(i) != ':' && inpt.charAt(i) != ' ') {
				revString += inpt.charAt(i);
			}
		}
		//System.out.println(revString);
		for (int i = 0, j = 0; i < length; i++) {
			if (inpt.charAt(i) != '@' && inpt.charAt(i) != ':' && inpt.charAt(i) != ' ') {
				System.out.print(revString.charAt(j));
				j++;
			} else
				System.out.print(inpt.charAt(i));
		}
	}
	static int findLength(String s) {
		char[] a = s.toCharArray();
		int length = 0;
		for (char c : a) {
			++length;
		}
		return length;
	}
}
