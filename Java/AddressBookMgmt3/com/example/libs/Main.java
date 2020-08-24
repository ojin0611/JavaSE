/*
 * 
 */
package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner scan;
	private ArrayList<Person> list;
	private static final String PATH;
	
	static {
		PATH = "./myaddress.ser";
	}
	private Main() {
		this.scan = new Scanner(System.in);
	}
	public static void main(String[] args) {
		Main main = new Main();
		Init init = new Init(PATH);
		main.list = init.load();
		if(main.list == null) System.exit(-1);
		
		while(true) {
			int choice = main.showMenu();
			main.process(choice);
			System.out.println();
		}
	}
	
	private void process(int choice) {
		switch(choice) {
			case 0 : 
				Save save = new Save(this.list, PATH);
				save.backup();
				System.out.println("Bye!!! Program is over...");
				System.exit(0); break;
			case 1 : 
				Output output = new Output(this.list);
				output.output(); break;
			case 2 :
				Input input = new Input(this.list, this.scan);
				input.input();    break;
			case 3 : 
				this.search("검색할", 0);    break; 
			case 4 :  
				this.search("삭제할", 1);    break;
			case 5 : 
				this.search("수정할", 2);    break;
		}
	}
	
	private void search(String msg, int flag) {
		Search search = new Search(this.list, this.scan);
		Person p = search.linearSearch(msg);
		if(p != null) {
			if(flag == 0) System.out.println(p);
			if(flag == 1) {
				this.list.remove(p);
				System.out.println("회원삭제 성공");
			}
			if(flag == 2) {
				Update update = new Update(p, this.scan);
				update.modify();
			}
		}
		else System.out.println("회원을 찾지 못했습니다. 확인 후 다시 검색해 주세요. ");
	}
	
	private int showMenu() {
		System.out.println("[ 회원 주소록 ]");
		System.out.println("1. 전체 회원 보기");
		System.out.println("2. 회원 정보 등록");
		System.out.println("3. 회원 정보 검색");
		System.out.println("4. 회원 삭제");
		System.out.println("5. 회원 정보 수정");
		System.out.println("0. 프로그램 종료");
		System.out.print("메뉴 번호 선택 >> ");
		return this.scan.nextInt();
	}
}
