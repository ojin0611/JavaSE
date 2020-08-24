import java.io.IOException;
import java.io.OutputStream;

public class OuputStreamDemo {
	public static void main(String[] args) {
		//System.out.println("A")
		//InputStream is = System.in;
		OutputStream os = System.out;
		String str = "æ»≥Á«œººø‰.";
		try {
			os.write(65);  os.write(66);  os.write(67);  os.write(68);  os.write(69);
			byte [] buffer = str.getBytes();
			os.write(buffer);
			os.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//byte [] buffer = str.getBytes();
		//for(byte b : buffer) System.out.print(b);
	}
}
