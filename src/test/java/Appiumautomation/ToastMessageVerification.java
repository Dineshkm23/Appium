package Appiumautomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ToastMessageVerification extends BaseTest {
	
	@Test
	public void toastMessageTest() throws InterruptedException {
		Thread.sleep(3000);
		//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Anju");
		//driver.hideKeyboard();
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();	
		driver.findElement(
				AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"))"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
		
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		
		String toastMsg=driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("name");
		System.out.println("Toast message is :"+toastMsg);
		Assert.assertEquals(toastMsg, "Please enter your name");
	
	}

}
