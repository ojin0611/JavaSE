/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/
import java.util.Scanner;
public class IfDemo4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();

		System.out.print("키(cm) : ");
		double height = scan.nextDouble()/100.;

		System.out.print("몸무게(kg) : ");
		double weight = scan.nextDouble();

		double bmi = weight / height / height;
		String status;
		if (bmi >= 40)
		{status = "고도 비만";
		}else if (bmi >= 35)
		{status = "중등도 비만";
		}else if (bmi >= 30)
		{status = "경도 비만";
		}else if (bmi >= 25)
		{status = "과체중";
		}else if (bmi >= 18.5)
		{status = "정상";
		}else status="저체중";
		
		
		System.out.printf("%s님의 BMI 지수는 %.1f이고 %s입니다.",name, bmi, status);
		
		
	}
}
