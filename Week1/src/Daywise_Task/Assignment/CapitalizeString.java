package Assignment;

import java.util.Scanner;

class Program1 {
	
	public static String getCapitalized(String input) {
		if (input == null) {
			return input;
		}
		String[] words = input.split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for (String word: words) {
			if(!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase()).append(" ");
			}
		}
		return result.toString().trim();
	}
}

public class CapitalizeString{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String capitalized = Program1.getCapitalized(input);
		System.out.println("Output: "+capitalized);
		
		sc.close();
	}
}
