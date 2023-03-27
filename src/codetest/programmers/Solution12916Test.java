package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Solution12916Test {

	@Test
	void test() {
		Solution12916 o1 = new Solution12916();
		
		assertEquals(o1.solution("pPoooyY"), true);
		assertEquals(o1.solution("Pyy"), false);
	}

}
