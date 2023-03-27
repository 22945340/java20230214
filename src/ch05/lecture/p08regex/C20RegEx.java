package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = " al  ad al      aldlsd  sdf salkjl    asldfk";
		String str2 = str1.replaceAll("\\s+","");
		
		System.out.println(str1);
		System.out.println(str2); 
		System.out.println();
		
		String str3 = "sasadf    ,    asdfsdf,safsdf,  asdf";
		String[] str4 = str3.split("\s*,\s*");
		
		System.out.println(str3);
		System.out.println(Arrays.toString(str4));
		
	}

}
