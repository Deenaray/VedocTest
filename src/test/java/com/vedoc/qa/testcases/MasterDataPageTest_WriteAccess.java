    // Successfully running - 27/2/2022
// Went through - no doubt
package com.vedoc.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.http.util.Asserts;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MasterDataPage;

public class MasterDataPageTest_WriteAccess extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	MasterDataPage masterdatapage;
	public static String cook4;

	public MasterDataPageTest_WriteAccess(){
		super();
	}

	@BeforeTest
	public void setUp() throws IOException, InterruptedException {

		initialization();
		loginPage = new LoginPage();
		masterdatapage = new MasterDataPage();
		Thread.sleep(10000);
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		logger = extent.createTest("(AU) Login to application using Admin User credentials");
		masterdatapage = homePage.MasterData();
	}
	
    @Test(priority=1)
  public void codesTab(){
	logger=extent.createTest("U-052: Add, update and delete code under Special Equipment");
  	masterdatapage.codesTab();
	logger.createNode("Codes tab is clicked").pass("Codes tab is clicked successfully. Testcase is passed");
  }

    @Test(priority=2)
    public void codesTab_ShowButton(){
    	masterdatapage.codesTab_ShowButton();
			warmup1();
    	logger.createNode("Show button is clicked").pass("Show button is clicked successfully. Testcase is passed");
    }

    @Test(priority=3)
    public void codesTab_SpecialEquipment_AddCode(){
  	masterdatapage.codesTab_SpecialEquipment_AddCode();
	logger.createNode("Add code button is clicked under Special Equipment").pass("Add code button is clicked under Special Equipment successfully. Testcase is passed");
  }

    @Test(priority=4)
    public void codesTab_AddSpecialEquipment_Category(){
  	masterdatapage.codesTab_AddSpecialEquipment_Category();
	logger.createNode("Category drop down field is provided with the input - CV (1)").pass("Category drop down field is provided with the input - CV (1). Testcase is passed");
    }

    @Test(priority=5)
    public void codesTab_CreateSpecialEquipment_Pg(){
    	masterdatapage.codesTab_AddSpecialEquipment_Pg();
  	logger.createNode("PG drop down field is provided with the input - D not in use").pass("PG drop down field is provided with the input - D not in use. Testcase is passed");
    }

    @Test(priority=6)
    public void codesTab_CreateSpecialEquipment_Code(){
    	masterdatapage.codesTab_SpecialEquipment_Code();
  	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=7)
    public void codesTab_CreateSpecialEquipment_Description(){
    	masterdatapage.codesTab_CreateSpecialEquipment_Designation();
  	logger.createNode("Designation field is provided with the input - Add code (Special Equipment)").pass("Designation field is provided with the input - Add code (Special Equipment). Testcase is passed");
    }

    @Test(priority=8)
    public void codesTab_CreateSpecialEquipment_ValidFrom(){
    	masterdatapage.codesTab_SpecialEquipment_ValidFrom();
  	logger.createNode("Valid Fron field is provided with the input - 04/08/2022").pass("Valid Fron field is provided with the input - 04/08/2022. Testcase is passed");
    }

    @Test(priority=9)
    public void codesTab_CreateSpecialEquipment_AuthorizationCategory(){
    	masterdatapage.codesTab_AuthorizationCategory();
  	logger.createNode("Authorization category drop down field is provided with the input - Standard code").pass("Authorization category drop down field is provided with the input - Standard code. Testcase is passed");
    }

    @Test(priority=10)
    public void codesTab_CreateSpecialEquipment_Checkmark(){
    	masterdatapage.codesTab_Checkmark();
    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
    }

    @Test(priority=11)
    public void codesTab_CreateSpecialEquipment_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=12)
    public void codesTab_CreateSpecialEquipment_Filter(){
    	masterdatapage.codesTab_SpecialEquipmentFilter();
    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Testcase is passed");
    }

    @Test(priority=13)
    public void codesTab_CreateSpecialEquipment_Search(){
    	masterdatapage.codesTab_CreateSpecialEquipment_Search();
    	logger.createNode("Search the table is field is provided with the input - Add code (Special Equipment)").pass("Search the table is field is provided with the input - Add code  (Special Equipment). Testcase is passed");
    }

    @Test(priority=14)
    public void codesTab_AddSpecialEquipment_Result(){
    	masterdatapage.codesTab_SpecialEquipment_Result();
        logger.createNode("The filtered result - " +masterdatapage.codesTab_SpecialEquipment_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_SpecialEquipment_Result() + " is displayed in the table successfully. Test Case Passed");
    }


    @Test(priority=15)
    public void codesTab_EditSpecialEquipment_Button(){
    	masterdatapage.codesTab_EditSpecialEquipment();
    	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Testcase is passed");
    }

    @Test(priority=16)
    public void codesTab_EditSpecialEquipment_Designation(){
    	masterdatapage.codesTab_EditSpecialEquipment_Designation();
  	logger.createNode("Designation field is provided with the input - Edit code (Special Equipment)").pass("Designation field is provided with the input - Edit code (Special Equipment). Testcase is passed");
    }

    @Test(priority=17)
    public void codesTab_EditSpecialEquipment_AuthorizationCategory(){
    	masterdatapage.codesTab_EditSpecialEquipment_AuthorizationCategory();
      	logger.createNode("Authorization category drop down field is edited with the input - Safety-relevant").pass("Authorization category drop down field is edited with the input - Safety-relevant. Testcase is passed");
    }

    @Test(priority=18)
    public void codesTab_EditSpecialEquipment_Checkmark(){
    	masterdatapage.codesTab_Checkmark();
    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
    }

    @Test(priority=19)
    public void codesTab_EditSpecialEquipment_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=20)
    public void codesTab_EditSpecialEquipment_Filter(){
    	masterdatapage.codesTab_SpecialEquipmentFilter();
    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Testcase is passed");
    }

    @Test(priority=21)
    public void codesTab_EditSpecialEquipment_Search(){
    	masterdatapage.codesTab_EditSpecialEquipment_Search();
    	logger.createNode("Search the table is field is provided with the input - Edit code (Special Equipment)").pass("Search the table is field is provided with the input - Edit code (Special Equipment). Testcase is passed");
    }

    @Test(priority=22)
    public void codesTab_EditSpecialEquipment_Result(){
    	masterdatapage.codesTab_SpecialEquipment_Result();
        logger.createNode("The filtered result - " +masterdatapage.codesTab_SpecialEquipment_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_SpecialEquipment_Result() + " is displayed in the table successfully. Test Case Passed");
    }

    @Test(priority=23)
    public void codesTab_SpecialEquipment_Delete(){
    	masterdatapage.codesTab_SpecialEquipment_Delete();
    	logger.createNode("Delete button is clicked").pass("Delete button is clicked successfully. Testcase is passed");
    }

    @Test(priority=24)
    public void codesTab_DeleteSpecialEquipment_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=25)
    public void codesTab_DeleteSpecialEquipment_Filter(){
    	masterdatapage.codesTab_SpecialEquipmentFilter();
    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Testcase is passed");
    }

    @Test(priority=26)
    public void codesTab_DeleteSpecialEquipment_Search(){
    	masterdatapage.codesTab_EditSpecialEquipment_Search();
    	logger.createNode("Search the table is field is provided with the input - Edit code (Special Equipment)").pass("Search the table is field is provided with the input - Edit code (Special Equipment). Testcase is passed");
    }

    @Test(priority=27)
    public void codesTab_SpecialEquipment_FilteredResult(){
                   try {
                                  boolean displayFlag = masterdatapage.codesTab_SpecialEquipment_filteredResult();
                                  if(displayFlag)
                                  logger.createNode("Deleted Special Equipment is displayed").fail("Deleted Special Equipment is displayed. Test case failed");
                                  else
                                                 logger.createNode("Deleted Special Equipment is not displayed").pass("Deleted Special Equipment is not displayed. Test case passed");
                   } catch (NoSuchElementException e) {
                                  logger.createNode("Deleted Special Equipment is not available").pass("Deleted Special Equipment is not available. Test case passed");
                   }
    }


    @Test(priority=28)
    public void codesTab_Paint_AddCode(){
    	logger=extent.createTest("U-052: Add, update and delete code under Paint");
  	masterdatapage.codesTab_Paint_AddCode();
	logger.createNode("Add code button is clicked under Special Equipment").pass("Add code button is clicked under Special Equipment successfully. Testcase is passed");
  }

    @Test(priority=29)
    public void codesTab_AddPaint_Category(){
  	masterdatapage.codesTab_AddPaint_Category();
	logger.createNode("Category drop down field is provided with the input - CV (1)").pass("Category drop down field is provided with the input - CV (1). Testcase is passed");
    }

    @Test(priority=30)
    public void codesTab_AddPaint_Pg(){
    	masterdatapage.codesTab_AddPaint_Pg();
  	logger.createNode("PG drop down field is provided with the input - D not in use").pass("PG drop down field is provided with the input - D not in use. Testcase is passed");
    }

    @Test(priority=31)
    public void codesTab_AddPaint_Code(){
    	masterdatapage.codesTab_AddPaint_Code();
  	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=32)
    public void codesTab_Paint_Kbacolor(){
    	masterdatapage.codesTab_AddPaint_Kbacolor();
  	logger.createNode("KBA color field is provided with the input - 1").pass("KBA color field is provided with the input - 1. Testcase is passed");
    }

    @Test(priority=33)
    public void codesTab_AddPaint_Designation(){
    	masterdatapage.codesTab_AddPaint_Designation();
      	logger.createNode("Designation field is provided with the input - Add code (Paint)").pass("Designation field is provided with the input - Add code (Paint). Testcase is passed");
    }

    @Test(priority=34)
    public void codesTab_AddPaint_Usage(){
    	masterdatapage.codesTab_AddPaint_Usage();
      	logger.createNode("Usage drop down field is provided with the input - Paintwork 1").pass("Usage drop down field is provided with the input - Paintwork 1. Testcase is passed");
    }

    @Test(priority=35)
    public void codesTab_AddPaint_Checkmark(){
    	masterdatapage.codesTab_Checkmark();
    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
    }

    @Test(priority=36)
    public void codesTab_AddPaint_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=37)
    public void codesTab_AddPaint_Filter(){
    	masterdatapage.codesTab_Paint_Filter();
    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Testcase is passed");
    }

    @Test(priority=38)
    public void codesTab_AddPaint_Search(){
    	masterdatapage.codesTab_Code_Search();
    	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=39)
    public void codesTab_AddPaint_Result(){
    	masterdatapage.codesTab_Paint_Result();
        logger.createNode("The filtered result - " +masterdatapage.codesTab_Paint_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_Paint_Result() + " is displayed in the table successfully. Test Case Passed");
    }

    @Test(priority=40)
    public void codesTab_EditPaint_Button(){
    	masterdatapage.codesTab_EditPaint_Button();
    	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Testcase is passed");
    }

    @Test(priority=41)
    public void codesTab_EditPaint_Category(){
  	masterdatapage.codesTab_EditPaint_Category();
	logger.createNode("Category drop down field is edited with the input - G-class").pass("Category drop down field is edited with the input - G-class. Testcase is passed");
    }

    @Test(priority=42)
    public void codesTab_EditPaint_Pg(){
    	masterdatapage.codesTab_EditPaint_Pg();
  	logger.createNode("PG drop down field is edited with the input - I Industrial engine").pass("PG drop down field is edited with the input - I Industrial engine. Testcase is passed");
    }

//    @Test(priority=43)
//    public void codesTab_EditPaint_Kbacolor(){
//    	masterdatapage.codesTab_EditPaint_Kbacolor();
//  	logger.createNode("KBA color field is edited with the input - 2").pass("KBA color field is edited with the input - 2. Testcase is passed");
//    }

    @Test(priority=44)
    public void codesTab_EditPaint_Designation(){
    	masterdatapage.codesTab_EditPaint_Designation();
  	logger.createNode("Designation field is provided with the input - Edit code (Paint)").pass("Designation field is provided with the input - Edit code (Paint). Testcase is passed");
    }

    @Test(priority=45)
    public void codesTab_EditPaint_Usage(){
    	masterdatapage.codesTab_EditPaint_Usage();
      	logger.createNode("Usage drop down field is edited with the input - Paintwork 2").pass("Usage drop down field is edited with the input - Paintwork 2. Testcase is passed");
    }

    @Test(priority=46)
    public void codesTab_EditPaint_Checkmark(){
    	masterdatapage.codesTab_Checkmark();
    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
    }

    @Test(priority=47)
    public void codesTab_EditPaint_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=48)
    public void codesTab_EditPaint_Search(){
    	masterdatapage.codesTab_Code_Search();
    	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=49)
    public void codesTab_EditPaint_Result(){
    	masterdatapage.codesTab_Paint_Result();
        logger.createNode("The filtered result - " +masterdatapage.codesTab_Paint_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_Paint_Result() + " is displayed in the table successfully. Test Case Passed");
    }

    @Test(priority=50)
    public void codesTab_Paint_Delete(){
    	masterdatapage.codesTab_Paint_Delete();
    	logger.createNode("Delete button is clicked").pass("Delete button is clicked successfully. Testcase is passed");
    }

    @Test(priority=51)
    public void codesTab_DeletePaint_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=52)
    public void codesTab_DeletePaint_Search(){
    	masterdatapage.codesTab_Code_Search();
    	logger.createNode("Search the table is field is provided with the input - 000L").pass("Search the table is field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=53)
    public void codesTab_Paint_FilteredResult(){
                   try {
                                  boolean displayFlag = masterdatapage.codesTab_Paint_filteredResult();
                                  if(displayFlag)
                                  logger.createNode("Deleted Paint is displayed").fail("Deleted Paint is displayed. Test case failed");
                                  else
                                                 logger.createNode("Deleted Paint is not displayed").pass("Deleted Paint is not displayed. Test case passed");
                   } catch (NoSuchElementException e) {
                                  logger.createNode("Deleted Paint is not available").pass("Deleted Paint is not available. Test case passed");
                   }
    }

    @Test(priority=54)
    public void codesTab_InteriorEquipment_AddCode(){
    	logger=extent.createTest("U-052: Add, update and delete code under Interior Equipment");
  	masterdatapage.codesTab_InteriorEquipment_AddCode();
	logger.createNode("Add code button is clicked under Interior Equipment").pass("Add code button is clicked under Interior Equipment successfully. Testcase is passed");
  }

    @Test(priority=55)
    public void codesTab_AddInteriorEquipment_Category(){
  	masterdatapage.codesTab_AddInteriorEquipment_Category();
	logger.createNode("Category drop down field is provided with the input - PV (0)").pass("Category drop down field is provided with the input - PV (0). Testcase is passed");
    }

    @Test(priority=56)
    public void codesTab_AddInteriorEquipment_Pg(){
    	masterdatapage.codesTab_AddInteriorEquipment_Pg();
  	logger.createNode("PG drop down field is provided with the input - D not in use").pass("PG drop down field is provided with the input - D not in use. Testcase is passed");
    }

    @Test(priority=57)
    public void codesTab_AddInteriorEquipment_Code(){
    	masterdatapage.codesTab_AddInteriorEquipment_Code();
  	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
    }

    @Test(priority=58)
    public void codesTab_AddInteriorEquipment_Designation(){
    	masterdatapage.codesTab_AddInteriorEquipment_Designation();
      	logger.createNode("Designation field is provided with the input - Add code (Interior Equipment)").pass("Designation field is provided with the input - Add code (Interior Equipment). Testcase is passed");
    }

    @Test(priority=59)
    public void codesTab_AddInteriorEquipment_Checkmark(){
    	masterdatapage.codesTab_Checkmark();
    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
    }

    @Test(priority=60)
    public void codesTab_AddInteriorEquipment_Save(){
    	masterdatapage.codesTab_Save();
    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
    }

    @Test(priority=61)
  public void codesTab_AddInteriorEquipment_Search(){
  	masterdatapage.codesTab_Code_Search();
	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
  }

    @Test(priority=62)
    public void codesTab_AddInteriorEquipment_Result(){
    	masterdatapage.codesTab_InteriorEquipment_Result();
        logger.createNode("The filtered result - " +masterdatapage.codesTab_InteriorEquipment_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_InteriorEquipment_Result() + " is displayed in the table successfully. Test Case Passed");
    }

    @Test(priority=63)
  public void codesTab_EditInteriorEquipment_Button(){
  	masterdatapage.codesTab_EditInteriorEquipment_Button();
  	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Testcase is passed");
  }

  @Test(priority=64)
  public void codesTab_EditInteriorEquipment_Category(){
	masterdatapage.codesTab_EditInteriorEquipment_Category();
	logger.createNode("Category drop down field is edited with the input - G-class").pass("Category drop down field is edited with the input - G-class. Testcase is passed");
  }

  @Test(priority=65)
  public void codesTab_EditInteriorEquipment_Pg(){
  	masterdatapage.codesTab_EditInteriorEquipment_Pg();
	logger.createNode("PG drop down field is edited with the input - H not in use").pass("PG drop down field is edited with the input - H not in use. Testcase is passed");
  }

  @Test(priority=66)
  public void codesTab_EditInteriorEquipment_Designation(){
  	masterdatapage.codesTab_EditInteriorEquipment_Designation();
    	logger.createNode("Designation field is edited with the input - Edit code (Interior Equipment)").pass("Designation field is edited with the input - Edit code (Interior Equipment). Testcase is passed");
  }

  @Test(priority=67)
  public void codesTab_EditInteriorEquipment_Checkmark(){
  	masterdatapage.codesTab_Checkmark();
  	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Testcase is passed");
  }

  @Test(priority=68)
  public void codesTab_EditInteriorEquipment_Save(){
  	masterdatapage.codesTab_Save();
  	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
  }

  @Test(priority=69)
public void codesTab_EditInteriorEquipment_Search(){
	masterdatapage.codesTab_Code_Search();
	logger.createNode("Code field is provided with the input - 000L").pass("Code field is provided with the input - 000L. Testcase is passed");
}

  @Test(priority=70)
  public void codesTab_EditInteriorEquipment_Result(){
  	masterdatapage.codesTab_InteriorEquipment_Result();
      logger.createNode("The filtered result - " +masterdatapage.codesTab_InteriorEquipment_Result() + " is displayed in the table").pass("The filtered result - " +masterdatapage.codesTab_InteriorEquipment_Result() + " is displayed in the table successfully. Test Case Passed");
  }

  @Test(priority=71)
  public void codesTab_InteriorEquipment_Delete(){
  	masterdatapage.codesTab_InteriorEquipment_Delete();
  	logger.createNode("Delete button is clicked").pass("Delete button is clicked successfully. Testcase is passed");
  }

  @Test(priority=72)
  public void codesTab_InteriorEquipment_Save(){
  	masterdatapage.codesTab_Save();
  	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Testcase is passed");
  }

  @Test(priority=73)
  public void codesTab_DeleteInteriorEquipment_Search(){
		masterdatapage.codesTab_Code_Search();
	  	logger.createNode("Search the table is field is provided with the input - 000L").pass("Search the table is field is provided with the input - 000L. Testcase is passed");
  }

  @Test(priority=74)
  public void codesTab_InteriorEquipment_filteredResult(){
                 try {
                                boolean displayFlag = masterdatapage.codesTab_InteriorEquipment_filteredResult();
                                if(displayFlag)
                                logger.createNode("Deleted Interior Equipment is displayed").fail("Deleted Interior Equipment is displayed. Test case failed");
                                else
                                               logger.createNode("Deleted Interior Equipment is not displayed").pass("Deleted Interior Equipment is not displayed. Test case passed");
                 } catch (NoSuchElementException e) {
                                logger.createNode("Deleted Interior Equipment is not available").pass("Deleted Interior Equipment is not available. Test case passed");
                 }
  }
  //75 to 79 provision was here
  @Test(priority=75)
  public void codesTab_ProvisionCode(){
	  logger=extent.createTest("U-197: Manage additional code mapping");
	  	masterdatapage.codesTab_ProvisionCodeTab();
		logger.createNode("Provision Code tab is clicked under Codes").pass("Provision Code tab is clicked under Codes. Testcase is passed");
 }

@Test(priority=76)
  public void codesTab_ProvisionCodeAddEntryButton(){
	  masterdatapage.codesTab_ProvisionCodeAddEntryButton();
		logger.createNode("Add entry button is clicked").pass("Add entry button is clicked. Testcase is passed");
 }

@Test(priority=77)
  public void codesTab_ProvisionCodeAddEntry(){
	  masterdatapage.codesTab_ProvisionCodeAddEntry();
		logger.createNode("New Provision code entry is created").pass("New Provision code entry is created. Testcase is passed");
 }

@Test(priority=78)
  public void codesTab_ProvisionCodeEdit(){
	  masterdatapage.codesTab_ProvisionCodeEdit();
		logger.createNode("Provision code entry is edited").pass("Provision code entry is edited. Testcase is passed");
 }

@Test(priority=79)
  public void codesTab_ProvisionCodeDelete(){
	  masterdatapage.codesTab_ProvisionCodeDelete();
		logger.createNode("Provision Code entry is deleted").pass("Provision Code entry is deleted. Testcase is passed");
 }

/// insert
    //Commented from 75 to 121
  @Test(priority=80)
  public void vehicleModel(){
		logger=extent.createTest("U-137: Manage Model Series Master Data");
		masterdatapage.vehicleModel();
	  	logger.createNode("Vehicle model tab is clicked").pass("Vehicle model tab is clicked. Testcase is passed");
  }

  @Test(priority=81)
  public void vehicleModel_ManageVehicleModel(){
		masterdatapage.vehicleModel_ManageVehicleModel();
	  	logger.createNode("Manage vehcile model tab is clicked").pass("Manage vehcile model tab is clicked. Testcase is passed");
  }

  @Test(priority=82)
  public void manageVehicleModel_ShowData(){
		masterdatapage.manageVehicleModel_ShowData();
	  	logger.createNode("Show data button is clicked").pass("Show data button is clicked. Testcase is passed");
  }

  @Test(priority=83)
  public void manageVehicleModel_ModelSeriesFilterButton(){
		masterdatapage.manageVehicleModel_ModelSeriesFilterButton();
	  	logger.createNode("Model Series Filter button is clicked").pass("Model Series Filter button is clicked. Testcase is passed");
  }

  @Test(priority=84)
  public void manageVehicleModel_SearchTheTable(){
		masterdatapage.manageVehicleModel_SearchTheTable();
	  	logger.createNode("Search the table field is provided with the input - 930").pass("Search the table field is provided with the input - 098. Testcase is passed");
  }

  @Test(priority=85)
  public void manageVehicleModel_Edit(){
		masterdatapage.manageVehicleModel_Edit();
	  	logger.createNode("Edit icon is clicked").pass("Edit icon is clicked. Testcase is passed");
  }

  @Test(priority=86)
  public void manageVehicleModel_EditDesignation(){
		masterdatapage.manageVehicleModel_Designation();
	  	logger.createNode("Designation field is edited with the input - " +randomNumbers_6).pass("Designation field is edited with the input - " +randomNumbers_6+". Testcase is passed");
  }

  @Test(priority=87)
  public void manageVehicleModel_EditBrand(){
		masterdatapage.manageVehicleModel_Brand();
	  	logger.createNode("Model series drop down field is edited with the input - Smart").pass("Model series drop down field is edited with the input - Smart. Testcase is passed");
  }

  @Test(priority=88)
  public void manageVehicleModel_EditCategory(){
		masterdatapage.manageVehicleModel_Category();
	  	logger.createNode("Category drop down field is edited with the input - Van-Düsseldorf (7)").pass("Model series drop down field is edited with the input - Van-Düsseldorf (7). Testcase is passed");
  }

  @Test(priority=89)
  public void manageVehicleModel_CheckMark(){
		masterdatapage.manageVehicleModel_CheckMark();
	  	logger.createNode("Check Mark icon is clicked").pass("Check Mark icon is clicked. Testcase is passed");
  }


  @Test(priority=90)
  public void manageVehicleModel_EditModelSeriesData_Save(){
		masterdatapage.manageVehicleModel_Save();
	  	logger.createNode("Save button is clicked").pass("Save button is clicked. Testcase is passed");
  }

  @Test(priority=91)
  public void manageVehicleModel_EditModelSeriesFilterButton(){
		masterdatapage.manageVehicleModel_ModelSeriesFilterButton();
	  	logger.createNode("Model Series Filter button is clicked").pass("Model Series Filter button is clicked. Testcase is passed");
  }

  @Test(priority=92)
  public void manageVehicleModel_EditModelSeriesFilter_SearchTheTable(){
		masterdatapage.manageVehicleModel_SearchTheTable();
	  	logger.createNode("Search the table field is provided with the input - 098").pass("Search the table field is provided with the input - 098. Testcase is passed");
  }

  @Test(priority=93)
  public void manageVehicleModel_ModelSeriesDataRow(){
		masterdatapage.manageVehicleModel_ModelSeriesDataRow();
	  	logger.createNode("Model Series data table filtered result is " +masterdatapage.manageVehicleModel_ModelSeriesDataRow()).pass("Model Series data table filtered result is " +masterdatapage.manageVehicleModel_ModelSeriesDataRow()+ ". Testcase is passed");
  }

  @Test(priority=94)
  public void manageVehicleModel_AddModelDesignationButton(){
		masterdatapage.manageVehicleModel_AddModelDesignationButton();
	  	logger.createNode("Add model designation button is clicked").pass("Add model designation button is clicked. Testcase is passed");
  }

  @Test(priority=95)
  public void manageVehicleModel_Add_ModelDesignation(){
		masterdatapage.manageVehicleModel_ModelDesignation();
	  	logger.createNode("Model designation field is provided with the input - 2222").pass("Model designation field is provided with the input - 2222. Testcase is passed");
  }

  @Test(priority=96)
  public void manageVehicleModel_AddModel_Designation(){
		masterdatapage.manageVehicleModel_Model_Designation();
	  	logger.createNode("Designation field is provided with the input - Add Designation").pass("Designation field is provided with the input - Add Designation. Testcase is passed");
  }

  @Test(priority=97)
  public void manageVehicleModel_AddBodyType(){
		masterdatapage.manageVehicleModel_BodyType();
	  	logger.createNode("Body Type drop down field is provided with the input - Wagon").pass("Body Type drop down field is provided with the input - Wagon. Testcase is passed");
  }

  @Test(priority=98)
  public void manageVehicleModel_AddCode1(){
		masterdatapage.manageVehicleModel_Code1();
	  	logger.createNode("Code1 field is provided with the input - 1").pass("Code1 field is provided with the input - 1. Testcase is passed");
  }

  @Test(priority=99)
  public void manageVehicleModel_AddCode2(){
		masterdatapage.manageVehicleModel_Code2();
	  	logger.createNode("Code1 field is provided with the input - 2").pass("Code1 field is provided with the input - 2. Testcase is passed");
  }

  @Test(priority=100)
  public void manageVehicleModel_AddCode3(){
		masterdatapage.manageVehicleModel_Code3();
	  	logger.createNode("Code1 field is provided with the input - 3").pass("Code1 field is provided with the input - 3. Testcase is passed");
  }

  @Test(priority=101)
  public void manageVehicleModel_AddCode4(){
		masterdatapage.manageVehicleModel_Code4();
	  	logger.createNode("Code1 field is provided with the input - 4").pass("Code1 field is provided with the input - 4. Testcase is passed");
  }

//  @Test(priority=102)
//  public void manageVehicleModel_ValidFrom(){
//		masterdatapage.manageVehicleModel_ValidFrom();
//	  	logger.createNode("Valid From field is provided with the input - ").pass("Valid From field is provided with the input - 21/09/2022. Testcase is passed");
//  }
//
//  @Test(priority=103)
//  public void manageVehicleModel_ValidTo(){
//		masterdatapage.manageVehicleModel_ValidTo();
//	  	logger.createNode("Valid To field is provided with the input - 21/12/2022").pass("Valid To field is provided with the input - 21/12/2022. Testcase is passed");
//  }

  @Test(priority=104)
  public void manageVehicleModel_AddCheckMark(){
		masterdatapage.manageVehicleModel_CheckMark();
	  	logger.createNode("Check Mark icon is clicked").pass("Check Mark icon is clicked. Testcase is passed");
  }

  @Test(priority=105)
  public void manageVehicleModel_AddSave(){
		masterdatapage.manageVehicleModel_Save();
	  	logger.createNode("Save button is clicked").pass("Save button is clicked. Testcase is passed");
  }

  @Test(priority=106)
  public void manageVehicleModel_Add_ModelDesignationFilter(){
		masterdatapage.manageVehicleModel_ModelDesignationFilter();
	  	logger.createNode("Model designation button is clicked").pass("Model designation button is clicked. Testcase is passed");
  }

  @Test(priority=107)
  public void manageVehicleModel_Add_VehicleModelDesignation_SearchTheTable(){
		masterdatapage.manageVehicleModel_VehicleModelDesignation_SearchTheTable();
	  	logger.createNode("Search the table field is provided with the input - Add Designation").pass("Search the table field is provided with the input - Add Designation. Testcase is passed");
  }

  @Test(priority=108)
  public void manageVehicleModel_Add_VehicleModelDesignationRow(){
		masterdatapage.manageVehicleModel_VehicleModelDesignationRow();
	  	logger.createNode("Vehicle Model Designation table filtered result is " +masterdatapage.manageVehicleModel_VehicleModelDesignationRow()).pass("Vehicle Model Designation table filtered result is " +masterdatapage.manageVehicleModel_VehicleModelDesignationRow()+ ". Testcase is passed");
  }

  @Test(priority=109)
  public void manageVehicleModel_EditVehicleModelDesignation(){
		masterdatapage.manageVehicleModel_EditVehicleModelDesignation();
	  	logger.createNode("Vehicle Model Designation edit icon is clicked").pass("Vehicle Model Designation edit icon is clicked. Testcase is passed");
  }

  @Test(priority=110)
  public void manageVehicleModel_EditModel_Designation(){
		masterdatapage.manageVehicleModel_Edit_Model_Designation();
	  	logger.createNode("Designation field is provided with the input - Edit Designation").pass("Designation field is provided with the input - Edit Designation. Testcase is passed");
  }

  @Test(priority=111)
  public void manageVehicleModel_Edit_BodyType(){
		masterdatapage.manageVehicleModel_Edit_BodyType();
	  	logger.createNode("Body Type drop down field is provided with the input - Chassis").pass("Body Type drop down field is provided with the input - Chassis. Testcase is passed");
  }

  @Test(priority=112)
  public void manageVehicleModel_Edit_Code1(){
		masterdatapage.manageVehicleModel_Edit_Code1();
	  	logger.createNode("Code1 field is provided with the input - 5").pass("Code1 field is provided with the input - 5. Testcase is passed");
  }

  @Test(priority=113)
  public void manageVehicleModel_Edit_Code2(){
		masterdatapage.manageVehicleModel_Edit_Code2();
	  	logger.createNode("Code1 field is provided with the input - 6").pass("Code1 field is provided with the input - 6. Testcase is passed");
  }

  @Test(priority=114)
  public void manageVehicleModel_Edit_Code3(){
		masterdatapage.manageVehicleModel_Edit_Code3();
	  	logger.createNode("Code1 field is provided with the input - 7").pass("Code1 field is provided with the input - 7. Testcase is passed");
  }

  @Test(priority=115)
  public void manageVehicleModel_Edit_Code4(){
		masterdatapage.manageVehicleModel_Edit_Code4();
	  	logger.createNode("Code1 field is provided with the input - 8").pass("Code1 field is provided with the input - 8. Testcase is passed");
  }

  @Test(priority=116)
  public void manageVehicleModel_Edit_CheckMark(){
		masterdatapage.manageVehicleModel_CheckMark();
	  	logger.createNode("Check Mark icon is clicked").pass("Check Mark icon is clicked. Testcase is passed");
  }

  @Test(priority=117)
  public void manageVehicleModel_Edit_Save(){
		masterdatapage.manageVehicleModel_Save();
	  	logger.createNode("Save button is clicked").pass("Save button is clicked. Testcase is passed");
  }

  @Test(priority=118)
  public void manageVehicleModel_Edit_ModelDesignationFilter(){
		masterdatapage.manageVehicleModel_ModelDesignationFilter();
	  	logger.createNode("Model designation button is clicked").pass("Model designation button is clicked. Testcase is passed");
  }

  @Test(priority=119)
  public void manageVehicleModel_VehicleModelDesignation_Edit_SearchTheTable(){
		masterdatapage.manageVehicleModel_VehicleModelDesignation_Edit_SearchTheTable();
	  	logger.createNode("Search the table field is provided with the input - Edit Designation").pass("Search the table field is provided with the input - Edit Designation. Testcase is passed");
  }

  @Test(priority=120)
  public void manageVehicleModel_Edit_VehicleModelDesignationRow(){
	    warmup1();
		masterdatapage.manageVehicleModel_VehicleModelDesignationRow();
	  	logger.createNode("Vehicle Model Designation table filtered result is " +masterdatapage.manageVehicleModel_VehicleModelDesignationRow()).pass("Vehicle Model Designation table filtered result is " +masterdatapage.manageVehicleModel_VehicleModelDesignationRow()+ ". Testcase is passed");
  }

  @Test(priority=121)
  public void manageVehicleModel_Delete_VehicleModelDesignation(){
		masterdatapage.manageVehicleModel_Delete_VehicleModelDesignation();
	  	logger.createNode("Trash button is clicked").pass("Trash button is clicked. Testcase is passed");
  }

  @Test(priority=122)
  public void manageVehicleModel_Delete_Save(){
		masterdatapage.manageVehicleModel_Save();
	  	logger.createNode("Save button is clicked").pass("Save button is clicked. Testcase is passed");
  }

  @Test(priority=123)
  public void manageVehicleModel_Delete_ModelDesignationFilter(){
		masterdatapage.manageVehicleModel_ModelDesignationFilter();
	  	logger.createNode("Model designation button is clicked").pass("Model designation button is clicked. Testcase is passed");
  }

  @Test(priority=124)
  public void manageVehicleModel_VehicleModelDesignation_Delete_SearchTheTable(){
		masterdatapage.manageVehicleModel_VehicleModelDesignation_Edit_SearchTheTable();
	  	logger.createNode("Search the table field is provided with the input - Edit Designation").pass("Search the table field is provided with the input - Edit Designation. Testcase is passed");
  }

  @Test(priority=125)
	public void vehicleModelDesignationRow() throws InterruptedException {
		try {
			masterdatapage.vehicleModelDesignationRow();
			logger.createNode("Edit Model Designation is displayed in the list")
					.fail("Edit Model Designation found. Testecase failed.");
		} catch (Exception e) {
			logger.createNode("Edit Model Designation is not displayed in the list")
					.pass("Edit Model Designation is not found and successfully deleted. Testcase Passed.");
		}
	}


//    @Test(enabled=false)
//	public void CodesDataTest() throws InterruptedException{
//
//		masterdatapage.CodesDataTab_WriteAccess();
//
//		logger=extent.createTest("U-052: Codes Tab of Master Data module");
//		logger.log(Status.INFO, "TestCaseID : TC-080");
//		logger.createNode("Vehicle category selected is - CV (1)").pass("CV is selected successfully. Testcase is passed");
//		logger.createNode("Product Group selected is - D not in use").pass("D not in use is selected successfully. Testcase is passed");
//		logger.createNode("Code entered in the Special Equipmemt Code Tab of the Thinclient is - " +  RandomSpecialEquipmentCode).pass(RandomSpecialEquipmentCode + " - is added successfully. Testcase is passed");
//		logger.createNode("Model Series entered in the Special Equipmemt Code Tab of the Thinclient is - " + RandomModelSeries).pass(RandomModelSeries + " - is added successfully. Testcase is passed");
//		logger.createNode("Model Designation entered in the Special Equipmemt Code Tab of the Thinclient is - " + RandomModelDesignation).pass(RandomModelDesignation + " - is added successfully. Testcase is passed");;
//		logger.createNode("Designation entered in the Special Equipmemt Code Tab of the Thinclient is - Created by MBRDI" );
//
//		masterdatapage.PaintTab();
//
//		logger=extent.createTest("U-052: Paints Tab of Master Data module");
//		logger.createNode("Vehicle category selected is - CV (1)");
//		logger.createNode("Product Group selected is - D not in use");
//		logger.createNode("Code entered in the Paints Tab of the Thinclient is - " +  RandomPaintCode);
//		logger.createNode("Model Series entered in the Paints Tab of the Thinclient is - " + RandomPaintModelSeries);
//		logger.createNode("Model Designation entered in the Paints Tab of the Thinclient is - " + RandomAddModelDesignation);
//		logger.createNode("Designation entered in the PaintsTab of the Thinclient is - Created by MBRDI" );
//
//		masterdatapage.InteriorEquipmentTab();
//
//		logger.createNode("Vehicle category selected is - CV (1)");
//		logger.createNode("Product Group selected is - D not in use");
//		logger.createNode("Code entered in the Interior Equipmemt Code Tab of the Thinclient is - " +  RandomInteriorEquipmentCode);
//		logger.createNode("Model Series entered in the Interior Equipmemt Code Tab of the Thinclient is - " + RandomInteriorEquipmentModelSeries);
//		logger.createNode("Model Designation entered in the Interior Equipmemt Code Tab of the Thinclient is - " + RandomInteriorEquipmentModelDesignation);
//		logger.createNode("Designation entered in the Interior Equipmemt Code Tab of the Thinclient is - Created by MBRDI" );
//
//		masterdatapage.ProvisionCodeTab();
//		logger.createNode("Provision Code entered in the Thinclient is - " +  RandomProvisionCode);
//		logger.createNode("Additional Provision Code entered in the Thinclient is - " +  RandomProvisionAdditionalCode);
//	}
//
////    @Test(priority=75)
////    public void VPDIDsOfMasterDataModule(){
////
////
////    	masterdatapage.VPDID_WriteAccess();
////	//	logger=extent.createTest("U-052: VPD IDs Tab of Master Data Module");
////		logger=extent.createTest("U-096: Update VPD Core Master Data");
////		logger.log(Status.INFO, "TestCaseID : TC-081");
////		logger.createNode("VPD ID Code entered in the Thinclient is - " +  RandomAddVPDCode).pass(RandomAddVPDCode + "VPD ID is updated successfully. Test case is passed");
////		logger.createNode("VPD ID Designation entered in the Thinclient is -  " +  VPDIDs_Designation).pass(VPDIDs_Designation + "VPD ID Designation is updated successfully. Test case is passed");
////
////    }
//
////    @Test(priority=76)
////    public void VehicleModelTabOfMasterDataModule(){
////
////    	masterdatapage.VehicleModelTab_WriteAccess();
////		logger=extent.createTest("U-052: Vehicle Model Tab of Master Data Module");
////		logger.log(Status.INFO, "TestCaseID : TC-082");
////		logger.createNode("Model Series with 000 is selected for editing").pass(VPDIDs_Designation + "Model Series with 000 is updated successfully. Test case is passed");
////		logger.createNode("Designation is updated as - " + VehicleCodeDesignation).pass(VehicleCodeDesignation + "Designation is updated successfully. Test case is passed");
////		logger.createNode("Brand is updated as - Mitsubishi Fuso").pass(VehicleCodeDesignation + "Designation is updated successfully. Test case is passed");
////		logger.createNode("Category is updated as - G-Class (6)").pass("G-Class (6) is updated successfully. Test case is passed");
////
////
////    }
//// kept for reference
//  //  @Test(priority=122)
//
//   // public void ControlUnitVPDIDnoAssignmentTabOfMasterDataModule(){
//
//    //	masterdatapage.ControlUnitVPDIDTab_WriteAccess();
//
//		//logger=extent.createTest("U-052: Control Unit VPD ID no.assignment Tab of Master Data Module");
//    	//logger=extent.createTest("U-141: Show control unit master data");
//		//logger.log(Status.INFO, "TestCaseID : TC-083");
//		//logger.createNode("Diogenes name update in the Thinclient is - " + ControlUnit_DiogenesName).pass(ControlUnit_DiogenesName + "Diogenes name is updated successfully. Test case is passed");
//		//logger.createNode("Short Designation updated in the Thinclient is - " + ControlUnit_ShortDesignation).pass(ControlUnit_ShortDesignation + "Short Designation is updated successfully. Test case is passed");
//		//logger.createNode("SCN VPD Ident updated in the Thinclient is - " + ControlUnit_SCNVPDIdenta).pass(ControlUnit_SCNVPDIdenta + "SCN VPD Ident is updated successfully. Test case is passed");
//    //}
//	@Test(priority=126)
//   	public void ExportControlUnitVPDIDnoAssignmentOfMasterDataModule() throws InterruptedException{
//   		logger=extent.createTest("U-141: Show control unit master data of Master Data module");
//   		masterdatapage.ExportControlUnitVPDIdDataTest();
//   		logger.log(Status.INFO, "TestCaseID: TC-138");
//   		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
//   		logger.createNode("Export Assignment button is clicked & CSV File gets downloaded").pass("Export Assignment button is clicked & CSV File gets downloaded. Test case is passed");
//   		logger.createNode("Count of rows in CSV File is checked").pass("Count of rows in CSV File is checked. Test case is passed");
//   		}
//     @Test(priority=127)
//	public void EditControlUnitVPDIDnoAssignmentOfMasterDataModule() throws InterruptedException{
//		logger=extent.createTest("U-138: Update control unit master data of Master Data module");
//		masterdatapage.EditControlUnitVPDIdDataTest();
//		logger.log(Status.INFO, "TestCaseID: TC-138");
//		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
//		logger.createNode("To click on 'Filter' button and enter the text - 'ABP' to display the relevant results in the table").pass(" Filter button is clicked successfully. Test case is passed");
//		logger.createNode("Record is edited. Short Description field is saved as ABN & SCN VPD Ident. is saved as 30008").pass("Record is edited. Short Description field is saved as ABN & SCN VPD Ident. is saved as 30008. Test case is passed");
//		logger.createNode("'Filter' button is clicked and enter the text - 'ABP' to display the relevant results in the table").pass(" Filter button is clicked successfully. Test case is passed");
//		logger.createNode("Record is edited.Short Description field is reverted back to ABP & SCN VPD Ident. is reverted back to 30007").pass("Record is edited.Short Description field is reverted back to ABP & SCN VPD Ident. is reverted back to 30007. Test case is passed");
//    }
//
//
    @Test(priority=128)
    public void ECU_Component_Aliases_Tab_Test(){

    	masterdatapage.ECU_Component_Aliases_Tab_WriteAccess();
		logger=extent.createTest("U-052: ECU Component Aliases Tab of Master Data Module");
    	logger.log(Status.INFO, "TestCaseID : TC-084");
    	logger.createNode(" ECU component aliases Tab is clicked").pass("ECU component aliases Tab is clicked successfully. Test case is passed");

    	masterdatapage.ECU_Component_Aliases_CreateNewAlias_button();
		logger.createNode(" 'Create Aliases' button is clicked").pass("'Create Aliases' button is clicked successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_AliasID_text();
		logger.createNode("Aliase ID entered in the Thinclient is - " + AliasID).pass(AliasID + " - Aliase ID is updated successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_Designation();
		logger.createNode(" Pencil button in Designation Tab is clicked").pass(" Pencil button is clicked successfully. Test case is passed");

		masterdatapage.ECU_MasterDataModdule_DesignationText();
		logger.createNode("Aliase ID Designation entered in the Thinclient is - " + AliasID_Designation).pass(AliasID_Designation + " Aliase ID Designation is updated successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_UpdateChanges();
		logger.createNode(" Checkmark button is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_SaveButton();
		logger.createNode(" Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient ").pass(" Filter button is clicked successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_FilterButton_Text();
		logger.createNode("Created Aliase ID is searched to see if its saved in the Thinclient - " +  AliasID).pass(AliasID + " Created Aliase ID is searched successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_ResetFilterButton();
		logger.createNode("Reset Filter button is clicked in the Thinclient ").pass(" Reset Filter button is clicked successfully. Test case is passed");

    }

    @Test(priority=129)
    public void ECU_Component_Aliases_Tab_Test_Delete2ndEntry(){

		//logger=extent.createTest("U-052: To create second Aliases ID in ECU Component Aliases Tab of Master Data Module");
		logger=extent.createTest("U-263: Manage control unit component alias master data");
		logger.log(Status.INFO, "TestCaseID : TC-085");


		logger.createNode(" 'Create Aliase' button is clicked").pass(" Create Aliase button is clicked successfully. Test case is passed");
		masterdatapage.ECU_Component_Aliases_CreateNewAlias_button_For2ndEntry();

		logger.createNode("Alias ID2 created in the Thinclient is - " + AliasID1).pass(AliasID1 + " Alias ID2 is created successfully. Test case is passed");
		masterdatapage.ECU_Component_Aliases_AliasID_text_For2ndEntry();

		logger.createNode("Alias ID2 Designation created in the Thinclient is - " + AliasID_Designation1).pass(AliasID_Designation1 + " Alias ID2 Designation is created successfully. Test case is passed");
		masterdatapage.ECU_Component_Aliases_Tab_Designation_For2ndEntry();

		logger.createNode(" Checkmark button is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");
		masterdatapage.ECU_Component_Aliases_Tab_UpdateChanges();

		masterdatapage.ECU_Component_Aliases_Tab_SaveButton();
		logger.createNode(" Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_FilterButton_For2ndEntry();
		logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");


		masterdatapage.ECU_Component_Aliases_Tab_FilterButton_Text_For2ndEntry();
		logger.createNode("Filter button is clicked and created Aliase ID searched is -  " + AliasID1).pass(AliasID1 + " - Alias ID is searched successfully. Test case is passed");

		masterdatapage.ECU_Component_Aliases_Tab_Edit_AliasID();

		logger.createNode("Edited Alias ID2 Designation text in the Thinclient is - " + AliasID_Designation2).pass(AliasID_Designation2 + " - Edited Alias ID2 Designation text is updated successfully. Test case is passed");


    }

// // ---For reference
////    @Test(priority=125)
////    public void CUGroupTab_Test(){
////
////		logger=extent.createTest("U-052: CU Group Tab of Master Data Module");
////    	logger.log(Status.INFO, "TestCaseID : TC-086");
////
////    	masterdatapage.CUGroupTab();
////    	logger.createNode("CU Group Tab is clicked in the Thinclient").pass(" CU Group Tab is clicked successfully. Test case is passed");
////
////    	masterdatapage.CUGroupTab_AddEntry_Button();
////		logger.createNode("'Add entry' button is clicked in the Thinclient").pass(" Add Entry button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Identifier();
////		logger.createNode("Identifier updated in the Thinclient is - " + CUGroup_Identifier).pass(CUGroup_Identifier + " is updated successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Designation();
////		logger.createNode("Pencil button is clicked in the Thinclient").pass(" Pencil button is clicked successfully. Test case is passed");
////
////		masterdatapage.MasterDataManagement_ModalDialog_CUGroup();
////		logger.createNode("Designation updated in the Thinclient is - " + CUGroup_Designation).pass(CUGroup_Designation + " Designation is updated successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__SaveButton();
////		logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__FilterButton();
////		logger.createNode("Filter button is clicked and the Identifier code created is searched in the Thinclient- " + CUGroup_Identifier).pass(CUGroup_Identifier + " Identifier is searched successfully. Test case is passed");
////
////    }
//
////    @Test(priority=126)
////    public void CUGroupTab_Test_toDelete2ndEntry(){
////
////		//logger=extent.createTest("U-052:  To create second Identifier in CU Group Tab of Master Data Module");
////		logger=extent.createTest("U-175: Update control unit group master data");
////		logger.log(Status.INFO, "TestCaseID : TC-087");
////
////		masterdatapage.CUGroupTab_AddEntry_Button_2ndEntry();
////		logger.createNode("Click on the 'Add entry' button in the Thinclient to create second Identifier").pass(" Add Entry button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Identifier_For2ndEntry();
////		logger.createNode("Identifier 2 updated in the Thinclient is - " + CUGroup_Identifier1).pass(CUGroup_Identifier1 + " is updated successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Designation();
////		logger.createNode("Pencil button is clicked in the Thinclient").pass(" Pencil button is clicked successfully. Test case is passed");
////
////		masterdatapage.MasterDataManagement_ModalDialog_CUGroup_2ndEnrty();
////		logger.createNode("Designation 2 updated in the Thinclient is - " + CUGroup_Designation1).pass(CUGroup_Designation1 + " Designation is updated successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__SaveButton();
////		logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__FilterButton_2ndEntry();
////		logger.createNode("Filter button is clicked and the Identifier 2 text created is searched in the Thinclient - " + CUGroup_Identifier1).pass(CUGroup_Identifier1 + " Identifier is searched successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Designation();
////		logger.createNode("Pencil button is clicked in the Thinclient to make edit").pass(" Pencil button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab_Designation();
////		logger.createNode("Pencil button is clicked in the Thinclient").pass(" Pencil button is clicked successfully. Test case is passed");
////
////		masterdatapage.MasterDataManagement_ModalDialog_CUGroup_3rdEnrty();
////		logger.createNode("Designation 2 edited in the Thinclient as - Created By MBRDI ").pass(" Created By MBRDI is updated successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__SaveButton();
////		logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__FilterButton_2ndEntry();
////		logger.createNode("Filter button is clicked and the Identifier 2 text created is searched in the Thinclient - " + CUGroup_Identifier1).pass(CUGroup_Identifier1 + " Identifier is searched successfully. Test case is passed");
////
////
////		masterdatapage.CUGroup_DeleteIdentifier();
////		logger.createNode(CUGroup_Identifier1 + " - Identifier 2 created is deleted in the Thinclient").pass(CUGroup_Identifier1 + "  is deleted successfully. Test case is passed");
////
////		masterdatapage.CUGroupTab__SaveButton();
////		logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");
////    }
////  ---For reference
////
////
//// /*   ************DG Designations Tab*******************  */
    //Kartik
    /* show DG designation data  */
    @Test(priority = 130 )
	public void DG_DesignationTab_ShowDesignGroups_MasterData() throws InterruptedException {
		logger = extent.createTest("U-140:(AU) DG Designation tab: Show design groups master data");

		warmup5();
		masterdatapage.DGDesignatinTab_click();
		logger.createNode("DG Designation tab is clicked").pass("DG Designation tab is clicked. Test case passed.");
		warmup5();

		masterdatapage.DGDesignatin_TableCountValue();

		int DesignationGroupCount= masterdatapage.Fetch_DesignationGroupCount();
		logger.createNode("Design group master data is displayed").pass("The total count of design group master data is-"+DesignationGroupCount+". Test case passed.");
		warmup5();
		masterdatapage.DGDesignationTab_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test case passed.");
		warmup6();

		//pass text-1
		masterdatapage.DGDesignationTab_FilterSearchText("11");
		int FilteredCount= masterdatapage.Fetch_DesignationGroupCount();
		ExtentTest DG_Filter = logger.createNode("Text passed to filter is- 11")
				.pass("Total results displayed for the filter- 11 is-"+FilteredCount+". Test case passed.");
		warmup6();

		if(FilteredCount>=1) {
			for(int i=1; i<=FilteredCount; i++) {

				String DG = masterdatapage.Fetch_DG_designationData(i, 1);
				warmup5();
				String designation = masterdatapage.Fetch_DG_designationData(i, 2);
				DG_Filter.pass(DG+"-"+designation+". Test case passed.");
			}
		}else {
			DG_Filter.pass("No data match for the given filter text . Test case passed.");
		}

		warmup6();
		//pass text-2
		masterdatapage.DGDesignationTab_FilterSearchText("Chassis");
		int FilteredCount2= masterdatapage.Fetch_DesignationGroupCount();
		ExtentTest DG_Filter2 = logger.createNode("Text passed to filter is- Chassis")
				                           .pass("Total results displayed for the filter- Chassis is-"+FilteredCount2+". Test case passed.");

		if(FilteredCount2>=1) {
			for(int i=1; i<=FilteredCount2; i++) {

				String DG = masterdatapage.Fetch_DG_designationData(i, 1);
				warmup();
				String designation = masterdatapage.Fetch_DG_designationData(i, 2);
				DG_Filter2.pass(DG+" - "+designation+". Test case passed.");
			}
		}else {
			DG_Filter2.pass("No data match for the given filter text . Test case passed.");
		}


		warmup6();
		//pass text-3
		masterdatapage.DGDesignationTab_FilterSearchText("101");
		int FilteredCount3= masterdatapage.Fetch_DesignationGroupCount();
		ExtentTest DG_Filter3 = logger.createNode("Text passed to filter is- 101")
				                           .pass("Total results displayed for the filter- 101 is-"+FilteredCount3+". Test case passed.");

		if(FilteredCount3>=1) {
			for(int i=1; i<=FilteredCount3; i++) {

				String DG = masterdatapage.Fetch_DG_designationData(i, 1);
				warmup();
				String designation = masterdatapage.Fetch_DG_designationData(i, 2);
				DG_Filter3.pass(DG+" - "+designation+". Test case passed.");
			}
		}else {
			DG_Filter3.pass("No data match for the given filter text. Test case passed.");
		}

		warmup();
		masterdatapage.DGDesignationTab_FilterButton();
		logger.createNode("Cancel filter button is clicked").pass("Cancel filter button is clicked. Test case passed.");

		masterdatapage.dgDesignation_tableExport();

		//To verify data from .csv file
		String fileName= masterdatapage.GetDownloadedFileName_NewTab();
		System.out.println("url 1-"+driver.getCurrentUrl());
		int dataCountInCSV= masterdatapage.getRecordsCountInCSV_fromFile(fileName);
		Assert.assertEquals(dataCountInCSV, DesignationGroupCount);
		logger.createNode("Export table button is clicked & CSV File gets downloaded").pass("Count of rows in CSV File is matched")
		.pass("Count of rows in CSV File is-"+dataCountInCSV);

    }
    //Kartik over


//  /*   ************ElectricalVariantsTab*******************    */
    @Test(priority=131)
    public void ElectricalVariantsTab_Test(){

		logger=extent.createTest("U-199: Electrical Variants Tab of Master Data Module");
		logger.log(Status.INFO, "TestCaseID : TC-088");

    	masterdatapage.Electrical_Variants_Tab_click();
		logger.createNode("Electrical Variants Tab is clicked").pass(" Electrical Variants Tab is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_AddElectroVariantbutton();
		logger.createNode(" 'Add Electrical Variant' is clicked").pass(" Add Electrical Variant is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_ElectroVariantPrefix();
		logger.createNode("Electrical Variant prefix added in the Thinclient is - " + ElectricalVariantPrefix + ElectricalVariantPrefix1).pass(ElectricalVariantPrefix + ElectricalVariantPrefix1 + " Electrical Variant prefix  is added successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_Designation();
		logger.createNode(" Designation button is clicked").pass(" Designation is clicked successfully. Test case is passed");

		masterdatapage.ModalDialog_ElectricalVariant();
		logger.createNode(" Designation text entered in Thinclient is - " + ElectricalVariant_Designation).pass(ElectricalVariant_Designation + " Electrical Variant Designation is added successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_SaveChanges();
		logger.createNode(" Click on the checkmark button to save the entry").pass(" Checkmark is clicked successfully. Test case is passed");;

		masterdatapage.Electrical_Variants_Savebutton();
		logger.createNode(" Click on the save button to update").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton();
		logger.createNode("Filter button is clicked to search for the Electrical Variant created").pass(" Filter button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton_text();
		logger.createNode(ElectricalVariantPrefix + ElectricalVariantPrefix1 + " entry is searched to check if it's saved").pass(ElectricalVariantPrefix + ElectricalVariantPrefix1 + "  is searched successfully. Test case is passed");

		masterdatapage.Electrical_Variants_CancelFilterbutton();
		logger.createNode("Cancel Filter button is clicked ").pass(" Cancel Filter button is clicked successfully. Test case is passed");
    }

    @Test(priority=132)
    public void ElectricalVariantsTab_Test_toDeletethe2ndEntry(){

		// To add second entry

		//logger=extent.createTest("U-052: To create second entry in Electrical Variants Tab of Master Data Module");
		logger=extent.createTest("U-199: Update electro variants master data");

		logger.log(Status.INFO, "TestCaseID: TC-089");

		masterdatapage.Electrical_Variants_Tab_AddElectroVariantbutton();
		logger.createNode(" 'Add Electrical Variant' is clicked to create the second entry").pass(" Electrical Variants Tab is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_ElectroVariantPrefix_For2ndEtry();
		logger.createNode("Electrical Variant prefix for 2nd Entry added in the Thinclient is - " + ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry).pass(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " Electrical Variant prefix  is added successfully. Test case is passed");


		masterdatapage.Electrical_Variants_Tab_Designation_For2ndEntry();
		logger.createNode(" Pencil button is clicked").pass(" Pencil button is clicked successfully. Test case is passed");

		masterdatapage.ModalDialog_ElectricalVariant_For2ndEntry();
		logger.createNode(" Designation text entered in Thinclient for 2nd entry is - " + ElectricalVariant_Designation_For2ndEntry).pass(ElectricalVariant_Designation_For2ndEntry + " Designation text is entered successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_SaveChanges();
		logger.createNode(" Click on the checkmark button to save the 2nd entry").pass(" Checkmark button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Savebutton();
		logger.createNode(" Click on the save button to update the 2nd entry").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton();
		logger.createNode("Filter button is clicked to search for the 2nd Electrical Variant created").pass(" Filter button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton_text();
		logger.createNode(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " entry is searched to check if it's saved").pass(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " entry is searched  successfully. Test case is passed");



		masterdatapage.Electrical_Variants_Tab_Designation_For2ndEntry();
		logger.createNode(" Trash button is clicked").pass(" Trash button is clicked successfully. Test case is passed");


		masterdatapage.Electrical_Variants_Tab_Designation_For2ndEntry();
		logger.createNode(" Pencil button is clicked").pass(" Pencil button is clicked successfully. Test case is passed");

		masterdatapage.ModalDialog_ElectricalVariant_For3rdEntry();
		logger.createNode("Designation is 'edited as Created by MBRDI' for the second entry").pass(" edited as Created by MBRDI is updated successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Tab_SaveChanges();
		logger.createNode(" Click on the checkmark button to save the 2nd entry").pass(" Checkmark button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Savebutton();
		logger.createNode(" Click on the save button to update the 2nd entry").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton();
		logger.createNode("Filter button is clicked to search for the 2nd Electrical Variant created").pass(" Filter button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton_text();
		logger.createNode(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " entry is searched to check if it's saved").pass(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " entry is searched successfully. Test case is passed");


		masterdatapage.Electrical_Variants_DeleteEntry();
		logger.createNode("Trash button is clicked for the second entry created").pass(" Trash button is clicked successfully. Test case is passed");


		masterdatapage.Electrical_Variants_Savebutton();
		logger.createNode(" 2nd entry is deleted successfully after clicking Save button").pass(" Save button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_CancelFilterbutton();
		logger.createNode("Cancel Filter button is clicked ").pass(" Cancel Filter button is clicked successfully. Test case is passed");

		masterdatapage.Electrical_Variants_Filterbutton_text();
		logger.createNode(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + "  entry is searched to check if it's deleted on clicking the filter button").pass(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry + " entry is searched successfully. Test case is passed");
    }


    @Test(priority=133)
    public void TransmissionModalTab_Test(){

    	//logger=extent.createTest("U-274: Transmission Model of Master Data Module");
    	logger=extent.createTest("U-274: Manage transmission model designation master data");

    	logger.log(Status.INFO, "TestCaseID : TC-090");

    	masterdatapage.TransmissionModal_Tab();
    	logger.createNode("Transmission Modal Tab is clicked ").pass(" Transmission modal is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SearchButton();
    	logger.createNode("Search button in the Transmission Modal is clicked ").pass(" Search button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_AddButton();
    	logger.createNode("Add button is clicked in the Transmission Modal is clicked ").pass(" Add button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_TransmissionObjectNumber();
    	logger.createNode("Transmission Object Number entered in the Thinclient is - " + TransmissionModal_Add).pass(TransmissionModal_Add + " is entered successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_TranmissionModal();
    	logger.createNode("Transmission Modal entered in the Thinclient is - " + TransmissionModal).pass(TransmissionModal + " is entered successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveChanges();
    	logger.createNode("Checkmark is clicked to save the changes in the Thinclient").pass(" Checkmark button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveButton();
    	logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_FilterButton();
    	logger.createNode("Filter button is clicked in the Thinclient").pass(" Filter button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_Filtertext();
    	logger.createNode(TransmissionModal_Add + " - Transmission Object Number is entered Thinclient to search if its created").pass(TransmissionModal_Add + " Transmission Object Number is entered successfully. Test case is passed");

    }

    @Test(priority=134)
    public void TransmissionModalTab_Test_toDelete2ndEntry(){

    	// Add 2nd Transmission Object Number

    	//logger=extent.createTest("U-052: To Edit the Transmission Object number in Transmission Model of Master Data Module");

    	logger=extent.createTest("U-274: Manage transmission model designation master data");
    	logger.log(Status.INFO, "TestCaseID : TC-091");

    	masterdatapage.TransmissionModal_Tab_AddButton();
    	logger.createNode("Add button is clicked in the Transmission Modal is clicked ").pass(" Add button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_TransmissionObjectNumber_For2ndEntry();
    	logger.createNode("Transmission Object Number entered in the Thinclient is - " + TransmissionModal_Add2ndEntry).pass(TransmissionModal_Add2ndEntry + " is entered successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_TranmissionModal_For2ndEntry();
    	logger.createNode("Transmission Modal entered in the Thinclient is - " + TransmissionModal_2ndEntry).pass(TransmissionModal_2ndEntry + " is entered successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveChanges();
    	logger.createNode("Checkmark is clicked to save the changes in the Thinclient").pass(" Checkmark button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveButton();
    	logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_FilterButton();
    	logger.createNode("Filter button is clicked in the Thinclient to search for the 2nd Transmission object created").pass(" Filter button is clicked successfully. Test case is passed");


    	masterdatapage.TransmissionModal_Tab_Filtertext_For2ndEntry();
    	logger.createNode(TransmissionModal_Add2ndEntry + " - Transmission Object Number is entered Thinclient to search if its created").pass(TransmissionModal_Add2ndEntry + " Transmission Object Number is entered successfully. Test case is passed");

    	masterdatapage.TransmissionModal_EditButton();
    	logger.createNode("Edit button is clicked in the Thinclient").pass(" Edit button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_TranmissionModal_For3rdEntry();
    	logger.createNode(TransmissionModal_3rdEntry + " - is the Edited Transmission Object Number for the 2nd entry").pass(TransmissionModal_3rdEntry + " is edited successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveChanges();
    	logger.createNode("Checkmark is clicked to save the changes in the Thinclient").pass(" checkmark button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_SaveButton();
    	logger.createNode("Save button is clicked in the Thinclient").pass(" Save button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_FilterButton();
    	logger.createNode("Filter button is clicked in the Thinclient to search for the 2nd Transmission object created").pass(" Filter button is clicked successfully. Test case is passed");

    	masterdatapage.TransmissionModal_Tab_Filtertext();
    	logger.createNode(TransmissionModal_Add2ndEntry + " 2nd created Transmission Object Number is entered Thinclient to check if the edited value is updated").pass(" Filter button is clicked successfully. Test case is passed");

    }


//            //Kartik //*************testcase 131 to 135 removed
////	@Test(priority = 131 )
////	public void Certification_Tab_ShowCOCMasterData_For_CorrectDocumentKey() throws InterruptedException {
////		logger = extent.createTest("U-034:(AU) Certification tab: Show COC Master Data with Correct Document Key");
////
////		masterdatapage.moveToControlUnitVPDIDTab_clickOnCertificationTab();
////		logger.createNode("Certification tab is shown").pass("Certification tab is shown and clicked. Test case passed.");
////		masterdatapage.SearchForDocumentKey();
////		logger.createNode("Pass Correct Document Key").pass("Passing Correct Document Key-" +masterdatapage.CorrectDocumentKey+ "\tTest case passed.");
////		masterdatapage.searchForCOCData_Button();
////		logger.createNode("COC Data Tab is shown").pass("COC data tab is shown and clicked. Test case passed.");
////
////		System.out.println("Document Key-"+masterdatapage.FetchDocumentKey());
////        logger.createNode("Value in COC data section for: " + masterdatapage.FetchDocumentKey()).pass("Document Key is displayed"+ masterdatapage.FetchDocumentKey()+ ". Test case passed.")
////        .pass("Brand value is -" + masterdatapage.FetchBrandValue()+ ". Test case passed.")
////        .pass("Fuel value is -"+ masterdatapage.FetchFuelValue()+ ". Test case passed.")
////
////        .pass("Variant value is -" + masterdatapage.FetchVariantValue()+ ". Test case passed.")
////        .pass("Sales Designation value is - " + masterdatapage.FetchSalesDesignation()+ ". Test case passed.")
////        .pass("Displacement Value is -" + masterdatapage.FetchDisplacement()+ ". Test case passed.")
////
////
////        .pass("version is -" + masterdatapage.FetchVersion()+ ". Test case passed.")
////        .pass("Manufacturer Code is -" + masterdatapage.FetchManufacturerCode()+ ". Test case passed.")
////        .pass("Output value is -" + masterdatapage.FetchOutput()+ ". Test case passed.")
////
////        .pass("EU Approval No is -" + masterdatapage.FetchEUApprovalNo()+ ". Test case passed.")
////        .pass("Index of Model Codes is -" + masterdatapage.FetchIndexOfModelCodes()+ ". Test case passed.")
////        .pass("Hybrid Output in kW value is -" + masterdatapage.FetchHybridOutputInkW()+ ". Test case passed.")
////
////        .pass("EU approval date is - " + masterdatapage.FetchEU_approval_date()+ ". Test case passed.")
////        .pass("Variant Version Code is - " + masterdatapage.FetchVariantVersionCode()+ ". Test case passed.")
////        .pass("Maximum Speed is - " + masterdatapage.FetchMaximumSpeed()+ ". Test case passed.")
////
////        .pass("Exhaust Guide lines is - " + masterdatapage.FetchExhaustGuidelines()+ ". Test case passed.")
////        .pass("Check Digit is - " + masterdatapage.FetchCheckDigit()+ ". Test case passed.")
////        .pass("Emissions Standard is - " + masterdatapage.FetchEmissionsStandard()+ ". Test case passed.");
////
////        warmup6();
////        masterdatapage.Gasoline_diesel_consumption_Button();
////        ////form[contains(@name,'fMasterDataCoCCo2Data')]//div[@class='row rowspace'][1]//div[2]
////
////        System.out.println("CO2 Emision Combined Value-"+masterdatapage.FatchCO2_EmisionCombined());
////        logger.createNode("Value displayed in gasoline/diesel consumption tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Urban consumption value is - " + masterdatapage.FetchUrbanConsumption()+ ". Test case passed.")
////        .pass("CO2 emissions Urban value is - " + masterdatapage.FetchCO2emissionsUrban()+ ". Test case passed.")
////
////        .pass("Highway consumption value is - " + masterdatapage.FetchHighwayConsumption()+ ". Test case passed.")
////        .pass("CO2 emission Highway value is - " + masterdatapage.FetchCO2emissionHighway()+ ". Test case passed.")
////
////        .pass("Combined consumption value is - " + masterdatapage.FetchCombinedConsumption()+ ". Test case passed.")
////        .pass("CO2 Emision Combined value is - " + masterdatapage.FatchCO2_EmisionCombined()+ ". Test case passed.")
////
////        .pass("Consumption Weighted value is - " + masterdatapage.FetchConsumptionWeighted()+ ". Test case passed.")
////        .pass("CO2 emissions Weighted value is - " + masterdatapage.FetchCO2emissionsWeighted()+ ". Test case passed.");
////
////        masterdatapage.Gas_fuel_consumption_Button();
////        warmup6();
////        logger.createNode("Value displayed in gas fuel consumption tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Urban consumption value is - " + masterdatapage.FetchUrbanConsumption_Gas()+ ". Test case passed.")
////        .pass("CO2 emissions Urban value is - " + masterdatapage.FetchCO2missionsUrban_Gas()+ ". Test case passed.")
////
////        .pass("Highway consumption value is - " + masterdatapage.FetchHighwayConsumption_Gas()+ ". Test case passed.")
////        .pass("CO2 emission Highway value is - " + masterdatapage.FetchCO2emissionHighway_Gas()+ ". Test case passed.")
////
////        .pass("Combined consumption value is - " + masterdatapage.FetchCombinedConsumption_Gas()+ ". Test case passed.")
////        .pass("CO2 Emision Combined value is - " + masterdatapage.fetchCO2emissionsCombined_Gas()+ ". Test case passed.")
////
////        .pass("Consumption Weighted value is - " + masterdatapage.FetchConsumptionWeighted_Gas()+ ". Test case passed.")
////        .pass("CO2 emissions Weighted value is - " + masterdatapage.FetchCO2emissionsWeighted_Gas()+ ". Test case passed.");
////
////        warmup6();
////        masterdatapage.Other_consumption_Button();
////        warmup6();
////        logger.createNode("Value displayed in other consumption tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Urban consumption value is - " + masterdatapage.FetchUrbanConsumption_other()+ ". Test case passed.")
////        .pass("CO2 emissions Urban value is - " + masterdatapage.FetchCO2missionsUrban_other()+ ". Test case passed.")
////
////        .pass("Highway consumption value is - " + masterdatapage.fetchHighwayConsumption_other()+ ". Test case passed.")
////        .pass("CO2 emission Highway value is - " + masterdatapage.fetchCO2emissionHighway_other()+ ". Test case passed.")
////
////        .pass("Combined consumption value is - " + masterdatapage.fetchCombinedConsumption_other()+ ". Test case passed.")
////        .pass("CO2 Emision Combined value is - " + masterdatapage.fetchCO2emissionsCombined_other()+ ". Test case passed.")
////
////        .pass("Consumption Weighted value is - " + masterdatapage.fetchConsumptionWeighted_other()+ ". Test case passed.")
////        .pass("CO2 emissions Weighted value is - " + masterdatapage.fetchCO2emissionsWeighted_other()+ ". Test case passed.");
////
////        warmup6();
////        masterdatapage.Electricity_consumption_Button();
////        warmup6();
////        logger.createNode("Value displayed in electricity consumption tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Combined consumption value is - " + masterdatapage.FetchCombinedConsumption_electricity()+ ". Test case passed.")
////        .pass("Range value is - " + masterdatapage.FetchRange_electricity()+ ". Test case passed.");
////
////        warmup6();
////        masterdatapage.Tires_Button();
////        warmup6();
////        logger.createNode("Value displayed in tires tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Tire axle_1 value is - " + masterdatapage.FetchTiresAxle_1()+ ". Test case passed.")
////        .pass("Rim axle_1 value is - " + masterdatapage.FetchRimAxle_1()+ ". Test case passed.")
////        .pass("Air pressure_Axle_1 value is - " + masterdatapage.FetchAir_pressure_Axle_1()+ ". Test case passed.")
////
////        .pass("Tire axle_2 value is - " + masterdatapage.FetchTiresAxle_2()+ ". Test case passed.")
////        .pass("Rim axle_2 value is - " + masterdatapage.FetchRimAxle_2()+ ". Test case passed.")
////        .pass("Air pressure_Axle_2 value is - " + masterdatapage.FetchAir_pressure_Axle_2()+ ". Test case passed.")
////
////        .pass("Tire axle_3 value is - " + masterdatapage.FetchTiresAxle_3()+ ". Test case passed.")
////        .pass("Rim axle_3 value is - " + masterdatapage.FetchRimAxle_3()+ ". Test case passed.")
////        .pass("Air pressure_Axle_3 value is - " + masterdatapage.FetchAir_pressure_Axle_3()+ ". Test case passed.")
////
////        .pass("Tire axle_4 value is - " + masterdatapage.FetchTiresAxle_4()+ ". Test case passed.")
////        .pass("Rim axle_4 value is - " + masterdatapage.FetchRimAxle_4()+ ". Test case passed.")
////        .pass("Air pressure_Axle_4 value is - " + masterdatapage.FetchAir_pressure_Axle_4()+ ". Test case passed.");
////
////
////        warmup6();
////        masterdatapage.Model_Plate_Button();
////        warmup6();
////        logger.createNode("Value displayed in model plate tab for: " + masterdatapage.FetchDocumentKey())
////        .pass("Permissible total weight value is - " + masterdatapage.Permissible_weight_modelplate()+ ". Test case passed.")
////        .pass("Permissible total weight of vehicle combination value is - " + masterdatapage.permissible_weight_vehicle_combination_modelplate()+ ". Test case passed.")
////        .pass("Permissible axle load Axle 1 value is - " + masterdatapage.Permissible_axle_load_Axle_1()+ ". Test case passed.")
////        .pass("Perm. axle load, axle 2 value is - " + masterdatapage.Permissible_axle_load_Axle_2()+ ". Test case passed.")
////
////        .pass("Model value is - " + masterdatapage.Model_modelplate()+ ". Test case passed.")
////        .pass("Displacment value is - " + masterdatapage.Fetch_ModelPlate_Displacement()+ ". Test case passed.")
////        .pass("Sales designation value is - " + masterdatapage.Sales_designation_modelplate()+ ". Test case passed.")
////        .pass("Rated Output value is - " + masterdatapage.Fetch_Rated_Output()+ ". Test case passed.")
////        .pass("Vehicle_model_designation value is - " + masterdatapage.Vehicle_model_designation()+ ". Test case passed.")
////        .pass("Reated_electrical_output value is - " + masterdatapage.Reated_electrical_output()+ ". Test case passed.")
////        .pass("Engine_mode_designation value is - " + masterdatapage.Engine_mode_designation()+ ". Test case passed.")
////        .pass("Rated_output_kW_max value is - " + masterdatapage.Rated_output_kW_max()+ ". Test case passed.")
////        .pass("Number_of_seats value is - " + masterdatapage.Number_of_seats()+ ". Test case passed.")
////        .pass("Battery_modelplate value is - " + masterdatapage.Battery_modelplate()+ ". Test case passed.")
////        .pass("Low_beam_light_bundle value is - " + masterdatapage.Low_beam_light_bundle()+ ". Test case passed.")
////        .pass("Rated_voltage_in_volts value is - " + masterdatapage.Rated_voltage_in_volts()+ ". Test case passed.")
////        .pass("Diesel_smoke_coefficient value is - " + masterdatapage.Diesel_smoke_coefficient()+ ". Test case passed.")
////        .pass("CNO_russia value is - " + masterdatapage.CNO_russia()+ ". Test case passed.")
////        .pass("Curb_weight value is - " + masterdatapage.Curb_weight()+ ". Test case passed.")
////        .pass("China_model value is - " + masterdatapage.China_model()+ ". Test case passed.");
////
////	}
////
////	@Test(priority = 132 )
////	public void Certification_Tab_ShowCOCMasterData_For_IncorrectDocumentKey() throws InterruptedException {
////		logger = extent.createTest("U-034:(AU) Certification tab: Show COC Master Data with Incorrect Document Key");
////
////		masterdatapage.moveToControlUnitVPDIDTab_clickOnCertificationTab();
////		logger.createNode("Certification tab is shown").pass("Certification tab is shown and clicked. Test case passed.");
////		masterdatapage.SearchForIncorectDocumentKey();
////		logger.createNode("Pass Incorrect Document Key").pass("Passing Incorrect Document Key-" +masterdatapage.IncorrectDocumentKey+ "\tTest case passed.");
////		masterdatapage.searchForCOCData_Button();
////		logger.createNode("COC Data Tab is shown").pass("COC data tab is shown and clicked. Test case passed.");
////		warmup6();
////		boolean flag = masterdatapage.alertBox();
////		if (flag) {
////			logger.createNode("Check if error message is shown").pass("For "+masterdatapage.GetSearchedDocumentKey()+ " Alert message seen- "+masterdatapage.alertBoxGClass()+"\t Testcase Passed");
////			masterdatapage.moveToAlertBoxCloseAndClick();
////		}
////		else {
////			logger.createNode("Error message is not displayed for Incorrect Document Key " +masterdatapage.GetSearchedDocumentKey()).fail("Error message should be displayed for Incorrect Document Key " +masterdatapage.GetSearchedDocumentKey()+ "\t Test case failed.");
////			}
////	}
//
//
////    @Test(priority=133)
////    public void WLTP_Vecto_TabTest(){
////
////    	logger=extent.createTest("U-052: WLTP/VECTO Tab of Master Data Module");
////    	logger.log(Status.INFO, "TestCaseID : TC-092");
////
////    	masterdatapage.WLTP_VectoTab();
////    	logger.createNode("WLTP/VECTO Tab is clicked").pass(" WLTP/VECTO Tab is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_AddLabel_Button();
////    	logger.createNode("Add Label button is clicked").pass(" Add Label button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_AddLabel_ID();
////    	logger.createNode(WLTP_VECTO_ID + " - ID Is entered in the Thinclient").pass(WLTP_VECTO_ID + " is entered successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.ModalDialog_WLTP_VECTO();
////    	logger.createNode(WLTP_VECTO_Designation + " - Designation Is entered in English language in the Thinclient").pass(WLTP_VECTO_Designation + " Designation is entered successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveChanges();
////    	logger.createNode("Checkmark is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_FilterButton();
////    	logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Filter_text();
////    	logger.createNode(WLTP_VECTO_ID + " - ID created is entered to chek if newly created ID is displayed" ).pass(WLTP_VECTO_ID + " is created successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Designation();
////
////    	masterdatapage.ModalDialog_LabelData_For3rdEntry();
////    	logger.createNode(" Designation Is edited to - Created By MBRDI in the Thinclient").pass(" Designation Is edited to - Created By MBRDI successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveChanges();
////    	logger.createNode("Checkmark is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_CancelFilterButton();
////    	logger.createNode("Cancel Filter button is clicked").pass(" Cancel Filter button is clicked successfully. Test case is passed");
////
////    }
////
////    @Test(priority=134)
////    public void WLTP_Vecto_TabTest_For2ndEntryLabel(){
////
////    	//logger=extent.createTest("U-052: To create second ID in WLTP/VECTO Tab of Master Data Module");
////
////    	logger=extent.createTest("U-283: Manage extended coc data designation master data");
////    	logger.log(Status.INFO, "TestCaseID : TC-093");
////
////    	masterdatapage.WLTP_VectoTab_AddLabel_Button();
////    	logger.createNode("Add Label button is clicked again to create the second ID").pass(" Add Label button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_AddLabel_ID_For2ndEntry();
////    	logger.createNode(WLTP_VECTO_ID_For2ndEntry + " - is 2nd ID entered in the Thinclient").pass(WLTP_VECTO_ID_For2ndEntry + " is entered successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.ModalDialog_WLTP_VECTO_For2ndEntry();
////    	logger.createNode(WLTP_VECTO_Designation_For2ndEntry + " - Designation Is entered in English language in the Thinclient").pass(WLTP_VECTO_Designation_For2ndEntry + " Designation is entered successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveChanges();
////    	logger.createNode("Checkmark is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_FilterButton();
////    	logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Filter_text_For2ndEntry();
////    	logger.createNode(WLTP_VECTO_ID_For2ndEntry + " - ID created is entered to check if newly created ID is displayed" ).pass(WLTP_VECTO_ID_For2ndEntry + " ID is created successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Delete2ndEntry();
////    	logger.createNode(WLTP_VECTO_ID_For2ndEntry + " - Trash  button is  clicked to delete the ID from the ThinClient" ).pass(" Trash button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_FilterButton();
////    	logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");
////
////    	masterdatapage.WLTP_VectoTab_Filter_text_For2ndEntry();
////    	logger.createNode(WLTP_VECTO_ID_For2ndEntry + " - ID is searched to check if it's displayed" ).pass(WLTP_VECTO_ID_For2ndEntry + " ID is searched. Test case is passed");
////
////    }
////
////    @Test(priority=135)
////    public void LabelData_TabTest(){
////
////    	logger=extent.createTest("U-286: Label Data Tab of Master Data Module");
////    	logger.log(Status.INFO, "TestCaseID : TC-094");
////
////    	masterdatapage.LabelDataTab_WriteAccess();
////    	logger.createNode("Label Data Tab is clicked in the ThinClient").pass(" Label Data Tab is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_KeyButton();
////    	logger.createNode("Add Entry button is clicked in the ThinClient").pass(" Add Entry button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_Key();
////    	logger.createNode(LabelData_Keya + " - Key  is entered in the ThinClient").pass(LabelData_Keya + " is entered successfully. Test case is passed");
////
////    	masterdatapage.LabelData_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.ModalDialog_LabelData();
////    	logger.createNode(LabelData_Designationa + " -  Designation is entered in the ThinClient").pass(LabelData_Designationa + " Designation is eneterd successfully. Test case is passed");
////
////
////    	masterdatapage.LabelData_SaveChangesButton();
////    	logger.createNode("Checkmark is clicked to save the changes").pass(" Checkmark button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////
////    	masterdatapage.LabelData_FilterButton();
////    	logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_FilterText();
////    	logger.createNode(LabelData_Keya + " - Key  is entered in the ThinClient to check if it's saved").pass(LabelData_Keya + " is entered successfully. Test case is passed");
////
////    	masterdatapage.LabelData_Designation();
////    	logger.createNode("Pencil button is clicked to edit the designation of 1st Key created").pass(" Pencil button is clicked successfully. Test case is passed");
////
////       	masterdatapage.LabelData_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.ModalDialog_LabelData_For3rdEntry();
////    	logger.createNode("Designation of 1st ID is edited to - Created By MBRDI ").pass(" Designation is edited successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveChangesButton();
////    	logger.createNode("Checkmark is clicked to save the edited changes").pass(" Checkmark button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    }
//
////    @Test(priority=136)
////    public void LabelData_TabTest_For2ndLabelData(){
////
////
////        logger=extent.createTest("U-286: To create second ID in label data of Master Data Module");
////        logger.log(Status.INFO, "TestCaseID : TC-095");
////
////    	masterdatapage.LabelData_KeyButton();
////        logger.createNode("Add Entry button is clicked in the ThinClient").pass(" Add Entry button is clicked successfully. Test case is passed");
////
////        masterdatapage.LabelData_Key_For2ndEntry();
////    	logger.createNode(LabelData_Key_2ndEntry + " - Is 2nd Key is entered in the ThinClient").pass(LabelData_Key_2ndEntry + " 2nd Key is entered is clicked successfully. Test case is passed");
////
////
////    	masterdatapage.LabelData_Designation();
////    	logger.createNode("Pencil button in Designation is clicked").pass(" Pencil button is clicked successfully. Test case is passed");
////
////    	masterdatapage.ModalDialog_LabelData_For2ndEntry();
////    	logger.createNode(LabelData_Designation_For2ndEntry + " -  Designation is entered in the ThinClient").pass(LabelData_Designation_For2ndEntry + " Designation is entered is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveChangesButton();
////    	logger.createNode("Checkmark is clicked to save the changes").pass(" Checkmak button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_FilterButton();
////    	logger.createNode("Filter button is clicked in the ThinClient").pass(" Filter button is clicked successfully. Test case is passed");
////
////
////    	masterdatapage.LabelData_FilterText_For2ndEntry();
////    	logger.createNode(LabelData_Key_2ndEntry + " - Key  is entered in the ThinClient to check if it's saved").pass(LabelData_Key_2ndEntry + " Key  is entered successfully. Test case is passed");
////
////    	masterdatapage.LabelData_DeleteEntry();
////    	logger.createNode("Trash button is clicked to delete the 2nd Entry in the ThinClient").pass(" Trash button is clicked successfully. Test case is passed");
////
////    	masterdatapage.LabelData_SaveButton();
////    	logger.createNode("Save button is clicked to save the changes").pass(" Save button is clicked successfully. Test case is passed");
////    }
//
//
//     /*   ************ History Tab*******************  */
//		    //Kartik
//		    @Test(priority = 135 )
//			public void HistoryTab_ShowMasterData_ChangeLog() throws InterruptedException {
//				logger = extent.createTest("U-229:(AU) History tab: Show master data change log");
//
//				warmup6();
//				masterdatapage.HistoryTab();
//				logger.createNode("History tab is clicked").pass("History tab is clicked. Test case passed.");
//
//				//apply for loop for Tab selection
//				int size= masterdatapage.GetAllTabCatagorySize();
//
//				for(int i=0; i<size-1; i++) {
//				String TabElementText= masterdatapage.GetAllTabCatagory(i);
//					 System.out.println(TabElementText);
//
//						masterdatapage.TabCatagory(TabElementText);
//						ExtentTest Tab1=logger.createNode("Pass search criteria for tab is- "+TabElementText+". Test case passed.");
//
//						masterdatapage.DateFrom("08/28/2023");
//						Tab1.pass("Pass from date is- 08/28/2023. Test case passed.");
//						masterdatapage.DateTo("09/27/2023");
//						Tab1.pass("Pass to date is- 09/27/2023. Test case passed.");
//						masterdatapage.Search_History();
//						Tab1.pass("Search button is clicked. Test case passed. Test case passed.");
//
//						//table row
//						int logCount= masterdatapage.Fetch_logEntryCount();
//
//
//						if(logCount>=1) {
//							ExtentTest Tab2= logger.createNode("Log entry for search criteria, Tab- "+TabElementText+", From date- 09/01/2022 To date- 09/07/2022")
//									.pass("The total count of log entry is-"+logCount+". Test case passed.");
//
//							masterdatapage.ExportCsvButton_history();
//
//							String fileName= masterdatapage.GetDownloadedFileName_NewTab();
//							System.out.println("url 1-"+driver.getCurrentUrl());
//							int dataCountInCSV= masterdatapage.getRecordsCountInCSV_fromFile(fileName);
//							Assert.assertEquals(dataCountInCSV, logCount);
//							Tab2.pass("Export history button is clicked & CSV File gets downloaded. Test case passed.");
//							Tab2.pass("Count of logs entry in CSV File is-"+dataCountInCSV+". Test case passed.");
//							Tab2.pass("Count of logs entry in CSV File is matched. Test case passed.");
//
//							//filter
//
//							masterdatapage.FilterButton_history();
//							ExtentTest Tab4= logger.createNode("Filter button is desplayed").pass("Filter button is clicked. Test case passed.");
//							String filterText= masterdatapage.GetTextFromTable_history();
//
//							masterdatapage.PassFilterText_history(filterText);
//							Tab4.pass("Pass filter input text is- "+filterText+". Test case passed.");
//
//							String filterText2= masterdatapage.GetTextFromTable_history();
//
//							Assert.assertEquals(filterText2, filterText, "assert get matched");
//							Tab4.pass("Actual filter text- "+filterText+" and expected text -"+filterText2+" is mached. Test case passed.");
//
//
//						}else {
//							ExtentTest Tab3= logger.createNode("No log entry found for search criteria, Tab- "+TabElementText+", From date- 09/01/2022 To date- 09/07/2022")
//							.pass("No log entry found for given search criteria. Test case passed.");
//							//warmup6();
//							//Tab3.pass("For given search criteria information message seen-"+masterdatapage.GetBlueAlertBoxText()+". Test case passed.");
//
//						}
//				}
//

		  //  }


		    // 29-6-2022 - Swedha

		    @Test(priority=136)
		    public void vpdIds(){
		    	logger=extent.createTest("U-096: (AU) Update VPD Core Master Data");
		    	masterdatapage.vpdIds();
		    	logger.createNode("VPD IDs tab is clicked").pass("VPD IDs Tab is clicked successfully. Test case is passed");
		    }

		    @Test(priority=137)
		    public void vpdIds_ShowData(){
		    	masterdatapage.vpdIds_ShowData();
		    	logger.createNode("Show data button is clicked").pass("Show data button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=138)
		    public void createVpdId(){
		    	masterdatapage.createVpdId();
		    	logger.createNode("Create VPD ID button is clicked").pass("Create VPD ID button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=139)
		    public void vpdIds_VpdIdent(){
		    	masterdatapage.vpdIds_VpdIdent();
		    	logger.createNode("VPD ident field is provided with the input - "+randomNumbers_5).pass("VPD ident field is provided with the input - "+randomNumbers_5+". Test case is passed");
		    }

		    @Test(priority=140)
		    public void vpdIds_Create_Description_Icon(){
		    	masterdatapage.vpdIds_Description_Icon();
		    	logger.createNode("Descripton field is clicked").pass("Descripton field is clicked successfully. Test case is passed");
		    }

		    @Test(priority=141)
		    public void vpdIds_Create_Description_English(){
		    	masterdatapage.vpdIds_Create_Description_English();
		    	logger.createNode("Description field is provided with the input - Create Designation").pass("Description field is provided with the input - Create Designation. Test case is passed");
		    }

		    @Test(priority=142)
		    public void vpdIds_Create_Apply(){
		    	masterdatapage.	vpdIds_Apply();
		    	logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=143)
		    public void vpdIds_Confidential(){
		    	masterdatapage.vpdIds_Confidential();
		    	logger.createNode("Confidential check box is checked").pass("Confidential check box is checked successfully. Test case is passed");
		    }

		    @Test(priority=144)
		    public void vpdIds_Create_Checkmark(){
		    	masterdatapage.vpdIds_Checkmark();
		    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=145)
		    public void vpdIds_Create_Save(){
		    	masterdatapage.vpdIds_Save();
		    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=146)
		    public void vpdIds_Create_Filter(){
		    	masterdatapage.vpdIds_FilterButton();
		    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=147)
		    public void vpdIds_Create_SearchTheTable(){
		    	masterdatapage.vpdIds_SearchTheTable();
		    	logger.createNode("Search the table field is provided with the input - " +randomNumbers_5).pass("Search the table field is provided with the input - "+randomNumbers_5+". Test case is passed");
		    }

		    @Test(priority=148)
		    public void automaticConflictStatusTab_Create_FilteredResult(){
		    	 masterdatapage.vpdIds_FilteredResult();
		         logger.createNode("The filtered result of created VPD ID is - "+masterdatapage.vpdIds_FilteredResult()).pass("The filtered result of created VPD ID is - "+masterdatapage.vpdIds_FilteredResult()+". Test Case Passed");
		       }

		    @Test(priority=149)
		    public void vpdIds_Edit(){
		    	masterdatapage.vpdIds_Edit();
		    	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=150)
		    public void vpdIds_Edit_Description_Icon(){
		    	masterdatapage.vpdIds_Description_Icon();
		    	logger.createNode("Descripton field is clicked").pass("Descripton field is clicked successfully. Test case is passed");
		    }

		    @Test(priority=151)
		    public void vpdIds_Edit_Description_English(){
		    	masterdatapage.vpdIds_Edit_Description_English();
		    	logger.createNode("Description field is provided with the input - Edit Designation").pass("Description field is provided with the input - Edit Designation. Test case is passed");
		    }

		    @Test(priority=152)
		    public void vpdIds_Edit_Apply(){
		    	masterdatapage.vpdIds_Apply();
		    	logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=153)
		    public void vpdIds_Edit_Confidential(){
		    	masterdatapage.vpdIds_Confidential();
		    	logger.createNode("Confidential check box is unchecked").pass("Confidential check box is unchecked successfully. Test case is passed");
		    }

		    @Test(priority=154)
		    public void vpdIds_Edit_Checkmark(){
		    	masterdatapage.vpdIds_Checkmark();
		    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=155)
		    public void vpdIds_Edit_Create_Save(){
		    	masterdatapage.vpdIds_Save();
		    	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=156)
		    public void vpdIds_Edit_Filter(){
		    	masterdatapage.vpdIds_FilterButton();
		    	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=157)
		    public void vpdIds_Edit_SearchTheTable(){
		    	masterdatapage.vpdIds_SearchTheTable();
		    	logger.createNode("Search the table field is provided with the input - " +randomNumbers_5).pass("Search the table field is provided with the input - "+randomNumbers_5+". Test case is passed");
		    }

		    @Test(priority=158)
		    public void vpdIds_FilteredResult(){
		      masterdatapage.vpdIds_FilteredResult();
		      logger.createNode("The filtered result of edited VPD ID is - "+masterdatapage.vpdIds_FilteredResult()).pass("The filtered result of edited VPD ID is - "+masterdatapage.vpdIds_FilteredResult()+". Test Case Passed");
		    }

		    @Test(priority=159)
		    public void createVpdId_Existing(){
		    	masterdatapage.createVpdId();
		    	logger.createNode("Create VPD ID button is clicked").pass("Create VPD ID button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=160)
		    public void vpdIds_VpdIdent_Existing(){
		    	masterdatapage.vpdIds_VpdIdent();
		    	logger.createNode("VPD ident field is provided with already existing input - "+randomNumbers_5).pass("VPD ident field is provided with already existing input - "+randomNumbers_5+". Test case is passed");
		    }

		    @Test(priority=161)
		    public void vpdIds_Create_Description_Icon_Existing(){
		    	masterdatapage.vpdIds_Description_Icon();
		    	logger.createNode("Descripton field is clicked").pass("Descripton field is clicked successfully. Test case is passed");
		    }

		    @Test(priority=162)
		    public void vpdIds_Create_Description_English_Existing(){
		    	masterdatapage.vpdIds_Edit_Description_English();
		    	logger.createNode("Description field is provided with the input - Edit Designation").pass("Description field is provided with the input - Edit Designation. Test case is passed");
		    }

		    @Test(priority=163)
		    public void vpdIds_Create_Apply_Existing(){
		    	masterdatapage.	vpdIds_Apply();
		    	logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		    }

		    @Test(priority=164)
		    public void vpdIds_Checkmark_Existing(){
		    	masterdatapage.vpdIds_Checkmark();
		    	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		    }

		    @Test(priority = 165)
		    public void vpdIds_AlreadyExistingAlert_Line1(){
		      masterdatapage.vpdIds_AlreadyExistingAlert_Line1();
		      logger.createNode("Already existing alert message - "+masterdatapage.vpdIds_AlreadyExistingAlert_Line1()+ " is displayed").pass("Already existing alert message	- "+masterdatapage.vpdIds_AlreadyExistingAlert_Line1()+" is displayed. Test Case Passed");
		    }

		    @Test(priority = 166)
		    public void vpdIds_AlreadyExistingAlert_Line2(){
		      masterdatapage.vpdIds_AlreadyExistingAlert_Line2();
		      logger.createNode("Already existing alert message - "+masterdatapage.vpdIds_AlreadyExistingAlert_Line2()+ " is displayed").pass("The alert message - "+masterdatapage.vpdIds_AlreadyExistingAlert_Line2()+" is displayed. Test Case Passed");
		    }

		    @Test(priority = 167)
		    public void vpdIds_AlreadyExistingAlert_Line3(){
		      masterdatapage.vpdIds_AlreadyExistingAlert_Line3();
		      logger.createNode("Already existing alert message "+masterdatapage.vpdIds_AlreadyExistingAlert_Line3()+ " is displayed").pass("Already existing alert message - "+masterdatapage.vpdIds_AlreadyExistingAlert_Line3()+" is displayed. Test Case Passed");
		      masterdatapage.vpdIds_close();
		      masterdatapage.vpdIds_Cancel();
		      driver.switchTo().alert().accept();
		    }


		     //Swedha

		    @Test(priority=168)
		  public void cuGroup(){
		  	logger=extent.createTest("U-174: (AU) Show control unit group master data");
		  	masterdatapage.cuGroup();
		  	logger.createNode("CU Group tab is clicked").pass("CU Group tab is clicked successfully. Test case is passed");
		  }

		  @Test(priority=169)
		  public void cuGroup_AddEntry(){
			  logger=extent.createTest("U-175: (AU) Update control unit group master data");
		  	masterdatapage.cuGroup_AddEntry();
		  	logger.createNode("Add entry button is clicked").pass("Add entry button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=170)
		  public void cuGroup_Create_Identifier(){
		  	masterdatapage.cuGroup_Identifier();
		  	logger.createNode("Identifier field is provided with the input - 22222").pass("Identifier field is provided with the input - 22222. Test case is passed");
		  }

		  @Test(priority=171)
		  public void cuGroup_Create_Pencil()
		  {
		  	masterdatapage.cuGroup_Pencil();
		  	logger.createNode("Pencil icon in Designation field is clicked").pass("Pencil icon in Designation field is clicked successfully. Test case is passed");
		  }

		  @Test(priority=172)
		  public void cuGroup_Create_English(){
		  	masterdatapage.cuGroup_Create_English();
		  	logger.createNode("English field is provided with the input - Create Designation").pass("English field is provided with the input - Create Designation. Test case is passed");
		  }

		  @Test(priority=173)
		  public void cuGroup_Create_Apply(){
		  	masterdatapage.cuGroup_Apply();
		  	logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=174)
		  public void cuGroup_Create_EcuModel(){
		  	masterdatapage.cuGroup_Create_EcuModel();
		  	logger.createNode("ECU model dropdown field is provided with the input - DIA").pass("ECU model dropdown field is provided with the input - DIA. Test case is passed");
		  }

		  @Test(priority=175)
		  public void cuGroup_Create_PartsFamiliesModel(){
		  	masterdatapage.cuGroup_Create_PartsFamiliesModel();
		  	logger.createNode("Parts families model dropdown field is provided with the input - Vehicle").pass("Parts families model dropdown field is provided with the input - DIA. Vehicle case is passed");
		  }

		  @Test(priority=176)
		  public void cuGroup_Create_CheckMark(){
		  	masterdatapage.cuGroup_CheckMark();
		  	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=177)
		  public void cuGroup_Create_Save(){
		  	masterdatapage.cuGroup_Save();
		  	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=178)
		  public void cuGroup_Create_Filter(){
		  	masterdatapage.cuGroup_Filter();
		  	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=179)
		  public void cuGroup_Create_SearchTheTable(){
		  	masterdatapage.cuGroup_SearchTheTable();
		  	logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
		  }

		  @Test(priority=180)
		public void cuGroup_Create_FilteredResult(){
		  masterdatapage.cuGroup_FilteredResult();
		  logger.createNode("The filtered result of created CU Group is - "+masterdatapage.cuGroup_FilteredResult()).pass("The filtered result of created CU Group is - "+masterdatapage.cuGroup_FilteredResult()+". Test Case Passed");
		}

		  @Test(priority=181)
		  public void cuGroup_Edit(){
		  	masterdatapage.cuGroup_Edit();
		  	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=182)
		  public void cuGroup_Edit_Pencil()
		  {
		  	masterdatapage.cuGroup_Pencil();
		  	logger.createNode("Pencil icon in Designation field is clicked").pass("Pencil icon in Designation field is clicked successfully. Test case is passed");
		  }

		  @Test(priority=183)
		  public void cuGroup_Edit_English(){
		  	masterdatapage.cuGroup_Edit_English();
		  	logger.createNode("English field is edited with the input - Edit Designation").pass("English field is edited with the input - Edit Designation. Test case is passed");
		  }

		  @Test(priority=184)
		  public void cuGroup_Edit_Apply(){
		  	masterdatapage.cuGroup_Apply();
		  	logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=185)
		  public void cuGroup_Edit_EcuModel(){
		  	masterdatapage.cuGroup_Edit_EcuModel();
		  	logger.createNode("ECU model dropdown field is edited with the input - SEAT").pass("ECU model dropdown field is edited with the input - SEAT. Test case is passed");
		  }

		  @Test(priority=186)
		  public void cuGroup_Edit_PartsFamiliesModel(){
		  	masterdatapage.cuGroup_Edit_PartsFamiliesModel();
		  	logger.createNode("Parts families model dropdown field is edited with the input - Engine").pass("Parts families model dropdown field is edited with the input - Engine. Vehicle case is passed");
		  }

		  @Test(priority=187)
		  public void cuGroup_Edit_CheckMark(){
		  	masterdatapage.cuGroup_CheckMark();
		  	logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=188)
		  public void cuGroup_Edit_Save(){
		  	masterdatapage.cuGroup_Save();
		  	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=189)
		  public void cuGroup_Edit_Filter(){
		  	masterdatapage.cuGroup_Filter();
		  	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=190)
		  public void cuGroup_Edit_SearchTheTable(){
		  	masterdatapage.cuGroup_SearchTheTable();
		  	logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
		  }

		  @Test(priority=191)
		public void cuGroup_Edit_FilteredResult(){
		  masterdatapage.cuGroup_FilteredResult();
		  logger.createNode("The filtered result of edited CU Group is - "+masterdatapage.cuGroup_FilteredResult()).pass("The filtered result of edited CU Group is - "+masterdatapage.cuGroup_FilteredResult()+". Test Case Passed");
		}

		  @Test(priority=192)
		  public void cuGroup_Delete(){
		  	masterdatapage.cuGroup_Delete();
		  	logger.createNode("Delete button is clicked").pass("Delete button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=193)
		  public void cuGroup_Delete_Save(){
		  	masterdatapage.cuGroup_Save();
		  	logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=194)
		  public void cuGroup_Delete_Filter(){
		  	masterdatapage.cuGroup_Filter();
		  	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		  }

		  @Test(priority=195)
		  public void cuGroup_Delete_SearchTheTable(){
		  	masterdatapage.cuGroup_SearchTheTable();
		  	logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
		  }

		  @Test(priority = 196)
		  public void cuGroup_DeletedResult(){
		                 try {
		                                boolean displayFlag = masterdatapage.cuGroup_DeletedResult();
		                                if(displayFlag)
		                                logger.createNode("Deleted CU Group is displayed").fail("Deleted CU Group is displayed");
		                                else
		                                               logger.createNode("Deleted CU Group is not displayed").pass("Deleted CU Group is not displayed");
		                 } catch (NoSuchElementException e) {
		                                logger.createNode("Deleted CU Group is not available").pass("Deleted CU Group is not available");
		                 }
		  }

		//Swedha
		    @Test(priority=197)
		  public void countryDesignation(){
		  	logger=extent.createTest("U-135: (AU) Update Sales Area Master Data");
		  	masterdatapage.countryDesignation();
		  	logger.createNode("Country Designation tab is clicked").pass("Country Designation tab is clicked successfully. Test case is passed");
		  }

		  @Test(priority=198)
		  public void countryDesignation_Edit_Filter(){
		  	masterdatapage.countryDesignation_Filter();
		  	logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		  }

		   @Test(priority=199)
		public void countryDesignation_Edit_SearchTheTable(){
			masterdatapage.countryDesignation_SearchTheTable();
			logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
		}

		   @Test(priority=200)
		   public void countryDesignation_Edit(){
		   	masterdatapage.countryDesignation_Edit();
		   	logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test case is passed");
		   }

		 @Test(priority=201)
		 public void countryDesignation_SalesArea_Edit(){
		 	masterdatapage.countryDesignation_SalesArea_Edit();
			logger.createNode("Pencil icon in Sales area field is clicked").pass("Pencil icon in Sales area field is clicked successfully. Test case is passed");
		 }

		@Test(priority=202)
		public void countryDesignation_Designation(){
			masterdatapage.countryDesignation_Designation();
			logger.createNode("English field is edited with the input - Edit Sales Area - "+randomAlphabets_5).pass("English field is edited with the input - Edit Sales Area - "+randomAlphabets_5+". Test case is passed");
		}

		@Test(priority=203)
		public void countryDesignation_Apply(){
			masterdatapage.countryDesignation_Apply();
			logger.createNode("Apply button is clicked").pass("Apply button is clicked successfully. Test case is passed");
		}


		@Test(priority=204)
		public void countryDesignation_ValidFrom(){
			 	masterdatapage.countryDesignation_ValidFrom();
			logger.createNode("Valid From field is edited with the input - 02/02/1996").pass("Valid From field is edited with the input - 02/02/1996. Test case is passed");
		}

		@Test(priority=205)
		public void countryDesignation_ValidUntil (){
			masterdatapage.countryDesignation_ValidUntil();
			logger.createNode("Valid Until field is edited with the input - 02/02/2026").pass("Valid Until field is edited with the input - 02/02/2026. Test case is passed");
		}

		 @Test(priority=206)
		public void countryDesignation_CheckMark(){
			masterdatapage.countryDesignation_CheckMark();
			logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case is passed");
		}

		@Test(priority=207)
		public void countryDesignation_Save(){
			masterdatapage.countryDesignation_Save();
			logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case is passed");
		}

		@Test(priority=208)
		public void countryDesignation_Filter(){
			masterdatapage.countryDesignation_Filter();
			logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case is passed");
		}

		 @Test(priority=209)
		public void countryDesignation_SearchTheTable(){
			masterdatapage.countryDesignation_SearchTheTable();
			logger.createNode("Search the table field is provided with the input - 22222").pass("Search the table field is provided with the input - 22222. Test case is passed");
		}

		 @Test(priority=210)
		public void countryDesignation_FilteredResult(){
		 masterdatapage.countryDesignation_FilteredResult();
		 logger.createNode("The filtered result of edited Country designations is - "+masterdatapage.countryDesignation_FilteredResult()).pass("The filtered result of edited Country designations is - "+masterdatapage.countryDesignation_FilteredResult()+". Test Case Passed");
		}

    @AfterMethod
	public void teardown1(ITestResult result) throws IOException{
		
		if(result.getStatus()== ITestResult.SUCCESS){			
			logger.log(Status.PASS, "Test Case passed is " + result.getName() );			
			String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());			
			 logger.addScreenCaptureFromPath(screenshotPath);
		}
		
		else if(result.getStatus()== ITestResult.FAILURE){
			
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName() );
			
			logger.log(Status.FAIL, result.getThrowable());
			
			String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
			
			logger.addScreenCaptureFromPath(screenshotPath);
			
			}
	}


	@AfterTest
	public void teardown() throws IOException {
		
		driver.quit();

			 }

	

}
