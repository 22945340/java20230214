package codetest.programmers;

public class Solution12912 {

	public long solution(int a, int b) {
		long answer = 0;

		long max, min;

		max = a > b ? (long) a : (long) b;
		min = a <= b ? (long) a : (long) b;
		
		for (long i = min; i <= max; i++) {
			answer += i;
		}

		return answer;
	}
}
