package array03;

public class StarEx02 {

	static void printStarts(int i) {
		for (int j = 0; j < 5-i; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		for (int i = 1; i < 6; i++) {
			printStarts(i);
		}
		
	}

}
