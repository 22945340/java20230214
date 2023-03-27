package ch02.lecture.p04scanner;

import java.util.Scanner;

public class C06Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String line1 = scanner.nextLine();
		String line2 = scanner.nextLine();

		Scanner line1Scanner = new Scanner(line1);
		Scanner line2Scanner = new Scanner(line2);

		int currentHour = line1Scanner.nextInt();
		int currentMin = line1Scanner.nextInt();

		int pastMin = line2Scanner.nextInt();

		currentMin = (currentMin + pastMin) % 60;
		currentHour = (currentHour + (currentMin + pastMin) / 60) % 24;
		
		System.out.println(currentHour + " " + currentMin);

	}

}
