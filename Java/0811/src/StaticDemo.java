/*
 * static의 4가지 용법
 * 1. static 변수 : 공유의 목적
 * 2. static 메소드 : 다른 곳에서 주소없이 접근하려고
 * 3. static 초기화 블록 : static 변수 초기화
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