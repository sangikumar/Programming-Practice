package test.loops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1b;

public class TestLoopsPractice1b {

	@Test
	// input can divide by 5
	public void testDiv() {
		Practice1b testDivision = new Practice1b();
		int number = 10;
		String actual = testDivision.pingPongDivisibility(number);
		Assert.assertEquals(actual, "pong : given number is divisible by 5");
	}

	@Test
	// input can divide by 3
	public void testDiv1() {
		Practice1b testDivision = new Practice1b();
		int number = 9;
		String actual = testDivision.pingPongDivisibility(number);
		Assert.assertEquals(actual, "ping : given number is divisible by 3");
	}

	@Test
	// input can divide by 3 & 5
	public void testDiv2() {
		Practice1b testDivision = new Practice1b();
		int number = 15;
		String actual = testDivision.pingPongDivisibility(number);
		Assert.assertEquals(actual,
				"ping pong : given number is divisible by 3 & 5");
	}

	@Test
	// input can not divide by 3 or 5
	public void testDiv3() {
		Practice1b testDivision = new Practice1b();
		int number = 11;
		String actual = testDivision.pingPongDivisibility(number);
		Assert.assertEquals(actual, "This number not divisible by 3 & 5 ");
	}

}
