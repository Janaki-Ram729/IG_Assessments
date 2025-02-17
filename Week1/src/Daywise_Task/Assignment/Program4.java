package Assignment;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String input = sc.nextLine();
		
		System.out.println("Enter a Character: ");
		char seperator = sc.next().charAt(0);
		
		String result = ReverseString.reversal(input, seperator);
		System.out.println("Output: "+result);
		sc.close();
	}
}

class ReverseString{
	public static String reversal(String input,char seperator) {
		StringBuilder reversed = new StringBuilder(input).reverse();
		return String.join(String.valueOf(seperator), reversed.toString().split(""));
	}
		
}