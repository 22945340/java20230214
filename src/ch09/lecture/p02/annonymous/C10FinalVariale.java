package ch09.lecture.p02.annonymous;

public class C10FinalVariale {
	
	int j;
	
	public void method1 () {
		int i = 3; // effectively final
		 j =99; // OK
		 j = 100; // OK
		 class LocalClass{
			 void method2() {
				 System.out.println(i);
				 System.out.println(j);
			 }
		 }
	}

}
