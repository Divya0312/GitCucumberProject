package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginSteps {
	WebDriver driver = new ChromeDriver();
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
	}

	@And("User should able to click the login button")
	public void user_should_able_to_click_the_login_button() {
		driver.findElement(By.xpath("//div[@class='oxd-form-actions orangehrm-login-action']")).click();
	}

	@Then("User should navigate to Dashboard page")
	public void user_should_navigate_to_dashboard_page() {
		System.out.println(driver.getCurrentUrl());
	}
}
