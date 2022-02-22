package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_New {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://leafground.com/pages/frame.html");
		Thread.sleep(3000);
		WebElement frame1=d.findElement(By.xpath("//iframe[@src='default.html']"));
		d.switchTo().frame(frame1);
		Thread.sleep(2000);
		d.findElement(By.xpath("//*[@id=\"Click\"]")).click();
		Thread.sleep(3000);
		d.switchTo().defaultContent();
		Thread.sleep(2000);
		WebElement frame2=d.findElement(By.xpath("//iframe[@src='page.html']"));
		d.switchTo().frame(frame2);
		Thread.sleep(2000);
		WebElement innerframe2=d.findElement(By.xpath("//iframe[@id='frame2'][1]"));
	    d.switchTo().frame(innerframe2);
	    Thread.sleep(2000);
	    d.findElement(By.xpath("//button[@id='Click1']")).click();
	    Thread.sleep(2000);

	    
		
		
		
		
	}

}
