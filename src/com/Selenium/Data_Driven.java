package com.Selenium;
    import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Iterator;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.DataProvider;
	import org.testng.annotations.Test;

	import jxl.Sheet;
	import jxl.Workbook;
	import jxl.read.biff.BiffException;

	public class Data_Driven {
		WebDriver d;

		@DataProvider(name = "logindata")
		public String[][] loginDataprovider() throws BiffException, IOException {
			String[][] data = getxl();
			return data;
		}

		public String[][] getxl() throws BiffException, IOException {
			FileInputStream xl = new FileInputStream("C:\\Users\\Admin\\Desktop\\SEL prgm\\data drive.xls");
			Workbook workbook = Workbook.getWorkbook(xl);

			//
			Sheet sheet = workbook.getSheet(0);
			 int rowcount = sheet.getRows();
			 int colcount = sheet.getColumns();
			 
			// Workbook b=Workbook.getWorkbook(f);
			//	Sheet s = b.getSheet(0);
			//	int rowcount =s.getRows();

			 
			String testdata[][] = new String[rowcount - 1][colcount];
			for (int i = 1; i < rowcount; i++) {
				for (int j = 0; j < colcount; j++) {
					testdata[i - 1][j] = (sheet.getCell(j, i)).getcontents();
					
				}
			}
			return testdata;
		}

		@Test(dataProvider = "logindata")
		public void f(String U, String P) {
			d.findElement(By.id("txtUsername")).sendKeys(U);
			d.findElement(By.id("txtPassword")).sendKeys(P);
			d.findElement(By.id("btnLogin")).click();
		}

		@BeforeTest
		public void BeforeTest() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver1.exe");
			d = new ChromeDriver();
			d.get("https://opensource-demo.orangehrmlive.com/");
			d.manage().window().maximize();
		}

		@AfterTest
		public void Aftertest() {
			d.quit();
		}
	}



