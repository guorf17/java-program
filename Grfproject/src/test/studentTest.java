package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class studentTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception
	{
		System.out.println("This is BeforeClass!");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception
	{
		System.out.println("This is AfterClass!");
	}

	@Before
	public void setUp() throws Exception
	{
		System.out.println("This is Before!");
	}

	@After
	public void tearDown() throws Exception
	{
		System.out.println("This is After!");
	}

	@Test
	public void test1()
	{
		System.out.println("This is test1!");
	}
	
	@Test
	public void test2()
	{
		System.out.println("This is test2!");
	}


}
