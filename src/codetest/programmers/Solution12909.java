package codetest.programmers;

public class Solution12909 {

	boolean solution(String s) {
        boolean answer = true;

        char firstChar = s.charAt(0);
        char lastChar = s.charAt(s.length()-1);
        
        int location = 0;
        
        if (firstChar != '(' || lastChar != ')') {
        	answer = false;        	
        } else {
        	for (int i = 0; i < s.length(); i++) {
        		switch(s.charAt(i)){
        			case '(' -> location++;
        			case ')' -> location--;
        		}
        		if (location < 0) {
        			return false;
        		}
        	}
        	
        	answer = location == 0;
        }
        
        
        return answer;
    }
}
