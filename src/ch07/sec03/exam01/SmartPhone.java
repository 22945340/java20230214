package ch07.sec03.exam01;

public class SmartPhone extends Phone{
	
	public SmartPhone(String model, String color) {
		super(model, color);
		this.setModel(model);
		this.setColor(color);
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}

	
}
