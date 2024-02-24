/*Program name: PasswordChecker
 * Date: 2024-02-24
 * Author: Eliezer Fioti
 * Purpose: This class tests the PasswordStrengthChecker class by prompting user input and evaluating password strength.
 */

import java.util.Scanner;

public class PasswordCheckekerTester {
	
	public static void main(String[] args) {
		
		PasswordStrengthChecker password = new PasswordStrengthChecker();
		Scanner in = new Scanner(System.in);
		
		String potentialPassword; 
		
		//Welcome message
		System.out.println("Welcome to Eliezer's password checker!");
		System.out.println("Enter 'Q' or 'q' to quit the application\n");
		
		do {
			System.out.println("Please enter a potential password to test it's strength.");
			potentialPassword = in.next();
			
			//Check if User inputs the Letter Q
			if (potentialPassword.equalsIgnoreCase("Q")) {
                break; // Exit the loop if the user enters 'Q' or 'q'
            }
			
			//check password strength
			if (password.isPasswordStrong(potentialPassword)) {
				System.out.println("\n- This is a strong password\n");
			}
			else {
				//Checks if password is long enough
				if (!password.isPasswordLongEnough(potentialPassword)) {
                    System.out.println("\n- It must be between 8 and 16 characters long.");
                }
				//checks if password contains special characters 
                if (!password.hasSpecialCharacters(potentialPassword)) {
                    System.out.println("\n- It must contain at least one special character: !@#$%^&*()-_+=");
                }
                //checks if password contains both lower and upper case letters 
                if (!password.hasUppercaseLowercase(potentialPassword)) {
                    System.out.println("\n- It must contain both uppercase and lowercase letters.\n");
                }
			}
		} while(!potentialPassword.equalsIgnoreCase("Q"));
		
		//Farewell message
		System.out.println("\nThank you for using Eliezer's password checker!");
        in.close(); // Close the scanner
	}
	
}
