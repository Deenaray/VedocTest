package com.vedoc.qa.testcases;

import org.openqa.selenium.NoSuchElementException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.MajorAssemblyPage;

public class MajorAssemblyPageTest_R extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MajorAssemblyPage majorassemblypage;
	
	
	public MajorAssemblyPageTest_R() {
		super();
	}
	
	@BeforeTest
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		majorassemblypage=new MajorAssemblyPage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		   SystemMessageCheck();

		majorassemblypage=homePage.MajorAssembly();
	}
	
	@Test(priority = 1)
	public void MajorAssemblyTest() {
		logger = extent.createTest("U-113: Check if the Major Assembly page is getting loaded");
		try {
			boolean flag = majorassemblypage.validateMajorAssemblyPage();
			if (flag = true) {
				logger.log(Status.INFO, "TC-005-Check if Major Assembly page is getting loaded");
				logger.log(Status.PASS, "Major Assembly page is getting loaded. Testcase Passed");
			} else {
				logger.log(Status.INFO, "Check if Major Assembly page is getting loaded");
				logger.log(Status.FAIL, "Major Assembly page Not working. Testcase failed.");
			}
		} catch (NoSuchElementException e) {
			logger.log(Status.SKIP, "Something wrong with the webelement.");
		}
	}
	
	// Rintu

    // engineNumberInput

    @Test(priority = 2)

    public void majorAssemblyPageSearchTest() throws InterruptedException {

          logger = extent.createTest("U-134 : Verify that in Major Assembly Data Page, for every Category there is a search");
          logger.createNode("Login to application using Admin User credentials");
          logger.createNode("Go to the Major Assembly data page");

          // Engine Number
    majorassemblypage.searchCategoryNumber(majorassemblypage.engineNumberInput);

          String engineNumberUI = majorassemblypage.fetchEngineNumber();

          logger.createNode(" Engine Number - " + majorassemblypage.engineNumberInput
                       + " entered and clicked on the Search button, for 'Engine No.' as category ");
          if (engineNumberUI.equalsIgnoreCase(majorassemblypage.engineNumberInput)) {
                 logger.createNode("Engine Number - " + majorassemblypage.engineNumberInput + " is searched Correctly")
                              .pass("Engine Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode("Engine Number - " + majorassemblypage.engineNumberInput + " is searched Correctly")
                              .fail("Engine Number is not searched Correctly. Test case Failed");

          }
          
          // Engine End Number
          
          majorassemblypage.searchVehicleCategory("Engine end no. (model designation/end number/plant)");
    majorassemblypage.searchCategoryNumber(majorassemblypage.engineEndInputNumber);
          logger.createNode(" Engine End number -  " + majorassemblypage.engineEndInputNumber
                       + " entered and clicked on the Search button, for 'Engine End number' as category ");
    
          if ((majorassemblypage.fetchEngineNumber()).length() > 0)
          {
                 logger.createNode("Engine End  Number - " + majorassemblypage.engineNumberInput + " is searched ")
                              .pass("A search result page got displyed. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode("Engine Number - " + majorassemblypage.engineNumberInput + " is searched ")
                              .fail("Search result page is not displyed. Test case Failed");

          }
          
          
          //order number
          logger.createNode(" Order number -  " + majorassemblypage.orderNumberInput
                       + " entered and clicked on the Search button, for 'Order number' as category ");
          majorassemblypage.searchVehicleCategory("Order number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.orderNumberInput);
          
          String orderNumberFinal = majorassemblypage.fetchOrderNumber();
          if (orderNumberFinal.equalsIgnoreCase(majorassemblypage.orderNumberInput)) {
                 logger.createNode(" Order number -  " + majorassemblypage.orderNumberInput + " is searched Correctly")
                              .pass("Order number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Order number -  " + majorassemblypage.orderNumberInput + "  is searched Correctly")
                              .fail("Recond Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Recond Number
          logger.createNode(" Recond number -  " + majorassemblypage.recondNumberInput
                       + " entered and clicked on the Search button, for 'Recond number' as category ");
          majorassemblypage.searchVehicleCategory("Recond. engine");
    majorassemblypage.searchCategoryNumber(majorassemblypage.recondNumberInput);
          String recondNumberFinal = majorassemblypage.fetchRecondNumber();
          if (recondNumberFinal.equalsIgnoreCase(majorassemblypage.recondNumberInput)) {
                 logger.createNode(" Recond number -  " + majorassemblypage.recondNumberInput + " is searched Correctly")
                              .pass("Recond Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Recond number -  " + majorassemblypage.recondNumberInput + "  is searched Correctly")
                              .fail("Recond Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Transmission no.

          logger.createNode(" Transmission number -  " + majorassemblypage.transmissionNumberInput
                       + " entered and clicked on the Search button, for 'Transmission number' as category ");
           majorassemblypage.searchVehicleCategory("Transmission no.");
    majorassemblypage.searchCategoryNumber(majorassemblypage.transmissionNumberInput);
          String transmissionNumberFinal = majorassemblypage.fetchTransmissionNumber();
          if (transmissionNumberFinal.equalsIgnoreCase(majorassemblypage.transmissionNumberInput)) {
                 logger.createNode(
                              " Transmission number -  " + majorassemblypage.transmissionNumberInput + " is searched Correctly")
                              .pass("Transmission Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(
                              " Transmission number -  " + majorassemblypage.transmissionNumberInput + "  is searched Correctly")
                              .fail("Transmission Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Axle number

          logger.createNode(" Axle number -  " + majorassemblypage.axleNumberInput
                       + " entered and clicked on the Search button, for 'Axle number' as category ");
          majorassemblypage.searchVehicleCategory("Axle number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.axleNumberInput);
          String axleNumberFinal = majorassemblypage.fetchAxleNumber();
          if (axleNumberFinal.equalsIgnoreCase(majorassemblypage.axleNumberInput)) {
                 logger.createNode(" Axle number -  " + majorassemblypage.axleNumberInput + " is searched Correctly")
                              .pass("Axle Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Axle number -  " + majorassemblypage.axleNumberInput + "  is searched Correctly")
                              .fail("Axle Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Axle end number
          logger.createNode(" Axle End number -  " + majorassemblypage.axleEndNumberInput
                       + " entered and clicked on the Search button, for 'Axle End number' as category ");
          majorassemblypage.searchVehicleCategory("Axle end number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.axleEndNumberInput);
          String axleEndNumberFinal = majorassemblypage.fetchAxleNumber();
          if (axleEndNumberFinal.contains(majorassemblypage.axleEndNumberInput)) {
                 logger.createNode(" Axle End number -  " + majorassemblypage.axleEndNumberInput + " is searched Correctly")
                              .pass("Axle Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Axle End number -  " + majorassemblypage.axleEndNumberInput + "  is searched Correctly")
                              .fail("Axle End  Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Cab Number
          logger.createNode(" Cab Number-  " + majorassemblypage.cabNumberInput
                       + " entered and clicked on the Search button, for 'Cab number' as category ");
          majorassemblypage.searchVehicleCategory("Cab number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.cabNumberInput);
          String cabNumberFinal = majorassemblypage.fetchCabNumber();
          if (cabNumberFinal.equalsIgnoreCase(majorassemblypage.cabNumberInput)) {
                 logger.createNode(" Cab Number number -  " + majorassemblypage.cabNumberInput + " is searched Correctly")
                              .pass("Cab Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Cab Number -  " + majorassemblypage.cabNumberInput + "  is searched Correctly")
                              .fail("Cab Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // Production Number
          logger.createNode(" Production Number-  " + majorassemblypage.productionNumberInput
                       + " entered and clicked on the Search button, for 'Production number' as category ");
          majorassemblypage.searchVehicleCategory("Production number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.productionNumberInput);
          String productionNumberFinal = majorassemblypage.fetchProductionNumber();
          if (productionNumberFinal.equalsIgnoreCase(majorassemblypage.productionNumberInput)) {
                 logger.createNode(
                              " Production Number  -  " + majorassemblypage.productionNumberInput + " is searched Correctly")
                              .pass("Production Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(
                              " Production Number -  " + majorassemblypage.productionNumberInput + "  is searched Correctly")
                              .fail("Production Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // variantNumberInput

          logger.createNode(" Variant -  " + majorassemblypage.variantNumberInput
                       + " entered and clicked on the Search button, for 'Variant' as category ");
          majorassemblypage.searchVehicleCategory("Variant");
    majorassemblypage.searchCategoryNumber(majorassemblypage.variantNumberInput);
          String variantFinal = majorassemblypage.fetchVariant();
          if (variantFinal.equalsIgnoreCase(majorassemblypage.variantNumberInput)) {
                 logger.createNode(" Variant -  " + majorassemblypage.variantNumberInput + " is searched Correctly")
                              .pass("Variant is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" Variant -  " + majorassemblypage.variantNumberInput + "  is searched Correctly")
                              .fail("Variant is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // LU Number

          logger.createNode(" LU Number -  " + majorassemblypage.lUNumberInput
                       + " entered and clicked on the Search button, for 'LU number (only engines)' as category ");
          majorassemblypage.searchVehicleCategory("LU number (only engines)");
    majorassemblypage.searchCategoryNumber(majorassemblypage.lUNumberInput);
          String lUNumberFinal = majorassemblypage.fetchLUNumber();
          if (lUNumberFinal.equalsIgnoreCase(majorassemblypage.lUNumberInput)) {
                 logger.createNode(" LU Number -  " + majorassemblypage.lUNumberInput + " is searched Correctly")
                              .pass("LU Number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" LU Number -  " + majorassemblypage.lUNumberInput + "  is searched Correctly")
                              .fail("LU Number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // EAT Number
          logger.createNode(" EAT number -  " + majorassemblypage.eatNumberInput
                       + " entered and clicked on the Search button, for 'EAT number' as category ");
          majorassemblypage.searchVehicleCategory("EAT number");
    majorassemblypage.searchCategoryNumber(majorassemblypage.eatNumberInput);
          String eatNumberFinal = majorassemblypage.fetchEATNumber();
          if (eatNumberFinal.equalsIgnoreCase(majorassemblypage.eatNumberInput)) {
                 logger.createNode(" EAT number -  " + majorassemblypage.eatNumberInput + " is searched Correctly")
                              .pass("EAT number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" EAT number -  " + majorassemblypage.eatNumberInput + "  is searched Correctly")
                              .fail("EAT number is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // fetchIdOfDieselParticulate idOfDieselParticulateInput
          logger.createNode("ID of Diesel particulate -  " + majorassemblypage.idOfDieselParticulateInput
                       + " entered and clicked on the Search button, for 'ID of diesel particulate filter' as category ");
          majorassemblypage.searchVehicleCategory("ID of diesel particulate filter");
    majorassemblypage.searchCategoryNumber(majorassemblypage.idOfDieselParticulateInput);
          String idOfDieselParticulateFinal = majorassemblypage.fetchIdOfDieselParticulate();
          if (idOfDieselParticulateFinal.equalsIgnoreCase(majorassemblypage.idOfDieselParticulateInput)) {
                 logger.createNode(" ID of diesel particulate filter -  " + majorassemblypage.idOfDieselParticulateInput
                              + " is searched Correctly")
                              .pass("ID of diesel particulate filter is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" ID of diesel particulate -  " + majorassemblypage.idOfDieselParticulateInput
                              + "  is searched Correctly")
                              .fail("ID of diesel particulate  is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // highVoltageBatteryNumber
          logger.createNode("High-voltage battery number -  " + majorassemblypage.highVoltageBatteryInputNumber
                       + " entered and clicked on the Search button, for 'High-voltage battery ID' as category ");
          majorassemblypage.searchVehicleCategory("High-voltage battery ID");
    majorassemblypage.searchCategoryNumber(majorassemblypage.highVoltageBatteryInputNumber);
          String highVoltageBatteryNumberFinal = majorassemblypage.fetchHighVoltageBatteryID();
          if (highVoltageBatteryNumberFinal.equalsIgnoreCase(majorassemblypage.highVoltageBatteryInputNumber)) {
                 logger.createNode(" High-voltage battery number -  " + majorassemblypage.highVoltageBatteryInputNumber
                              + " is searched Correctly")
                              .pass("High-voltage battery number is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" High-voltage battery number -  " + majorassemblypage.highVoltageBatteryInputNumber
                              + "  is searched Correctly")
                              .fail("High-voltage battery number  is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

          // highVoltageBatteryNumber
          logger.createNode("REESS code  -  " + majorassemblypage.highVoltageBatteryReesCodeInputNumber
                       + " entered and clicked on the Search button, for 'High-voltage battery REESS code' as category ");
          majorassemblypage.searchVehicleCategory("High-voltage battery REESS code");
    majorassemblypage.searchCategoryNumber(majorassemblypage.highVoltageBatteryReesCodeInputNumber);
          String reessCodeFinal = majorassemblypage.fetchHighVoltageBatteryREESSCode();
          if (reessCodeFinal.equalsIgnoreCase(majorassemblypage.highVoltageBatteryReesCodeInputNumber)) {
                 logger.createNode(" REESS code  -  " + majorassemblypage.highVoltageBatteryReesCodeInputNumber
                              + " is searched Correctly").pass("REESS code is searched Correctly. Test case Passed");
                 System.out.println("passed");
          } else {
                 logger.createNode(" REESS code  -  " + majorassemblypage.highVoltageBatteryReesCodeInputNumber
                              + "  is searched Correctly").fail("REESS code   is not searched Correctly. Test case Failed");
                 System.out.println("failed");
          }

    }

    @Test(priority = 3)

    public void majorassemblypageSearchHistory() throws InterruptedException {
          logger = extent.createTest(
                       "U-134: (AU) Verify the search history count is 10 and it shows the last recent searches.");
          boolean value = majorassemblypage.autoSearcHistory();
          if (value = true) {
                 logger.createNode("The search history shows last recently searched 10 values")
                              .pass("The search history shows last recently searched 10 values");
                 logger.createNode("The last 10 searched values in the history matches with last 10 recent searches").pass(
                              "The last 10 searched values in the history matches with last 10 recent searches and the values are "
                                           + majorassemblypage.highVoltageBatteryReesCodeInputNumber + ","
                                           + majorassemblypage.highVoltageBatteryInputNumber + ","
                                           + majorassemblypage.idOfDieselParticulateInput + "," + majorassemblypage.eatNumberInput
                                           + "," + majorassemblypage.lUNumberInput + "," + majorassemblypage.variantNumberInput + ","
                                           + majorassemblypage.productionNumberInput + "," + majorassemblypage.cabNumberInput + ","
                                           + majorassemblypage.axleEndNumberInput + "," + majorassemblypage.axleNumberInput);

          } else {
                 logger.createNode("The search history shows last recently searched 10 values")
                              .fail("The Search history is not having the count as 10");
                 logger.createNode("The last 10 searched values in the history matches with last 10 recent searches")
                              .fail("The last 10 searched values in the history doesn't matches with last 10 recent searches");

          }
    }

    @Test(priority = 4)

    public void validateSearchHistoryAddingSearch() throws InterruptedException {

          // 11th element
          majorassemblypage.searchVehicleCategory("Engine no.");
    majorassemblypage.searchCategoryNumber(majorassemblypage.engineNumberInput);

          // verify 11th number keyIDENumberInput
          logger = extent
                       .createTest("U-134 : (AU) Verify when 11th number Engine no. - " + majorassemblypage.engineNumberInput
                                    + " is searched, the history of 10 recent list is updated with newly searched number");
          if ((majorassemblypage.fetchEngineNumber()).length() > 0) {
                 logger.createNode("The 11th number Engine no.-  " + majorassemblypage.engineNumberInput
                              + " with category 'Engine no.'  is searched")
                              .pass("A search result page has displayed. Test case Passed");
                 System.out.println("passed");
          } else

          {
                 logger.createNode("The 11th number Engine no. - " + majorassemblypage.engineNumberInput
                              + " with category 'Engine no.' is searched")
                              .fail("Search result page is not displayed.Test case Failed");
                 System.out.println("failed");
          }

          boolean flag1 = majorassemblypage.autoSearcHistoryAfterNewSearch();

          if (flag1 = true) {
                 logger.createNode("The search history updated with the 11th searched number "
                              + majorassemblypage.engineNumberInput + "  by removing the first searched number")
                              .pass("The search history updated with the 11th searched number by removing the first searched number");

          } else {
                 logger.createNode("The search history updated with the 11th searched number "
                              + majorassemblypage.engineNumberInput + " by removing the first searched number")
                              .fail("The search history is not updated with the 11th searched number ");

          }
    }

    @Test(priority = 5)

    public void autopopulationOfVehicleCategory() throws InterruptedException {

          logger = extent.createTest(
                       "U-134 : (AU) Verify while choosing a saved value from search history , the category is updated automatically");
          // Axle End Number

    majorassemblypage.enterCategoryNumber(majorassemblypage.axleEndNumberInput);
          String selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
          if (selectedCategory.equalsIgnoreCase("Axle end number")) {
                 logger.createNode("Check when  Axle End Number - " + majorassemblypage.axleEndNumberInput
                              + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Axle end number' ")
                              .pass("The Major Assembly category dropdown got autopopulted as 'Axle end number' ");
          } else {
                 logger.createNode("Check when  Axle End Number - " + majorassemblypage.axleEndNumberInput
                              + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Axle end number' ")
                              .fail("The Major Assembly category dropdown is not autopopulted as 'Axle end number' ");
          }
          
          // Cab Number
    majorassemblypage.enterCategoryNumber(majorassemblypage.cabNumberInput );
          selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
          if (selectedCategory.equalsIgnoreCase("Cab number")) {
                 logger.createNode("Check when Cab number - " + majorassemblypage.cabNumberInput 
                              + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Cab number' ")
                              .pass("The Major Assembly category dropdown got autopopulted as 'Cab number' ");
          } else {
                 logger.createNode("Check when Cab number - " + majorassemblypage.cabNumberInput 
                              + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Cab number' ")
                              .fail("The Major Assembly category dropdown is not autopopulted as 'Cab number' ");
          }

    
    //productionNumberInput
          
    majorassemblypage.enterCategoryNumber(majorassemblypage.productionNumberInput );
          selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
          if (selectedCategory.equalsIgnoreCase("Production number")) {
                 logger.createNode("Check when Production number - " + majorassemblypage.productionNumberInput 
                              + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Production number' ")
                              .pass("The Major Assembly category dropdown got autopopulted as 'Production number' ");
          } else {
                 logger.createNode("Check when Production number - " + majorassemblypage.productionNumberInput 
                              + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Production number' ")
                              .fail("The Major Assembly category dropdown is not autopopulted as 'Production number' ");
          }
          
          
          //variantNumberInput 
    majorassemblypage.enterCategoryNumber(majorassemblypage.variantNumberInput );
          selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
          if (selectedCategory.equalsIgnoreCase("Variant")) {
                 logger.createNode("Check when Variant - " + majorassemblypage.variantNumberInput 
                              + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Variant' ")
                              .pass("The Major Assembly category dropdown got autopopulted as 'Variant' ");
          } else {
                 logger.createNode("Check when Variant - " + majorassemblypage.variantNumberInput 
                              + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Variant' ")
                              .fail("The Major Assembly category dropdown is not autopopulted as 'Variant' ");
          }
          
          
          //lUNumberInput  
                 majorassemblypage.enterCategoryNumber(majorassemblypage.lUNumberInput  );
                       selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
                       if (selectedCategory.equalsIgnoreCase("LU number (only engines)")) {
                              logger.createNode("Check when LU number - " + majorassemblypage.lUNumberInput  
                                           + " entered in search field , the Major Assembly category dropdown got autopopulted as 'LU number' ")
                                           .pass("The Major Assembly category dropdown got autopopulted as 'LU number' ");
                       } else {
                              logger.createNode("Check when LU number - " + majorassemblypage.lUNumberInput  
                                           + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'LU number' ")
                                           .fail("The Major Assembly category dropdown is not autopopulted as 'LU number' ");
                       }
//
//                       //eatNumberInput
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.eatNumberInput  );
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("EAT number")) {
//                                           logger.createNode("Check when EAT number - " + majorassemblypage.eatNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'EAT number' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'EAT number' ");
//                                    } else {
//                                           logger.createNode("Check when EAT number - " + majorassemblypage.eatNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'EAT number' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'EAT number' ");
//                                    }
//
//                                     //idOfDieselParticulateInput
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.idOfDieselParticulateInput   );
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("ID of diesel particulate filter")) {
//                                           logger.createNode("Check when ID of diesel particulate  - " + majorassemblypage.idOfDieselParticulateInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'ID of diesel particulate' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'ID of diesel particulate' ");
//                                    } else {
//                                           logger.createNode("Check when ID of diesel particulate  - " + majorassemblypage.idOfDieselParticulateInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'ID of diesel particulate' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'ID of diesel particulate' ");
//                                    }
//
//                                     //highVoltageBatteryInputNumber
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.highVoltageBatteryInputNumber   );
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("High-voltage battery ID")) {
//                                           logger.createNode("Check when High-voltage battery ID - " + majorassemblypage.highVoltageBatteryInputNumber
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'High-voltage battery ID' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'High-voltage battery ID' ");
//                                    } else {
//                                           logger.createNode("Check when High-voltage battery ID - " + majorassemblypage.highVoltageBatteryInputNumber
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'High-voltage battery ID' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'High-voltage battery ID' ");
//                                    }
//
//                                    //High-voltage battery REESS code
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.highVoltageBatteryReesCodeInputNumber   );
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("High-voltage battery REESS code")) {
//                                           logger.createNode("Check when High-voltage battery REESS code - " + majorassemblypage.highVoltageBatteryReesCodeInputNumber
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'High-voltage battery REESS code' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'High-voltage battery REESS code' ");
//                                    } else {
//                                           logger.createNode("Check when High-voltage battery REESS code - " + majorassemblypage.highVoltageBatteryReesCodeInputNumber
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'High-voltage battery REESS code' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'High-voltage battery REESS code' ");
//                                    }
//
//                                    //Engine number
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.engineNumberInput);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Engine no.")) {
//                                           logger.createNode("Check when Engine Number - " + majorassemblypage.engineNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Engine number' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Engine number' ");
//                                    } else {
//                                           logger.createNode("Check when Engine Number  - " + majorassemblypage.engineNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Engine number' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Engine number ");
//                                    }
//
//
//                                    //Search remaning and auto populate functionality
//                                    //enfine end number
//
//                                     majorassemblypage.searchVehicleCategory("Engine end no. (model designation/end number/plant)");
//                              majorassemblypage.searchCategoryNumber(majorassemblypage.engineEndInputNumber);
//
//                                    //order number
//
//                                     majorassemblypage.searchVehicleCategory("Order number");
//                              majorassemblypage.searchCategoryNumber(majorassemblypage.orderNumberInput);
//
//                                    //recondNumberInput
//                                     majorassemblypage.searchVehicleCategory("Recond. engine");
//                              majorassemblypage.searchCategoryNumber(majorassemblypage.recondNumberInput);
//
//                                    //transmissionNumberInput
//                                     majorassemblypage.searchVehicleCategory("Transmission no.");
//                              majorassemblypage.searchCategoryNumber(majorassemblypage.transmissionNumberInput);
//
//                                    //axleNumberInput
//                                     majorassemblypage.searchVehicleCategory("Axle number");
//                              majorassemblypage.searchCategoryNumber(majorassemblypage.axleNumberInput);
//                                    //Auto populate engine end number
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.engineEndInputNumber);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Engine end no. (model designation/end number/plant)")) {
//                                           logger.createNode("Check when Engine End Number - " + majorassemblypage.engineEndInputNumber
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Engine end no. (model designation/end number/plant)' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Engine end no. (model designation/end number/plant)' ");
//                                    } else {
//                                           logger.createNode("Check when Engine End Number  - " + majorassemblypage.engineEndInputNumber
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Engine end no. (model designation/end number/plant)' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Engine end no. (model designation/end number/plant)' ");
//                                    }
//
//                                    //Auto populate Order number
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.orderNumberInput);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Order number")) {
//                                            logger.createNode("Check when Order number - " + majorassemblypage.orderNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Order number' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Order number' ");
//                                    } else {
//                                           logger.createNode("Check when Order number  - " + majorassemblypage.orderNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Order number' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Order number' ");
//                                    }
//
//                                    //Auto populate recond number
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.recondNumberInput);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Recond. engine")) {
//                                           logger.createNode("Check when Recond. engine Number - " + majorassemblypage.recondNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Recond. engine' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Recond. engine' ");
//                                    } else {
//                                           logger.createNode("Check when Recond. engine  - " + majorassemblypage.recondNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Recond. engine' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Recond. engine' ");
//                                    }
//
//
//
//                                    //transmissionNumberInput
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.transmissionNumberInput);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Transmission no.")) {
//                                           logger.createNode("Check when Transmission no. - " + majorassemblypage.transmissionNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Transmission no.' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Transmission no.' ");
//                                    } else {
//                                           logger.createNode("Check when Transmission no.  - " + majorassemblypage.transmissionNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Transmission no.' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Transmission no.' ");
//                                    }
//
//
//                                    //axleNumberInput
//                              majorassemblypage.enterCategoryNumber(majorassemblypage.axleNumberInput);
//                                    selectedCategory = majorassemblypage.fetchMajorAssemblyCategorySelected();
//                                    if (selectedCategory.equalsIgnoreCase("Axle number")) {
//                                           logger.createNode("Check when Axle number - " + majorassemblypage.axleNumberInput
//                                                        + " entered in search field , the Major Assembly category dropdown got autopopulted as 'Axle number' ")
//                                                        .pass("The Major Assembly category dropdown got autopopulted as 'Axle number' ");
//                                    } else {
//                                           logger.createNode("Check when Axle number  - " + majorassemblypage.axleNumberInput
//                                                        + "  entered in search field , the Major Assembly category dropdown got autopopulted as 'Axle number' ")
//                                                        .fail("The Major Assembly category dropdown is not autopopulted as 'Axle number' ");
//                                    }
//
//
//

    }
    // Rintu end



	
	@AfterTest
	public void teardown() {
		driver.quit();
	}

	
}
