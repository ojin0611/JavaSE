
public class Calc {
	private Account[] array; // Calc 클래스 안에서는 자유롭게 사용할 수 있음.
	public Calc(Account[] array) { // 생성자의 역할은, 자기 instance변수를 초기화하는 것
		this.array = array;
	}
	
	public void calc() {
		for (int i = 0; i < this.array.length; i++) { // array라고 써도 되지만 this.array라고 써서 굳이 명시하기!
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
		if (bmi >= 40) level = "고도비만";
		else if(bmi >= 35 ) level = "중등도비만";	
		else if(bmi >= 30 ) level = "경도비만";	
		else if(bmi >= 25 ) level = "과체중";	
		else if(bmi >= 18.5 ) level = "정상";
		else level = "저체중";
		
		return level;
	}
}
