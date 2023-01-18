package inheritanceDemo;

public class JrDev  extends Developer{

	
	public static void main(String[] args) {
		JrDev jd1 = new JrDev();
		
		jd1.name="Amit";
		jd1.department="JrDev";
		
		jd1.display(jd1.name, jd1.orgName,jd1.department);
	}
}
