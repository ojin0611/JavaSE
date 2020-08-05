public class Calc {
	private Patient[] array;

	public Calc(Patient[] array) {
		this.array= array;
	}
	// ���� �μ� ����
	public void calcDepartment() {
		for(int i=0; i<array.length; i++) {
			String code = array[i].getCode();
			if(code.equals("MI")) {
				array[i].setDepartment("�ܰ�");
			}else if(code.equals("NI")) {
				array[i].setDepartment("����");
			}else if(code.equals("SI")) {
				array[i].setDepartment("�Ǻΰ�");
			}else if(code.equals("TI")) {
				array[i].setDepartment("�Ҿư�");
			}else if(code.equals("VI")) {
				array[i].setDepartment("����ΰ�");
			}else if(code.equals("WI")) {
				array[i].setDepartment("�񴢱��");
			}
		}
	}
	// ���̿� ���� ������ ����
	public void calcCheckFee() {
		for(int i=0; i<array.length; i++) {
			int age = array[i].getAge();
			if(age<10) {
				array[i].setCheckFee(7000);
			}else if(age>=10 && age<20) {
				array[i].setCheckFee(5000);
			}else if(age>=20 && age<30) {
				array[i].setCheckFee(8000);
			}else if(age>=30 && age<40) {
				array[i].setCheckFee(7000);
			}else if(age>=40 && age<50) {
				array[i].setCheckFee(4500);
			}else if(age>=50) {
				array[i].setCheckFee(2300);
			}
		}
	}
	// �� �Կ��� ���� ( �Կ���*�Կ��ϼ�*���κ��� )
	public void calcAdmissionFee() {
		for(int i=0; i<array.length; i++) {
			int days = array[i].getDays();
			if(days<10) {
				if(days<=3) {
					int admissionFee = 30000*days;
					array[i].setAdmissionFee(admissionFee);
				}else if(days>3 && days<10){
					int admissionFee = 25000*days;
					array[i].setAdmissionFee(admissionFee);
				}
			}else if(days>=10 && days<15) {
				int admissionFee = (int)(25000*days *0.85);
				array[i].setAdmissionFee(admissionFee);
			}else if(days>=15 && days<20) {
				int admissionFee = (int)(25000*days*0.80);
				array[i].setAdmissionFee(admissionFee);
			}else if(days>=20 && days<30) {
				int admissionFee = (int)(25000*days*0.77);
				array[i].setAdmissionFee(admissionFee);
			}else if(days>=30 && days<100) {
				int admissionFee = (int)(25000*days*0.72);
				array[i].setAdmissionFee(admissionFee);
			}else if(days>=100) {
				int admissionFee = (int)(25000*days*0.68);
				array[i].setAdmissionFee(admissionFee);
			}
		}
	}
	// �� ���(�����) = ������+�Կ���
	public void calcTotalFee() {
		for(int i=0; i<array.length; i++) {
			int total = array[i].getCheckFee()+array[i].getAdmissionFee();
			array[i].setTotalFee(total);
		}
	}

	public void calc() {
		this.calcAdmissionFee();
		this.calcCheckFee();
		this.calcDepartment();
		this.calcTotalFee();
	}
}