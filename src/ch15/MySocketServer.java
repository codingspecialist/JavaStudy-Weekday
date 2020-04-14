package ch15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MySocketServer {

	ServerSocket serverSocket;
	Socket socket;
	BufferedReader br;
	
	public MySocketServer() throws Exception {
		serverSocket = new ServerSocket(15000); // 서버 소켓 생성 (연결을 받는)
		socket = serverSocket.accept(); // 요청을 대기
		System.out.println("요청이 들어옴");
		br = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		String msg = "";
		while((msg = br.readLine()) != null) {
			System.out.println("상대방 : "+msg);
		}
		
		br.close();
		socket.close();
		serverSocket.close();
	}
	
	public static void main(String[] args) {
		try {
			new MySocketServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
