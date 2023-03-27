package ch11.lecture.p04throw;

public class C04Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		System.out.println("continue....");
	}

//								    생 략 가 능
	public static void method1() throws RuntimeException{
		throw new RuntimeException();
	}
}
