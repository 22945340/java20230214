package codetest.programmers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Soltion12944Test {

	@Test
	void test() {
		Soltion12944 o1 = new Soltion12944();
		assertEquals(o1.solution(new int[] {1,2,3,4}), 2.5);
		assertEquals(o1.solution(new int[] {5, 5}), 5);
	}

}
