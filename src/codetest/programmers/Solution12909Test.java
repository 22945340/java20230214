package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12909Test {
	
	Solution12909 o1 = new Solution12909();
	

	@Test
	void test() {
		assertEquals(o1.solution("()()"), true);
		assertEquals(o1.solution("(())()"), true);
		assertEquals(o1.solution(")()("	), false);
		assertEquals(o1.solution("(()("	), false);
	}

}
