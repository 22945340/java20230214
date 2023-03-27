package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution86051Test {
	
	Solution86051 o1 = new Solution86051();
	

	@Test
	void test() {
		assertEquals(o1.solution(new int[] {1,2,3,4,6,7,8,0}), 14);
		assertEquals(o1.solution(new int[] {5,8,4,0,6,7,9}), 6);
		
		
	}

}
