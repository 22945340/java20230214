package ch15.lecture.p03set;

import java.util.*;

public class C01Set {
	public static void main(String[] args) {
		// set : 순서 없음, 중복 불가
		Set<Integer> set = new HashSet<>();
		
		// add - element 추가
		set.add(30);
		set.add(90);
		set.add(3);
		set.add(7);
		set.add(90); // 중복으로 추가 안됨
		
		// size - 크기
		int size = set.size();
		System.out.println(size);
		System.out.println(set);
		System.out.println();
		
		// remove - 삭제
		set.remove(3);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println();
		
		// 전체 탐색
		System.out.println("향상된 for문##################");
		for (int e : set) {
			System.out.println(e);
		}
		System.out.println();
		
		System.out.println("Interator $$$$$$$$$$$$$$$");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();

		System.out.println("forEach %%%%%%%%%%%%%%%");
		set.forEach(e -> System.out.println(e));
		System.out.println();
		
		System.out.println("forEach************");
		set.forEach(System.out::println);
	}

}
