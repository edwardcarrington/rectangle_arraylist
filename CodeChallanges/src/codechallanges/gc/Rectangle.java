package codechallanges.gc;

public class Rectangle {

	private double width;
	private double height;

	// constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// getter
	public double getArea() {
		return width * height;
	}

	// getter
	public double getCircumference() {
		return 2 * width * height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "The rectangle area that you supplied [" + width + "," + height + "] Area is:" + getArea()
				+ ", with a circumference of:" + getCircumference();
	}
}