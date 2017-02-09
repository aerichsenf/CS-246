public class User {
	
	// Non-default constructor
	User(String newPassword) {
		setPassword(newPassword);		
	}
	
	// Store my member variables here
	private String password;
	private String hashedPassword;
	private String salt;
	
	// Store my getters here
	public String getPassword() {
		return password;
	}
	
	// Stretch Challenge
	// Must be at least eight characters long
	// and contain at least one digit
	
	public static boolean strongPassword(String password) {
		
		for (int i = 0; i < password.length(); i++) {
			if (password.length() >= 8 && Character.isDigit(password.charAt(i)))
				return true;
			
		}
		return false;
	}
	
	public String getHashedPassword() {
		return hashedPassword;
	}
	
	public String getSalt() {
		return salt;
	}
		
	// Store my setters here
	
	public void setPassword(String newPassword) { 
		password = newPassword;
	}
	
	public void setHashedPassword(String newHashedPassword) { 
		hashedPassword = newHashedPassword;
	}
	
	public void setSalt(String newSalt) {
		salt = newSalt;
	}
	
	
	
	
	
	
	
	
	
	

}
