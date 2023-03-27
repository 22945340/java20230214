package codetest.programmers;

public class Solution12943 {
	public int solution(int num) {
		int answer = 0;

		long number = (long) num;
		int cnt = 0;
		boolean run = true;
		
		if (num == 1) {
			return 0;
		}

		while (true) {
			if (number % 2 == 0) {
				number /= 2;
			} else {
				number = number * 3 + 1;
			}			
			cnt++;
			
			if (number == 1) {
				return cnt;
			} else if(cnt == 500) {
				return -1;
			} else {}
			
		}
		
	}

}
