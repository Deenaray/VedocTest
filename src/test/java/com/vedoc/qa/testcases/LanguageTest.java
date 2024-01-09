package com.vedoc.qa.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LanguagePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class LanguageTest extends TestBase {

	HomePage homePage;
	LoginPage loginPage;
	VehicleDataPage_S vehicledataPage;
	LanguagePage languagePage;

	public LanguageTest() {
		super();
	}

	@BeforeTest
	public void setUp() {

		initialization();
		loginPage = new LoginPage();
		vehicledataPage = new VehicleDataPage_S();
		languagePage = new LanguagePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		SystemMessageCheck();
		vehicledataPage = homePage.VehicleData1();
	}

	@Test(priority = 1)
	public void LanguageTest() throws InterruptedException {
			
	 String[] iLanguages=new String[] {"Deutsch","English","French", "Portugues", "Polski", "Dansk","Svenska","Italian","Espanol","Russian","Czech","Chinese","Japanese"}; 
				
	 for(int i=0;i<=iLanguages.length-1;i++) {
		int j=i+1;
		logger = extent.createTest("U002-Language switch test-"+iLanguages[i]+".");
		try {
			logger.info("TC_031");
			WebElement LanguageChange=driver.findElement(By.xpath("//li[@id='language_change']"));
			wait.until(ExpectedConditions.elementToBeClickable(LanguageChange));
			Thread.sleep(5000);
			LanguageChange.click();
			Thread.sleep(5000);
			WebElement LanguageSelect=driver.findElement(By.xpath("(//table[@id='masterDataLanguage']/tbody/tr)["+j+"]"));
			wait.until(ExpectedConditions.elementToBeClickable(LanguageSelect));
			Thread.sleep(5000);
			LanguageSelect.click();
			Thread.sleep(5000);
			WebElement savelang=driver.findElement(By.xpath("//span[@class='sym rc-i-line-check ']"));
			savelang.click();
			Thread.sleep(10000);
	//		languagePage.SelectFrenchLang();
			String identificationtab=languagePage.encode(languagePage.IdentificationTab());
			String MajorAssembliesTab=languagePage.encode(languagePage.MajorAssembliesTab());
			String CodesTab=languagePage.encode(languagePage.CodesTab());
			String SAANumTab=languagePage.encode(languagePage.SaaNumbersTab());
			String VPDSerialNoTab=languagePage.encode(languagePage.VPDSerialTab());
			String ControlUnitsTab=languagePage.encode(languagePage.ControlUnitsTab());
			String TheftRelevantDataTab=languagePage.encode(languagePage.TheftDataTab());
			String NavigationTab=languagePage.encode(languagePage.NavigationTab());
			String FOTextsTab=languagePage.encode(languagePage.FOTab());
			String HistoryTab=languagePage.encode(languagePage.HistoryTab());
			String DataValidationTab=languagePage.encode(languagePage.DataValidationTab());
			String TheftMessageTab=languagePage.encode(languagePage.TheftMessageTab());
			String SalesDataTab=languagePage.encode(languagePage.SalesDataTab());
			String CertificationTab=languagePage.encode(languagePage.CertificationTab());
			String ModelPlateTab=languagePage.encode(languagePage.ModelPlateTab());
			String EquipmentTab=languagePage.encode(languagePage.EquipmentTab());
			String BodiesTab=languagePage.encode(languagePage.BodiesTab());
			String PlantTextsTab=languagePage.encode(languagePage.PlantTextsTab());
			String InternalTextsTab=languagePage.encode(languagePage.InternalTextsTab());
			String TechnicalAdviceTextsTab=languagePage.encode(languagePage.TechnicalAdviceTextsTab());
			String InternalTab=languagePage.encode(languagePage.InternalTab());
			String OrdersOfTheftRelevantPartTab=languagePage.encode(languagePage.OrdersOfTheftRelevantPartsTab());
			String LoggingTab=languagePage.encode(languagePage.LoggingTab());
				
			String identificationexpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Identification"));
			String MajorAssembliesExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"MajorAssemblies"));
			String CodesExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Codes"));
			String SAANumExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"SAANum"));
			String VPDSerialNoExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"VPDSerialNo"));
			String ControlUnitsExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"ControlUnits"));
			String TheftRelevantDataExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"TheftRelevantData"));
			String NavigationExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Navigation"));
			String FOTextsExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"FOTexts"));
			String HistoryExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"History"));
			String DataValidationExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"DataValidation"));
			String TheftMessageExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"TheftMessage"));
			String SalesDataExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"SalesData"));
			String CertificationExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Certification"));
			String ModelPlateExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"ModelPlate"));
			String EquipmentExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Equipment"));
			String BodiesExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Bodies"));
			String PlantTextsExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"PlantTexts"));
			String InternalTextsExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"InternalTexts"));
			String TechnicalAdviceTextsExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"TechnicalAdviceTexts"));
			String InternalExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Internal"));
			String OrdersOfTheftRelevantPartExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"OrdersOfTheftRelevantPart"));
			String LoggingExpected=languagePage.encode(prop.getProperty(iLanguages[i]+"Logging"));
			
//			ExtentTest node=logger.createNode("identificationtab");
			
			System.out.println(iLanguages[i]+"----"+TheftMessageTab+"  and  "+TheftMessageExpected);
			System.out.println(iLanguages[i]+"----"+SalesDataTab+"  and  "+SalesDataExpected);
		
			
			if (identificationtab.equalsIgnoreCase(identificationexpected)) {
				logger.createNode("identificationtab").pass(identificationtab+" is the translated text.");
			} else {
				logger.createNode("identificationtab").fail(identificationexpected+" should be the translated text.");
			}
			if(MajorAssembliesTab.equalsIgnoreCase(MajorAssembliesExpected)){
				logger.createNode("MajorAssembliesTab").pass(MajorAssembliesTab+" is the translated text.");
			} else {
				logger.createNode("MajorAssembliesTab").fail(MajorAssembliesExpected+" should be the translated text.");
			}
			if(CodesTab.equalsIgnoreCase(CodesExpected)){
				logger.createNode("CodesTab").pass(CodesTab+" is the translated text.");
			} else {
				logger.createNode("CodesTab").fail(CodesExpected+" should be the translated text.");
			}
			if(SAANumTab.equalsIgnoreCase(SAANumExpected)){
				logger.createNode("SAANumTab").pass(SAANumTab+" is the translated text.");
			} else {
				logger.createNode("SAANumTab").fail(SAANumExpected+" should be the translated text.");
			}
			if(VPDSerialNoTab.equalsIgnoreCase(VPDSerialNoExpected)){
				logger.createNode("VPDSerialNoTab").pass(VPDSerialNoTab+" is the translated text.");
			} else {
				logger.createNode("VPDSerialNoTab").fail(VPDSerialNoExpected+" should be the translated text.");
			}
			if(ControlUnitsTab.equalsIgnoreCase(ControlUnitsExpected)){
				logger.createNode("ControlUnitsTab").pass(ControlUnitsTab+" is the translated text.");
			} else {
				logger.createNode("ControlUnitsTab").fail(ControlUnitsExpected+" should be the translated text.");
			}
			if(TheftRelevantDataTab.equalsIgnoreCase(TheftRelevantDataExpected)){
				logger.createNode("TheftRelevantDataTab").pass(TheftRelevantDataTab+" is the translated text.");
			} else {
				logger.createNode("TheftRelevantDataTab").fail(TheftRelevantDataExpected+" should be the translated text.");
			}
			if(NavigationTab.equalsIgnoreCase(NavigationExpected)){
				logger.createNode("NavigationTab").pass(NavigationTab+" is the translated text.");
			} else {
				logger.createNode("NavigationTab").fail(NavigationExpected+" should be the translated text.");
			}
			if(FOTextsTab.equalsIgnoreCase(FOTextsExpected)){
				logger.createNode("FOTextsTab").pass(FOTextsTab+" is the translated text.");
			} else {
				logger.createNode("FOTextsTab").fail(FOTextsExpected+" should be the translated text.");
			}
			if(HistoryTab.equalsIgnoreCase(HistoryExpected)){
				logger.createNode("HistoryTab").pass(HistoryTab+" is the translated text.");
			} else {
				logger.createNode("HistoryTab").fail(HistoryExpected+" should be the translated text.");
			}
			if(DataValidationTab.equalsIgnoreCase(DataValidationExpected)){
				logger.createNode("DataValidationTab").pass(DataValidationTab+" is the translated text.");
			} else {
				logger.createNode("DataValidationTab").fail(DataValidationExpected+" should be the translated text.");
			}
			if(TheftMessageTab.equalsIgnoreCase(TheftMessageExpected)){
				logger.createNode("TheftMessageTab").pass(TheftMessageTab+" is the translated text.");
			} else {
				logger.createNode("TheftMessageTab").fail(TheftMessageExpected+" should be the translated text.");
						}
			if(SalesDataTab.equalsIgnoreCase(SalesDataExpected)){
				logger.createNode("SalesDataTab").pass(SalesDataTab+" is the translated text.");
			} else {
				logger.createNode("SalesDataTab").fail(SalesDataExpected+" should be the translated text.");
			}
			if(CertificationTab.equalsIgnoreCase(CertificationExpected)){
				logger.createNode("CertificationTab").pass(CertificationTab+" is the translated text.");
			} else {
				logger.createNode("CertificationTab").fail(CertificationExpected+" should be the translated text.");
			}
			if(ModelPlateTab.equalsIgnoreCase(ModelPlateExpected)){
				logger.createNode("ModelPlateTab").pass(ModelPlateTab+" is the translated text.");
			} else {
				logger.createNode("ModelPlateTab").fail(ModelPlateExpected+" should be the translated text.");
		    }
			if(EquipmentTab.equalsIgnoreCase(EquipmentExpected)){
				logger.createNode("EquipmentTab").pass(EquipmentTab+" is the translated text.");
			} else {
				logger.createNode("EquipmentTab").fail(EquipmentExpected+" should be the translated text.");
			}
			if(BodiesTab.equalsIgnoreCase(BodiesExpected)){
				logger.createNode("BodiesTab").pass(BodiesTab+" is the translated text.");
			} else {
				logger.createNode("BodiesTab").fail(BodiesExpected+" should be the translated text.");
			}
			if(PlantTextsTab.equalsIgnoreCase(PlantTextsExpected)){
				logger.createNode("PlantTextsTab").pass(PlantTextsTab+" is the translated text.");
			} else {
				logger.createNode("PlantTextsTab").fail(PlantTextsExpected+" should be the translated text.");
			}
			if(InternalTextsTab.equalsIgnoreCase(InternalTextsExpected)){
				logger.createNode("InternalTextsTab").pass(InternalTextsTab+" is the translated text.");
			} else {
				logger.createNode("InternalTextsTab").fail(InternalTextsExpected+" should be the translated text.");
			}
			if(TechnicalAdviceTextsTab.equalsIgnoreCase(TechnicalAdviceTextsExpected)){
				logger.createNode("TechnicalAdviceTextsTab").pass(TechnicalAdviceTextsTab+" is the translated text.");
			} else {
				logger.createNode("TechnicalAdviceTextsTab").fail(TechnicalAdviceTextsExpected+" should be the translated text.");
			}
			if(InternalTab.equalsIgnoreCase(InternalExpected)){
				logger.createNode("InternalTab").pass(InternalTab+" is the translated text.");
			} else {
				logger.createNode("InternalTab").fail(InternalExpected+" should be the translated text.");
			}
			if(OrdersOfTheftRelevantPartTab.equalsIgnoreCase(OrdersOfTheftRelevantPartExpected)){
				logger.createNode("OrdersOfTheftRelevantPartTab").pass(OrdersOfTheftRelevantPartTab+" is the translated text.");
			} else {
				logger.createNode("OrdersOfTheftRelevantPartTab").fail(OrdersOfTheftRelevantPartExpected+" should be the translated text.");
			}
			if(LoggingTab.equalsIgnoreCase(LoggingExpected)){
				logger.createNode("LoggingTab").pass(LoggingTab+" is the translated text.");
			} else {
				logger.createNode("LoggingTab").fail(LoggingExpected+" should be the translated text.");
			}

			
		} catch (NoSuchElementException e) {
			logger.log(Status.PASS, "");
		}
		
			}
	}
		

	@AfterTest
	public void teardown() {
		driver.quit();
	}

}
