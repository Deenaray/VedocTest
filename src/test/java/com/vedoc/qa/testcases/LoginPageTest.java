package com.vedoc.qa.testcases;

import java.io.File;
import javax.sql.rowset.spi.XmlReader;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
	}

	@Test(priority = 1)
	public void loginPageTitleTest() {
		logger = extent.createTest("CHROME - Check if the Title name of the company is correct");

		try {
			String title = loginPage.validateLoginPageTitle();

			if (title.equalsIgnoreCase("Daimler AG")) {
				logger.log(Status.INFO, "Daimler Title check");
				logger.log(Status.PASS, "Title Verified");
			} else {
				logger.log(Status.INFO, "Daimler Title check");
				logger.log(Status.FAIL,
						"The title of the page is incorrect, Please make sure the page title in source code matches the company name");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}

	@Test(priority = 2)
	public void logoTest() {
		logger = extent.createTest("CHROME - Check if the Daimler Logo is getting displayed");
		try {
			boolean flag = loginPage.validateHeader();
			if (flag = true) {
				logger.log(Status.INFO, "Daimler Logo check");
				logger.log(Status.PASS, "Logo Verified. Testcase Passed");
			} else {
				logger.log(Status.INFO, "Daimler Logo check");
				logger.log(Status.FAIL, "Logo is not getting displayed in login Page. Testcase failed.");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
