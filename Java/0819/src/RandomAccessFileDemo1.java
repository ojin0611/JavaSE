import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo1 {
	public static void main(String[] args) {
		try(RandomAccessFile raf = 
				new RandomAccessFile("C:/temp/raf.txt", "rw")){
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.writeBoolean(true);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeInt(24);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeDouble(89.5);
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeUTF("안녕하세요");
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			raf.write("\n".getBytes());
			raf.writeUTF("Hello, World");
			System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
			System.out.println("File saved successfully.");
			raf.seek((long)0);
			System.out.printf("%b%n", raf.readBoolean());
			raf.readLine();
			System.out.printf("%d%n", raf.readInt());
			raf.readLine();
			System.out.printf("%.1f%n", raf.readDouble());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
			raf.readLine();
			System.out.printf("%s%n", raf.readUTF());
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
