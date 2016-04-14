package com.sample.methodref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodRef {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Dc Shivago");
		names.add("Nagul");
		names.add("Domenic");
		names.add("Peter");

		names.forEach(System.out::println);
		
		Car car = Car.create( Car::new );
		List< Car > cars = Arrays.asList( car );
		
		cars.forEach(Car::collide);
		cars.forEach(Car::repair);

	}

	public static class Car {

		public static Car create(final Supplier<Car> supplier) {

			return supplier.get();

		}

		public static void collide(final Car car) {

			System.out.println("Collided " + car.toString());

		}

		public void follow(final Car another) {

			System.out.println("Following the " + another.toString());

		}

		public void repair() {

			System.out.println("Repaired " + this.toString());

		}

	}
}
