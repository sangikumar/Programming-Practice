package test.loops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1e;

public class TestLoopsPractice1e {
	
	@Test
	//Input number is not prime
	public void testPrimeNumber(){
		Practice1e testPrime = new Practice1e();
		int number = 10;
		boolean actual = testPrime.testForPrimeNumber(number);
		Assert.assertEquals(actual, false);
	}

	@Test
	//Input number is prime
	public void testPrimeNumber1(){
		Practice1e testPrime = new Practice1e();
		int number = 11;
		boolean actual = testPrime.testForPrimeNumber(number);
		Assert.assertEquals(actual, true);
	}

}
