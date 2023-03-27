package codetest.programmers;

public class Solution12947 {

	public boolean solution(int x) {
		
        boolean answer = true;
        
        int numA = x;
        int numB = 0;
        
        while(numA / 10 != 0) {
        	numB += (numA % 10);
        	numA /= 10;
        }
        
        numB += numA;
        
        answer = (x % numB == 0);
        
        return answer;
    }
	
}
