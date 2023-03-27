package codetest.programmers;

public class Solution12916 {
	boolean solution(String s) {
        boolean answer = true;
        
        int cntP = 0;
        int cntY = 0;
        
        for (int i = 0; i< s.length();i++) {
        	switch(s.charAt(i)) {
        	case 'p':
        	case 'P':
        		cntP++;
        		break;
        	case 'y':
        	case 'Y':
        		cntY++;
        		break;
        	default:
        		break;
        	}
        }
        
        answer = (cntY == cntP);

        return answer;
    }
}
