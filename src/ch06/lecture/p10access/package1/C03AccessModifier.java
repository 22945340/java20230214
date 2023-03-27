package ch06.lecture.p10access.package1;

public class C03AccessModifier {
	public static void main(String[] args) {
		MyClass03 o1 = new MyClass03();
//		MyClass03 o2 = new MyClass03(3); // private여서 접근 불가
		MyClass03 o3 = new MyClass03("hellO"); // package private여서 접근 가능
	}

}
