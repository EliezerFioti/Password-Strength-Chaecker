/*Program name: PasswordChecker
 * Date: 2024-02-24
 * Author: Eliezer Fioti
 * Purpose: This class checks the strength of passwords based on Three criteria: 
 * 			The length of the password, does the password contain special characters 
 * 			and does the password contain lower and upper case letters
 * */

public class PasswordStrengthChecker {
	
	/**
     * Checks if a password is strong based on various criteria.
     * A strong password must be at least 8 characters long, 
     * contain special characters, and have both upper-case 
     * and lower-case letters.
     * 
     * @param password.
     * @return true if the password is strong, false otherwise.
     */
	public boolean isPasswordStrong(String password) {
		return isPasswordLongEnough(password) && hasSpecialCharacters(password) && hasUppercaseLowercase(password);
	}
	
	 /**
	  * Checks if a password is long enough
	  * A password must be at least 8 characters long
	  * and at most 16 characters long to be considered strong
	  * 
	  * @param password. The password will be used to check for length
	  * @return true is the password is long enough, false otherwise
	  */
	public boolean isPasswordLongEnough(String password) {
		return password.length() >= 8 && password.length() <= 16;
	}
	
	/**
	  * Checks if a password contains special characters
	  * Special characters include ! @ # $ % ^ & * ( ) - + =.
	  * 
	  * @param password. The password will be used to check for special characters
	  * @return true is the password contains special characters, false otherwise
	  */
	public boolean hasSpecialCharacters(String password) {
		return password.matches(".*[!@#$%^&*()-+=].*");
	}
	
	/**
	  * Checks if a password contains both lower and upper case letters
	  * 
	  * @param password. The password will be used to check for upper-case and lower-case letters
	  * @return true is the password contains both lower-case and upper-case letters, false otherwise
	  */
	public boolean hasUppercaseLowercase(String password) {
	    return password.matches(".*[a-z].*") && password.matches(".*[A-Z].*");
	}
	
}