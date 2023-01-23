package polymorphismdemo;

public class ScientificCalculator extends Calculator {
	//method hiding
	public void test(String str) {
		System.out.println("Hi " + str);
	}
	
	public static void main(String[] args) {
		ScientificCalculator sc = new ScientificCalculator();
		sc.test("Java");
		
		Calculator cal = new Calculator();
		cal.test("Java");
		
		//upcasting
		Calculator cal1 = new ScientificCalculator();
		cal1.test("Java");
		
		
	}

}
