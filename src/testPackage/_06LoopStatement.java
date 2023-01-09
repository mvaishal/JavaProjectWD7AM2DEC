package testPackage;

import java.util.Scanner;

/**
 * 6-Jan-2023
 * 
 * @author HP for while do-while
 *
 *         for(initialization; condition; increment/decrement){ 
 *         code
 *          }
 *         
 *      Initialization;
 *      while(condition){
 *           code
 *           increment/decrement;
 *           }
 *         
 */
public class _06LoopStatement {
	public static void main(String[] args) {
		pattern3();
	}

	public static void basicforloop() {
		for (int i = 1; i <= 3; i = i + 1) {
			System.out.println("Hello World");
		}
	}

	public static void tableofanyNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = in.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}

	public static void sumofFirst50Numbers() {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
	}

	public static void factorial() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = in.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

	// nested for loop
	public static void nestedforLoop() {
		// outer loop is for rows
		for (int i = 1; i <= 5; i++) {
			// inner loop if for column
			for (int j = 1; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern1() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void pattern2() {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void pattern3() {

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//while
	public static void whileloop() {
		/*
		 int sum = 0;
		for (int i = 1; i <= 5; i++) {
			sum = sum + i;
		}

		System.out.println(sum);
		 */
		int sum=0;
		int i =1;
		while(i<=5) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
	}
}
