package ch06.exercise.example18;

public class ShopService {
	private static ShopService shopservice = new ShopService();
	
	public static ShopService getInstance() {
		return shopservice;
	}

}
