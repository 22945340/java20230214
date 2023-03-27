package ch12.exercise.ch05;

public class Exercise7 {
	public static void main(String[] args) {
		int answer = Integer.MIN_VALUE;
		int[] array = { 1, 5, 3, 8, 2 };
		
		for (int i = 0; i< array.length; i++) {
			answer = Math.max(answer, array[i]);
		}
		
		System.out.println(answer);
	}

}
