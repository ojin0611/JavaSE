
public class Calc {
	Telephone[] array;
	
	

	public Calc(Telephone[] array) {
		this.array = array;
	}



	public void calc() {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			Telephone phone = array[i];
			switch (phone.getKind()) {
			case 1: phone.setGibon(6000); break;
			case 2: phone.setGibon(4800); break;
			case 3: phone.setGibon(3000); break;
			}
			
			int sum = phone.getQuantity() * 12;
			phone.setSum(sum); // ��ȭ��
			
			int tax = (int)((phone.getGibon() + sum ) * 0.1);
			phone.setTax(tax); // ����
			
			int fee = phone.getGibon() + tax + sum; // ������ �հ�
			phone.setFee(fee);
		}

	}

}
