package com.Selenium;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Window {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.navigate().to("http://www.leafground.com/pages/Window.html");
		Thread.sleep(5000);
		d.manage().window().maximize();
		String Parentwindow=d.getWindowHandle();
		System.out.println(Parentwindow);
		d.findElement(By.xpath("//*[@id=\"home\"]")).click();
		Set<String>Childwindow=d.getWindowHandles();
		int csize=Childwindow.size();
		System.out.println(Childwindow);
		System.out.println(csize);
		for(String handles:Childwindow)
		{
			d.switchTo().window(handles);
		}
		Thread.sleep(5000);
		

	}

}
