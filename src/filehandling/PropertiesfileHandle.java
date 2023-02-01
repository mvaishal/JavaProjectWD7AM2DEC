package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesfileHandle {
	
	public static void main(String[] args) throws IOException {
		 PropertiesfileHandle p = new PropertiesfileHandle();
		 p.readingfile();
	}
	
	public void readingfile() throws IOException {
		File file = new File("D:\\javaprog\\JavaProjectWD7AM2DEC\\src\\filehandling\\data.properties");
		FileInputStream fis = new FileInputStream(file);
		
		Properties prop = new Properties();
		prop.load(fis);
		
		System.out.println(prop.get("appurl"));
		System.out.println(prop.get("password"));
		
		
	}

}
