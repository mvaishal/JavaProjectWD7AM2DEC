package abstractDemo;

public class Circle extends Shape implements Interface1, Interface2{

	double radius;
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area()=" + area() + "]";
	}

	@Override
	public void test() {
		System.out.println("Override test method from Interface1");
		
	}

	
}
