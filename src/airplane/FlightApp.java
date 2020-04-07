package airplane;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class FlightApp {

	public static FlightInfo getFlightInfo(String depAirportId, String arrAirportId, Integer depPlandTime) {
		try {
			// 1번 주소 객체 만들기
			URL url = new URL("http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=TYJuOuhQd%2BPQB9hRLr96SDnMNeegd0U3g9mOpBpumr6DwZ6sgto5MjcX%2F8rUKaIKC3AHWmO4gTEHK39cCxwLug%3D%3D&numOfRows=50&pageNo=1&depAirportId="+depAirportId+"&arrAirportId="+arrAirportId+"&depPlandTime="+depPlandTime+"&_type=json");
			
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
			
			br.close(); // 버퍼 닫기
			con.disconnect(); // 스트림 닫기
			
			Gson gson = new Gson();
			FlightInfo flightInfo = gson.fromJson(sb.toString(), FlightInfo.class);
			
			return flightInfo;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public static void main(String[] args) {
		String depAirportId = "NAARKJJ";
		String arrAirportId = "NAARKPC";
		Integer depPlandTime = 20200407;
		FlightInfo flightInfo = 
				getFlightInfo(depAirportId, arrAirportId,depPlandTime);
		
		for (Item item : flightInfo.getResponse().getBody().getItems().getItem()) {
			System.out.println("항공사 : "+item.getAirlineNm());
			System.out.println("출발지 : "+item.getDepAirportNm());
			System.out.println("도착지 : "+item.getArrAirportNm());
			System.out.println("출발시간 : "+item.getDepPlandTime());
			System.out.println("도착시간 : "+item.getArrPlandTime());
			System.out.println("요금 : "+item.getEconomyCharge());
			System.out.println();
		}

	}

}
