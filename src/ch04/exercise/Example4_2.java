package ch04.exercise;

public class Example4_2 {
	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		do {
			num1 = (int)(Math.random()*6)+1;
			num2 = (int)(Math.random()*6)+1;
			if (num1+num2 == 5) {
				System.out.printf("(%d, %d)\n",num1, num2);
				break;
			}
			
		}while (num1 + num2 != 5);
		System.out.printf("%d + %d = %d\n",num1, num2, num1+num2) ;
	}

}
