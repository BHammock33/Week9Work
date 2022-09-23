package com.coderscampus.myapp.main;

import java.util.ArrayList;
import java.util.List;

import com.coderscampus.myapp.service.MyService;

public class App {

	private MyService myService = new MyService();

	public static void main(String[] args) {
		new App().execute();
	}

	private void execute() {

		String[] names = new String[4];

		names[0] = "Tervor";
		names[1] = "Jane";
		names[2] = "John";
		names[3] = "Elon";

		names[1] = null;

		for (String name : names) {
			System.out.println(name);
		}

		// collections java solution to data structure problems
		// list is a type of collection, set is another, map as well
		System.out.println("---------");
		List<String> elements = new ArrayList<String>();
		elements.add("Bennett Hammock");
		elements.add("Maddie Hammock");
		elements.add("Simon Hammock");
		elements.add("Kyle Whitename");
		elements.add("Elon Musk");

		elements.remove(1);
		printArrayToConsole(elements);
		elements.remove("Elon Musk");
		printArrayToConsole(elements);
		
	}

	private void printArrayToConsole(List<String> elements) {
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("--------");
	}
}
