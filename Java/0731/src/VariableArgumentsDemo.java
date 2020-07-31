
public class VariableArgumentsDemo {
	public static void main(String[] args) {
		print(3,4,5,6,6,6,7);
		
		printAny(true,1,"Hi",3.0,'S');
	}
	
	static void print(int ... array) {
		System.out.println("length = "+array.length);
	}
	
	static void printAny(Object ... array) {
		System.out.println("length = "+array.length);
	}
}
