package com.example.libs.view;

import java.util.Scanner;

public class SungjukMgmtUI {
	private Scanner scan;
	
	public SungjukMgmtUI() {  //Constructor
		this.scan = new Scanner(System.in);
		while(true) {
			int choice = showMenu();
			process(choice);
		}
	}
	
	private void process(int choice) {
		switch(choice) {
			case 1: 
				Output output = new Output(); 
				output.output();    
				break;
				
			case 2:
				Search search = new Search(this.scan);
				search.search();
				break;
				
			case 3:  //�л� �Է�
				Input input = new Input(this.scan);
				input.input();
				break;
				
			case 4:
				Update update = new Update(this.scan);
				update.update();
				break;
				
			case 5: 
				Delete delete = new Delete(this.scan);
				delete.delete();
				break;
				
			case 9: 
				System.out.println("Bye!!!");    
				System.exit(0);   
				break;
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��� �ּ���");
		}
	}
	
	private int showMenu() {
		System.out.println("\n***** Menu *****");
		System.out.println("1. ��� �л� ����");   //SELECT(Read)
		System.out.println("2. �л� �˻� �ϱ� ");
		System.out.println("3. �л� �Է� �ϱ�");   //INSERT(Create)
		System.out.println("4. �л� ���� ���� �ϱ�");   //UPDATE(Update)
		System.out.println("5. �л� ���� �ϱ�");    //DELETE(Delete)
		System.out.println("9. ���α׷� ����");
		System.out.print("���� >> ");
		return this.scan.nextInt();
	}
}
