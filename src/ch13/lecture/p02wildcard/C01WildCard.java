package ch13.lecture.p02wildcard;

public class C01WildCard {
	public static void main(String[] args) {
		MyClass01<Object> o1 = new MyClass01<>();
		MyClass01<String> o2 = new MyClass01<>();
		
		o1.item = new Object();
		o2.item = new String();
		
		o1.item = new String(); // O
//		o2.item = new Object(); // X
		
//		MyClass01<Object> o3 = o2; // X
//		o3.item = new Object();
	}
}

class MyClass01<T>{
	public T item;
}