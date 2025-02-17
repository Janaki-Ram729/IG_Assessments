package Assignment;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter PAN: ");
		String pan = sc.nextLine();
		
		boolean Validator= Pan.panValidator(pan);
		System.out.println(Validator?"Valid":"Invalid");
		sc.close();
	}

}

class Pan{
	public static boolean panValidator(String pan) {
		return pan.matches("[A-Z]{3}\\d{4}[A-Z]");
	}
}