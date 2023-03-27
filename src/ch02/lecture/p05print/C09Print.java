package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		// width 출력할 떄 차지할 문자칸 수
		System.out.printf("%d%n",300);
		System.out.printf("%5d%n",300);
		System.out.printf("%6d%n",300);
		System.out.printf("%6d%n",3000000);
		
		System.out.printf("%6s%n", "Hi");
		System.out.printf("%6s%n", "hello World");
		
		int age = 33;
		String name = "son";
		
		System.out.printf("나이는 %2$3d이고, 이름은 %1$10s입니다.",name, age);
		
	}

}
