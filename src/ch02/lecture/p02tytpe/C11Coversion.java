package ch02.lecture.p02tytpe;

public class C11Coversion {
	public static void main(String[] args) {
		int i1;		// 4bytes
		long l1; 	// 8bytes
		
		i1 = 100;
		l1 = i1;	// 문제 없음
		
		float f1;	// 4bytes
		double d1; 	// 8bytes
		
		
		f1 = 3.14F;
		d1 = f1;	// 문제 없음
		
		// 정수 타입간에 작은 타입 > 큰타입 : 자동 형변환
		// 정수에서 실수로 변환 : 자동 형변환
		
		int i2; // 4bytes
		double d2;  //8bytes
		
		i2 = 999999;
		d2 = i2;	// 정수에서 실수로 자동 형변환
		
		long l2; // 8bytes
		l2 = 999999999999L;
		d2 = l2; // 정수에서 실수로 자동 형변환
		
		System.out.println(d2);
		
		float f2; // 4bytes
		f2 = l2;  // 정수에서 실수로 자동 형변환
		System.out.println(f2);
		
		// 문자(char)에서 정수(int, long)으로 자동 형변환
		char c3 = '가'; // 2bytes
		int i3 = c3; // 자동 형변환 (2bytes > 4bytes)
		long l3 = c3; // 자동 형변환 (2bytes > 8bytes)
		
		
	}

}
