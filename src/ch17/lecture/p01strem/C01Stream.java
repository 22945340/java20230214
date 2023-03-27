package ch17.lecture.p01strem;

import java.util.stream.*;

public class C01Stream {
	public static void main(String[] args) {
		// 여러 원소(element)의 순차적 처리 기능(메소드)을 제공하는 Class, Interface
		
		// 스트림 만들기
		Stream<Integer> stream1 = Stream.of(5, 1, 3, 9, 10, 0);
		
		// 스트림 메소드 (연산)
		// 1. 최종 연산(Terminal Operation) - 리턴타입 : Stream이 아님
		// 최종 연산시 중간연산도 같이 실행 됨
		
		// 개수 세기 (count)
		stream1.count();
//		stream1.findFirst(); // IllegalStateException 발생 - 최종 연산 후 재사용 불가
		
		// 2. 중간 연산 (Intermediate Operation) - 리턴 타입 : Stream
		
	}

}
