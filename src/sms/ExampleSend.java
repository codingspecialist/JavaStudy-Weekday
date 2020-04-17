package sms;

import java.util.HashMap;
import org.json.simple.JSONObject;
import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class ExampleSend {
  public static void main(String[] args) {
	  
    String api_key = "NCSAPMO4M9FKQ7Z7";
    String api_secret = "TSDGRGJKGIIFWSEU1XEAFUOXXE4A9HYA";
    Message coolsms = new Message(api_key, api_secret);

    // 4 params(to, from, type, text) are mandatory. must be filled
    HashMap<String, String> params = new HashMap<String, String>();
    params.put("to", "01022227460");
    params.put("from", "01022227888");
    params.put("type", "SMS");
    params.put("text", "나의 첫번째 메시지 전송 프로그램 테스트 ㅎㅎ");
    params.put("app_version", "test app 1.2"); // application name and version

    try {
      JSONObject obj = (JSONObject) coolsms.send(params);
      System.out.println(obj.toString());
    } catch (CoolsmsException e) {
      System.out.println(e.getMessage());
      System.out.println(e.getCode());
    }
  }
}