package com.sample.predecate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * This class demonstrate the use of Predication.
 * 
 * @author vijitha
 *
 */
public class PredicateMain {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		System.out.println("\nPrinting All");
		condition(list, n -> true);

		System.out.println("\nPrinting Even numbers");
		condition(list, n -> (n % 2 == 0));

		System.out.println("\nPrinting Odd numbers");
		condition(list, n -> (n % 2 == 1));

		System.out.println("\nPrinting numbers greater than 5");
		condition(list, n -> (n > 5));

	}

	public static void condition(List<Integer> list, Predicate<Integer> predicate) {

		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + "\t");
			}
		}
	}
}
