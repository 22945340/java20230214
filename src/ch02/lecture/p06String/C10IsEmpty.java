package ch02.lecture.p06String;

public class C10IsEmpty {
	public static void main(String[] args) {
		// isEmpty
		// 빈 문자열("") 인지 확인
		// return type : boolean
		
		String str1 = "java";
		String str2 = " ";
		String str3 = "";
		
		
		System.out.println(str1.isEmpty()); // false
		System.out.println(str2.isEmpty()); // false
		System.out.println(str3.isEmpty()); // true
		
		System.out.println(str1.equals("")); // false
		System.out.println(str2.equals("")); // false
		System.out.println(str3.equals("")); // true
	}

}
