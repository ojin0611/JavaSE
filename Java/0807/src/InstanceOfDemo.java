
public class InstanceOfDemo {
	public static void main(String[] args) {
		Mammal m = new Mammal();
		Korean ko = new Korean();
		// Korean extends(is a) Mammal.
		
		/*
		m = (Mammal)ko;
		m.saySomething();
		*/
		
		Dog d = new Dog();
		m = (Mammal)d;
		m.saySomething();
	}
}
