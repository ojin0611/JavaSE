/*
 * �������̽��� �߻�Ŭ������ �����̱� ������new�� �ν��Ͻ�ȭ�� �� ����.
 * �������̽��� ����� static ����� ������ �� ����, interface �̸����� �����ؾ��Ѵ�.
 * 
 * */

public class InterfaceDemo1 {
	public static void main(String[] args) {
		//Datable d = new Datable(); //error �߻�Ŭ������
		Datable d = new Date();
		d.set(Datable.FRI); //Ŭ��������� Ŭ������(�������̽���)���� ����
		System.out.println(d.get());
	}
}
