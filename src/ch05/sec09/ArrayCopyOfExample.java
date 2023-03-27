package ch05.sec09;

import java.util.Arrays;

public class ArrayCopyOfExample {
	public static void main(String[] args) {
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = Arrays.copyOf(oldStrArray, oldStrArray.length);
		
		System.out.println(Arrays.toString(newStrArray));
	}

}
