package ch06.sec06.exam01;

public class CarExample {
	public static void main(String[] args) {
		// Car 객체 생성
		
		Car myCar = new Car();

		// 객체의 필드값 읽기

		System.out.println("모델명 : " + myCar.model);
		System.out.println("시동 여부 : " + myCar.start);
		System.out.println("현재속도 : " + myCar.speed);
		System.out.println();

		Car yourCar = new Car();
		System.out.println("모델명 : " + yourCar.model);
		System.out.println("시동 여부 : " + yourCar.start);
		System.out.println("현재속도 : " + yourCar.speed);
		System.out.println();
		
		myCar.speed =100;
		System.out.println(myCar.speed); // 100
		System.out.println(yourCar.speed); // 0
		System.out.println();
		
		Car hisCar = yourCar;
		yourCar.speed = 50;
		System.out.println(yourCar.speed); // 50
		System.out.println(hisCar.speed); // 50
		
		System.out.println(System.identityHashCode(myCar));
		System.out.println(System.identityHashCode(yourCar));
		System.out.println(System.identityHashCode(hisCar));
		
	}

}
