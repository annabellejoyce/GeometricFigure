import java.util.Scanner;

public class Octagon extends GeometricFigure2 implements ComparableGeometricFigure<Octagon>, ConsoleIO {

	// data members
	private double side;

	// constructor
	public Octagon(double side) {
		super();
		this.side = side;
	}

	// implement abstract method
	public double calcArea() {
		//equation for area of an octagon
		return 2 * ((1 + Math.sqrt(2)) * (Math.pow(this.side, 2)));
	}

	// implement compareTo method
	public int compareTo(Octagon o) {
		if (this.side > o.side) {
			return 1;
		} else if (this.side < o.side) {
			return -1;
		} else {
			return 0;
		}
	}

	// implement methods from ConsoleIO interface
	public void updateFromConsole() {
		// create Scanner for user input
		Scanner input = new Scanner(System.in);
		
		//get new value for side
		System.out.println("Enter a value for side: ");
		this.side = input.nextDouble();
		
		// close Scanner
		input.close();
	}

	public void writeToConsole() {
		//print side value and area value
		System.out.println("Side is: " + this.side);
		System.out.println("Area is: " + calcArea());
	}
}
