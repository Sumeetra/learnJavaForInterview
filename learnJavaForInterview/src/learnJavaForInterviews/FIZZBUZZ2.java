package learnJavaForInterviews;

public class FIZZBUZZ2 {
	
	public static void main(String[] args) {
		
		printfizzbuzz(100);	
	}
		public static void printfizzbuzz(int n) {
		for (int i=1; i<=n; i++) {
			if ((i%3==0)&&(i%5==0)){
				System.out.println("FizzBuzz");
			}
			else if
				(i%3==0){
				System.out.println("fizz");
			}
			else if(i%5==0) {
				System.out.println("buzz");
			}
			}
		}
	}

