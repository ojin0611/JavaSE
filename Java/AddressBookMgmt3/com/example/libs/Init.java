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
			if(file.exists()) {  //�̹� ���� ����� �߰ų�, �ѹ� �̻� ������ ���� �ְų�
				this.ois = new ObjectInputStream(new FileInputStream(file));
				this.list = (ArrayList<Person>)this.ois.readObject();
			}else {  //�� ���α׷��� ó�� ������ ��
				file.createNewFile();
				this.list = new ArrayList<Person>(1);
			}
		} catch (EOFException e) {   //File�� �����µ�, �� ������ ����ִٸ� �߻��ϴ� exception
			System.out.println("EOFException �߻�");
			this.list = null;   
			//boolean flag = file.delete();  //�ƿ� ��������.
			//System.out.println("flag = " + flag);
			return;
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("Exception �߻� : " + e.getMessage());
			this.list = null;   
			return;
		}
	}
	public ArrayList<Person> load(){
		if(this.list != null) return this.list;
		else return null;
	}
	
}
