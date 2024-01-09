package com.vedoc.qa.testcases;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.CKDvehiclesPage;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleCoparisionPage;
import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class CKDVehiclePage_Test extends TestBase {
    HomePage homePage;
    LoginPage loginPage;
    CKDvehiclesPage ckDvehiclesPage;

    public CKDVehiclePage_Test() {
        super();
    }
    @BeforeTest
    public void setUp() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        ckDvehiclesPage = new CKDvehiclesPage();
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        logger = extent.createTest("(AU) Login to application using Admin User credentials");
        SystemMessageCheck();
        Thread.sleep(30000);
        ckDvehiclesPage = homePage.CKDVehicle1();
        Thread.sleep(10000);
    }
    @Test(priority = 1)
    public void VehicleComparisionPageTest() throws InterruptedException {
        logger = extent.createTest("(AU) CHROME - Check if the vehicle comparision page is getting loaded");
        try {
            boolean flag = ckDvehiclesPage.validateCKDVehiclePage();
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
    @Test(priority = 2)
    public void modifyCKDData(){
        logger=extent.createTest("U-063: Modify data for CKD plants");
        ckDvehiclesPage.editCKDdata();
        logger.createNode("Edit button clicked and data is successfully modified. Test case passed");
        ckDvehiclesPage.reverseToOriginalvalue();
        logger.createNode("Modified data is reverted back to original value.");
    }
    @Test(priority = 3)
    public void ckdcodesTab(){
        logger = extent.createTest("U-113:(AU) CKD Vehicles Page Codes Tab Test");
        ckDvehiclesPage.ckdCode();
        logger.createNode("CKD Codes tab is clicked successfully.").pass("CKD Codes tab is clicked successfully. Test case passed");
        ckDvehiclesPage.addCode();
        logger.createNode("Code added successfully").pass("Code added successfully. Test case passed");
        ckDvehiclesPage.deletCode();
        logger.createNode("Code deleted Successfully").pass("Code deleted Successfully. Test case passed");
    }
    @Test(priority = 4)
    public void ckdVPDPage(){
        logger=extent.createTest("U-042: (RU) Executing VPD IDs tab of CKD Vehicles module");
        ckDvehiclesPage.vpdTab();
        logger.createNode("VPD ID tab is clicked successfully").pass("VPD ID tab is clicked successfully. Teat case passed");
        ckDvehiclesPage.vpdadd();
        logger.createNode("Coded added as 10006 and Chassis").pass("Coded added as 10006 and Chassis. Test case passed");
        ckDvehiclesPage.vpdFilter();
        logger.createNode("Filter button clicked and input field entered as 10006 successfully").pass("Filter button clicked and input field entered as 10006 successfully. Test case passed");
        ckDvehiclesPage.deletVpd();
        logger.createNode("VPD ID is deleted successfully").pass("VPD ID is deleted successfully. Test case passed");
    }
    @Test(priority =5)
    public void ckdLogs(){
        logger=extent.createTest("U-086:(AU) Show access log");
        ckDvehiclesPage.ckdLogsTab();
        logger.createNode("Logs tab clicked successfully").pass("Logs tab clicked successfully. Test case passed");
        logger.createNode("Write protection logging is clicked and data is loaded").pass("Write protection logging is clicked and data is loaded. Test case passed");
        String returndata=ckDvehiclesPage.loadedLog();
        logger.createNode("loade data in the table is "+returndata).pass("loade data in the table is "+returndata);
    }

    @Test(priority = 6)
    public void ckdHistoryTab() throws InterruptedException {
        logger = extent.createTest("U-113: CKD Vehicles History Tab Test");

        try {
            ckDvehiclesPage.clickckdHistoryTab();

            if(ckDvehiclesPage.HistoryOfDependentObjButton()==true) {
                logger.createNode("History Of Dependent Obj Button").pass("HistoryOfDependentObjButton is displayed ");
            }else {
                logger.createNode("History Of Dependent Obj Button").fail("HistoryOfDependentObjButton is not displayed");
            }

            if(ckDvehiclesPage.TechnicalEnteriesButton()==true) {
                logger.createNode("Technical Enteries Button").pass("TechnicalEnteriesButton is displayed ");
            }else {
                logger.createNode("Technical Enteries Button").fail("TechnicalEnteriesButton is not displayed");
            }

            if(ckDvehiclesPage.FilterButton()==true) {
                logger.createNode("Filter Button").pass("FilterButton is displayed ");
            }else {
                logger.createNode("Filter Button").fail("FilterButton is not displayed");
            }

            if(ckDvehiclesPage.HistoryTable()==true) {
                logger.createNode("History Table").pass("HistoryTable is displayed ");
            }else {
                logger.createNode("History Table").fail("HistoryTable is not displayed");
            }


        } catch (NoSuchElementException e) {
            logger.log(Status.SKIP, "Something wrong with the webelement." + e);
        }
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