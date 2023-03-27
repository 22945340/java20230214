package codetest.programmers;

public class Solution12951 {

	public String solution(String s) {
		String answer = "";
		
		
		
		for (int i = 0; i < s.length(); i++) {
			char chr = s.charAt(i);
			switch(chr) {
			case ' ':
				if (s.charAt(i+1) > 'a' && s.charAt(i+1) < 'z') {
					s.charAt(i+1);
				}
			default : break;
			
			} 
		}
		return answer;
	}

}
