//Exercise 6- Number Display 

import java.util.*;

public class NumDisplay {

	public static void main(String[] args) {

		// Scan in number
		Scanner scan = new Scanner(System.in);
		int number;
		System.out.println("Pick a number between 0 and 9 and print it below.");
		number = scan.nextInt();
		scan.close();

		// Print out matching word
		switch (number) {

		case 0: // if (x == 0)
			System.out.println("zero");
			break;

		case 1: // if (x == 1)
			System.out.println("one");
			break;

		case 2: // if (x == 2)
			System.out.println("two");
			break;

		case 3: // if (x == 3)
			System.out.println("three");
			break;

		case 4: // if (x == 4
			System.out.println("four");
			break;

		case 5: // if (x == 5)
			System.out.println("five");
			break;

		case 6: // if (x == 6)
			System.out.println("six");
			break;

		case 7: // if (x == 7)
			System.out.println("seven");
			break;

		case 8: // if (x == 8)
			System.out.println("eight");
			break;

		case 9: // if (x == 9)
			System.out.println("nine");
			break;
		}

		if (number > 9) {
			System.out.println("invalid number");
		}
	}
}
