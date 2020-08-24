import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class Main {
	public static void main(String[] args) throws IOException {

		Vector<Patient> p = new Vector<Patient>(); 
		Input i = new Input(p);
		i.input();
		
		Calc c = new Calc(p);
		c.calc();

		Sort s = new Sort(p);
		s.sort();

		Output o = new Output(p);
		o.output();
	}
}
