import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;

public class FileChannelDemo {
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
		FileChannel in  = fis.getChannel();
		FileChannel out = fos.getChannel();
		MappedByteBuffer map = in.map(MapMode.READ_ONLY,0, in.size());
		out.write(map);
		System.out.println("Copy End..");
	}
}