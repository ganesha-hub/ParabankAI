package com.TestLayes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class Project {
	public static WebDriver driver;
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\palla\\eclipse-workspace\\com.ParaBank\\Driver\\chromedriver.exe");
	 ChromeOptions options = new ChromeOptions();
	 options.addArguments("--remote-allow-origins=*");
     driver = new ChromeDriver(options);
	 driver.get("https://www.aircanada.com/ca/en/aco/home.html#/");
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	  //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Sign in ']"))).click();
	 
    driver.findElement(By.xpath("//button[@id=\"acUserMenu-aco\"]")).click();
     driver.findElement(By.xpath("//span[text()='Aeroplan number or email']")).sendKeys("xxxx");
     driver.findElement(By.xpath("//span[text()='Password']")).sendKeys("xxxx");
     driver.findElement(By.xpath("//input[@value=\"Sign in\"]")).click();
     
	}

}
