package ch08.lecture.p02abstract_method;

public class C01AbstractMethod {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyInterface01 o2 = o1;
		
		MyInterface01 o3 = new MyClass01();
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		o1.method1();
		o1.method2();
		
		o2.method1();
//		o2.method2(); - X
		
		
		
		
	} 
	
}
