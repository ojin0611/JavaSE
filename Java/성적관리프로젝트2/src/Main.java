public class Main {
	public static void main(String[] args) {
		
		Student [] array = new Student[3];
		Input.input(array);                 // static�̴ϱ� Ŭ�����̸��� �����´�. 
		
		Main m = new Main();
		m.print();
		// ���� method�� static�� ������ (Scanneró��) new Input�ؼ� ���ο� ��ü�� �����ؾ��Ѵ�.
		Calc.calc(array);                   // static�̴ϱ� Ŭ�����̸��� �����´� 
		// Sorting.insertionSort(array);
		Output.output(array);               // static�̴ϱ� Ŭ�����̸��� �����´�
	}
	
	void print() {}
}