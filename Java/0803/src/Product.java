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
			// 1) �Ǹűݾ� = ���� * �ǸŴܰ�
			int sales = array[i].amount * array[i].salePrice;
			
			// 2) ���Աݾ� = ���� * ���Դܰ�
			int purchase = array[i].amount * array[i].purchasePrice;
			
			// 3) ���ͱ� =�Ǹűݾ� - (���Աݾ� + ��۷�)
			array[i].profit = sales - purchase - array[i].shippingCharge;
			
	   		// 4) ������ = ���ͱ� / ���Աݾ� * 100
	   		// 5) �������� �Ҽ��� ���� ��° �ڸ����� �ݿø��Ͽ� ��° �ڸ����� ���Ѵ�.
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