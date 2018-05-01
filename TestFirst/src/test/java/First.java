import static org.junit.Assert.*;

import org.junit.Test;

public class First {

	@Test
	public void test() {
		HelloController hc = new HelloController();
		assertEquals("ABC", hc.hello("ABC"));	
	}

}
