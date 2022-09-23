import java.util.LinkedList;
import java.util.List;

public class LinkedListApplication {

	public static void main(String[] args) {

		List<Integer> numbers = new LinkedList<>();
		//linked lists are connected by nodes
		// head = 1 --> head = 0 --> head = 0 --> head = 0
		//tail = 0 -> tail = 0--> tail = 0 ---> tail = 1
		// (10) -->   (20)-->     (30)-->        (40)
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		printListToConsole(numbers);
		
		numbers.remove(0);
		printListToConsole(numbers);
		
		numbers.remove((Integer)30);
		printListToConsole(numbers);
	}

	private static void printListToConsole(List<Integer> elements) {
		for (Integer element : elements) {
			System.out.println(element);
		}
		System.out.println("--------");
	}
}
