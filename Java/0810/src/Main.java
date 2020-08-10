/* 파일 찾는 순서
 * 1. 동일 폴더(패키지)에서 찾는다.
 * 2. classpath에서 찾는다.
 * 3. JRE System Library에서 찾는다.
 * 		1) jdk 1.8까지는 %JAVA_HOME%/lib/ext 폴더에 갖다놓기
 * 		2) jdk 1.9이후는 %JAVA_HOME%/lib 에 갖다놓기 (현재버전은 14)
 * 4. Reference library에서 찾는다.
 */

/*
// 1. import kr.co.sist.libs.Student; 
// 2. import kr.co.sist.libs.*; // 주의할 점은, 폴더 전체를 가져오는게 아니라 최후의 폴더에서 *을 써야한다.
*/

// 3. kr.co.sist.libs.Student 이용하기

import kr.co.sist.libs.Student;
public class Main extends Student {
	public static void main(String[] args) {
		/*
		Student std = new Student();
		*/
		// 3. Fully Qualified Name, 전체경로방법. 중첩될때만 쓰는걸로~
		
		kr.co.sist.libs.Student std = new kr.co.sist.libs.Student();
		System.out.println(std.name); // public만 접근가능. 어디에서도 접근가능~
		
		Main m = new Main();
		System.out.println(m.name);
		System.out.println(m.avg);  // Student의 자식 Main은 protected 변수에 접근가능
	}
}
