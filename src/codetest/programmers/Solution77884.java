package codetest.programmers;

public class Solution77884 {
	
	public int solution(int left, int right) {
        int answer = 0;
        int cnt = 0;
        int num = 1;
        
        for (int i = left; i <= right; i++) {
        	while(num <= i) {
        		if (i %  num == 0){
        			cnt++;
        		}
        		num++;
        	}
        	
        	answer += (cnt % 2 == 0) ? i : -i;
        	
        	num = 1;
        	cnt = 0;
        }
        return answer;
    }
	
		
		
			

	
}
