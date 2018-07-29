package codechallanges.gc;

//Completed by JoRanda Chapman and Edward Carrington

//Create an ArrayList of rectangles.

//Find the largest one (by area) and print the dimensions or radius. 
//Also find smallest.

import java.util.ArrayList;

public class CodeChallenge1 {
	public static void main(String[] args) {

		ArrayList<Rectangle> listOfRectangles = new ArrayList<Rectangle>();

		// Add to array
		listOfRectangles.add(new Rectangle(12, 12));
		listOfRectangles.add(new Rectangle(10, 10));
		listOfRectangles.add(new Rectangle(9, 10));

		// System.out.println(listOfRectangles);

		System.out.println(
				"Hello! I hear that you want to find the largest and the smallest areas of our rectangles. Please see below for answer!-)\n");

		System.out.println("The largest rectangle is:");
		highest(listOfRectangles);

		System.out.println("\nThe smallest rectangle size is:");
		lowest(listOfRectangles);
	}

	private static void highest(ArrayList<Rectangle> listOfRectangles) {
		double highest = 0;

		for (int i = 0; i < listOfRectangles.size(); i++) {

			if (listOfRectangles.get(i).getArea() > highest) {
				highest = listOfRectangles.get(i).getArea();
			}

		}

		System.out.println(highest);
	}

	private static void lowest(ArrayList<Rectangle> listOfRectangles) {
		double lowest = 1000;

		for (int i = 0; i < listOfRectangles.size(); i++) {

			if (listOfRectangles.get(i).getArea() < lowest) {
				lowest = listOfRectangles.get(i).getArea();
			}

		}

		System.out.println(lowest);
	}
}