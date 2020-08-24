package com.example.libs;

import java.util.ArrayList;
import java.util.Scanner;

public class Search {
	private ArrayList<Person> list;
	private Scanner scan;
	
	public Search(ArrayList<Person> list, Scanner scan) {
		this.list = list;
		this.scan = scan;
	}
	
	public Person linearSearch(String msg){
		Person searchPerson = null;
		int i;
		this.scan.nextLine();   //enter key 날리자.
		System.out.println("[ 회원 검색 ]");
		System.out.print(msg + " 회원 이름 : ");
		String name = this.scan.nextLine();
		for(i = 0 ; i < this.list.size() ; i++) {
			Person p = this.list.get(i);
			if(p.getName().equals(name))  {
				searchPerson = p; break; 
			}
		}
		if(i == this.list.size()) return null;
		else return searchPerson;
	}
}
