package ch09.lecture.p02.annonymous;

public class C09FinalVariable {
	// 로컬 클래스는 감싸고 있는 메소드의 지역변수(파라미터)를 사용할 수 있다.
	// 이 때 이 지역변수(파라미터)는 Final 이어야 한다.
	
	public static void main(String[] args) {
		class LocalClass {
			final int i = 10;
			void method1() {
				System.out.println(i);
			}
		}
	}

	public void method1() {
		int i =1; // effectively(사실상) final
		
//		i = 2; - i의 값을 재정의하면 final이 아니게되므로 오류 발생
		
		class LocalClass {
			void method2() {
				System.out.println(i);
			}
		}
	}
	
	public void method2(final int param) {
		class LocalClass{
			void method3() {
				System.out.println(param);
			}
		}
	}
	
	public void method3(int param) { //effectively final
		class LocalClass{
//			param = 3;
			void method4() {
				System.out.println(param);
			}
		}
	}
}
