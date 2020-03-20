package ch01;

import java.util.Scanner;

public class ConEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean check = sc.nextBoolean();
		
		if (check) { // boolean 1bit 경우의 수 2가지, true, false
			System.out.println("참입니다.");
		} else {
			System.out.println("거짓입니다.");
		}

	}

}
