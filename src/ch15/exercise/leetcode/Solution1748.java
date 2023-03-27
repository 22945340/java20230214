package ch15.exercise.leetcode;

import java.util.*;

public class Solution1748 {
	public int sumOfUnique(int[] nums) {
		int answer = 0;

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {
			if (map.containsKey(num)) {
				int oldValue = map.get(num);
				map.put(num, oldValue + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				answer += entry.getKey();
			}
		}

		return answer;
	}
}
