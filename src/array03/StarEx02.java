package array03;

public class StarEx02 {

	static void printStarts(int i) {
		for (int j = 0; j < 4-i; j++) {
			System.out.print("_");
		}
		for (int j = 0; j < i; j++) {
			System.out.print("*");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		printStarts(1);
		printStarts(2);
		printStarts(3);
		printStarts(4);
	}

}
