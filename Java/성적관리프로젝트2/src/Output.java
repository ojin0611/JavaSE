
public class Output {
	static void printLabel() {
		System.out.println("    <<�ֿ�� �����������α׷�>>");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t���\t����");
		
	}
	
	static void output(Student[] array) {             // ����� �л�,   new �Ⱦ����� static�Է�
		printLabel();
		for (int i = 0; i < array.length; i++) {
			Student s = array[i];
			System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.1f\t%c%n", s.hakbun, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.grade);
		}
	}   
}