package chat;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// CTRL + SHIFT + O
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class MySocketServer {
	
	ServerSocket serverSocket;
	Vector<NewSocketThread> vt;
	
	public MySocketServer() throws Exception {
		vt = new Vector<>();
		serverSocket = new ServerSocket(3000);
		
		while(true) {
			Socket socket = serverSocket.accept();
			System.out.println("요청이 들어옴");
			NewSocketThread nt = new NewSocketThread(socket);
			Thread newWorker = new Thread(nt);
			newWorker.start();
			vt.add(nt);
		}
	}
	
	// 새로운 쓰레드에게 버퍼를 연결할 수 있게 socket을 전달!!
	class NewSocketThread implements Runnable {
		
		Socket socket;
		BufferedReader br;
		BufferedWriter bw;
		
		public NewSocketThread(Socket socket) {
			this.socket = socket;
		}
		
		@Override
		public void run() {
			try {
				br = 
				new BufferedReader(new InputStreamReader(socket.getInputStream()));
				bw = 
				new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String msg = "";
				while((msg = br.readLine()) != null) {
					for (NewSocketThread newSocketThread : vt) {
						newSocketThread.bw.write(msg+"\n");
						newSocketThread.bw.flush();
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
