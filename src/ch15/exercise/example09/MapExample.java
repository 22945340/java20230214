package ch15.exercise.example09;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		double avg; 

		Set<String> keys = map.keySet();
		for(String key : keys) {
			totalScore += map.get(key);
			if(maxScore <= map.get(key)) {
				maxScore = map.get(key);
				name = key;
			}
			
		}
		
		avg = (double)totalScore / map.size();
		
		System.out.println(avg);
		System.out.println(maxScore);
		System.out.println(name);
		
	}

}
