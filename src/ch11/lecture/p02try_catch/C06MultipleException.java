package ch11.lecture.p02try_catch;

public class C06MultipleException {
	public static void main(String[] args) {
		try {
			int[] a = { 0, 1 };
			
			// ArithmeticExceptoin 또는 ArrayIndexOutOfBoundsException
			int c = 3 / a[0];
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

}
