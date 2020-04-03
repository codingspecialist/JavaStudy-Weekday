package ch05;

// 앱 스트렉트
abstract class Animal {
	abstract String getName();
}

class Dog extends Animal{
	final String NAME = "강아지";
	
	@Override
	String getName() {
		return NAME;
	}
	
}

class Cat extends Animal {
	final String NAME = "고양이";
	
	@Override
	String getName() {
		return NAME;
	}
}

class Bird extends Animal {
	final String NAME = "새";
	
	@Override
	String getName() {
		return NAME;
	}
}

class Mouse extends Animal{
	final String NAME = "쥐";
	@Override
	String getName() {
		return NAME;
	}
}

public class AnimalEx01 {

	// d1(강아지), b1(새)
	static void attack(Animal u1, Animal u2) {
		System.out.println(u2.getName()+"가 "+u1.getName()+"에게 공격당했습니다.");
	}
	
	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		Mouse m1 = new Mouse();
		
		System.out.println(d1.NAME+" 탄생");
		System.out.println(c1.NAME+" 탄생");
		System.out.println(b1.NAME+" 탄생");	
		System.out.println(m1.NAME+" 탄생");

		// 강아지 vs 고양이
		attack(d1, c1);

	
	}

}
