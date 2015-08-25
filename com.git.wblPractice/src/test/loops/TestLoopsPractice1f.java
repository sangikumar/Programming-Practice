package test.loops;

import org.testng.*;
import org.testng.annotations.Test;

import com.github.wblPractice.loops.Practice1f;
public class TestLoopsPractice1f {
	
	@Test
	// Inputting armstrong number
	public void testArmstrongNumber(){
		Practice1f testArmstrong = new Practice1f();
		int number = 153;
		int actual = testArmstrong.checkForArmstrongNumber(number);
		Assert.assertEquals(actual,number );
	}
	
	@Test
	//Inputting simple number
	public void testArmstrongNumber1(){
		Practice1f testArmstrong = new Practice1f();
		int number = 12;
		int actual = testArmstrong.checkForArmstrongNumber(number);
		Assert.assertEquals(actual,number);
	}


}
