package Day2;


public class Mathprob {

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0) return false;
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) sumOfDivisors += i;
        }
        return sumOfDivisors == num;
    }

    public static long calculateFactorial(int num) {
        long result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean checkPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static long sumOfPrimeNumbers(int num) {
        long total = 0;
        for (int i = 2; i <= num; i++) {
            if (checkPrime(i)) total += i;
        }
        return total;
    }

    public static boolean checkArmstrong(int num) {
        int temp = num, sum = 0, length = String.valueOf(num).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, length);
            temp /= 10;
        }
        return sum == num;
    }

    public static int reverseInt(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        return Integer.parseInt(sb.reverse().toString());
    }

    public static int convertDecimalToBinary(int num) {
        return Integer.parseInt(Integer.toBinaryString(num));
    }

    public static int convertBinaryToDecimal(int num) {
        return Integer.parseInt(String.valueOf(num), 2);
    }

    public static int sumOfNFibonacciNumbers(int num) {
        int sum = 0, a = 0, b = 1;
        for (int i = 0; i < num; i++) {
            sum += a;
            int temp = a;
            a = b;
            b = temp + b;
        }
        return sum;
    }

    public static boolean checkPalindrome(int num) {
        int original = num, reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
}
