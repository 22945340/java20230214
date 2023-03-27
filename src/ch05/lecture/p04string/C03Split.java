package ch05.lecture.p04string;

import java.util.Arrays;

public class C03Split {
	public static void main(String[] args) {
		// split
		// 특정 문자 패턴으로 문자열을 나누어서 배열을 리턴
		
		String str1 = "hello, java, world, html, css";
		String[] arr1 = str1.split(",");
		System.out.println(Arrays.toString(arr1));
		
		String str2 = "spring react vue angular jsp sass";
		String[] arr2 = str2.split(" ");
		System.out.println(Arrays.toString(arr2));
		
		String str3 = "I'm ironman";
		String[] arr3 = str3.split("");
		System.out.println(Arrays.toString(arr3));
		
	} 
	

}
