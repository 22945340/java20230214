package test;

import java.util.*;

public class test1 {
	public static void main(String[] args) {
		int answer = 0;

		int n = 125;

		int num = n;
		int sit = 1;
		int three = 0;
		int cnt =0;

		while (num != 0) {
			three *= 10;
			while ((num / sit) >= 3) {
				sit *= 3;
				cnt++;
			}
			three += num / sit;
			num %= sit;
			sit = 1;
			cnt--;
		}
		cnt--;

		for (int i = 0 ; i <cnt;i++) {
			three *=10;
		}
		System.out.println(three);

	}
}
