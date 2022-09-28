import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SteamApplication {

	public static void main(String[] args) {
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "Maverick", 2021));
		cars.add(new Car("Toyota", "Corrolla", 1997));
		cars.add(new Car("Toyota", "Camery", 2008));
		cars.add(new Car("Lambourghini", "Adventador", 2022));
		
		List<String> models = cars.stream()
								  .map(car -> car.getModel())
								  .collect(Collectors.toList());
		
		Set<String> brands = cars.stream()
								  .map(car -> car.getBrand())
								  .collect(Collectors.toSet());
		
		models.stream()
			  .forEach(model -> System.out.println(model));
		
		System.out.println("----------");
		
		brands.stream()
			  .forEach(brand -> System.out.println(brand));
		
		
		//example1();
	}

	private static void example1() {
		List<String> names = new ArrayList<>();
		
		populateNames(names);
		
//		for(String name : names) {
//			System.out.println(name);
//		}
		
		names.stream()
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
