package ch18.sec04.exam02;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) {
		try {
			Reader reader = null;
 			reader = new FileReader("output/sec04_exam01.txt");
			while(true) {
				int data = reader.read();
				if (data == -1) break;
				System.out.println((char)data);
			}
			reader.close();
			System.out.println();
			
			reader = new FileReader("output/sec04_exam01.txt");
			char[] data = new char[3];
			while(true) {
				int num = reader.read(data);
				if(num == -1) break;
				for (int i = 0; i < num; i++) {
					System.out.println(data[i]);
				}
				System.out.println(); 
			}
			reader.close();
			System.out.println();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
