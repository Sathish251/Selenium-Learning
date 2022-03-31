package com.elenium;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	WebDriver d;
  @Test
  public void f() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
		d.findElement(By.name("pass")).sendKeys("07373208125");
		d.findElement(By.name("login")).click();
		Thread.sleep(5000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Seleniumjars\\chromedriver.exe");
	   d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
package com.Selenium;

public class TestNG_Basic {

}
