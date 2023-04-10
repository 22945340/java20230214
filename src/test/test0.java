package test;

import java.util.*;

public class test0 { // 12941
	public static void main(String[] args) {
		int n = 15;
		int answer = 0;

		for (int i = 1; i < n; i++) {
			int num = 0;
			int cnt = 0;
			while (num < n) {
				num = num + i + cnt;
				cnt++;				
			}
			if (num == n) {
				answer++;
				for (int j = i; j <= j+cnt; j++) {
					System.out.print(j+" ");
				}
				
				
			}
		}

		System.out.println(answer);
	}

}
