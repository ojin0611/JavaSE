import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URLDemo1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a URL : ");
		String urlStr = scan.next();
		URL url = null;
		BufferedReader br = null;   String line = null;
		try {
			url = new URL(urlStr);
			String hostname = url.getHost();   //www.naver.com, 
			int last = hostname.lastIndexOf(".");  //9
			int start = 0;
			if(hostname.startsWith("www")) start = hostname.indexOf(".") + 1;  //4 
			String file = hostname.substring(start, last) + ".html";  //naver.html
			InputStream is = url.openStream();
			PrintWriter pw = null;
			br = new BufferedReader(new InputStreamReader(is));
			pw = new PrintWriter(
						new BufferedWriter(
								new FileWriter(new File(file))));
			while((line = br.readLine()) != null) {
				pw.printf("%s%n", line);   pw.flush();
			}
			br.close();  pw.close();
			System.out.println("Save Success");
		}catch (MalformedURLException e) {
			System.out.println("잘못된 URL 입니다.");
		}catch(IOException ex) {
			
		}
	}
}
