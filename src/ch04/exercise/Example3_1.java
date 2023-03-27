package ch04.exercise;

public class Example3_1 {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum += i;
			}			
		}
		System.out.println("1~100까지 3의 배수 합 : " + sum);
	}
}
