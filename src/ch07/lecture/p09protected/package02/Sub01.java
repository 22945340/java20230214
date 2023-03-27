package ch07.lecture.p09protected.package02;

import ch07.lecture.p09protected.package01.*;

public class Sub01 extends Super01{
	public void method2() {
		method1();
		this.method1();
		super.method1();
	}
	
	public void method3() {
		Super01 o1 = new Super01();
//		o1.method1(); - 다른 패키지여서 안됨
	}

}
