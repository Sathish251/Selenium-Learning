package com.Selenium;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Drop_Down_Tytpes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("http://www.leafground.com/home.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.navigate().to("http://www.leafground.com/pages/Dropdown.html");
        
       /* System.out.println("Dropdown using index");
        Select drpdown = new Select (driver.findElement(By.id("dropdown1")));
        drpdown.selectByIndex(1);
        
        WebElement firstSelectedOption = drpdown.getFirstSelectedOption();
        String selectedoption= firstSelectedOption.getText();
        System.out.println("Selected Option is :" +selectedoption );
        
        System.out.println();
        Thread.sleep(5000);
        System.out.println("Dropdown using text");
        Select select1 = new Select(driver.findElement(By.xpath("//select[@name=\"dropdown2\"]")));
        select1.selectByVisibleText("Appium");
        
        List<WebElement> options = select1.getOptions();
        int itemCount = options.size();
       
        for(int i = 0; i < itemCount; i++)
        {
            System.out.println(options.get(i).getText());
        }
        System.out.println();
        
        Thread.sleep(5000);
        
        System.out.println("Dropdown using Value");
        Select select2 = new Select(driver.findElement(By.id("dropdown3")));
        select2.selectByValue("3");
        
        WebElement firstSelectedOption2 = select2.getFirstSelectedOption();
        String selectedoption2 = firstSelectedOption2.getText();
        System.out.println("Selected Option is :" +selectedoption2 );
        System.out.println();
        
        System.out.println("To Display No of dropdown options");
        Select select3= new Select(driver.findElement(By.className("dropdown")));
        select3.selectByValue("4");
        Thread.sleep(15000);
        
        List<WebElement> options2 = select3.getOptions();
        int size = options2.size();
        System.out.println("The Number of drop down options is "+size);
        System.out.println();
        
        Thread.sleep(5000);
        System.out.println("Selecting a option in a Dropdown using SendKeys ");
        driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Appium");
        System.out.println();
        
        
        System.out.println("Select your program dropdown ");*/
        
        //multi select
        Select multi =new Select(driver.findElement(By.xpath("(//select)[6]")));
        multi.selectByIndex(2);
        multi.selectByVisibleText("Loadrunner");
        multi.selectByValue("3");
        Thread.sleep(5000);
        multi.deselectByIndex(3);
        Thread.sleep(5000);
        multi.selectByValue("1");
        Thread.sleep(5000);
        multi.deselectAll();
        
        
        
        
        
        
        
        
		/*
		 * Select select4 = new Select(driver.findElement(By.xpath(
		 * "//*[@id=\"contentblock\"]/section/div[6]/select/option[1]")));
		 * select4.selectByVisibleText("UFT"); WebElement Option4 =
		 * select4.getFirstSelectedOption(); String text = Option4.getText();
		 * System.out.println("Selected Option is :"+text );
		 */
        
      
	}
	
}

