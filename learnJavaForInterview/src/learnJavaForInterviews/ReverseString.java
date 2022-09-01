package learnJavaForInterviews;

public class ReverseString {

	
	  public static void main(String[] args) { 
	  String str = "Hello World";
	  System.out.println(reverseWithStringBuilder(str));
	  System.out.println(reverseManually(str)); }
	 

	
	 private static String reverseWithStringBuilder(String str) { 
	return new StringBuilder(str).reverse().toString(); }
	  
	  private static String reverseManually(String str) { 
		  StringBuilder sb = new StringBuilder(); 
		  for (int i = str.length() - 1; i >= 0; i--) {
	  sb.append(str.charAt(i)); } return sb.toString(); }
	 

	/*
	 * public static void main(String [] args) { String str = "sumitra"; String
	 * reverse = " "; for (int i = str.length()-1; i>=0; i--) { reverse = reverse +
	 * str.charAt(i); System.out.println(reverse); } }
	 */
	
	// reverse string using for loop
	
	/*
	 * public static void main(String [] args) { String name = "sumitra"; String
	 * reverse = " ";
	 * 
	 * for (int i = name.length()-1; i>=0; i--) { reverse = reverse +
	 * name.charAt(i); System.out.println(reverse); } }
	 */
	 
	
	// reverse string using Character Array and for loop
	
/*	public static void main(String[] args) {
		String name = "sumitra";
		String apple = "";
		
		for (int i = name.length()-1; i >= 0; i--) {
			apple = apple + name.charAt(i);
		System.out.println(apple);
		}
	}*/		
	}

