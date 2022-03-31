package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://brm.tremplintech.in/web_pages/login.aspx");
		
		Thread.sleep(7000);
		
		WebElement user=d.findElement(By.xpath("//input[@id='txt_unam']"));
		user.sendKeys("sylix");
				
		WebElement pwd=d.findElement(By.xpath("//input[@id='txt_pass']"));
		pwd.sendKeys("admin");
		
		WebElement Login=d.findElement(By.xpath("//*[@id=\"Button3\"]"));
		Login.click();
		d.findElement(By.xpath("//*[@id=\"hmenu\"]/ul/li[2]/a")).click();
		Select state = new Select(d.findElement(By.name("ctl00$ContentPlaceHolder1$ddl_state")));
		//state.selectByIndex(7);
		state.selectByVisibleText("Tamil Nadu");
		//state.selectByValue("Jammu & Kashmir");
		Thread.sleep(7000);
	}

}

