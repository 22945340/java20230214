package ch06.lecture.p10access;

import ch06.lecture.p10access.package1.*;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
//		MyClass03 o1 = new MyClass03(6); // private이어서 접근 불가
//		MyClass03 o1 = new MyClass0("hello"); // package private 이어서 접근 불가
	}
	
}
