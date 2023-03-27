package test;

import java.util.Scanner;

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int dice1 = scanner.nextInt();
		int dice2 = scanner.nextInt();
		int dice3 = scanner.nextInt();
		
		if (dice1 == dice2 && dice2 == dice3) {
			System.out.println(10000+1000*dice1);
		} else if (dice1 == dice2) {
			System.out.println(1000+100*dice1);
		} else if (dice1 == dice3) {
			System.out.println(1000+100*dice1);
		} else if (dice2 == dice3) {
			System.out.println(1000+100*dice2);
		} else if (dice1 > dice2 && dice1 > dice3) {
			System.out.println(100*dice1);
		} else if (dice2 > dice1 && dice2 > dice3) {
			System.out.println(100*dice2);
		} else if (dice3 > dice2 && dice3 > dice1) {
			System.out.println(100*dice3);
		}
		
		
	}

}
