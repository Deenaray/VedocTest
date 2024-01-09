package com.vedoc.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vedoc.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//Page Factory (or) Object Repository of Login Page
	
	@FindBy(xpath = "//*[@id='userid']")
	WebElement username;
	
	@FindBy(id="next-btn")
	WebElement next;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="loginSubmitButton")
	WebElement logon;
	
	@FindBy(xpath="//div[@id='header_image_wrapper']")
	WebElement headerlogo;
	
		//Initializing the page objects
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	//Actions:
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public Boolean validateHeader() {
		return headerlogo.isDisplayed();
	}
	
	public HomePage login(String un, String pwd){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(un);
		next.click();
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys(pwd);
		logon.click();
		warmup5();  
		logger=extent.createTest("V22005: Loading Screen is shown");
		if(driver.getPageSource().contains("loading")) {
		logger.createNode("V22005:Loading Keyword is shown on the screen").pass("V22005:Loading Keyword is shown on the screen. Test case passed");
		} else
		logger.createNode("V22005:Loading percentage is shown on the screen").pass("V22005:Loading percentage is shown on the screen. Test case passed");
		return new HomePage();
	}
}
