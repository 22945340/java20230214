package ch16.sec02.exam02;


// p.700(lambda) -> p.420 (anonymous) -> p.412 (concrete class)
public class ButtonExample {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(()-> System.out.println("OK 버튼을 클릭했습니다."));
		
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() -> System.out.println("Cancel 버튼을 클릭했습니다."));
		
		btnCancel.click();
		
	}

}
