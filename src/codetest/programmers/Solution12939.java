package codetest.programmers;

public class Solution12939 {
	
	public String solution(String s) {
        String answer = "";
        int maxInt = Integer.MIN_VALUE;
        int minInt = Integer.MAX_VALUE;
        String max = "";
        String min = "";
        
        String[] numbers = s.split(" ");
        
        for(String num : numbers) {
        	if (Integer.parseInt(num) >= maxInt) {
        		maxInt = Integer.parseInt(num);
        		max = num;
        	}
        	if (Integer.parseInt(num) <= minInt) {
        		minInt = Integer.parseInt(num);
        		min = num;
        	}
        }
        
        answer = min +" " + max;
        
        return answer;
    }

}
