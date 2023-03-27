package ch14.lecture.p02Sleep;

public class C01Sleep {
	public static void main(String[] args) {
		System.out.println("메인쓰레드 실행");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인쓰레드 종료");
		
	}

}
