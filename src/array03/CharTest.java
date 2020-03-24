package array03;

public class CharTest {

	public static void main(String[] args) {
		int ch = 65;
		System.out.println((char)ch); // 아스키코드
		int ch2 = 66;
		System.out.println((char)ch2); // 아스키코드
		
		String input = "A";
		char c = input.charAt(0);
		System.out.println((int)c);
		
		System.out.println((int)'A');
		System.out.println((int)'Z');
	}

}
