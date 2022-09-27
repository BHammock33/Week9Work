import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListApplication {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("Trevor Page");
		names.add("Jane Doe");
		names.add("Josh Doe");
		names.add("Bennett Hammock");
		names.add("Kyle Someone");

		Collections.sort(names, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}

		});

		Collections.sort(names, (o1, o2) -> o2.compareTo(o1));

		// same as above but more verbose/detailed with added null checks
		Collections.sort(names, (String o1, String o2) -> {
			if (o2 != null && o1 != null) {
				return o2.compareTo(o1);
			} else {
				return 0;
			}

		});

		printListToConsole(names);
	}

	private static void printListToConsole(List<String> names) {
		for (String element : names) {
			System.out.println(element);
		}
		System.out.println("--------");
	}
}
