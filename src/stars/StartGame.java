package stars;

import stars.protoss.Dragoon;
import stars.protoss.Protoss;
import stars.protoss.Zealot;
import stars.terran.Tank;
import stars.zerg.Hydra;

public class StartGame {
	
	public static void move(Behavior b) {
		b.move();
	}
	
	public static void repair(Behavior b) {
		b.repair();
	}
	
	public static void attack(Behavior b1, Behavior b2) {
		b1.attack(b2);
	}
	
	public static void main(String[] args) {
		Protoss.upgrade();
		Zealot z1 = new Zealot("질럿1");
		Dragoon d1 = new Dragoon("드라군1");
		move(z1);
		repair(z1);
		attack(z1, d1);
		
		Hydra h1 = new Hydra("히드라1");
		Tank t1 = new Tank("탱크1");
		
		repair(h1);
		move(t1);
		repair(t1);
		attack(h1, t1);
	}
}
