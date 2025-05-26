package com.TestLayes;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.AccountServicePage;
import com.PageLayer.LoginPage;

public class LoginPageTest extends BaseClass {
	
	public static LoginPage login;
	public static AccountServicePage AccountServicePage; 
	
	@BeforeClass(alwaysRun=true)
	public void setup()
	{
		initialization();
	}
	
	
	@Test
	public void verifyLogin()
	{
		login=new LoginPage();
		AccountServicePage=login.validateLogin("sonal", "123");
		String url=login.validateurl();
		//Assert.assertEquals(url.contains("https://parabank.parasoft.com/parabank/login.htm"), true);

	}
	
	@Test
	public void verifyUsernameMaxLimit()
	{
		login=new LoginPage();
	    boolean flag=login.validateMaxLimitOfUsername();
		Assert.assertTrue(flag);
	}
	
	
	
//	@DataProvider(name="login")
//	public Object[][] testdata()
//	{
//		
//		ExcelReader read=new ExcelReader();
//		read.readExcel("C:\\Users\\palla\\eclipse-workspace\\com.ParaBank\\src\\main\\java\\com\\TestDataLayer\\Book1.xlsx");
//		int row=read.getrowcount(0);
//		Object[][] data=new Object[row][2];
//		for(int i=0;i<=row-1;i++)
//		{
//			data[i][0]=read.getdata(0,i+1,0);
//			data[i][1]=read.getdata(0,i+1,1);
//		}
//		return data;
//		
//	}

}
