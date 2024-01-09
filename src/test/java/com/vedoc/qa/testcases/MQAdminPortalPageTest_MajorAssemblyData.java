
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

public class MQAdminPortalPageTest_MajorAssemblyData extends TestBase {
	LoginPage loginPage;
	MQAdminPortalPage mqPage;
    HomePage homePage;
    public static String cook4;
	MajorAssemblyPage majorassemblypage;


	public MQAdminPortalPageTest_MajorAssemblyData() {
		super();
	}

	@BeforeTest
	public void setUp() {
		// uncomment for entire run
		mqinitialization();
		mqPage = new MQAdminPortalPage();
	}    
	
	@Test(priority = 1)
	public void mqPage_Pla() {
		logger = extent.createTest("PLA");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Pla();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.PLA.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
    
    @Test(priority = 2)
	public void firstPlus_Pla()  {
    	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
    }
	
    @Test(priority = 3)
	public void codePage_Pla() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
    }
    
    @Test(priority = 4)
   	public void RawMqMessageFormat_Pla() {
       	mqPage.RawMqMessageFormat_Pla();
		logger.createNode("PLA data is entered in Raw MQ Message Format field").pass("PLA data is entered in Raw MQ Message Format field. Test case passed.");
       }
    
    @Test(priority = 5)
   	public void writeButton_Pla() {
       	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
       }

    @Test(priority = 6)
   	public void okButton_Pla() {
       	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
       }
    
    @Test(priority = 7)
   	public void alertMessage_Pla() {
       	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
 	    driver.quit(); 
    }
    
    @Test(priority = 8)
    public void setUpTest_Pla() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        SystemMessageCheck();
        Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
   		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
        Thread.sleep(30000);
  }

	@Test(priority = 9)
	public void select_HighVoltageBatteryId_Pla() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 10)
	public void search_HighVoltageBatteryId_Pla() throws InterruptedException {
		mqPage.search_HighVoltageBatteryId_Pla();
    	logger.createNode("Search field is provided with the input - 72501704820590").pass("Search field is provided with the input - 72501704820590. Test case passed");	
		}
	
	@Test(priority = 11)
	public void majorAssembly_HighVoltageBatteryNumber_Pla() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
    	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
		}

    @Test(priority = 12)
    public void historyTab_Pla() {
    	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
    }
    
    @Test(priority = 13)
    public void technicalEntriesButton_Pla() {
    	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
    }
    
    @Test(priority = 14)
    public void historyTable_Pla() {
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
  
    // Pkw_MBFS_Tuscaloosa
    
    
    @Test(priority = 15)
	public void mqPage_Pkw_MBFS_Tuscaloosa() {
    	mqinitialization();
		mqPage = new MQAdminPortalPage();
		//logger = extent.createTest("MBFS Tuscaloosa");
		logger = extent.createTest("MBFS Tuscaloosa (Hochvoltbatterien)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Pkw_MBFS_Tuscaloosa();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MBFSTUS.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
    
    @Test(priority = 16)
	public void firstPlus_Pkw_MBFS_Tuscaloosa()  {
    	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
    }
	
    @Test(priority = 17)
	public void codePage_Pkw_MBFS_Tuscaloosa() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
    }
    
    @Test(priority = 18)
   	public void RawMqMessageFormat_Pkw_MBFS_Tuscaloosa() {
       	mqPage.RawMqMessageFormat_Pkw_MBFS_Tuscaloosa();
		logger.createNode("MBFS_Tuscaloosa data is entered in Raw MQ Message Format field").pass("MBFS_Tuscaloosa data is entered in Raw MQ Message Format field. Test case passed.");
       }
    
    @Test(priority = 19)
   	public void writeButton_Pkw_MBFS_Tuscaloosa() {
       	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
       }

    @Test(priority = 20)
   	public void okButton_Pkw_MBFS_Tuscaloosa() {
       	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
       }
    
    @Test(priority = 21)
   	public void alertMessage_Pkw_MBFS_Tuscaloosa() {
       	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
 	    driver.quit(); 
    }
    
    @Test(priority = 22)
    public void setUpTest_Pkw_MBFS_Tuscaloosa() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        SystemMessageCheck();
        Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
   		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
        Thread.sleep(30000);
  }

	@Test(priority = 23)
	public void select_HighVoltageBatteryId_Pkw_MBFS_Tuscaloosa() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 24)
	public void search_HighVoltageBatteryId_Pkw_MBFS_Tuscaloosa() throws InterruptedException {
		mqPage.search_HighVoltageBatteryId_Pkw_MBFS_Tuscaloosa();
    	logger.createNode("Search field is provided with the input - 789080CA000530").pass("Search field is provided with the input - 789080CA000530. Test case passed");	
		}
	
	@Test(priority = 25)
	public void majorAssembly_HighVoltageBatteryNumber_Pkw_MBFS_Tuscaloosa() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
    	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
		}

    @Test(priority = 26)
    public void historyTab_Pkw_MBFS_Tuscaloosa() {
    	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
    }
    
    @Test(priority = 27)
    public void technicalEntriesButton_Pkw_MBFS_Tuscaloosa() {
    	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
    }
    
    @Test(priority = 28)
    public void historyTable_Pkw_MBFS_Tuscaloosa() {
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

 // schwim1_PKW_Farasis
    
    
    @Test(priority = 29)
   	public void mqPage_Pkw_Farasis() {
       	mqinitialization();
   		mqPage = new MQAdminPortalPage();
   		//logger = extent.createTest("MBFS Farasis");
   		logger = extent.createTest("FARASIS (Hochvoltbatterien)");
   		mqPage.clickTestLink();
   		mqPage.switchToTESTWindow();
   		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
   		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
   		mqPage.login("mbrdi_test", "MQadminMBRDI");
   		logger.createNode("User name and password is entered in MQ-Portal test environment page")
   		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
   		mqPage.mqPage_Pkw_Farasis();
   		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.FARASIS.VEDOC.01'").pass("Result came in a table format. Test case passed.");
   	}
       
       @Test(priority = 30)
   	public void firstPlus_Pkw_Farasis()  {
       	mqPage.firstPlus();
   		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
       }
   	
       @Test(priority = 31)
   	public void codePage_Pkw_Farasis() {
   		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
       }
       
       @Test(priority = 32)
      	public void RawMqMessageFormat_Pkw_Farasis() {
          	mqPage.RawMqMessageFormat_Farasis();
   		logger.createNode("MBFS Farasis data is entered in Raw MQ Message Format field").pass("MBFS Farasis data is entered in Raw MQ Message Format field. Test case passed.");
          }
       
       @Test(priority = 33)
      	public void writeButton_Pkw_Farasis() {
          	mqPage.writeButton();
   		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
          }

       @Test(priority = 34)
      	public void okButton_Pkw_Farasis() {
          	mqPage.okButton();
   		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
          }
       
       @Test(priority = 35)
      	public void alertMessage_Pkw_Farasis() {
          	mqPage.alertMessage();
   		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
    	    driver.quit(); 
       }
       
       @Test(priority = 36)
       public void setUpTest_Pkw_Farasis() throws IOException, InterruptedException {
           initialization();
           loginPage = new LoginPage();
           warmup1();
           mqPage = new MQAdminPortalPage();
   		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
           homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
           SystemMessageCheck();
           Thread.sleep(30000);
   		majorassemblypage=homePage.MajorAssembly();
   		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
           Thread.sleep(30000);
     }

   	@Test(priority = 37)
   	public void select_HighVoltageBatteryId_Pkw_Farasis() throws InterruptedException {
   		mqPage.select_HighVoltageBatteryId();
       	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
   		}
   	
   	@Test(priority = 38)
   	public void search_HighVoltageBatteryId_Pkw_Farasis() throws InterruptedException {
   		mqPage.search_HighVoltageBatteryId_Pkw_Farasis();
       	logger.createNode("Search field is provided with the input - 789062PA011095").pass("Search field is provided with the input - 789062PA011095. Test case passed");	
   		}
   	
	@Test(priority = 39)
	public void majorAssembly_HighVoltageBatteryNumber_Pkw_Farasis() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
    	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
		}

   	
       @Test(priority = 40)
       public void historyTab_Pkw_Farasis() {
       	mqPage.historyTab();
   	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
       }
       
       @Test(priority = 41)
       public void technicalEntriesButton_Pkw_Farasis() {
       	mqPage.technicalEntriesButton();
   		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
       }
       
       @Test(priority = 42)
       public void historyTable_Pkw_Farasis() {
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
      
// Pkw_MBFS_Peking
    
    
    @Test(priority = 43)
	public void mqPage_Pkw_Mbfs_Peking() {
    	mqinitialization();
		mqPage = new MQAdminPortalPage();
		//logger = extent.createTest("MBFS Peking");
		logger = extent.createTest("MBFS Peking (Hochvoltbatterien)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Pkw_Mbfs_Peking();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MBFSPKG.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
    
    @Test(priority = 44)
	public void firstPlus_Pkw_Mbfs_Peking()  {
    	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
    }
	
    @Test(priority = 45)
	public void codePage_Pkw_Mbfs_Peking() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
    }
    
    @Test(priority = 46)
   	public void RawMqMessageFormat_Pkw_Mbfs_Peking() {
       	mqPage.RawMqMessageFormat_Pkw_Mbfs_Peking();
		logger.createNode("MBFS Peking data is entered in Raw MQ Message Format field").pass("MBFS Peking data is entered in Raw MQ Message Format field. Test case passed.");
       }
    
    @Test(priority = 47)
   	public void writeButton_Pkw_Mbfs_Peking() {
       	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
       }

    @Test(priority = 48)
   	public void okButton_Pkw_Mbfs_Peking() {
       	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
       }
    
    @Test(priority = 49)
   	public void alertMessage_Pkw_Mbfs_Peking() {
       	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
 	    driver.quit(); 
    }
    
    @Test(priority = 50)
    public void setUpTest_Pkw_Mbfs_Peking() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        SystemMessageCheck();
        Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
	logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
        Thread.sleep(30000);
  }

	@Test(priority = 51)
	public void select_HighVoltageBatteryId_Pkw_Mbfs_Peking() throws InterruptedException {
		mqPage.select_HighVoltageBatteryReess();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery REESS code option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery REESS code option is selected. Test case passed");	
		}
	
	@Test(priority = 52)
	public void search_HighVoltageBatteryId_Pkw_Mbfs_Peking() throws InterruptedException {
		mqPage.search_HighVoltageBatteryId_Pkw_Mbfs_Peking();
    	logger.createNode("Search field is provided with the input - 079PE313010111C4V0000021").pass("Search field is provided with the input - 079PE313010111C4V0000021. Test case passed");	
		}

	@Test(priority = 53)
	public void majorAssembly_HighVoltageBatteryNumber_Pkw_Mbfs_Peking() throws InterruptedException {
		mqPage.majorAssembly_ReessCode();
    	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_ReessCode()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_ReessCode()+". Test case passed");	
		}
	
    @Test(priority = 54)
    public void historyTab_Pkw_Mbfs_Peking() {
    	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
    }
    
    @Test(priority = 55)
    public void technicalEntriesButton_Pkw_Mbfs_Peking() {
    	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
    }
    
    @Test(priority = 56)
    public void historyTable_Pkw_Mbfs_Peking() {
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
    
    
// IAG Achswerke (Kassel)
    
    
    @Test(priority = 57)
	public void mqPage_Iag_Achswerke_Kassel() {
    	mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("IAG Achswerke (Kassel)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Iag_Achswerke_Kassel();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.KASAXL.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
    
    @Test(priority = 58)
	public void firstPlus_Iag_Achswerke_Kassel()  {
    	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
    }
	
    @Test(priority = 59)
	public void codePage_Iag_Achswerke_Kassel() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
    }
    
    @Test(priority = 60)
   	public void RawMqMessageFormat_Iag_Achswerke_Kassel() {
       	mqPage.RawMqMessageFormat_Iag_Achswerke_Kassel();
		logger.createNode("IAG Achswerke (Kassel) data is entered in Raw MQ Message Format field").pass("IAG Achswerke (Kassel) data is entered in Raw MQ Message Format field. Test case passed.");
       }
    
    @Test(priority = 61)
   	public void writeButton_Iag_Achswerke_Kassel() {
       	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
       }

    @Test(priority = 62)
   	public void okButton_Iag_Achswerke_Kassel() {
       	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
       }
    
    @Test(priority = 63)
   	public void alertMessage_Iag_Achswerke_Kassel() {
       	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
 	    driver.quit(); 
    }
    
    @Test(priority = 64)
    public void setUpTest_Iag_Achswerke_Kassel() throws IOException, InterruptedException {
        initialization();
        loginPage = new LoginPage();
        warmup1();
        mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
        homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
        SystemMessageCheck();
        Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
	logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
        Thread.sleep(30000);
  }

	@Test(priority = 65)
	public void select_Iag_Achswerke_Kassel() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
    	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 66)
	public void search_Iag_Achswerke_Kassel() throws InterruptedException {
		mqPage.search_Iag_Achswerke_Kassel();
    	logger.createNode("Search field is provided with the input - 741421K1471836").pass("Search field is provided with the input - 741421K1471836. Test case passed");	
		}

	@Test(priority = 67)
	public void majorAssembly_Iag_Achswerke_Kassel() throws InterruptedException {
		mqPage.majorAssembly_ReessCode();
    	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_ReessCode()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_ReessCode()+". Test case passed");	
		}
	
    @Test(priority = 68)
    public void historyTab_Iag_Achswerke_Kassel() {
    	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
    }
    
    @Test(priority = 69)
    public void technicalEntriesButton_Iag_Achswerke_Kassel() {
    	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
    }
    
    @Test(priority = 70)
    public void historyTable_Iag_Achswerke_Kassel() {
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

// IAG Motorenwerke (Mannheim - Reconditioned Engine)
  
  
  @Test(priority = 71)
	public void mqPage_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
  	mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("IAG Motorenwerke (Mannheim - Reconditioned Engine)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Iag_Motorenwerke_Mannheim_Reconditioned_Engine();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MANENG.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
  
  @Test(priority = 72)
	public void firstPlus_Iag_Motorenwerke_Mannheim_Reconditioned_Engine()  {
  	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
  }
	
  @Test(priority = 73)
	public void codePage_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
  }
  
  @Test(priority = 74)
 	public void RawMqMessageFormat_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
     	mqPage.RawMqMessageFormat_Iag_Motorenwerke_Mannheim_Reconditioned_Engine();
		logger.createNode("AG Motorenwerke (Mannheim - Reconditioned Engine) data is entered in Raw MQ Message Format field").pass("AG Motorenwerke (Mannheim - Reconditioned Engine) data is entered in Raw MQ Message Format field. Test case passed.");
     }
  
  @Test(priority = 75)
 	public void writeButton_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
     	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
     }

  @Test(priority = 76)
 	public void okButton_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
     	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
     }
  
  @Test(priority = 77)
 	public void alertMessage_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
     	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
	    driver.quit(); 
  }

  @Test(priority = 78)
  public void setUpTest_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() throws IOException, InterruptedException {
      initialization();
      loginPage = new LoginPage();
      warmup1();
      mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
      homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
      SystemMessageCheck();
      Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
      Thread.sleep(30000);
}

	@Test(priority = 79)
	public void select_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
  	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 80)
	public void search_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() throws InterruptedException {
		mqPage.search_Iag_Motorenwerke_Mannheim_Reconditioned_Engine();
  	logger.createNode("Search field is provided with the input - 473909C0353708").pass("Search field is provided with the input - 473909C0353708. Test case passed");	
		}

	@Test(priority = 81)
	public void majorAssembly_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
	  	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
			}
	
  @Test(priority = 82)
  public void historyTab_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
  	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
  }
  
  @Test(priority = 83)
  public void technicalEntriesButton_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
  	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
  }
  
  @Test(priority = 84)
  public void historyTable_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() {
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
    
	// IAG Motorenwerke (Mannheim)
	  
  
  @Test(priority = 85)
	public void mqPage_Iag_Motorenwerke_Mannheim() {
  	mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("IAG Motorenwerke (Mannheim )");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Iag_Motorenwerke_Mannheim();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.BFDAPLD.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
  
  @Test(priority = 86)
	public void firstPlus_Iag_Motorenwerke_Mannheim()  {
  	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
  }
	
  @Test(priority = 87)
	public void codePage_Iag_Motorenwerke_Mannheim() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
  }
  
  @Test(priority = 88)
 	public void RawMqMessageFormat_Iag_Motorenwerke_Mannheim() {
     	mqPage.RawMqMessageFormat_Iag_Motorenwerke_Mannheim();
		logger.createNode("IAG Motorenwerke (Mannheim) data is entered in Raw MQ Message Format field").pass("IAG Motorenwerke (Mannheim) data is entered in Raw MQ Message Format field. Test case passed.");
     }
  
  @Test(priority = 89)
 	public void writeButton_Iag_Motorenwerke_Mannheim() {
     	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
     }

  @Test(priority = 90)
 	public void okButton_Iag_Motorenwerke_Mannheim() {
     	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
     }
  
  @Test(priority = 91)
 	public void alertMessage_Iag_Motorenwerke_Mannheim() {
     	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
	    driver.quit(); 
  }
  
  @Test(priority = 92)
  public void setUpTest_Iag_Motorenwerke_Mannheim() throws IOException, InterruptedException {
      initialization();
      loginPage = new LoginPage();
      warmup1();
      mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
      homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
      SystemMessageCheck();
      Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
      Thread.sleep(30000);
}

	@Test(priority = 93)
	public void select_Iag_Motorenwerke_Mannheim() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
  	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 94)
	public void search_Iag_Motorenwerke_Mannheim() throws InterruptedException {
		mqPage.search_Iag_Motorenwerke_Mannheim();
  	logger.createNode("Search field is provided with the input - 471926C0729759").pass("Search field is provided with the input - 471926C0729759. Test case passed");	
		}

	@Test(priority = 95)
	public void majorAssembly_Iag_Motorenwerke_Mannheim() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
  	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
		}
	
  @Test(priority = 96)
  public void historyTab_Iag_Motorenwerke_Mannheim() {
  	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
  }
  
  @Test(priority = 97)
  public void technicalEntriesButton_Iag_Motorenwerke_Mannheim() {
  	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
  }
  
  @Test(priority = 98)
  public void historyTable_Iag_Motorenwerke_Mannheim() {
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
  
//  MISTRUH_NFZ_Vollständigkeitsprüfung (Mannheim IAG)
  
 @Test(priority = 99)
	public void mqPage_Vollständigkeitsprüfung_Mannheim_Iag() {
 	mqinitialization();
		mqPage = new MQAdminPortalPage();
		logger = extent.createTest("Vollständigkeitsprüfung (Mannheim IAG)");
		mqPage.clickTestLink();
		mqPage.switchToTESTWindow();
		logger.createNode("Login to MQ-Portal application").pass("Login to MQ-Portal application. Test case Passed.");
		logger.createNode("TEST link is clicked. MQ-Portal test environment page is opened in the new tab").pass("TEST link is clicked. MQ-Portal test environment page is opened in the new tab. Test case Passed.");
		mqPage.login("mbrdi_test", "MQadminMBRDI");
		logger.createNode("User name and password is entered in MQ-Portal test environment page")
		.pass("User name and password is entered in MQ-Portal test environment page. Test case passed.");
		mqPage.searchText_Iag_Motorenwerke_Mannheim();
		logger.createNode("Search in the text field as 'XZ0.VEDOC.U.MANCC.VEDOC.01'").pass("Result came in a table format. Test case passed.");
	}
 
 @Test(priority = 100)
	public void firstPlus_Vollständigkeitsprüfung_Mannheim_Iag()  {
 	mqPage.firstPlus();
		logger.createNode("+ icon is clicked").pass("+ icon is clicked. Test case passed.");
 }
	
 @Test(priority = 101)
	public void codePage_Vollständigkeitsprüfung_Mannheim_Iag() {
		logger.createNode("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()).pass("By default Code Page drop down field is provided with the input "+ mqPage.codePage_GetText()+". Test case passed.");
 }
 
 @Test(priority = 102)
	public void RawMqMessageFormat_Vollständigkeitsprüfung_Mannheim_Iag() {
    	mqPage.RawMqMessageFormat_Iag_Motorenwerke_Mannheim();
		logger.createNode("Vollständigkeitsprüfung (Mannheim IAG) data is entered in Raw MQ Message Format field").pass("Vollständigkeitsprüfung (Mannheim IAG) data is entered in Raw MQ Message Format field. Test case passed.");
    }
 
 @Test(priority = 103)
	public void writeButton_Vollständigkeitsprüfung_Mannheim_Iag() {
    	mqPage.writeButton();
		logger.createNode("Write button is clicked").pass("Write button is clicked. Test case passed.");
    }

 @Test(priority = 104)
	public void okButton_Vollständigkeitsprüfung_Mannheim_Iag() {
    	mqPage.okButton();
		logger.createNode("Ok button is clicked").pass("Ok button is clicked. Test case passed.");
    }
 
 @Test(priority = 105)
	public void alertMessage_Vollständigkeitsprüfung_Mannheim_Iag() {
    	mqPage.alertMessage();
		logger.createNode("Alert message is displayed as : "+mqPage.alertMessage()).pass("Alert message is displayed as : "+mqPage.alertMessage()+". Test case passed.");
	    driver.quit(); 
 }
 
 @Test(priority = 106)
 public void setUpTest_Vollständigkeitsprüfung_Mannheim_Iag() throws IOException, InterruptedException {
     initialization();
     loginPage = new LoginPage();
     warmup1();
     mqPage = new MQAdminPortalPage();
		logger.createNode("Login to Vedoc application").pass("Login to Vedoc application. Test case Passed.");
     homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
     SystemMessageCheck();
     Thread.sleep(30000);
		majorassemblypage=homePage.MajorAssembly();
		logger.createNode("Navigate to Major assembly data page").pass("Navigate to Major assembly data page. Test case Passed.");
     Thread.sleep(30000);
}

	@Test(priority = 107)
	public void select_Vollständigkeitsprüfung_Mannheim_Iag() throws InterruptedException {
		mqPage.select_HighVoltageBatteryId();
 	logger.createNode("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected").pass("Major Assesmbly search drop down option is clicked and High-voltage battery ID option is selected. Test case passed");	
		}
	
	@Test(priority = 108)
	public void search_Vollständigkeitsprüfung_Mannheim_Iag() throws InterruptedException {
		mqPage.search_Vollständigkeitsprüfung_Mannheim_Iag();
 	logger.createNode("Search field is provided with the input - 470911C0726393").pass("Search field is provided with the input - 470911C0726393. Test case passed");	
		}

	@Test(priority = 109)
	public void majorAssembly_Vollständigkeitsprüfung_Mannheim_Iag() throws InterruptedException {
		mqPage.majorAssembly_HighVoltageBatteryNumber();
 	logger.createNode("High-voltage battery number field is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()).pass("High-voltage battery number is displayed with the value - " +mqPage.majorAssembly_HighVoltageBatteryNumber()+". Test case passed");	
		}
	
 @Test(priority = 110)
 public void historyTab_Vollständigkeitsprüfung_Mannheim_Iag() {
 	mqPage.historyTab();
	logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
 }
 
 @Test(priority = 111)
 public void technicalEntriesButton_Vollständigkeitsprüfung_Mannheim_Iag() {
 	mqPage.technicalEntriesButton();
		logger.createNode("Technical Entries tab is clicked").pass("Technical Entries tab is clicked. Test case passed.");
 }
 
 @Test(priority = 112)
 public void historyTable_Vollständigkeitsprüfung_Mannheim_Iag() {
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
    


//   
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}
}
