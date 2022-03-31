package com.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Double_click {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();//upcasting
	//	WebDriver d1=new WebDriver();//interface
		//ChromeDriver d2=new ChromeDriver();//No Webdriver

		/*driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);

		WebElement dc = driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));
		a.doubleClick(dc).perform();
		Thread.sleep(5000);
//GP<-P<-C
		Alert alrt = driver.switchTo().alert();
		System.out.println("Double Click Alert message is  \n" + alrt.getText());
		alrt.accept();// OK or YES

		Thread.sleep(10000);
		driver.quit();*/
		
		// Interface---->Abstract--->The object creation Possible by Other class object
		// assign
		
		  /* Alert alrt = driver.switchTo().alert();
		   System.out.println("Double Click Alert message is  \n" +alrt.getText());
		   alrt.accept();//OK or YES alrt.dismiss();//No or Cancel
		   alrt.getText();//Alert text taken and Print Thread.sleep(10000);
		   driver.quit();*/
		 

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		driver.manage().window().maximize();

		Actions action1 = new Actions(driver);
		
		//long time wait
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".context-menu-one")));
			
		WebElement rightClickElement = driver.findElement(By.cssSelector(".context-menu-one"));

		action1.contextClick(rightClickElement).build().perform();
		Thread.sleep(3000);
		WebElement rce = driver.findElement(By.cssSelector(".context-menu-icon-paste"));
		Thread.sleep(4000);
		rce.click();
		Thread.sleep(4000);
		//driver.switchTo().alert().accept();

		Alert alert = driver.switchTo().alert();
		String AText = alert.getText();
		System.out.println(AText);
		alert.accept();
		
		
		// By locator =
				// By.cssSelector(".context-menu-one");//span[@class='context-menu-one btn
				// btn-neutral']
						
		// driver.findElement(By.cssSelector(".context-menu-icon-edit")).click();
		// WebElement getCopyText
		// =driver.findElement(By.cssSelector(".context-menu-icon-edit"));
		WebElement getCopyText1 = driver.findElement(By.name("Edit"));
		// getText() method to get the text value
		String GetText = getCopyText1.getText();
		// To print the value
		System.out.println(GetText);
		// To close the browser
		driver.close();

	}
}

