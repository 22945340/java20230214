package ch04.exercise;

import java.util.Scanner;

public class Example7 {
	public static void main(String[] args) {

		boolean run = true;
		int money = 0;

		Scanner scanner = new Scanner(System.in);
		while (run) {
			
			System.out.println("-----------------------------------------");
			System.out.println("| 1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료 |");
			System.out.println("-----------------------------------------");
			System.out.println("선택>");
			
			String selectMenu = scanner.nextLine();
			

			if (selectMenu.equals("1")) {
				System.out.print("예금액> ");
				money += Integer.parseInt(scanner.nextLine());

			} else if (selectMenu.equals("2")) {
				System.out.print("출금액> ");
				money -= Integer.parseInt(scanner.nextLine());
				
			} else if (selectMenu.equals("3")) {
				System.out.printf("잔고 > %d\n", money);
				
			} else if (selectMenu.equals("4")) {
				run = false;
				System.out.println("프로그램 종료");
			}
		}

	}
}
