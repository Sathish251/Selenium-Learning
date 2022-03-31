package com.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		
		d.get("http://www.leafground.com/pages/table.html");
		Thread.sleep(2000);
		d.manage().window().maximize();
		
		System.out.println("All Data in Table");
		List<WebElement> tall = d.findElements(By.xpath("//table/tbody/tr/td"));
		
		for(WebElement td:tall) {
			String tabletext= td.getText();
			System.out.println(tabletext+"\t");
		}
		System.out.println();
		System.out.println("Row Data in Table");
		List<WebElement> tr5 = d.findElements(By.xpath("//table/tbody/tr[5]/td"));
		
		for(WebElement tr:tr5) {
			String rd=tr.getText();
			System.out.print(rd+"   ");
		}

	}

}

