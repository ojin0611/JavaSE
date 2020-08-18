import java.io.FileInputStream;
import java.io.IOException;

//�ѱ��� �� �ǳ���?
//java.io�� ������ �ο��̴�. �����ڴ� �� Stream open �̱� �����̴�.
public class FileInputStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		int su = 0;    byte [] buffer = new byte[32];
		int count = 0;
		try {
			fis = new FileInputStream("./src/FileInputStreamDemo.java");
			while((count = fis.read(buffer)) >= 0) {
				System.out.print(new String(buffer, 0, count));
			}
			//while((su = fis.read()) >= 0) {
			//	System.out.print((char)su);
			//}
		}catch(IOException ex) {
			System.out.println(ex);  //ex.toString()
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
