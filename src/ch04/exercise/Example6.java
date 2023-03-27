package ch04.exercise;

public class Example6 {
	public static void main(String[] args) {
		for (int i = 1; i <=5; i++) {
			String star = "";
			for (int j = 1; j <= i; j++) {
				star += "*";
			}
			System.out.println(star);
		}
		
		System.out.println();
		System.out.println("문제1");
		
		
		for (int i = 0; i < 5; i++) {
			String num = "";
			for (int j = 0; j <=i; j++) {
				num+= j;
			}
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("문제2");
		
		
		for (int i = 1; i <= 5; i++) {
			String num = "";
			for (int j = 1; j <=i; j++) {
				num+= j;
			}
			System.out.println(num);
		}
		
		System.out.println();
		System.out.println("문제3");
		
		
		for (int i = 0; i < 5; i++) {
			String num = "";
			for (int j = i; j >=0; j--) {
				num+= j;
			}
			System.out.println(num);
		}
		
		
	}

}
