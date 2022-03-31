package com.Selenium;

import java.awt.Desktop.Action;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {

public static WebDriver d;//variable
	
	//Browser Launch
	public static void browerLaunch(String name) {
		
		if(name.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\chrodri\\chromedriver.exe");
			 d = new ChromeDriver();
			
			
			d.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			
			
			d.manage().window().maximize();
			
		}
		else if(name.equalsIgnoreCase("firefox")) {
			
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\cDriver\\gecko.exe");
			
			 d = new ChromeDriver();
			
			
			d.get("http://automationpractice.com/index.php");
			
			
			d.manage().window().maximize();
			
		}
		
		
		
	}
	// Sendkeys
	public static void inputValues(WebElement element, String value) {
		
		element.sendKeys(value);
		
		
	}
	//Click
	public static void elementClick(WebElement element) {
		element.click();
		
	}
	//Wait
	public static void sleepwait(int w) throws InterruptedException {
		Thread.sleep(w);
	}
	//close
	public static void close() {
		d.close();

	}
	//quit
	public static void quit() {
		d.quit();
	}
	//Dropdown
	public static void selectValuesFromDropDown(WebElement element, String options, String value) {
		Select s=new Select(element);
		if(options.equalsIgnoreCase("Index")) {
			s.selectByIndex(Integer.parseInt(value));
		}else if(options.equalsIgnoreCase("visibletext")) {
			s.selectByVisibleText(value);
		}else if(options.equalsIgnoreCase("value")) {
			s.selectByValue(value);
			
		}
		
}
	//Frames
	public static void frameMethods(String frametype, String id,WebElement element, int index) {
		if(frametype.equalsIgnoreCase("id")) {
			d.switchTo().frame(id);
		}
		else if(frametype.equalsIgnoreCase("Webelement")) {
			d.switchTo().frame(element);
		}
		else if(frametype.equalsIgnoreCase("index")) {
			d.switchTo().frame(index);
		}
		else if(frametype.equalsIgnoreCase("parentframe")) {
			d.switchTo().parentFrame();
		}
		else if(frametype.equalsIgnoreCase("DefaultContent")) {
			d.switchTo().defaultContent();
		}
		
	}
	//Alert
	public static void Alert(String alert) {
		if(alert.equalsIgnoreCase("accept")) {
			d.switchTo().alert().accept();
		}else if(alert.equalsIgnoreCase("dismiss")) {
			d.switchTo().alert().dismiss();
		}else if(alert.equalsIgnoreCase("gettext")) {
			d.switchTo().alert().getText();
		}
	}
	//WebDriver Methods
	public static void webdrivermethods(String method) {
		if(method.equalsIgnoreCase("currenturl")) {
			d.getCurrentUrl();
		}else if(method.equalsIgnoreCase("title")) {
			d.getTitle();
		}
	}
	//Actions
	public static void action(WebElement element, WebElement element2) {
		Actions a=new Actions(d);
		a.moveToElement(element).perform();
		a.moveToElement(element).build().perform();
		a.moveToElement(element).click().build().perform();
		a.dragAndDrop(element, element2).build().perform();
		
	}
	//radio
	public static void radio(WebElement element) {
		element.click();
		
	}
	//check
	public static void checkbox(WebElement element) {
		element.click();

	}
	//screenshot
		public static void screenshot(String path) throws IOException {
			TakesScreenshot ss=(TakesScreenshot)d;
			File src=ss.getScreenshotAs(OutputType.FILE);
			File target=new File(path);
			FileUtils.copyFile(src,target);
			

		}
		
		//Scroll
		public static void scroll(int s1, int s2) {
			
			int sr1=s1;
			int sr2=s2;
			 JavascriptExecutor js =  (JavascriptExecutor) d;
			
		        js.executeScript("window.scrollBy("+sr1+","+sr2+")");
		  }
		
		//Url
		public static void url(String url) {
			d.get(url);

		}
		//navigate methods
		public static void navigate(String method, String type, String url) {
			if(method.equalsIgnoreCase("refresh")) {
				d.navigate().refresh();
			}else if(method.equalsIgnoreCase("back")) {
				d.navigate().back();
			}else if(method.equalsIgnoreCase("forward")) {
				d.navigate().forward();
			}else if(method.equalsIgnoreCase("url")) {
				d.navigate().to(url);
			}

		}
		//clear
		public static void clear(WebElement element) {
			element.click();

		}
		
		//get Attribute
		public static void getAttribute(WebElement element, String value) {
			element.getAttribute(value);
		}
		
	
}



