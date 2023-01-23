package abstractDemo;

public class TestAbstraction  {
	public static void main(String[] args) {
		Circle c1 = new Circle("yellow", 15.0);
		c1.area();
		
		Rectangle r1 = new Rectangle("Red", 15.0, 15.0);
		r1.area();
		
		System.out.println(c1.toString());
		System.out.println(r1.toString());
		
		//Anonymous implementation
		Interface2 if2 = new Interface2() {
			
			@Override
			public void test() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
	}
}
