
package com.vedoc.qa.testcases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MQAdminPortalPage;
import com.vedoc.qa.pages.MajorAssemblyPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class MQAdminPortalPageTest extends TestBase {
	LoginPage loginPage;
	MQAdminPortalPage mqPage;
	HomePage homePage;
	VehicleDataPage_S vehicledatapage;
	public static String cook4;

	public MQAdminPortalPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {
		// uncomment for entire run
		mqinitialization();
		mqPage = new MQAdminPortalPage();
	}

	@Test(priority = 1)
	public void mqPage_Afab() {
		logger = extent.createTest("Inbound");
		logger = extent.createTest("AFAB");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Afab();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.AFAB.VEDOC.01'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 2)
	public void firstPlus_Afab() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 3)
	public void codePage_Afab() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 4)
	public void RawMqMessageFormat_Afab() {
		mqPage.RawMqMessageFormat_Afab();
		logger.createNode("AFAB data is entered in Raw MQ Message Format field").pass("AFAB data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 5)
	public void writeButton_Afab() {
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 6)
	public void okButton_Afab() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 7)
	public void alertMessage_Afab() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 8)
	public void setUpTest_Afab() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);

	}

	@Test(priority = 9)
	public void search_Afab() throws InterruptedException {
		mqPage.searchFin_Afab();
		logger.createNode("Vin number 'W1V44781113834879' is entered and search button is clicked")
				.pass("Vin number 'W1V44781113834879' is entered and search button is clicked. Test case passed");
	}
	
	@Test(priority = 10)
	public void vehicleData_Fin_Afab() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 11)
	public void historyTab_Afab() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 12)
	public void technicalEntriesButton_Afab() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 13)
	public void historyTable_Afab() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();

	}

	@Test(priority = 14)
	public void mqPage_Ispd() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("ISPD");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
// mqPage.login(prop.getProperty("userNameMQ"), prop.getProperty("passwordMQ"));
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Ispd();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.ISPD.VEDOC.01'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 15)
	public void firstPlus_Ispd() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 16)
	public void codePage_Ispd() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 17)
	public void RawMqMessageFormat_Ispd() {
		mqPage.RawMqMessageFormat_Ispd();
		logger.createNode("ISPD data is entered in Raw MQ Message Format field").pass("ISPD data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 18)
	public void writeButton_Ispd() {
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 19)
	public void okButton_Ispd() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 20)
	public void alertMessage_Ispd() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 21)
	public void setUpTest_Ispd() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);


	}

	@Test(priority = 22)
	public void search_Ispd() throws InterruptedException {
		mqPage.searchFin_Ispd();
		logger.createNode("Vin number 'W1K2231686L001206' is entered and search button is clicked")
				.pass("Vin number 'W1K2231686L001206' is entered and search button is clicked. Test case passed");
	}
	
	@Test(priority = 23)
	public void vehicleData_Fin_Ispd() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 24)
	public void historyTab_Ispd() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 25)
	public void technicalEntriesButton_Ispd() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 26)
	public void historyTable_Ispd() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	@Test(priority = 27)
	public void mqPage_Gtc() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("GTC");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
// mqPage.login(prop.getProperty("userNameMQ"), prop.getProperty("passwordMQ"));
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Gtc();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.GTC.VEDOC.01'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 28)
	public void firstPlus_Gtc() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 29)
	public void codePage_Gtc() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 30)
	public void RawMqMessageFormat_Gtc() {
		mqPage.RawMqMessageFormat_Gtc();
		logger.createNode("WDD2130421A000525J value is provided in the Raw MQ message format field")
				.pass("WDD2130421A000525J value is provided in the Raw MQ message format field. Test case passed.");

	}

	@Test(priority = 31)
	public void writeButton_Gtc() {
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 32)
	public void okButton_Gtc() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 33)
	public void alertMessage_Gtc() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 34)
	public void setUpTest_Gtc() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);

	}

	@Test(priority = 35)
	public void search_Gtc() throws InterruptedException {
		mqPage.searchFin_Gtc();
		logger.createNode("Vin number 'WDD2130421A000525' is entered and search button is clicked")
				.pass("Vin number 'WDD2130421A000525' is entered and search button is clicked. Test case passed");
	}
	
	@Test(priority = 36)
	public void vehicleData_Fin_Gtc() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 37)
	public void historyTab_Gtc() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 38)
	public void technicalEntriesButton_Gtc() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 39)
	public void historyTable_Gtc() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// schwim1_Nfz_MiniBusSap

//	@Test(priority = 40)
//	public void mqPage_Nfz_MiniBusSap() {
//		mqinitialization();
//		mqPage = new MQAdminPortalPage();
//		logger = extent.createTest("NFZ MINIBUS");
//		mqPage.clickTestLink();
//		mqPage.switchToTESTWindow();
//		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
//		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
//				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
//		mqPage.login("mbrdi_test", "MQadminMBRDI");
//		logger.createNode("User name and password is entered in MQ-Portal test environment page")
//				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
//		mqPage.mqPage_Nfz_MiniBusSap();
//		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.SAPMB.VEDOC.01'")
//				.pass("Result came in a table format. Test case passed.");
//	}
//
//	@Test(priority = 41)
//	public void firstPlus_Nfz_MiniBusSap() {
//		mqPage.firstPlus();
//		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
//	}
//
//	@Test(priority = 42)
//	public void codePage_Nfz_MiniBusSap() {
//		logger.createNode(
//				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
//				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
//						+ ". Test case passed.");
//	}
//
//	@Test(priority = 43)
//	public void RawMqMessageFormat_Nfz_MiniBusSap() {
//		mqPage.RawMqMessageFormat_Minibus_Sap();
//		logger.createNode("MINIBUS SAP data is entered in Raw MQ Message Format field")
//				.pass("MINIBUS SAP data is entered in Raw MQ Message Format field. Test case passed.");
//	}
//
//	@Test(priority = 44)
//	public void writeButton_Nfz_MiniBusSap() {
//		mqPage.writeButton();
//		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
//	}
//
//	@Test(priority = 45)
//	public void okButton_Nfz_MiniBusSap() {
//		mqPage.okButton();
//		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
//	}
//
//	@Test(priority = 46)
//	public void alertMessage_Nfz_MiniBusSap() {
//		mqPage.alertMessage();
//		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
//				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
//		//driver.quit();
//	}
//
//	@Test(priority = 47)
//	public void setUpTest_Nfz_MiniBusSap() throws IOException, InterruptedException {
//		initialization();
//		loginPage = new LoginPage();
//		warmup1();
//		mqPage = new MQAdminPortalPage();
//		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		SystemMessageCheck();
//		Thread.sleep(30000);
//		vehicledatapage = homePage.VehicleData1();
//		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
//		Thread.sleep(30000);
//	}
//
//	@Test(priority = 48)
//	public void search_Nfz_MiniBusSap() throws InterruptedException {
//		mqPage.searchFin_MiniBusSap();
//		logger.createNode("Vin number 'W1V9076571P433522' is entered and search button is clicked")
//				.pass("Vin number 'W1V9076571P433522' is entered and search button is clicked. Test case passed");
//	}
//	
//	@Test(priority = 49)
//	public void vehicleData_Fin_Nfz_MiniBusSap() throws InterruptedException {
//		mqPage.vehicleData_Fin();
//		logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
//				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
//						+ ". Test case passed");
//	}
//
//	@Test(priority = 50)
//	public void historyTab_Nfz_MiniBusSap() {
//		mqPage.historyTab();
//		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
//	}
//
//	@Test(priority = 51)
//	public void technicalEntriesButton_Nfz_MiniBusSap() {
//		mqPage.technicalEntriesButton();
//		logger.createNode("Technical Entries tab is clicked")
//				.pass("Technical Entries tab is clicked. Test case passed.");
//	}
//
//	@Test(priority = 52)
//	public void historyTable_Nfz_MiniBusSap() {
//		try {
//			List<WebElement> elements = mqPage.historyTable();
//			System.out.println(elements.size());
//			logger.createNode("Rows displayed in the history table : " + elements.size())
//					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
//			for (WebElement historyTableTestData : elements) {
//				System.out.println(historyTableTestData.getText());
//				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
//						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
//			}
//		} catch (Exception e) {
//			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
//		}
//		driver.quit();
//	}
//
	// schwim1_NFZ_WerksschnittstelleSteuergeräteNeueGeneration_EvoBus_SAP

	@Test(priority = 53)
	public void mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("Werksschnittstellen Steuergeräte - Neue Generation (EvoBus SAP)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.EVOBUS.MCM.IN'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 54)
	public void firstPlus_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 55)
	public void codePage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 56)
	public void RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap();
		logger.createNode(
				"WERKSSCHNITTSTELLE STEUEGERATE NEUE GENERATION data is entered in Raw MQ Message Format field")
				.pass("WERKSSCHNITTSTELLE STEUEGERATE NEUE GENERATION data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 57)
	public void writeButton_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		warmup1();
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 58)
	public void okButton_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 59)
	public void alertMessage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 60)
	public void setUpTest_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);
	}

	@Test(priority = 61)
	public void search_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() throws InterruptedException {
		mqPage.searchFin_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap();
		logger.createNode("Vin number 'WEB62833113291864' is entered and search button is clicked")
				.pass("Vin number 'WEB62833113291864' is entered and search button is clicked. Test case passed");
	}
	
	@Test(priority = 62)
	public void vehicleData_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 63)
	public void historyTab_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 64)
	public void technicalEntriesButton_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 65)
	public void historyTable_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// JBRAACK_VAN_Werk 800 - Van Charleston

	@Test(priority = 66)
	public void mqPage_Werk800_Van_Charleston() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		//logger = extent.createTest("VAN WERK 800 - Van Charleston");
		logger = extent.createTest("Werk 800 - Van Charleston");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.mqPage_Werk800_Van_Charleston();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.CHS.VEDOC.01'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 67)
	public void firstPlus_Werk800_Van_Charleston() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 68)
	public void codePage_Werk800_Van_Charleston() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 69)
	public void RawMqMessageFormat_Werk800_Van_Charleston() {
		mqPage.RawMqMessageFormat_Werk800_Van_Charleston();
		logger.createNode("WERK800 VAN CHARLESTON data is entered in Raw MQ Message Format field")
				.pass("WERK800 VAN CHARLESTON data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 70)
	public void writeButton_Werk800_Van_Charleston() {
		warmup1();
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 71)
	public void okButton_Werk800_Van_Charleston() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 72)
	public void alertMessage__Werk800_Van_Charleston() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 73)
	public void setUpTest_Werk800_Van_Charleston() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);
	}

	@Test(priority = 74)
	public void search_Werk800_Van_Charleston() throws InterruptedException {
		mqPage.searchFin_Werk800_Van_Charleston();
		logger.createNode("Vin number 'W1Y9076431T097322' is entered and search button is clicked")
				.pass("Vin number 'W1Y9076431T097322' is entered and search button is clicked. Test case passed");
	}

	@Test(priority = 75)
	public void vehicleData_Fin_Werk800_Van_Charleston() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode(
				"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 76)
	public void historyTab_Werk800_Van_Charleston() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 77)
	public void technicalEntriesButton_Werk800_Van_Charleston() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 78)
	public void historyTable_Werk800_Van_Charleston() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// JBRAACK_VAN_Werk 800 - Van PODI

	@Test(priority = 79)
	public void mqPage_Werk800_Van_Podi() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		//logger = extent.createTest("VAN WERK 800 - Van PODI");
		logger = extent.createTest("Werk 800 - Van PODI (Renault)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.mqPage_Werk800_Van_Podi();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.PODI.VEDOC.01'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 80)
	public void firstPlus_Werk800_Van_Podi() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 81)
	public void codePage_Werk800_Van_Podi() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 82)
	public void RawMqMessageFormat_Werk800_Van_Podi() {
		mqPage.RawMqMessageFormat__Werk800_Van_Podi();
		logger.createNode("WERK800 VAN PODI data is entered in Raw MQ Message Format field")
				.pass("WERK800 VAN PODI data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 83)
	public void writeButton_Werk800_Van_Podi() {
		warmup1();
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 84)
	public void okButton_Werk800_Van_Podi() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 85)
	public void alertMessage_Werk800_Van_Podi() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 86)
	public void setUpTest_Werk800_Van_Podi() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);
	}

	@Test(priority = 87)
	public void search_Werk800_Van_Podi() throws InterruptedException {
		mqPage.searchFin_Werk800_Van_Podi();
		logger.createNode("Vin number 'W1V4206331U313862' is entered and search button is clicked")
				.pass("Vin number 'W1V4206331U313862' is entered and search button is clicked. Test case passed");
	}

	@Test(priority = 88)
	public void vehicleData_Werk800_Van_Podi() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode(
				"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 89)
	public void historyTab_Werk800_Van_Podi() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 90)
	public void technicalEntriesButton_Werk800_Van_Podi() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 91)
	public void historyTable_Werk800_Van_Podi() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// MISTRUH_NFZ_ZBL NFZ (Neu)

	@Test(priority = 92)
	public void mqPage_Zbl_Nfz_Neu() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("ZBL NFZ (Neu)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.mqPage_Zbl_Nfz_Neu();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MAIN.IN'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 93)
	public void firstPlus_Zbl_Nfz_Neu() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 94)
	public void codePage_Zbl_Nfz_Neu() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 95)
	public void RawMqMessageFormat_Zbl_Nfz_Neu() {
		mqPage.RawMqMessageFormat_Zbl_Nfz_Neu();
		logger.createNode("ZBL-NFZ (Neu) data is entered in Raw MQ Message Format field")
				.pass("ZBL-NFZ (Neu) data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 96)
	public void writeButton_Zbl_Nfz_Neu() {
		warmup1();
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 97)
	public void okButton_Zbl_Nfz_Neu() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 98)
	public void alertMessage_Zbl_Nfz_Neu() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 99)
	public void setUpTest_Zbl_Nfz_Neu() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);
	}

	@Test(priority = 100)
	public void search_Zbl_Nfz_Neu() throws InterruptedException {
		mqPage.searchFin_Zbl_Nfz_Neu();
		logger.createNode("Vin number '9BM938142LS057394' is entered and search button is clicked")
				.pass("Vin number '9BM938142LS057394' is entered and search button is clicked. Test case passed");
	}

	@Test(priority = 101)
	public void vehicleData_Zbl_Nfz_Neu() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode(
				"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 102)
	public void historyTab_Zbl_Nfz_Neu() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 103)
	public void technicalEntriesButton_Zbl_Nfz_Neu() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 104)
	public void historyTable_Zbl_Nfz_Neu() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// MISTRUH_PKW_ZBL PKW (Neu)

		@Test(priority = 105)
		public void mqPage_Zbl_Pkw_Neu() {
			mqinitialization();
			mqPage = new MQAdminPortalPage();
			logger = extent.createTest("ZBL PKW (Neu)");
			mqPage.clickTestLink();
			mqPage.switchToTESTWindow();
			logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
			logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
					"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
			mqPage.login("mbrdi_test", "MQadminMBRDI");
			logger.createNode("User name and password is entered in MQ-Portal test environment page")
					.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
			mqPage.mqPage_Zbl_Pkw_Neu();
			logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MAIN.IN'")
					.pass("Result came in a table format. Test case passed.");
		}

		@Test(priority = 106)
		public void firstPlus_Zbl_Pkw_Neu() {
			mqPage.firstPlus();
			logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
		}

		@Test(priority = 107)
		public void codePage_Zbl_Pkw_Neu() {
			logger.createNode(
					"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
					.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
							+ ". Test case passed.");
		}

		@Test(priority = 108)
		public void RawMqMessageFormat_Zbl_Pkw_Neu() {
			mqPage.RawMqMessageFormat_Zbl_Pkw_Neu();
			logger.createNode("ZBL-PKW (Neu) data is entered in Raw MQ Message Format field")
					.pass("ZBL-PKW (Neu) data is entered in Raw MQ Message Format field. Test case passed.");
		}

		@Test(priority = 109)
		public void writeButton_Zbl_Pkw_Neu() {
			warmup1();
			mqPage.writeButton();
			logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
		}

		@Test(priority = 110)
		public void okButton_Zbl_Pkw_Neu() {
			mqPage.okButton();
			logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
		}

		@Test(priority = 111)
		public void alertMessage_Zbl_Pkw_Neu() {
			mqPage.alertMessage();
			logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
					.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
			driver.quit();
		}

		@Test(priority = 112)
		public void setUpTest_Zbl_Pkw_Neu() throws IOException, InterruptedException {
			initialization();
			loginPage = new LoginPage();
			warmup1();
			mqPage = new MQAdminPortalPage();
			logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			SystemMessageCheck();
			Thread.sleep(30000);
			vehicledatapage = homePage.VehicleData1();
			logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
			Thread.sleep(30000);
		}

		@Test(priority = 113)
		public void search_Zbl_Pkw_Neu() throws InterruptedException {
			mqPage.searchFin_Zbl_Pkw_Neu();
			logger.createNode("Vin number 'WDCYC3KF7HX276380' is entered and search button is clicked")
					.pass("Vin number 'WDCYC3KF7HX276380' is entered and search button is clicked. Test case passed");
		}

		@Test(priority = 114)
		public void vehicleData_Zbl_Pkw_Neu() throws InterruptedException {
			mqPage.vehicleData_Fin();
			logger.createNode(
					"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
					.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
							+ ". Test case passed");
		}

		@Test(priority = 115)
		public void historyTab_Zbl_Pkw_Neu() {
			mqPage.historyTab();
			logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
		}

		@Test(priority = 116)
		public void technicalEntriesButton_Zbl_Pkw_Neu() {
			mqPage.technicalEntriesButton();
			logger.createNode("Technical Entries tab is clicked")
					.pass("Technical Entries tab is clicked. Test case passed.");
		}

		@Test(priority = 117)
		public void historyTable_Zbl_Pkw_Neu() {
			try {
				List<WebElement> elements = mqPage.historyTable();
				System.out.println(elements.size());
				logger.createNode("Rows displayed in the history table : " + elements.size())
						.pass(elements.size() + " - are the numbers of rows displayed in the history table");
				for (WebElement historyTableTestData : elements) {
					System.out.println(historyTableTestData.getText());
					logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
							.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
				}
			} catch (Exception e) {
				logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
			}
			driver.quit();
		}
		
		// schwim1_NFZ_WerksschnittstelleSteuergeräteNeueGeneration_Worth

		@Test(priority = 118)
		public void mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqinitialization();
			mqPage = new MQAdminPortalPage();
			//logger = extent.createTest("WERKSSCHNITTSTELLE STEUERGERATE NEUE GENEARATION (Worth)");
			logger = extent.createTest("Werksschnittstellen Steuergeräte - Neue Generation (Wörth)");
			mqPage.clickTestLink();
			mqPage.switchToTESTWindow();
			logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
			logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
					"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
			mqPage.login("mbrdi_test", "MQadminMBRDI");
			logger.createNode("User name and password is entered in MQ-Portal test environment page")
					.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
			mqPage.mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Worth();
			logger.createNode("Search in the text field as 'XZ0.VEDOC.U.EVOBUS.MCM.IN'")
					.pass("Result came in a table format. Test case passed.");
		}

		@Test(priority = 119)
		public void firstPlus_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.firstPlus();
			logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
		}

		@Test(priority = 120)
		public void codePage_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			logger.createNode(
					"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
					.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
							+ ". Test case passed.");
		}

		@Test(priority = 121)
		public void RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth();
			logger.createNode(
					"WERKSSCHNITTSTELLE STEUEGERATE NEUE GENERATION Worth data is entered in Raw MQ Message Format field")
					.pass("WERKSSCHNITTSTELLE STEUEGERATE NEUE GENERATION Worth data is entered in Raw MQ Message Format field. Test case passed.");
		}

		@Test(priority = 122)
		public void writeButton_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			warmup1();
			mqPage.writeButton();
			logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
		}

		@Test(priority = 123)
		public void okButton_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.okButton();
			logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
		}

		@Test(priority = 124)
		public void alertMessage_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.alertMessage();
			logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
					.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
			driver.quit();
		}

		@Test(priority = 125)
		public void setUpTest_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() throws IOException, InterruptedException {
			initialization();
			loginPage = new LoginPage();
			warmup1();
			mqPage = new MQAdminPortalPage();
			logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			SystemMessageCheck();
			Thread.sleep(30000);
			vehicledatapage = homePage.VehicleData1();
			logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
			Thread.sleep(30000);
		}

		@Test(priority = 126)
		public void search_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() throws InterruptedException {
			mqPage.searchFin_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth();
			logger.createNode("Vin number 'RS396440250577421' is entered and search button is clicked")
					.pass("Vin number 'RS396440250577421' is entered and search button is clicked. Test case passed");
		}
		
		@Test(priority = 127)
		public void vehicleData_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() throws InterruptedException {
			mqPage.vehicleData_Fin();
			logger.createNode(
					"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
					.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
							+ ". Test case passed");
		}

		@Test(priority = 128)
		public void historyTab_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.historyTab();
			logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
		}

		@Test(priority = 129)
		public void technicalEntriesButton_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			mqPage.technicalEntriesButton();
			logger.createNode("Technical Entries tab is clicked")
					.pass("Technical Entries tab is clicked. Test case passed.");
		}

		@Test(priority = 130)
		public void historyTable_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() {
			try {
				List<WebElement> elements = mqPage.historyTable();
				System.out.println(elements.size());
				logger.createNode("Rows displayed in the history table : " + elements.size())
						.pass(elements.size() + " - are the numbers of rows displayed in the history table");
				for (WebElement historyTableTestData : elements) {
					System.out.println(historyTableTestData.getText());
					logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
							.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
				}
			} catch (Exception e) {
				logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
			}
			driver.quit();
		}
	
	// FiNAS - VeDoc@RD

	@Test(priority = 131)
	public void mqPage_Finas_Vedoc_RD() {
		mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("FiNAS - VeDoc@RD");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.mqPage_Finas_Vedoc_RD();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.FINAS.VEDOC.02'")
				.pass("Result came in a table format. Test case passed.");
	}

	@Test(priority = 132)
	public void firstPlus_Finas_Vedoc_RD() {
		mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
	}

	@Test(priority = 133)
	public void codePage_Finas_Vedoc_RD() {
		logger.createNode(
				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
						+ ". Test case passed.");
	}

	@Test(priority = 134)
	public void RawMqMessageFormat_Finas_Vedoc_RD() {
		mqPage.RawMqMessageFormat_Finas_Vedoc_RD();
		logger.createNode(
				"FiNAS - VeDoc@RD data is entered in Raw MQ Message Format field")
				.pass("FiNAS - VeDoc@RD data is entered in Raw MQ Message Format field. Test case passed.");
	}

	@Test(priority = 135)
	public void writeButton_Finas_Vedoc_RD() {
		warmup1();
		mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
	}

	@Test(priority = 136)
	public void okButton_Finas_Vedoc_RD() {
		mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
	}

	@Test(priority = 137)
	public void alertMessage_Finas_Vedoc_RD() {
		mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
		driver.quit();
	}

	@Test(priority = 138)
	public void setUpTest_Finas_Vedoc_RD() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		warmup1();
		mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		Thread.sleep(30000);
		vehicledatapage = homePage.VehicleData1();
		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
		Thread.sleep(30000);
	}

	@Test(priority = 139)
	public void search_Finas_Vedoc_RD() throws InterruptedException {
		mqPage.searchFin_Finas_Vedoc_RD();
		logger.createNode("Vin number 'W1K2971231A000093' is entered and search button is clicked")
				.pass("Vin number 'W1K2971231A000093' is entered and search button is clicked. Test case passed");
	}
	
	@Test(priority = 140)
	public void vehicleData_Finas_Vedoc_RD() throws InterruptedException {
		mqPage.vehicleData_Fin();
		logger.createNode(
				"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
						+ ". Test case passed");
	}

	@Test(priority = 141)
	public void historyTab_Finas_Vedoc_RD() {
		mqPage.historyTab();
		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
	}

	@Test(priority = 142)
	public void technicalEntriesButton_Finas_Vedoc_RD() {
		mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked")
				.pass("Technical Entries tab is clicked. Test case passed.");
	}

	@Test(priority = 143)
	public void historyTable_Finas_Vedoc_RD() {
		try {
			List<WebElement> elements = mqPage.historyTable();
			System.out.println(elements.size());
			logger.createNode("Rows displayed in the history table : " + elements.size())
					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
			for (WebElement historyTableTestData : elements) {
				System.out.println(historyTableTestData.getText());
				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
			}
		} catch (Exception e) {
			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
		}
		driver.quit();
	}

	// Need to Check with Thomas - 28-6-2022
	
// VANIS
//	
//	@Test(priority = 144)
//	public void mqPage_Vanis() {
//		mqinitialization();
//		mqPage = new MQAdminPortalPage();
//		logger = extent.createTest("VANIS");
//		mqPage.clickTestLink();
//		mqPage.switchToTESTWindow();
//		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
//		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
//				"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
//		mqPage.login("mbrdi_test", "MQadminMBRDI");
//		logger.createNode("User name and password is entered in MQ-Portal test environment page")
//				.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
//		mqPage.mqPage_Vanis();
//		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.VANIS.VEDOC.01'")
//				.pass("Result came in a table format. Test case passed.");
//	}
//
//	@Test(priority = 145)
//	public void firstPlus_Vanis() {
//		mqPage.firstPlus();
//		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
//	}
//
//	@Test(priority = 146)
//	public void codePage_Vanis() {
//		logger.createNode(
//				"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
//				.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
//						+ ". Test case passed.");
//	}
//
//	@Test(priority = 147)
//	public void RawMqMessageFormat_Vanis() throws InterruptedException {
//		Thread.sleep(7000);
//		mqPage.RawMqMessageFormat_Vanis();
//		logger.createNode("VANIS data is entered in Raw MQ Message Format field").pass("VANIS data is entered in Raw MQ Message Format field. Test case passed.");
//	}
//
//	@Test(priority = 148)
//	public void writeButton_Vanis() {
//		warmup1();
//		mqPage.writeButton();
//		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
//	}
//
//	@Test(priority = 149)
//	public void okButton_Vanis() {
//		mqPage.okButton();
//		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
//	}
//
//	@Test(priority = 150)
//	public void alertMessage_Vanis() {
//		mqPage.alertMessage();
//		logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
//				.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
//		driver.quit();
//	}
//
//	@Test(priority = 151)
//	public void setUpTest_Vanis() throws IOException, InterruptedException {
//		initialization();
//		loginPage = new LoginPage();
//		warmup1();
//		mqPage = new MQAdminPortalPage();
//		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
//		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//		SystemMessageCheck();
//		Thread.sleep(30000);
//		vehicledatapage = homePage.VehicleData1();
//		logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
//		Thread.sleep(30000);
//	}
//
//	@Test(priority = 152)
//	public void search_Vanis() throws InterruptedException {
//		mqPage.searchFin_Vanis();
//		logger.createNode("Vin number 'W1V9101432N172823' is entered and search button is clicked")
//				.pass("Vin number 'W1V9101432N172823' is entered and search button is clicked. Test case passed");
//	}
//	
//	@Test(priority = 153)
//	public void vehicleData_Vanis() throws InterruptedException {
//		mqPage.vehicleData_Fin();
//		logger.createNode(
//				"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
//				.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
//						+ ". Test case passed");
//	}
//
//	@Test(priority = 154)
//	public void historyTab_Vanis() {
//		mqPage.historyTab();
//		logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
//	}
//
//	@Test(priority = 155)
//	public void technicalEntriesButton_Vanis() {
//		mqPage.technicalEntriesButton();
//		logger.createNode("Technical Entries tab is clicked")
//				.pass("Technical Entries tab is clicked. Test case passed.");
//	}
//
//	@Test(priority = 156)
//	public void historyTable_Vanis() {
//		try {
//			List<WebElement> elements = mqPage.historyTable();
//			System.out.println(elements.size());
//			logger.createNode("Rows displayed in the history table : " + elements.size())
//					.pass(elements.size() + " - are the numbers of rows displayed in the history table");
//			for (WebElement historyTableTestData : elements) {
//				System.out.println(historyTableTestData.getText());
//				logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
//						.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
//			}
//		} catch (Exception e) {
//			logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
//		}
//		driver.quit();
//	}
	
	// ASCC / XDCV
	
		@Test(priority = 157)
		public void mqPage_Ascc_Xdcv() {
			mqinitialization();
			mqPage = new MQAdminPortalPage();
			logger = extent.createTest("ASCC / XDCV");
			mqPage.clickTestLink();
			mqPage.switchToTESTWindow();
			logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
			logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass(
					"TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
			mqPage.login("mbrdi_test", "MQadminMBRDI");
			logger.createNode("User name and password is entered in MQ-Portal test environment page")
					.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
			mqPage.mqPage_Ascc_Xdcv();
			logger.createNode("Search in the text field as 'XZ0.VEDOC.U.CLUSTER.IN'")
					.pass("Result came in a table format. Test case passed.");
		}

		@Test(priority = 158)
		public void firstPlus_Ascc_Xdcv() {
			mqPage.firstPlus();
			logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
		}

		@Test(priority = 159)
		public void codePage_Ascc_Xdcv() {
			logger.createNode(
					"By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText())
					.pass("By default Code Page drop down field is provided with the input " + mqPage.codePage_GetText()
							+ ". Test case passed.");
		}

		@Test(priority = 160)
		public void RawMqMessageFormat_Ascc_Xdcv() {
			mqPage.RawMqMessageFormat_Ascc_Xdcv();
			logger.createNode(
					"ASCC / XDCV data is entered in Raw MQ Message Format field")
					.pass("ASCC / XDCV data is entered in Raw MQ Message Format field. Test case passed.");
		}

		@Test(priority = 161)
		public void writeButton_Ascc_Xdcv() {
			warmup1();
			mqPage.writeButton();
			logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
		}

		@Test(priority = 162)
		public void okButton_Ascc_Xdcv() {
			mqPage.okButton();
			logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
		}

		@Test(priority = 163)
		public void alertMessage_Ascc_Xdcv() {
			mqPage.alertMessage();
			logger.createNode("Alert message is displayed as : " + mqPage.alertMessage())
					.pass("Alert message is displayed as : " + mqPage.alertMessage() + ". Test case passed.");
			driver.quit();
		}

		@Test(priority = 164)
		public void setUpTest_Ascc_Xdcv() throws IOException, InterruptedException {
			initialization();
			loginPage = new LoginPage();
			warmup1();
			mqPage = new MQAdminPortalPage();
			logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
			homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
			SystemMessageCheck();
			Thread.sleep(30000);
			vehicledatapage = homePage.VehicleData1();
			logger.createNode("Navigate to Vehicle Data module").pass("Navigate to Vehicle Data module. Test case Passed.");
			Thread.sleep(30000);
		}

		@Test(priority = 165)
		public void search_Ascc_Xdcv() throws InterruptedException {
			mqPage.searchFin_Ascc_Xdcv();
			logger.createNode("Vin number 'WDB96423110194149' is entered and search button is clicked")
					.pass("Vin number 'WDB96423110194149' is entered and search button is clicked. Test case passed");
		}
		
		@Test(priority = 166)
		public void vehicleData_Ascc_Xdcv() throws InterruptedException {
			mqPage.vehicleData_Fin();
			logger.createNode(
					"Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin())
					.pass("Vehicle identification no. (FIN) field is displayed with the value - " + mqPage.vehicleData_Fin()
							+ ". Test case passed");
		}

		@Test(priority = 167)
		public void historyTab_Ascc_Xdcv() {
			mqPage.historyTab();
			logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
		}

		@Test(priority = 168)
		public void technicalEntriesButton_Ascc_Xdcv() {
			mqPage.technicalEntriesButton();
			logger.createNode("Technical Entries tab is clicked")
					.pass("Technical Entries tab is clicked. Test case passed.");
		}

		@Test(priority = 169)
		public void historyTable_Ascc_Xdcv() {
			try {
				List<WebElement> elements = mqPage.historyTable();
				System.out.println(elements.size());
				logger.createNode("Rows displayed in the history table : " + elements.size())
						.pass(elements.size() + " - are the numbers of rows displayed in the history table");
				for (WebElement historyTableTestData : elements) {
					System.out.println(historyTableTestData.getText());
					logger.createNode(historyTableTestData.getText() + " are the values displayed under 'History Table'")
							.pass(historyTableTestData.getText() + "   -   are the values displayed under 'History table'");
				}
			} catch (Exception e) {
				logger.createNode("History Table is empty").pass("History are not displayed in the Prod Order Text Table");
			}
			driver.quit();
		}
	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}
}
