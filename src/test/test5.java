package test;

import java.util.Scanner;

public class test5 { //10951
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			if (0 < num1 && num1 < 10 && 0 < num2 && num2 < 10) {
				System.out.println(num1 + num2);
			}
			else if (num1 == 0 && num2 == 0) {
				break;				
			}
			else {
				System.out.println("값이 올바르지 않습니다");
			}
		}
	}
}
