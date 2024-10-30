package usingcustomclasses;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
	public static void main(String[] args) {
		 List<String>li=List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties");
		 
		 String collect = li.stream()
		 			.collect(Collectors.joining(","));
		 System.out.println(collect);
		 
		// "Spring".split("")
	List<String> collect2 = li.stream()
		 			.map(c->c.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		 System.out.println(collect2);
		 
		 
		 //Higher order functions
		 
		 
		 
		 
		 
	}

}
