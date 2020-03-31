package stars.zerg;

import stars.Behavior;

public abstract class Zerg implements Behavior{
	
	@Override
	public void move() {
		System.out.println("이동");
	}
	@Override
	public void repair() {
		System.out.println("자연 치료!");	
	}
	
	public static void upgrade() {
		Ultra.attack++;
		Hydra.attack++;
	}
}
