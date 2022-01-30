package com.resolver.challenges;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {
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
		dropdown = driver.findElement(By.xpath(ResolverConstants.BTN_CLICKME));

	}

	@Test
	public void DropdownValidations() {

		dropdown.click();
		listval = driver.findElements(By.xpath(ResolverConstants.DROPDOWN_LIST));
		// Display the List values in dropdown
		for (WebElement we : listval)
			System.out.println(we.getText());
		searchList();
	}

	public void searchList() {

		WebElement search = driver.findElement(By.id(ResolverConstants.INPUT_SEARCH));
		// Search for the given list value
		search.sendKeys(ResolverConstants.INPUT_SEARCH_ANGULAR);
		List<WebElement> angularList = driver.findElements(By.xpath(ResolverConstants.DROPDOWN_LIST));
		List<String> angularListValues = angularList.stream().map(a -> a.getText()).collect(Collectors.toList());

		if (angularListValues.contains("Angular") && angularListValues.contains("Angular 2")) {
			Assert.assertTrue(true);
			System.out.println("The List Contains only Angular and Angular 2");
		} else {
			Assert.assertTrue(false);
		}
		// Clear the search box
		search.clear();
		search.sendKeys(ResolverConstants.INPUT_SEARCH_REACTJS);
		if (angularListValues.contains("")) {
			Assert.assertTrue(true);
			System.out.println("The List is empty");
		}

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
