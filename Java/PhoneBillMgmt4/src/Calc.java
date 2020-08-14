import java.util.Vector;

public class Calc {
	private Vector<Telephone> vector;
	
	public Calc(Vector<Telephone> vector) {
		this.vector = vector;
	}


	public void calc() {
		for(int i = 0 ; i < this.vector.size() ; i++) {
			Telephone phone = this.vector.elementAt(i);
			switch(phone.getKind()) {
				case 1:  phone.setGibon(6000); break;
				case 2:  phone.setGibon(4800); break;
				case 3:  phone.setGibon(3000); break;
			}
			int sum = phone.getQuantity() * 12;
			phone.setSum(sum);  //통화료
			
			int tax = (int)(( phone.getGibon() + sum) * 0.1);
			phone.setTax(tax);   //세금
			
			int fee = phone.getGibon() + tax + sum;  //공과금
			phone.setFee(fee);
		}
	}

}
