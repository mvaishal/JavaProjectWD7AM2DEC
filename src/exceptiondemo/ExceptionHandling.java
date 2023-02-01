package exceptiondemo;

/*
 try{
 
 }
 catch(){
 }
 */
public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		dummyarrays();
	}
	
	
	public static void dummyarrays() {
		System.out.println("Programm Starts");
		int[]arr = {51,15,54,45};
		try {
		for(int i=0; i<=arr.length; i++) {
			System.out.println(arr[i]/0);
		}
		
		System.out.println("Inside try");
		}catch (ArithmeticException e) {
			System.err.println("Something wrong here");
		//	e.printStackTrace();
		}catch (IndexOutOfBoundsException e) {
			System.err.println("Something wrong here");
		//	e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Something wrong here");
		//	e.printStackTrace();
		}
		
		System.out.println("Programm Ends");
	}

}
