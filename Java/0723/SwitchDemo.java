/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

public class SwitchDemo {
	public static void main(String[] args) {
		String season = "hello";
		switch (season)	{
			default : System.out.println("동백"); break;
			case "spring": System.out.println("개나리"); break;
			case "summer": System.out.println("장미"); break;
			case "fall": System.out.println("코스모스"); break;
			
			}
		}
	}
}
