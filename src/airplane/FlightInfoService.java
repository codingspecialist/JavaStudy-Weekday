package airplane;

import java.util.HashMap;

public class FlightInfoService {
	public static HashMap<String, String> airLineId =
			new HashMap<>();
	
	public static HashMap<String, String> airPortId =
			new HashMap<>();
	
	public static void setAirLineId() {
		airLineId.put("아시아나항공", "AAR");
		airLineId.put("에어부산", "ABL");
		airLineId.put("이스타항공", "ESR");
		airLineId.put("제주항공", "JJA");
		airLineId.put("진 에어", "JNA");
		airLineId.put("대한 항공", "KAL");
		airLineId.put("티웨이항공", "TWB");
	}
	
	public static void setAirPortId() {
		airPortId.put("무안", "NAARKJB");
		airPortId.put("광주", "NAARKJJ");
		airPortId.put("군산", "NAARKJK");
		airPortId.put("여수", "NAARKJY");
		airPortId.put("원주", "NAARKNW");
		airPortId.put("양양", "NAARKNY");
		airPortId.put("제주", "NAARKPC");
		airPortId.put("김해", "NAARKPK");
		airPortId.put("사천", "NAARKPS");
		airPortId.put("울산", "NAARKPU");
		airPortId.put("인천", "NAARKSI");
		airPortId.put("김포", "NAARKSS");
		airPortId.put("포항", "NAARKTH");
		airPortId.put("대구", "NAARKTN");
		airPortId.put("청주", "NAARKTU");
	}
}
