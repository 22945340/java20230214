package ch02.lecture.p06String;

public class C07Substring {
	public static void main(String[] args) {
		// substring
		// 문자열의 일부(substring)을 리턴
		// return type : String
		
		String str1 = "중국 재개방이 글로벌 인플레이션 촉발하지 않는 이유";
		// 첫번쨰 파라미터 : 시작 index(포함)
		// 두번째 파라미터 : 종료 index(포함안됨)
		// 첫번째 파라미터 <= substring < 두번째 파라미터
		
		String res1 = str1.substring(0, 2);
		System.out.println(res1);
		
		String res2 = str1.substring(3, 6);
		System.out.println(res2);
		
		String res3 = str1.substring(8, str1.length());
		System.out.println(res3);
		
		// 파라미터가 인덱스를 벗어나면 오류
		
		String str2 = "java";
		System.out.println(str2.substring(2,4));
//		System.out.println(str2.substring(2,5));
	}

}
