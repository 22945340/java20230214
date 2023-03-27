package ch13.lecture.p02wildcard;

public class C03WildCard {
	public static void main(String[] args) {
		MyClass03<? super Number> o1 = new MyClass03<Number>();
		MyClass03<? super Number> o2 = new MyClass03<Object>();
		
//		o1.item = new Number();  됨 (추상 클래스여서 인스턴스화 못 함)
		o1.item = new Integer(0); // OK
//		o1.item = new Object();  // NO
		
		MyClass03<? extends Number> o3 = new MyClass03<Number>();
		MyClass03<? extends Number> o4 = new MyClass03<Integer>();
		MyClass03<? extends Number> o6 = new MyClass03<Double>();
		Number n1 = o4.item; // OK
		Object o5 = o4.item; // OK
//		Integer i1 = o4.item; // NO
		
		
		
		
	}

}

class MyClass03<T>{
	public T item;
}