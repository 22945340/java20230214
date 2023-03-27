package ch02.lecture.p01variable;

public class C01Variable {
	public static void main(String[] args) {
		// 변수
		// 값을 담을 수 있는 공간

		// 변수선언
		// 타입 변수명;
		int age;
		double average;

		// 변수명
		// 영문대소문자, _, $, 숫자 조합으로 작성가능, 숫자로 시작하면 안됨, _만으로 변수명 불가
		// 변수 작성 관습 : lowerCamelCase

		int $;
//		int _; -> _만으로 변수명 불가
		int your_age; // 관습에 따르지 않음
		int yourAge; // Good
		int hello;
//		int 3h; -> 숫자로 시작 불가
		int h3;
		int 나이; // 사용하지 말것

		// 변수를 여러개 선언가능
		int myAge, hisAge, herAge;

		// 같은 이름의 변수 선언 불가
		int hi;
//		int h1; // x
		
		// 변수에 값 대입(할당) : =
		hi = 3;
		int var1;
		var1 = 99;
		
		// 변수 선언과 할당 동시에 가능
		int var2 = 100;
		
		// 여러개 가능
		int var3 = 20, var4 = 30;
		
		// 값을 할당하지 않은 변수는 사용불가(=초기화 하지 않은 변수 사용 불가)
		int var5;
//		System.out.println(var5); //X
		
		// 변수명 작성 시 어떤 값을 갖는지 알아볼 수 있게
		int koreanScore; // o
		int englishScore; // o
		int ks; // X
		int es; // x


	}
}
