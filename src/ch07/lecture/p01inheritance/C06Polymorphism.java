package ch07.lecture.p01inheritance;

public class C06Polymorphism {
	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		Super06 o2 = o1; // 가능
		Super06 o3 = new Sub06(); // 가능
		
		Super06 o4 = new Super06();
//		Sub06 o5 = o4; // 불가능
//		Sub06 o6 = new Super06(); // 불가능
		
	}

}
