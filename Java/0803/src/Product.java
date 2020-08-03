public class Product {
	String name;
	int amount;
	int salePrice;
	int purchasePrice;
	int shippingCharge;
	
	int profit;
	double profitRate;
	
	public void setName(String myName){
		name = myName;
	}
	public String getName() {
		return name;
	}
	
	public void setAmount(int myAmount) {
		amount = myAmount;
	}
	public int getAmount() {
		return amount;
	}
	
	public void setSalePrice(int mySalePrice) {
		salePrice = mySalePrice;
	}
	public int getSalePrice() {
		return salePrice;
	}
	
	public void setPurchasePrice(int myPurchasePrice) {
		purchasePrice = myPurchasePrice;
	}
	public int getPurchasePrice() {
		return purchasePrice;
	}

	public void setShippingCharge(int myShippingCharge) {
		shippingCharge = myShippingCharge;
	}
	public int getShippingCharge() {
		return shippingCharge;
	}
	
	public void setProfit(int myProfit) {
		;
	}
	public int getProfit() {
		return profit;
	}
	
	public void calculate(Product[] array) {
		for (int i = 0; i < array.length; i++) {
			// 1) 판매금액 = 수량 * 판매단가
			int sales = array[i].amount * array[i].salePrice;
			
			// 2) 매입금액 = 수량 * 매입단가
			int purchase = array[i].amount * array[i].purchasePrice;
			
			// 3) 이익금 =판매금액 - (매입금액 + 운송료)
			array[i].profit = sales - purchase - array[i].shippingCharge;
			
	   		// 4) 이익율 = 이익금 / 매입금액 * 100
	   		// 5) 이익율은 소수점 이하 셋째 자리에서 반올림하여 둘째 자리까지 구한다.
			array[i].profitRate = (double)array[i].profit / purchase * 100;
			
		}
		
	}
	public void print(Product[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%.2f\n",
					array[i].name, array[i].amount, array[i].salePrice, array[i].purchasePrice, 
					array[i].shippingCharge, array[i].profit, array[i].profitRate);
			
		}
	}
}