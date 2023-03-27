package codetest.programmers;

public class Solution120843 {
	public int solution(int[] numbers, int k) {
        int answer = 0;
   
		int index = numbers.length - 1;

		int cnt = 1;
		for (int i = 0; cnt <= k; i+=2) {
			switch (index - i) {
			case 0:
				answer = numbers[i];
				i = -1;
				break;
			case 1:
				answer = numbers[i];
				i = -2;
				break;
			default:
				answer = numbers[i];
				break;
			}
			
			cnt++;
		}
        return answer;
    }
}
