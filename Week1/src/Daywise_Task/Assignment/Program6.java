package Assignment;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Sentence: ");
		String input = sc.nextLine();
		
		int result = SumofWords.calculateWorldSum(input);
		System.out.println("Output: "+result);
		sc.close();
	}

}

class SumofWords{
	public static int calculateWorldSum(String sentence) {
		String[] words = sentence.split("\\s+");
		
		if (words.length < 2) {
			return -1;
		}
		
		String firstWord = words[0];
		String lastWord = words[words.length-1];
		
		return firstWord.equals(lastWord)? firstWord.length() : firstWord.length() + lastWord.length();
		
	}
}