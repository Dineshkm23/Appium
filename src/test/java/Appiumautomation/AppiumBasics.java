package Appiumautomation;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AppiumBasics extends BaseTest {
	@Test
	public void WifiSettingsName() throws MalformedURLException, URISyntaxException, InterruptedException {

		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
		
		
		driver.findElement(
				By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout"))
				.click();
		
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout"))
		.click();
		
		String wifiTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(wifiTitle, "WiFi settings");
		driver.findElement(By.id("android:id/edit")).sendKeys("123456");
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
	
		
	}
	

	
}
