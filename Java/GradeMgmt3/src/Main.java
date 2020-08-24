import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>(12);  
		Input input = new Input(list);
		input.input();
		
		Calc calc = new Calc(list);
		calc.calc();
		
		Sorting sorting = new Sorting(list);
		sorting.sort();
		
//		Output output = new Output(list);
//		output.output();
		
		Output1 output = new Output1(list);
		output.output();
	}
}
