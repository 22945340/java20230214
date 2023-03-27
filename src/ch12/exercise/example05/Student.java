package ch12.exercise.example05;

import java.util.*;

public class Student {
	
	private String StudentNum;

	public Student(String studentNum) {
		StudentNum = studentNum;
	}

	public String getStudentNum() {
		return StudentNum;
	}

	@Override
	public int hashCode() {
		return Objects.hash(StudentNum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(StudentNum, other.StudentNum);
	}

	
	

}


