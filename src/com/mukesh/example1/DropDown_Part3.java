package com.mukesh.example1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown_Part3 {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"F:\\Mukesh\\Pen Driver\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		/*
		 * WebElement day = driver.findElement(By.id("day")); WebElement month =
		 * driver.findElement(By.id("month")); WebElement year =
		 * driver.findElement(By.id("year"));
		 */
		
		String month_xpath="//select[@id='month']//option";
		String year_xpath="//select[@id='year']//option";
		String day_xpath="//select[@id='day']//option";
		
		selectDropDownValue(month_xpath,"Feb");
		selectDropDownValue(year_xpath,"1995");
		selectDropDownValue(day_xpath,"18");

	}

	public static void selectDropDownValue(String xpathValue, String value) {
		List<WebElement> monthList = driver.findElements(By.xpath(xpathValue));
		System.out.println(monthList.size());

		for (int i = 0; i < monthList.size(); i++) {
			System.out.println(monthList.get(i).getText());

			if (monthList.get(i).getText().equals(value)) {
				monthList.get(i).click();
				break;
			}
		}

	}

}
