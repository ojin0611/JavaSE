
public class Product {
	String name;
	int price;
	void copy(Product other){ 
		other.name = this.name; // 값복사
		other.price = this.price;
	}
	Product copy1() { 
		System.out.println("복사할 주소 = "+this);
		return this; // 주소복사
	}
}
