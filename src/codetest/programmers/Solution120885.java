package codetest.programmers;

public class Solution120885 {

	public String solution(String bin1, String bin2) {
		String answer = "";
		int result = twoToTen(bin1) +twoToTen(bin2);
		
		int num = 1;
		int cnt = 0;
		
		while (num >= result) {
			num *= 2;
			cnt++;
		}
		
		if (num==result) {
			answer+="1";
			for (int i = 1; i < cnt; i++) {
				answer+="0";
			}
		}
		
		
		return answer;
	}

	public int twoToTen(String two) {
		int num = 0;
		int cnt = 1;
		for (int i = two.length() - 1; i >= 0; i--) {
			if (two.charAt(i) == '1') {
				num += cnt;
			}
			cnt *= 2;
		}
		return num;

	}
}
