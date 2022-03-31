package com.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_tip {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://www.leafground.com/pages/tooltip.html");
		d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement Tool_tip = d.findElement(By.id("age"));
		Thread.sleep(6000);
		a.moveToElement(Tool_tip).perform();
		Thread.sleep(6000);
		Tool_tip.sendKeys("sarni");
		

	}

}

