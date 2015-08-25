package test.loops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1d;

	public class TestLoopsPractice1d {

		@Test
		// input with using recursion method
		public void testRecursionMethod() {
			Practice1d testFacto = new Practice1d();
			int number = 10;
			double actual = testFacto.factorialWithRecursion(number);
			double expected = 3628800.0;
			Assert.assertEquals(actual,expected);
		}
		
		@Test
		// input without recursion method
		public void testWithoutRecursionMethod() {
			Practice1d testFacto = new Practice1d();
			double expected = 3628800.0;
			int number = 10;
			double actual = testFacto.factorialWithRecursion(number);
			Assert.assertEquals(actual ,expected);
		}
		
	}

