import java.util.Vector;

public class Main {
	public static void main(String[] args) {
		//Telephone [] array = new Telephone[3];
		Vector<Telephone> vector = new Vector<Telephone>(10);//¹æ 10°³
		
		Input input = new Input(vector);
		input.input();
		
		Calc calc = new Calc(vector);
		calc.calc();
		
		Sort sort = new Sort(vector);
		sort.sort();
		
		Output output = new Output(vector);
		output.output();
	}
}
