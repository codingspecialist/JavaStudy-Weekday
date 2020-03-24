package array03;

import java.util.Scanner;

/*
 * 숫자 1000000000 를 입력받고 (10억)
3자리 마다 콤마를 찍어서 출력!!
1,000,000,000
*/
public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num+"";
		String tempNum2[] = tempNum.split("");
				
		int len = tempNum2.length; // len = 4
		
		for (int i = 0; i < len; i++) { // 4번 도는 for문
			if((len-i)%3==0 && i != 0) { //4%3, 3%3, 2%3, 1%3
				System.out.print(",");
			}
			System.out.print(tempNum2[i]);
		}
	}

}
