import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class PrintWriterDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		try(PrintWriter pw = 
				new PrintWriter(
						new BufferedWriter(
								new OutputStreamWriter(
										new FileOutputStream("C:/temp/today"))), true)){
			String line = null;
			int count = 0;
			while((line = scan.nextLine()) != null && count<5) {
				pw.printf("%3d : %s%n", ++count, line);
				System.out.println("Ãâ·Â : "+line);
			}
			System.out.println("File saved successfully.");
		}catch(IOException ex) {
			System.out.println(ex);
		}
	}
}
