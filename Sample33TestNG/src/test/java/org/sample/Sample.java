package org.sample;

import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Sample {

	
	@Test(priority=-1)
	public void m()
	{
		System.out.println("name");
	}
	
	@Test(priority=1)
	public void m1()
	{
		System.out.println("name m1");
	}
	
	@Test()
	public void m3()
	{
		System.out.println("name m3");
	}
	
	
	
//	
//	
//	
//	
//	@BeforeSuite
//	public void beforeSuite()
//	{
//		System.out.println("before suite");
//	}
//	@BeforeMethod
//	public void beforeMethod()
//	{
//		System.out.println("before method");
//	}
//	
//	@BeforeClass
//	public void beforeClass()
//	{
//		System.out.println("before class");
//	}
//	
// @BeforeTest
// public void beforeTest()
// {
//	 System.out.println("before test");
// }
//	
//	@Test(enabled=false)
//	public void test()
//	{
//		System.out.println(" first Test case");
//	}
//	
//	@Test(enabled=false)
//	public void test2()
//	{
//		System.out.println(" Second test case");
//	}
//	
//	
//	@AfterSuite
//	public void beforeSuite1()
//	{
//		System.out.println("after suite");
//	}
//	@AfterMethod
//	public void afterMethod()
//	{
//		System.out.println("after method");
//	}
//	
//	@AfterClass
//	public void afterClass()
//	{
//		System.out.println("after class");
//	}
//	
// @AfterTest
// public void afterTest()
// {
//	 System.out.println("after test");
// }
// 
// @Test(invocationCount=90)
//	public void test3()
//	{
//		System.out.println(" Third test case");
//	}
	
 
}
