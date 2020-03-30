package stars;

// 다크템플러 DarkTempler (50), 리버 River (70)

abstract class Protoss {
	abstract String getName();
	abstract int getHp();
	abstract void setHp(int hp);
	abstract int getAttack();
	abstract void setAttack(int attack);
}

class Zealot extends Protoss{
	private final String NAME;
	private int hp;
	static int attack=10;
	
	public Zealot(String name) {
		this.NAME = name;
		this.hp = 100;
	}

	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}
}

class Dragoon extends Protoss {
	private final String NAME;
	private int hp;
	static int attack=15;
	
	public Dragoon(String name) {
		this.NAME = name;
		this.hp = 100;
	}
	@Override
	String getName() {
		return NAME;
	}

	@Override
	int getHp() {
		return hp;
	}

	@Override
	void setHp(int hp) {
		this.hp = hp;
	}

	@Override
	int getAttack() {
		return attack;
	}

	@Override
	void setAttack(int attack) {
		this.attack = attack;
	}
}

public class GameStart {
	
	// 질럿 => 드라군
	static void attack(Protoss u1, Protoss u2) {
		u2.setHp(u2.getHp() - u1.getAttack());
		
		System.out.println(u2.getName()+"이 공격당하고 있습니다.");
		System.out.println(u2.getName()+"의 체력은 "+u2.getHp()+"입니다.");
	}
	
	
	public static void main(String[] args) {
		// 공격력 업그레이드하기
		Zealot.attack++;
		// 질럿 생성하기
		Zealot z1 = new Zealot("1번질럿");
		System.out.println(Zealot.attack);
		
		Zealot z2 = new Zealot("2번질럿");
		System.out.println(Zealot.attack);
		
		Dragoon d1 = new Dragoon("1번드라군");
		System.out.println(Dragoon.attack);
		
		Dragoon d2 = new Dragoon("2번드라군");
		System.out.println(Dragoon.attack);
		
		//공격하기
		attack(z1, d1);
		attack(z1, d1);
		
		attack(d1, z1);
		attack(z1, z2);
		attack(d1, d2);
	}

}



