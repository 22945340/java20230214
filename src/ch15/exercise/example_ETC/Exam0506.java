package ch15.exercise.example_ETC;

import java.util.*;

public class Exam0506 {
	public static void main(String[] args) {
		List<List<Integer>> list = List.of(
				List.of(95,86),
				List.of(83,92,96),
				List.of(78,83,93,87,88)
				);
		System.out.println(list.size());
		System.out.println(list.get(2).size());
		
		int sum = 0;
		int total = 0;
		double avg;
		
		for (List<Integer> list1 : list) {
			total += list1.size();
			for (int num : list1) {
				sum +=num;
			}
		}
		
		avg = (double)sum / total;
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);
	}
}
