package ch07.exercise.example07;

public class Parent {
	public String nation;
	
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String Nation) {
		this.nation = nation;
		System.out.println("Parent(String Nation) call");
	}

}
