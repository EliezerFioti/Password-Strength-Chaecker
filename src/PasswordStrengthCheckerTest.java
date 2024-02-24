import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PasswordStrengthCheckerTest {
	
	//testing for weak passwords
	@Test
	public void weakPasswordTest() {
		PasswordStrengthChecker password = new PasswordStrengthChecker();
		//Testing passwords with 3 or 4 missing requirements
		assertFalse(password.isPasswordStrong("DRAGON")); //does not meet character count, lower-case, and special character requirement
		assertFalse(password.isPasswordStrong("hellowo")); //does not meet character count, upper-case letters, and special character requirement	
		assertFalse(password.isPasswordStrong("hellowo")); //does not meet character count, upper-case letters, and special character requirement
	}
	
	//testing for moderate passwords
	@Test
	public void moderatePasswordTest() {
		PasswordStrengthChecker password = new PasswordStrengthChecker();
		//Testing passwords with 1 or 2 missing requirements
		assertFalse(password.isPasswordStrong("themanoo")); //does not meet upper-case letters and special character requirement
		assertFalse(password.isPasswordStrong("@forest")); //does not meet character count and upper-case letter requirement
		assertFalse(password.isPasswordStrong("ALLCAP#")); //does not meet character count and lower-case letters requirement	
		assertFalse(password.isPasswordStrong("OVERYONDER")); //does not meet lower-case letters and special character requirement
		assertFalse(password.isPasswordStrong("maytonovemeber")); //does not meet upper-case letters and special character requirement
		assertFalse(password.isPasswordStrong("CapTa!n")); //does not meet character count requirement
		assertFalse(password.isPasswordStrong("DinOsaurTeeth")); //does not meet special character requirement
		assertFalse(password.isPasswordStrong("POKEMONG@")); //does not meet lower-case requirement
		assertFalse(password.isPasswordStrong("samsung#23")); //does not meet upper-case requirement
	}
	
	//testing for strong passwords
	@Test
    public void strongPasswordTest() {
        PasswordStrengthChecker password = new PasswordStrengthChecker();
        //Testing passwords with 0 missing requirements
        assertTrue(password.isPasswordStrong("ThemanooR#")); 
        assertTrue(password.isPasswordStrong("@foRestE#@")); 
        assertTrue(password.isPasswordStrong("ALLCAP#d$d")); 
        assertTrue(password.isPasswordStrong("OVERYONDERs%")); 
        assertTrue(password.isPasswordStrong("May2Novemeber@"));
        assertTrue(password.isPasswordStrong("CapTa!nMorgan")); 
        assertTrue(password.isPasswordStrong("DinOsaurTeeth#")); 
        assertTrue(password.isPasswordStrong("PoKEMONG@3"));
        assertTrue(password.isPasswordStrong("samsunG234live&"));
    }

}
