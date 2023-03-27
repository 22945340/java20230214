package ch15.lecture.p01list;

import java.util.*;

public class C02List {

	public static void main(String[] args) {
		// list 전체 탐색
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("css");
		list.add("html");
		list.add("spring");
		list.add("react");

		// for
		System.out.println("for#############");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();

		// 향상된 for
		System.out.println("향상된 for @@@@@@@@@@@@@");
		for (String e : list) {
			System.out.println(e);
		}
		System.out.println();
		
		// Iterator
		System.out.println("Iterator&&&&");
		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		// forEach 메소드 - 1
		System.out.println("forEach 메소드-1 $$$$$$$$$");
		list.forEach(e -> System.out.println(e));
		System.out.println();

		// forEach 메소드 - 2
		System.out.println("forEach 메소드-2 $$$$$$$$$");
		list.forEach(System.out::println);
	}
}
