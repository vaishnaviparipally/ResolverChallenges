package com.resolver.challenges;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 {
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
	public void dragAndDrop() {
		WebElement btnDragMe = driver.findElement(By.xpath(ResolverConstants.BTN_DRAGME));
		WebElement droppableHolder = driver.findElement(By.xpath(ResolverConstants.DIV_DROPPABLEHOLDER));

		// JavaScript executor performing the drag and drop operation
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("function createEvent(typeOfEvent) {\n" + "var event =document.createEvent(\"CustomEvent\");\n"
				+ "event.initCustomEvent(typeOfEvent,true, true, null);\n" + "event.dataTransfer = {\n" + "data: {},\n"
				+ "setData: function (key, value) {\n" + "this.data[key] = value;\n" + "},\n"
				+ "getData: function (key) {\n" + "return this.data[key];\n" + "}\n" + "};\n" + "return event;\n"
				+ "}\n" + "\n" + "function dispatchEvent(element, event,transferData) {\n"
				+ "if (transferData !== undefined) {\n" + "event.dataTransfer = transferData;\n" + "}\n"
				+ "if (element.dispatchEvent) {\n" + "element.dispatchEvent(event);\n"
				+ "} else if (element.fireEvent) {\n" + "element.fireEvent(\"on\" + event.type, event);\n" + "}\n"
				+ "}\n" + "\n" + "function simulateHTML5DragAndDrop(element, destination) {\n"
				+ "var dragStartEvent =createEvent('dragstart');\n" + "dispatchEvent(element, dragStartEvent);\n"
				+ "var dropEvent = createEvent('drop');\n"
				+ "dispatchEvent(destination, dropEvent,dragStartEvent.dataTransfer);\n"
				+ "var dragEndEvent = createEvent('dragend');\n"
				+ "dispatchEvent(element, dragEndEvent,dropEvent.dataTransfer);\n" + "}\n" + "\n"
				+ "var source = arguments[0];\n" + "var destination = arguments[1];\n"
				+ "simulateHTML5DragAndDrop(source,destination);", btnDragMe, droppableHolder);

		// Verify if Div contains DragMe button
		WebElement verifyDivHasDrag = driver.findElement(By.xpath(ResolverConstants.DIVHASDRAGME));
		if (verifyDivHasDrag != null) {
			Assert.assertEquals(verifyDivHasDrag.getText(), ResolverConstants.DRAGME_TEXT);
		} else {
			Assert.assertTrue(false);
		}

		// Also tried below drag and drop functions but actions were not performing as
		// expected.

		/*
		 * Actions moveDragMe= new Actions(driver);
		 * 
		 * moveDragMe.dragAndDrop(btnDragMe,
		 * droppableHolder).pause(5000).click().pause(5000).release(droppableHolder).
		 * build().perform();
		 */

		/*
		 * Action dragAndDrop=
		 * moveDragMe.clickAndHold(btnDragMe).moveToElement(droppableHolder).click().
		 * release().build().perform(); dragAndDrop.perform();
		 */

	}

	@AfterTest
	public void closeBrowser() {
		// driver.close();
	}
}
