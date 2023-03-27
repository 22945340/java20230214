package ch05.lecture.p05null;

import java.util.Arrays;

public class C01Null {
	public static void main(String[] args) {
		
		int[] arr1 = new int[] { 1, 2 };
		
		System.out.println(Arrays.toString(arr1));
		arr1 = null; // 참조하는 객체 없음
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));
		
		// 참조하는 객체 없음 예외 발생 (NullPointerException)
		int len = arr1.length;
		int val = arr1[0];
		
		System.out.println("실행흐름...");

	}

}
