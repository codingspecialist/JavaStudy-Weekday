package ch13;



public class SyncEx01 {

	static int num = 10;
	
	// 2020.4.17.14.00.01
	// 2020.4.17.14.00.01.0000001
	synchronized public static void check() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num++;
	}
	
	public static void confirm() {
		System.out.println("num : "+num);
	}
	
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				check();
			}
		}).start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				check();
			}
		}).start();

	}

}
