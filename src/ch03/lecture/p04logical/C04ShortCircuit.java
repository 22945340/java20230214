package ch03.lecture.p04logical;

public class C04ShortCircuit {
	public static void main(String[] args) {
		// ||
		// true || true : true
		// true || false : true
		// false || true : true 
		// false || false : false
		
		int x;
		x = 10;
		if ((x++ > 0) || (x++ < 100)) { // true || true
			System.out.println("실행됨1");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 0 || (x++ < 5))) { // true || false
			System.out.println("실행됨2");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) || (x++ < 200)) { // false || true
			System.out.println("실행됨3");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) || x++ < 10) { // false || false
			System.out.println("실행됨4");
		}
		System.out.println(x);
		
		System.out.println("----------");
		
		x = 10;
		if ((x++ > 0) | (x++ < 100)) { // true || true
			System.out.println("실행됨1");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 0 | (x++ < 5))) { // true || false
			System.out.println("실행됨2");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) | (x++ < 200)) { // false || true
			System.out.println("실행됨3");
		}
		System.out.println(x);

		x = 10;
		if ((x++ > 100) | x++ < 10) { // false || false
			System.out.println("실행됨4");
		}
		System.out.println(x);
	}

}
