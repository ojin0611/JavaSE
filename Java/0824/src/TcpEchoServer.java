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

public class TcpEchoServer {
	private ServerSocket server;
	private Socket socket;
	private BufferedReader br;
	private PrintWriter pw;
	public TcpEchoServer() {
		try {
			this.server = new ServerSocket(8888);
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			this.socket = this.server.accept();
			String clientAddress = this.socket.getInetAddress().getHostAddress();
			System.out.println("[" + clientAddress + "] Connection Success");
			InputStream is = this.socket.getInputStream();
			this.br = new BufferedReader(new InputStreamReader(is));
			OutputStream out = this.socket.getOutputStream();
			this.pw = new PrintWriter(new BufferedWriter(
															new OutputStreamWriter(out)));
			while(true) {
				String msg = this.br.readLine();
				System.out.println("[" + clientAddress + "] " + msg);
				String sendMsg = "[From Server] : " + msg;
				this.pw.println(sendMsg);
				this.pw.flush();
			}
		} catch (IOException e) {
			System.out.println("Client Connection was closed.");
		}
	}
	public static void main(String[] args) {
		TcpEchoServer tcp = new TcpEchoServer();
		tcp.service();
	}
}
