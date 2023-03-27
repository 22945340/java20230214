package codetest.programmers;

public class Soltion12944 {
	 public double solution(int[] arr) {
	        double answer = 0;
	        
	        for (int a : arr) {
	        	answer += (double)a;
	        }
	        
	        answer /= arr.length;
	        return answer;
	    }

}
