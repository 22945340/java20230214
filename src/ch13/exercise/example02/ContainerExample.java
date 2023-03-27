package ch13.exercise.example02;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String> container1 = new Container<String>();
		container1.set("홍길동");
		String str = container1.get();
		
		Container<Integer> container2 = new Container<>();
		container2.set(6);
		int value = container2.get();
		
		System.out.println(str);
		System.out.println(value);
	}
	

}
class Container<T>{
	private T name;

	public T get() {
		return name;
	}

	public void set(T name) {
		this.name = name;
	}
	
	
	
	
}
