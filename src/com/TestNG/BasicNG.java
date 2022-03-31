package com.TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class BasicNG {
	WebDriver d;
  @Test(priority = -1)
  public void f() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
		d.findElement(By.name("pass")).sendKeys("07373208125");
		d.findElement(By.name("login")).click();
		Thread.sleep(5000);
  }
  @Test(priority = 1)
  
  public void f1() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("7373208125");
		d.findElement(By.name("pass")).sendKeys("07373");
		d.findElement(By.name("login")).click();
		d.getTitle();
		Thread.sleep(5000);
  }
  @Test(priority = -2)
  public void f2() throws InterruptedException {
	  d.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sathishvenkat1311@gmail.com");
		d.findElement(By.name("pass")).sendKeys("05");
		d.findElement(By.name("login")).click();
		d.getTitle();
		Thread.sleep(15000);
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver1.exe");
	   d = new ChromeDriver();
	  d.get("https://www.facebook.com/");
	d.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	  d.close();
  }

}