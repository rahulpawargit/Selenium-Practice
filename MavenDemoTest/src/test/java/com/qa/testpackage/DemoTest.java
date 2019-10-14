package com.qa.testpackage;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest
{
	
	@Test
	public void sum()
	{
		System.out.println("Sum");
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
	
	@Test
	public void Multiplication()
	{
		System.out.println("Mul");
		int a=4;
		int b=4;
		Assert.assertEquals(16, a*b);
	}
	
	@Test
	public void div()
	{
		
		System.out.println("Div");
		int a=20;
		int b=10;
		Assert.assertEquals(2, a/b);
	}
	
	@Test
	public void sub()
	{
		System.out.println("Sub");
		int a=40;
		int b=20;
		Assert.assertEquals(20, a-b);
	}

}
