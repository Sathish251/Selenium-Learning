package com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		WebElement mainmenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/a"));
		//*[@id="nav"]/li[2]/a
		a.moveToElement(mainmenu).perform();
		Thread.sleep(3000);
		//WebElement submenu=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[1]/a"));
		//*[@id="nav"]/li[2]/ul/li[1]/a
		//*[@id="nav"]/li[2]/ul/li[3]/a
		//a.moveToElement(submenu).perform();
		Thread.sleep(2000);
		WebElement submenu2=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/a"));
		a.moveToElement(submenu2).perform();
		Thread.sleep(2000);
		WebElement submenu3=driver.findElement(By.xpath("//*[@id=\"nav\"]/li[2]/ul/li[3]/ul/li[2]/a"));
		a.moveToElement(submenu3).perform();
		driver.close();
		
		
		

}
}
