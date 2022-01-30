package com.resolver.challenges;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Test1 {

	WebDriver driver;

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
	public void modalInputs() {

		WebDriverWait wait = new WebDriverWait(driver, 2);

		// Click on Open Modal
		WebElement btnOpenModal = driver.findElement(By.xpath(ResolverConstants.BTN_OPEN_MODAL));
		btnOpenModal.click();

		// Enter the Name
		By byName = By.xpath(ResolverConstants.INPUT_NAME_MODAL);
		WebElement name = wait.until(ExpectedConditions.visibilityOfElementLocated(byName));
		name.sendKeys(ResolverConstants.SENDTEXT_RESOLVER);

		// Enter the City
		driver.findElement(By.id(ResolverConstants.INPUT_CITY_MODAL)).sendKeys(ResolverConstants.SENDTEXT_HYDERABAD);

		driver.findElement(By.xpath(ResolverConstants.BUTTON_ENTER)).click();
		driver.findElement(By.xpath(ResolverConstants.BUTTON_CLOSE)).click();

		// Verify the data entered
		By valuesVisible = By.xpath(ResolverConstants.VERIFY_VALUES_TEST1);
		boolean flag = driver.findElement(valuesVisible).isDisplayed();
		Assert.assertTrue(flag);

	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
