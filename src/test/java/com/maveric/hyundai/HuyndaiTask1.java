package com.maveric.hyundai;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class HuyndaiTask1 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName", "android");
		cap.setCapability("deviceName", "redmi");
		cap.setCapability("app", "C:\\javaeclipseEclipse\\MobileAutomation\\app\\com.bsl.hyundai_2021-08-09.apk");
		
		AndroidDriver driver=new AndroidDriver (new URL("http://localhost:4723/wd/hub"),cap);
		
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(AppiumBy.xpath("//*[@text='Deny']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Deny']")).click();
        driver.findElement(AppiumBy.xpath("//*[@resource-id='com.bsl.hyundai:id/txt_signup']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Name*']")).sendKeys("MANI");
        driver.findElement(AppiumBy.xpath("//*[@text='Mobile Number*']")).sendKeys("8939746765");
        driver.findElement(AppiumBy.xpath("//*[@text='Email ID*']")).sendKeys("mani@gmail.com");
        driver.findElement(AppiumBy.xpath("//*[@text='Password*']")).sendKeys("Password!@#");
        driver.findElement(AppiumBy.xpath("//*[@text='Confirm Password*']")).sendKeys("Password!@#");
        
        Map<String,Object> map3= new HashMap<String, Object>();
		map3.put("command","input touchscreen swipe 971 1276 982 1045");
		driver.executeScript("mobile: shell", map3);
        
//        Map<String, Object> map3=new HashMap<String, Object>();
//		map3.put("strategy", "-android uiautomator");
//		map3.put("selector", "UiSelector().text(\"Register\")");
//		driver.executeScript("mobile: scroll", map3);
		
		
        driver.findElement(AppiumBy.xpath("//*[@resource-id='com.bsl.hyundai:id/checkAcceptTermsCondition']")).click();
        driver.findElement(AppiumBy.xpath("//*[@text='Register']")).click();
       
        
        driver.quit();
	}
}
