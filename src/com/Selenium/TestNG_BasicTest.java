package com.Selenium

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_BasicTest {
WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
		d.findElement(By.name("pass")).sendKeys("07373208125");
		d.findElement(By.name("login")).click();
		Thread.sleep(5000);
  }@BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Admin\\\\Desktop\\\\SELENIUM JARS\\\\chromedriver1.exe");
	   WebDriver d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }
}
