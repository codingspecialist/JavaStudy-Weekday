package coffeeshop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// 클래스 자료형 : Beans = Table(DB)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItem {
	private String name;
	private int price;
}



