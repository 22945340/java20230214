package ch05.exercise;

public class Example7_withIndex {
	public static void main(String[] args) {
		int[] array = { 1, 5, 3, 8, 2 };
		int max = Integer.MIN_VALUE;
		int indexOfMax;
		
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
				indexOfMax = i;
				
			}
		}
	}

}
