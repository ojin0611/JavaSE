
public class Dog extends Mammal {
	private String bone = "°³»À´Ù±¸";
	
	public String getBone() {
		return bone;
	}

	public void setBone(String bone) {
		this.bone = bone;
	}

	@Override
	public void saySomething() {
		System.out.println("¸Û¸Û");
	}
	
	public void bark() {
		System.out.println("¿Ð¿Ð");
	}
}
