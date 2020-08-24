import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class InetAddressDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a host name : ");
		String hostname = scan.next();
		try {
			InetAddress[] array = InetAddress.getAllByName(hostname);
			for(InetAddress ia: array) {
				System.out.println(hostname + "->" + ia.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
