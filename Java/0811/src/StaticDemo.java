/*
 * static�� 4���� ���
 * 1. static ���� : ������ ����
 * 2. static �޼ҵ� : �ٸ� ������ �ּҾ��� �����Ϸ���
 * 3. static �ʱ�ȭ ��� : static ���� �ʱ�ȭ
 * 4. static class 
 */

public class StaticDemo {
	public static void main(String[] args) {
		Student[] array = new Student[3];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Student();
			
		}
		for(Student s: array) System.out.println(s);
	}
}

class Student{
	int count; // instance variable
	static int su; // static variable
	
	static {
		su = 10;
	}
	Student(){ // constructor
		su++;
		count++;
	}
	@Override
	public String toString() { 
		return String.format("count=%s, su=%d", count, su);
	}
	
	
}