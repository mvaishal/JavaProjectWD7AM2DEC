package inheritanceDemo;

public class Developer extends Employee{
	String name;
	String salary;
	
	public static void main(String[] args) {
		Developer d1 = new Developer();
		d1.name = "Akash";
		d1.department="Developer";
		
		d1.display(d1.name, d1.department, d1.orgName);
		
	}
	
	

}
