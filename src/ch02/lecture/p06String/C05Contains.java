package ch02.lecture.p06String;

public class C05Contains {
	public static void main(String[] args) {
		// contains
		// 특정 문자열이 있는지 확인
		// reuturn type : boolean
		
		String str1 ="""
				동해물과 백두산이
				마르고 닳도록
				""";
				
		boolean res1 = str1.contains("해물");
		System.out.println(res1);
		
		boolean res2 = str1.contains("해산물");
		System.out.println(res2);
		
		// 없으면 -1 리턴
		String str3 = "html";
		
		System.out.println(str3.indexOf("tm")); // 1
		System.out.println(str3.indexOf("mt")); // -1
		System.out.println(str3.indexOf("Tm")); // -1
		
		
	}

}
