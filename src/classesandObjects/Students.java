package classesandObjects;

public class Students {
	int id;
	String name;
	
	public static void main(String[] args) {
		//declaration and initialization of objects
		Students std1 = new Students();
		std1.id =121;
		std1.name ="Amar";
		std1.study();
		
		
		Students std2 = new Students();
		
		std2.id=122;
		std2.name="Virat";
		std2.study();
		
				
	}
	
	
	public void study() {
		System.out.println("Job of a student is to study");
	}

}
