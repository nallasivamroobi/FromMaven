package org.sample;

import org.testng.annotations.Test;

import cucumber.api.java.Before;

public class Sample {

	
	@Test(priority=5)
	public void m()
	{
		System.out.println("Nallasivam Roobini");
	}
	
	@Test(priority=20)
	public void m1()
	{
		System.out.println("Bengaluru Chennai Maharasthra");
	}
	
	@Test()
	public void m3()
	{
		System.out.println("Madurai , Korkai , Dindigul , PandiaNaadu");
	}
	
	 
}
