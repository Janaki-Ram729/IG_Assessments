package Assignment;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter Elements: ");
		for(int i = 0; i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int index = LargeDiff.maxdiff(arr, n);
		System.out.println("Output: "+index);
		
		sc.close();
	}
	
}

class LargeDiff{
	public static int maxdiff(int[] arr, int n) {
		if (n<2) {
			return -1;
		}
		int maxDiff = 0,index = 0;
		
		for(int i = 0;i<n-1;i++) {
			int diff = Math.abs(arr[i]- arr[i+1]);
			if (diff>maxDiff) {
				maxDiff = diff;
				index = (arr[i]>arr[i+1])?i:i+1;
			}
		}
		return index;
	}
}

