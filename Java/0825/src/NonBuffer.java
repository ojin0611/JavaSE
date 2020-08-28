import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class NonBuffer {
	public static long start;
	public static long end;
	public static void start(){
		start = System.currentTimeMillis();
	}
	public static void end(){
		end = System.currentTimeMillis();
	}
	public static long during(){
		return end - start;
	}
	public static void copy(String source, String target) throws IOException{
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos = new FileOutputStream(target);
		int su = 0;
		while((su = fis.read()) != -1){
			fos.write(su);
		}
		System.out.println("Copy End..");
	}
}