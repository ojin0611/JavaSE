
public class Calc {
	private Account[] array; // Calc Ŭ���� �ȿ����� �����Ӱ� ����� �� ����.
	public Calc(Account[] array) { // �������� ������, �ڱ� instance������ �ʱ�ȭ�ϴ� ��
		this.array = array;
	}
	
	public void calc() {
		for (int i = 0; i < this.array.length; i++) { // array��� �ᵵ ������ this.array��� �Ἥ ���� ����ϱ�!
			Account acc = this.array[i];
			
			double height= acc.getHeight() / 100;
			double weight = acc.getWeight();
			double bmi = weight / (height * height);
			acc.setBmi(bmi);
			
			String level = this.bmiToLevel(bmi);
			acc.setLevel(level);
		}
	}
	
	private String bmiToLevel(double bmi) {
		String level = null;
		if (bmi >= 40) level = "����";
		else if(bmi >= 35 ) level = "�ߵ��";	
		else if(bmi >= 30 ) level = "�浵��";	
		else if(bmi >= 25 ) level = "��ü��";	
		else if(bmi >= 18.5 ) level = "����";
		else level = "��ü��";
		
		return level;
	}
}
