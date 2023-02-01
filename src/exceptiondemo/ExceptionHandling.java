package exceptiondemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
 try{
 
 }
 catch(){
 }
 */
public class ExceptionHandling {
	
	
	public static void main(String[] args) {
	//	test();
		try {
			isValidAge(17);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void isValidAge(int age) throws InvalidAgeException {
		
		if(age<18) {
			throw new InvalidAgeException("Invalid Age Exception:"+age);
		}else {
			System.out.println("Valid Age");
		}
	}
	
	
	//scenario for finally block
	public static void test() {
		System.out.println("Open File");
		try {
			System.out.println("read file"+(1/0));
		}catch (Exception e) {
			// TODO: handle exception
			
		}finally {
			System.out.println("close file");
		}
		
		
	}
	
	
	public static void dummyarrays() {
		System.out.println("Programm Starts");
		int[]arr = {51,15,54,45};
		try {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]/0);
		}
		
		System.out.println("Inside try");
		}catch (ArithmeticException e) {
			System.err.println("Something wrong here1");
		//	e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			System.err.println("Something wrong here2");
		//	e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Something wrong here3");
		//	e.printStackTrace();
		}finally {
			System.out.println("Inside finally block");
		}
		
		System.out.println("Programm Ends");
	}

	
	public  static void compileTimeException() throws FileNotFoundException {
		File file = new File("");
		FileInputStream fileInputStream;
		 fileInputStream = new FileInputStream(file);
		fileInputStream = new FileInputStream(file);
		
		
		
	}
}
