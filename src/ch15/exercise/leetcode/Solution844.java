package ch15.exercise.leetcode;

import java.util.*;

public class Solution844 {
	public boolean backspaceCompare(String s, String t) {
		Stack<Character> stackS = new Stack<>();
		Stack<Character> stackT = new Stack<>();
		
		
		for(int i = 0; i< s.length();i++) {
			if(s.charAt(i) != '#') {
				stackS.push(s.charAt(i));
			} else {
				if(stackS.size() != 0) {
					stackS.pop();
				}
			}
		}
		
		for(int i = 0; i< t.length();i++) {
			if(t.charAt(i) != '#') {
				stackT.push(t.charAt(i));
			} else {
				if(stackT.size() !=0) {
					stackT.pop();
				}
			}
		}
		
		if (stackS.size() == stackT.size()) {
			while(stackS.size()>0) {
				if (stackS.pop() != stackT.pop()) {
					return false;
				}				
			}
			return true;
		}else return false;
		
	}
}
