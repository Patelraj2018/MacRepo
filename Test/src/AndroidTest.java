import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class AndroidTest { 
	
	public static void main(String[] args) throws MalformedURLException{

		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");

		capabilities.setCapability("platformName", "Android");

		capabilities.setCapability("platformVersion","5.1");

		capabilities.setCapability("deviceName","Emu");

		capabilities.setCapability("app","Users/rajankumarpatel/Documents/app/selendroid-test-app-0.17.0.apk");

		capabilities.setCapability("appPackage","io.selendroid.testapp");

		capabilities.setCapability("appActivity","io.selendroid.testapp.HomeScreenActivity");
       
		
		
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

	}

}
