package testPackage;

public class _09String {
	public static void main(String[] args) {
		basicString();
	}
	
	public static void basicString() {
		//using String literals 
		//stored in String constant pool
		String str = "Java";
		String str2="Java";
		
		//using new keyword
		// stored into heap memory
		String str3 = new String ("Java");
		String str4 = new String ("Java");
		
		if(str4==str3) {
			System.out.println("Stored at same add");
		}else {
			System.out.println("Stored at diff add");
		}
		
		 str =str.concat(" Test");
		System.out.println(str);
		
		System.out.println("String length :"+str.length());
		
		System.out.println(str.isEmpty());
		
		System.out.println(str.charAt(2));
		
	 System.out.println(str.contains("TeS"));
		
	}
}
