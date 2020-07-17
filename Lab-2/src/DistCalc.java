//Exercise 2- Calculate the Distance Between Two Points

import java.util.Scanner;
import java.text.*;

public class DistCalc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// Scan in coordinate point one (x1, y1)
		double x1;
		double y1;
		System.out.println("What is the coordinate  point for point 1?");

		x1 = scan.nextDouble();
		y1 = scan.nextDouble();

		// Scan in coordinate point two (x2, y2)
		double x2;
		double y2;
		System.out.println("What is the cooridinate point for point 2");

		x2 = scan.nextDouble();
		y2 = scan.nextDouble();

		scan.close();

		// Calculate distance between the two points
		double distance;
		distance = (Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow(y2 - y1, 2)))));
		DecimalFormat df = new DecimalFormat("#.###");

		// Print distance
		System.out.println("The distance between the two points is " + (df.format(distance)));
	}

}
