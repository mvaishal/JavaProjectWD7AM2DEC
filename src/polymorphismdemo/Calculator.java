package polymorphismdemo;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(20, 30);
	}
	
	public static void main(int [] args) {
		
	}
	
   public void add() {
	   int a=10;
	   int b=20;
	   System.out.println(a+b);
   }
   
   // by changing the number of parameter
   public int add(int a, int b) {
	   System.out.println(a+b);
	   return a+b;
   }
   
   public void test(String str) {
	   System.out.println("Hello "+str);
   }
   
//   public double add(int a, int b) {
//	   System.out.println(a+b);
//	   return a+b;
//   }
//   
   public  static void add(int a, int b, int c) {
	   System.out.println(a+b+c);
   }
   
   //by changing the type of parameter
  protected  static double add(int a, double b) {
	   System.out.println(a+b);
	   return (a+b);
   }
   
   //by changing the sequence of parameter
   protected void add(double a , int b) {
	   System.out.println(a+b);
   }

  
}
