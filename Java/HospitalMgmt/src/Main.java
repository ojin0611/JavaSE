
public class Main {

	public static void main(String[] args) {
		Patient[] arr = new Patient[5];
		Input input = new Input(arr);
		Patient[] array = input.input();
		
		Calc calc = new Calc(array);
		calc.calc();
		
		Sorting sorting = new Sorting(array);
		sorting.quickSort(array, 0, array.length - 1);

		Output output = new Output(array);
		output.output();
		
		

	}

}
