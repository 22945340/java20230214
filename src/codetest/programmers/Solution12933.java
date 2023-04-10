package codetest.programmers;

import java.util.*;

public class Solution12933 {

	public long solution(int n) {
		long answer = 0;

		int length = String.valueOf(n).length();
		
		long[] answerArr = new long[length];
		
		for (int i = 0; i < length; i++) {
			answerArr[i] = n % 10;
			n /= 10;
		}
		
		Arrays.sort(answerArr);
		
		int cnt = 1;
		
		for (int i = 0; i < answerArr.length; i++) {
			answer = answer + answerArr[i] * cnt;
			cnt *= 10;
		}
		
		return answer;
	}

}
