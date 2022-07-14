package com.maveric.petcare;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class PetcareTask1 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "android");
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("app", "C:\\javaeclipseEclipse\\MobileAutomation\\app\\Fetch Pet Care_v4.1.6_apkpure.com.apk");
		
		AndroidDriver driver=new AndroidDriver (new URL("http://localhost:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Need an account?']")).click();
        driver.findElement(AppiumBy.xpath("//*[contains(@text,'Need an account?')]")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='text_zipcode_new']")).sendKeys("10001");
        //driver.findElement(AppiumBy.xpath("//*[@text='Fetch! Pet Care uses a Secure SSL Connection to protect your personal information   Submit']")).click();
        
        
        
        
        
        driver.findElement(AppiumBy.xpath("//*[contains(@text,'Submit')]")).click();
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

        Map<String, Object> map3=new HashMap<String, Object>();
		map3.put("strategy", "-android uiautomator");
		map3.put("selector", "UiSelector().resourceId(\"r_u_fname\")");
		
		driver.executeScript("mobile: scroll", map3);
		
//		Map<String,Object> map3= new HashMap<String, Object>();
//		map3.put("command","input touchscreen swipe 530 1420 530 1120");
//		driver.executeScript("mobile: shell", map3);
		
        System.out.println("****");
        driver.findElement(AppiumBy.xpath("//*[@resource-id='text_u_fname_new']")).sendKeys("MANI");
        driver.findElement(AppiumBy.xpath("//*[@resource-id='text_u_lname_new']")).sendKeys("G");
          driver.findElement(AppiumBy.xpath("//*[@resource-id='text_u_email_new']")).sendKeys("mani@gmail.com");
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
        
        driver.quit();

	}

}
