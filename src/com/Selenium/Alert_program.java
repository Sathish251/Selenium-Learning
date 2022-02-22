package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_program {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
			
		d.get("http://www.leafground.com/pages/Alert.html");
		WebDriverWait wait =new WebDriverWait(d, 15);
		//simple Alert
		WebElement salert = d.findElement(By.xpath("//button[text()='Alert Box']"));
		salert.click();
		Thread.sleep(5000);
		//Interface(GP)<-Interface(P)<-Child class(2 level Upcasting)
		
		Alert alt=d.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(5000);
		//confirm alert
		d.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(5000);
		d.switchTo().alert().dismiss();
		Thread.sleep(5000);
		
		//Prompt Alert
		WebElement pa = d.findElement(By.xpath("//button[text()='Prompt Box']"));
		pa.click();
	//	Alert alt2 = wait.until(ExpectedConditions.alertIsPresent());
		Alert alt2=d.switchTo().alert();
		alt2.sendKeys("mindtree");
		String at = alt2.getText();
		System.out.println(at);
		Thread.sleep(5000);
		alt2.accept();
		Thread.sleep(5000);
		
		d.findElement(By.id("btn")).click();
		Thread.sleep(5000);
		Alert a3=d.switchTo().alert();
		d.findElement(By.xpath("//button[text()='OK']")).click();
		

	}

}

