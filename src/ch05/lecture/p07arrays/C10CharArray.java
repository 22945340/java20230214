package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C10CharArray {
	public static void main(String[] args) {
		// String의 toCharArray
		String str1 = "hello world";
		
		String[] arr1 = str1.split("");		
		System.out.println(Arrays.toString(arr1)); // 각원소는 String
		
		char[] arr2 = str1.toCharArray();
		System.out.println(Arrays.toString(arr2)); // 각 원소는 char
	} 
	

}