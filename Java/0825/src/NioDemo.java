public class NioDemo {
	public static void main(String[] args) {
		NonBuffer.start();
		try{
			NonBuffer.copy("C:/temp/demo.zip", 
				                    "C:/temp/nonbuffer.zip");
		}catch(java.io.IOException ex){}
		NonBuffer.end();
		long difference = NonBuffer.during();
		System.out.println("���翡 �ɸ� �ð��� " + difference + " ms");
	}
}
