import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a URL : "); // �տ�  https:// ������Ѵ�.
		
		String urlStr = scan.next();
		URL url = null;
		BufferedReader br = null;
		try {
			url = new URL(urlStr);
			InputStream is = url.openStream();
			br = new BufferedReader(new InputStreamReader(is));
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("�߸��� URL");
		} catch (IOException ex) {
			
		}
		
	}
}
