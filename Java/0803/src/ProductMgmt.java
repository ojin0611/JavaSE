import java.util.Scanner;
public class ProductMgmt {
	public static void main(String[] args) {
		ProductMgmt m = new ProductMgmt();
		Product [] p = new Product[1];
		m.input(p);
		p[0].calculate(p);
		p[0].print(p);
	}
	
	void input(Product [] p) {
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < p.length; i++) {
			p[i] = new Product();
			System.out.print("��ǰ �̸� : "); p[i].name = scan.next();
			System.out.print("���� : ");    p[i].amount = scan.nextInt();
			System.out.print("�ǸŴܰ� : "); p[i].salePrice = scan.nextInt();
			System.out.print("���Դܰ� : "); p[i].purchasePrice = scan.nextInt();
			System.out.print("��۷� : ");  p[i].shippingCharge = scan.nextInt();
			
		}
	}
}