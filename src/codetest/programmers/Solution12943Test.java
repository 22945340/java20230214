package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12943Test {

	@Test
	void test() {
		Solution12943 o1 = new Solution12943();
		assertEquals(o1.solution(6),8);
		assertEquals(o1.solution(16),4);
		assertEquals(o1.solution(626331), -1);
		
	}

}

