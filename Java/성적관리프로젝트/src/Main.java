public class Main {
	public static void main(String[] args) {
		Student younghee = new Student();
		Input.input(younghee);                 // static�̴ϱ� Ŭ�����̸��� �����´�
		Calc.calc(younghee);                   // static�̴ϱ� Ŭ�����̸��� �����´� 
		Output.output(younghee);               // static�̴ϱ� Ŭ�����̸��� �����´�
	}
}