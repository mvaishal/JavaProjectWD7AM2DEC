package constructorDemo;

public class Box {
	
	int length;
	int width;
	int height;
	
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", height=" + height + "]";
	}
	
	public Box(int length, int height,int width) {
		
		this.length = length;
		this.width = width;
		this.height = height;
		System.out.println("Inside parameterized constructor");
	}
	
	
	 Box(){
		 this(100, 50,20);
      System.out.println("Inside Constructor");
	 }
	 
	public static void main(String[] args) {
	//	Box box = new Box(100,50, 25);
		
		Box box = new Box();
				
		
		
//		box.length=15;
//		box.height=20;
//		box.width=35;
		
	System.out.println(box.toString());
		
		
	}

}
