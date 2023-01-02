package testPackage;

/*
  local: created inside method
  instance: created outside method but inside class
  class: when static keyword is added as a prefix to 
         instance variable is know as class variable
 */
public class _01VariableDemo {
	// instance
	String name;
	//class
	static String courseName;

	public static void main(String[] args) {
		// datatype identifier = value;

//		int num = 24;
//		System.out.println(45);
//		System.out.println(num);
//		System.out.println(num);
//		System.out.println(age);
		
		_01VariableDemo obj1 = new _01VariableDemo();
		
		_01VariableDemo obj2 = new _01VariableDemo();
		
		obj1.name="Ganesh";
		obj2.name="Shyam";
		
		courseName="Selenium";
		
		System.out.println(obj1.name); //Ganesh
		System.out.println(obj1.courseName); //Selenium
		System.out.println(obj2.name); //Shyam
		System.out.println(obj2.courseName);//Selenium
		
		courseName="Java";
		obj1.name = "Ankit";
		
		System.out.println(obj1.name); //Ankit
		System.out.println(courseName); //Java
		System.out.println(obj2.name); //Shyam
		System.out.println(courseName);//Java
	}

	public void testmethod() {
		// local variable
		int age = 30;

	}

}
