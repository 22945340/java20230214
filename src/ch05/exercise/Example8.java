package ch05.exercise;

public class Example8 {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};

		int total = 0;
		int cnt = 0;

		for (int i = 0; i < array.length; i++) {
			cnt += array[i].length;
			for (int j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		
		double avg = (double) total / cnt;
		
		System.out.printf("전체합 : %d\n평균 : %f\n", total, avg);
		
	}
}
