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

public class TcpEchoServer2 {
	private ServerSocket server;
	private Socket socket;
	private ClientThread thread;
	public TcpEchoServer2() {
		try {
			this.server = new ServerSocket(8888);
			System.out.println("Server is ready...");
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	private void service() {
		try {
			while(true) {
				this.socket = this.server.accept();  //고객으로부터 전화 요청 옴.
				this.thread = new ClientThread(this.socket);  //그 고객과 대화할 직원 Thread 생성
				this.thread.start();   //그 고객과 대화 시작
			}
		} catch (IOException e) {
			System.out.println("Client Connection was closed.");
		}
	}
	public static void main(String[] args) {
		TcpEchoServer2 tcp = new TcpEchoServer2();
		tcp.service();
	}
}
