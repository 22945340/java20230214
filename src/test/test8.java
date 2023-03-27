
package test;

import java.util.Arrays;
import java.util.Scanner;

public class test8 { //백준 10798
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] res = new String[5][];

		String answer = "";
		
		for (int i = 0 ; i< 5; i++) {
			String strI = scanner.nextLine();
			res[i] = strI.split("");
			
		}
		
		int max = 0;
		for (int i = 0; i < 5; i++) {
			if (max < res[i].length) {
				max = res[i].length;
			}
		}
		
		int numberOfCharacter = max;
		
		for (int i =0; i <numberOfCharacter;i++) {
			for (int j = 0; j < 5; j++) {
				if (i < res[j].length) {
					System.out.print(res[j][i]);					
				} 
			}
		}
		
	}

}
