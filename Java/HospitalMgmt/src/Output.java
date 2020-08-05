

public class Output {
	private Patient [] array;
	
	public Output(Patient [] array) {
		this.array = array;
	}
	
	public void output() {
		for(Patient p :this.array) {
			System.out.printf("%2d\t %5s\t %4d\t %9d\t %9d\n", 
				p.getNo(), p.getDepartment(), p.getCheckFee(), p.getAdmissionFee(), p.getTotalFee());
			
		}
	}
	
	
	
	
}
