package com.sample.lambda;

public class LambdaMain {

	public static void main(String[] args) {
		MathCalc mathAdd = (int a, int b) -> {
			System.out.println("Add " + a + " + " + b + " : " + (a + b));
			return a + b;
		};
		mathAdd.calculate(10, 20);

		MathCalc mathSub = (a, b) -> a - b;
		System.out.println("Sub 20 - 8 : " + mathSub.calculate(20, 8));

		MathCalc mathDiv = (x, y) -> {
			return x / y;
		};
		System.out.println("Div 50/10 : " + mathDiv.calculate(50, 10));

		MathCalc mathMulti = (a, b) -> a * b;
		System.out.println("Multiply 8 * 5 : " + mathMulti.calculate(8, 5));

	}

	interface MathCalc {
		int calculate(int x, int y);
	}
}
