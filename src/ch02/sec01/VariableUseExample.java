package ch02.sec01;

public class VariableUseExample {
	public static void main(String[] args) {
		// 코드 수정 힌트 얻기 : Ctrl + 1
		// 줄 자동 맞춤 : Ctrl + Shift + f

		int myHour = 3;
		int min = 5;
		System.out.println(myHour + "시간 " + min + "분");

		int totalMinute = (myHour * 60) + min;
		System.out.println("총 " + totalMinute + "분");
	}
}
