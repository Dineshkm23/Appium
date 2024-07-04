package Appiumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class DragAndDrop extends BaseTest{
	
	@Test
	public void dragAndDrop() {
		Utilities util= new Utilities(driver);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		//X:655 Y:588
		
//		
//		driver.executeScript("mobile: dragGesture", ImmutableMap.of
//				("elementId", ((RemoteWebElement) source).getId(),
//				"endX", 655,
//				"endY",588
//				));
		
		util.dragAndDrop(source,655,588);
		
		String resultText=driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		
		Assert.assertEquals(resultText, "Dropped!");
		
	}

}
