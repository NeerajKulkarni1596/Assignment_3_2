package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class countTest {

	@Test
	public void test() {
		JunitTesting test = new JunitTesting();
		int output = test.counting("alphabet");
		assertEquals(2, output);
	}

}
