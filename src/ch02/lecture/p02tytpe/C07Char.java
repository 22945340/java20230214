package ch02.lecture.p02tytpe;

public class C07Char {
	public static void main(String[] args) {
		//char (문자) - 2byte (16bits)
		// 하나의 문자값 저장
		// 0 ~ 65535
		
		char chr;
		chr = 65261;
		System.out.println(chr);
		
		char chr2 = 8594;
		System.out.println(chr2);
		
		char chr3 = '\u53F8';
		System.out.println(chr3);
		
		char chr4 = 'a';
		System.out.println(chr4);
		
		char chr5 = '가';
		System.out.println(chr5);
		
//		char chr6 = 'ab'; 하나의 문자만 가능
//		char chr7 = ''; 하나의 문자만 가능
		
		char chr8 = 'b';
		
		int d = chr8 - chr4;
		System.out.println(d);
		
		
	}
}
