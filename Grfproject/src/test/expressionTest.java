package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import firstPackage.expression;

@Ignore
class expressionTest {

	expression C = new expression();

	@Test
	public void testAdd()
	{
		assertEquals(5,C.add(2,3));
	}

	@Test
	public void testSubtract()
	{
		assertEquals(2,C.subtract(8, 6));
	}

	@Test
	public void testMutiply()
	{
		assertEquals(4,C.mutiply(2, 2));
	}

	@Test
	public void testDivi()	//实际值与预期值不符
	{
		assertEquals(3,C.divi(9, 3));
	}
	
	@Ignore
	@Test
	public void testDiviAgain()	//错误操作
	{
		assertEquals(5,C.divi(5, 2));
	}
	

	//除数为0，报错：
	@Test
	public void TestDivi1()
	{
		assertEquals(1,C.divi(5, 5));
	}
	
	
/*	//expected演示：
	@Test(expected = ArithmeticException.class)
	public void TestDivi2()
	{
		assertEquals(1,C.divi(5, 0));
	}

	
	//Ignore演示：

	@Test
	public void TestDivi3()
	{
	 	assertEquals(1,C.divi(5, 0));
	}
*/		
	
	@Test
	public void TestCircle1()
	{
		assertEquals(998,C.circle());
	}
	
	
/*  @Test(timeout = 1000)
	public void TestCircle2()
	{
		assertEquals(998,C.circle());
	}
*/
}
