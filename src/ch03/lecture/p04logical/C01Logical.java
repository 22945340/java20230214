package ch03.lecture.p04logical;

public class C01Logical {
	public static void main(String[] args) {
		// 논리 연산자 (%%, ||, !)
		// ^, &, |
		// 피 연산자 : boolean
		// 연산 결과 : boolean
		
		// && (and) : 두 항이 모두 true일때만 결과 true
//						나머지 결과는 false
		
		System.out.println(true && true); // true
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false
		
		// ||(or) : 두 항이 모두 false일 때만 결과 false
//					나머지 결과는 true
		System.out.println(true || true); // true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		
		
	}

}
