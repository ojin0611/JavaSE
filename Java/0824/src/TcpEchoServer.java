import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author : KIMHEEJIN
 * @date 2020. 8. 24.
 * @objective 
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */

public class TcpEchoServer {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader br; //socket�� ���� �����Ǿ� ������ �� �־� //�ѱ۶����� BufferedReader
	private PrintWriter pw;//socket�� ���� �����Ǿ� ������ �� �־� 
	public TcpEchoServer() {
		try {
			this.server = new ServerSocket(8888);
			System.out.println("Server is ready...");
		} catch (IOException e) {//TCP�� Stream�̶� IOException�߻�
			System.out.println(e);
		}
	}
	private void service() {
		try {
			this.socket = this.server.accept();
			String clientAddress = this.socket.getInetAddress().getHostAddress();
			System.out.println("["+clientAddress+"]Connection Success");
			InputStream is = this.socket.getInputStream();
			this.br = new BufferedReader(new InputStreamReader(is));
			OutputStream out = this.socket.getOutputStream();
			this.pw = new PrintWriter(new BufferedWriter(
													new OutputStreamWriter(out)));
			while(true) { //���ѷ��� ���鼭 client�� ��ٷ� while���� try�ȿ� �ִ°� ���� try���� ����� stop�ϴϱ�					
				String msg = this.br.readLine();
				System.out.println("["+clientAddress+"]"+msg);
					String sendMsg = "[From Server] : "+msg;//�ݼ��� ��
				this.pw.println(sendMsg);
				this.pw.flush();//���ѷ��� ���ϱ� flush()
			}
		}catch(IOException e) {
			System.out.println("Server Connection Closed");
		}

	}
	public static void main(String[] args) {
		TcpEchoServer tsd = new TcpEchoServer();
		tsd.service();
	}
}
