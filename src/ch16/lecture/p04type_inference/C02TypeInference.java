package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	// 지역 변수만 가능
//	var field  = 3; - 필드 불가능
	
	public static void main(String[] args) {
		// 지역변수 타입 추론
		// var 사용
		// 선언과 동시에 초기화할 때만 사용 가능
		int a = 3;
		String b = "java";
		
		var c = 5;
		var d = "hello";
		
//		var e;
//		e = 9;
		
		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		var box3 = new Box<String>();
		
		var l1ist1 = new ArrayList<List<String>>();
		
		// 재할당 시 같은 타입만 가능
		
		var f = 10; // int로 추론
		f = 11; // OK
//		f = 3.14; // NO
		
		// var 사용 시 읽기 쉬운 코드인가
		var list2 = new ArrayList<String>();
		
		// 긴 코드...
		
		
		for (String item : list2) { // OK
		}	
		
		// 긴 코드..
		
		for (var item : list2) { // 권장하지 않음
		}
		
		
		// var는 키워드가 아님
		int var = 3; // 사용가능하지만 변수명으로 사용하지 말것
	}
}
