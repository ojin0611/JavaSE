package com.example.libs;

import java.util.Scanner;

public class Update {
	private Person person;
	private Scanner scan;

	public Update(Person person, Scanner scan) {
		this.person = person;
		this.scan = scan;
	}
	
	public void modify() {
		System.out.print("변경하실 전화번호 : ");
		String tel = this.scan.nextLine();
		if(tel.length() == 0) tel = this.person.getTel();
		System.out.print("변경하실 주소 : ");
		String address = this.scan.nextLine();
		if(address.length() == 0) address = this.person.getAddress();
		this.person.setTel(tel);
		this.person.setAddress(address);
		System.out.println("회원님의 정보가 수정됐습니다.");
	}
}
