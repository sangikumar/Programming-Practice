package test.loops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1c;

public class TestLoopsPractice1c {

	@Test
	// input can swap with using third variable
	public void testSwappingNumbers() {
		Practice1c testSwap = new Practice1c();
		int number1 = 10 , number2 = 13;
		int[] actual = testSwap.swapWithThirdVariable(number1, number2);
		int[] expected = {number2,number1};
		Assert.assertEquals(actual,expected);
	}
	
	@Test
	// input can swap without third variable
	public void testSwappingNumbersWithoutThirdVariale() {
		Practice1c testSwap = new Practice1c();
		int number1 = 3 , number2 = 15;
		int[] actual = testSwap.swapWithOutThirdVariable(number1, number2);
		int[] expected = {number2,number1};
		Assert.assertEquals(actual,expected);
	}
	
}
