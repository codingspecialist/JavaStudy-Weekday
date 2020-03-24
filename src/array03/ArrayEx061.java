package array03;

import java.util.Scanner;

public class ArrayEx061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + ""; // 숫자에 문자열을 더하면 문자열이된다(묵시적 형변환)
		String tempNum2[] = tempNum.split("");
		System.out.println(tempNum2[0]);
		System.out.println("길이 : " + tempNum2.length);
		System.out.println();

		// 자릿수 계산을 위한 변수
		int p = (tempNum2.length % 3);

		for (int i = 0; i < tempNum2.length; i++) {

			// 첫째자리 앞에 ,이 붙으면 안되니 첫 조건으로.
			if (i == 0) {
				tempNum2[i] = "" + tempNum2[i];
			}

			// i를 3으로 나눈 것이 p값과 같으면 앞에 ,을 붙임
			else if (i % 3 == p) {
				tempNum2[i] = "," + tempNum2[i];
			}

			// 자릿수 대로 출력
			System.out.print(tempNum2[i]);
		}
	}
}
