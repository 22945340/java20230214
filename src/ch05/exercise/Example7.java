package ch05.exercise;

public class Example7 {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };

		int num = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (num < array[i]) {
				num = array[i];
			}
		}
		System.out.println(num);

	}

}
