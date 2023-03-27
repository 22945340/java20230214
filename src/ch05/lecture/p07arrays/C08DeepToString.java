package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C08DeepToString {
	public static void main(String[] args) {
		int[][] arr2= {
				{7,8},
				{2,3}
		};
		
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
		
	}

}
