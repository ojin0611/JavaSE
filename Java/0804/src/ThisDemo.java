
public class ThisDemo {

	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen.name = "�𳪹�";
		ballpen.price = 200;
		
		Product pencil = new Product();
		/*
		ballpen.copy(pencil); // ������ ����. pencil�� ballpen���� ����	
		System.out.println(pencil.name);
		System.out.println(pencil.price);

		ballpen.price = 500;
		System.out.println(pencil.price);
		*/
		
		pencil = ballpen.copy1(); // �ּ� ��°�� ��������
		System.out.println(pencil.name);
		System.out.println(pencil.price);
		
		ballpen.price = 500;
		System.out.println(pencil.price);
	}

}
