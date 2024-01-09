
package com.vedoc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MasterDataPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class MasterDataPageTest extends TestBase {


	HomePage homePage;
	LoginPage loginPage;
	MasterDataPage masterdatapage;
	public static String cook4;

	public MasterDataPageTest(){
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		masterdatapage = new MasterDataPage();
		homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));
		logger = extent.createTest("(RU) Login to application using Reading User credentials");
    	SystemMessageCheck();
		masterdatapage = homePage.MasterData();
		logger.createNode("Master data page is clicked").pass("Master data page is clicked successfully. Testcase is passed");

	}

	@Test(priority=0)
	
	public void CodesDataTest() throws InterruptedException{

		masterdatapage.CodesData_MasterData();
		
		logger=extent.createTest("U-300: (RU) Codes Tab of Master Data module");
		logger.createNode("Show data button is clicked in the Codes Tab").pass(" Show Data button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Special equipement Table contents in CSV file").pass(" Special equipement Table contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset button is clicked successfully. Test case is passed");
		logger.createNode("Click on the 'Filter' button to enter the code - '003' to display only the relevant code results").pass(" Filter button is clicked successfully. Test case is passed");

		logger.createNode("Scrolled successfully to the 50th element in the Special equipement Table").pass("Scrolled successfully to the 50th element. Test case is passed");
		
		logger.createNode("Download the contents of csv file from Paint Table").pass(" Paint Table contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are arranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset sorting is done successfully. Test case is passed");
		logger.createNode("Click on the 'Filter' button to enter the code - '221' to display only the relevant code results").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Paint Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		logger.createNode("Download the contents of csv file from Interior Equipment Table").pass("Interior Equipment Table contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset button is clicked successfully. Test case is passed");
		logger.createNode("Click on the 'Filter' button to enter the code - '207' to display only the relevant code results").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("Scrolling to the 50th element in the Table").pass(" Scrolled successfully to the 50th element. Test case is passed");

		
		logger=extent.createTest("U-271: (RU) Additional Paintwork Tab of Master Data module");
		logger.createNode("Additioal Paintwork contents are downloaded in the CSV file").pass(" Additioal Paintwork contents are downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are arranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset button is clicked successfully. Test case is passed");
		logger.createNode("Filter button is clicked to enter the code - '46' to display only the relevant code results ").pass(" Filter button is clicked successfully. Test case is passed");
		logger.log(Status.INFO, "TestCaseID : TC-057");
		
		logger.createNode("Provision contents are downloaded in the CSV file").pass(" Provision contents are downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are arranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset button is clicked successfully. Test case is passed");
		
		
		logger=extent.createTest("U-273: (RU) Show Third party codes of Master Data module");
		logger.createNode("Show Third party codes are downloaded in the CSV file").pass(" Show Third party codes contents are downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are arranged successfully. Test case is passed");
		logger.createNode("Clicking on 'Reset Sorting' to restore the original order of Codes").pass(" Reset button is clicked successfully. Test case is passed");
		logger.createNode("Filter button is clicked to enter the code - '11' to display only the relevant code results ").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 150th element in the table").pass(" Scrolled successfully to the 50th element. Test case is passed");

	}
	

	
	@Test(priority=2)
	public void SAANumbersTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.SAANumbers_DataTest();
		
		logger=extent.createTest("U-039: (RU) Show SAA Master Data");
		logger.log(Status.INFO, "TestCaseID : TC-041");
		logger.createNode("To enter the '123456' SAA number in the search field and click on the 'Search' button").pass(" Search button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the SAA Designation Table contents in CSV file").pass(" Downloading the SAA Designation Table contents is successfull. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are arranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - 'SV LIGHTING' to display the relevant results in SAA tables ").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button ").pass(" Cancel Filter button is clicked successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the SAA Designation Table").pass(" Scrolled successfully to the 50th element. Test case is passed");

	
	}
	
	
	@Test(priority=3)
	
	public void SAANumbersTabPDFOfMasterDataModule() throws InterruptedException{
		
		ClickingOnURLButtons();
		
		logger=extent.createTest("U-130: (RU) Generate Master Data pdf for KG Designations");
		logger.createNode("Opens the KG Designations PDF contents in the new Tab").pass(" Click on the PDF button. Test case is passed");
		logger=extent.createTest("U-131: (RU) Generate Master Data pdf for SAA Numbers");
		logger.log(Status.INFO, "TestCaseID: TC-042");
		logger.log(Status.INFO, "TestCaseID: TC-043");
		logger.createNode("Opens the SAA Numbers PDF contents in the new Tab").pass(" Click on the PDF button. Test case is passed");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}

	
	@Test(priority=4)
	public void DesignGroupTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.DesignGroupTabTest();
		
		logger=extent.createTest("U-151: (RU) Executing Design Groups tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-048");
		logger.log(Status.INFO, "TestCaseID: TC-049");
		logger.createNode("To click on the 'Search' button in the Design Groups tab").pass(" Search button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Assembly Group Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Downloading the Design Group Table contents in CSV file");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - A0000000275 to display the relevant results in Design group tables").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Design group Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
}
	
	@Test(priority=5)
	
	public void GenerateMasterDataPdfforAssemblyGroups() throws InterruptedException{
		warmup5();
		ClickingOnURLButtons();
		
		logger=extent.createTest("U-152: (RU) Generate Master Data pdf for Assembly Groups");
		logger.log(Status.INFO, "TestCaseID: TC-050");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	
	@Test(priority=6)
	public void VPDIDsTabOfMasterDataModule() throws InterruptedException{
		warmup5();
		masterdatapage.VPDIDsTabTest();
		logger=extent.createTest("U-042: (RU) Executing VPD IDs tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-044");
		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the VpdIdentTable Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '45' to display the relevant results in VPD IDs tables").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");

		logger.createNode("Scrolled successfully to the 50th element in the VpdIdent Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
	}
	
	@Test(priority=7)
	
	public void GenerateMasterDataPDFForVPDDesignations() throws InterruptedException{
		
		ClickingOnURLButtons();
		
		logger=extent.createTest("U-120: (RU) Generate Master Data pdf for VPD Designations");
		logger.log(Status.INFO, "TestCaseID: TC-45");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	


	@Test(priority=8)
	public void VehicleModelTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.VehicleModelTabTest();
		
		logger=extent.createTest("U-106: (RU) Executing Vehicle model tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-46");
		logger.createNode("Click on the 'Search' button").pass(" Search button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Vehicle Model Designation Show Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Vehicle model designation Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '126' to display the relevant results in vehicle model designation tables").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		
		
	}
	
   @Test(priority=9)
	
	public void VehicleModelTabPDFofMasterDataModule() throws InterruptedException{
		
		ClickingOnURLButtons();
		
		logger=extent.createTest("U-125: (RU) Generate Master Data pdf for Vehicle Model");
		logger.log(Status.INFO, "TestCaseID: TC-047");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	
	@Test(priority=10)
	public void ControlUnitVPDIDnoAssignmentOfMasterDataModule() throws InterruptedException{
		logger=extent.createTest("U-141: (RU) Control unit VPD ID no.assignment tab of Master Data module");
		masterdatapage.ControlUnitVPDIdDataTest();
		logger.log(Status.INFO, "TestCaseID: TC-061");
		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the entire assignment Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - 'ALW' to display the relevant results in the table").pass(" Filter button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Mapping Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Mapping Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
		
	}
	
	
	
	@Test(priority=12)
	public void CountryDesignationTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.CountryDesignationTabTest();
		
		logger=extent.createTest("U-035: (RU) Show master data for sales areas");
		logger.log(Status.INFO, "TestCaseID: TC-039");
		logger.createNode("Downloading the entire assignment Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");

		logger.createNode("Downloading the Sales Area Consumer Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Sales Consumer Area Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
	}
	
    @Test(priority=13)
	
	public void GenerateMasterDataPDFforCountryDesignations() throws InterruptedException{
		
		ClickingOnURLButtons();
		
		logger=extent.createTest("U-128: (RU) Generate Master Data pdf for Country Designations");
		logger.log(Status.INFO, "TestCaseID: TC-063");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	@Test(priority=14)
	public void PlantsTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.PlantsTabTest();
		logger=extent.createTest("U-037: (RU) Show master data for plants");
		logger.log(Status.INFO, "TestCaseID: TC-040");
		logger.createNode("Downloading the Plant Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");	
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '2' to display the relevant results in Plants tables").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Plants Table").pass(" Scrolled successfully to the 50th element. Test case is passed");	
		
	}
	
    @Test(priority=15)
	
	public void GenerateMasterDataPDFForPlantDesignations() throws InterruptedException{
		
		ClickingOnURLButtons();
		logger=extent.createTest("U-116: (RU) Generate Master Data pdf for Plant Designations");
		logger.log(Status.INFO, "TestCaseID: TC-064");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	@Test(priority=16)
	public void SpecialPlantText_MasterDataModule() throws InterruptedException{
		
		masterdatapage.SpecialPlantTabTest();
		
		logger=extent.createTest("U-270: (RU) Executing Special Plant texts tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-056");
		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Special Plant Text Designation Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Special Plant Text Designation Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
		
	}
	
	@Test(priority=17)
	public void DGDesignationDataTest(){
		
		masterdatapage.DGDesignationTabTest();
		
		logger=extent.createTest("(RU) DG Designation tab of Master Data module");
		
		logger.createNode("Downloading the Design Group in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the assending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '25' to display the relevant results in SAA tables").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Design group Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
	}
	
	
	@Test(priority=18)
	public void ElectricalVariant_MasterDataModule(){
		
		masterdatapage.ElectricalVariantTabTest();
		
		logger=extent.createTest("U-196: (RU) Executing Electrical Variant tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-053");
		logger.createNode("Downloading the Electro Variant Designation in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - 51' to display the relevant results in Electrical variants tables").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");

		logger.createNode("Scrolled successfully to the 50th element in the Electrical Variant Designation Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
		
	}
	
	@Test(priority=19)
	public void BodiesTabOfMasterDataModule() throws InterruptedException{
		
		masterdatapage.BodiesTabTest();
		
	//	logger=extent.createTest("U-037: Show Body Master Data");
		logger=extent.createTest("U-031: (RU) Show Body Master Data");
		logger.createNode("Click on the 'Show Data' button").pass(" Show Data button is clicked successfully. Test case is passed");
		logger.createNode("Downloading the Body Manufacturer Naviagtion Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '12' to display the relevant results in Bodies(Manufacturer) tables").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Body Manufacturing Navigation Table").pass(" Scrolled successfully to the 50th element. Test case is passed");
		
	}
	
	@Test(priority=20)
	public void GenerateMasterDataPDFForBodyManufacturer() throws InterruptedException{
		
		ClickingOnURLButtons();
		logger=extent.createTest("U-126: (RU) Generate Master Data pdf for Body Manufacturer");
		logger.log(Status.INFO, "TestCaseID: TC-038");
		logger.log(Status.INFO, "TestCaseID: TC-064");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	
	
	
	@Test(priority=21)
	public void BodiesKWCodesMasterDataModule() throws InterruptedException{
		warmup5();
		masterdatapage.BodiesKWTabTest();
		
		logger=extent.createTest("U-168: (RU) Executing Bodies (KW) tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-060");
		logger.createNode("Enter 12W as the input and click on the 'Search' button").pass(" Search button is clicked. Test case is passed");
		logger.createNode("Downloading the local Customer Request Codes Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '12' to display the relevant results in Bodies(KW Codes) tables").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		logger.createNode("Scrolled successfully to the 50th element in the Local customer Request Codes Table").pass(" Scrolled successfully to the 50th element. Test case is passed");	
	}
	
	
	@Test(priority=22)
	public void GenerateMasterDataPDFForCustomerRequestCodes() throws InterruptedException{
		warmup5();
        ClickingOnURLButtons();
		
		logger=extent.createTest("U-123: (RU) Generate Master Data pdf for Customer Request Codes");
		logger.log(Status.INFO, "TestCaseID: TC-060");
		logger.createNode("Clicking on Print button works as expected and opens PDF in new tab").pass(" PDF is opened in the new tab. Test case is passed");
		logger.createNode("Clicking on Vedoc Information page button works as expected and opens Xentry portal in new tab").pass(" Xentry portal is opened in new Tab. Test case is passed");
		logger.createNode("Clicking on System Message button works as expected and opens a dialog").pass(" System message opens a dialog successfully. Test case is passed");
		
	}
	
	@Test(priority=23)
	public void LabelTab_MasterDataModule() throws InterruptedException{
		warmup5();
		masterdatapage.LabelDataTabTest();
		
		logger=extent.createTest("U-285: (RU) Executing Label Data tab of Master Data module");
		logger.log(Status.INFO, "TestCaseID: TC-059");
		logger.createNode("Downloading the label Content Designation Table contents in CSV file").pass(" CSV contents downloaded successfully. Test case is passed");
		logger.createNode("Codes are rearranged in the asscending order").pass(" Codes are rearranged successfully. Test case is passed");
		logger.createNode("To click on 'Filter' button and enter the text - '5' to display the relevant results in 'Label Data' tables ").pass(" Filter button is clicked Successfully. Test case is passed");
		logger.createNode("To click on the 'Cancel Filter' button ").pass(" Cancel Filter button is clicked Successfully. Test case is passed");
		
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
	

