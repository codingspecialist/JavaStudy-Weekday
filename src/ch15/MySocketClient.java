package ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class MySocketClient {
	
	public MySocketClient(){
		try {
			Socket socket = new Socket("localhost", 15000); // 서버소켓의 accept()함수를 호출
			// 서버쪽 소켓에 연결됨 버퍼
			BufferedWriter bw = 
					new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 키보드에 연결된 버퍼
			BufferedReader br = 
					new BufferedReader(new InputStreamReader(System.in));

			String msg = "";
			while((msg = br.readLine()) != null) {
				bw.write(msg+"\n");
				bw.flush();
			}
			bw.close();
			br.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		new MySocketClient();
	}

}
