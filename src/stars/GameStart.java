package stars;

// ��ũ���÷� DarkTempler (50), ���� River (70)


class Zealot {
	final String NAME;
	int hp;
	static int attack=10;
	
	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;
	}
}

class Dragoon {
	final String NAME;
	int hp;
	static int attack=15;
	
	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	
}

public class GameStart {
	
	// ���� => ���
	static void attack(Zealot u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	static void attack(Dragoon u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	static void attack(Zealot u1, Zealot u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}
	
	static void attack(Dragoon u1, Dragoon u2) {
		u2.hp = u2.hp - u1.attack;
		System.out.println(u2.NAME+"�� ���ݴ��ϰ� �ֽ��ϴ�.");
		System.out.println(u2.NAME+"�� ü���� "+u2.hp+"�Դϴ�.");
	}

	public static void main(String[] args) {
		// ���ݷ� ���׷��̵��ϱ�
		Zealot.attack++;
		// ���� �����ϱ�
		Zealot z1 = new Zealot("1������");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2������");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1�����");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2�����");
		System.out.println(Dragoon.attack);
		
		//�����ϱ�
		attack(z1, d1);
		attack(z1, d1);
		
		attack(d1, z1);
		attack(z1, z2);
		attack(d1, d2);
	}

}


