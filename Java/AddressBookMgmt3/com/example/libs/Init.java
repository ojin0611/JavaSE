package com.example.libs;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Init {
	private String path;
	private ObjectInputStream ois;
	private ArrayList<Person> list;

	@SuppressWarnings("unchecked")
	public Init(String path) {
		this.path = path;
		File file = new File(this.path);
		try {
			if(file.exists()) {  //이미 전에 백업을 했거나, 한번 이상 실행한 적이 있거나
				this.ois = new ObjectInputStream(new FileInputStream(file));
				this.list = (ArrayList<Person>)this.ois.readObject();
			}else {  //이 프로그램을 처음 실행할 때
				file.createNewFile();
				this.list = new ArrayList<Person>(1);
			}
		} catch (EOFException e) {   //File을 열었는데, 그 파일이 비어있다면 발생하는 exception
			System.out.println("EOFException 발생");
			this.list = null;   
			//boolean flag = file.delete();  //아예 삭제하자.
			//System.out.println("flag = " + flag);
			return;
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception 발생 : " + e.getMessage());
			this.list = null;   
			return;
		}
	}
	public ArrayList<Person> load(){
		if(this.list != null) return this.list;
		else return null;
	}
	
}
