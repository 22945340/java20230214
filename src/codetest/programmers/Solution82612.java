package codetest.programmers;

public class Solution82612 {
	
	public long solution(int price, int money, int count) {
        long answer = -1;
        long totalMoney = 0;
        
        for (int i = 1; i <= count; i++) {
        	totalMoney += (long)(price * i);
        }
        answer = (totalMoney <= money) ? (long)0 : (long)(totalMoney - money);
        
        return answer;
    }

}
