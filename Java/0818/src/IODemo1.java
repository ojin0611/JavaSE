import java.io.IOException;
import java.io.InputStream;

public class IODemo1 {
	public static void main(String[] args) throws IOException {
		System.out.print("����� ��� ������ �����Ͻʴϱ� ? : ");
		InputStream is = System.in;
		byte [] buffer = new byte[64];
		int count = is.read(buffer);  //�о���� ���� ��
		String season = new String(buffer, 0, count);
		System.out.println("season = " + season);
	}
}
