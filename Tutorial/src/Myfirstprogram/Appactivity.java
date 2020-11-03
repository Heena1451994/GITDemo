package Myfirstprogram;

import java.net.MalformedURLException;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Appactivity {
	public static void main(String[] args) throws MalformedURLException {
 DesiredCapabilities capabilities = new DesiredCapabilities();
	     
	     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
	     capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
	     capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,"45");
	     
	}
}
