package ch04.lecture.p02switch;

public class C04Switch {
	public static void main(String[] args) {
		// switch labeled statement
		// break 없이 코드 블럭 작성 가능

		int val = 1;

		switch (val) {
		case 1:
			System.out.println("code 1");
			break;
		case 2:
			System.out.println("code 2");
			break;
		default:
			System.out.println("code 3");
			break;
		}

		switch (val) {
		case 1 -> System.out.println("code 1"); //명령문이 하나일 시 {} 생략가능
		
		case 2 -> {
			System.out.println("code 2");
		}
		default -> {
			System.out.println("default code");
		}
		}

		
	
	}

}
