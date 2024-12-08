package collections.map;

import java.util.*;

public class Map_Practice {

	public static void main(String[] args) {
		System.out.println("Hashtable");
		Map<String, String> values = new Hashtable<>();
		values.put("name", "vamsi");
		values.put("age", "20");

		// retraival of keys
		Set<String> set = values.keySet();

		for (String a : set) {
			System.out.println(a);
		}

		// retaival of values
		
		Collection<String> val=values.values();
		for(String b:val) {
			System.out.println(b);
		}
		
		//using key
		System.out.println("using keyy");
		System.out.println(values.get("name"));
		
		if (values.containsKey("name")) {
			System.out.println(" having  key ");
		}
		if (values.containsValue("vamsi")) {
			System.out.println(" having  name ");
		}
		
		
		for(String c:set) {
			if(c.contains("age")) {
				values.remove("20");
			}
			System.out.println(c+ "  >>>>>>>  "+values.get(c));
		}

		Map<String, String> value = new HashMap<>();
		Map<String, String> valu = new LinkedHashMap<>();
		Map<String, String> vala = new TreeMap<>();

	}

}
