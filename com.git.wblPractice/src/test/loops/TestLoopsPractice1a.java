package test.loops;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1a;


public class TestLoopsPractice1a {
	
	@Test
	//Normal Input
	public void testFibonacciSeq(){
		Practice1a testFib = new Practice1a();
		int number = 10;
		int actual = testFib.fibonacciSequence(number);
		Assert.assertEquals(actual, 55);
	}
	
	@Test
	//Boundry value input for number=0
	public void testFibonacciSeq1(){
		Practice1a testFib = new Practice1a();
		int number = 0;
		int actual = testFib.fibonacciSequence(number);
		Assert.assertEquals(actual, 0);
	}
	
	@Test
	//Boundry value input for number=2
	public void testFibonacciSeq2(){
		Practice1a testFib = new Practice1a();
		int number = 2;
		int actual = testFib.fibonacciSequence(number);
		Assert.assertEquals(actual,1);
	
}
}