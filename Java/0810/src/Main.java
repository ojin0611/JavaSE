/* ���� ã�� ����
 * 1. ���� ����(��Ű��)���� ã�´�.
 * 2. classpath���� ã�´�.
 * 3. JRE System Library���� ã�´�.
 * 		1) jdk 1.8������ %JAVA_HOME%/lib/ext ������ ���ٳ���
 * 		2) jdk 1.9���Ĵ� %JAVA_HOME%/lib �� ���ٳ��� (��������� 14)
 * 4. Reference library���� ã�´�.
 */

/*
// 1. import kr.co.sist.libs.Student; 
// 2. import kr.co.sist.libs.*; // ������ ����, ���� ��ü�� �������°� �ƴ϶� ������ �������� *�� ����Ѵ�.
*/

// 3. kr.co.sist.libs.Student �̿��ϱ�

import kr.co.sist.libs.Student;
public class Main extends Student {
	public static void main(String[] args) {
		/*
		Student std = new Student();
		*/
		// 3. Fully Qualified Name, ��ü��ι��. ��ø�ɶ��� ���°ɷ�~
		
		kr.co.sist.libs.Student std = new kr.co.sist.libs.Student();
		System.out.println(std.name); // public�� ���ٰ���. ��𿡼��� ���ٰ���~
		
		Main m = new Main();
		System.out.println(m.name);
		System.out.println(m.avg);  // Student�� �ڽ� Main�� protected ������ ���ٰ���
	}
}
