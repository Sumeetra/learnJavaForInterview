package learnJavaForInterviews;

public class Fizbuzz {

	public static void main(String[] args) {
		// write a short program that prints each number from 1 to 100 on a new line.
		// for each multiple of 3, print "Fizz" instead of the number.
		// for each multiple of 5, print "Buzz" instead of the number.
		// for numbers which are multiples of both 3 and 5, print "Fizzbuzz" instead of
		// the number.
printFizzbuzz(100);
	}

	/*public static void printFizzbuzz(int n) {
		for (int i = 1; i <= n; i++) {
			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}*/

	/*
	 * public static void printFizzbuzz(int n) { for (int i = 1; i<=n; i++) { if
	 * ((i%3==0)&&(i%5==0)) { System.out.println("Fizzbuzz"); }else if (i%3==0) {
	 * System.out.println("fizz"); }else if (i%5==0) { System.out.println("buzz");
	 * }else { System.out.println(i); } } }
	 */
	
	public static void printFizzbuzz(int n) {
		for (int i = 1; i <=n; i++) {
			if ((i%3==0)&&(i%5==0)) {
				System.out.println("Fizzbuzz");
			}
			else if (i%3==0) {
				System.out.println("fizz");
			}else if (i%5==0) {
				System.out.println("Buzz");
			}else {
				System.out.println(i);
			}
		}
	}
	
	}

