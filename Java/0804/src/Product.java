
public class Product {
	String name;
	int price;
	void copy(Product other){ 
		other.name = this.name; // ������
		other.price = this.price;
	}
	Product copy1() { 
		System.out.println("������ �ּ� = "+this);
		return this; // �ּҺ���
	}
}
