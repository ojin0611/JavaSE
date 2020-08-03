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
			System.out.print("상품 이름 : "); p[i].name = scan.next();
			System.out.print("수량 : ");    p[i].amount = scan.nextInt();
			System.out.print("판매단가 : "); p[i].salePrice = scan.nextInt();
			System.out.print("매입단가 : "); p[i].purchasePrice = scan.nextInt();
			System.out.print("운송료 : ");  p[i].shippingCharge = scan.nextInt();
			
		}
	}
}