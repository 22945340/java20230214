package ch03.lecture.p03comparison;

public class C02String {
	public static void main(String[] args) {
		// 문자열 같은지 비교
		// == 사용 X, equals 메소드 사용
		
		String str1 = "java";
		String str2 = "java";
		
		boolean r1 = str1 == str2;
		System.out.println(r1);
		
		String str3 = "ja";
		String str4 = "va";
		String str5 = str3 + str4;
		
		boolean r2 = str1 == str5;
		System.out.println(r2);
		
		// equals 메소드 사용
		boolean r3 = str1.equals(str2); //true
		System.out.println(r3);
		
		boolean r4 = str1.equals(str5); // true
		System.out.println(r4);
		
		// 다른지 비교
		// != 사용 x, !equals 사용 (equals 연산결과반전)
		boolean r5 = !str1.equals(str5);
		System.out.println(r5);
	} 
	

}
