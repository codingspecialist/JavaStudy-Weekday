package array03;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 대문자 한자리를 입력하시오.");
		
		String str = sc.next(); // 1자리 문자 입력
		char ch = str.charAt(0); // char로 전환
		
		// 해당 문자 이후의 알파벳(26자리)을 출력하시오.
		for (int i = ch +1; i < 'Z'; i++) {
			System.out.print((char)i+" ");
		}
	}

}
