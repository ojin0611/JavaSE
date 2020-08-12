import static org.junit.Assert.*;

import org.junit.Test;

public class InputTest {

	@Test
	public void test() {
		Telephone[] array = new Telephone[1];
		Input input = new Input(array);
		input.input();
		assertEquals("¹ÚÀºÁö", array[0].getName());
	}

}
