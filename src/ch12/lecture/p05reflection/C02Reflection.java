package ch12.lecture.p05reflection;

import java.lang.reflect.*;
import java.util.*;

public class C02Reflection {
	public static void main(String[] args) {
		Class class1 = String.class;
		
		// 이름 (full name)
		System.out.println(class1.getName());
		
		// 이름 (simple name)
		System.out.println(class1.getSimpleName());
		
		// 패키지
		System.out.println(class1.getPackageName());
		
		// 생성자
		Constructor[] constructors = class1.getConstructors();
		
		// 필드
		Field[] fields = class1.getFields();
		
		// 메소드
		Method[] methods = class1.getMethods();
		
	}
}
