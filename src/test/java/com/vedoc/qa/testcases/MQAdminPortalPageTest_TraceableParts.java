
package com.vedoc.qa.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MQAdminPortalPage;
import com.vedoc.qa.pages.MajorAssemblyPage;
import com.vedoc.qa.pages.TraceablePartArrangementModulePage;

public class MQAdminPortalPageTest_TraceableParts extends TestBase {
	LoginPage loginPage;
	MQAdminPortalPage mqPage;
    HomePage homePage;
    public static String cook4;
	TraceablePartArrangementModulePage traceablePartsPage;


	public MQAdminPortalPageTest_TraceableParts() {
		super();
	}

	@BeforeTest
	public void setUp() {
		// uncomment for entire run
		mqinitialization();
		mqPage = new MQAdminPortalPage();
	}    
	
//	@Test(priority = 1)
//	public void mqPage_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//		logger = extent.createTest("IAG Motorenwerke Versorgung MCM Steuergeräte (Mannheim)");
//		mqPage.clickTestLink();
//		mqPage.switchToTESTWindow();
//		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
//		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
//		mqPage.login("mbrdi_test", "MQadminMBRDI");
//		logger.createNode("User name and password is entered in MQ-Portal test environment page")
//		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
//		mqPage.searchText_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim();
//		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MCMMAN.VEDOC.01'").pass("Result came in a table format. Test case passed.");
//	}
//    
//    @Test(priority = 2)
//	public void firstPlus_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim()  {
//    	mqPage.firstPlus();
//		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
//    }
//	
//    @Test(priority = 3)
//	public void codePage_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
//    }
//    
//    @Test(priority = 4)
//   	public void RawMqMessageFormat_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//       	mqPage.RawMqMessageFormat_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim();
//		logger.createNode("IAG Motorenwerke Versorgung MCM Steuergeräte (Mannheim) data is entered in Raw MQ Message Format field").pass("IAG Motorenwerke Versorgung MCM Steuergeräte (Mannheim) data is entered in Raw MQ Message Format field. Test case passed.");
//       }
//    
//    @Test(priority = 5)
//   	public void writeButton_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//       	mqPage.writeButton();
//		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
//       }
//
//    @Test(priority = 6)
//   	public void okButton_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//       	mqPage.okButton();
//		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
//       }
//    
//    @Test(priority = 7)
//   	public void alertMessage_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//       	mqPage.alertMessage();
//		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
// 	  //  driver.quit(); 
//    }
//    
//    @Test(priority = 8)
//    public void setUpTest_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() throws IOException, InterruptedException {
//        initialization();
//        loginPage = new LoginPage();
//        warmup1();
//        mqPage = new MQAdminPortalPage();
//		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
//        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//        SystemMessageCheck();
//        Thread.sleep(30000);
//        traceablePartsPage=homePage.TraceablePartArrangementModule();
//   		logger.createNode("Navigate to Traceable parts page").pass("Navigate to Traceable parts page. Test case Passed.");
//        Thread.sleep(30000);
//  }
//
//	@Test(priority = 9)
//	public void select_History_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() throws InterruptedException {
//		mqPage.traceableParts_History();
//    	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed");	
//		}
//	
//	@Test(priority = 10)
//	public void search_IdCode_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() throws InterruptedException {
//		mqPage.traceableParts_IdCode();
//    	logger.createNode("ID code field is provided with the input - 02A11111").pass("ID code field is provided with the input - 02A11111. Test case passed");	
//		}
//    
//    @Test(priority = 11)
//    public void historyTable_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim() {
//    	 try {
//    			List<WebElement> elements = mqPage.historyTable();
//	System.out.println(elements.size());
//	logger.createNode("Rows displayed in the history table : " + elements.size())
//			.pass(elements.size() + " - are the numbers of rows displayed in the history table");
//	for (WebElement historyTableTestData : elements) {
//		System.out.println(historyTableTestData.getText());
//		logger.createNode(historyTableTestData.getText()
//				+ " are the values displayed under 'History Table'")
//				.pass(historyTableTestData.getText()
//						+ "   -   are the values displayed under 'History table'");
//	}
//    	 } catch (Exception e) {
//             logger.createNode("History Table is empty")
//                          .pass("History are not displayed in the Prod Order Text Table");
//      }
//  	    driver.quit(); 
//}
	
//	Programmierstation (GLC)

	@Test(priority = 1)
	public void mqPage_Programmierstation_Glc() {
		logger = extent.createTest("Programmierstation (GLC)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Programmierstation_Glc();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.GLCMCM.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
    
    @Test(priority = 2)
	public void firstPlus_Programmierstation_Glc()  {
    	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
    }
	
    @Test(priority = 3)
	public void codePage_Programmierstation_Glc() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
    }
    
    @Test(priority = 4)
   	public void RawMqMessageFormat_Programmierstation_Glc() {
       	mqPage.RawMqMessageFormat_Programmierstation_Glc();
		logger.createNode("IAG Motorenwerke Versorgung MCM Steuergeräte (Mannheim) data is entered in Raw MQ Message Format field").pass("IAG Motorenwerke Versorgung MCM Steuergeräte (Mannheim) data is entered in Raw MQ Message Format field. Test case passed.");
       }
    
    @Test(priority = 5)
   	public void writeButton_Programmierstation_Glc() {
       	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
       }

    @Test(priority = 6)
   	public void okButton_Programmierstation_Glc() {
       	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
       }
    
    @Test(priority = 7)
   	public void alertMessage_Programmierstation_Glc() {
       	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
 	    driver.quit(); 
    }
    
    @Test(priority = 8)
    public void setUpTest_Programmierstation_Glc() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        SystemMessageCheck();
        Thread.sleep(30000);
        traceablePartsPage=homePage.TraceablePartArrangementModule();
   		logger.createNode("Navigate to Traceable parts page").pass("Navigate to Traceable parts page. Test case Passed.");
        Thread.sleep(30000);
  }

		@Test(priority = 9)
		public void select_History_Programmierstation_Glc() throws InterruptedException {
			mqPage.traceableParts_History();
	    	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed");	
			}
		
		@Test(priority = 10)
		public void search_IdCode_Programmierstation_Glc() throws InterruptedException {
			mqPage.traceableParts_IdCode();
	    	logger.createNode("ID code field is provided with the input - 02A11111").pass("ID code field is provided with the input - 02A11111. Test case passed");	
			}
	    
	    @Test(priority = 11)
	    public void historyTable_Programmierstation_Glc() {
	    	 try {
	    			List<WebElement> elements = mqPage.historyTable();
		System.out.println(elements.size());
		logger.createNode("Rows displayed in the history table : " + elements.size())
				.pass(elements.size() + " - are the numbers of rows displayed in the history table");
		for (WebElement historyTableTestData : elements) {
			System.out.println(historyTableTestData.getText());
			logger.createNode(historyTableTestData.getText()
					+ " are the values displayed under 'History Table'")
					.pass(historyTableTestData.getText()
							+ "   -   are the values displayed under 'History table'");
		}
	    	 } catch (Exception e) {
	             logger.createNode("History Table is empty")
	                          .pass("History are not displayed in the Prod Order Text Table");
	      }
	  	    driver.quit(); 
	}
	

//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}
}
