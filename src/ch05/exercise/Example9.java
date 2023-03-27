package ch05.exercise;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		int student = 0;
		int total = 0;
		int avg;
		int max = 0;

		int[] studentInfomation = {};

		while (run) {

			System.out.println("--------------------------------------------------------------");
			System.out.println("| 1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 |");
			System.out.println("--------------------------------------------------------------");
			System.out.println("선택 >");

			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				// 학생수 입력
				System.out.println("학생 수 >");
				student = scanner.nextInt();
				studentInfomation = new int[student];
				break;
			case 2:
				// 점수입력
				for (int i = 0; i < student; i++) {
					System.out.println(i + 1 + "번 학생 점수 입력>");
					int score = scanner.nextInt();
					studentInfomation[i] = score;
				}
				break;
			case 3:
				// 점수리스트
				for (int i = 0; i < student; i++) {
					System.out.println(i + 1 + "번 학생 점수 : " + studentInfomation[i]);
				}
				break;
			case 4:
				// 분석
				for (int i = 0; i < student; i++) {
					total += studentInfomation[i];
					if (max < studentInfomation[i]) {
						max = studentInfomation[i];
					}
				}
				if (student == 0) {
					break;
				} else {
					System.out.println("평균 : " + (float) (total / student));
					System.out.println("최고 점수 : " + max);
					break;

				}

			case 5:
				// 종료
				run = false;
				break;
			default:
				break;

			}
		}
	}

}
