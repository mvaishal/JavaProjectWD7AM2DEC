package classesandObjects;

/*
 public 
 protected
 default
 private
 */
public class Calculator {
	int num1, num2;

	public static void main(String[] args) {
      // sub();
       
       Calculator obj1 = new Calculator();
       obj1.add();
       
       obj1.add1(15, 20);
         
	}

	/*
	 * accessModifer static/nonstatic returntype identifier (){ code }
	 * 
	 */
	
	//non paramteterized function
	public void add() {
		int num1=10;
		int num2 =20;
		int result = num1 + num2;
		System.out.println(result);
	}
	
	//parameterized function
	
		private void add1(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	}

	 static public void sub() {
		int num1=10;
		int num2 =20;
		int result = num2 - num1;
		System.out.println(result);
	}
	 
	       void mul(int num1, int num2) {
			
			int result = num2 * num1;
			System.out.println(result);
		}
	
	

}
