package testPackage;

public class _09String {
	public static void main(String[] args) {
		basicString();
	}

	public static void basicString() {
		// using String literals
		// stored in String constant pool
		String str = "Java";
		String str2 = "Java";

		// using new keyword
		// stored into heap memory
		String str3 = new String("Java");
		String str4 = new String("JaVA");

		if (str4 == str3) {
			System.out.println("Stored at same add");
		} else {
			System.out.println("Stored at diff add");
		}

		str = str.concat(" Test");
		System.out.println(str);

		System.out.println("String length :" + str.length());

		System.out.println(str.isEmpty());

		System.out.println(str.charAt(2));

		System.out.println(str.contains("TeS"));

		System.out.println(str3.equals(str4));
		System.out.println(str3.equalsIgnoreCase(str4));

		System.out.println(str3.compareTo(str4));
		System.out.println(str3.compareToIgnoreCase(str4));

		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());

		System.out.println(str.indexOf("av"));

		System.out.println(str.startsWith("st"));
		System.out.println(str.endsWith("st"));

		System.out.println(str.replace('a', 'A'));

		char[] charr = str.toCharArray();
		
		for(char x:charr) {
			System.out.println(x);
		}
		
		
		String [] starr= str.split("a");
		for(String x: starr) {
			System.out.println(x);
		}
		
		str = "My name is khan";
		 System.out.println(str.substring(0, str.length()));
		 
		 //abcxyz@gmail.com       abcxyz
		 String email = "  abcxyz @ gmail . com  ";
		 System.out.println(email.substring(0, email.indexOf("@")));
		 System.out.println(email.split("@")[0]);
		 System.out.println(email.trim());
		 System.out.println(email.replace(" ", ""));
		 
		 
		 
		 

	}
}
