

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class InputTest {
	private Input input;
	private ArrayList<Student> list;
	@Before
	public void init() {
		this.list = new ArrayList<Student>(3);
		this.input = new Input(list);
		this.input.input();
	}
	@Ignore @Test
	public void test() {
		assertNotNull(this.input);
	}
	@Ignore @Test
	public void test1() {
		assertEquals(12, this.list.size());
	}
	@Ignore @Test
	public void test2() {
		assertEquals("«—º€¿Ã", this.list.get(0).getName());
	}
	@Ignore @Test
	public void test3() {
		assertEquals(89, this.list.get(11).getKor());
	}
	@Test
	public void test4() {
		Calc calc = new Calc(this.list);
		calc.calc();
		Student s = this.list.get(0);
		int tot = s.getKor() + s.getEng() + s.getMat() + s.getEdp();
		//assertEquals(326, tot);
		//assertEquals(326, s.getTot());
		assertEquals('B', s.getGrade());
	}
}
