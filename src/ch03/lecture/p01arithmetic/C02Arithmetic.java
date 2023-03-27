package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C02Arithmetic {
	// 백준 1008
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		double result = num1 / num2;
		
		System.out.println(result);
	}

}
