import java.util.*;
public class Test {
	
	public static void main(String[] args){
		// Create a Scanner object to get input
		Scanner input = new Scanner(System.in);
		
		// Declare a local password variable
		String password;
		
		// prompt the user for a password
		System.out.print("Enter a password that contains a number at at least 8 digits: ");
		password = input.next();
	
		while (!User.strongPassword(password)) {
			System.out.print("Enter a password that contains a number at at least 8 digits: ");
			password = input.next();
		}
		
		// create a new instance of the User class, providing the password in the constructor
		User userClass = new User(password);
		
		System.out.println();
		System.out.println("Password before = " + userClass.getPassword());
		System.out.println("Salt before = " + userClass.getSalt());
		System.out.println("Hash before = " + userClass.getHashedPassword());
		
		// Call the hashUserPassword() function of the NSALoginController class, 
		// passing in the User object you created
		
		try {
			NSALoginController.hashUserPassword(userClass)
			 ;
			} catch (Exception e) {
				e.printStackTrace();
			}
		
		// Display results before hashing the passwords
		System.out.println();
		System.out.println("Password after = " + userClass.getPassword());
		System.out.println("Salt after = "  + userClass.getSalt());
		System.out.println("Hash after = " + userClass.getHashedPassword());
		
	}
	
	

}

