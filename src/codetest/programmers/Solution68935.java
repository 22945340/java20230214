package codetest.programmers;

public class Solution68935 {

	public int solution(int n) {
        int answer = 0;
        
        int num = n;
        int sit = 3;
        int newNum = 0;
        
        
        while (num / 3 != 0) {
        	newNum += (num % sit);
        	sit *=3;
        	num = num - (num % sit);
        }
        
        
        return answer;
    }

	
	
}
