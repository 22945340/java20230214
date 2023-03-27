package ch15.exercise.example_ETC;

import java.util.*;

public class Exam0509 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean run = true;

		int student = 0;
		int total = 0;
		double avg;
		int max = 0;

		List<Integer> scores = new ArrayList<>();

		while (run) {

			System.out.println("--------------------------------------------------------------");
			System.out.println("| 1.학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료 |");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택 >");

			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				// 학생수 입력
				System.out.print("학생 수 >");
				student = scanner.nextInt();
				break;

			case 2:
				// 점수입력
				for (int i = 0; i < student; i++) {
					System.out.print(i + 1 + "번 학생 점수 입력>");
					scores.add(scanner.nextInt());
				}
				break;
			case 3:
				// 점수리스트
				for (int i = 0; i < student; i++) {
					System.out.println(i + 1 + "번 학생 점수 : " + scores.get(i));
				}
				break;
			case 4:
				// 분석
				if (student != 0) {

					for (int i : scores) {
						total += i;
						max = Math.max(max, i);
					}
					avg = (double) total / (double) student;
					System.out.println("최고점수 : " + max);
					System.out.println("평균점수 : " + avg);
					break;
				} else {
					System.out.println("점수가 입력된 학생이 없습니다. ");
					break;
				}

			case 5:
				// 종료
				System.out.println("프로그램이 종료됩니다.");
				run = false;
				break;
			default:
				break;

			}
		}
	}

}
