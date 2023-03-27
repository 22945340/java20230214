package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12941Test {

	Solution12941 o1 = new Solution12941();
	
	@Test
	void test() {
		assertEquals(o1.solution(new int[] {1,4,2}, new int[] {5,4,4}), 29);
		assertEquals(o1.solution(new int[] {1,2}, new int[] {3,4}), 10);
	}

}

