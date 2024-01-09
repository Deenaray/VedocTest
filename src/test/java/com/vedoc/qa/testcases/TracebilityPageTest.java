// Successfully running - 27/2/2022
// Went through 
package com.vedoc.qa.testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.TraceablePartArrangementModulePage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class TracebilityPageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	TraceablePartArrangementModulePage TraceablePartArrangement;
	ITestResult result;
	public static String cook4;

	public TracebilityPageTest() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		TraceablePartArrangement = new TraceablePartArrangementModulePage();		
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger = extent.createTest("(AU) Login to application using Admin User credentials");
		SystemMessageCheck();
		TraceablePartArrangement = homePage.TraceablePartArrangementModule();
		logger = extent.createTest("(AU) Navigate to Traceable parts");
		logger.createNode("Click on Traceable parts icon").pass("Navigated to Traceable parts page. Testcase Passed");
	}

	@Test(priority = 0)
	public void SearchButtonTest() throws InterruptedException{
		logger = extent.createTest("U-200: Tracibility Parts Arrangement");
		Thread.sleep(10000);
		TraceablePartArrangement.passIdCode();
		warmup5();
		TraceablePartArrangement.SearchButton();
        logger.createNode("Search button is clicked in the ThinClient").pass("Search button is clicked in the ThinClient. Test Case Passed");

	}

	@Test(priority = 1)
	public void FirstTableEntryCheck(){

		TraceablePartArrangement.FirstEntryValidation();
        logger.createNode("Data verification pending - First entry displayed in the Thinclient is : " + TraceablePartArrangement.FirstEntryValidation()).pass("Data verification pending - First entry displayed in the Thinclient is : " + TraceablePartArrangement.FirstEntryValidation()+". Test Case Passed");
	}

	@Test(priority = 2)
	public void FirstArrowLinkClick() throws InterruptedException{
		TraceablePartArrangement.FirstArrowlink();
		TraceablePartArrangement.SwitchingWindow();
        logger.createNode("First Arrow link is displayed in the Thinclient").pass("First Arrow link is displayed in the Thinclient. Test Case Passed");
	}

	@Test(priority = 3)
	public void engineNumber(){
		logger = extent.createTest("U-002: Vehicle Data Page Test");
		TraceablePartArrangement.EngineNo();
        logger.createNode("Data verification pending - Fin Number displayed in the Thinclient is - " + TraceablePartArrangement.EngineNo()).pass("Data verification pending - Fin Number displayed in the Thinclient is - " + TraceablePartArrangement.EngineNo()+". Test Case Passed");
	}

	@Test(priority = 4)
	public void varientNumber(){
		TraceablePartArrangement.VarientNo();
        logger.createNode("Data verification pending - Vin Number displayed in the Thinclient is - " + TraceablePartArrangement.VarientNo()).pass("Data verification pending - Vin Number displayed in the Thinclient is - " + TraceablePartArrangement.VarientNo()+". Test Case Passed");
	}

	@Test(priority = 5)
	public void partNumber(){
		TraceablePartArrangement.partNo();
        logger.createNode("Data verification pending - Brand displayed in the Thinclient is - " + TraceablePartArrangement.partNo()).pass("Data verification pending - Brand displayed in the Thinclient is - " + TraceablePartArrangement.partNo()+". Test Case Passed");
	}
	
	@Test(priority = 6)
	public void currentlyVIN_number(){
		TraceablePartArrangement.currently_VINNumber();
        logger.createNode("Data verification pending - Category displayed in the Thinclient is - " + TraceablePartArrangement.currently_VINNumber()).pass("Data verification pending - Category displayed in the Thinclient is - " + TraceablePartArrangement.currently_VINNumber()+". Test Case Passed");
	}
	
	@Test(priority = 7)
	public void pageVarient_Number(){
		TraceablePartArrangement.pageVarient();
		logger.createNode("Data verification pending - Vehicle Model displayed in the Thinclient is - " + TraceablePartArrangement.pageVarient());
	}
	@Test(priority = 8)
	public void lastmodification_Date(){
	String VehicleType=	TraceablePartArrangement.lastmodificationDate();
	if(VehicleType.isEmpty()){
        logger.createNode("Customized Vehicle Type is not displayed in the Thinclient").fail("Customized Vehicle Type is not displayed in the Thinclient. Test Case Passed");
	}else{
        logger.createNode("Data verification pending - Customized Vehicle Type displayed in the Thinclient is - " + TraceablePartArrangement.lastmodificationDate()).pass("Data verification pending - Customized Vehicle Type displayed in the Thinclient is - " + TraceablePartArrangement.lastmodificationDate()+". Test Case Passed");
	}
	}
	
	@Test(priority = 9)
	public void OrderNumber(){
		TraceablePartArrangement.OrderNumber();
        logger.createNode("Data verification pending - Order Number displayed in the Thinclient is - " + TraceablePartArrangement.OrderNumber()).pass("Data verification pending - Order Number displayed in the Thinclient is - " + TraceablePartArrangement.OrderNumber()+". Test Case Passed");
	}
	
	@Test(priority = 10)
	public void ProductionNumber(){
		TraceablePartArrangement.ProductionNumber();
        logger.createNode("Data verification pending - Production Number displayed in the Thinclient is - " + TraceablePartArrangement.ProductionNumber()).pass("Data verification pending - Production Number displayed in the Thinclient is - " + TraceablePartArrangement.ProductionNumber()+". Test Case Passed");
	}
	
	@Test(priority = 11)
	public void instanceversion_Number(){
		TraceablePartArrangement.instanceversionNumber();
        logger.createNode("Data verification pending - Body Type Number displayed in the Thinclient is - " + TraceablePartArrangement.instanceversionNumber()).pass("Data verification pending - Body Type Number displayed in the Thinclient is - " + TraceablePartArrangement.instanceversionNumber()+". Test Case Passed");
	}
	
	@Test(priority = 12)
	public void ProductionPlant(){
		TraceablePartArrangement.ProductionPlant();
        logger.createNode("Data verification pending - Production plant displayed in the Thinclient is - " + TraceablePartArrangement.ProductionPlant()).pass("Data verification pending - Production plant displayed in the Thinclient is - " + TraceablePartArrangement.ProductionPlant()+". Test Case Passed");
	}
	
	@Test(priority = 13)
	public void ShipmentDate(){
		TraceablePartArrangement.ShipmentDate();
        logger.createNode("Data verification pending - Shipment date displayed in the Thinclient is - " + TraceablePartArrangement.ShipmentDate()).pass("Data verification pending - Shipment date displayed in the Thinclient is - " + TraceablePartArrangement.ShipmentDate()+". Test Case Passed");
	}
	
	@Test(priority = 14)
	public void Status(){
		TraceablePartArrangement.Status();
        logger.createNode("Data verification pending - Shipment date displayed in the Thinclient is - " + TraceablePartArrangement.Status()).pass("Data verification pending - Shipment date displayed in the Thinclient is - " + TraceablePartArrangement.Status()+". Test Case Passed");
		TraceablePartArrangement.SwitchingToParentWindow();
        logger.createNode("Switched to the Parent Tab").pass("Switched to the Parent Tab. Test Case Passed");
	}
	
	@Test(priority = 15)
	public void Filter_Button(){
		logger = extent.createTest("Control Unit Overview");
		TraceablePartArrangement.FilterButtonFunctionality();
        logger.createNode("Filter Button is clicked").pass("Filter Button is clicked. Test Case Passed");
	}
	
	@Test(priority = 16)
	public void Filter_TextSearch(){
		TraceablePartArrangement.FilterSearchText();
        logger.createNode("Text entered to search is : 541").pass("Text entered to search is : 541. Test Case Passed");
        logger.createNode("Relevant search results related to 541 is displayed in the Thinclient").pass("Relevant search results related to 541 is displayed in the Thinclient. Test Case Passed");
	}
	
	@Test(priority = 17)
	public void CancelFilter_TextSearch(){
		TraceablePartArrangement.FilterButtonFunctionality();
        logger.createNode("Cancel Filter Button is clicked").pass("Cancel Filter Button is clicked. Test Case Passed");
		try {
			boolean flag = TraceablePartArrangement.controlUnit_AlertMsg();
			if (flag = true) {
				TraceablePartArrangement.controlUnit_AlertMsg_GetText();
				logger.createNode("Error message displayed - "+TraceablePartArrangement.controlUnit_AlertMsg_GetText()).fail("Error message displayed - "+TraceablePartArrangement.controlUnit_AlertMsg_GetText()+" .Testcase Passed");
				TraceablePartArrangement.controlUnit_AlertMsg_Close();
				logger.createNode("Error message is closed").pass("Alert box can't be seen. Testcase Passed");
			} else {
				logger.createNode("Check if error message is visible").fail("Alert box can be seen. Testcase failed");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
		
	}

	@Test(priority = 18)
	public void LoggingOfXFunnction(){
		logger = extent.createTest("U-246: Logging of X function of Tracibility Parts Arrangement");
		TraceablePartArrangement.LoggingOf_Xfunction();
		logger.createNode("Logging of X function tab is clicked");
	}

	@Test(priority = 19)
	public void LoggingDropdown(){
		TraceablePartArrangement.Logging_Dropdown();;
		logger.createNode("Cummins dropdown is Selected");
		TraceablePartArrangement.Logging_SearchButton();
		logger.createNode("Search button is clicked");
	}

	@Test(priority = 20)
	public void LoggingXFunction_FirstEntry(){
		TraceablePartArrangement.LoggingOf_Xfunction_FirstEntry();
		logger.createNode("Data verification pending - First Entry displayed in the Thinclient for Cummins Dropdown is - " + TraceablePartArrangement.LoggingOf_Xfunction_FirstEntry());
	}

	@Test(priority = 21)
	public void LoggingDropdown_2ndDropdown(){
		TraceablePartArrangement.Logging_DropdownUsage();
		logger.createNode("Rest dropdown is Selected");
		TraceablePartArrangement.Logging_SearchButton();
		logger.createNode("Search button is clicked");
	}

	@Test(priority = 22)
	public void LoggingXFunction_SecondEntry(){
		TraceablePartArrangement.LoggingOf_Xfunction_FirstEntry();
		logger.createNode("Data verification pending - First Entry displayed in the Thinclient for the Rest Dropdown is - " + TraceablePartArrangement.LoggingOf_Xfunction_FirstEntry());
		TraceablePartArrangement.LoggingOf_Function_FilterButton();
		logger.createNode("Filter Button is clicked");
		TraceablePartArrangement.LoggingOfXFunction_FilterText();
		logger.createNode("Parents Product ID entered to search is - 92692000629138");
		logger.createNode("Relevant search results related to ID entered - 92692000629138 is displayed in the ThinClient");
	}

	@Test(priority = 23)
	public void HistoryTab(){
		logger = extent.createTest("U-200: History Tab of Tracibility Parts Arrangement");
		driver.navigate().refresh();
        warmup1();
		TraceablePartArrangement.HistoryTab();
	}
	
	
	@Test(priority = 24)
	public void HistoryTab_SearchButton(){
		TraceablePartArrangement.History_IdCode();
        logger.createNode("ID code field is provided with the input - 11111111").pass("ID code field is provided with the input - 11111111. Test Case Passed");
	}
	
	@Test(priority = 25)
	public void HistoryTab_dropdown(){
//		TraceablePartArrangement.History_Dropdown();
//		logger.createNode("Rest dropdown is Selected");
		TraceablePartArrangement.HistorySearch_button();
        logger.createNode("Search button is clicked").pass("Search button is clicked. Test Case Passed");
	}

	@Test(priority = 26)
	public void HistoryTab_FirstEntry() throws InterruptedException{
		TraceablePartArrangement.HistoryTable_FirstEntry();
        logger.createNode("Data verification pending - First Entry displayed in the Thinclient for the Rest Dropdown is - " + TraceablePartArrangement.HistoryTable_FirstEntry()).pass("Data verification pending - First Entry displayed in the Thinclient for the Rest Dropdown is - " + TraceablePartArrangement.HistoryTable_FirstEntry()+". Test Case Passed");
	}
	
	@Test(priority = 27)
	public void HistoryTab_TechicalEntry_button() throws InterruptedException{
		TraceablePartArrangement.TechnicalEntryButton();
        logger.createNode("Technical Entry button is clicked").pass("Technical Entry button is clicked. Test Case Passed");
		TraceablePartArrangement.HistoryTable_FilterButton();
        logger.createNode("Filter button is clicked").pass("Filter button is clicked. Test Case Passed");
		TraceablePartArrangement.HistoryTable_FilterText();
        logger.createNode("Attribute name entered to search is - C-Factor").pass("Attribute name entered to search is - C-Factor. Test Case Passed");
        logger.createNode("Relevant search results related to C-Factor is displayed in the ThinClient").pass("Relevant search results related to C-Factor is displayed in the ThinClient. Test Case Passed");
	}

//	// Covered in Xfunction
//	
	@Test(priority = 28)
	public void calculationType_X1(){
		driver.navigate().refresh();
      warmup1();
		//logger = extent.createTest("U-080: X Functions Tab");
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X1");
		TraceablePartArrangement.XfunctionsTab();
        logger.createNode("X functions Tab is clicked").pass("X functions Tab is clicked successfully. Test Case Passed");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X1();
        logger.createNode("Calculation Type selected in the Thinclient is - X1 - Teach in another key, all keys remain valid").pass("Calculation Type selected in the Thinclient is - X1 - Teach in another key, all keys remain valid. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 29)
	public void calculationType_X2(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X2");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X2();
        logger.createNode("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys").pass("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 30)
	public void calculationType_X5(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X5");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X5();
        logger.createNode("Calculation Type selected in the Thinclient is - X5 - Deactivate immobilizer").pass("Calculation Type selected in the Thinclient is - X5 - Deactivate immobilizer. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 31)
	public void calculationType_X6(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X6");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X6();
        logger.createNode("Calculation Type selected in the Thinclient is - X6 - Activate PLD performance map protection").pass("X6 - Activate PLD performance map protection. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 32)
	public void calculationType_X7(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X7");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X7();
        logger.createNode("Calculation Type selected in the Thinclient is - X7 - Deactivate PLD performance map protection").pass("Calculation Type selected in the Thinclient is - X7 - Deactivate PLD performance map protection. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 33)
	public void calculationType_X8(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X8");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_X8();
        logger.createNode("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download").pass("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 34)
	public void calculationType_XA(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - XA");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_XA();
        logger.createNode("Calculation Type selected in the Thinclient is - XA - Engine history map read-out").pass("Calculation Type selected in the Thinclient is - XA - Engine history map read-out. Test Case Passed");
        TraceablePartArrangement.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        TraceablePartArrangement.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        TraceablePartArrangement.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 35)
	public void calculationType_XN(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - XN");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_XN();
        logger.createNode("Calculation Type selected in the Thinclient is - XN - Reset NOx fault code").pass("Calculation Type selected in the Thinclient is - XN - Reset NOx fault code. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 36)
	public void calculationType_XT(){
		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - XT");
		TraceablePartArrangement.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		TraceablePartArrangement.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		TraceablePartArrangement.calculationType_XT();
        logger.createNode("Calculation Type selected in the Thinclient is - XT - Adjust torque limiter").pass("Calculation Type selected in the Thinclient is - XT - Adjust torque limiter. Test Case Passed");
        TraceablePartArrangement.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		TraceablePartArrangement.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
		TraceablePartArrangement.ResetEntryButton();
	}

	@Test(priority = 37)
	public void resetEntry(){
		TraceablePartArrangement.ResetEntryButton();
        logger.createNode("Reset Entry button is clicked in the dropdown").pass("Reset Entry button is clicked in the dropdown. Test Case Passed");
	}
	
	@Test(priority = 38)
	public void SeedandKeyTab(){
		logger = extent.createTest("U-307: Seed and Key Tab of Tracibility Parts Arrangement");
		TraceablePartArrangement.SeedandKeyButton();
        logger.createNode("Seed and Key Tab is clicked in the Thinclient").pass("Seed and Key Tab is clicked in the Thinclient. Test Case Passed");
	}
	
	@Test(priority = 39)
	public void LEDToolID(){
		TraceablePartArrangement.LEDToolID();
        logger.createNode("LED Tool ID entered in the thinclient is - 1111111111").pass("LED Tool ID entered in the thinclient is - 1111111111. Test Case Passed");
	}
	
	@Test(priority = 40)
	public void MajorAssemblyNumber(){
		TraceablePartArrangement.MajorAssemblyNumber();
        logger.createNode("Major Assembly Number entered in the thinclient - 54192200006017").pass("Major Assembly Number entered in the thinclient - 54192200006017. Test Case Passed");
	}
	
	@Test(priority = 41)
	public void IDCode_SeedAndKey(){
		TraceablePartArrangement.SeedandKey_IDCode_button();
        logger.createNode("ID Code entered in the thinclient is - 00000001").pass("ID Code entered in the thinclient is - 00000001. Test Case Passed");
	}
	
	@Test(priority = 42)
	public void LEDOEMID(){
		TraceablePartArrangement.LEDOEMID();
        logger.createNode("LED OEM ID entered in the thinclient is - 111111111").pass("LED OEM ID entered in the thinclient is - 111111111. Test Case Passed");
	}
	
	@Test(priority = 43)
	public void DTCDeletionDates(){
		TraceablePartArrangement.DTC_DeletionDates();
        logger.createNode("DTC Deletion Dates entered in the thinclient is - 08/28/2013 9:15:12 AM").pass("DTC Deletion Dates entered in the thinclient is - 08/28/2013 9:15:12 AM. Test Case Passed");
	}
	
	@Test(priority = 44)
	public void MyID(){
		TraceablePartArrangement.MyID();
        logger.createNode("My ID entered in the thinclient is - C0").pass("My ID entered in the thinclient is - C0. Test Case Passed");
	}
	
	@Test(priority = 45)
	public void Seed(){
		TraceablePartArrangement.Seed();
        logger.createNode("Seed Number entered in the thinclient is - 2121").pass("Seed Number entered in the thinclient is - 2121. Test Case Passed");
	}
	
	@Test(priority = 46)
	public void Comment(){
		TraceablePartArrangement.Comment();
        logger.createNode("Comment dsiplayed in the thinclient is - Customized message by MBRDI").pass("Comment dsiplayed in the thinclient is - Customized message by MBRDI. Test Case Passed");
	}
	
	@Test(priority = 47)
	public void GenerateKey(){
		TraceablePartArrangement.GenerateKey();
        logger.createNode("Generate Key button is clicked in the ThinClient").pass("Generate Key button is clicked in the ThinClient. Test Case Passed");
	}
	
	@Test(priority = 48)
	public void KeyText(){
		TraceablePartArrangement.KeyText();
        logger.createNode("Data verification pending - Keys Displayed in the ThinClient is - " + TraceablePartArrangement.KeyText()).pass("Data verification pending - Keys Displayed in the ThinClient is - " + TraceablePartArrangement.KeyText()+". Test Case Passed");
	}
	
	@Test(priority = 49)
	public void LoggingSKTab(){
		TraceablePartArrangement.LoggingSKTab();
        logger.createNode("Logging of S&K Tab is clicked in the ThinClient").pass("Logging of S&K Tab is clicked in the ThinClient. Test Case Passed");
	}
	
	@Test(priority = 50)
	public void MajorAssemblyID(){
		TraceablePartArrangement.MajorAssemblyID();
        logger.createNode("Major Assembly ID entered in the ThinClient is - 54192200006017").pass("Major Assembly ID entered in the ThinClient is - 54192200006017. Test Case Passed");
	}
	
	@Test(priority = 51)
	public void SearchButton(){
		TraceablePartArrangement.SearchButton_MajorAssemblyID();
        logger.createNode("Search button is clicked in the ThinClient").pass("Search button is clicked in the ThinClient. Test Case Passed");
	}
	
	@Test(priority = 52)
	public void ContentsOfLoggingSKTab(){
		TraceablePartArrangement.Contents_LoggingSKTab();
        logger.createNode("Data verification pending - First Entry displayed in the ThinClient is - " + TraceablePartArrangement.Contents_LoggingSKTab()).pass("Data verification pending - First Entry displayed in the ThinClient is - " + TraceablePartArrangement.Contents_LoggingSKTab()+". Test Case Passed");
		TraceablePartArrangement.LoggingSKTab_FilterButton();
        logger.createNode("Filter button is clicked in the ThinClient").pass("Filter button is clicked in the ThinClient. Test Case Passed");
		TraceablePartArrangement.LoggingSKTab_FilterText();
        logger.createNode("ID Code entered to search in the ThinClient is - 00000001").pass("ID Code entered to search in the ThinClient is - 00000001. Test Case Passed");
        logger.createNode("Relevant search results related to 00000001 is displayed in the ThinClient").pass("Relevant search results related to 00000001 is displayed in the ThinClient. Test Case Passed");
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
