package com.edureka.testngpackage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityTestNg 
{
	@Test(priority= 3)
	void editUser()
	{ 
		Reporter.log("User Edited Successfully from PriorityTestNGScript", true);
	}
	
	@Test(priority= 2)
	void deleteUser()
	{
		Reporter.log("User Deleted Successfully  from PriorityTestNGScript", true);
	}
	
	@Test(priority= 1) // if priority value is less than 0 then the execution sequence changes
	void createUser()
	{
		Reporter.log("User Created Successfully from PriorityTestNGScript", true);
	}
}
