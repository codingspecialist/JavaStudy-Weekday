package ch03;

// 메서드(함수)는 클래스안에 작성할 수 있다.
// 메서드(함수)는 메서드(함수)안에 작성할 수 없다.
public class MethodEx01 {

	static int add(int n1, int n2) {
		int result = n1 + n2;
		//System.out.println("result : "+result);
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
	
	public static void main(String[] args) {
		int num = MethodEx01.add(5, 3);
		System.out.println("더하기 : "+num);
		
		int num2 = MethodEx01.minus(5, 3);
		System.out.println("빼기 : "+num2);
		
		int num3 = MethodEx01.multi(5, 3);
		System.out.println("곱하기 : "+num3);
		
		int num4 = MethodEx01.divide(5, 3);
		System.out.println("나누기 : "+num4);
	}

	
}
