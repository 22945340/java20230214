package ch08.lecture.p04etc;

public class MyClass012 implements MyInterface01{
	@Override
	public void method1() {
		System.out.println("MyClass012 Override");
		
	}
	
	// 필요에 따라 default 메소드도 재정의 가
	@Override
	public void method2() {
		System.out.println("MyClass012에서 default 메소드 method2 재정의");
	}
}
