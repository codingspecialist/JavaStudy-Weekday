package ch05;

// 추상클래스는 일반 메서드를 가질 수 있다.
// 추상클래스는 내가 구현할 수 없는 메서드를 오브젝트에게 미룰수 있다.
// 추상클래스는 abstract를 붙인다.
// 추상클래스를 통해서 순서를 정할 수 있다.
abstract class Food {
	abstract void standby();
	void eat() {
		System.out.println("음식을 먹습니다.");
	}
	abstract void cook();
	
	void auto() {
		standby();
		cook();
		eat();
	}
}

class 라면 extends Food{

	@Override 
	void cook() {
		System.out.println("냄비에 끓인다.");
	}

	@Override
	void standby() {
		System.out.println("라면과 가스와 냄비를 준비합니다.");
	}
	
}

class 삼겹살 extends Food{

	@Override
	void cook() {
		System.out.println("불판에 굽는다.");
	}

	@Override
	void standby() {
		System.out.println("불판과 고기와 버너를 준비합니다.");
	}

}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();
	}
	
	public static void main(String[] args) {
		start(new 라면());
	}

}
