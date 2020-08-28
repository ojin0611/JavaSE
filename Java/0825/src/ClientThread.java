import java.awt.TextArea;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.Socket;

public class ClientThread extends Thread {
	private BufferedReader br;
	private Socket socket;
	private TextArea ta;
	
	ClientThread(Socket socket, BufferedReader br, TextArea ta){
		this.socket = socket;
		this.br = br;
		this.ta = ta;
	}
	
	@Override
	public void run(){   //수신전용
		String line = null;
		try{
			while((line = br.readLine()) != null){
				this.ta.append(line + "\r\n");
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}finally{
			try{
				if(this.socket != null) socket.close();
				System.out.println("Server connection closed.");
			}catch(IOException ex){}
		}
	}
}