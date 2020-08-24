import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
 * InputStream --> Reader --> Memory --> Writer --> OutputStream
 *
 */
public class BridgeClassDemo {
	public static void main(String[] args) throws IOException {
		System.out.print("당신은 어느 계절을 좋아하십니까 ? : ");
		InputStream is = System.in;  //표준 입력(from Keyboard)
		InputStreamReader isr = new InputStreamReader(is);
		//System.out.println(isr.getEncoding());
		BufferedReader br = new BufferedReader(isr);
		String season = br.readLine();
		System.out.println("season = " + season);
	}
}
