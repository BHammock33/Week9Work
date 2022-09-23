import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetApplication {

	public static void main(String[] args) {

		Set<Integer> uniqueNumbers = new LinkedHashSet<>();

		uniqueNumbers.add(1);
		uniqueNumbers.add(2);
		uniqueNumbers.add(3);
		uniqueNumbers.add(4);
		uniqueNumbers.add(5);
		uniqueNumbers.add(6);
		uniqueNumbers.add(1);

		printSetToConsole(uniqueNumbers);

		Set<String> uniqueNames = new HashSet<>();
		uniqueNames.add("Bennett");
		uniqueNames.add("Trevor Page");
		uniqueNames.add("Josh Someone");
		uniqueNames.add("Jane Doe");

		for (String element : uniqueNames) {
			System.out.println(element);
		}
		
		
	}

	private static void printSetToConsole(Set<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
		System.out.println("--------");
	}
}
// hash set is easy to add and remove but doesn't take order
// linked list is easy to add, harder to remove/retrieve 
// array list is easiest to remove/retrieve from