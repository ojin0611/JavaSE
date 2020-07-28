/*
작성자 : 양영진
작성목적 :
작성일시 :
작성환경 : Windows 10, OpenJDK 14, EditPlus
*/

import java.util.Arrays;
public class ArrayDemo {
	public static void main(String[] args) {
		int [] original = {1,2,3,4,5,6,7,8,9,10}; //10개
		int [] target = {10,9,8,7,6}; //5개

		//shallow copy
		System.arraycopy(original, 0, target, 0, 3); 
		System.out.println(Arrays.toString(target));

		original[0] = 1000;
		System.out.println(Arrays.toString(target)); //original 수정해도 안바뀐다. 

		//deepcopy : 주소복사
		target = original;
		System.out.println(Arrays.toString(target)); 
	}
}

/*
분당이탱크
하이미디어
세종교육

ICT폴리텍대학
성남테크노과학고
여주대학교
*/