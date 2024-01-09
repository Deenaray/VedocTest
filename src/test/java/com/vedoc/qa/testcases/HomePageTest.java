package com.vedoc.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.Set;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class HomePageTest extends TestBase {
	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S VehicleDataPage;
	
	

	public HomePageTest() {
		super();
	}
	@BeforeSuite
	public void setUp(ITestContext context) {
		String apiKey = context.getCurrentXmlTest().getParameter("xrayApiKey");
		// Use apiKey as needed
	}


	@BeforeMethod
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();

	}

	@Test(priority = 1)
	public void HomePageTest() {
		
		logger = extent.createTest("CHROME - Check if the login is getting navigated to Home Page");
		try {
			boolean flag = homePage.validateHomePage();
			if (flag = true) {
				logger.log(Status.INFO, "Login is working");
				logger.log(Status.PASS, "Login Verified. Testcase Passed");
			} else {
				logger.log(Status.INFO, "Login is working");
				logger.log(Status.FAIL, "Login Not working. Testcase failed.");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}



	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
