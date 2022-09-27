import java.util.ArrayList;
import java.util.List;

public class SteamApplication {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		populateNames(names);
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		names.parallelStream()
			.forEach(name -> System.out.println(name));
	}

	private static void populateNames(List<String> names) {
		names.add("Bennett Hammock");
		names.add("Maddie Smith");
		names.add("Nahla Kirkland");
		names.add("Trevor Page");
		names.add("Deena Marshall");
		names.add("BrandyWhick Tart");
		names.add("Jimmy Johnson");
		names.add("Kyle Fergus");
		names.add("Aaragorn Arathorson");
		names.add("Gimli Gloinson");
	}

}
