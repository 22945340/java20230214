package ch09.sec03.exam02;

public class AExample {

	public static void main(String[] args) {
		A.B b = new A.B(); // B-생성자 실행		
		System.out.println(b.field); // 1
		b.method1(); // B-method1 실행
		
		System.out.println(A.B.field2); // 2
		A.B.method2(); // B-method2 실행
		
	}
}
 