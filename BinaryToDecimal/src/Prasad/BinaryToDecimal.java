package Prasad;

import java.util.Scanner;

public class BinaryToDecimal {
	private static int r;

	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        int decimalNumber = binaryToDecimal(binaryString);
        System.out.println("Decimal equivalent: " + decimalNumber);
    }

    public static int binaryToDecimal(String binaryString) {
        int decimalNumber = 0;
        int power = 0;

        for (int i = binaryString.length() - 1; i >= 0; i--) {
            int digit = binaryString.charAt(i) - '0'; // Convert character to integer

            if (digit == 1) {
                decimalNumber += Math.pow(2, power);
            }

            power++;
        }
        return decimalNumber;
    }
}

			