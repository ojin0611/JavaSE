
public class Dog extends Mammal {
	private String bone = "�����ٱ�";
	
	public String getBone() {
		return bone;
	}

	public void setBone(String bone) {
		this.bone = bone;
	}

	@Override
	public void saySomething() {
		System.out.println("�۸�");
	}
	
	public void bark() {
		System.out.println("�п�");
	}
}
