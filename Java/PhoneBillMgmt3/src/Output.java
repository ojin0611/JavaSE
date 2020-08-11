
public class Output {
	Telephone[] array;
	

	public Output(Telephone[] array) {
		this.array = array;
	}


	public void output() {
		for (Telephone phone: array) {
			
			System.out.println(phone);
			
		}
	}

}
