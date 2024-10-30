package functional.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Utilitymethods {
	public static void main(String[] args) {
		
	//	replaceAll - removeIf
		 List<String>li=List.of("Spring","Spring Boot","API","Micro services","AWS","PCF","Azure","DOCKER","Kuberneties");
		 
		 
		 List<String>li2=new ArrayList(li);
		 li2.replaceAll(str->str.toUpperCase());
		 System.out.println(li2);
		 
		 li2.removeIf(course->course.length()>5);
		 System.out.println(li2);
		 
		
	
	}
}
