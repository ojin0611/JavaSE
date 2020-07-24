/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class ForDemo2 {
	public static void main(String[] args) {
		for (int i=1; i<6; i++){
			for (int j=1; j<11 & j<=i; j++){
				System.out.print("★");
			}
			System.out.println();
		}
		
		char c = 64;
		for (int i=0; i<26; i++){
			for (int j=65; j<= 65+i; j++){
				c += 1;
				System.out.printf("%c ",c);
				if (c=='Z')
				{
					break;
				}
			}
			if (c=='Z')
			{
				break;
			}
			System.out.println();
		}
	}
}
