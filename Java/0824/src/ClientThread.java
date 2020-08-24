import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientThread extends Thread {
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	private InetAddress client;
	
	public ClientThread(Socket socket) throws IOException { //생성자
		this.socket = new Socket("211.63.89.157",8888);
		this.client = this.socket.getInetAddress();  //그 고객의 정보
		System.out.println("[" + this.client.getHostAddress() + "] is connected.");
		InputStream is = this.socket.getInputStream();
		this.br = new BufferedReader(new InputStreamReader(is));
		OutputStream out = this.socket.getOutputStream();
		this.pw = new PrintWriter(new BufferedWriter(
														new OutputStreamWriter(out)));
	}
	@Override
	public void run() {
		//OS가 처리하는 코드
		try {
			while(true) {
				String msg = this.br.readLine();
				System.out.println(msg);
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);
				this.pw.flush();
			}
		}catch(IOException ex) {
			System.out.println("Client connection was closed.");
		}
	}
}