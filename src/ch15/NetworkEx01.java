package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class NetworkEx01 {

	
	
	public static void main(String[] args) {
		
		try {
			// 1번 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo=1&depAirportId=NAARKJJ&arrAirportId=NAARKPC&depPlandTime=20200407&_type=json");
			
			// 2번 스트림 연결
			HttpURLConnection con = 
					(HttpURLConnection) url.openConnection();
			
			// 3번 버퍼 연결 (문자열)
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
	
			// 4. 문자 더하기
			StringBuilder sb = new StringBuilder();
			
			String input = "";
			while((input = br.readLine()) != null) {
				sb.append(input);
			}

			System.out.println(sb.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
