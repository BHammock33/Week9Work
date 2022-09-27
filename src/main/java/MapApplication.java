import java.util.HashMap;
import java.util.Map;

public class MapApplication {
	public static void main(String[] args) {
		//key = SSN Value = Name
		Map<Integer, String> people = new HashMap<>();
		//Create
		people.put(111111111, "Trevor Page");
		people.put(222222222, "Bennett Hammock");
		people.put(333333333, "Maddie Smith");
		people.put(444444444, "Elon Musk");
		people.put(555555555, "Josh Someone");
		//Read
		System.out.println("Invalid Key: ");
		System.out.println(people.get(123456789));
		System.out.println("Valid Key: ");
		System.out.println(people.get(444444444));
	}
}
//maps: shares the complexity of how hashed sets stores data, linked hash map maintains order unlinked does not
//hashmaps store data as Key Value pairs (K,V)
// key and value are both objects, could've done Person Object instead of string