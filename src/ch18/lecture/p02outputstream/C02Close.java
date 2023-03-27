package ch18.lecture.p02outputstream;

import java.io.*;

public class C02Close {
	public static void main(String[] args) {
		// finally 블럭에서 사용할 수 있게 try 블럭 밖에서 선언
		OutputStream os = null;
		
		try {
			// 스트림 열기
			os = new FileOutputStream("output/ouput.txt");
			
			// 어떤 작업
			os.write(1);
//			.....
			os.flush(); 

			// 종료
			os.close(); // 반드시 작성
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 종료 - 반드시 작성
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
