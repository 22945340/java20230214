package test;

import java.util.Scanner;

public class test6 { // 백준 1110
	public static void main(String[] args) {
		while (true) {
			Scanner scanner = new Scanner(System.in);

			int firstNumber = scanner.nextInt();
			int cnt = 0;

			if (firstNumber < 0 || firstNumber >= 100) {
				System.out.println("값이 올바르지 않습니다.");

			} else {
				int nowNumber = firstNumber;
				while (true) {
					int frontNumber = nowNumber / 10;
					int backNumber = nowNumber % 10;
					int sumNumber = frontNumber + backNumber;

					frontNumber = backNumber;
					backNumber = sumNumber % 10;
					nowNumber = frontNumber * 10 + backNumber;

					++cnt;
					if (nowNumber != firstNumber) {
						System.out.printf("처음숫자 : %d\n현재숫자 : %d\n카운트 :%d\n",
								firstNumber, nowNumber, cnt);
						System.out.println("===================");
					} else {
						System.out.printf("처음숫자 : %d\n현재숫자 : %d\n카운트 :%d\n", 
								firstNumber, nowNumber, cnt);
//						System.out.println(cnt);

						break;
					}

				}

			}
		}
	}
}
