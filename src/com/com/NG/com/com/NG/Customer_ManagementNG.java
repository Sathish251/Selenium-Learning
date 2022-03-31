package com.com.NG;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Customer_ManagementNG {
	WebDriver d;
  @Test
  public void valid() {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
	  d.findElement(By.name("pass")).sendKeys("07373208125");
	  d.findElement(By.name("login")).click();
  }
  @Test
  public void invalid (){
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("09u$#");
	  d.findElement(By.name("pass")).sendKeys("07355566");
	  d.findElement(By.name("login")).click();
  }
  @Test
  public void illegal (){
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("235889)");
	  d.findElement(By.name("pass")).sendKeys("0737364548");
	  d.findElement(By.name("login")).click();
  }
  @Test
  public void nullt () {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("  ");
	  d.findElement(By.name("pass")).sendKeys("  ");
	  d.findElement(By.name("login")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver" ,"C:\\\\Users\\\\Admin\\\\Desktop\\\\SELENIUM JARS\\\\chromedriver.exe" );
	  WebDriver d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	  d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
/*System.setProperty("webdriver.chrome.driver" ,"D:\\Seleniumjars\\chromedriver.exe" );
WebDriver d = new ChromeDriver();
d.get("https://www.facebook.com/");
d.manage().window().maximize();
d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
d.findElement(By.name("pass")).sendKeys("07373208125");
d.findElement(By.name("login")).click();
Thread.sleep(5000);
d.findElement(By.className("a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7")).click();
 }*/
