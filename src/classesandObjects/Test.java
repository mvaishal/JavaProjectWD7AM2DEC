package classesandObjects;

import java.util.Scanner;


public class Test {
	
	public static void main(String[] args) {
		Calculator.sub();
		
		Calculator obj1 = new Calculator();
		//private member not available outside the class
	//	obj1.add1(12, 15);
		
		obj1.mul(15, 20);
		
		obj1.divide(20, 10);
	}
	

	public void userinput() {
		Scanner sc = new Scanner(System.in);
		System.out.println(sc.next());
	}
	
}
