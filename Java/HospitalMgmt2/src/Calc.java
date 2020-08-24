import java.util.Vector;
/**
 * @author : KIMHEEJIN
 * @date 2020. 8. 19.
 * @objective 병원관리프로그램
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */
//  num - 번호/ code 진료코드 / day 입원일/  age 나이 / 진찰비 jinchalbi / 입원비 ibwonbi /  진료비 jinryobi/
class Calc {
	Vector <Patient> p;

	Calc(Vector <Patient> p) {
		this.p=p;
	}
	void calc() {
		for(int i = 0 ; i<p.size();i++) {//환자가 몇명 입력될지 모르니까 count만큼 반복
			Patient pa = p.elementAt(i);

			//1)1일 입원비 1일 25000원 3일 이하는 30000원
			int ibwonbi1;
			if(1<=pa.getDays() && pa.getDays()<=3) {//days가 1일부터 3일이하는 30000원 외에는 25000원
				ibwonbi1 =30000;	
			}else ibwonbi1 = 25000;
			//2)총입원비 = 1일 입원비*입원일수
			int tot = ibwonbi1*pa.getDays();

			//3)입원비 = 총입원비*입원일수 할인비율
			double discount = this.daysTodiscount(pa.getDays());
			int ibwonbi = (int)(tot*discount);

			//4)진료비 = 진찰비+입원비
			int jinchalbi = this.ageTojinchalbi(pa.getAge());
			int jinryobi = (int)(jinchalbi +ibwonbi);
			
			//5)진료코드 = 진료부서
			String department = this.codeTodepartment(pa.getCode());
			
			pa.setJinryobi(jinryobi);//진료비
			pa.setIbwonbi(ibwonbi);//입원비
			pa.setJinchalbi(jinchalbi);//진찰비
			pa.setDepartment(department);//진료코드
		}
	}
	private double daysTodiscount(int days) {//입원일수에 따른 할인율
		double discount =0.0;
		if(days<10) {discount=1.00;
		}else if(10<=days&&days<15) {discount=0.85;
		}else if(15<=days&&days<20) {discount=0.80;
		}else if(20<=days&&days<30) {discount=0.77;
		}else if(30<=days&&days<100) {discount=0.72;
		}else if(100<=days) {discount=0.68;}
		return discount;
	}
	private int ageTojinchalbi(int age) {//나이에 따른 진찰비
		int jinchalbi=0;
		if(age<10) {jinchalbi=7000;
		}else if(10<=age&&age<20) {jinchalbi=5000;
		}else if(20<=age&&age<30) {jinchalbi=8000;
		}else if(30<=age&&age<40) {jinchalbi=7000;
		}else if(40<=age&&age<50) {jinchalbi=4500;
		}else if(50<=age) {jinchalbi=2300;}
		return jinchalbi;
	}
	private String codeTodepartment(String code){
		String department = null;
		switch(code){
		case"MI" : department ="외과";break;
		case"NI": department ="내과";break;
		case"SI" : department ="피부과";break;
		case"TI": department ="소아과";break;
		case"VI": department ="산부인과";break;
		case"WI": department ="비뇨기과";break;
		}return department;
	}
}
