package ch17.exercise.exam06;

import java.util.*;
import java.util.stream.*;

public class Example {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(
				new Member("홍길동", 30),
				new Member("신용권", 40),
				new Member("감자바", 26)
				);
		
//		int sum = 0;
//		for (Member member : list) sum+= member.getAge();
//		double avg = (double) sum / list.size();
		
//		double avg = list.stream()
//				.mapToDouble(Member::getAge)
//				.average()
//				.getAsDouble();

		Double avg = list.stream()
				.collect(Collectors.averagingDouble(Member::getAge));
		
		System.out.println("평균나이: " + avg );
				
		
	}

}
