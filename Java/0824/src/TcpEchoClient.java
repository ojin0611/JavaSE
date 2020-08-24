import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author : KIMHEEJIN
 * @date 2020. 8. 24.
 * @objective 
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */

public class TcpEchoClient {
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	
	public TcpEchoClient() {//생성자는 멤버변수 초기화
		try {
			this.client = new Socket("211.63.89.149",8888);//Server의 IP, port
			System.out.println("Server Connection Success");
			this.br = new BufferedReader(
								new InputStreamReader(this.client.getInputStream()));
			this.pw = new PrintWriter(
								new BufferedWriter(
										new OutputStreamWriter(this.client.getOutputStream())));	
		} catch (UnknownHostException e) {
			System.out.println("Unknown Host");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
private void service() {
	Scanner scan = new Scanner(System.in);
	System.out.println("<<서버에 보내실 메시지를 입력하세요 그만하려면 enter key!!!>>");
	try {
		while(true) {
			System.out.print(">> ");
			String msg = scan.nextLine();
			if(msg.length()==0)break;
			this.pw.println(msg); this.pw.flush();
			System.out.println(this.br.readLine());
		}
		System.out.println("Server Connection Closed");
	}catch (IOException ex) {
		System.out.println(ex);
	}
}
	public static void main(String[] args) {
	TcpEchoClient tcp = new TcpEchoClient();
	tcp.service();
	}
}
