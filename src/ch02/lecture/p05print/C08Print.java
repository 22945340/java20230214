package ch02.lecture.p05print;

import java.util.Scanner;

public class C08Print {
	public static void main(String[] args) {
		// 백준 11021번
//		String input = """
//				5
//				1 1
//				2 3
//				3 4
//				9 8
//				5 2	""";
//		Scanner scanner = new Scanner(input);
		Scanner scanner = new Scanner(System.in);
		int loop = scanner.nextInt();

		System.out.println();
		for (int i = 1; i <= loop; i++) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			System.out.printf("Case #%2$d: %1$d%n",num1+num2, i);
		}

	}

}
