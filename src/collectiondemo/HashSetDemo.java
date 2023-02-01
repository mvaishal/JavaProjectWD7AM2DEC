package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {
	
	public static void main(String[] args) {
		hashSetIterate();
	}
	public static void hashSetIterate() {
		Set<String> hset = new TreeSet<>();
		hset.add("java");
		hset.add("python");
		hset.add("javascript");
		hset.add("groovy");
		hset.add("typescript");
		hset.add("groovy");
		
		System.out.println("Iterate using enhance for loop");
		
		for(String x: hset) {
			System.out.print(x+" ");
		}
		System.out.println();
		System.out.println("Iterate using for loop with lambda operator");
		
		hset.forEach(x->{System.out.print(x+" ");});
		
		System.out.println();
		System.out.println("Iterate using stream API");
		hset.stream().forEach(x->{System.out.print(x+" ");});
		
		System.out.println();
		System.out.println("Iterate using iterator");
		  
		Iterator<String> it= hset.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

	public static void hashSetBasic() {
		HashSet<String> hset = new HashSet<>();
		hset.add("Java");
		hset.add("python");
		hset.add("javascript");
		hset.add("groovy");
		hset.add("typescript");
		hset.add("groovy");
		
		System.out.println(hset);
	//	hset.clear();
		System.out.println(hset.contains("groovy"));
		System.out.println(hset.isEmpty());
		System.out.println(hset.size());
		hset.remove("groovy");
		System.out.println(hset.contains("groovy"));
		
	    String[] arr=  (String[]) hset.toArray();
		System.out.println(Arrays.toString(hset.toArray()));
		List<String> li= Arrays.asList(arr);
		HashSet<String> set = new HashSet<>(li);
		
		
	}
}
