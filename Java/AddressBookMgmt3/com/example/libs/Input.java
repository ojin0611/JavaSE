package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Input {
	private ArrayList<Person> list;
	private Scanner scan;
	
	public Input(ArrayList<Person> list, Scanner scan) {
		this.list = list;
		this.scan = scan;
	}
	
	public void input() {
		System.out.print("회원 번호 : ");   
		int number = this.scan.nextInt();
		this.scan.nextLine();   //enter key 날리자.
	    System.out.print("이름 : ");
	    String name = this.scan.nextLine();
	    System.out.print("전화번호 : ");
	    String tel = this.scan.next();
	    this.scan.nextLine();   //enter key 날리자.
	    System.out.print("주소 : ");
	    String address = this.scan.nextLine();
	    Person p = new Person(number, name, tel, address);
	    this.list.add(p);
	}
}
