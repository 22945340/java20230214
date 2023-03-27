package ch18.lecture.p03inputstream;

import java.io.*;
import java.util.*;

public class C03InputStream {
	public static void main(String[] args) {
		String name = "output/output6.txt";
		try (var is = new FileInputStream(name)){
			
			byte[] arr = new byte[5];
			
			int len1 = is.read(arr); // 5
			System.out.println(Arrays.toString(arr));
			
			int len2 = is.read(arr); // 5
			System.out.println(Arrays.toString(arr));
			
			int len3 = is.read(arr); // 2
			System.out.println(Arrays.toString(arr));
			
			int len4 = is.read(arr); // -1
			System.out.println(Arrays.toString(arr));
			
			System.out.println();
			System.out.println(len1);
			System.out.println(len2);
			System.out.println(len3);
			System.out.println(len4);
					
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

