package testPackage;

import java.util.Scanner;

/**
 * 6-Jan-2023
 * 
 * @author HP for while do-while
 *
 *         for(intialization; condition; increment/decrement){ code }
 */
public class _06LoopStatement {
	public static void main(String[] args) {
		nestedforLoop();
	}
	
	public static void basicforloop() {
		for(int i=1; i<=3;i=i+1) {
			System.out.println("Hello World");
		}
	}
	
	public static void tableofanyNumber() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = in.nextInt();
		
		for(int i=1; i<=10; i++ ) {
			System.out.println(num*i);
		}
	}
	
	public static void sumofFirst50Numbers() {
		int sum=0;
		for(int i=1; i<=5; i++) {
			sum = sum+i;
		}
		
		System.out.println(sum);
	}
	
	public static void factorial() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number ");
		int num = in.nextInt();
		int fact =1;
		for(int i=1; i<= num; i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}
	
	public static void nestedforLoop() {
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	}

