package ch18.sec04.exam01;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) {
		try (Writer writer = new FileWriter("output/sec04_exam01.txt");){
			char a = 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			char[] arr = {'C', 'C', 'E' };
			writer.write(arr);
			
			writer.write("FGH");
			
			writer.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
