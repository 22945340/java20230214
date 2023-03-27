package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		
		// 읽을 파일 크기 : 3byte
		try (var is = new FileInputStream("output/test2.db" /*{10, 20, 30}*/)){
			byte[] data = new byte[5]; // {0,0,0,0,0}
			
			System.out.println(Arrays.toString(data)); // {0,0,0,0,0} 
			System.out.println(is.read(data));
			is.read(data);
			System.out.println(Arrays.toString(data)); // {10,20,30,0,0}
			System.out.println(is.read(data));
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
