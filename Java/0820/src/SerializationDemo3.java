import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Vector;

public class SerializationDemo3 {
	public static void main(String[] args) {
		String path = "C:/temp/mycars.ser";
		try(ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream(new File(path)))){
			Object obj = ois.readObject();
			Vector<Car> vector = (Vector<Car>)obj;
			//System.out.println(vector.size());
			for(Car c : vector) System.out.println(c);
		}catch(IOException | ClassNotFoundException ex) {
			System.out.println(ex);
		}
	}
}
