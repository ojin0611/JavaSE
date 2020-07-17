/*
�ۼ��� : �翵��
�ۼ����� : literal ����
�ۼ��Ͻ� : 2020.07.17
�ۼ�ȯ�� : Windows 10, OpenJDK 14.0.2, EditPlus 5.3
*/

/*
	Literal
	1. ������ Literal : +,-, 24(10����), 24L(Long), 0234(8����), 0xCAFE(16����), 0b0111001(2����)
	2. �Ǽ��� Literal : +,-, 3.14(�Ǽ�������, 8����Ʈ double), 3.14f(4����Ʈ float), 3.14e-2(������������)
	3. ������ Literal : 'A'(���ڵ�����), '\n'(escape sequence, Ư������)
	4. ���ڿ��� Literal : "������ ���ﵿ �ѵ�����"
	5. Boolean�� Literal : true, false

*/
public class LiteralDemo {
	public static void main(String[] args) {
		// �������(��� format)
		// System.out.printf("�������", ��´��)
		/*
		System.out.printf("%d\n",24);
		System.out.printf("%o\n",24);
		System.out.printf("%x\n",24);
		System.out.println(Integer.toBinaryString(24));
		System.out.println("---------------------");
		System.out.printf("%d\n",-24);
		System.out.printf("%o\n",-24);
		System.out.printf("%x\n",-24);
		System.out.println(Integer.toBinaryString(-24));
		System.out.println("---------------------");
		System.out.printf("%d\n", 0244);
		System.out.printf("%o\n", 0244);
		System.out.printf("%x\n", 0244);
		System.out.println(Integer.toBinaryString(0244));
		System.out.println("---------------------");
		System.out.printf("%d\n", -0244);
		System.out.printf("%o\n", -0244);
		System.out.printf("%x\n", -0244);
		System.out.println(Integer.toBinaryString(-0244));
		System.out.println("---------------------");
		*/
		System.out.printf("%d\n",0b0001111);
		System.out.printf("%o\n",0b0001111);
		System.out.printf("%x\n",0b0001111);
		System.out.println(Integer.toBinaryString(0b0001111));
		System.out.println("---------------------");
		System.out.println(Integer.toBinaryString(-24));
		System.out.println(Long.toBinaryString(-24L));



	}
}
