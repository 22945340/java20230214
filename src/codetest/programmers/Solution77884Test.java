package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution77884Test {

	Solution77884 o1 = new Solution77884();
	
	@Test
	void test() {
		assertEquals(o1.solution(13, 17), 43);
		assertEquals(o1.solution(24, 27), 52);
	}

}
