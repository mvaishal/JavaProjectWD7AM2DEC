package testngscripts;

import org.testng.annotations.Test;

public class NewTestClass2 {
	
	@Test (priority = -1)
	public void testMethod1() {
		System.out.println("New test Class2 Method1");
	}
	
	@Test(priority = 1)
	public void testMethod2() {
		System.out.println("New test Class2 Method2");
	}
	
	@Test (priority = 2)
	public void testMethod3() {
		System.out.println("New test Class2 Method3");
	}
	
	@Test (priority = 0)
	public void testMethod4() {
		System.out.println("New test Class2 Method4");
	}

}
