package ch15.exercise.leetcode;

import java.util.*;

public class Solution2215 {
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		
		Set<Integer> set1 = new HashSet<Integer>();
		for (int num : nums1) {
			set1.add(num);
		}
		
		Set<Integer> set2 = new HashSet<Integer>();
		for (int num : nums2) {
			set2.add(num);
		}
				
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.addAll(set1);
		list2.addAll(set2);
		
		list1.removeIf(e->set2.contains(e));
		list2.removeIf(set1::contains);
		
		
		
	
		return List.of(list1, list2);
	}
	
}
