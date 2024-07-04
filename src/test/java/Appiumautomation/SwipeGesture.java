package Appiumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;

public class SwipeGesture extends BaseTest{

	@Test
	public void swipeGesture() throws InterruptedException
	{
		Utilities util= new Utilities(driver);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		
		WebElement firstImage=driver.findElement(By.xpath("(//android.widget.Gallery)[1]"));
			
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
		
//		//swipe
//		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
//				"elementId", ((RemoteWebElement) firstImage	).getId(),
//			    "direction", "left",
//			    "percent", 0.12
//			));
		
		util.swipeGesture(firstImage, "left", 0.12f);
		
		//driver.findElement(By.xpath("\"(//android.widget.ImageView)[]")).click();
		
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");
		
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).getAttribute("focusable"),"true");
		

		
	}
	
}
