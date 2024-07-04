package Appiumautomation;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollDemo extends BaseTest {
	
	@Test
	public void ScrollTest() {
		
		Utilities util= new Utilities(driver);
		String text="Layouts";
	driver.findElement(AppiumBy.accessibilityId("Views")).click();
//	driver.findElement(
//			AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Layouts\"))"));
	
	util.ScrollInto(text);
	
	}

}
