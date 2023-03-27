package ch05.exercise;

public class Example8_EnhancedFor {
	public static void main(String[] args) {
		int[][] array = {
				{ 95, 86 },
				{ 83, 92, 96 },
				{ 78, 83, 93, 87, 88 }
		};
		
		int total = 0;
		int cnt = 0;
		
		for (int[] n : array) {
			for (int i : n) {
				total += i;
				cnt++;	
				System.out.println(n);
				System.out.println(n[0]);
			}
		}
		
		double avg = (double)(total/cnt);
		
		System.out.println("전체 합 : " + total);
		System.out.println("평균 : " + avg);
	}

}
