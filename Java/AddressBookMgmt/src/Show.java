
public class Show {
	private Friend[] array;
	private int count;
	
	public Show() {
		
	}
	
	public Show(Friend[] array, int count) {
		super();
		this.array = array;
		this.count = count;
	}
	
	public void show(Friend[] array, int count) {
		System.out.println("===================================");
		for(int i=0; i<count; i++) {
			System.out.println((i+1)+"\\t\\t\\t\\t<<�ּҷ�>>\\t\\t\\t\\t");
			System.out.println(array[i]);
		}
		System.out.println("===================================");
	}
}