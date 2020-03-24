package ch03;
  
public class Cal {
	static int add(int n1, int n2) {
		int result = n1 + n2;
		// System.out.println("result : "+result);
		return result; // return 가장 마지막에!!
	}

	// minus (매개변수는 int형 두개) (return은 int형)
	static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	// multi
	static int multi(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	// divide
	static int divide(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}
}
