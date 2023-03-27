package codetest.programmers;

public class Solution120894 {
	
	 public long solution(String numbers) {
	        long answer = 0;
	        
	        numbers.replace("zero","0");
	        numbers.replace("one","1");
	        numbers.replace("two","2");
	        numbers.replace("three","3");
	        numbers.replace("four","4");
	        numbers.replace("five","5");
	        numbers.replace("six","6");
	        numbers.replace("seven","7");
	        numbers.replace("eight","8");
	        numbers.replace("nine","9");
	        
	        answer = Long.parseLong(numbers);
	        
	        
	        return answer;
	    }

}
