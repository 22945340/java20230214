package codetest.programmers;

public class Solution12928 {
	public int solution(int n) {
		int answer = 0;

		for (int i = n; i >= 1; i--) {
			if (n % i == 0) {
				answer += i;
			}
		}
		return answer;
	}

}
