package ch09.lecture.p02.annonymous;

public class C04Anonymous {
	public static void main(String[] args) {
		class SubClass04 extends MyClass04 {
			@Override
			void method1() {
				// TODO Auto-generated method stub

			}
		}

		MyClass04 o1 = new SubClass04();
		o1.method1();

	}

}

abstract class MyClass04 {
	abstract void method1();
}