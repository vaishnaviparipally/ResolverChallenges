package com.resolver.challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver driver;
	WebElement dropdown;
	List<WebElement> listval;

	@BeforeTest
	public void setup() {
		// Initialize the Driver instance
		driver = new ChromeDriver();

		// Navigate to Home page
		driver.get(ResolverConstants.HOMEPAGE_URL);

		// Maximize the browser window
		driver.manage().window().maximize();

	}

	@Test
	public void divSearch() {
		// Search for the given input: 'USA' and Verify the row count
		WebElement search = driver.findElement(By.id(ResolverConstants.BTN_SEARCHME));
		search.sendKeys(ResolverConstants.SEARCH_USA);
		List<WebElement> rows = driver
				.findElements(By.xpath(ResolverConstants.TABLE_ROWS));
		Assert.assertEquals(rows.size(), 2);

		// Clear the Search field and Verify the row count
		search.clear();
		search.sendKeys(Keys.RETURN);
		rows = driver.findElements(By.xpath(ResolverConstants.TABLE_ROWS));
		Assert.assertEquals(rows.size(), 4);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
