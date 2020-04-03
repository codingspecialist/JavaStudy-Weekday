package javastudy;

import java.util.Random;

public class CodingTestEx01 {

	static int cal(int random, int num[]) {
		int result = 0;
		result = random % num[0];
		result = result % num[4];
		for (int i = 1; i < num.length-1; i++) {
			
			result = result + num[i];
		}
		return result;
	}
	
	// 1,2,3,4,5 배열을 생성
	// 어떤 수가 들어오던지 사칙연산을 통해서 10을 만든다.
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5};
		int random = 0; // 랜덤 값
		int result = 0; // 사칙연산의 결과
		
		Random r = new Random();
		random = r.nextInt(100)+1;
		
		System.out.println("random값은 "+random);
		result = cal(random, num);

		System.out.println("result 결과는 "+result);
	}

}
