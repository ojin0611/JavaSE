
public class Main {
	public static void main(String[] args) {
		Student[] array = new Student[12];
		
		Input input = new Input(array);
		input.input();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		// Sorting�� ����
		
		Output output = new Output(array);
		output.output(array);
		
		
	}
}
