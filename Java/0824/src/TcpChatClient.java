import java.io.IOException;
import java.net.Socket;

//java TcpChatClient ����IP  ��ȭ��
public class TcpChatClient {
	private Socket client;
	private TcpChatThread thread;
	
	public TcpChatClient(String serverIp, String userid) {
		try {
			this.client = new Socket(serverIp, 8888);
			this.thread = new TcpChatThread(userid);
			this.thread.start();
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		String serverIP = args[0];
		String userid = args[1];  //��ȭ��
		TcpChatClient chatClient = new TcpChatClient(serverIP, userid);
	}
}
