package ch02.lecture.p06String;

public class C01Equals {
	public static void main(String[] args) {
		// euqals
		// 두 문자열이 같은지 확인하는 메소드
		// return type : boolean
		
		String a = "java";
		String b = "ja";
		String c = "va";
		
		boolean res = a == (b+c);
		System.out.println(res);
		
		res = a.equals(b+c);
		System.out.println(res);
		
	}

}
