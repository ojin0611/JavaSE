import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TcpEchoClient {
	private Socket client;
	private BufferedReader br;
	private PrintWriter pw;
	
	public TcpEchoClient() {
		try {
			this.client = new Socket("211.63.89.130", 8888);     //Server의 IP/port
			System.out.println("Server Connection Success");
			this.br = new BufferedReader(
								new InputStreamReader(
										this.client.getInputStream()));
			this.pw = new PrintWriter(
								new BufferedWriter(
										new OutputStreamWriter(this.client.getOutputStream())));	
		} catch (UnknownHostException e) {
			System.out.println("Unknown Host");
		} catch (IOException e) {
			System.out.println(e);
		}   
	}
	private void service() {
		Scanner scan = new Scanner(System.in);
		System.out.println("<<서버에 보내실 메시지를 입력하세요. 그만 하시려면 그냥 Enter key를 누르세요.>>");
		try {
			while(true) {
				System.out.print(">> ");
				String msg = scan.nextLine();
				if(msg.length() == 0) break;
				this.pw.println(msg);    this.pw.flush();
				System.out.println(this.br.readLine());
			}
			System.out.println("Server Connection closed.");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		TcpEchoClient tcp = new TcpEchoClient();    tcp.service();
	}
}
