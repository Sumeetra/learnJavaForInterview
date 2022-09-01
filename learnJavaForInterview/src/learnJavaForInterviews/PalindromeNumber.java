package learnJavaForInterviews;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("type a name or number");
		
		String name = sc.nextLine();
		String reverse = "";

		for (int i=name.length()-1; i >= 0; i--) {
			reverse = reverse + name.charAt(i);
			System.out.println(reverse);
		}		
			if (name.equals(reverse)) {
				System.out.println("palindrome");				
			}
			else {
				System.out.println("not palindrome");
			}	
		
		}
		}
