
public class Calc {

	public void calc(Telephone[] array) {
		// TODO Auto-generated method stub
		for (int i = 0; i < array.length; i++) {
			Telephone phone = array[i];
			switch (phone.getKind()) {
			case 1: phone.setGibon(6000); break;
			case 2: phone.setGibon(4800); break;
			case 3: phone.setGibon(3000); break;
			}
			
			int sum = phone.getQuantity() * 12;
			phone.setSum(sum); // 통화료
			
			int tax = (int)((phone.getGibon() + sum ) * 0.1);
			phone.setTax(tax); // 세금
			
			int fee = phone.getGibon() + tax + sum; // 공과금 합계
			phone.setFee(fee);
		}

	}

}
