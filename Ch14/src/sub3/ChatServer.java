package sub3;

import java.net.ServerSocket;
import java.net.Socket;

public class ChatServer {

	public static void main(String[] args) {

		System.out.println("서버 실행");
	
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9001);
			System.out.println("연결대기");
			
			socket = serverSocket.accept();
			System.out.println("연결수립");
			
			Thread t1 = new SenderThread(socket);
			Thread t2 = new ReceiverThread(socket);
			
			t1.start();
			t2.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
