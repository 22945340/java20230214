package test;

import java.util.Scanner;

public class test7 {
	public static void main(String[] args) { // 백준 1152
		Scanner scanner = new Scanner(System.in);
		
		String str = scanner.nextLine();
		
		if (str.charAt(0)==' ') {
			str = str.substring(1,str.length());
		}
		
		int num;
		
		num = str.split(" ").length;
		
		System.out.println(num);
	}

}
