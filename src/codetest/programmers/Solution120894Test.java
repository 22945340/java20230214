package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

class Solution120894Test {

	Solution120894 o1 = new Solution120894();
	
	@Test
	void test() {
		assertEquals(o1.solution("onetwothreefourfivesixseveneightnine"), 123456789);
	}

}
