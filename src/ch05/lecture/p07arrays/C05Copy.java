package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C05Copy {
	public static void main(String[] args) {
		int[] arr1 = { 3, 4, 5 };

		int[] arr2 = Arrays.copyOf(arr1, arr1.length);

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		arr1[0] = 30;

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		System.out.println();
		
		int[][] arr3 = {
				{ 3, 4, 5 },
				{ 9, 8, 7 }
		};
		
		int[][] arr4 = Arrays.copyOf(arr3, arr3.length);
		
		System.out.println(arr3.length);
		System.out.println(arr4.length);
		
		arr3[0][0] = 30;
		
		System.out.println(arr3[0][0]); // 30
		System.out.println(arr4[0][0]); //30
		
		System.out.println(arr3[0]); // [I@515f550a
		System.out.println(arr4[0]); // [I@515f550a
		
		System.out.println();
		
		System.out.println(arr3[1]); // [I@626b2d4a
		System.out.println(arr4[1]); // [I@626b2d4a
		
		System.out.println();
		
		System.out.println(arr3); // [[I@5e91993f
		System.out.println(arr4); // [[I@1c4af82c

		

	}

}
