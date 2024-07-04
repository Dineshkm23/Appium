package Appiumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DeviceLandscape extends BaseTest{
	
	@Test
	public void DeviceLandscapeTest() throws InterruptedException {
		
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]")).click();
	driver.findElement(
			By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[1]/android.widget.RelativeLayout"))
			.click();

	Thread.sleep(2000);
	// Device rotation
		DeviceRotation landScape= new DeviceRotation(0,0,90);
		driver.rotate(landScape);
		
	driver.findElement(
			By.xpath("//android.widget.ListView[@resource-id=\"android:id/list\"]/android.widget.LinearLayout[2]/android.widget.RelativeLayout"))
	.click();
	String wifiTitle=driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(wifiTitle, "WiFi settings");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]")).sendKeys("123456");
	Thread.sleep(2000);
	driver.findElement(By.id("android:id/button1")).click();
	}
}
