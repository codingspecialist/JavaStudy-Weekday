package ch16;

class MyManager {
	
	private static Animal animal;
	
	public static void register() {
		animal = new Animal();
	}
	
	public static Animal getConnection() {
		return animal;
	}
}

class Animal {
	public Animal() {
		System.out.println("Animal 생성자");
	}
	// new할때 
	static {
		// (1) Animal 객체 생성 
		MyManager.register();
		// (2) MyManager클래스에 Animal 객체에 대한 주소를 연결
	}
}

public class Hello {
	public static void main(String[] args) {
		try {
			Class.forName("ch16.Animal");
			Animal a = MyManager.getConnection();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
