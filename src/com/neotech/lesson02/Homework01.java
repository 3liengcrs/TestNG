package com.neotech.lesson02;

import org.testng.annotations.Test;

public class Homework01 {
	@Test(priority=4)
	public void firstMethod() {
		System.out.println("First Method");
	}
	@Test
	public void firstMethod1() {
		System.out.println("First Method 1");
	}
	@Test(priority=3)
	public void secondMethod() {
		System.out.println("Second Method");
	}

	@Test(priority=2)
	public void thirdMethod() {
		System.out.println("Third Method");
	}
	@Test(priority=1)
	public void fourthMethod() {
		System.out.println("Fourth Method");
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
}
