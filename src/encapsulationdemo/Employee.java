package encapsulationdemo;
//pojo  plain old java object
public class Employee {
	private String name;
	private String id;
	private String orgName = "TCS";
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18 && age <=60) {
			this.age = age;
		}
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrgName() {
		return orgName;
	}
//	public void setOrgName(String orgName) {
//		this.orgName = orgName;
//	}
	

}
