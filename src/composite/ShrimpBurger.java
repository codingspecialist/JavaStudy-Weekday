package composite;

public class ShrimpBurger extends Burger{

	public ShrimpBurger() {
		super(3000, "새우버거");
	}
	
	public ShrimpBurger(int price, String desc) {
		super(price, desc);
	}

}
