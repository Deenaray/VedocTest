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

public class XFunction extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	TraceablePartArrangementModulePage TraceablePartArrangement;
	VehicleDataPage_S vehicledatapage;
	ITestResult result;
	public static String cook4;

	public XFunction() {
		super();
	}

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		TraceablePartArrangement = new TraceablePartArrangementModulePage();
		vehicledatapage = new VehicleDataPage_S();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		logger = extent.createTest("(AU) Login to application using Admin User credentials");
		SystemMessageCheck();
		TraceablePartArrangement = homePage.TraceablePartArrangementModule();
		logger = extent.createTest("(AU) Navigate to Traceable parts module");
	}

	@Test(priority = 1)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 2)
	public void calculationType_X1_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 3)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 4)
	public void calculationType_X2_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}

	@Test(priority = 5)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 6)
	public void calculationType_X5_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 7)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 8)
	public void calculationType_X6_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 9)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 10)
	public void calculationType_X7_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
////	@Test(priority = 33)
////	public void calculationType_X8(){
////		logger = extent.createTest("U-248: (AU) Generate random number for control unit (XFunctions) for the Calculate type - X8");
////		TraceablePartArrangement.FourCharacterNumber();
////        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
////		TraceablePartArrangement.IDCode();
////        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
////		TraceablePartArrangement.calculationType_X8();
////        logger.createNode("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download").pass("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download. Test Case Passed");
////        TraceablePartArrangement.xfunction_NumberofKeys();
////        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
////        TraceablePartArrangement.xfunction_transponder();
////        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
////        TraceablePartArrangement.xfunction_Checksum();
////        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
////        TraceablePartArrangement.GenerateNumberButton();
////        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
////		TraceablePartArrangement.RandomNumberGenerated();
////        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + TraceablePartArrangement.RandomNumberGenerated() +". Test Case Passed");
////		TraceablePartArrangement.ResetEntryButton();	
////	}
//	

	@Test(priority = 11)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 12)
	public void calculationType_XA_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 13)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 14)
	public void calculationType_XN_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 15)
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
		//TraceablePartArrangement.ResetEntryButton();	
	}
	
	@Test(priority = 16)
	public void calculationType_XT_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 17)
	public void calculationType_X1_Vehicle(){
		logger = extent.createTest("(AU) Navigate to Vehicle Data page");
		vehicledatapage = homePage.VehicleDataSidePanel();
		//vehicledatapage.vehicleData_SidePanel();
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X1");
		vehicledatapage.searchCategoryNumber(vehicledatapage.XFunctionFinNumberInput);
		warmup5();
		logger.createNode(" XFunctionFinNumberInput- " + vehicledatapage.XFunctionFinNumberInput
				+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category").pass(vehicledatapage.XFunctionFinNumberInput
						+ "\t is entered and clicked on the Search button, for 'Vehicle identification no. (FIN or VIN)' as category. Test Case Passed");
		vehicledatapage.XFunctionsTab();
        logger.createNode("X functions Tab is clicked").pass("X functions Tab is clicked successfully. Test Case Passed");
        vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
        vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
        vehicledatapage.calculationType_X1();
        logger.createNode("Calculation Type selected in the Thinclient is - X1 - Teach in another key, all keys remain valid").pass("Calculation Type selected in the Thinclient is - X1 - Teach in another key, all keys remain valid. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
        vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
        //vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 18)
	public void calculationType_X1_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 19)
	public void calculationType_X2_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X2");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_X2();
        logger.createNode("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys").pass("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 20)
	public void calculationType_X2_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 21)
	public void calculationType_X3_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X3");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeTwoDigit();
        logger.createNode("ID Code entered in the Thinclient is - 10000011").pass("ID Code entered in the Thinclient is - 10000011. Test Case Passed");
		vehicledatapage.calculationType_X3();
        logger.createNode("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys").pass("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 22)
	public void calculationType_X3_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 23)
	public void calculationType_X4_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X4");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeTwoDigit();
        logger.createNode("ID Code entered in the Thinclient is - 10000011").pass("ID Code entered in the Thinclient is - 10000011. Test Case Passed");
		vehicledatapage.calculationType_X4();
        logger.createNode("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys").pass("Calculation Type selected in the Thinclient is - X2 - Teach in a key, delete all previously taught-in keys. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 24)
	public void calculationType_X4_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 25)
	public void calculationType_X5_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X5");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_X5();
        logger.createNode("Calculation Type selected in the Thinclient is - X5 - Deactivate immobilizer").pass("Calculation Type selected in the Thinclient is - X5 - Deactivate immobilizer. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 26)
	public void calculationType_X5_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 27)
	public void calculationType_X6_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X6");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_X6();
        logger.createNode("Calculation Type selected in the Thinclient is - X6 - Activate PLD performance map protection").pass("X6 - Activate PLD performance map protection. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 28)
	public void calculationType_X6_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	
	@Test(priority = 29)
	public void calculationType_X7_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X7");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_X7();
        logger.createNode("Calculation Type selected in the Thinclient is - X7 - Deactivate PLD performance map protection").pass("Calculation Type selected in the Thinclient is - X7 - Deactivate PLD performance map protection. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	@Test(priority = 30)
	public void calculationType_X7_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	@Test(priority = 31) 
	  public void calculationType_X8_Positive_Vehicle(){ 
	  logger = extent.createTest("U-080 & U-081: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X8-Positive" ); 
	  vehicledatapage.FourCharacterNumber(); 
	  logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - "+ RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - "+ RandomPaintCode+ ". Test case passed"); vehicledatapage.IDCode();
	  logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
	  vehicledatapage.calculationType_X8(); 
	  logger.createNode("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download").pass("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download. Test Case Passed"); 
	  vehicledatapage.xfunction_NumberofKeys(); 
	  logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
	  vehicledatapage.xfunction_transponder(); 
	  logger.createNode("Transponder code field is provided with the value - 1211111111").pass("Transponder code field is provided with the value - 1211111111. Test Case Passed"); 
	  vehicledatapage.xfunction_Checksum();
	  logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
	  vehicledatapage.xfunction_Datarecord_X8Positive(); 
	  logger.createNode("Data Record field is provided with the value - A0014460404").pass("Data Record field is provided with the value - A0014460404. Test Case Passed"); 
	  vehicledatapage.xfunction_DrawingAndGeometry_X8Positive();
	  logger.createNode("Drawing & Geometry field is provided with the value - 002").pass("Drawing & Geometry field is provided with the value - 002. Test Case Passed"); 
	  vehicledatapage.xfunction_Version1_X8Positive();
	  logger.createNode("Version 1 field is provided with the value - ACM01").pass("Version 1 field is provided with the value - ACM01. Test Case Passed");
	  vehicledatapage.GenerateNumberButton();
	  logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
	  //vehicledatapage.ResetEntryButton();
	  }
	
	@Test(priority = 32)
	public void calculationType_X8_Vehicle_Reset(){
		TraceablePartArrangement.ResetEntryButton();
		logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
	}
	
	
	  @Test(priority = 33) 
	  public void calculationType_X8_Negative_Vehicle(){ 
	  logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - X8-Negative" ); 
	  vehicledatapage.FourCharacterNumber(); 
	  logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - "+ RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - "+ RandomPaintCode+ ". Test case passed"); vehicledatapage.IDCode();
	  logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
	  vehicledatapage.calculationType_X8(); 
	  logger.createNode("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download").pass("Calculation Type selected in the Thinclient is - X8 - Deactivate performance map protection for engine download. Test Case Passed"); 
	  vehicledatapage.xfunction_NumberofKeys(); 
	  logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
	  vehicledatapage.xfunction_transponder(); 
	  logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed"); 
	  vehicledatapage.xfunction_Checksum();
	  logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
	  vehicledatapage.xfunction_Datarecord(); 
	  logger.createNode("Data Record field is provided with the value - A1234567890").pass("Data Record field is provided with the value - A1234567890. Test Case Passed"); 
	  vehicledatapage.xfunction_DrawingAndGeometry();
	  logger.createNode("Drawing & Geometry field is provided with the value - 123").pass("Drawing & Geometry field is provided with the value - 123. Test Case Passed"); 
	  vehicledatapage.xfunction_Version1();
	  logger.createNode("Version 1 field is provided with the value - 123AB").pass("Version 1 field is provided with the value - 123AB. Test Case Passed");
	  vehicledatapage.GenerateNumberButton();
	  logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
	 // vehicledatapage.RandomNumberGenerated();
	//  logger.createNode("Data verification pending - Random Number generated in the thinclient is - "+ vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - "+ vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
	  boolean flag = vehicledatapage.alertBox();
		if (flag == true) {
			vehicledatapage.alertBoxCloseClick();
			logger.createNode("Check if error message is closed").pass("Alert box can't be seen. Testcase Passed");
		} else {
			logger.createNode("Check if error message is visible").fail("Alert box can be seen. Testcase failed");
		}
	  //vehicledatapage.ResetEntryButton();
	  }
	  
	  @Test(priority = 34)
		public void calculationType_X8_NegativeVehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	  
	@Test(priority = 35)
	public void calculationType_XA_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XA");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_XA();
        logger.createNode("Calculation Type selected in the Thinclient is - XA - Engine history map read-out").pass("Calculation Type selected in the Thinclient is - XA - Engine history map read-out. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Transponder code of keys to be taught in field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Number of keys field is provided with the value - 1211111111").pass("Number of keys field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}
	
	 @Test(priority = 36)
		public void calculationType_XA_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	 
	
	@Test(priority = 37)
	public void calculationType_XB_Vehicle(){
		logger = extent.createTest("U-080 & U-081: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XB");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeDoubleDigit();
        logger.createNode("ID Code entered in the Thinclient is - 02355DB5").pass("ID Code entered in the Thinclient is - 02355DB5. Test Case Passed");
		vehicledatapage.calculationType_XB();
        logger.createNode("Calculation Type selected in the Thinclient is - XB - Reserved").pass("Calculation Type selected in the Thinclient is - XB - Reserved. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Transponder code field is provided with the value - 1211111111").pass("Transponder code field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 38)
		public void calculationType_XB_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 39)
	public void calculationType_XD_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XD");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeTwoDigit();
        logger.createNode("ID Code entered in the Thinclient is - 10000011").pass("ID Code entered in the Thinclient is - 10000011. Test Case Passed");
		vehicledatapage.calculationType_XD();
        logger.createNode("Calculation Type selected in the Thinclient is - XD - Transition from Daimler map protection to DDC map protection").pass("Calculation Type selected in the Thinclient is - XD - Transition from Daimler map protection to DDC map protection. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Transponder code field is provided with the value - 1211111111").pass("Transponder code field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 40)
		public void calculationType_XD_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 41)
	public void calculationType_XE_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XE");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeTwoDigit();
        logger.createNode("ID Code entered in the Thinclient is - 10000011").pass("ID Code entered in the Thinclient is - 10000011. Test Case Passed");
		vehicledatapage.calculationType_XE();
        logger.createNode("Calculation Type selected in the Thinclient is - XE - Read out the ECU history map with MCM/ACM").pass("Calculation Type selected in the Thinclient is - XE - Read out the ECU history map with MCM/ACM. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Transponder field is provided with the value - 1211111111").pass("Transponder field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.xfunction_Checksum();
        logger.createNode("Checksum field is provided with the value - XXX").pass("Checksum field is provided with the value - XXX. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 42)
		public void calculationType_XE_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 43)
	public void calculationType_XI_Vehicle(){
		logger = extent.createTest("U-080 & U-081: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XB");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeDoubleDigit();
        logger.createNode("ID Code entered in the Thinclient is - 02355DB5").pass("ID Code entered in the Thinclient is - 02355DB5. Test Case Passed");
		vehicledatapage.calculationType_XI();
        logger.createNode("Calculation Type selected in the Thinclient is - XI - Configuration of immobilizer").pass("Calculation Type selected in the Thinclient is - XI - Configuration of immobilizer. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Transponder code field is provided with the value - 1211111111").pass("Transponder code field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 44)
		public void calculationType_XI_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
		
	@Test(priority = 45)
	public void calculationType_XM_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XM");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeTwoDigit();
        logger.createNode("ID Code entered in the Thinclient is - 10000011").pass("ID Code entered in the Thinclient is - 10000011. Test Case Passed");
		vehicledatapage.calculationType_XM();
        logger.createNode("Calculation Type selected in the Thinclient is - XM - Reserved").pass("Calculation Type selected in the Thinclient is - XM - Reserved. Test Case Passed");
        vehicledatapage.xfunction_NumberofKeys();
        logger.createNode("Number of keys field is provided with the value - 1").pass("Number of keys field is provided with the value - 1. Test Case Passed");
        vehicledatapage.xfunction_transponder();
        logger.createNode("Transponder code field is provided with the value - 1211111111").pass("Transponder code field is provided with the value - 1211111111. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 46)
		public void calculationType_XM_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 47)
	public void calculationType_XN_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XN");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_XN();
        logger.createNode("Calculation Type selected in the Thinclient is - XN - Reset NOx fault code").pass("Calculation Type selected in the Thinclient is - XN - Reset NOx fault code. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 48)
		public void calculationType_XN_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 49)
	public void calculationType_XS_Vehicle(){
		logger = extent.createTest("U-080 & U-081: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XB");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCodeDoubleDigit();
        logger.createNode("ID Code entered in the Thinclient is - 02355DB5").pass("ID Code entered in the Thinclient is - 02355DB5. Test Case Passed");
		vehicledatapage.calculationType_XS();
        logger.createNode("Calculation Type selected in the Thinclient is - XS - Control unit replacement").pass("Calculation Type selected in the Thinclient is - XS - Control unit replacement. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 50)
		public void calculationType_XS_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
		}
	
	@Test(priority = 51)
	public void calculationType_XT_Vehicle(){
		logger = extent.createTest("U-080: (AU) Generate random code for vehicle Data page (XFunctions)for the Calculate type - XT");
		vehicledatapage.FourCharacterNumber();
        logger.createNode("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode).pass("Data verification pending - Four character random number entered in the Thinclient is - " + RandomPaintCode+ ". Test case passed");
		vehicledatapage.IDCode();
        logger.createNode("ID Code entered in the Thinclient is - 00000009").pass("ID Code entered in the Thinclient is - 00000009. Test Case Passed");
		vehicledatapage.calculationType_XT();
        logger.createNode("Calculation Type selected in the Thinclient is - XT - Adjust torque limiter").pass("Calculation Type selected in the Thinclient is - XT - Adjust torque limiter. Test Case Passed");
        vehicledatapage.GenerateNumberButton();
        logger.createNode("Generate Random number button is clicked").pass("Generate Random number button is clicked. Test Case Passed");
		vehicledatapage.RandomNumberGenerated();
        logger.createNode("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated()).pass("Data verification pending - Random Number generated in the thinclient is - " + vehicledatapage.RandomNumberGenerated() +". Test Case Passed");
		//vehicledatapage.ResetEntryButton();	
	}

	 @Test(priority = 52)
		public void calculationType_XT_Vehicle_Reset(){
			TraceablePartArrangement.ResetEntryButton();
			logger.createNode("Reset entry button is clicked").pass("Reset entry button is clicked. Test Case Passed");
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
