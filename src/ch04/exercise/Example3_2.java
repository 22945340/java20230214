package ch04.exercise;

public class Example3_2 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		while(i<=100) {
			if (i % 3 == 0) {
				sum += i;
				i++;
			} else {
				i++;
			}
		} 
		System.out.printf("1~100까지 3의 배수 합 : %d",sum);
	}

}
