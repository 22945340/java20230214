package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12939Test {

	Solution12939 o1 = new Solution12939();
	
	@Test
	void test() {
		assertEquals(o1.solution("1 2 3 4"), "1 4");
		assertEquals(o1.solution("-1 -2 -3 -4"), "-4 -1");
		assertEquals(o1.solution("-1 -1"), "-1 -1");
		
	}

}
