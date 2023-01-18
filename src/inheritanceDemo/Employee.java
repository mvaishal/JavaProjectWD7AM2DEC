package inheritanceDemo;

public class Employee {
	
	int employeeId;
	String orgName ="TCS";
	String department;
	
	public void display(String name, String org,String department) {
		System.out.println(name+" works in "+org+ " as "+department );
	}
	

}
