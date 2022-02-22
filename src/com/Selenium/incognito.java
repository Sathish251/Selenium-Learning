package com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class incognito {

	
	    public static void main(String args[]){
	    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
				WebDriver driver= new ChromeDriver(capabilities);		
	    	
			DesiredCapabilities ca
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--incognito");
	        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
	        driver.get("https://www.amazon.in/");
	        System.out.println(driver.getTitle());
	    }
	}

