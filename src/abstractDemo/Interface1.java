package abstractDemo;

public interface Interface1 {
	// public static and final
	int a = 10;

	public void test();
	
	default void test2() {
		//implement as your requirement
	};
}
