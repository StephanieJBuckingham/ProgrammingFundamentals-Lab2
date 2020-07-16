//Exercise 1- Modify AgeGuess from Lab 1

import java.util.*;

public class AgeGuess {

	public static void main(String[] args) {

		//Initialize age variable
		int age; 
		Random gen = new Random();
		age = gen.nextInt(100);
		Scanner scan = new Scanner(System.in);
		
		//Scan in age guess
		int AgeGuess;
		System.out.println("Guess my age");
		AgeGuess = scan.nextInt();
		
		//Print out real age and age guess.
		System.out.println("My real age is " + age);
		System.out.println("You guessed " + AgeGuess);
		scan.close();
	}

}
