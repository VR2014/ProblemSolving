package collections;

import java.util.*;

public class B_ArrayListPractice {

	public static void main(String[] args) {
		
	List<String> arr=new ArrayList<>();
	System.out.println("initial capacity :: "+arr.size());
	arr.add(0, "Kanchimireddy");
	arr.add("Vamsi");
	arr.add("Kishore");
	arr.add(" Reddy");
	System.out.println(arr);
	for(String value:arr) {
		if(value.contains("Kanchimireddy")) {
			arr.remove(value);
		}
	}
	
	System.out.println(arr);
	
	
	
	

	}

}
