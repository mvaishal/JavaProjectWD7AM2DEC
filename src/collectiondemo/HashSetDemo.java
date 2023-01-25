package collectiondemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class HashSetDemo {
	
	public static void main(String[] args) {
		hashSetBasic();
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
		
		
	}
}
