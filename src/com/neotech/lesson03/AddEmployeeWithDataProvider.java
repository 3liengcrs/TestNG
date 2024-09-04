package com.neotech.lesson03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AddEmployeeWithDataProvider {
	
	@Test(dataProvider="employees")
	public void adEmployee( String firstName, String lastName, String location) {
		System.out.println(firstName + " "+ lastName + " " + location);
		
	}
	
	@DataProvider(name="employees")
	public Object[][] employeeData(){
		
		
		Object[][] data = {{"Sabah","maweer","NY"}};
		
		return data;
		
	}

}
