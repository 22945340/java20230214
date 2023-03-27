package ch18.exercise;

import java.io.*;
import java.util.*;

public class exampl10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("원본 파일 경로 입력 >");
		String originPath = scanner.nextLine();
		File originFile = new File(originPath);

		System.out.print("복사할 파일 경로 입력>");
		String copyPath = scanner.nextLine();
		File copyFile = new File(copyPath);

		if (!originFile.exists()) {
			System.out.println("원본 파일 경로: " + originPath);
			System.out.println("복사 파일 경로: " + copyPath);
			System.out.println("원본 파일이 존재하지 않습니다.");
			return;
		}
		
		try (
				InputStream is = new FileInputStream(originFile);
				BufferedInputStream bis = new BufferedInputStream(is);
				InputStreamReader isr = new InputStreamReader(bis);
				
				OutputStream os = new FileOutputStream(copyFile);
				BufferedOutputStream bos = new BufferedOutputStream(os);
				OutputStreamWriter osw = new OutputStreamWriter(bos);
						
				
				) {
			if (!copyFile.exists()) {
				copyFile.mkdirs();
			}
			
			byte[] data = new byte[1024];
			int len = 0;
			while ((len = bis.read(data)) != -1) {
				bos.write(data, 0, len);
			}

			bos.flush();

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("복사완료");
	}

}
