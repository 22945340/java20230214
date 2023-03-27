package ch17.sec04.exam03;

public class StringBuilderExample {
	public static void main(String[] args) {
		// StringBuilder vs String
		// StringBuilder 는 수정 가능
		// String 문자열 수정 불가

		String a = "java";
		String b = "html";

		String c = a + "hello";
		String d = b + "hello";
		
		System.out.println(c);
	}
}