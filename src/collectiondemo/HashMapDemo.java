package collectiondemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/*
  key: value
  
 */
public class HashMapDemo {
	
	public static void main(String[] args) {
		hashmapiterate();
	}
	
	public static void hashmapiterate() {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Arun");
		hmap.put(102, "Ajay");
		hmap.put(103, "Jay");
		
		for(Integer x: hmap.keySet()) {
			System.out.println(x);
		}
		
		for(String x: hmap.values()) {
			System.out.println(x);
		}
		
		for( Entry<Integer, String> entry: hmap.entrySet()) {
			System.out.println(entry.getKey()+">>"+entry.getValue());
		}
		hmap.forEach((k, v)->{System.out.println(k+" | "+v);});
		hmap.entrySet().stream().forEach(e->System.out.println(e.getKey()+"||"+e.getValue()));
		
		
		  Iterator<Entry<Integer, String>> eset= hmap.entrySet().iterator();
		  
		  while(eset.hasNext()) {
			 // System.out.println(eset.next());
			 Map.Entry<Integer, String> entry = eset.next();
			 System.out.println(entry.getKey()+"=="+entry.getValue());
		  }
		
	}
	
	public static void hashMapDemo() {
		HashMap<Integer, String> hmap = new HashMap<>();
		hmap.put(101, "Arun");
		hmap.put(102, "Ajay");
		hmap.put(103, "Jay");
		//hmap.put(101, "Vijay");
		
		System.out.println(hmap);
		System.out.println(hmap.size());
		System.out.println(hmap.isEmpty());
		System.out.println(hmap.get(104));	
		hmap.putIfAbsent(104, "Kiran");
		System.out.println(hmap);
		 System.out.println(hmap.remove(104, "Kiran"));
		 System.out.println(hmap);
		System.out.println(hmap.getOrDefault(105, "Amit"));
		System.out.println(hmap.size());
	
		
	}

}
