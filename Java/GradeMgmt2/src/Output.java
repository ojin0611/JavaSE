
public class Output {
	private Student[] array;
	
	public Output(Student[] array) {
		this.array = array;
	}
	
	private void printLabel() {
		System.out.println("<<�ֿ�� �����������α׷�>>");
		System.out.println("�й�\t �̸�\t ���� \t ����\t ����\t ����\t ����\t ���\t ����");
		System.out.println("----\t ----\t ----\t ----\t ----\t ----\t ----\t ----\t ----");
	}
	
	public void output(Student[] array) {
		printLabel();
		for (Student s: this.array) s.print();
	}
}
