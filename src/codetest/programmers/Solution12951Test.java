package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution12951Test {
	
	Solution12951 o1 = new Solution12951();
	

	@Test
	void test() {
		assertEquals(o1.solution("3people unFollowed me"), "3people Unfollowed Me");
		assertEquals(o1.solution("for the last week"), "For The Last Week");
	}

}
