package composite;

import lombok.Data;

// 가격 : 2000, 설명 : 감자칩
@Data
public class FrenchFried {
	private int price;
	private String desc;
	
	public FrenchFried() {
		this(2000, "감자칩");
	}

	public FrenchFried(int price, String desc) {
		this.price = price;
		this.desc = desc;
	}
	
	
	
}
