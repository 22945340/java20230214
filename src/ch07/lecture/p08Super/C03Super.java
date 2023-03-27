package ch07.lecture.p08Super;

public class C03Super {

}

class Super03{
	Super03(int i){
		
	}
}
class Sub03 extends Super03 {
	Sub03(){
//		super();
		// 자동으로 삽입되는 상위 클래스 기본 생성자 호출코드는 동작하지 않음(없기 떄문에)
		// 따라서 명시척 호출 해야함
		super(3);
		
	}
}