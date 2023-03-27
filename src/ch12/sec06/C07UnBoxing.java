package ch12.sec06;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000;

		int r1 = i1 + 50000;// unboxing

		System.out.println(r1);

		Object o1 = 30000; // autoboxing, type conversion
//		int r2 = o1 + 50000; - X

		int r3 = ((Integer) o1) + 50000;
		System.out.println(r3);
		
		int r4 = ((int) o1) + 50000;
		System.out.println(r4);
	}

}
