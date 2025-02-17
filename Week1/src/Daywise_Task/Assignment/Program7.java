package Assignment;

import java.util.Scanner;

public class Program7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 10 digit number in XXX-XXX-XXXX format: ");
		String input = sc.nextLine();
		
		String result = Formatter.convertFormat(input);
		System.out.println("Output: "+result);
		sc.close();
	}

}

class Formatter{
	public static String convertFormat(String input) {
		if (input == null || !input.matches("\\d{3}-\\d{3}-\\d{4}")) {
			return "Invalid Input";
		}
		String digits = input.replaceAll("-", "");
		if(digits.length() != 10) {
			return "Invalid Input";
		}
		return digits.substring(0,2)+"-"+digits.substring(2,4)+"-"+digits.substring(4,7)+"-"+digits.substring(7,10);
	}
}