package composite;

public class LotteriaApp {
	public static void main(String[] args) {
		// BigBurgerSet 추가요!!
		BigBurgerSet set1 = new BigBurgerSet();
		System.out.println();
		
		// Burger 추가요.
		Burger burger1 = new Burger();
		System.out.println();
		
		// 콜라 추가요.
		Coke coke1 = new Coke();
		System.out.println();
		
		// BigBurgerSet 추가요!! 버거 1000원 할인 쿠폰
		BigBurgerSet set2 = 
				new BigBurgerSet(
						new BigBurger(3000, "빅버거할인"),
						new Coke(),
						new FrenchFried()
				);
		System.out.println(set1.getBigBurger().getPrice());
		System.out.println(set2.getBigBurger().getPrice());
		System.out.println();
		
		// BigBurgerSet 추가요!! 버거 2000원 할인 쿠폰 (1)
		BigBurgerSet set3 = 
				new BigBurgerSet(
						new BigBurger(2000, "빅버거할인")
				);
		System.out.println();
		
		// 새우버거세트 추가요!! (2)
		ShrimpBurgerSet set4 = new ShrimpBurgerSet();
		System.out.println();
	}
	
}
