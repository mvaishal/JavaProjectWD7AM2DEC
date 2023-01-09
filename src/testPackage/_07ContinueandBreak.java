package testPackage;

public class _07ContinueandBreak {
	
	public static void main(String[] args) {
		continueStatement();
	}
	
	public static void breakStatement() {
		
		for(int i=1; i<=10; i++) {
			
			if(i==8) {
				break;
			}
			System.out.println(i);
		}
	}
	
public static void continueStatement() {
		
		for(int i=1; i<=10; i++) {
			
			if(i==4) {
				continue;
			}
			System.out.println(i);
		}
	}

}
