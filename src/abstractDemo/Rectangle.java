package abstractDemo;

public class Rectangle extends Shape {

	double length;
	double width;

	public Rectangle(String color, double length, double width) {

        super(color);
		this.length = length;
		this.width = width;

	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return length * width;
	}

	public String display() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", area()=" + area() + "]";

	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + ", area()=" + area() + "]";
	}

}
