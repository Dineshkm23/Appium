package Appiumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;

public class OpenSpecificLocation extends BaseTest {

	@Test
	public void miscelaniusTest() throws InterruptedException {
		
		Activity activity= new Activity("io.appium.android.apis", "io.appium.android.apis.preference");
//		driver.startActivity(activity);
		
		// Above code is deprecated in the latest Appium, hence we have to use the below javascript executor.
		
		((JavascriptExecutor) driver).executeScript("mobile: startActivity", ImmutableMap.of(
				"intent", "io.appium.android.apis/io.appium.android.apis.preference"));
//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
//		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
//		driver.findElement(
//				By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout"))
//				.click();
//
//		Thread.sleep(2000);
//		driver.findElement(
//				By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout"))
//		.click();
//		String wifiTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(wifiTitle, "WiFi settings");
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]")).sendKeys("123456");
//		
	}
	
	
}
