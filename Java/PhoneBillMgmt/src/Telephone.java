public class Telephone {
    private int kind;
    private String tel;
    private String name;
    private int quantity;
    private int sum;
    private int tax;
    private int fee;
    private int gibon;

    public Telephone(int kind, String tel, String name, int quantity){
    	this.kind = kind;
    	this.tel = tel;
    	this.name = name;
    	this.quantity = quantity;
    }

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getTax() {
		return tax;
	}

	public void setTax(int tax) {
		this.tax = tax;
	}

	public int getFee() {
		return fee;
	}

	public void setFee(int fee) {
		this.fee = fee;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGibon() {
		return gibon;
	}

	public void setGibon(int gibon) {
		this.gibon= gibon;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
    
    public void print() {
    	System.out.printf("%d\t%s\t%s\t%d\t%,d\t%,d\t%,d\n",
    			this.kind, this.tel, this.name, this.gibon, this.sum, this.tax, this.fee);
    }

}
