package ch13;

abstract class Ani {
	abstract void sound();
}

class Cat extends Ani{
	@Override
	void sound() {
		System.out.println("¾ß¿Ë");
	}
}

class Bird extends Ani{
	@Override
	void sound() {
		System.out.println("Â±Â±");
	}
}

class Fish extends Ani {
	@Override
	void sound() {
		System.out.println("»µ±Ý»µ±Ý");
	}
}

public class AnomyEx04 {

	static void start(Ani a) {
		a.sound();
	}
	
	public static void main(String[] args) {
		start(new Cat());
		start(new Fish());
		start(new Ani() {
			@Override
			void sound() {
				System.out.println("À½¸Þ");
			}
		});
	}
}
