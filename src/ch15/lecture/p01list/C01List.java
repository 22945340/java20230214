package ch15.lecture.p01list;

import java.util.*;

public class C01List {
	// java.util.List
	// 순서가 있는 콜렉션
	// 각 아이템(element, 원소)는 index로 접근 가능
	
	public static void main(String[] args) {
		// 새 리스트 만들기
		List<String> list = new ArrayList<String>();
//		List<String> list = new ArrayList<>();
//		var list = new ArrayList<String>();
		
		// element 추가 (add)
		list.add("java");
		list.add("css");
		list.add("spring");
		list.add("java");
		
		// element 얻기 (get)
		String e1 = list.get(0);
		String e2 = list.get(1);
		String e3 = list.get(2);
		String e4 = list.get(3);
		
		// list의 크기 (size)
		int size = list.size();
		
		// 특정 index의 element 지우기 (remove)
		// element가 삭제되면 뒤에있는 인덱스들이 한칸씩 앞으로 당겨진다
		list.remove(2);
		
		System.out.println("지운 후 크기: " + list.size());//
		System.out.println("지운 후 2번 index의 값: "+ list.get(2));
	}
}
