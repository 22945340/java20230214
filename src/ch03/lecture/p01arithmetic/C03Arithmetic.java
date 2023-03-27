package ch03.lecture.p01arithmetic;

import java.util.Scanner;

public class C03Arithmetic {
	public static void main(String[] args) {
		// 백준 2588
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		int result1 = num1 * (num2 % 10);
		int result2 = num1 * (num2 / 10 % 10);
		int result3 = num1 * (num2 / 100);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result1 + result2 * 10 + result3 * 100);

	}

}
