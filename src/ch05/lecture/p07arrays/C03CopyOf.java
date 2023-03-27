package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C03CopyOf {
	public static void main(String[] args) {
		int[] arr1 = { 3, 5, 9, 2, 1 };
		
		// 파라미터 : 원본 배열, 타겟 배열 길이
		
		int[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		arr1[0] = 3333;
		

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
	}

}
