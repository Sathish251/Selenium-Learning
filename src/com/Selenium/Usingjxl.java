package com.Selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Usingjxl {
	WebDriver d;
	public static void main(String[] args) throws BiffException, IOException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\SELENIUM JARS\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("http://brm.tremplintech.in/web_pages/ord_reg.aspx");
		FileInputStream f= new FileInputStream("C:\\Users\\Admin\\Desktop\\SEL prgm\\data drive.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s1=b.getSheet(0);
        int row= s1.getRows();
        int col = s1.getColumn();
        int shell=s1.getCell();
        
        
		
		

		

	}

}
