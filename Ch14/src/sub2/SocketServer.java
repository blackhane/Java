package sub2;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.attribute.standard.Severity;

public class SocketServer {

	public static void main(String[] args) {
	
		System.out.println("서버 실행");
		ServerSocket serverSocket = null;
		
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("127.0.0.1", 5002));
			
			while(true) {
				System.out.println("연결대기");
				Socket socket = serverSocket.accept();
				
				System.out.println("연결수락");
				
				//데이터 송신(Server -> Client)
				OutputStream os = socket.getOutputStream();
				String msg = "Hello Client";
				
				byte[] msgBytes = msg.getBytes();
				os.write(msgBytes);
				os.flush();
				
				System.out.println("데이터 송신완료");
				
				//데이터 수신(Client -> Server)
				InputStream is = socket.getInputStream();
				
				byte[] bytes = new byte[100];
				int readBytes = is.read(bytes);
				
				String result = new String(bytes, 0, readBytes, "UTF-8");
				System.out.println(result);
				
				System.out.println("데이터 수신완료");
				
				os.close();
				is.close();
				
				socket.close();
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("서버 종료");
		
	}

}
