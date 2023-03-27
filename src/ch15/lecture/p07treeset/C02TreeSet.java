package ch15.lecture.p07treeset;

import java.util.*;

public class C02TreeSet {
	public static void main(String[] args) {
		NavigableSet<Integer> set = new TreeSet<>();
		set.addAll(Set.of(3,1,20,3000,15,7,9,2500,100));
		
		System.out.println(set);
		
		// first
		System.out.println(set.first());
		
		// last
		System.out.println(set.last());
		
		// lower (미만)
		System.out.println(set.lower(50));
		
		// higher (초과)
		System.out.println(set.higher(50));
		
		// floor (이하)
		System.out.println(set.floor(20));
		
		//ceiling (이상)
		System.out.println(set.ceiling(100));
		
		// 거꾸로 정렬된 NavigableSet 리턴
		NavigableSet<Integer> descendingSet = set.descendingSet();
		System.out.println(descendingSet);
		
	}

}
