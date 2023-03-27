package ch19.lecture.p01network;

import java.io.*;
import java.net.*;
import java.util.*;

public class C05Client {
	public static void main(String[] args) {
		// ip주소
		String ip = "172.30.1.61";
		// port 번호
		int port = 50500;

		String input = "";

		try (
				Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);) {

			while (true) {

				try (Scanner scanner = new Scanner(System.in);) {
					System.out.print("서버에게 보낼 데이터 작성 > (q 입력시 종료)");
					input = scanner.nextLine();
				}

				ps.println(input);

				ps.flush();
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("클라이언트 종료");
	}

}
