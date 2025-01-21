package armstrong;


	import java.util.Scanner;

	public class ArmstrongNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input the number to check
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if it's an Armstrong number
	        if (isArmstrong(number)) {
	            System.out.println(number + " is an Armstrong number.");
	        } else {
	            System.out.println(number + " is not an Armstrong number.");
	        }

	        scanner.close();
	    }

	    // Function to check if a number is an Armstrong number
	    public static boolean isArmstrong(int num) {
	        int originalNum = num;
	        int sum = 0;

	        // Calculate the number of digits
	        int numberOfDigits = String.valueOf(num).length();

	        // Calculate the sum of the digits raised to the power of numberOfDigits
	        while (num > 0) {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        // Check if the sum equals the original number
	        return sum == originalNum;
	    }
	}


