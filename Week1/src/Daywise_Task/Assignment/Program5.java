package Assignment;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String input = sc.nextLine();
		
		String result = Concatenation.concatLetter(input);
		System.out.println("Output: "+result);
		sc.close();
	}

}

class Concatenation{
	public static String concatLetter(String input) {
		String[] words = input.split("\\s+");
		StringBuilder result  = new StringBuilder();
		
		for(String word : words) {
			if(!word.isEmpty()) {
				char lastChar = word.charAt(word.length()-1);
				result.append(Character.toUpperCase(lastChar));
			}
		}
		return result.toString();
	}
}
