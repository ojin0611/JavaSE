import java.util.Vector;
/**
 * @author : KIMHEEJIN
 * @date 2020. 8. 19.
 * @objective �����������α׷�
 * @environment : Windows 10pro/ OpenJDK14.0.2/ Eclipse 2020-06
 */
//  num - ��ȣ/ code �����ڵ� / day �Կ���/  age ���� / ������ jinchalbi / �Կ��� ibwonbi /  ����� jinryobi/
class Calc {
	Vector <Patient> p;

	Calc(Vector <Patient> p) {
		this.p=p;
	}
	void calc() {
		for(int i = 0 ; i<p.size();i++) {//ȯ�ڰ� ��� �Էµ��� �𸣴ϱ� count��ŭ �ݺ�
			Patient pa = p.elementAt(i);

			//1)1�� �Կ��� 1�� 25000�� 3�� ���ϴ� 30000��
			int ibwonbi1;
			if(1<=pa.getDays() && pa.getDays()<=3) {//days�� 1�Ϻ��� 3�����ϴ� 30000�� �ܿ��� 25000��
				ibwonbi1 =30000;	
			}else ibwonbi1 = 25000;
			//2)���Կ��� = 1�� �Կ���*�Կ��ϼ�
			int tot = ibwonbi1*pa.getDays();

			//3)�Կ��� = ���Կ���*�Կ��ϼ� ���κ���
			double discount = this.daysTodiscount(pa.getDays());
			int ibwonbi = (int)(tot*discount);

			//4)����� = ������+�Կ���
			int jinchalbi = this.ageTojinchalbi(pa.getAge());
			int jinryobi = (int)(jinchalbi +ibwonbi);
			
			//5)�����ڵ� = ����μ�
			String department = this.codeTodepartment(pa.getCode());
			
			pa.setJinryobi(jinryobi);//�����
			pa.setIbwonbi(ibwonbi);//�Կ���
			pa.setJinchalbi(jinchalbi);//������
			pa.setDepartment(department);//�����ڵ�
		}
	}
	private double daysTodiscount(int days) {//�Կ��ϼ��� ���� ������
		double discount =0.0;
		if(days<10) {discount=1.00;
		}else if(10<=days&&days<15) {discount=0.85;
		}else if(15<=days&&days<20) {discount=0.80;
		}else if(20<=days&&days<30) {discount=0.77;
		}else if(30<=days&&days<100) {discount=0.72;
		}else if(100<=days) {discount=0.68;}
		return discount;
	}
	private int ageTojinchalbi(int age) {//���̿� ���� ������
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
		case"MI" : department ="�ܰ�";break;
		case"NI": department ="����";break;
		case"SI" : department ="�Ǻΰ�";break;
		case"TI": department ="�Ҿư�";break;
		case"VI": department ="����ΰ�";break;
		case"WI": department ="�񴢱��";break;
		}return department;
	}
}
