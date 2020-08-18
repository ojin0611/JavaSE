import java.io.IOException;
import java.io.InputStream;

public class IODemo1 {
	public static void main(String[] args) throws IOException {
		System.out.print("당신은 어느 계절을 좋아하십니까 ? : ");
		InputStream is = System.in;
		byte [] buffer = new byte[64];
		int count = is.read(buffer);  //읽어들인 글자 수
		String season = new String(buffer, 0, count);
		System.out.println("season = " + season);
	}
}
