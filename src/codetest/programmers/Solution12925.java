package codetest.programmers;

public class Solution12925 {
	public int solution(String s) {
	        int answer = 0;
	        int length = s.length();
	        
	        int cnt = 1;
	        char num;
	        for (int i = length-1; i >= 0; i--) {
	        	num = s.charAt(i);
	        	switch(num) {
	        	case'+': break;
	        	case'-': 
	        		answer *= -1;
	        		break;
	        	default: 
	        		answer += ((int)num - 48) * cnt;
	        	}
	        	cnt *=10;
	        }
	        return answer;
    }

}
