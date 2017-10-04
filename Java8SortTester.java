package exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Java8SortTester {
	public static void main(String[] args) {
		List<String> names1 = new ArrayList<>();
		names1.add("John");
		names1.add("Paul");
		names1.add("Rick");
		names1.add("Morty");
		names1.add("Julie");
		List<String> names2 = new ArrayList<>();
		names2.add("John");
		names2.add("Paul");
		names2.add("Rick");
		names2.add("Morty");
		names2.add("Julie");
		Java8SortTester tester = new Java8SortTester();
		System.out.println("Sort using Java 7 syntax");
		tester.sortUsingJava7(names1);
		System.out.println(names1);
		System.out.println("Sort using Java 8 syntax");
		tester.sortUsingJava8(names2);
		System.out.println(names2);
	}
	// sort using Java 8
	private void sortUsingJava8(List<String> names) {
		Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
	}

	// sort using Java 7
	private void sortUsingJava7(List<String> names) {
		Collections.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.compareTo(s2);
			}
		});

	}

}
