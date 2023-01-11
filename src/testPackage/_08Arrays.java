package testPackage;

import java.util.Arrays;

public class _08Arrays {
	
	public static void main(String[] args) {
		twoDarray();
	}
	
	public static void arraybasic() {
		// datatype[] identifier;
		//declaration of an array
		boolean[] flag;
		
		int []marks;
		//initialization of array
		  marks = new int[5];
		  marks[0]=15;
		  marks[1]=20;
		  marks[2]=30;
		  marks[4]=10;
		  System.out.println(marks);
		  System.out.println(Arrays.toString(marks));
		  System.out.println(marks[2]);
		  System.out.println(marks.length);
		  
		  Arrays.sort(marks);
		  System.out.println(Arrays.toString(marks));
		  
		  //iterate using for loop which works on indices
		  
		  for(int i=0; i<marks.length;i++) {
			  System.out.println(marks[i]);
		  }
		  
		  //enhance for loop
		  
		  for(int x: marks) {
			  System.out.println(x);
		  }
		  
		  
	}
 
	
	public static void dynamicarray() {
		int [] arr= {12,15,61,87,24};
		System.out.println(arr.length);
	}
	
	public static void twoDarray() {
		int [] arr1= {12,15,61,87,24};
		System.out.println(arr1+"\n "+arr1[0]);
		
		int [][]arr = new int [3][5];
		
		System.out.println(arr[0]+"\n"+arr[0].length);
		
		int [][]arr2 = {{12,12,12},
				          {15,15,15},
				           {16,16,16}};
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[0].length; j++) {
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}
