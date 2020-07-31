public class Main {
	public static void main(String[] args) {
		
		Student [] array = new Student[3];
		Input.input(array);                 // static이니까 클래스이름을 가져온다. 
		
		Main m = new Main();
		m.print();
		// 만약 method에 static이 없으면 (Scanner처럼) new Input해서 새로운 객체를 생성해야한다.
		Calc.calc(array);                   // static이니까 클래스이름을 가져온다 
		// Sorting.insertionSort(array);
		Output.output(array);               // static이니까 클래스이름을 가져온다
	}
	
	void print() {}
}