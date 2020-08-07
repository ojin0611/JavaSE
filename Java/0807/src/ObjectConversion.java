/*
 * Conversion / Cast
 * 1. Primitive Type
 * 	1) 자동형변환, promotion
 * 		4 + 89.5 -> double
 * 	2) 강제형변환, demotion
 * 		(int)89.5 = 89;
 * 
 * 2. Reference Type
 * 	1) 자동형변환, 자식 -> 부모. cast up. 형변환 생략가능
 *  2) 강제형변환, 부모 -> 자식. downward cast. 형변환 생략불가
 */
public class ObjectConversion {
	public static void main(String[] args) {
		Object obj = new Object();
		String str = new String();
		obj = str; // 자동형변환
		
		if (obj instanceof String) System.out.println("true");
		else System.out.println("false");
		
		
		Object obj1 = new String(); // 자동형변환
		
		
		Test test = new Test();
		Demo demo = new Demo();
		
		test= (Test)demo; // 조상은 자식을 형변환시킬 수 있다.
		// demo= (Demo)test; // error. 자식은 조상을 자식으로형변환할수없어.
	}
}

class Test{}
class Demo extends Test{}