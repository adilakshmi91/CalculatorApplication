package com.calculator.stepdefinition;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Launchingcalculator {
	public static AndroidDriver<WebElement> driver=null;
	@Given("^the user opens the calculator app$")
	public void the_user_opens_the_calculator_app() throws Throwable {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");//"platformName"
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	    cap.setCapability("appPackage", "com.android.calculator2");
		cap.setCapability("appActivity",  "com.android.calculator2.Calculator");
		driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		System.out.println("App Launched");

	}

	@When("^the user adds two numbers$")
	public void the_user_adds_two_numbers() throws Throwable {
	
		driver.findElement(By.id("digit_2")).click();
		driver.findElement(By.id("digit_3")).click();
	    driver.findElement(By.id("op_add")).click();
		driver.findElement(By.id("digit_9")).click();
		driver.findElement(By.id("digit_5")).click();
		driver.findElement(By.id("eq")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.id("result")).getText());

	}

	@And("^takes the square root of that sum$")
	public void takes_the_square_root_of_that_sum() throws Throwable {
		Thread.sleep(5000);
		driver.findElement(By.id("com.android.calculator2:id/pad_advanced")).click();
		driver.findElement(By.id("com.android.calculator2:id/op_sqrt")).click();
		driver.findElement(By.id("digit_1")).click();
		
		driver.findElement(By.id("digit_1")).click();
		driver.findElement(By.id("digit_8")).click();
		
	   
	}

	@And("^multiply it by minus one$")
	public void multiply_it_by_minus_one() throws Throwable {

	}



}
