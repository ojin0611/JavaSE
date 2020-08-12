import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResourcesDemo {
	public static void main(String[] args) {
		//FileInputStream fis;  //선언
		try(FileInputStream fis = new FileInputStream("C:/temp/data.txt")) {
			//System.out.println(4 / 2);
			//System.out.println("여기를 출력할까요?");
		} catch (Exception e) {
			System.out.println("File을 찾을 수 없습니다.");
		} 
	}
}