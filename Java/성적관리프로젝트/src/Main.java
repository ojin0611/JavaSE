public class Main {
	public static void main(String[] args) {
		Student younghee = new Student();
		Input.input(younghee);                 // static이니까 클래스이름을 가져온다
		Calc.calc(younghee);                   // static이니까 클래스이름을 가져온다 
		Output.output(younghee);               // static이니까 클래스이름을 가져온다
	}
}