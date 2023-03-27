package ch02.lecture.p02tytpe;

public class C12Casting {
	public static void main(String[] args) {
		// 정수끼리, 실수끼리
		// 큰타입 > 작은타입 형변환 시 강제 형변환(casting) 필요
		int i1;
		long l1;
		
		l1 = 30;
//		i1 = l1; 오류
		i1 = (int)l1;
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int)l1;
		System.out.println(l1);
		System.out.println(i1);
		
		short s1;
		byte b1;
		s1 = 200;
		b1 = (byte)s1;
		System.out.println(s1);
		System.out.println(b1);
		
		// 실수 > 정수 형변환 시 강제 형변환(casting) 필요
		double d2;
		int i2;
		
		d2 = 3.14;
		i2 = (int)d2; // 강제 형변환
		System.out.println(d2);
		System.out.println(2);
		
		
	}

}
