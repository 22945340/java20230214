package ch06.lecture.p07constructor;

public class C01Constructor {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		// instance 만들자 마자 해야하는 일 (주로 필드 초기화)
		o1.name = "son";
		o1.age = 99;
		
		MyClass01 o2 = new MyClass01();
		o2.name = "park";
		o2.age = 88;
		
		o1.descript();
		o2.descript();
		
	}
	
}
