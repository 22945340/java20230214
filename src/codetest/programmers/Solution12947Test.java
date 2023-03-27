package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12947Test {

	Solution12947 o1 = new Solution12947();
	
	@Test
	void test() {
		assertEquals(o1.solution(10),true);
		assertEquals(o1.solution(12),true);
		assertEquals(o1.solution(13),false);
		assertEquals(o1.solution(14),false);
	}

}
