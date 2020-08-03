public class EncapDemo1 {
	public static void main(String[] args) {
		Student chulsu = new Student();
		chulsu.setKor(110);
		int kor = chulsu.getKor();
		if(kor >= 0) System.out.println("±¹¾î : " + kor);
		else System.out.println("error");
	}
}
