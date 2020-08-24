import java.io.IOException;
import java.io.RandomAccessFile;

//�ѱ��� �ǳ���?
public class RandomAccessFileDemo {
	public static void main(String[] args) {
		String path = "./src/RandomAccessFileDemo.java";
		try(RandomAccessFile raf = 
				new RandomAccessFile(path, "r")){
			while(raf.getFilePointer() < raf.length()) {
				//String line = raf.readLine();
				//line = CharConversion.entoko(line);
				//System.out.println(line);
				System.out.print((char)raf.read());
				System.out.println("�������� ���� ��ġ : " + raf.getFilePointer());
			}
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}//���Ⱑ ��