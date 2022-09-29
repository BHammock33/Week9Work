import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SteamApplication {

	public static void main(String[] args) {

		// example3();
		example2();
		// example1();
	}

	private static void example3() {
		List<List<Integer>> listOfNumbersList = new ArrayList<>();

		listOfNumbersList.add(Arrays.asList(1, 2, 3));
		listOfNumbersList.add(Arrays.asList(2, 3, 4));
		listOfNumbersList.add(Arrays.asList(3, 4, 5));
		listOfNumbersList.add(Arrays.asList(5, 6, 7));
		listOfNumbersList.add(Arrays.asList(6, 7, 8));

		long integerCount = listOfNumbersList.stream().flatMap(x -> x.stream()).count();

		System.out.println(integerCount);

		long sum = listOfNumbersList.stream().flatMap(x -> x.stream()).mapToInt(x -> x.intValue()).sum();
		System.out.println(sum);
	}

	private static void example2() {
		List<Car> cars = new ArrayList<>();

		cars.add(new Car("Tesla", "Model S", 2019));
		cars.add(new Car("Tesla", "Model S", 2018));
		cars.add(new Car("Tesla", "Model X", 2016));
		cars.add(new Car("Tesla", "Model 3", 2019));
		cars.add(new Car("Ford", "Maverick", 2021));
		cars.add(new Car("Toyota", "Corrolla", 1997));
		cars.add(new Car("Toyota", "Camery", 2008));
		cars.add(new Car("Lambourghini", "Adventador", 2022));

		Map<String, List<Car>> groupedByBrand = cars.stream().collect(Collectors.groupingBy((car) -> car.getBrand()));

		System.out.println(groupedByBrand);
		System.out.println("----------");

		Set<Entry<String, List<Car>>> entrySet = groupedByBrand.entrySet();

		System.out.println(entrySet);
		System.out.println("-------");

		entrySet.stream().forEach((entry) -> {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		});

		System.out.println("--------");
		cars.stream().collect(Collectors.groupingBy((car) -> car.getBrand()));

		List<String> models = cars.stream().map(car -> car.getModel()).collect(Collectors.toList());

		String brands = cars.stream().map(car -> car.getBrand()).distinct().filter(brand -> brand.startsWith("T"))
				.collect(Collectors.joining(", "));

		models.stream().forEach(model -> System.out.println(model));

		System.out.println("----------");

		System.out.println(brands);
	}

	private static void example1() {
		List<String> names = new ArrayList<>();

		populateNames(names);

//		for(String name : names) {
//			System.out.println(name);
//		}

		names.stream().forEach(name -> System.out.println(name));
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
//stream a hashmap by getting its entry set first 