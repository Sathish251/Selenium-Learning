package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Frames.html");
		Thread.sleep(2000);
		WebElement Sframe=d.findElement(By.xpath("//a[@href='#Single']"));
		Sframe.click();
		WebElement outerframe=d.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		d.switchTo().frame(outerframe);
		//single Frame Automation
		//d.switchTo().frame("Single Iframe");
		WebElement frame_Text = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame_Text.sendKeys("Testing");
		Thread.sleep(16000);
		
		//Main Frame  /   Iframe
		//Multiple Frame Automation
		d.switchTo().defaultContent();
		Thread.sleep(6000);
		//d.switchTo().frame("Iframe with in an Iframe");
		d.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement IN_Frame = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(IN_Frame);
		Thread.sleep(6000);
		WebElement in_most = d.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])[1]"));
		d.switchTo().frame(in_most);
		WebElement frame_text2 = d.findElement(By.xpath("(//input[@type='text'])[1]"));
		frame_text2.sendKeys("selenium");
		Thread.sleep(6000);
		}

	}


		
				
		
		


