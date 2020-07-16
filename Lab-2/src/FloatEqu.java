//Exercise 5

public class FloatEqu {

	private static final double TOLERANCE = .0000000001;

	public static void main(String[] args) {

		// Initializing variables x and y
		double y, x;
		y = ((1.0 / 10) * (1.0 / 10));
		x = (1.0 / 100);

		// Determine if equal
		if (x == y) {
			System.out.println("EQUAL");
		}

		else {
			System.out.println("NOT EQUAL");
		}

		if (Math.abs(y - x) < TOLERANCE)
			System.out.println("Esentially Equal");
	}

}
