package test;

import java.util.*;

public class test0 { // 12941
	public static void main(String[] args) {

		int[] A = { 1, 4, 2 };
		int[] B = { 5, 4, 4 };

		
		int answer = 0;

		List<Integer> listA = new ArrayList<>();
		List<Integer> listB = new ArrayList<>();

		for (int num : A) listA.add(num);
		for (int num : B) listB.add(num);
		

		int maxA;
		int maxB;
		int minA;
		int minB;
		
		while (listA.size() != 0) {

			maxA = Collections.max(listA);
			maxB = Collections.max(listB);
			minA = Collections.min(listA);
			minB = Collections.min(listB);

			if (maxA > maxB) {
				answer += maxA * minB;
				for (int i = 0; i < listA.size();i++) if (listA.get(i) == maxA) listA.remove(i);
				for (int i = 0; i < listB.size();i++) if (listB.get(i) == minB) listB.remove(i);
				
				
			} else if (maxA < maxB) {
				answer += maxB * minA;
				for (int i = 0; i < listA.size();i++) if (listA.get(i) == minA) listA.remove(i);
				for (int i = 0; i < listB.size();i++) if (listB.get(i) == maxB) listB.remove(i);
			} else {
				if (minA < minB) {
					answer += minA * maxB;
					for (int i = 0; i < listA.size();i++) if (listA.get(i) == minA) listA.remove(i);
					for (int i = 0; i < listB.size();i++) if (listB.get(i) == maxB) listB.remove(i);
				} else {
					answer += minB * maxA;
					for (int i = 0; i < listA.size();i++) if (listA.get(i) == maxA) listA.remove(i);
					for (int i = 0; i < listB.size();i++) if (listB.get(i) == minB) listB.remove(i);
				}
			}

		}

		System.out.println(answer);
	}
}
