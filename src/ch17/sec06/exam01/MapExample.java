package ch17.sec06.exam01;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student("홍길동", 85));
		studentList.add(new Student("홍길동", 92));
		studentList.add(new Student("홍길동", 87));

		// Student를 score 스트림으로 변환
		studentList.stream()
				.mapToInt(s -> s.getScore())
				.forEach(System.out::println);

		System.out.println();
		int max = studentList.stream()
				.mapToInt(Student::getScore)
				.max()
				.getAsInt();
		System.out.println(max);
		System.out.println();
		
		int min = studentList.stream()
				.mapToInt(s -> s.getScore())
				.min()
				.getAsInt();
		System.out.println(min);
		System.out.println();
				
		int sum = studentList.stream()
				.mapToInt(s -> s.getScore())
				.reduce(Integer::sum)
				.getAsInt();
		System.out.println(sum);
		System.out.println();
		
		double avg = studentList.stream()
				.mapToInt(Student::getScore)
				.average()
				.getAsDouble();
		
		System.out.println(avg);
		System.out.println("================");
		// 통계
		IntSummaryStatistics summary = studentList.stream()
				.mapToInt(Student::getScore)
				.summaryStatistics();
		
		System.out.println("최대:" + summary.getMax());
		System.out.println("최소:" + summary.getMin());
		System.out.println("합:" +  summary.getSum());
		System.out.println("평균:" + summary.getAverage());
		
		

	
				
				
				

	}

}
