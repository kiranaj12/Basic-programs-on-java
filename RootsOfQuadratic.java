
public class RootsOfQuadratic {

	public static void main(String[] args) {
		double a = 10;
		double b = 20;
		double c = 30;
		double quad = b * b - 4 * a * c;

		if (quad > 0) {
			double root1 = (-b + Math.sqrt(quad)) / (2 * a);
			double root2 = (-b - Math.sqrt(quad)) / (2 * a);
			System.out.println(root1 + " " + root2);
		} else if (quad == 0) {
			double root1 = -b / (2 * a);
			double root2 = -b / (2 * a);
			System.out.println(root1);

		}

		else {
			double realPart = -b / (2 * a);
			double imaginaryPart = Math.sqrt(-quad) / (2 * a);
			System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi",
					realPart, imaginaryPart, realPart,imaginaryPart);
		}

	}

}
