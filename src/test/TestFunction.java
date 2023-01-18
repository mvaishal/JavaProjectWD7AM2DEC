package test;

import classesandObjects.Calculator;
//access modifier examples
public class TestFunction extends Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
      calc.add();
		TestFunction tf = new TestFunction();
		tf.divide(24, 24);
		tf.add();
		
		tf.sayHello("Arun");

	}
	
	
	public static String whatsYourname(String name) {
		 return name;
	}
	
	public void sayHello(String abc) {
		System.out.println("Hello "+whatsYourname(abc));
	}

}
