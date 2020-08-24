import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Date;

public class SerializationDemo1 {
	public static void main(String[] args) {
		String path = "C:/temp/mydate.ser";
		try(ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(new File(path)))){
			Object obj = ois.readObject();
			Date before = (Date)obj;
			System.out.println(before);
		}catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
