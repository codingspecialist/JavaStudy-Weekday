package airplane;

import java.util.HashMap;
import java.util.HashSet;

public class HashEx01 {

	public static void main(String[] args) {
		HashMap<String, String> auth = 
				new HashMap<>();
		
		auth.put("아이디", "ssarmango");
		auth.put("비밀번호", "1234");
		
		System.out.println(auth.keySet());
		
		System.out.println(auth.get("아이디"));

	}

}
