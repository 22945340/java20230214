package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		
		int tmp = y;
		y = x;		
		x = tmp;
		
		// 코드작성
		
		System.out.println(x); //5
		System.out.println(y); //3
	}

}
