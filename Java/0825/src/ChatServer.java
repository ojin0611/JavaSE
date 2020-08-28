import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;

public class ChatServer {
	private ServerSocket server;
	private Socket client;
	ChatServer(){
		try {
			server = new ServerSocket(8888);
			System.out.println("Server is ready...");
			Hashtable<String, PrintWriter> ht = new Hashtable<String, PrintWriter>();
			while(true){
				client = server.accept();
				ChatThread ct = new ChatThread(client, ht);
				ct.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ChatServer();
	}
}