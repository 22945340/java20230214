package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution76501Test {

	Solution76501 o1 = new Solution76501();

	@Test
	void test() {
		assertEquals(o1.solution(new int[] { 4, 7, 12 }, new boolean[] { true, false, true }), 9);
		assertEquals(o1.solution(new int[] { 1, 2, 3 }, new boolean[] { false, false, true }), 0);
	}

}
