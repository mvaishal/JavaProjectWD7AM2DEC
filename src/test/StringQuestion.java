package test;

import java.util.Arrays;

public class StringQuestion {

	public static void main(String[] args) {
		insertatanyIndex();
	}

	public static void seperateStrings() {
		String str = "HUGHUG868689*Y*^&#$%#%JBJ";
		String str1 = "";
		String str2 = "";
		String str3 = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				str2 = str2 + str.charAt(i);
			} else if (Character.isAlphabetic(str.charAt(i))) {
				str3 = str3 + str.charAt(i);
			} else {
				str1 = str1 + str.charAt(i);
			}
		}

		System.out.println("SpecialCharatcer: " + str1);
		System.out.println("Digit: " + str2);
		System.out.println("Alphabets: " + str3);
	}

	public static void maxInarray() {
		int[] arr = { 1, 25, 11, 7, 75, 56 };
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Max " + max);
	}

	public static void SearchInArray() {
		int[] arr = { 1, 25, 11, 7, 75, 56 };
		int number = 10;
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] == number) {
				index = i;
			} 
		}
		System.out.println(index);
	}
	
	public static void insertatanyIndex() {
		int [] arr = new int [5];
		int number=15;
		int index=5;
		
		if(index<arr.length && index >=0) {
			arr[index]=number;
			
		}else {
			System.out.println("Index not available in Array");
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
