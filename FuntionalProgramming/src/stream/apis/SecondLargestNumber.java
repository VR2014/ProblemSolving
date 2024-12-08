package stream.apis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.*;

public class SecondLargestNumber {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5};
		
		List<Integer> li=Arrays.stream(arr)
							.boxed()
									.collect(Collectors.toList());
		
		Collections.sort(li,Collections.reverseOrder());
		
		System.out.println(li.get(1));
		
		//
		
		
		

	}

}
