package stars.terran;

import stars.Behavior;

public abstract class Terran implements Behavior{
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void repair() {
		System.out.println("SCV 치료");	
	}
	public static void upgrade() {
		Marine.attack++;
		Tank.attack++;
	}
}
