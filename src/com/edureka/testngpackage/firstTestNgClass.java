package com.edureka.testngpackage;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class firstTestNgClass
{
	@Test
	public void display()
	{
		Reporter.log("Hi",true);
	}
	@Test
	public void sample()
	{
		Reporter.log("gunjan",true);
	}
	@Test
	public void editUser()
	{
		Reporter.log("User edited successfully",true);
	}
	@Test
	public void deleteuser()
	{
		Reporter.log("User deleted successfully",true);
	}
}
