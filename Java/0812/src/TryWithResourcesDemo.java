import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		//FileInputStream fis;  //����
		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")) {
			//System.out.println(4 / 2);
			//System.out.println("���⸦ ����ұ��?");
		} catch (Exception e) {
			System.out.println("File�� ã�� �� �����ϴ�.");
		} 
	}
}