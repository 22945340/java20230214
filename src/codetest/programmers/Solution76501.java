package codetest.programmers;

public class Solution76501 {
	
	public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        int leng = absolutes.length;
        
       
        
        for (int i= 0 ; i< leng; i++) {
        	answer += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        return answer;
    }

}
