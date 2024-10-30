package usingcustomclasses;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Course {
	private String name;
	private String category;
	private int reviewScore;
	private int noOfStudents;

	// Constructor
	public Course(String name, String category, int reviewScore, int noOfStudents) {
		this.name = name;
		this.category = category;
		this.reviewScore = reviewScore;
		this.noOfStudents = noOfStudents;
	}

	// Getter and Setter methods
	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getReviewScore() {
		return reviewScore;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	@Override
	public String toString() {
		return "Course{name='" + name + '\'' + ", category='" + category + '\'' + ", reviewScore=" + reviewScore
				+ ", noOfStudents=" + noOfStudents + '}';
	}
}

public class FP06CustomClass {

	public static void main(String[] args) {
		// Creating a list of courses
		List<Course> courses = List.of(new Course("Spring", "Framework", 91, 20000),
				new Course("Spring Boot", "Framework", 92, 20003), new Course("API", "Microservices", 93, 20000),
				new Course("Microservices", "Microservices", 94, 20004),
				new Course("FullStack", "FullStack", 95, 20008), new Course("AWS", "Cloud", 96, 20000),
				new Course("Azure", "Cloud", 97, 20002), new Course("Docker", "Cloud", 98, 20001),
				new Course("Kubernetes", "Cloud", 99, 20001));

		// Using Predicates to match courses based on review score
		Predicate<Course> reviewScoreGreaterThan90 = course -> course.getReviewScore() >= 90;
		Predicate<Course> reviewScoreGreaterThan95 = course -> course.getReviewScore() >= 95;

		// allMatch, noneMatch, anyMatch examples
		System.out
				.println("All courses have review score >= 90: " + courses.stream().allMatch(reviewScoreGreaterThan90));

		System.out.println("None of the courses have review score >= 99: "
				+ courses.stream().noneMatch(course -> course.getReviewScore() >= 99));

		System.out.println("Any course has review score >= 95: " + courses.stream().anyMatch(reviewScoreGreaterThan95));

		// Sorting courses based on number of students and review score
		Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents);
		Comparator<Course> comparingByNoOfStudentsDesc = comparingByNoOfStudents.thenComparing(Course::getReviewScore)
				.reversed();

		// Sorting in increasing order of students
		List<Course> sortedByStudents = compareByNoOfStudents(courses, comparingByNoOfStudents);
		System.out.println("Courses sorted by number of students (ascending): " + sortedByStudents);

		// Sorting in decreasing order of students and review score
		List<Course> sortedByStudentsDesc = compareByNoOfStudents(courses, comparingByNoOfStudentsDesc);
		System.out
				.println("Courses sorted by number of students and review score (descending): " + sortedByStudentsDesc);

		// Skip, limit, takeWhile, and dropWhile examples
		System.out.println("First 2 courses after sorting: "
				+ courses.stream().sorted(comparingByNoOfStudents).limit(2).collect(Collectors.toList()));

		System.out.println("Skipping first 2 courses: "
				+ courses.stream().sorted(comparingByNoOfStudents).skip(2).collect(Collectors.toList()));

		System.out.println("Take courses while review score > 91: "
				+ courses.stream().takeWhile(course -> course.getReviewScore() > 91).collect(Collectors.toList()));

		System.out.println("Drop courses while review score > 91: "
				+ courses.stream().dropWhile(course -> course.getReviewScore() > 91).collect(Collectors.toList()));

		// max, min, findFirst, findAny examples
		System.out.println("Course with max students: " + courses.stream().max(comparingByNoOfStudents).orElseThrow());

		System.out.println("Course with min students: " + courses.stream().min(comparingByNoOfStudents).orElseThrow());

		System.out.println("First course with review score < 90: "
				+ courses.stream().filter(course -> course.getReviewScore() < 90).findFirst()
						.orElse(new Course("SQL", "Dev", 100, 30000)));

		System.out.println("Any course with review score < 90: " + courses.stream()
				.filter(course -> course.getReviewScore() < 90).findAny().orElse(new Course("SQL", "Dev", 100, 30000)));

		// Average, sum, count, max, min for number of students with score > 95
		System.out.println("Sum of students in courses with review score > 95: "
				+ courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).sum());

		System.out.println("Average number of students in courses with review score > 95: " + courses.stream()
				.filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).average().orElse(0));

		System.out.println("Count of courses with review score > 95: "
				+ courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).count());

		System.out.println("Max number of students in courses with review score > 95: "
				+ courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).max().orElse(0));

		System.out.println("Min number of students in courses with review score > 95: "
				+ courses.stream().filter(reviewScoreGreaterThan95).mapToInt(Course::getNoOfStudents).min().orElse(0));

		// Grouping courses by category
		System.out.println(
				"Courses grouped by category: " + courses.stream().collect(Collectors.groupingBy(Course::getCategory)));

		// Counting courses in each category
		System.out.println("Number of courses in each category: "
				+ courses.stream().collect(Collectors.groupingBy(Course::getCategory, Collectors.counting())));

		// Max review score by category
		System.out.println("Max review score in each category: " + courses.stream().collect(Collectors
				.groupingBy(Course::getCategory, Collectors.maxBy(Comparator.comparing(Course::getReviewScore)))));

		// Mapping course names to category
		System.out.println("Course names grouped by category: " + courses.stream().collect(
				Collectors.groupingBy(Course::getCategory, Collectors.mapping(Course::getName, Collectors.toList()))));
	}

	// Helper method for sorting courses based on a comparator
	private static List<Course> compareByNoOfStudents(List<Course> courses, Comparator<Course> comparator) {
		return courses.stream().sorted(comparator).collect(Collectors.toList());
	}
}
