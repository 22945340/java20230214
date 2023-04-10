package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12925Test {

	@Test
	void test() {
		Solution12925 o1 = new Solution12925();
		
		assertEquals(o1.solution("1234"), 1234);
		assertEquals(o1.solution("-1234"), -1234);
		assertEquals(o1.solution("+1234"), 1234);
		
	}

}
