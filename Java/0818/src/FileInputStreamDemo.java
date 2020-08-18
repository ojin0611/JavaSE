import java.io.FileInputStream;
import java.io.IOException;

//한글이 잘 되나요?
//java.io는 생성자 싸움이다. 생성자는 곧 Stream open 이기 때문이다.
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
