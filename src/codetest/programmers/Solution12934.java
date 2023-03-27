package codetest.programmers;

public class Solution12934 {

    public long solution(long n) {
        long answer = 0;
        long num = 1;
        
        while (num <= n) {
        	if(n / num == num && n % num == 0) {
        		return (num+1) * (num+1);        		
        	} else {
        		num++;
        	}
        }
                
        return -1;
    }
	
}
