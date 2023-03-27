package ch15.sec05.exam01;

import java.util.*;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();

		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);

		for (int s : scores) {
			System.out.print(s + " ");
		}
		System.out.println("\n");

		System.out.println("가장 낮은 점수: " + scores.first());
		System.out.println("가장 높은 점수: " + scores.last());
		System.out.println("95점 아래 점수: " + scores.lower(95));
		System.out.println("95점 위의 점수: " + scores.higher(95));
		System.out.println("95점이거나 바로 아래 점수: " + scores.floor(95));
		System.out.println("85점이거나 바로 위의 점수: " + scores.ceiling(85));
		System.out.println();
		
		// 내림차순 정렬
		NavigableSet<Integer> descendingScores = scores.descendingSet();
		for (int s : descendingScores)	System.out.print(s +" ");
		System.out.println("\n");
		
		// 범위검색
		NavigableSet<Integer> rangeSet = scores.tailSet(80, true);
		for (int s : rangeSet) System.out.print(s +" ");
		System.out.println("\n");
		
		rangeSet = scores.subSet(80, true, 90, false);
		for (int s : rangeSet) System.out.print(s +" ");
		System.out.println("\n");

		
		
		
	}

}
