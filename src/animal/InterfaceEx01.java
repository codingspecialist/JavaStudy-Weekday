package animal;

// 1. 변수 : public static final 생략
// 2. 함수 : public abstract 생략
// 3. 통로의 역할 - 동적바인딩
// 4. 무조건 추상메서드만 존재가능 = 강제성부여
// 5. new 할 수 없다.
interface Cal {
	public static final int num = 10;
}

public class InterfaceEx01 {

	public static void main(String[] args) {
		System.out.println(Cal.num);
	}

}
