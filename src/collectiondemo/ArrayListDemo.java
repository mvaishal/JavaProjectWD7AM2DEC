package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayListDemo {
	public static void main(String[] args) {
		arrayListIterate();
	}
	
	public  static void arrayListbasic() {
		//initial capacity is 16
		ArrayList<String> li = new ArrayList<>();
		li.add("Java");
		li.add("python");
		li.add("javascript");
		System.out.println(li);
		System.out.println(li.get(0));
		System.out.println(li.size());
		li.trimToSize();
		li.add(0, "ruby");
		System.out.println(li);
		//update data at any index
       // li.set(1, "c++");
        System.out.println(li);
        System.out.println(li.isEmpty());
      System.out.println(li.contains("Java"));
     System.out.println(li.indexOf("Java"));
    System.out.println(li.lastIndexOf("Java"));
  //  System.out.println(li.remove("Java"));//true
   // System.out.println(li.remove(0));//ruby
   // li.clear();
 //   System.out.println(li);
    
    ArrayList<String> li1 = new ArrayList<>();
    li1.add("bdd");
	li1.add("tdd");
	
	System.out.println(li);
	System.out.println(li1);
	
	li.addAll(0,li1);
	System.out.println(li);
	System.out.println(li.containsAll(li1));
	}
	
	public static void arrayListIterate() {
		ArrayList<String> li = new ArrayList<>();
		li.add("Java");
		li.add("python");
		li.add("javascript");
		li.add("groovy");
		li.add("typescript");
		li.add("groovy");
		
		System.out.println("====iterate using for loop=====");
		
		for(int i=0; i<li.size(); i++) {
			System.out.print(li.get(i)+" ");
		}
		
		System.out.println();
		System.out.println("====iterate using enhance for loop=====");
		
		for(String x:li) {
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("====iterate using for each loop with lamda operator=====");
		
		li.forEach(x ->{System.out.print(x+" ");});
		
		System.out.println();
		System.out.println("====iterate using stream Api=====");
		
		li.stream().forEach(x ->{System.out.print(x+" ");});
		System.out.println(li.stream().distinct().count());
		
		System.out.println();
		System.out.println("====iterate using Iterator=====");
		
		  Iterator<String>it= li.iterator();
		  while(it.hasNext()) {
			  System.out.print(it.next()+" ");
		  }
		  
		  System.out.println();
			System.out.println("====iterate using List Iterator=====");
			
			 ListIterator<String> lit= li.listIterator();
			 while(lit.hasPrevious()) {
				 System.out.print(lit.previous()+" ");
			 }
			
		
		
		
	}
}
