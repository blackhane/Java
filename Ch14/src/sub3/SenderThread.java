package sub3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
//발신
public class SenderThread extends Thread {

	private Socket socket;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		
		try {
			//사용자로부터 입력
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//서버로 출력
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String msg = br.readLine();
				
				//채팅종료
				if(msg.equals("bye")) {
					break;
				}
				//채팅전송
				writer.println(msg);
				writer.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
