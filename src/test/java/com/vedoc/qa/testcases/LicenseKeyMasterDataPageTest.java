// 20/2/2022 Successsfully running
// 20/2/2022 Gone through entirely - no doubt
// need to add edit stories in backlog

package com.vedoc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LicenseKeyMasterPage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;

public class LicenseKeyMasterDataPageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	LicenseKeyMasterPage licenseKeyMasterpage;


	public LicenseKeyMasterDataPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws InterruptedException {

		initialization();
		loginPage = new LoginPage();
		licenseKeyMasterpage=new LicenseKeyMasterPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		   SystemMessageCheck();
           Thread.sleep(30000);
		licenseKeyMasterpage=homePage.LicenseKeyMasterModule();
	}

	@Test(priority=0)

	public void ShowDataButtonTest() throws InterruptedException{
		logger=extent.createTest("U-154: (AU) Update Map Versions, U-153: (AU) License key master data Module");
		licenseKeyMasterpage.MapVersionsButton();
		logger.createNode("Show data button is clicked").pass("Show data button is clicked successfully. Test case passed");
		//System.out.println(licenseKeyMasterpage.BGColor());
	}

	@Test(priority=1)

	public void AddEntryButtonTest() throws InterruptedException{
		licenseKeyMasterpage.AddEntryButton();
		logger.createNode("Add Entry button is clicked").pass("Add Entry button is clicked successfully. Test case passed");
	}

	@Test(priority=2)

	public void DeevelopmentStatusTest() throws InterruptedException{

		licenseKeyMasterpage.DevelopmentStatus();
		logger.createNode("Development Status field is provided with the input - 1111111111111111111111111111").pass("Development Status field is provided with the input - 1111111111111111111111111111. Test case passed");
	}

	@Test(priority=3)

	public void LanguageTest() throws InterruptedException{

		licenseKeyMasterpage.LanguageSelect();
		logger.createNode("Language field is provided with the input - English").pass("Language field is provided with the input - English. Test case passed");
	}

	@Test(priority=4)

	public void SoftwareIDTest() throws InterruptedException{

		licenseKeyMasterpage.SoftwareID();
		logger.createNode("Software ID field is provided with the input - 00012C04").pass("Software ID field is provided with the input - 00012C04. Test case passed");
	}

	@Test(priority=5)

	public void MapVersionTest() throws InterruptedException{

		licenseKeyMasterpage.MapVersion();
		logger.createNode("Map version field is provided with the input - Created By MBRDI").pass("Map version field is provided with the input - Created By MBRDI. Test case passed");
	}

	@Test(priority=6)

	public void CheckmarkButtonTest() throws InterruptedException{

		licenseKeyMasterpage.Checkmarkbutton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case passed");
	}

	@Test(priority=7)

	public void AddEntryButtonTest_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.AddEntryButton();
		logger.createNode("Add Entry button is clicked").pass("Add Entry button is clicked successfully. Test case passed");
	}

	@Test(priority=8)

	public void DeevelopmentStatusTest_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.DevelopmentStatus_2ndEntry();
		logger.createNode("Development Status field is provided with the input - 2222222222222222222222222222").pass("Development Status field is provided with the input - 2222222222222222222222222222. Test case passed");
	}

	@Test(priority=9)

	public void LanguageTest_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.LanguageSelect();
		logger.createNode("Language field is provided with the input - English").pass("Language field is provided with the input - English. Test case passed");
	}

	@Test(priority=10)

	public void SoftwareIDTes_2ndEntryt() throws InterruptedException{

		licenseKeyMasterpage.SoftwareID();
		logger.createNode("Software ID  field is provided with the input - 00012C04").pass("Software ID  field is provided with the input - 00012C04. Test case passed");
	}

	@Test(priority=11)

	public void MapVersionTest_2ndEnrty() throws InterruptedException{

		licenseKeyMasterpage.MapVersion();
		logger.createNode("Map version  field is provided with the input - Created By MBRDI").pass("Map version  field is provided with the input - Created By MBRDI. Test case passed");
	}

	@Test(priority=12)

	public void CheckmarkButtonTes_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.Checkmarkbutton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case passed");
	}

	@Test(priority=13)

	public void SaveButtonTest() throws InterruptedException{

		licenseKeyMasterpage.SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case passed");
	}

	@Test(priority=14)

	public void FilterButton() throws InterruptedException{

		licenseKeyMasterpage.FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case passed");
	}

	@Test(priority=15)

	public void FilterText() throws InterruptedException{

		licenseKeyMasterpage.FilterText();
		logger.createNode("Search the table field is provided with the Development status input - 1111111111111111111111111111").pass("Search the table field is provided with the Development status input - 1111111111111111111111111111. Test case passed");
	}
	
	@Test(priority=16)
	public void mapVersions_Create_FilteredResult() throws InterruptedException{

		licenseKeyMasterpage.mapVersions_FilteredResult();
		logger.createNode("The filtered result of created Map Version is "+ licenseKeyMasterpage.mapVersions_FilteredResult()).pass("The filtered result of created Map Version is " + licenseKeyMasterpage.mapVersions_FilteredResult()+ ". Test case passed");
	}

	@Test(priority=17)
	public void mapVersions_EditButton() throws InterruptedException{

		licenseKeyMasterpage.mapVersions_EditButton();
		logger.createNode("Edit button is clicked in the filtered row").pass("Edit button is clicked in the filtered row. Test case passed");
	}
	
	@Test(priority=18)
	public void softwareId_Edit() throws InterruptedException{
		licenseKeyMasterpage.softwareId_Edit();
		logger.createNode("Software ID field is edited with the input - 00011107").pass("Software ID  field is edited with the input - 00011107. Test case passed");
	}

	@Test(priority=19)
	public void mapVersion_Edit() throws InterruptedException{
		licenseKeyMasterpage.mapVersion_Edit();
		logger.createNode("Map version field is edited with the input - Edited By MBRDI").pass("Map version field is edited with the input - Edited By MBRDI. Test case passed");
	}
	
	@Test(priority=20)
	public void mapVersions_DvdObjectNumber() throws InterruptedException{
		licenseKeyMasterpage.mapVersions_DvdObjectNumber();
		logger.createNode("DVD object number field is edited with the input - 11111").pass("DVD object number field is edited with the input - 11111. Test case passed");
	}
	
	@Test(priority=21)
	public void mapVersions_LicenseObjectNumber() throws InterruptedException{
		licenseKeyMasterpage.mapVersions_LicenseObjectNumber();
		logger.createNode("License object number field is edited with the input - 11111").pass("License object number field is edited with the input - 11111. Test case passed");
	}
	
	@Test(priority=22)

	public void checkmarkButton_Edit() throws InterruptedException{
		licenseKeyMasterpage.Checkmarkbutton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test case passed");
	}

	@Test(priority=23)

	public void saveButton_Edit() throws InterruptedException{
		licenseKeyMasterpage.SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case passed");
	}
	
	@Test(priority=24)

	public void filterButton_Edit() throws InterruptedException{

		licenseKeyMasterpage.FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case passed");
	}

	@Test(priority=25)

	public void filterText_Edit() throws InterruptedException{

		licenseKeyMasterpage.FilterText();
		logger.createNode("Search the table field is provided with the Development status input - 1111111111111111111111111111").pass("Search the table field is provided with the Development status input - 1111111111111111111111111111. Test case passed");
	}
	
	@Test(priority=26)
	public void mapVersions_Edit_FilteredResult() throws InterruptedException{

		licenseKeyMasterpage.mapVersions_FilteredResult();
		logger.createNode("The filtered result of edited Map Version row is "+ licenseKeyMasterpage.mapVersions_FilteredResult()).pass("The filtered result of edited Map Version row is "+ licenseKeyMasterpage.mapVersions_FilteredResult() + ". Test case passed");
	}
	
	@Test(priority=27)

	public void TrashButton() throws InterruptedException{

		licenseKeyMasterpage.TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test case passed");
	}

	@Test(priority=28)

	public void SaveButtonTest_DeleteDevelopmentStatus() throws InterruptedException{

		licenseKeyMasterpage.SaveButton();
		logger.createNode("Save button is clicked in the Thinclient to delete the Development Status").pass("Save button is clicked in the Thinclient to delete the Development Status. Test case passed");
	}
	
	@Test(priority=29)

	public void filterButton_Delete_1stEntry() throws InterruptedException{

		licenseKeyMasterpage.FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case passed");
	}

	@Test(priority=30)

	public void filterText_Delete_1stEntry() throws InterruptedException{

		licenseKeyMasterpage.FilterText();
		logger.createNode("For checking edited Map Version is deleted enter the Delveopment Status data - 1111111111111111111111111111 in the search field").pass("For checking edited Map Version is deleted enter the Delveopment Status data - 1111111111111111111111111111 in the search field. Test case passed");
	}
	
	@Test(priority = 31)
	public void automaticConflictStatusTab_EditedRow(){
		try {
			boolean displayFlag = licenseKeyMasterpage.mapVersions_CheckDisplayOfFilteredResult();
			if(displayFlag)
			logger.createNode("Edited Map Version row is displayed").fail("Edited Map Version row is displayed. Test case passed");
			else
				logger.createNode("Edited Map Version row is not displayed").pass("Edited Map Version " +licenseKeyMasterpage.mapVersions_FilteredResult()+ " row is not displayed. Test case passed");
		} catch (NoSuchElementException e) {
			logger.createNode("Edited Map Version row is not available").pass("Edited Map Version row is not available. Test case passed");
		}
	}
	
	@Test(priority=32)

	public void FilterButtonTest() throws InterruptedException{

		licenseKeyMasterpage.FilterButton();
		licenseKeyMasterpage.FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case passed");
	}

	@Test(priority=33)

	public void FilterText_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.FilterText_2ndEntry();
		logger.createNode("Search the table field is provided with the Development status input - 2222222222222222222222222222").pass("Search the table field is provided with the Development status input - 2222222222222222222222222222. Test case passed");
	}

	@Test(priority=34)

	public void TrashButton_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test case passed");
	}

	@Test(priority=35)

	public void SaveButtonTest_DeleteDevelopmentStatus_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test case passed");
	}
	
	@Test(priority=36)

	public void filterButton_Delete_2ndEntry() throws InterruptedException{

		licenseKeyMasterpage.FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test case passed");
	}

	@Test(priority=37)

	public void filterText_Delete_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.FilterText_2ndEntry();
		logger.createNode("For checking created Map version is deleted enter the Delveopment Status data - 2222222222222222222222222222 in the search field").pass("For checking created Map version is deleted enter the Delveopment Status data - 2222222222222222222222222222 in the search field. Test case passed");
	}
	
	@Test(priority = 38)
	public void automaticConflictStatusTab_CreatedRow(){
		try {
			boolean displayFlag = licenseKeyMasterpage.mapVersions_CheckDisplayOfFilteredResult();
			if(displayFlag)
			logger.createNode("Created Map Version row is displayed").fail("Created Map Version row is displayed. Test case passed");
			else
				logger.createNode("Created Map Version row is not displayed").pass("Created Map Version row is not displayed. Test case passed");
		} catch (NoSuchElementException e) {
			logger.createNode("Created Map Version row is not available").pass("Created Map Version row is not available. Test case passed");
		}
	}
	

	@Test(priority=39)

	public void RulesTab() throws InterruptedException{
		logger=extent.createTest("U-155: (AU) Show parameter country exceptions");
		licenseKeyMasterpage.RulesTab();
		logger.createNode("Rules Tab is clicked in the Thinclient").pass("Rules Tab is clicked in the Thinclient. Test case passed");
		licenseKeyMasterpage.CountryException_SubTab();
		logger.createNode("Country specification exception tab is clicked").pass("Country specification exception tab is clicked. Test case passed");
		
		licenseKeyMasterpage.RulesTab_ShowData();
		logger.createNode("Show button is clicked").pass("Show button is clicked. Test case passed");
	}

	@Test(priority=40)

	public void RulesTab_AddEntry() throws InterruptedException{
		logger=extent.createTest("U-156: (AU) Update parameter country exceptions");
		
		licenseKeyMasterpage.CountryException_SubTab();
		logger.createNode("Country specification exception tab is clicked").pass("Country specification exception tab is clicked. Test case passed");
		
		licenseKeyMasterpage.RulesTab_ShowData();
		logger.createNode("Show button is clicked").pass("Show button is clicked. Test case passed");
		
		licenseKeyMasterpage.RulesTab_CountryExceptions_ExportButton();
        logger.createNode("Export button is clicked & count of records is matched").pass("Count of records is matched is-"+licenseKeyMasterpage.RulesTab_TotalRecords()+". Test Case Passed");

		licenseKeyMasterpage.RulesTab_AddEntry();
		logger.createNode("Add Entry button is clicked").pass("Add Entry button is clicked. Test case passed");
	}

	@Test(priority=41)

	public void RulesTab_Exception() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_ExceptionCountry();
		logger.createNode("Exception Country updated in the Thinclient is - 991").pass("Exception Country updated in the Thinclient is - 991. Test case passed");
	}

	@Test(priority=42)

	public void RulesTab_DVDRegion() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_DVDRegion();
		logger.createNode("DVD region updated in the Thinclient is - AUS").pass("DVD region updated in the Thinclient is - AUS. Test case passed");
	}

	@Test(priority=43)

	public void RulesTab_CheckmarkButton() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked. Test case passed");
	}

	@Test(priority=44)

	public void RulesTab_2ndAddEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_AddEntry();
		logger.createNode("Add Entry is clicked").pass("Add Entry is clicked. Test case passed");
	}

	@Test(priority=45)

	public void RulesTab_Exception_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_ExceptionCountry_2ndEntry();
		logger.createNode("Exception Country updated in the Thinclient is - 992").pass("Exception Country updated in the Thinclient is - 992. Test case passed");
	}
	
	@Test(priority=46)

	public void RulesTab_DVDRegion_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_DVDRegion();
		logger.createNode("DVD region updated in the Thinclient is - AUS").pass("DVD region updated in the Thinclient is - AUS. Test case passed");
	}
	
	@Test(priority=47)

	public void RulesTab_CheckmarkButton_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked. Test case passed");
	}
	
	@Test(priority=48)

	public void RulesTab_SaveButton() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=49)

	public void RulesTab_FilterButton() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient").pass("Filter button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=50)

	public void RulesTab_FilterText() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_FilterText();
		logger.createNode("Exceptions code entered in the Thinclient is - 991").pass("Exceptions code entered in the Thinclient is - 991. Test case passed");
	}
	
	@Test(priority=51)

	public void RulesTab_TrashButton() throws InterruptedException{
		licenseKeyMasterpage.RulesTabTrashButton();
		logger.createNode("Trash button is clicked in the Thinclient").pass("Trash button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=52)

	public void RulesTab_SaveButton_Todelete() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=53)

	public void RulesTab_FilterButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient").pass("Filter button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=54)

	public void RulesTab_FilterText_For2dEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_FilterText_2ndEntry();
		logger.createNode("Exceptions code entered in the Thinclient is - 992").pass("Exceptions code entered in the Thinclient is - 992. Test case passed");
	}
	
	@Test(priority=55)

	public void RulesTab_TrashButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTabTrashButton();
		logger.createNode("Trash button is clicked in the Thinclient").pass("Trash button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=56)
	public void RulesTab_SaveButton_Todelete_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.RulesTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=57)

	public void EDPParameterTab() throws InterruptedException{
		logger=extent.createTest("U-157: (AU) Show EDP parameter");
		licenseKeyMasterpage.EDPParameterTab();
		logger.createNode("EDP Parameter tab is clicked in the Thinclient").pass("EDP Parameter tab is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=58)

	public void EDPParameterTab_ShowDataButton() throws InterruptedException{
		logger=extent.createTest("U-158: (AU) Update EDP parameter");
		licenseKeyMasterpage.EDPParameter_ShowDataButton();
		logger.createNode("Show data button is clicked in the Thinclient").pass("Show data button is clicked in the Thinclient. Test case passed");
	}
		
	@Test(priority=59)

	public void EDPParameterTab_AddEntryButton() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_AddEntryButton();
		logger.createNode("Add Entry button is clicked in the Thinclient").pass("Add Entry button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=60)

	public void EDPParameterTab_EDPCountry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_Country();
		logger.createNode("EDP Country updated in the Thinclient is - 993").pass("EDP Country updated in the Thinclient is - 993. Test case passed");
	}
	
	@Test(priority=61)

	public void EDPParameterTab_CheckmarkButton() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_checkmarkButton();
		logger.createNode("Checkmark button is clicked in the Thinclient").pass("Checkmark button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=62)

	public void EDPParameterTab_AddEntryButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_AddEntryButton();
		logger.createNode("Add Entry button is clicked in the Thinclient").pass("Add Entry button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=63)

	public void EDPParameterTab_EDPCountry_2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_Country_For2ndEntry();
		logger.createNode("EDP Country updated in the Thinclient is - 994").pass("EDP Country updated in the Thinclient is - 994. Test case passed");
	}
	
	@Test(priority=64)

	public void EDPParameterTab_CheckmarkButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_checkmarkButton();
		logger.createNode("Checkmark button is clicked in the Thinclient").pass("Checkmark button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=65)

	public void EDPParameterTab_SaveButton() throws InterruptedException{
		licenseKeyMasterpage.EPDParameter_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=66)

	public void EDPParameterTab_FilterButton() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient").pass("Filter button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=67)

	public void EDPParameterTab_FilterText() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_FilterText();
		logger.createNode("EDP Country entered to search in the in the Thinclient is - 993").pass("EDP Country entered to search in the in the Thinclient is - 993. Test case passed");
	}
	
	@Test(priority=68)

	public void EDPParameterTab_TrashButton() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test case passed");
	}
	
	@Test(priority=69)

	public void EDPParameterTab_SaveButton_TodeleteEntry() throws InterruptedException{
		licenseKeyMasterpage.EPDParameter_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=70)

	public void EDPParameterTab_FilterButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test case passed");
	}
	
	@Test(priority=71)

	public void EDPParameterTab_FilterText_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_FilterText_For2ndEntry();
		logger.createNode("EDP Country entered to search in the in the Thinclient is - 994").pass("EDP Country entered to search in the in the Thinclient is - 994. Test case passed");
	}
	
	@Test(priority=72)

	public void EDPParameterTab_TrashButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EDPParameter_TrashButton();
		logger.createNode("Trash Button is clicked").pass("Trash Button is clicked. Test case passed");
	}
	
	@Test(priority=73)

	public void EDPParameterTab_SaveButton_Todelete2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.EPDParameter_SaveButton();
		logger.createNode("Save Button is clicked").pass("Save Button is clicked. Test case passed");
	}
	
	@Test(priority=74)

	public void GoodwillPeriodTab() throws InterruptedException{
		logger=extent.createTest("U-159: (AU) Show parameter first update");
		licenseKeyMasterpage.GoodWillPeriodTab();
		logger.createNode("GoodWill Period Tab is clicked").pass("GoodWill Period Tab is clicked. Test case passed");
	}
	
	@Test(priority=75)

	public void GoodwillPeriodTab_ShowDataButton() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_ShowDataButton();
		logger.createNode("Show Data button is clicked").pass("Show Data button is clicked. Test case passed");
	}
	
	@Test(priority=76)

	public void GoodwillPeriodTab_AddEntryButton() throws InterruptedException{
		logger=extent.createTest("U-160: (AU) Update parameter first update");
		licenseKeyMasterpage.GoodWillPeriodTab_AddEntryButton();
		logger.createNode("Add Entry button is clicked in the Thinclient").pass("Add Entry button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=77)

	public void GoodwillPeriodTab_DesignationCountry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_DesignationCountry();
		logger.createNode("Designation Country updated in the Thinclient is - 12").pass("Designation Country updated in the Thinclient is - 12. Test case passed");
	}
	
	@Test(priority=78)

	public void GoodwillPeriodTab_DesignationModelseries() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_ModelSeries();
		logger.createNode("Model Series updated in the Thinclient is - 771").pass("Model Series updated in the Thinclient is - 771. Test case passed");
	}
	
	@Test(priority=79)

	public void GoodwillPeriodTab_CheckmarkButton() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_CheckMarkButton();
		logger.createNode("Checkmark button is clicked in the Thinclient").pass("Checkmark button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=80)

	public void GoodwillPeriodTab_AddEntryButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_AddEntryButton();
		logger.createNode("Add Entry button is clicked in the Thinclient").pass("Add Entry button is clicked in the Thinclient. Test case passed");
	}
	
	@Test(priority=81)

	public void GoodwillPeriodTab_DesignationCountry_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_DesignationCountry_For2ndEntry();
		logger.createNode("Designation Country updated in the Thinclient is - 14").pass("Designation Country updated in the Thinclient is - 14. Test case passed");
	}
	
	@Test(priority=82)

	public void GoodwillPeriodTab_DesignationModelseries_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_ModelSeries_For2ndEntry();
		logger.createNode("Model Series updated in the Thinclient is - 772").pass("Model Series updated in the Thinclient is - 772. Test case passed");
	}
	
	@Test(priority=83)

	public void GoodwillPeriodTab_CheckmarkButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_CheckMarkButton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked. Test case passed");
	}
	
	@Test(priority=84)

	public void GoodwillPeriodTab_SaveButton() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=85)

	public void GoodwillPeriodTab_FilterButton() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test case passed");
	}
	
	@Test(priority=86)

	public void GoodwillPeriodTab_FilterText() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_FilterText();
		logger.createNode("Designation Text entered in the Thinclient is - 771").pass("Designation Text entered in the Thinclient is - 771. Test case passed");
	}
	
	@Test(priority=87)

	public void GoodwillPeriodTab_TrashButton() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test case passed");
	}
	
	@Test(priority=88)

	public void GoodwillPeriodTab_SaveButton_ForDeletingEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=89)

	public void GoodwillPeriodTab_FilterButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test case passed");
	}
	
	@Test(priority=90)

	public void GoodwillPeriodTab_FilterText_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_FilterText_For2ndEntry();
		logger.createNode("Designation Text entered in the Thinclient is - 772").pass("Designation Text entered in the Thinclient is - 772. Test case passed");
	}
	
	@Test(priority=91)

	public void GoodwillPeriodTab_TrashButton_For2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_TrashButton();
		logger.createNode("Trash button is clicked").pass("Trash button is clicked. Test case passed");
	}
	
	@Test(priority=92)

	public void GoodwillPeriodTab_SaveButton_ForDeleting2ndEntry() throws InterruptedException{
		licenseKeyMasterpage.GoodWillPeriodTab_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=93)

	public void HardShipCase() throws InterruptedException{
		logger=extent.createTest("U-161: (AU) Show parameter hardship");
		licenseKeyMasterpage.HardshipCase_Tab();
		logger.createNode("Hardhship Case Tab is clicked").pass("Hardhship Case Tab is clicked. Test case passed");
	}
	
	@Test(priority=94)

	public void HardShipCase_ShowDataButton() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_ShowDataButton();
		logger.createNode("Show Data button is clicked").pass("Show Data button is clicked. Test case passed");
	}
	
	@Test(priority=95)

	public void HardShipCase_AddEntryButton() throws InterruptedException{
		logger=extent.createTest("U-162: (AU) Update parameter hardship");
		licenseKeyMasterpage.HardshipCaseTab_AddEntryButton();
		logger.createNode("Add Entry button is clicked").pass("Add Entry button is clicked. Test case passed");
	}
	
	@Test(priority=96)

	public void HardShipCase_FINNumber() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_FINNumber();
		logger.createNode("FIN Number updated in the Thinclient is - 11111111111111111").pass("FIN Number updated in the Thinclient is - 11111111111111111. Test case passed");
	}
	
	@Test(priority=97)

	public void HardShipCase_SoftwareID() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_SoftwareID();
		logger.createNode("Software ID updated in the Thinclient is - 0001100F").pass("Software ID updated in the Thinclient is - 0001100F. Test case passed");
	}
	
	@Test(priority=98)

	public void HardShipCase_CheckmarkButton() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked. Test case passed");
	}
	
	@Test(priority=99)

	public void HardShipCase_SaveButton() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_SaveButton();
		logger.createNode("Save button is clicked").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=100)

	public void HardShipCase_FilterButton() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_FilterButton();
		logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test case passed");
	}
	
	@Test(priority=101)

	public void HardShipCase_FilterText() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_FilterText();
		logger.createNode("FIN Number entered to search in the Thinclient is - 11111111111111111").pass("FIN Number entered to search in the Thinclient is - 11111111111111111. Test case passed");
	}
	
	@Test(priority=102)

	public void HardShipCase_TrashButton() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_TrashButton();
		logger.createNode("Trash Button is clicked").pass("Trash Button is clicked. Test case passed");
	}
	
	@Test(priority=103)

	public void HardShipCase_SaveButton_ToDeleteEntry() throws InterruptedException{
		licenseKeyMasterpage.HardshipCaseTab_SaveButton();
		logger.createNode("Save Button is clicked").pass("Save Button is clicked. Test case passed");
	}
	
	@Test(priority=104)

	public void MultiYearUpdate_Tab() throws InterruptedException{
		logger=extent.createTest("U-226: (AU) Show parameter multi year update");
		licenseKeyMasterpage.MultiYearUpdateTab();
		logger.createNode("Multi Year update Tab is clicked in the Thinclient").pass("Multi Year update Tab is clicked. Test case passed");
	}
	
	@Test(priority=105)

	public void MultiYearUpdateTab_ShowDataButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_ShowDataButton();
		logger.createNode("Show Data button is clicked in the Thinclient").pass("Show Data button is clicked. Test case passed");
	}
	
	@Test(priority=106)

	public void MultiYearUpdateTab_AddEntryButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_AddEntryButton();
		logger.createNode("Add Entry button is clicked in the Thinclient").pass("Add entry button is clicked. Test case passed");
	}
	
	@Test(priority=107)

	public void MultiYearUpdateTab_ModelSeries() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_ModelSeries();
		logger.createNode("Model Series updated in the Thinclient is - 157").pass("Model Series updated in the Thinclient is - 157. Test case passed");
	}
	
	@Test(priority=108)

	public void MultiYearUpdateTab_ModelYearCode() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_ModelYearCode();
		logger.createNode("Model Year Code From updated in the Thinclient is - 805").pass("Model Year Code From updated in the Thinclient is - 805. Test case passed");
	}
	//Vishakha
		@Test(priority=109)

		public void MultiYearUpdateTab_ModelYearCodeTo() throws InterruptedException{
			licenseKeyMasterpage.MultiYearUpdateTab_ModelYearCodeTo();
			logger.createNode("Model Year code To updated in the Thinclient is - 807").pass("Model Year code To updated in the Thinclient is - 807. Test case passed");
		}
		@Test(priority=110)

		public void MultiYearUpdateTab_Country1() throws InterruptedException{
			licenseKeyMasterpage.MultiYearUpdateTab_Country1();
			logger.createNode("Country1 updated in the Thinclient is - 920").pass("Country1 updated in the Thinclient is - 920. Test case passed");
		}
		@Test(priority=111)

		public void MultiYearUpdateTab_SACode() throws InterruptedException{
			licenseKeyMasterpage.MultiYearUpdateTab_SACode();
			logger.createNode("SA Code updated in the Thinclient is - 503").pass("SA Code updated in the Thinclient is - 503. Test case passed");
		}
		@Test(priority=112)

		public void MultiYearUpdateTab_MyPeriodDays() throws InterruptedException{
			licenseKeyMasterpage.MultiYearUpdateTab_MyPeriodDays();
			logger.createNode("My Period in days updated in the Thinclient is - 1186").pass("My Period in days updated in the Thinclient is - 1186. Test case passed");

		}
		//over
	@Test(priority=113)

	public void MultiYearUpdateTab_DVDRegion() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_DVDRegion();
		logger.createNode("DVD Region updated in the Thinclient is - SEA").pass("DVD Region updated in the Thinclient is - SEA. Test case passed");
	}
	
	@Test(priority=114)

	public void MultiYearUpdateTab_CheckMarkButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked in the Thinclient").pass("Checkmark button is clicked. Test case passed");
	}
	
	@Test(priority=115)

	public void MultiYearUpdateTab_SaveButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked. Test case passed");
	}
	
	@Test(priority=116)

	public void MultiYearUpdateTab_FilterButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient").pass("Filter button is clicked. Test case passed");
	}
	@Test(priority=117)

	public void MultiYearUpdateTab_FilterText() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_FilterText();
		logger.createNode("Model Series entered in the Thinclient to search is - 157").pass("Model Series entered in the Thinclient to search is - 157. Test case passed");
	}
	@Test(priority=118)

	public void MultiYearUpdateTab_Updateicon() throws InterruptedException{
		logger=extent.createTest("U-227: (AU) Update parameter multi year update");
		licenseKeyMasterpage.MultiYearUpdateTab_Updateicon();
		logger.createNode("Update icon is clicked in the Thinclient").pass("Update icon is clicked. Test case passed");
	}
	@Test(priority=119)

	public void MultiYearUpdateTab_UpdateModelYearCodeTo() throws InterruptedException{
		licenseKeyMasterpage.UpdateMultiYearUpdateTab_ModelYearCodeTo();
		logger.createNode("Model Year code To updated in the Thinclient is - 806").pass("Model Year code To updated in the Thinclient is - 806. Test case passed");
	}
	@Test(priority=120)

	public void MultiYearUpdateTab_UpdateCountry1() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_UpdateCountry1();
		logger.createNode("Country1 updated in the Thinclient is - 921").pass("Country1 updated in the Thinclient is - 921. Test case passed");
	}
	@Test(priority=121)

	public void MultiYearUpdateTab_UpdateSACode() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_UpdateSACode();
		logger.createNode("SA Code updated in the Thinclient is - 504").pass("SA Code updated in the Thinclient is - 504. Test case passed");
	}
	@Test(priority=122)

	public void MultiYearUpdateTab_UpdateMyPeriodDays() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_UpdateMyPeriodDays();
		logger.createNode("My Period in days updated in the Thinclient is - 1187").pass("My Period in days updated in the Thinclient is - 1187. Test case passed");

	}
	@Test(priority=123)

	public void MultiYearUpdateTab_CheckMarkButtonAfterUpdate() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_CheckmarkButton();
		logger.createNode("Checkmark button is clicked in the Thinclient").pass("Checkmark button is clicked. Test case passed");
	}
	@Test(priority=124)

	public void MultiYearUpdateTab_SaveButtonAfterUpdate() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked. Test case passed");
	}
	@Test(priority=125)

	public void MultiYearUpdateTab_FilterButtonAfterUpdate() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_FilterButton();
		logger.createNode("Filter button is clicked in the Thinclient").pass("Filter button is clicked. Test case passed");
	}
	@Test(priority=126)

	public void MultiYearUpdateTab_FilterTextAfterUpdate() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_FilterText();
		logger.createNode("Model Series entered in the Thinclient to search is - 157").pass("Model Series entered in the Thinclient to search is - 157. Test case passed");
	}
	@Test(priority=127)

	public void MultiYearUpdateTab_TrashButton() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_TrashButton();
		logger.createNode("Trash button is clicked in the Thinclient").pass("Trash button is clicked. Test case passed");
	}
	
	@Test(priority=128)

	public void MultiYearUpdateTab_SaveButton_ToDeleteEntry() throws InterruptedException{
		licenseKeyMasterpage.MultiYearUpdateTab_SaveButton();
		logger.createNode("Save button is clicked in the Thinclient").pass("Save button is clicked. Test case passed");
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
	public void teardown() {
		driver.quit();
	}
}




