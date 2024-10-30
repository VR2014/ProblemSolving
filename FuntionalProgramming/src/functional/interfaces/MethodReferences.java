package functional.interfaces;

import java.util.List;

public class MethodReferences {

	public static void main(String[] args) {

		List<String> li = List.of("Spring", "Spring Boot", "API", "Micro services", "AWS", "PCF", "Azure", "DOCKER",
				"Kuberneties");
		//.map(str->str.toUpperCase())
		li.stream().map(String::toUpperCase).forEach(System.out::println);
	}

}
