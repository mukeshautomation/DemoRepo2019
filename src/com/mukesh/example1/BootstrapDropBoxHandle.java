package com.mukesh.example1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropBoxHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 
		 //Dynamic wait
		 
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 
		 
		 driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_3");
		 
		 driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		 List<WebElement> list=driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//li//a//lable"));
		 System.out.println(list.size());
		 
		 for(int i=0;i<list.size();i++) {
			 System.out.println(list.get(i).getText());
			 list.get(i).click();
		 }

	}

}
