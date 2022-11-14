package demo;

import java.util.Scanner;

public class EncryptedPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) >= 'a' && input.charAt(i) <= 'z') {
				if (input.charAt(i) == 'a')
					System.out.print('z');
				else {
					char a = (char) (input.charAt(i) - 1);
					System.out.print(a);
				}

			}
			if (input.charAt(i) >= 'A' && input.charAt(i) <= 'Z') {
				if (input.charAt(i) == 'A')
					System.out.print('Z');
				else {
					char a = (char) (input.charAt(i) - 1);
					System.out.print(a);
				}
			}
			       if (input.charAt(i) >= '0' && input.charAt(i) <= '9') {
					if (input.charAt(i) == '0')
						System.out.print('9');
					else {
						char a = (char) (input.charAt(i) - 1);
						System.out.print(a);
					}
				}

			
		}
	}
}
