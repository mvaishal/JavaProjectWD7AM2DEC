package testPackage;

import java.util.Scanner;
/*
 
 */

public class _04UserInput {
	public static void main(String[] args) {
		stringInput();
	}

	public static void stringInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your age");
		//to take integer input from user
		int age = input.nextInt();
		System.out.println("Enter your Name");
		//to take string input from user
		String name = input.next();
		// String name= input.nextLine();

		System.out.println("Enter any character");

	    char ch=input.next().charAt(0);

		System.out.println("Name is " + name + " and age is " + age+" character is "+ch);

//		double num = input.nextDouble();
//		float f1 = input.nextFloat();

	}

	public static void integerInput() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first Number");
		int a = input.nextInt();
		System.out.println("Enter second Number");
		int b = input.nextInt();
		System.out.println(a + b);

	}

	public static void addition() {
		int a = 10;
		int b = 20;

		System.out.println(a + b);

	}
}
