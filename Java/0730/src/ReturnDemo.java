import java.util.Scanner;

// prototype ���� ���, �� ������ �ڵ�����
public class ReturnDemo {

	public static void main(String[] args) {
		// Ű�� ������ �Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("Ű : "); double height = scan.nextDouble();
		System.out.print("������ : "); double weight = scan.nextDouble();
		
		ReturnDemo rd = new ReturnDemo(); // �ν��Ͻ� Ŭ���� ���� ���ؼ� �ּ� ����������� ����
		
		double bmi = rd.calcBmi(height * 0.01, weight);
		rd.printLevel(bmi);
	} // ���⼭ scan, height, weight�� �Ҹ�ȴ�. ���������ϱ�!!
	
	
	
	// BMI���� ���
	double calcBmi(double height, double weight){
		double bmi = 0;
		return bmi;
	}
	
	
	// BMI������ ���� 5�ܰ跹�� ���
	void printLevel(double bmi) {
		System.out.println("����");
		
	}
}
