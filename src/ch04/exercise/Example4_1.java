package ch04.exercise;

public class Example4_1 {
	public static void main(String[] args) {
		int num1, num2;
		while (true) {
			num1 = (int) (Math.random() * 6 + 1);
			num2 = (int) (Math.random() * 6 + 1);
			
			System.out.printf("(%d, %d) 합 : %d\n", num1, num2, (num1+num2));
			
			if (num1 + num2 == 5) {
				break;
			}			
		}
		
	}

}
