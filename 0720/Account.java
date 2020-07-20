/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : OS, Version, Editor
*/


import java.util.*;

public class Account {
	public static void main(String[] args) {
		Scanner scan;
		scan = new Scanner(System.in);

		String id;
		String password;
		String name;
		String email;

		System.out.print("ID? ");
		id = scan.nextLine();
		System.out.print("password? ");
		password = scan.nextLine();
		System.out.print("name? ");
		name = scan.nextLine();
		System.out.print("E-mail? ");
		email = scan.nextLine();

		System.out.printf("\n1. ID : %s\n2. PW : %s\n3. NAME : %s\n4. E-MAIL : %s\n", id, password, name, email);

	}
}
