package ch03.lecture.p03comparison;

public class C01Comparison {
	public static void main(String[] args) {
		// 비교연산자 ( ==, !=, <, <=, >, >= )		
		// 연산 결과는 boolean
		
		int x = 3;
		int y = 5;
		
		boolean r1 = x == y; // false
		boolean r2 = x != y; // true
		
		boolean r3 = x < y; // true
		boolean r4 = x <= y; // ture
		
		boolean r5 = x > y; // false
		boolean r6 = x >= y; // false
		
		// 같은 타입끼리 비교해야 함
		int a = 30;
		String b = "50";
		boolean c = true;

//		다른 타입 비교 불가
//		boolean r7 = a > b; 
//		boolean r8 = a < c;
		
		// 정수, 실수는 가능하지만 타입을 맞춘후 비교 권장
		int num1 = 30;
		double num2 = 30.0;
		boolean r9 = num1 == num2; // true
		System.out.println(r9);
		
		
		
	} 
	

}
