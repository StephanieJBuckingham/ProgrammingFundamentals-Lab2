//Exercise 3- Construct a UserName

import java.util.*;

public class UserName {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Scan in first name
		String firstname;
		System.out.println("What is your first name?");
		firstname = scan.nextLine();

		// Scan in last name
		String lastname;
		System.out.println("What is your last name?");
		lastname = scan.nextLine();
		scan.close();

		// Generate random number ranging from 10-99
		int y;
		Random gen = new Random();
		y = (gen.nextInt(90)+ 10);

		// Print out user name
		System.out.println("Your username is: " +lastname.substring(0, 4) + firstname.charAt(0) + y);
	}
}
