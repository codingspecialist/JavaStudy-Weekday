package ch13;

// OS는  Runnable 타입의 heap공간에 run메서드를 호출해야된다는 걸 이미 알고 있음.
class Sub implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println("서브 쓰레드 : "+i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadEx01 {

	// 메인 쓰레드
	public static void main(String[] args) {
		Sub s = new Sub();
		Thread t1 = new Thread(s);
		t1.start();
		
		for (int i = 1; i < 6; i++) {
			System.out.println("메인 쓰레드 : " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
