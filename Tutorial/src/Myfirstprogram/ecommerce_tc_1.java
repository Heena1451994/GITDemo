package Myfirstprogram;

import java.net.MalformedURLException;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;



import io.appium.java_client.MobileBy;

import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.android.AndroidElement;



public class ecommerce_tc_1 extends base{



public static void main(String[] args) throws MalformedURLException, InterruptedException {

AndroidDriver<AndroidElement> driver=capabilities();

     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

     driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");

     driver.hideKeyboard();

     driver.findElement(By.xpath("//*[@text='Female']")).click();

     driver.findElement(By.id("android:id/text1")).click();

     

     driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");

  //   driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + containedText + "\").instance(0))"));     

     driver.findElement(By.xpath("//*[@text='Argentina']")).click();

     driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

   

     

     

     

     

     

}

}

