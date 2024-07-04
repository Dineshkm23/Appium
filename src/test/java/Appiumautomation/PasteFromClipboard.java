package Appiumautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class PasteFromClipboard extends BaseTest {
	
	@Test
	public void PasteFromClipboard() throws InterruptedException {
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
		
		//set values to clip board
		driver.setClipboardText("123456");
		
		//get Value from clip board driver.getClipboardText()
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id=\"android:id/edit\"]"))
			.sendKeys(driver.getClipboardText()); 
		Thread.sleep(2000);
		driver.findElement(By.id("android:id/button1")).click();
	}
	

}
