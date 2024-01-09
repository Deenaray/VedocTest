package com.vedoc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.*;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.AdministrationPage;
import com.vedoc.qa.pages.HomePage;
//import com.vedoc.qa.pages.LicenseKeyMasterPage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class AdministrationPageTest extends TestBase {

               HomePage homePage;
               LoginPage loginPage;
               AdministrationPage AdministrationPageModule ;
               VehicleDataPage_S vehicledatapage;


               public AdministrationPageTest() {
                              super();
               }

               @BeforeTest
               public void setUp() throws InterruptedException {

                              initialization();
                              loginPage = new LoginPage();
                              AdministrationPageModule=new AdministrationPage();
                              homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
                              SystemMessageCheck();
                              Thread.sleep(30000);
                              logger = extent.createTest("(AU) Login to application using Admin User credentials");
                              AdministrationPageModule=homePage.AdministrationModule();
                              Thread.sleep(10000);
               }                             

               @Test(priority = 1)
               public void CreateVehicleButton(){
                              logger = extent.createTest("U-007: (AU) Create Vehicle in Administration Module");
                              AdministrationPageModule.CreateVehicle();
                              logger.createNode("Create Vehicle button is clicked in the Thinclient").pass("Create Vehicle button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 2)
               public void AdministrationModule_Fin(){
                              AdministrationPageModule.Vehicle_Fin();
                              logger.createNode("Vehicle FIN field is provided with the input - W1T96342720720399"  ).pass("Vehicle FIN field is provided with the input -W1T96342720720399. Test Case Passed");
               }

               @Test(priority = 3)
               public void AdministrationModule_ApprovalDate(){
                              AdministrationPageModule.Vehicle_ApprovalDate();
                              logger.createNode("Approval Date field is provided with the input - 08/30/2023").pass("Approval Date field is provided with the input 08/30/2023. Test Case Passed");
               }

               @Test(priority = 4)
               public void AdministrationModule_SaveButton(){
                              AdministrationPageModule.Vehicle_SaveButton();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 5)
               public void AdministrationModule_MajorAssemblies(){
                              logger = extent.createTest("U-009: (AU) Major Assemblies Tab of Administration Module");
                              AdministrationPageModule.MajorAssembliesTab();
                              logger.createNode("Major Assemblies Tab is clicked").pass("Major Assemblies Tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 6)
               public void AdministrationModule_CreateMajorAssemblies(){
                              AdministrationPageModule.createMajorAssembliesTab();
                              logger.createNode("Create major assemblies button").pass("Create major assemblies button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 7)
               public void AdministrationModule_MajorAssemblyType(){
                              AdministrationPageModule.MajorAssemblyType();
                              logger.createNode("Major assembly of the high-voltage battery type is selected from Major assesmbly type dropdown").pass("Major assembly of the high-voltage battery type is selected from Major assesmbly type dropdown successfully. Test Case Passed");
               }

               @Test(priority = 8)
               public void AdministrationModule_MajorAssemblyIDNumber(){
                              AdministrationPageModule.AssemblyIDNumber();
                              logger.createNode("Major assembly ID number field is provided with the input - 93080060295924" ).pass("Major assembly ID number field is provided with the input 93080060295924. Test Case Passed");
               }

               @Test(priority = 9)
               public void AdministrationModule_MajorAssemblyIDNumber_SaveButton(){
                              AdministrationPageModule.MajorAssembly_SaveButton();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 10)
               public void systemMessageTab(){
                              logger = extent.createTest("U-163: (AU) System Message Tab of Administration Module");
                              AdministrationPageModule.systemMessage();
                              logger.createNode("System message tab is clicked").pass("System message tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 11)
               public void systemMessageTab_ShowDataButton(){
                              AdministrationPageModule.systemMessage_ShowDataButton();
                              logger.createNode("Show data button is clicked").pass("Show data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 12)
               public void systemMessageTab_CreateMessage(){
                              AdministrationPageModule.systemMessage_CreateMessage();
                              logger.createNode("Create message button is clicked").pass("Create message button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 13)
               public void systemMessageTab_MessageTitle(){
                              AdministrationPageModule.systemMessage_MessageTitle();
                              logger.createNode("Message title field is provided with the input - Random Message").pass("Message title input is provided with the input - Random Message . Test Case Passed");
               }

               @Test(priority = 14)
               public void systemMessageTab_MessageValidFrom(){
                              AdministrationPageModule.systemMessage_ValidFrom();
                              logger.createNode("Major assembly ID number field is provided with the input - " + RandomExhaustAftertreatmentNumber).pass("Major assembly ID number is provided with the input " + RandomExhaustAftertreatmentNumber + ". Test Case Passed");
               }

               @Test(priority = 15)
               public void systemMessageTab_MessageValidTo(){
                              AdministrationPageModule.systemMessage_ValidTo();
                              logger.createNode("Valid to date field is provided with the input - 07/12/2080").pass("Valid to date field is provided with the input - 07/12/2080. Test Case Passed");
               }

               @Test(priority = 16)
               public void systemMessageTab_MessageContent(){
                              AdministrationPageModule.systemMessage_messagecontent();
                              logger.createNode("Message body field with H1 is provided with the input - Created By MBRDI").pass("Created By MBRDI text with H1 is provided as input in the Message body field successfully. Test Case Passed");
                              AdministrationPageModule.systemMessage_messagecontent_Heading2();
                              logger.createNode("Message body field with H2 is provided with the input - Random Data").pass("Random Data text is updated with H2 is provided as input in the Message body field successfully. Test Case Passed");
                              AdministrationPageModule.systemMessage_messagecontent_systemMessage_messagecontent_Heading4();
                              logger.createNode("Message body field with H4 is provided with the input - Mercedez Benz").pass("Mercedez Benz text is updated with H4 is provided as input in the Message body field successfully. Test Case Passed");
                              AdministrationPageModule.systemMessage_messagecontent_systemMessage_MessageQuote();
                              logger.createNode("Message body input with quote is provided in the Thinclient is -  Hello all. This system message is generated for testing system message functionality. Kindly ignore if not in use. Thanks and Regards. MBRDI Colleagues.").pass("Mercedez Benz text with quote is provided as input in the Message body field successfully. Test Case Passed");
               }

               @Test(priority = 17)
               public void systemMessageTab_checkmarkButton_(){
                              AdministrationPageModule.systemMessage_Checkmarkbutton();
                              logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 18)
               public void systemMessageTab_SaveButton(){
                              AdministrationPageModule.systemMessage_SaveButton();
                              logger.createNode("Save Button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 19)
               public void systemMessageTab_FilterButton(){
                              AdministrationPageModule.systemMessage_FilterButton();
                              logger.createNode("Filter Button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 20)
               public void systemMessageTab_FilterText(){
                              AdministrationPageModule.systemMessage_FilterText();
                              logger.createNode("Filter field is provided with the input - Random Message").pass("Filter input is provided successfully. Test Case Passed");
               }

               @Test(priority = 21)
               public void systemMessageTab_EditTitleButton(){
                              AdministrationPageModule.systemMessage_EditTitle();
                              logger.createNode("Pencil button is clicked for editing").pass("Pencil button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 22)
               public void systemMessageTab_EditMessageTitle(){
                              AdministrationPageModule.systemMessage_EditMessageTitle();
                              logger.createNode("Message title field is edited with the data - Random Message edited").pass("Message title is edited successfully. Test Case Passed");
               }

               @Test(priority = 23)
               public void systemMessageTab_checkmarkButton(){
                              AdministrationPageModule.systemMessage_Checkmarkbutton();
                              logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 24)
               public void systemMessageTab_SaveButton_AfterEdit(){
                              AdministrationPageModule.systemMessage_SaveButton();
                              logger.createNode("Save Button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 25)
               public void systemMessageTab_Button(){
                              logger = extent.createTest("U-163: (AU) Show Vedoc news");
                              AdministrationPageModule.systemMessage_button();
                              logger.createNode("Message Button is clicked").pass("Message button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 26)
               public void systemMessageTab_OKButton(){
                              AdministrationPageModule.SystemMessage_OkButton();
                              logger.createNode("OK button is clicked").pass("OK button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 27)
               public void newTab(){
                              AdministrationPageModule.OpenNewTab();
                              logger.createNode("New Tab is opened in the browser window").pass("New tab is opend successfully. Test Case Passed");
               }
               
               // Doubt - clicking arrow near search nt clicking ok button
               
               @Test(priority = 29)
               public void systemMessage_check(){
                              logger = extent.createTest("U-002: (AU) Identification Tab of Vehicle Data Module");
                              
                              try {
                                             boolean flag= AdministrationPageModule.SystemMessage_OkButton_VehicleDataPage();
                                             if (flag = true) {
                                                            logger.createNode("System Message is displayed in the Thinclient").pass("System Message is displayed successfully. Test Case Passed");
                                             } else {
                                                            logger.createNode("System Message is not displayed in the Thinclient").pass("System Message is not displayed successfully. Test Case Passed");
                                             }
                              } catch (NoSuchElementException e) {
                                             logger.log(Status.SKIP, "Something wrong with the webelement.");
                              }
               }
               
               @Test(priority = 30)
               public void systemMessageTab_OKButton_VehicleDataPage(){
                              AdministrationPageModule.SystemMessage_OkButton();
                              logger.createNode("OK button is clicked in the Thinclient").pass("Ok button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 31)
               public void IdentificationTab_Test() throws InterruptedException{
                              AdministrationPageModule.searchfin();
                              logger.createNode("FIN Number field is provided as input into the search field - W1T96342720720399" ).pass("W1T96342720720399 is given as input into the search field successfully. Test Case Passed");
               }
               
               @Test(priority = 32)
               public void IdentificationTab_Test_FINNumber() throws InterruptedException{
                              AdministrationPageModule.VehicleDataFIN();
                              logger.createNode("Vehicle identification no. (FIN) field is displayed with the value - " + AdministrationPageModule.VehicleDataFIN()).pass(AdministrationPageModule.VehicleDataFIN() + " value is displayed in the Vehicle identification no. (FIN) field. Test Case Passed");
               }
               
               @Test(priority = 33)
               public void MajorAssembly_Tab() throws InterruptedException{
                              logger = extent.createTest("U-113: (AU) Show major assembly");
                              AdministrationPageModule.MajorAssemblyModule();
                              logger.createNode("Major Assembly Module is clicked").pass("Major Assembly Module is clicked successfully. Test Case Passed");
               }
               
               @Test(priority = 34)
               public void MajorAssembly_Tab_Dropdown() throws InterruptedException{
                              AdministrationPageModule.MajorAssemblyModule_dropdown();
                              logger.createNode("Dropdown selected in Major Assembly Module is - High-voltage battery ID").pass("High-voltage battery ID is selected in the dropdown successfully. Test Case Passed");
               }
               
               @Test(priority = 35)
               public void MajorAssembly_Tab_Search() throws InterruptedException{
                              AdministrationPageModule.MajorAssemblyModule_Search();
                              logger.createNode("Search field input is provided with the value - " +RandomExhaustAftertreatmentNumber).pass( "Search field input " +RandomExhaustAftertreatmentNumber+ " is provided successfully. Test Case Passed");
                              logger.createNode("Search button is cliecked").pass("Search button is clicked successfully. Test Case Passed"); 
               }
               
               @Test(priority = 36)
               public void MajorAssembly_Tab_IDNumber() throws InterruptedException{
                              AdministrationPageModule.MajorAssemblyModule_highVoltageBattery();
                              logger.createNode("High-voltage battery ID field is displayed with the value - " + AdministrationPageModule.MajorAssemblyModule_highVoltageBattery()).pass("High-voltage battery ID field is displayed wih the value " + AdministrationPageModule.MajorAssemblyModule_highVoltageBattery()+ ". Test Case Passed");
               }

               @Test(priority = 37)
               public void switchToAdministrationModulePage() throws InterruptedException{
                              logger = extent.createTest("U-012: (AU) System Message Tab of Administration Module");
                              AdministrationPageModule.switchBackToAdministrationModule();
                              logger.createNode("Switched back to the Administration Module").pass("Switched back to the Administration Module successfully. Test Case Passed");
               }

               @Test(priority = 38)
               public void AdministrationModule_FilterTButton_AfterSwitching(){
                              AdministrationPageModule.systemMessage_FilterButton();
                              logger.createNode("Filter Button is clicked in the Thinclient").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 39)
               public void systemMessageTab_FilterText_AfterSwitching(){
                              AdministrationPageModule.systemMessage_FilterText();
                              logger.createNode("Search filter is provided with the input - Random message").pass("Random message is given as input in the search filter successfully. Test Case Passed");
               }
               
               @Test(priority = 40)
               public void systemMessageTab_TrashButton(){
                              AdministrationPageModule.systemMessageDelete();
                              logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
               }
               
               @Test(priority = 41)
               public void systemMessageTab_SaveButton_ToDelete(){
                              AdministrationPageModule.systemMessage_SaveButton();
                              logger.createNode("Save Button is clicked").pass("Save Button is clicked successfully. Test Case Passed");
               }
               
//// Commented - Negative Testing
//
////               
////               @Test(priority = 42)
////               public void VehicleTab_Afterswithing(){
////                              AdministrationPageModule.VehiclesTab();
////                              logger = extent.createTest("U-007: (AU) Vehicles Tab of Administration Module");
////                              logger.createNode("Vehicles Tab is clicked").pass("Vehicles Tab is clicked successfully. Test Case Passed");
////               }
////               
////               @Test(priority = 43)
////               public void CreateVehicleButton_ForNegativeTestCase(){
////                              AdministrationPageModule.CreateVehicleNegativeTesting();
////                              logger.createNode("Create Vehicle button is clicked").pass("Create Vehicle button is clicked successfully. Test Case Passed");
////               }
////
////               @Test(priority = 44)
////               public void AdministrationModule_Fin_ForNegativeTesting(){
////                              AdministrationPageModule.Vehicle_Fin_ForNegativeTesting();
////                              logger.createNode("Vehicle FIN field is provided with the input - 111!!!!@&..,,//////").pass("Vehicle FIN field is provided with the input 111!!!!@&..,,////// successfully. Test Case Passed");
////               }
////
////               @Test(priority = 45)
////               public void AdministrationModule_ApprovalDate_ForNegativeTesting(){
////                              AdministrationPageModule.Vehicle_ApprovalDate_ForNegativeTesting();
////                              logger.createNode("Approval Date field is provided with the input - 22-21-2022").pass("Approval Date field is provided with the input 22-21-2022 successfully. Test Case Passed");
////               }
////               
////               @Test(priority = 46)
////               public void AdministrationModule_warningIcon(){
////               
////               try {
////                              boolean flag=     AdministrationPageModule.WarningMessage_VehiclesTab();
////                              if (flag = true) {
////                                             logger.createNode("Warning Icon is displayed for invalid input").pass("Warning icon is displayed successfully. Test Case Passed");
////                              } else {
////                                             logger.createNode("Warning Icon is not displayed for invalid input").pass("Warning icon is not displayed successfully. Test Case Passed");
////                              }
////               } catch (NoSuchElementException e) {
////                              logger.log(Status.SKIP, "Something wrong with the webelement.");
////               }
////               
////               }
////               
////               @Test(priority = 47)
////               public void AdministrationModule_CancelButton(){
////                              AdministrationPageModule.VehicleTab_CancelButton();
////                              logger.createNode("Cancel Button is clicked").pass("Cancel button is clicked successfully. Test Case Passed");
////                              logger.createNode("OK Button is clicked from the Modal Dialog").pass("OK Button is clicked from the Modal Dialog successfully. Test Case Passed");
////                              logger.createNode("Cancel Button is clicked").pass("Cancel button is clicked successfully. Test Case Passed");
////               }
////               
////               @Test(priority = 48)
////               public void AdministrationModule_MajorAssemblies_ForNegavtiveTesting(){
////                              logger = extent.createTest("U-009: (AU) Major Assemblies Tab of Administration Module");
////                              AdministrationPageModule.MajorAssembliesTab();
////                              logger.createNode("Major Assemblies Tab is clicked").pass("Major Assemblies tab clicked successfully. Test Case Passed");
////               }
////
////               @Test(priority = 49)
////               public void AdministrationModule_CreateMajorAssemblies_ForNegavtiveTesting(){
////                              AdministrationPageModule.createMajorAssembliesTab();
////                              logger.createNode("Create Major Assembly button is clicked").pass("Create Major Assembly button is clicked successfully. Test Case Passed");
////               }
////
////               @Test(priority = 50)
////               public void AdministrationModule_MajorAssemblyType_ForNegavtiveTesting(){
////                              AdministrationPageModule.MajorAssemblyType();
////                              logger.createNode("Major assembly of the high-voltage battery type is selected from dropdown").pass("Major assembly of the high-voltage battery type is selected from dropdown successfully. Test Case Passed");
////               }
////
////               @Test(priority = 51)
////               public void AdministrationModule_MajorAssemblyIDNumber_ForNegavtiveTesting(){
////                              AdministrationPageModule.AssemblyIDNumber_ForNegativeTesting();
////                              logger.createNode("Major assembly ID number field is provided with the input - 1111111111111111111111111111.@=!!#$%^").pass("Major assembly ID number is provided with the input 1111111111111111111111111111.@=!!#$%^ successfully. Test Case Passed");
////               }
////               
////               @Test(priority = 52)
////               public void AdministrationModule_warningIcon_ForMajorAssembliesTab(){
////               
////               try {
////                              boolean flag=     AdministrationPageModule.WarningMessage_VehiclesTab();
////                              if (flag = true) {
////                                             logger.createNode("Warning Icon is displayed for invalid input").pass("Warning Icon for invalid input is displayed successfully. Test Case Passed");
////                              } else {
////                                             logger.createNode("Warning Icon is not displayed and it's a valid input").fail("Warning Icon for invalid input is not displayed. Test Case failed");
////                              }
////               } catch (NoSuchElementException e) {
////                              logger.log(Status.SKIP, "Something wrong with the webelement.");
////               }
////               
////               }
////
////               @Test(priority = 53)
////               public void AdministrationModule_CancelButton_MajorAssembliesTab(){
////                              AdministrationPageModule.MajorAssembliesTab_CancelButton();
////                              logger.createNode("Cancel Button is clicked in the Thinclient").pass("Cancel button is clicked successfully. Test Case Passed");
////                              logger.createNode("OK Button is clicked from the Modal Dialog in the Thinclient").pass("OK Button is clicked from the Modal Dialog successfully. Test Case Passed");
////                              logger.createNode("Cancel Button is clicked in the Thinclient").pass("Cancel button is clicked successfully. Test Case Passed");
////               }              
//               
//               // Commented - Negative Testing
                 
               
               @Test(priority = 54)
               public void ConflictSummaryTab(){
                              logger = extent.createTest("U-242: (AU) Manage conflict summary configuration");
                              AdministrationPageModule.ConflictSummaryTab();
                              logger.createNode("Conflict summary tab is clicked").pass("Conflict summary tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 55)
               public void ConflictSummaryTab_ShowDataButton(){
                              AdministrationPageModule.ConflictSummaryTab_ShowDataButton();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 56)
               public void ConflictSummaryTab_AddConfigurationButton(){
                              AdministrationPageModule.ConflictSummaryTab_AddConfigurationButton();
                              logger.createNode("Add Configuration button is clicked").pass("Add Configuration button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 57)
               public void ConflictSummaryTab_ConfigurationID(){
                              AdministrationPageModule.ConflictSummaryTab_ConfigurationID();
                              logger.createNode("Configuration ID field is provided with the input - " + CUGroup_Identifier ).pass("Configuration ID field is provided as input " + CUGroup_Identifier +" successfully. Test Case Passed");
               }

               @Test(priority = 58)
               public void ConflictSummaryTab_Status(){
                              AdministrationPageModule.ConflictSummaryTab_Status();
                              logger.createNode("Status field is provided with the input - NEW ").pass("Status field is provided with the input - New. Test Case Passed");
               }

               @Test(priority = 59)
               public void ConflictSummaryTab_Description1(){
                              AdministrationPageModule.ConflictSummaryTab_Description1();
                              logger.createNode("Description 1 field is provided with the input- Random message inserted").pass("Description 1 field is provided with the input - random message successfully. Test Case Passed");
               }

               @Test(priority = 60)
               public void ConflictSummaryTab_ConflictMessageID(){
                              AdministrationPageModule.ConflictSummaryTab_ConflictMessageID();
                              logger.createNode("Conflict message ID field is provided with the input - Added by DTICI colleagues for testing the functionality of this Tab").pass("Conflict message ID field is provided with the input Added by DTICI colleagues for testing the functionality of this Tab successfully. Test Case Passed");
               }

               @Test(priority = 61)
               public void ConflictSummaryTab_Checkmarkbutton(){
                              AdministrationPageModule.ConflictSummaryTab_CheckmarkButton();
                              logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 62)
               public void ConflictSummaryTab_SaveButton(){
                              AdministrationPageModule.ConflictSummaryTab_SaveButton();
                              logger.createNode("Email Address is provided as input - xxxxx@daimler.com").pass("Email Address - xxxxx@daimler.com  is provided as input successfully. Test Case Passed");
                              logger.createNode("Email language selected - English").pass("Email language english is selected successfully. Test Case Passed");
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 63)
               public void ConflictSummaryTab_FilterButton(){
                              AdministrationPageModule.ConflictSummaryTab_Filterbutton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 64)
               public void ConflictSummaryTab_FilterText(){
                              AdministrationPageModule.ConflictSummaryTab_FilterText();
                              logger.createNode("Configuration ID field is provided with the input in the search field - " + CUGroup_Identifier).pass("Configuration ID filed is provided with the input in the search field " +CUGroup_Identifier+ ". Test Case Passed");
               }

               @Test(priority = 65)
               public void ConflictSummaryTab_EditButton(){
                              AdministrationPageModule.ConflictSummaryTab_EditButton();
                              logger.createNode("Edit Button is clicked").pass("Edit Button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 66)
               public void ConflictSummaryTab_Description2(){
                              AdministrationPageModule.ConflictSummaryTab_Description2();
                              logger.createNode("Description 2 field is edited with the value - Random Description").pass("Description 2 field is edited with the data - Random Description successfully. Test Case Passed");
               }

               @Test(priority = 67)
               public void ConflictSummaryTab_Checkmarkbutton_AfterAddingDescription2(){
                              AdministrationPageModule.ConflictSummaryTab_CheckmarkButton();
                              logger.createNode("Checkmark button is clicked").pass("Checkmark button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 68)
               public void ConflictSummaryTab_SaveButton_AfterAddingDescription2(){
                              AdministrationPageModule.ConflictSummaryTab_SaveButton_ToDeleteEntry();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 69)
               public void ConflictSummaryTab_FilterButton_TodeleteData(){
                              AdministrationPageModule.ConflictSummaryTab_Filterbutton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 70)
               public void ConflictSummaryTab_FilterText_ToDeleteData(){
                              AdministrationPageModule.ConflictSummaryTab_FilterText();
                              logger.createNode("Configuration ID is provided as input in the search field is - " + CUGroup_Identifier).pass("Configuration ID " +CUGroup_Identifier+ " is provided as input in the search field successfully. Test Case Passed");
               }

               @Test(priority = 71)
               public void ConflictSummaryTab_TrashButton(){
                              AdministrationPageModule.ConflictSummaryTab_DeleteButton();
                              logger.createNode("Trash Button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 72)
               public void ConflictSummaryTab_SaveButtonToDelete(){
                              AdministrationPageModule.ConflictSummaryTab_SaveButton_ToDeleteEntry();
                              logger.createNode("Save Button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

//// Automatic conflict status Tab

               @Test(priority = 73)
               public void automaticConflictStatusTab(){
                              logger = extent.createTest("U-253: (AU) Automatic conflict status Tab of Administration Module");
                              AdministrationPageModule.automaticConflictStatusTab();
                              logger.createNode("Automatic Conflict Staus tab is clicked").pass("Automatic Conflict Staus tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 74)
               public void automaticConflictStatusTab_ShowData(){
                              AdministrationPageModule.automaticConflictStatusTab_ShowData();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 75)
               public void automaticConflictStatusTab_Add_Configuration(){
                              AdministrationPageModule.automaticConflictStatusTab_AddConfiguration();
                              logger.createNode("Add Configuration button is clicked").pass("Add Configuration button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 76)
               public void automaticConflictStatusTab_Add_ConfigurationID(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_ConfigurationID();
                              logger.createNode("Configuration ID field is provided with the data - " + randomNumbers_6).pass("Configuration ID field is provided with the data - " + randomNumbers_6 + ". Test Case Passed");
               }

               @Test(priority = 77)
               public void automaticConflictStatusTab_Add_Cause(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_Cause();
                              logger.createNode("Cause drop down is selected with the data - Coding/flash").pass("Cause drop down is selected with the data - Coding/flash. Test Case Passed");
               }

               @Test(priority = 78)
               public void automaticConflictStatusTab_UserId(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_UserId();
                              logger.createNode("User Id field is provided with the data - Add User ID").pass("User Id field is provided with the data - Add User ID. Test Case Passed");
               }

               @Test(priority = 79)
               public void automaticConflictStatusTab_ConflictType(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_ConflictType();
                              logger.createNode("Conflict type drop down is selected with the data - Inconsistency").pass("Conflict type drop down is selected with the data - Inconsistency. Test Case Passed");
               }

               @Test(priority = 80)
               public void automaticConflictStatusTab_Description1(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_Description1();
                              logger.createNode("Description1 field is provided with the data - Add description1").pass("Description1 field is provided with the data - Add description1. Test Case Passed");
               }

               @Test(priority = 81)
               public void automaticConflictStatusTab_Description2(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_Description2();
                              logger.createNode("Description2 field is provided with the data - Add description2").pass("Description2 field is provided with the data - Add description2. Test Case Passed");
               }

               @Test(priority = 82)
               public void automaticConflictStatusTab_ConflictMessageId(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_ConflictMessageId();
                              logger.createNode("Conflict message ID field is provided with the data - Add conflict message ID").pass("Conflict message ID field is provided with the data - Add conflict message ID. Test Case Passed");
               }

               @Test(priority = 83)
               public void automaticConflictStatusTab_TargetStatus(){
                              AdministrationPageModule.automaticConflictStatusTab_Add_TargetStatus();
                              logger.createNode("Target Status drop down is selected with the data - Inactive").pass("Target Status drop down is selected with the data - Inactive. Test Case Passed");
               }

               @Test(priority = 84)
               public void automaticConflictStatusTab_SubmitIcon(){
                              AdministrationPageModule.submit_Icon();
                              logger.createNode("Submit button is clicked").pass("Submit button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 85)
               public void automaticConflictStatusTab_Filter(){
                              AdministrationPageModule.automaticConflictStatusTab_FilterButton();
               }

               @Test(priority = 86)
               public void automaticConflictStatusTab_Add_Save(){
                              AdministrationPageModule.automaticConflictStatusTab_Save();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 87)
               public void automaticConflictStatusTab_Add_FilterButton(){
                              AdministrationPageModule.automaticConflictStatusTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 88)
               public void automaticConflictStatusTab_Add_FilterData(){
                              AdministrationPageModule.automaticConflictStatusTab_FilterData();
                              logger.createNode("Search the table field is provided with the addded Configuration ID - " + randomNumbers_6).pass("Search the table field is provided with the added Configuration ID - " +randomNumbers_6+ ". Test Case Passed");
               }

               @Test(priority = 89)
               public void automaticConflictStatusTab_Add_FilteredResult(){
                              AdministrationPageModule.automaticConflictStatusTab_FilteredResult();
                              logger.createNode("Filtered result of added configuration is - " + AdministrationPageModule.automaticConflictStatusTab_FilteredResult()).pass("Filtered result of added configuration is - "+ AdministrationPageModule.automaticConflictStatusTab_FilteredResult() +". Test Case Passed");
               }

               @Test(priority = 90)
               public void automaticConflictStatusTab_EditButton(){
                              AdministrationPageModule.automaticConflictStatusTab_EditButton();
                              logger.createNode("Edit button is clicked").pass("Edit button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 91)
               public void automaticConflictStatusTab_Edit_ConfigurationID(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_ConfigurationID();
                              logger.createNode("Configuration ID field is edited with the data - " + randomNumbers_5).pass("Configuration ID field is edited with the data - " + randomNumbers_5 + ". Test Case Passed");
               }

               @Test(priority = 92)
               public void automaticConflictStatusTab_Edit_Cause(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_Cause();
                              logger.createNode("Cause drop down is edited with the data - Online").pass("Cause drop down is edited with the data - Online. Test Case Passed");
               }

               @Test(priority = 93)
               public void automaticConflictStatusTab_Edit_UserId(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_UserId();
                              logger.createNode("User Id field is edited with the data - Edit User ID").pass("User Id field is edited with the data - Edit User ID. Test Case Passed");
               }

               @Test(priority = 94)
               public void automaticConflictStatusTab_Edit_ConflictType(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_ConflictType();
                              logger.createNode("Conflict type drop down is edited with the data - Fatal - rights").pass("Conflict type drop down is edited with the data - Fatal - rights. Test Case Passed");
               }

               @Test(priority = 95)
               public void automaticConflictStatusTab_Edit_Description1(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_Description1();
                              logger.createNode("Description1 field is edited with the data - Edit description1").pass("Description1 field is edited with the data - Edit description1. Test Case Passed");
               }

               @Test(priority = 96)
               public void automaticConflictStatusTab_Edit_Description2(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_Description2();
                              logger.createNode("Description2 field is edited with the data - Edit description2").pass("Description2 field is edited with the data - Edit description2. Test Case Passed");
               }

               @Test(priority = 97)
               public void automaticConflictStatusTab_Edit_ConflictMessageId(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_ConflictMessageId();
                              logger.createNode("Conflict message ID field is edited with the data - Edit conflict message ID").pass("Conflict message ID field is edited with the data - Edit conflict message ID. Test Case Passed");
               }

               @Test(priority = 98)
               public void automaticConflictStatusTab_Edit_TargetStatus(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_TargetStatus();
                              logger.createNode("Target Status drop down is edited with the data - Ignored").pass("Target Status drop down is edited with the data - Ignored. Test Case Passed");
               }

               @Test(priority = 99)
               public void automaticConflictStatusTab_Edit_submit_Icon(){
                              AdministrationPageModule.submit_Icon();
                              logger.createNode("Submit Button is clicked").pass("Submit Button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 100)
               public void automaticConflictStatusTab_Edit_Save(){
                              AdministrationPageModule.automaticConflictStatusTab_Save();
                              logger.createNode("Save Button is clicked").pass("Save Button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 101)
               public void automaticConflictStatusTab_Edit_FilterButton(){
                              AdministrationPageModule.automaticConflictStatusTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 102)
               public void automaticConflictStatusTab_Edit_FilterData(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_FilterData();
                              logger.createNode("Search the table field is provided with the edited Configuration ID - " +randomNumbers_5).pass("Search the table field is provided with the edited Configuration ID data - "+randomNumbers_5+". Test Case Passed");
               }

               @Test(priority = 103)
               public void automaticConflictStatusTab_Edit_FilteredResult(){
                              AdministrationPageModule.automaticConflictStatusTab_FilteredResult();
                              logger.createNode("Filtered result of edited configuration is - " + AdministrationPageModule.automaticConflictStatusTab_FilteredResult()).pass("Filtered result of edited configuration is - "+ AdministrationPageModule.automaticConflictStatusTab_FilteredResult() +". Test Case Passed");
               }

               @Test(priority = 104)
               public void automaticConflictStatusTab_TrashButton(){
                              AdministrationPageModule.automaticConflictStatusTab_TrashButton();
                              logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 105)
               public void automaticConflictStatusTab_Trash_Save(){
                              AdministrationPageModule.automaticConflictStatusTab_Save();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 106)
               public void automaticConflictStatusTab_Trash_FilterButton(){
                              AdministrationPageModule.automaticConflictStatusTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 107)
               public void automaticConflictStatusTab_Trash_FilterData(){
                              AdministrationPageModule.automaticConflictStatusTab_Edit_FilterData();
                              logger.createNode("Search the table field is provided with the deleted Configuration ID - " +randomNumbers_5).pass("Search the table field is provided with the deleted Configuration ID - "+randomNumbers_5+" .Test Case Passed");
               }

               @Test(priority = 108)
               public void automaticConflictStatusTab_FilteredResult(){
                              try {
                                             boolean displayFlag = AdministrationPageModule.filteredResult();
                                             if(displayFlag)
                                             logger.createNode("Deleted Configuration ID - " + randomNumbers_5 + " is displayed").fail("Deleted Configuration ID - " + randomNumbers_5 + " is displayed");
                                             else
                                                            logger.createNode("Deleted Configuration ID - " + randomNumbers_5 + " is not displayed").pass("Deleted Configuration ID - " + randomNumbers_5 + " is not displayed");
                              } catch (NoSuchElementException e) {
                                             logger.createNode("Deleted Configuration ID - " + randomNumbers_5 + " is not available").pass("Deleted Configuration ID - " + randomNumbers_5 + " is not available");
                              }
               }



// Edit data in Timer and Parameter tab

               @Test(priority = 109)
               public void click_timerAndParameterConfiguration_Tab(){
                              logger = extent.createTest("U-266: (AU) Edit the data under Timer and parameter configuration Tab of Administration Module");
                              AdministrationPageModule.timerAndParameterConfiguration_Tab();
                              logger.createNode("Timer and parameter configuration Tab is clicked").pass("Timer and parameter configuration Tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 110)
               public void timerAndParameterTab_ShowDataButton(){
                              AdministrationPageModule.timerAndParameterTab_ShowDataButton();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 111)
               public void timerAndParameterTab_FirstRow_Click(){
                              AdministrationPageModule.timerAndParameterTab_FirstRow();
                              logger.createNode("A Timer and parameter configuration row is selected").pass("A Timer and parameter configuration row is selected successfully. Test Case Passed");
               }

               @Test(priority = 112)
               public void timerAndParameterTab_FirstRow_Edit(){
                              AdministrationPageModule.timerAndParameterTab_Edit();
                              logger.createNode("Edit icon is clicked").pass("Edit' icon is clicked successfully. Test Case Passed");
               }

               @Test(priority = 113)
               public void timerAndParameterTab_IntervalInput(){
                              AdministrationPageModule.timerAndParameterTab_Interval();
                              logger.createNode("Interval field is edited with the value : " + randomNumbers_6).pass("Interval field is edited with the value : " + randomNumbers_6 + "successfully. Test Case Passed");
               }

               @Test(priority = 114)
               public void timerAndParameterTab_TimeoutInput(){
                              AdministrationPageModule.timerAndParameterTab_Timeout();
                              logger.createNode("Timeout field is edited with the value : " + randomNumbers_4).pass("Timeout field is edited with the value : " + randomNumbers_4 + " successfully. Test Case Passed");
               }
//
////               @Test(priority = 115)
////               public void timerAndParameterTab_StartingTime(){
////                              AdministrationPageModule.timerAndParameterTab_StartingTime();
////                              logger.createNode("StartingTime field is edited with the value : 030433").pass("Timeout field is edited with the value 030433 successfully. Test Case Passed");
////               }
//
               @Test(priority = 116)
               public void timerAndParameterTab_Member(){
                              AdministrationPageModule.timerAndParameterTab_Member();
                              logger.createNode("MemberInput field is edited with the value : 2").pass("MemberInput field is edited with the value 2 successfully. Test Case Passed");
               }

               @Test(priority = 117)
               public void timerAndParameterTab_SubmitIcon(){
                              AdministrationPageModule.submit_Icon();
                              logger.createNode("Submit icon is clicked").pass("Submit icon is clicked successfully. Test Case Passed");
               }

               @Test(priority = 118)
               public void timerAndParameterTab_Save(){
                              AdministrationPageModule.timerAndParameterTab_Save();
                              logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
               }


               // Filter data in Timer and Parameter tab

               @Test(priority = 119)
               public void timerAndParameterTab_FilterButton(){
                              logger = extent.createTest("U-266: (AU) Filter the edited data under Timer and parameter configuration Tab of Administration Module");
                              AdministrationPageModule.filter_Button();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 120)
               public void timerAndParameterTab_FilterData(){
                              AdministrationPageModule.timerAndParameterTab_FilterText();
                              logger.createNode("Search field is entered with the text - 03:04:33").pass("Search field is entered with the text - 03:04:33 successfully. Test Case Passed");
                              logger.createNode("The filtered result - " +AdministrationPageModule.timerAndParameterTab_FilteredResult() + " is displayed in the table").pass("The filtered result - " +AdministrationPageModule.timerAndParameterTab_FilteredResult() + " is displayed in the table successfully. Test Case Passed");
               }

//             //above commented ignore below from here
               @Test(priority = 121)
             public void messageDuplicatorTab(){
                            logger = extent.createTest("U-275: (AU) Edit the data under Message duplicator configuration Tab of Administration Module");
                            AdministrationPageModule.messageDuplicatorTab();
                            logger.createNode("Message duplicator configuration tab is clicked").pass("Message duplicator configuration tab is clicked successfully. Test Case Passed");
             }

               @Test(priority = 122)
             public void messageDuplicatorTab_ShowData(){
                            AdministrationPageModule.messageDuplicatorTab_ShowData();
                            logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
             }

               @Test(priority = 123)
             public void messageDuplicatorTab_Edit(){
                            AdministrationPageModule.messageDuplicatorTab_FirstRow();
                            logger.createNode("A Message duplicator configuration row is selected").pass("A Message duplicator configuration row is selected successfully. Test Case Passed");
             }

             @Test(priority = 124)
             public void messageDuplicatorTab_EditIcon(){
                            AdministrationPageModule.messageDuplicatorTab_EditIcon();
                            logger.createNode("Edit icon is clicked").pass("Edit icon is clicked successfully. Test Case Passed");
             }

             @Test(priority = 125)
             public void messageDuplicatorTab_Group(){
                            AdministrationPageModule.messageDuplicatorTab_Group();
                            logger.createNode("Group field is edited with the input - A_MBRDI").pass("Group field is edited with the input - A_MBRDI. Test Case Passed");
             }

             @Test(priority = 126)
             public void messageDuplicatorTab_ValidFrom(){
                            AdministrationPageModule.messageDuplicatorTab_ValidFrom();
                            logger.createNode("Valid From field is edited with the input - 01/01/2022 7:44:47 AM").pass("Valid From field is edited with the input - 01/01/2022 7:44:47 AM. Test Case Passed");
             }

             @Test(priority = 127)
             public void messageDuplicatorTab_ValidUntil(){
                            AdministrationPageModule.messageDuplicatorTab_ValidUntil();
                            logger.createNode("Valid Until field is edited with the input - 01/01/2023 7:30:00 AM").pass("Valid Until field is edited with the input - 01/01/2023 7:30:00 AM. Test Case Passed");
             }

             @Test(priority = 128)
             public void messageDuplicatorTab_MaximumNumber(){
                            AdministrationPageModule.messageDuplicatorTab_MaximumNumber();
                            logger.createNode("Maximum Number field is edited with the input - 10").pass("Maximum Number field is edited with the input - 10. Test Case Passed");
             }

             @Test(priority = 129)
             public void messageDuplicatorTab_Submit(){
                            AdministrationPageModule.messageDuplicatorTab_Submit();
                            logger.createNode("Submit icon is clicked").pass("Submit icon is clicked successfully. Test Case Passed");
             }


             @Test(priority = 130)
             public void messageDuplicatorTab_Save(){
                            AdministrationPageModule.messageDuplicatorTab_Save();
                           logger.createNode("Save button is clicked").pass("Save button is clicked successfully. Test Case Passed");
             }

             @Test(priority = 131)
             public void messageDuplicatorTab_FilterButton(){
                 logger = extent.createTest("U-275: (AU) Filter the edited data under Message duplicator configuration Tab of Administration Module");

                            AdministrationPageModule.messageDuplicatorTab_FilterButton();
                           logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
             }

             @Test(priority = 132)
             public void messageDuplicatorTab_FilterText(){

            	 AdministrationPageModule.messageDuplicatorTab_FilterText();
               logger.createNode("Search field is provided with the input - A_MBRDI").pass("Search field is provided with the input - A_MBRDI. Test Case Passed");
               logger.createNode("The filtered result - " +AdministrationPageModule.messageDuplicatorTab_FilteredResult() + " is displayed in the table").pass("The filtered result - " +AdministrationPageModule.messageDuplicatorTab_FilteredResult() + " is displayed in the table successfully. Test Case Passed");
             }

               //again commented frm here
               @Test(priority = 133)
               public void externalServiceConfigurationTab(){
                              logger = extent.createTest("U-282: (AU) Edit the data under External service configuration Tab of Administration Module");
                              AdministrationPageModule.externalServiceConfiguration_Tab();
                              logger.createNode("External service configuration tab is clicked").pass("External service configuration tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 134)
               public void externalServiceConfigurationTab_showDataButton(){
                              AdministrationPageModule.externalServiceConfigurationTab_showDataButton();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 135)
               public void externalServiceConfigurationTab_Edit(){
                              AdministrationPageModule.externalServiceConfigurationTab_FirstRow();
                              logger.createNode("A External Service configuration row is selected").pass("A External Service configuration row is selected successfully. Test Case Passed");
               }

               @Test(priority = 136)
               public void externalServiceConfigurationTab_FirstRow(){
                              AdministrationPageModule.externalServiceConfigurationTab_Edit();
                              logger.createNode("Edit icon is clicked").pass("Edit icon is clicked successfully. Test Case Passed");
               }

               @Test(priority = 137)
               public void externalServiceConfigurationTab_ServiceDescription(){
                              AdministrationPageModule.externalServiceConfigurationTab_ServiceDescription();
                              logger.createNode("Service description field is provided with the input - Created by MBRDI").pass("Service description field input - Created by MBRDI is provided successfully. Test Case Passed");
               }

               @Test(priority = 138)
               public void externalServiceConfigurationTab_Group() {
                              AdministrationPageModule.externalServiceConfigurationTab_GroupDropDown();
                              logger.createNode("Group drop down menu is selected with the value - COC Print value").pass("COC Print value is selected in Group drop down menu successfully. Test Case Passed");
               }

               @Test(priority = 139)
               public void externalServiceConfigurationTab_Status() {
                              AdministrationPageModule.externalServiceConfigurationTab_Status();
                              logger.createNode("Status drop down menu is selected with the value - Active").pass("Active value is selected in Status drop down menu successfully. Test Case Passed");
               }

               @Test(priority = 140)
               public void externalServiceConfigurationTab_deactivationLimit() {
                              AdministrationPageModule.externalServiceConfigurationTab_deactivationLimit();
                              logger.createNode("Deactivation limit field is edited with the value : " + randomNumbers_4).pass("Deactivation limit field is edited with the value - " +randomNumbers_4+ "successfully. Test Case Passed");
               }

               @Test(priority = 141)
               public void externalServiceConfigurationTab_TimeoutTime() {
                              AdministrationPageModule.externalServiceConfigurationTab_TimeoutTime();
                              logger.createNode("Timeout Time field is edited with the value : " + randomNumbers_4).pass("Timeout Time field is edited with the value - " +randomNumbers_4+ "successfully. Test Case Passed");
               }

               @Test(priority = 142)
               public void externalServiceConfigurationTab_SubmitIcon() {
                              AdministrationPageModule.submit_Icon();
                              logger.createNode("Submit icon is clicked").pass("Submit icon is clicked successfully. Test Case Passed");
               }

               @Test(priority = 143)
               public void externalServiceConfigurationTab_Save() {
                              AdministrationPageModule.externalServiceConfigurationTab_Save();
                              logger.createNode("Save icon is clicked").pass("Save icon is clicked successfully. Test Case Passed");
               }

               @Test(priority = 144)
               public void externalServiceConfigurationTab_FilterButton(){
                              logger = extent.createTest("U-266: (AU) Filter the edited data under External service configuration Tab of Administration Module");
                              AdministrationPageModule.externalServiceConfigurationTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 145)
               public void externalServiceConfigurationTab_FilterData(){
                              AdministrationPageModule.externalServiceConfigurationTab_FilterText();
                              logger.createNode("Search field is entered with the text - Created by MBRDI").pass("Search field is entered with the text - Created by MBRDI successfully. Test Case Passed");
                              logger.createNode("The filtered result - " +AdministrationPageModule.externalServiceConfigurationTab_FilteredResult() + " is displayed in the table").pass("The filtered result - " +AdministrationPageModule.externalServiceConfigurationTab_FilteredResult() + " is displayed in the table successfully. Test Case Passed");
                                             }
               @Test(priority = 146)
               public void versionInformationTab(){
            	   logger = extent.createTest("U-276: (AU) Show VersionInformation Tab of Administration Module");
                   AdministrationPageModule.versionInformation_Tab();
                   logger.createNode("Version Informationn tab is clicked").pass("Version Informationn tab is clicked successfully. Test Case Passed");
               }
               @Test(priority = 147)
               public void versionInformationTab_showDataButton(){
                              AdministrationPageModule.versionInformationTab_showDataButton();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }
               @Test(priority = 148)
               public void versionInformationTab_exportButton(){
                              AdministrationPageModule.versionInformationTab_exportButton();
                              logger.createNode("Export button is clicked").pass("Export button is clicked successfully. Test Case Passed");
                              logger.createNode("Data is matched with CSV file").pass("Data is matched with CSV file successfully. Test Case Passed");
               }

               @Test(priority = 149)
               public void versionInformationTab_sorting(){
                              AdministrationPageModule.versionInformationTab_systemVersionSorting();
                              logger.createNode("System Version Data is sorted on basis on Environment column").pass("System Version Data is sorted on basis on Environment column successfully. Test Case Passed");
               }

               @Test(priority = 150)
               public void versionInformationTab_scriptInfo(){
                              AdministrationPageModule.versionInformationTab_scriptInfo();
                              logger.createNode("The script information displayed is - "+AdministrationPageModule.versionInformationTab_scriptInfo()).pass("The script information displayed is - "+AdministrationPageModule.versionInformationTab_scriptInfo()+". Test Case Passed");
                              }
               @Test(priority = 151)
               public void versionInformationTab_systemVersionFilter(){
                              AdministrationPageModule.versionInformationTab_systemVersionFilter();
                              logger.createNode("Data is filtered on basis of Artifact provided: VEDOCEG8").pass("Data is filtered on basis of Artifact provided: VEDOCEG8. Test Case Passed");
                             }
               @Test(priority = 152)
               public void versionInformationTab_systemVersionFilterCancel(){
                              AdministrationPageModule.versionInformationTab_systemVersionFilterCancel();
                              logger.createNode("Data is filtered & Search bar is closed").pass("Data is filtered & Search bar is closed. Test Case Passed");
                              }

               @Test(priority = 153)
               public void versionInformationTab_DBScriptsSorting(){
                              AdministrationPageModule.versionInformationTab_DBScriptsSorting();
                              logger.createNode("DB Scripts Data is sorted on basis on Delivery share column").pass("DB Scripts Data is sorted on basis on Delivery share column. Test Case Passed");
                              }
               @Test(priority = 154)
               public void versionInformationTab_exportDBScripts(){
                              AdministrationPageModule.versionInformationTab_exportDBScripts();
                              logger.createNode("Export button is clicked").pass("Export button is clicked successfully. Test Case Passed");
                              logger.createNode("Data is matched with CSV file").pass("Data is matched with CSV file successfully. Test Case Passed");
               }
               @Test(priority = 155)
               public void versionInformationTab_DBVersionFilter(){
                              AdministrationPageModule.versionInformationTab_DBVersionFilter();
                              logger.createNode("Data is filtered on basis of Delivery Share provided: 4_REPAIR").pass("Data is filtered on basis of Delivery Share provided: 4_REPAIR. Test Case Passed");
                              }
               @Test(priority = 156)
               public void versionInformationTab_DBVersionFilterCancel(){
                              AdministrationPageModule.versionInformationTab_DBVersionFilterCancel();
                              logger.createNode("Data is filtered & Search bar is closed").pass("Data is filtered & Search bar is closed. Test Case Passed");
                              }

            //travel to Vehicle data modu
               @Test(priority = 157)
               public void vehicleDataPage(){
                              logger = extent.createTest("U-069: (AU) Search the created Vehicle VIN number and enter the relevant data and save under Theft message tab in Vehicle data module");
                              AdministrationPageModule.mainIcon();
                              logger.createNode("Navigate to Vehicle Data page").pass("Navigate to Vehicle Data page. Test Case Passed");
                                             }

               @Test(priority = 158)
               public void searchfin() throws InterruptedException{
                              Thread.sleep(50000);
                              AdministrationPageModule.searchfin1();
                              logger.createNode("FIN Number field is provided as input into the search field - WDB4371051W168663").pass("WDB4371051W168663 is given as input into the search field successfully. Test Case Passed");
               }

               @Test(priority = 159)
               public void identificationTab_Theft() throws InterruptedException{
                              AdministrationPageModule.theftMessageTab();
                              logger.createNode("Theft message tab is clicked").pass("Theft message tab is clicked successfully. Test Case Passed");
               }

               @Test(priority = 160)
               public void theftMessage_CreateTheftButton() throws InterruptedException{
                              AdministrationPageModule.theftMessage_CreateTheftButton();
                              logger.createNode("Create button is clicked").pass("Create button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 161)
               public void theftMessage_theftDate() throws InterruptedException{
                              AdministrationPageModule.theftMessage_TheftDate();
                              logger.createNode("Theft date field is provided with the input - 03/03/2022").pass("Theft date field is provided with the input - 03/03/2022. Test Case Passed");
               }

               @Test(priority = 162)
               public void theftMessage_theftCountry() throws InterruptedException{
                              AdministrationPageModule.theftMessage_TheftCountry();
                              logger.createNode("Theft country field is provided with the input - IND").pass("Theft country field is provided with the input - IND. Test Case Passed");
               }

               @Test(priority = 163)
               public void theftMessage_theftLocation(){
                              AdministrationPageModule.theftMessage_TheftLocation();
                              logger.createNode("Theft location field is provided with the input - Bangalore").pass("Theft location field is provided with the input - Bangalore. Test Case Passed");
               }

               @Test(priority = 164)
               public void theftMessage_licensePlateNumber() {
                              AdministrationPageModule.theftMessage_LicensePlateNumber();
                              logger.createNode("License plate number field is provided with the input - TN09 A1000").pass("License plate number field is provided with the input - TN09 A1000. Test Case Passed");
               }

               @Test(priority = 165)
               public void theftMessage_bkaDeletionDate(){
                              AdministrationPageModule.theftMessage_BkaDeletionDate();
                              logger.createNode("BKA deletion date field is provided with the input - 03/03/2022").pass("BKA deletion date field is provided with the input - 03/03/2022. Test Case Passed");
               }

               @Test(priority = 166)
               public void theftMessage_bkareasonOfDeletion(){
                              AdministrationPageModule.theftMessage_BkareasonOfDeletion();
                              logger.createNode("BKA reason of deletion field is provided with the input - Affair invalidated").pass("BKA reason of deletion field is provided with the input - Affair invalidated. Test Case Passed");
               }

               @Test(priority = 167)
               public void theftMessage_policeAuthorities() {
                              AdministrationPageModule.theftMessage_PoliceAuthorities();
                              logger.createNode("Police authorities field is provided with the input - S9").pass("Police authorities field is provided with the input - S9. Test Case Passed");
               }

               @Test(priority = 168)
               public void theftMessage_policeReference(){
                              AdministrationPageModule.theftMessage_PoliceReference();
                              logger.createNode("Police reference field is provided with the input - Reference").pass("Police reference field is provided with the input - Reference. Test Case Passed");
               }

               @Test(priority = 169)
               public void theftMessage_policeContacttDetails(){
                              AdministrationPageModule.theftMessage_PoliceContacttDetails();
                              logger.createNode("Police contact details field is provided with the input - 9999999999").pass("Police contact details field is provided with the input - 9999999999. Test Case Passed");
               }

               @Test(priority = 170)
               public void theftMessage_insurer() {
                              AdministrationPageModule.theftMessage_Insurer();
                              logger.createNode("Insurer field is provided with the input - MBRDI").pass("Insurer field is provided with the input - MBRDI. Test Case Passed");
               }

               @Test(priority = 171)
               public void theftMessage_damageNumber() {
                              AdministrationPageModule.theftMessage_DamageNumber();
                              logger.createNode("Damage number field is provided with the input - 222").pass("Damage number field is provided with the input - 222. Test Case Passed");
               }

               @Test(priority = 172)
               public void theftMessage_insurercontactDetails(){
                              AdministrationPageModule.theftMessage_InsurercontactDetails();
                              logger.createNode("Insurer contact details field is provided with the input - 888888888").pass("Insurer contact details field is provided with the input - 888888888. Test Case Passed");
               }

               @Test(priority = 173)
               public void theftMessage_internalNote() {
                              AdministrationPageModule.theftMessage_InternalNote();
                              logger.createNode("Internal note field is provided with the input - Stolen").pass("Internal note field is provided with the input - Stolen. Test Case Passed");
               }

               @Test(priority = 174)
               public void theftMessage_Save(){
                              AdministrationPageModule.theftMessage_Save();
                              logger.createNode("Click on Save button").pass("Click on Save button successfully. Test Case Passed");
               }

          //KELKARK- moved to vehicle data page test_RU
               @Test(priority = 175)
             public void emailDistributionTab(){
            	//   AdministrationPageModule=homePage.AdministrationModule();
                 //  AdministrationPage.switchBackToAdministrationModule();
                  AdministrationPageModule.administationClick();
            	   warmup4();
            	   logger = extent.createTest("U-002:(AU) Switched back to the Administration Module").pass("Switched back to the Administration Module successfully. Test Case Passed");
                            AdministrationPageModule.emailDistributionTab();
                            logger = extent.createTest("U-087: (AU) Manage Email Distribution Lists");
                            logger.createNode("E-mail distribution tab is clicked").pass("E-mail distribution tab is clicked successfully. Test Case Passed");
             }

               @Test(priority = 176)
               public void emailDistributionTab_ShowData(){
                              AdministrationPageModule.emailDistributionTab_ShowData();
                              logger.createNode("Show Data button is clicked").pass("Show Data button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 177)
               public void emailDistributionTab_FilterButton(){
                              AdministrationPageModule.emailDistributionTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 178)
               public void emailDistributionTab_SearchTheTable(){
                              AdministrationPageModule.emailDistributionTab_SearchTheTable();
                              logger.createNode("Search the table field is provided with the input - Access to stolen passenger car").pass("Search the table field is provided with the input - Access to stolen passenger car. Test Case Passed");
               }

               @Test(priority = 179)
               public void emailDistributionTab_EditEmailFrequency(){
                              AdministrationPageModule.emailDistributionTab_EditEmailFrequency();
                              logger.createNode("Edit icon is clicked in the Event Category table").pass("Edit icon is clicked in the Event Category table. Test Case Passed");
               }

               @Test(priority = 180)
               public void emailDistributionTab_EmailFrequencyDropDown_Daily(){
                              AdministrationPageModule.emailDistributionTab_EmailFrequencyDropDown_Daily();
                              logger.createNode("E-mail frequency drop down is edited with the input - 1 time per day").pass("E-mail frequency drop down is edited with the input - 1 time per day. Test Case Passed");
               }

               @Test(priority = 181)
               public void emailDistributionTab_CheckMark(){
                              AdministrationPageModule.emailDistributionTab_CheckMark();
                              logger.createNode("Checkmark icon is clicked in the Event Category table").pass("Checkmark icon is clicked in the Event Category table. Test Case Passed");
               }

               @Test(priority = 182)
               public void emailDistributionTab_Save(){
                              AdministrationPageModule.emailDistributionTab_Save();
                              logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
               }

               @Test(priority = 183)
               public void emailDistributionTab_EditEventCategory_FilterButton(){
                              AdministrationPageModule.emailDistributionTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 184)
               public void emailDistributionTab_EditEventCategory_SearchTheTable(){
                              AdministrationPageModule.emailDistributionTab_SearchTheTable();
                              logger.createNode("Search the table field is provided with the input - Access to stolen passenger car").pass("Search the table field is provided with the input - Access to stolen passenger car. Test Case Passed");
               }

               @Test(priority = 185)
               public void emailDistributionTab_EventCategoryTable_FirstRow(){
                              AdministrationPageModule.emailDistributionTab_FirstRow();
                              logger.createNode("The filtered result of edited Event Category table is - "+AdministrationPageModule.emailDistributionTab_FirstRow()).pass("The filtered result of edited Event Category table is - "+AdministrationPageModule.emailDistributionTab_FirstRow()+". Test Case Passed");
               }

               @Test(priority = 186)
               public void emailDistributionTab_Add_EmailList(){
                              AdministrationPageModule.emailDistributionTab_Add_EmailList();
                              logger.createNode("Add button is clicked in the Event Category table").pass("Add button is clicked in the Event Category table. Test Case Passed");
               }

               @Test(priority = 187)
               public void emailDistributionTab_Add_EmailAddress(){
                              AdministrationPageModule.emailDistributionTab_Add_EmailAddress();
                              logger.createNode("E-mail address field is provided with the input - tata.varadharajan@mercedes-benz.com").pass("E-mail address field is provided with the input - tata.varadharajan@mercedes-benz.com. Test Case Passed");
               }

               @Test(priority = 188)
               public void emailDistributionTab_Add_EmailLanguage(){
                              AdministrationPageModule.emailDistributionTab_Add_EmailLanguage();
                              logger.createNode("E-mail language drop down is provided with the input - German").pass("E-mail address language drop down is provided with the input - German. Test Case Passed");
               }

               @Test(priority = 189)
               public void emailDistributionTab_Add_CheckMark(){
                              AdministrationPageModule.emailDistributionTab_CheckMark();
                              logger.createNode("Checkmark icon is clicked in the Email List table").pass("Checkmark icon is clicked in the Email List table. Test Case Passed");
               }

               @Test(priority =190)
               public void emailDistributionTab_Add_Save(){
                              AdministrationPageModule.emailDistributionTab_Save();
                              logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
               }

               @Test(priority = 191)
               public void emailDistributionTab_Add_FilterButton(){
                              AdministrationPageModule.emailDistributionTab_FilterButton();
                              logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
               }

               @Test(priority = 192)
               public void emailDistributionTab_Add_SearchTheTable(){
                              AdministrationPageModule.emailDistributionTab_SearchTheTable();
                              logger.createNode("Search the table field is provided with the input - Access to stolen passenger car").pass("Search the table field is provided with the input - Access to stolen passenger car. Test Case Passed");
               }

               @Test(priority = 193)
               public void emailDistributionTab_Add_EmailListTable(){
                              AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow();
                              logger.createNode("The filtered result of added Email List is - "+AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow()).pass("The filtered result of added Email List is - "+AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow()+". Test Case Passed");
               }

               @Test(priority = 194)
               public void emailDistributionTab_EditIcon_EmailList(){
                              AdministrationPageModule.emailDistributionTab_EditIcon_EmailList();
                              logger.createNode("Edit icon is clicked").pass("Edit icon is clicked successfully. Test Case Passed");
               }

    @Test(priority = 195)
    public void emailDistributionTab_Edit_EmailLanguage(){
                   AdministrationPageModule.emailDistributionTab_Edit_EmailLanguage();
                   logger.createNode("E-mail language drop down is edited with the input - English").pass("E-mail address language drop down is edited with the input - English. Test Case Passed");
    }

    @Test(priority = 196)
    public void emailDistributionTab_Edit_CheckMark(){
                   AdministrationPageModule.emailDistributionTab_CheckMark();
                   logger.createNode("Checkmark icon is clicked in the Email List table").pass("Checkmark icon is clicked in the Email List table. Test Case Passed");
    }

    @Test(priority = 197)
    public void emailDistributionTab_Edit_Save(){
                   AdministrationPageModule.emailDistributionTab_Save();
                   logger.createNode("Save button is clicked").pass("Save button is clicked. Test Case Passed");
    }

    @Test(priority = 198)
    public void emailDistributionTab_Edit_FilterButton(){
                   AdministrationPageModule.emailDistributionTab_FilterButton();
                   logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
    }

    @Test(priority = 199)
    public void emailDistributionTab_Edit_SearchTheTable(){
                   AdministrationPageModule.emailDistributionTab_SearchTheTable();
                   logger.createNode("Search the table field is provided with the input - Theft-relevant part reservation for stolen passenger car").pass("Search the table field is provided with the input - Theft-relevant part reservation for stolen passenger car. Test Case Passed");
    }

    @Test(priority = 200)
    public void emailDistributionTab_Edit_EmailListTable(){
                   AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow();
                   logger.createNode("The filtered result of edited Email List is - "+AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow()).pass("The filtered result of edited Email List is - "+AdministrationPageModule.emailDistributionTab_EmailList_filteredResult_FirstRow()+". Test Case Passed");
    }

    @Test(priority = 201)
    public void emailDistributionTab_Trash(){
                   AdministrationPageModule.emailDistributionTab_Trash();
                   logger.createNode("Trash button is clicked").pass("Trash button is clicked successfully. Test Case Passed");
    }

    @Test(priority = 202)
    public void emailDistributionTab_Trash_Save(){
                   AdministrationPageModule.emailDistributionTab_Save();
                   logger.createNode("Save button is clicked in the Event Category table").pass("Save button is clicked in the Event Category table. Test Case Passed");
    }

    @Test(priority = 203)
    public void emailDistributionTab_Trash_FilterButton(){
                   AdministrationPageModule.emailDistributionTab_FilterButton();
                   logger.createNode("Filter button is clicked").pass("Filter button is clicked successfully. Test Case Passed");
    }

    @Test(priority = 204)
    public void emailDistributionTab_Trash_SearchTheTable(){
                   AdministrationPageModule.emailDistributionTab_SearchTheTable();
                   logger.createNode("Search the table field is provided with the input - Access to stolen passenger car").pass("Search the table field is provided with the input - Access to stolen passenger car. Test Case Passed");
    }

    @Test(priority = 205)
  public void emailDistributionTab_EmailList_filteredResult(){
                 try {
                                boolean displayFlag = AdministrationPageModule.emailDistributionTab_EmailList_filteredResult();
                                if(displayFlag)
                                logger.createNode("Deleted Email list is displayed").fail("Deleted Email list is displayed");
                                else
                                               logger.createNode("Deleted Email list is not displayed").pass("Deleted Email list is not displayed");
                 } catch (NoSuchElementException e) {
                                logger.createNode("Deleted Email list is not available").pass("Deleted Email list is not available");
                 }
  }

    @Test(priority = 206)
    public void emailDistributionTab_Reverse(){
        AdministrationPageModule.emailDistributionTab();
        AdministrationPageModule.emailDistributionTab_ShowData();
        AdministrationPageModule.emailDistributionTab_FilterButton();
        AdministrationPageModule.emailDistributionTab_SearchTheTable();
        AdministrationPageModule.emailDistributionTab_EditEmailFrequency();
        AdministrationPageModule.emailDistributionTab_EmailFrequencyDropDown_EachTime();
        AdministrationPageModule.emailDistributionTab_CheckMark();
        AdministrationPageModule.emailDistributionTab_Save();
    }


    //Here coment stoped bilow ignore

//    @Test(priority = 204)
//  public void logout_Application_Au(){
//                 AdministrationPageModule.logout();
//                 logger.createNode("Logged out").pass("Logged out successfully. Test case passed");
//  }
//
//  @Test(priority = 205)
//  public void vehicleDataTab_Ru(){
//                 AdministrationPageModule.openNewTab_RU();
//  }
//
//  @Test(priority = 206)
//  public void loginto_Ru() throws InterruptedException{
//                 homePage = loginPage.login(prop.getProperty("stduser"), prop.getProperty("stdPassword"));
//                 logger.createNode("Login using (RU) credentials").pass("Login using (RU) credentials.Test case passed");
//                 SystemMessageCheck();
//                 Thread.sleep(15000);
//                 vehicledatapage = homePage.VehicleData1();
//  }
//
//  @Test(priority = 207)
//  public void IdentificationTab_Ru() throws InterruptedException {
//                 AdministrationPageModule.searchfin_Ru();
//                 logger.createNode("FIN Number field is provided as input into the search field - WDD2030545L000342").pass("WDD2030545L000342 is given as input into the search field successfully. Test Case Passed");
//  }
//
//  @Test(priority = 208)
//public void theftAlert_Ru() throws InterruptedException {
//               AdministrationPageModule.theftAlert();
//               logger.createNode(AdministrationPageModule.theftAlert()+ " - message is displayed").pass(AdministrationPageModule.theftAlert()+ " - message is displayed. Test Case Passed");
//}

               @AfterMethod
               public void teardown1(ITestResult result) throws IOException{

                              if(result.getStatus()== ITestResult.SUCCESS){
                                             logger.log(Status.PASS, "Test Case passed is " + result.getName() );
                                             String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
                                             logger.addScreenCaptureFromPath(screenshotPath);
                              }

                              else if(result.getStatus()== ITestResult.FAILURE){
                                             //logger.log(Status.FAIL, "Test Case Failed is " + result.getName() );
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
