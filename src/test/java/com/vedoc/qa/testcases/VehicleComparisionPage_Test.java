package com.vedoc.qa.testcases;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleCoparisionPage;
import org.apache.log4j.Priority;
import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class VehicleComparisionPage_Test extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    VehicleCoparisionPage vehicleCoparisionPage;

    public VehicleComparisionPage_Test(){
        super();
    }
    @BeforeTest
    public void setUp() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        vehicleCoparisionPage = new VehicleCoparisionPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        logger = extent.createTest("(AU) Login to application using Admin User credentials");
        SystemMessageCheck();
        Thread.sleep(30000);
        vehicleCoparisionPage = homePage.VehicleComparision1();
        Thread.sleep(10000);
    }
    @Test(priority = 1)
    public void VehicleComparisionPageTest() throws InterruptedException {
        logger = extent.createTest("(AU) CHROME - Check if the vehicle comparision page is getting loaded");
        try {
            boolean flag = vehicleCoparisionPage.validateVehicleComparisionPage();
            if (flag = true) {
                logger.createNode("Check if vehicle comparision page is getting loaded")
                        .pass("vehicle vehicle comparision is getting loaded. Testcase Passed");
            } else {
                logger.createNode("Check if vehicle comparision page is getting loaded")
                        .fail("vehicle comparision page Not working. Testcase failed");
            }
        } catch (NoSuchElementException e) {
            logger.log(Status.SKIP, "Something wrong with the webelement.");
        }
    }
    @Test(priority=2)
    public void compareVehicle(){
        logger = extent.createTest("U-084 : Search Vehicle and Check Vehicle codes table loaded or not ");
        logger.createNode("Login to application using Admin User credentials");
        vehicleCoparisionPage.inputFinField();
        logger.createNode("Entered Fin W1T96342720711622 in search input field");
        vehicleCoparisionPage.clickloadBaseModelVehiclebutton();
        logger.createNode("Data count after clicking on Base model button is "+vehicleCoparisionPage.datacount());
        vehicleCoparisionPage.vechicleEndNoRange();
        logger.createNode("Vehicle end.No from 602264 and vehicle end.No To is 612264 and additional search code entered as N2E ");
        vehicleCoparisionPage.vechicleComparision();
        warmup5();
        logger.createNode("Data count loaded "+vehicleCoparisionPage.compareVehicledatalink());
        warmup5();
        logger.createNode("Data loaded in table is "+vehicleCoparisionPage.comparedvehicleData());
    }
    @Test(priority = 3)
    public void ReportVehiclecomparision() throws InterruptedException {
        logger=extent.createTest("U-119: Generate report for Vehicle Comparison");
        vehicleCoparisionPage.reportForVehiclecomparision();
    }

    @AfterMethod
    public void teardown1(ITestResult result) throws IOException {

        if (result.getStatus() == ITestResult.SUCCESS) {
            logger.log(Status.PASS, "Test Case passed is " + result.getName());
            String screenshotPath = VehicleDataPageTest.getScreenshot(driver, result.getName());
            logger.addScreenCaptureFromPath(screenshotPath);
        }

        else if (result.getStatus() == ITestResult.FAILURE) {
            logger.log(Status.FAIL, "Test Case Failed is " + result.getName());
            logger.log(Status.FAIL, result.getThrowable());
            String screenshotPath = VehicleDataPageTest.getScreenshot(driver, result.getName());
            logger.addScreenCaptureFromPath(screenshotPath);
        }
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }


}
