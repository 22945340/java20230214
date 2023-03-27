package ch12.lecture.p06annotation;

public class C09Annotation {

}

class MyaClass09{
	@MyAnnotation09(val1 = "hi", val2 = {"a","b"})
	int f1;
	
	@MyAnnotation09 (val1 = "h1", val2 = {"a"})
	int f2;
	
	@MyAnnotation09 (val1 = "h1", val2 = "a") // 배열요소가 하나일때 중괄호 생략가능
	int f3;
}

@interface MyAnnotation09{
	String val1();
	String[] val2();
}