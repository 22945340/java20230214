package ch03.lecture.p01arithmetic;

public class C07Divide {
	public static void main(String[] args) {
		// '실수'를 0으로 나누면 무한대(Infinity)
		double a = 0.0;
		double b = 3.0;

		double c = b / a;

		System.out.println(c);

		double d = -3.0;
		double e = d / a;

		System.out.println(e);

		// '실수'를 0으로 나눈 나머지 : NaN
		double f = 3.0 % 0.0; // NaN (Not A Number);.
		

		double g = f + 1.0;
		System.out.println(g);
		
		// 무한대인지 확인
		boolean isinfinite1 = Double.isInfinite(c);
		boolean isinfinite2 = Double.isInfinite(b);
				
		System.out.println(isinfinite1); // true
		System.out.println(isinfinite2); // false
		
		boolean isNan1 = Double.isNaN(f);
		boolean isNan2 = Double.isNaN(e);
		
		System.out.println(isNan1); // true
		System.out.println(isNan2); // false
		
		
		

	}

}
