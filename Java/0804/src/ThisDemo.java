
public class ThisDemo {

	public static void main(String[] args) {
		Product ballpen = new Product();
		ballpen.name = "모나미";
		ballpen.price = 200;
		
		Product pencil = new Product();
		/*
		ballpen.copy(pencil); // 역으로 복사. pencil에 ballpen값을 복사	
		System.out.println(pencil.name);
		System.out.println(pencil.price);

		ballpen.price = 500;
		System.out.println(pencil.price);
		*/
		
		pencil = ballpen.copy1(); // 주소 통째로 가져갔음
		System.out.println(pencil.name);
		System.out.println(pencil.price);
		
		ballpen.price = 500;
		System.out.println(pencil.price);
	}

}
