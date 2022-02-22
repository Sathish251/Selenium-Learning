package com.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Alert_Switch {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		d.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		d.manage().window().maximize();
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admi");
		Thread.sleep(5000);
		d.findElement(By.name("Button3")).click();
		Thread.sleep(5000);
		d.switchTo().alert().accept();
		Thread.sleep(5000);
		d.findElement(By.id("txt_unam")).sendKeys("sylix");
		d.findElement(By.name("txt_pass")).sendKeys("admin");
		d.findElement(By.name("Button3")).click();
}
}

