package Appiumautomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AppiumDriverLocalService service;
	public static AndroidDriver driver;
	
	@BeforeTest
	public void startAppium() throws MalformedURLException, URISyntaxException {
		service=new AppiumServiceBuilder()
				.withAppiumJS(new File("C:\\Users\\Administrator\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
					.withIPAddress("127.0.0.1").usingPort(4723).build();			
		//service.start();
		UiAutomator2Options option= new UiAutomator2Options();
		option.setDeviceName("Pixel3aAPI35");
		//option.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\ApiDemos-debug.apk");
		//C:\Users\Administrator\eclipse-workspace\Appium\src\test\java\resources\ApiDemos-debug.apk
		
		option.setApp(System.getProperty("user.dir")+"\\src\\test\\java\\resources\\General-Store.apk");
		//C:\Users\Administrator\eclipse-workspace\Appium\src\test\java\resources\ApiDemos-debug.apk
		driver= new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), option);
	}
	
	@AfterTest
	public void stopAppium() {
		driver.quit();
		service.stop();
	}
	
	
}
