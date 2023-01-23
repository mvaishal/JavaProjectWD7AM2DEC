package abstractDemo;

public abstract class Shape {
	
	String color;
	public Shape(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}

	//abstract method
	public abstract double area();
	
	
	

}
