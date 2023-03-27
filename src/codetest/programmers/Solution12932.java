package codetest.programmers;

public class Solution12932 {
	public int[] solution(long n) {
        int[] answer = {};
        String str = String.valueOf(n);
        
        answer = new int[str.length()];
        
        for (int i = 0; i <answer.length;i++) {
        	answer[i] = (int)n %10;
        	n /= 10;
        }
                        
                        
        return answer;
    }
}
