import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;

public class ChatThread extends Thread {
	private Socket socket;
	private Hashtable<String, PrintWriter> ht;
	private PrintWriter pw;
	private BufferedReader br;
	private String id;
	
	ChatThread(Socket socket, Hashtable<String, PrintWriter> ht) {
		this.socket = socket;   this.ht = ht;
		try{
			InputStream is = this.socket.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(
						new BufferedWriter(
							new OutputStreamWriter(this.socket.getOutputStream())));
			id = br.readLine();  //¥Î»≠∏Ì
			synchronized(ht){
				System.out.println("[" + id + "] ¥‘¿Ã ¿‘¿Â«œºÃΩ¿¥œ¥Ÿ.");
				ht.put(id, pw);
				broadcast("[" + id + "] ¥‘¿Ã ¿‘¿Â«œºÃΩ¿¥œ¥Ÿ.");
			}
		}catch(IOException ex){
			System.out.println(ex.getMessage());
		}
	}
	
	@Override
	public void run(){  //ºˆΩ≈
		String line = null;
		try{
			while((line = br.readLine()) != null){
				if(line.equals("/quit")) break;
				broadcast("[" + id + "] " + line);
			}
			broadcast("[" + id + "] ¥‘¿Ã ≈¿Â«œºÃΩ¿¥œ¥Ÿ.");
			System.out.println("[" + id + "] ¥‘¿Ã ≈¿Â«œºÃΩ¿¥œ¥Ÿ.");
		}catch(IOException ex){
			System.out.println(ex);
		}finally{  
			synchronized(ht){
				ht.remove(id);
			}
			try{
				if(br != null) br.close();
				if(pw != null) pw.close();
				if(socket != null) socket.close();
			}catch(IOException ex){}
		}
	}
	
	private void broadcast(String msg){  //serverø°º≠ ∞¢ ¿Ø¿˙∑Œ πﬂº€
		synchronized(ht){
			Collection<PrintWriter> colls = ht.values();
			Iterator<PrintWriter> iters = colls.iterator();
			while(iters.hasNext()){
				PrintWriter pw = iters.next();
				pw.println(msg);
				pw.flush();
			}
		}
	}
}