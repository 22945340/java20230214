package ch13.lecture.p01generic;

public class C05GenericMethod {
	public static void main(String[] args) {
		MyClass05 o1 = new MyClass05();
		
		// 메소드명 앞에 타입을 쓰는 경우는 거의 없다
		o1.<String>method("java");
		o1.<Integer>method(9);
		
		o1.method("spring");
		o1.method(99);
	}

}

class MyClass05{
	
	// generic method
	public <T> void method (T t) {
		
	}
}