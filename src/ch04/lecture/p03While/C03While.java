package ch04.lecture.p03While;

public class C03While {
	public static void main(String[] args) {
		// do while
		// 코드블럭 실행 후 조건 확인
		// 조건이 true 이면 코드블럭 실행
		// 반복
		
		System.out.println("이전 명령문...");
		
		boolean con = false;
		
		do {
			System.out.println("명령문반복1");
			System.out.println("명령문반복2");
		}while(con);
		System.out.println("다음 명령문...");
	}

}
