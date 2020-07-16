//Exercise 4- Modified AgeGuess from Exercise 1 

import java.util.*;

public class AgeGuess2 {

	public static void main(String[] args) {

		int Age, AgeGuess;
		Random gen = new Random();
		Age = gen.nextInt(100);

		Scanner scan = new Scanner(System.in);
		System.out.println("Guess my age");
		AgeGuess = scan.nextInt();
		scan.close();

		if (AgeGuess != Age) {
			System.out.println("You guessed wrong!");
		}

		if (Age > AgeGuess) {
			System.out.println("My age is older, I am wiser than I look!");
		}

		if (Age < AgeGuess) {
			System.out.println("Silly man! I am younger than that!");
		}

		if (Age == AgeGuess) {
			System.out.println("You are a genius");

		}

	}

}
