package ch02.lecture.p06String;

public class C02Length {
	public static void main(String[] args) {
		// length
		// 문자열의 길이를 확인할 때 사용하는 메소드
		// return type : int
		
		String str1 = "java";
		String str2 = "spring";
		String str3 = "hello world";
		String str4 ="""
				동해물과 백두산이 
				마르고 닳도록
				""";
		System.out.println(str1.length());
		System.out.println(str2.length());
		System.out.println(str3.length());
		System.out.println(str4.length());
	}

}
