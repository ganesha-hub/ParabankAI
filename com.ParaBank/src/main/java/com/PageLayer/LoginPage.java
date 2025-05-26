package com.PageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass {
	
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	

	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public AccountServicePage validateLogin(String uname,String password1)
	{
		Actions act=new Actions(driver);
		username.sendKeys(uname);
		password.sendKeys(password1);
		//password.sendKeys(Keys.ENTER);
		//loginbutton.click();
		//loginbutton.sendKeys(Keys.ENTER);
//		
//		act.keyDown(Keys.ENTER);
//		act.keyUp(Keys.ENTER);
		
		return new AccountServicePage();
	}
	
	public String validateurl()
	{
		return driver.getCurrentUrl();
	}
	
	public boolean validateMaxLimitOfUsername()
	{
		Boolean flag;
		String unamevalue=username.getAttribute("value");
		if(unamevalue.length()<=10)
		{
			
			flag=true;
		}
		else
			
		{
			flag=false;
		}
		
		return flag;
	}
	

}
