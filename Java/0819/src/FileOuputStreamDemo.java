import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOuputStreamDemo {
	public static void main(String[] args) {
		String path = "C:/temp/result.txt";
		try(DataOutputStream dos = 
				new DataOutputStream(new FileOutputStream(path))){
			dos.writeBoolean(true);
			dos.write("\n".getBytes());
			dos.writeInt(24);
			dos.write("\n".getBytes());
			dos.writeDouble(89.5);
			dos.write("\n".getBytes());
			dos.writeUTF("æ»≥Á«œººø‰");
			dos.write("\n".getBytes());
			dos.writeUTF("Good Morning!!!");
//			fos.write("æ»≥Á«œººø‰.".getBytes());
//			fos.write("\n".getBytes());
//			fos.write("Good Morning".getBytes());
//			fos.write("89.5".getBytes());
//			fos.write("true".getBytes());
			System.out.println("Save Success.");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
