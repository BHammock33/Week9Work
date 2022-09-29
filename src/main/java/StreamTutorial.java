import java.util.ArrayList;
import java.util.List;

public class StreamTutorial {

	public static void main (String[] args) {
		
		List<Person> people = new ArrayList<>();
		populatePeopleData(people);
		
		//stream takes the List<Person> and wraps it in a stream of a list of person objects Stream<List<Person>> 
		// stream intermediary operations: filter, map, flatMap, distinct
		// stream terminal operations: forEach, Collect, Reduce
		people.stream()
			  .filter(person -> person.getSsn() > 10 )
			  .map(person -> person.getFirstName())
			  .forEach(System.out :: println);
		
		System.out.println("--------");
		
		List<Person> intermediateList = new ArrayList<>();
		List<String> intermediateList2 = new ArrayList<>();
		for (Person person : people) {
			if(person.getSsn()> 10) {
				intermediateList.add(person);
			}
		}
		for (Person person : people) {
			intermediateList2.add(person.getFirstName());
		}
		for (String firstName : intermediateList2) {
			System.out.println(firstName);
		}
	}
	
	private static void populatePeopleData(List<Person> people) {
		for (int i = 0; i < 20; i++) {
			Person person = new Person(i, "John" + (i+1), "Doe" + (i+1));
			people.add(person);
		}
	}
}
//map in a stream does not mean hash map, takes an input and transforms it to a different output 