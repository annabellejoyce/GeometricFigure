public class FigureTester {

	public static void main(String[] args) {
		//create new Octagon object
		Octagon o = new Octagon(5.5);
		Octagon otherO = new Octagon(6.6);
		
		//test methods
		o.writeToConsole();
		o.updateFromConsole();
		o.writeToConsole();
		
		int test = o.compareTo(otherO);
		
		//if else clauses for the return value of the compareTo method
		if (test == 1) {
			System.out.println("That Octagon is bigger than the first");
		} else if (test == 0) {
			System.out.println("That Octagon is the same size as the first");
		} else {
			System.out.println("That Octagon is smaller than the first");
		}
	}

}
