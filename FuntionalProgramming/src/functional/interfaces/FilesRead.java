package functional.interfaces;

import java.io.IOException;
import java.util.List;
import java.util.function.Predicate;

public class FilesRead {

	public static void main(String[] args) throws IOException {
		List<String> li = List.of("If Kishore is Married Sree", "Swapna will be his maradal then Kishore says ");
		Predicate<String> condition = str -> (str.contains("Kishore")
												&& str.contains("Married") )||( str.contains("Sree")
														|| str.contains("Swapna"));
		
		boolean anyMatch = li.stream().anyMatch(condition);

		if (anyMatch) {
			System.out.println("ఆకాశంలో వరదలు\n" + "భూలోకంలో బురదలు\n" + "నువ్వే నా మరదలు");
		} else {
			System.out.println("No matching strings found.");
		}

	}

}
