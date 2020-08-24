import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a URL : "); // 앞에  https:// 써줘야한다.
		
		String urlStr = scan.next();
		URL url = null;
		try {
			url = new URL(urlStr);
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port : " + url.getPort());
			System.out.println("Default Port : " + url.getDefaultPort());
			System.out.println("File : " + url.getFile());
			System.out.println("QueryString : " + url.getQuery());
			System.out.println("Reference : " + url.getRef());
			System.out.println("Path : " + url.getPath());
		} catch (MalformedURLException e) {
			e.printStackTrace();
			System.out.println("잘못된 URL");
		}
	}
}
