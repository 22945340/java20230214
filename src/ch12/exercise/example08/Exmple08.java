package ch12.exercise.example08;

public class Exmple08 {
	public static void main(String[] args) {
		long startTime, endTime;
		startTime = System.nanoTime();
		int[] scores = new int[1000];
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for (int score : scores) {
			sum+= score;
		}
		
		double avg = sum /scores.length;
		System.out.println(avg);
		endTime = System.nanoTime();
		System.out.println(endTime - startTime);

	}
}
