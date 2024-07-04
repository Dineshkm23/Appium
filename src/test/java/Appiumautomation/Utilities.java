package Appiumautomation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Utilities {
	AndroidDriver driver;
	
	
	public Utilities(AndroidDriver driver) {
		this.driver= driver;
	}		

	public void ScrollInto(String text) {
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text("+text+"))"));
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));

	}
	
	public void dragAndDrop(WebElement source, int X, int Y) {

		driver.executeScript("mobile: dragGesture", ImmutableMap.of
				("elementId", ((RemoteWebElement) source).getId(),
				"endX", X,
				"endY",Y
				));
	}
	
	public void swipeGesture(WebElement element, String Direction, float per) {
		//swipe
				((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
						"elementId", ((RemoteWebElement) element).getId(),
					    "direction", Direction,
					    "percent", per
					));
	}

}
