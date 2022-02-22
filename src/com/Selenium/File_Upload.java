package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String UploadURL = "http://demo.guru99.com/test/upload/";
       
		
        driver.get(UploadURL);
        
       WebElement fu = driver.findElement(By.id("uploadfile_0"));
       
        fu.sendKeys("C:\\Users\\Admin\\Desktop\\STRING PROGRAM\\File Upload.docx");

        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@class='field_check']")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.cssSelector("#submitbutton")).click();
        
        Thread.sleep(5000);
	}

}
