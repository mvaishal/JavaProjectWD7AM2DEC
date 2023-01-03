package testPackage;

/**
 * Assignment operator Arithmetic operator comparison operator logical operator
 * ternary opertor
 */
public class _03Operators {
	public static void main(String[] args) {
		ternaryOperators();
	}

	public static void assignmentOperator() {
		// =
		int a = 10;
		String course = "Java";

		System.out.println(course);
	}

	public static void arithmeticOperator() {
		// + , -, * ,/ ,%

		int a = 10;
		int b = 2;

		System.out.println(a + b); // 13
		System.out.println(a - b);// 7
		System.out.println(a * b); // 30
		System.out.println(a / b);// 3 returns quotient
		System.out.println(a % b);// 1 returns remainder

	}

	public static void comparisonOperator() {
		// == != > < >= <= returns boolean value

		int a = 10;
		int b = 3;
		System.out.println(a == b);// false
		System.out.println(a != b); // true

		System.out.println(a > b); // true

		System.out.println(a < b);// false

		System.out.println(a >= b);// true

		System.out.println(a <= b);// false

	}

	public static void logicalOperator() {
		int a = 10;
		int b = 3;

		System.out.println((a > b) && (b < a));// true
		System.out.println((a > b) && (b > a));// false

		System.out.println((a < b) && (b < a));// false

		System.out.println((a < b) || (b < a));// true
	}

	public static void ternaryOperators() {
		// (condition)?expression1 : expression2

		int a = 10;
		int b = 3;

		int result = (a < b) ? (a + b) : (a * b);
		System.out.println(result);
	}

}
