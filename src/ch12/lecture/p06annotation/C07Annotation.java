package ch12.lecture.p06annotation;

public class C07Annotation {

}

class MyClass {
	@MyAnnotation07 (value = "hello")
	String field;
	
	@MyAnnotation07 ("greeting") // value 생략가능
	String field2;
	
	@MyAnnotation07 ("hi")
	String field3;
}

@interface MyAnnotation07 {
	String value();
}