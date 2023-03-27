package ch03.lecture.p01arithmetic;

public class C04Overflow {
	public static void main(String[] args) {
		long a = 15_0000_0000;
		long b = 17_0000_0000;
		
		System.out.println(a);
		System.out.println(b);
		
		long c = a + b;
		
		System.out.println(c);
		System.out.println();
		
//		overflow : 타ㅡ입의 최대 허용값 벗어남
		
//		int a = 15_0000_0000;
//		int b = 17_0000_0000;
//		
//		System.out.prlongln(a);
//		System.out.prlongln(b);
//		
//		int c = a + b;
//		
//		System.out.prlongln(c);
		
		long d = -15_0000_0000;
		long e = -17_0000_0000;
		
		System.out.println(d);
		System.out.println(e);
		
		long f = d + e;
		
		System.out.println(f);

	
//		int d = -15_0000_0000;
//		int e = -17_0000_0000;
//		
//		System.out.println(d);
//		System.out.println(e);
//		
//		int f = d + e;
//		
//		System.out.println(f);
//		
		
	}

}
