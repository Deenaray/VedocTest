package com.vedoc.qa.pages;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.LineNumberReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.vedoc.qa.base.TestBase;
import junit.framework.Assert;

public class VehicleDataPage_S extends TestBase{

	//Page Factory (or) Object Repository of Vehicle Data Page
	
	public int saaNumber1 =50585372;
	public int saaNumber2 =50581321;
	public int saaNumber3 =50585382;
	public int saaNumber4 =50585339;
	public String invalidsaaNumber = "50623936L";


	@FindBy(xpath="//input[@list='localSearchAutoComplete']")
	WebElement searchInput;
	
	@FindBy(name="vehicleSearchCategory")
	WebElement SearchCategory;
	
	@FindBy(xpath="//button[starts-with(@id,'VehicleSearch')]")
	WebElement searchButton;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.fin')]")
	WebElement fin;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.vin')]")
	WebElement vin;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.productSeries.brand')]")
	WebElement brand;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.productSeries.category')]")
	WebElement category;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind-html,'viewDataObject.vehicleModelDesignation.designation.requestedText')]")
	WebElement VehicleModel;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.cvVehicleType')]")
	WebElement CustomizedVehicleType;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.orderNumber')]")
	WebElement OrderNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.productionNumber')]")
	WebElement ProductionNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.cvBodyType')]")
	WebElement BodyTypeNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.plant')]")
	WebElement ProductionPlant;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductDate.shipmentDate')]")
	WebElement ShipmentDate;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.status')]")
	WebElement Status;
	
	
	/*Major Assembly Tab*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleMajorAssembliesArrangement.visible')]")
	WebElement MajorAssmeblyTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.id')]")
	WebElement EngineNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.objectNumberVariant')]")
	WebElement Engine_VariantNumber;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.objectNumber')])[2]")
	WebElement Engine_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.afterTreatmentSystem.id')]")
	WebElement Exhaust_afterTreatment;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.afterTreatmentSystem.objectNumberVariant')]")
	WebElement Exhaust_afterTreatment_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.afterTreatmentSystem.objectNumber')])[2]")
	WebElement Exhaust_afterTreatment_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.id')]")
	WebElement Transmission;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.objectNumberVariant')]")
	WebElement Transmission_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.objectNumber')])[2]")
	WebElement Transmission_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Front_Axle1;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Front_Axle_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Front_Axle_ObjectNumber;
	   
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front2(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Front_Axle2;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front2(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Front_Axle2_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_front2(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Front_Axle2_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front3(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Front_Axle3;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front3(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Front_Axle3_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_front3(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Front_Axle3_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear1(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Rear_Axle1;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear1(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Rear_Axle1_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_rear1(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Rear_Axle1_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear2(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Rear_Axle2;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear2(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Rear_Axle2_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_rear2(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Rear_Axle2_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear3(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Rear_Axle3;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_rear3(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Rear_Axle3_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_rear3(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Rear_Axle3_ObjectNumber;
		
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.cab.id | dPattern')]")
	WebElement Body;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.pallet')]")
	WebElement Platform;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.retarder')]")
	WebElement Retarder;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.steeringInfoId')]")
	WebElement Steering;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.VehicleMajorAssembly_023')]")
	WebElement AlternativeDrive;
	
	@FindBy(name="fVehicleMajorAssembly_023")
	WebElement AlternativeDrive_Content;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.VehicleMajorAssembly_031')]")
	WebElement ThirdParty_MajorAssemblies;
	
	@FindBy(id="tpMajAssyTable")
	WebElement ThirdParty_MajorAssemblies_Content;
	//VIAGARW
	@FindBy(xpath="//span[text()='Exchange or remove major assembly']")
	WebElement ExchangeOrRemoveMajorAssemblies;
	
	@FindBy(xpath="//button[contains(@data-ng-if,'viewControl.groups.fieldEditButtons')][2]")
	WebElement EditEngineMajorAssemblies_Icon;
	
	@FindBy(xpath="//span[text()='Reposition major assembly']")
	WebElement RepositionOfMejorassembly;
	
	@FindBy(xpath="//input[@name='engineId']")
	WebElement EditEngineMajorAssemblies;
	
	@FindBy(xpath="//input[@name='vehicle_AS_engine_objectNumber']")
	WebElement EditEngine_ObjectNoMajorAssemblies;
	/* Codes Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleCodesArrangement.visible')]")
	WebElement CodesTab;
	
	@FindBy(xpath="//button[@data-ng-click='addCode($event)']")
	WebElement AddCode_button;
	
	@FindBy(name="consolidatedProductData_equipmentCode_code")
	WebElement AddCode_text;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement AddCode_Save;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'hideDesignation($event)')]")
	WebElement HideDesignation_button;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'showDesignation($event)')]")
	WebElement ShowDesignation_button;
	
	@FindBy(xpath="//th[@data-path='consolidatedProductData.equipmentCode.code']/div/a[contains(@data-ng-click,'codeTable')]")
	WebElement Sort;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'resetSorting($event)')]")
	WebElement ResetSorting;
	
	/* SAA Numbers Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleSaaArrangement.visible')]")
	WebElement SAA_numbers_Tab;
	
	@FindBy(xpath="//input[starts-with(@data-ng-model,'viewControl.dgTableSaa_selectAll')]")
	WebElement DesignationTable;
	
	@FindBy(xpath="//tr[starts-with(@data-ng-repeat,'dgTableSaa_rec in viewControl.designGroup')]")
	WebElement FirstElement_FromEngineCaseID;
	
	@FindBy(xpath="//img[@class='img-brand-black']")
	WebElement Benz_logo;
	
	@FindBy(xpath="//input[contains(@data-ng-model,'viewControl.dgTableSaa_selectAll')]")
	WebElement AllContentofDesignationTable;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'showGraveyardSaa($event)')]")
	WebElement showSAAGraveyard;
	
	@FindBy(xpath="//span[text()='SAA designation']")
	WebElement graveyardSAANumbers_Sort;
	
	@FindBy(xpath="//*[@id='saaTable']//following::th[7]/span/button")
	WebElement graveyardSAANumbers_Export;
	
	@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.consolidatedProductData.saa)')]")
	WebElement graveyardSAANumbers_totalRecords;
	
	/* VPD and Serial Number Tab of Vehicle Data Module*/
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleVpdArrangement.visible')]")
	WebElement VPD_SerialNumberTab;
	
	@FindBy(xpath="//button[@data-ng-click='addVpd($event)']")
	WebElement VPD_AddVPD_button;
	
	@FindBy(name="vehicle_activeAssignedFpd_vpd_vpdIdent")
	WebElement VPD_AddVPD_text;
	
	@FindBy(name="vehicle_activeAssignedFpd_vpd_content")
	WebElement VPD_AddContent;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement VPDCode_Save;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.Vpd_vpdIdent')]")
	WebElement VPD_sorting;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'toggleFilter')])[4]")
	WebElement VPD_FilterButton;
	
	@FindBy(xpath="//input[starts-with(@placeholder,'Search the table')]")
	WebElement VPD_SearchVPD;
	
	
	/* Control Unit Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleControlUnitArrangement.visible')]")
	WebElement ControlUnitTab;
	
	@FindBy(xpath="//a[contains(@data-ng-click,'partsGroup.designation.requestedText')]")
	WebElement ControlUnitTab_sort;
	
	@FindBy(xpath="//*[@id='VehicleControlUnits_201']/div/div[2]/form/div[1]/div/button[3]")
	WebElement ControlUnitTab_ResetSort;
	
	@FindBy(xpath="//*[@id='VehicleControlUnits_201']/div/div[2]/form/div[1]/div/button[2]")
	WebElement ControlUnitTab_FilterButton;
	
	@FindBy(xpath="//input[contains(@input-binding,'controlUnitTable_filterExpression')]")
	WebElement ControlUnitTab_FilterText;
	
	@FindBy(xpath="//*[@id='VehicleControlUnits_201']/div/div[2]/form/div[1]/div/button[2]")
	WebElement ControlUnitTab_CancelFilter;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'showControlUnitOverview')]")
	WebElement ControlUnitTab_arrowButton;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]/td[5]/span")
	WebElement ControlUnitTab_IDCode;
	
	@FindBy(xpath="//*[@id='cuTable']/tbody/tr[1]/td[1]/span")
	WebElement ControlUnitTab_NewWindow;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.afterTreatmentSystem.id')]")
	WebElement EATNumber;
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[2]/td[2]")
	WebElement PARControlUnit;
	@FindBy(xpath="//*[@id='reservationTable']/tbody/tr[1]")
	WebElement OrdersOfTheftRelevantParts_OrderingInfo;
	String ActualIdCode;
	String parentwindowID;
	String childwindowID;
	String childwindowID2;
	
	//VIAGARW
	/* X Functions Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//a[text()='X functions']")
	WebElement XFunctionsTab;
	
	@FindBy(name="randomNumber")
	WebElement FourCharacterNumber;
	
	@FindBy(xpath="//input[contains(@name,'idCode')]")
	WebElement IDCode;
	
	@FindBy(xpath="//select[contains(@name,'calculationType')]")
	WebElement CalculationType;
	
	@FindBy(xpath="//input[@name='numberOfKeys']")
	WebElement xfunction_NumberofKeys;
	
	@FindBy(xpath="//input[@name='keyTransponderCode']")
	WebElement xfunction_Transponder;
	
	@FindBy(xpath="//input[@name='checksum']")
	WebElement xfunction_Checksum;
	
	@FindBy(xpath="//input[@name='cu1DataRecord']")
	WebElement xfunction_Datarecord;
	
	@FindBy(xpath="//input[@name='cu1DrawingAndGeometryStatus']")
	WebElement xfunction_DrawingAndGeometry;
	
	@FindBy(xpath="//input[@name='cu1Version']")
	WebElement xfunction_Version1;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'generate($event)')]")
	WebElement GenerateNumberButton;

	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.encryptedRandomNumber')]")
	WebElement RandomNumberGenerated;

	@FindBy(xpath="//button[contains(@data-ng-click,'reset($event)')]")
	WebElement ResetEntryButton;
	
	@FindBy(xpath="//span[contains(@class,'ura_icon rc-i-line-support')]")
	WebElement Feedback;
	
	@FindBy(xpath="//span[contains(@class,'xsf_header__subtitle')]")
	WebElement SubTitle;
	
	@FindBy(xpath="//div[contains(@class,'btntextdiv')]")
	WebElement dropdown;

	/* Theft Relevant Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleTheftRelevantDataArrangement.visible')]")
	WebElement TheftRelevantTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.lockingSystem.type')]")
	WebElement TheftRelevantTab_LockType;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.radio.radioId')]")
	WebElement TheftRelevantTab_RadioNumber;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'showActiveProduct')]")
	WebElement MajorAssemblyData_arrowButton;
	
	/* History Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.ProductHistoryArrangement.visible')]")
	WebElement HistoryTab;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'showExcludedEntries($event)')]")
	WebElement HistoryTab_TechnicalEntryButton;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'showModificationsOfAssignedObjects($event)')]")
	WebElement HistoryTab_HistoryOfDependentObject_button;
	
	@FindBy(xpath="//button[@data-ng-click='showFirstState($event)']")
	WebElement HistoryTab_InitialStateButton;
	
	@FindBy(xpath="//button[@data-ng-click='showCurrentState($event)']")
	WebElement HistoryTab_CurrentStateButton;
	
	/* Sales Data Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleSalesDataArrangement.visible')]")
	WebElement SalesDataTab;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.orderNumber')])[2]")
	WebElement SalesDataTab_OrderNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.dateOfTechnicalState')]")
	WebElement SalesDataTab_TechnicalState;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductDate.shipmentDate')])[2]")
	WebElement SalesDataTab_InitialRegistrationTab;
	
	/* Certification Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleCertificationArrangement.visible')]")
	WebElement CertificationTab;

	@FindBy(xpath = "//*[@id='VehicleCertification_120']/div/div[2]/form")
	WebElement Certification_content;

	@FindBy(xpath = "//*[@id='VehicleCertification_130']/div/div[2]")
	WebElement series_product_aproval_contests;
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.cocNumber')]")
	WebElement CertificationTab_DocumentKey;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.brand')]")
	WebElement CertificationTab_Brand;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.fuel')]")
	WebElement CertificationTab_Fuel;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.variant')]")
	WebElement CertificationTab_Variant;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.salesDesignation')]")
	WebElement CertificationTab_SalesDesignation;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.cocModelPlate.cubicCapacityCcm')]")
	WebElement CertificationTab_Displayment;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.version')]")
	WebElement CertificationTab_Version;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.hsn')]")
	WebElement CertificationTab_ManufacturerCode;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.cocModelPlate.power')]")
	WebElement CertificationTab_OutputKW;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.egPermitNumber')]")
	WebElement CertificationTab_EUapprovalNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.typeModelCode')]")
	WebElement CertificationTab_IndexOfModelCodes;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.egPermitDate')]")
	WebElement CertificationTab_EUaprovalDate;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.consumptionData.fuelGasPolicy')]")
	WebElement CertificationTab_ExhaustGuidelines;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.emissionClass')]")
	WebElement CertificationTab_EmissionsStandards;
	
	@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.VehicleCertificationTires_137.visible')]")
	WebElement CertificationTab_TiresTab;
	
	/* Model Plate Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//a[(text()='Model plate')]")
	WebElement ModelPlateTab;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.vehicleWeightKg')]")
	WebElement ModelPlateTab_PermGrossVehicleWeight;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.combinedWeightKg')]")
	WebElement ModelPlateTab_PermGrossCombWeight;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg1')]")
	WebElement Permissible_axle_loadAxle1;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg2')]")
	WebElement Permissible_axle_loadAxle2;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg3')]")
	WebElement Permissible_axle_loadAxle3;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg4')]")
	WebElement Permissible_axle_loadAxle4;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg5')]")
	WebElement Permissible_axle_loadAxle5;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleLoadKg6')]")
	WebElement Permissible_axle_loadAxle6;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleGroupLoadKg1')]")
	WebElement Permissible_loadof_Axlegroup1;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleGroupLoadKg2')]")
	WebElement Permissible_loadof_Axlegroup2;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleGroupLoadKg3')]")
	WebElement Permissible_loadof_Axlegroup3;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.axleGroupLoadKg4')]")
	WebElement Permissible_loadof_Axlegroup4;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.objectNumber')]")
	WebElement Object_no_modelplate;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.cocData.egPermitNumber')]")
	WebElement EUapprovalnumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.vehicleType')]")
	WebElement ModelDesignation;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.productionYear')]")
	WebElement ProductionYear;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.productionMonth')]")
	WebElement ProductionMonth;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.lowBeamLightBundle')]")
	WebElement LowBeamLightBundle;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_paint1(viewDataObject.vehicle.activeState.paint).code')]")
	WebElement PaintBottom;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeModelPlate.dieselSmokeCoefficient')]")
	WebElement DieselSmokeCoefficient;
	/* Equipment Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//*[@id=\"VehicleArrangement\"]/div[2]/div[2]/div/div/ul/li[19]")
	WebElement EquipmentTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.Paint_usage')]")
	WebElement EquipmentTab_PaintsTable;
	
	@FindBy(xpath="(//a[contains(@data-ng-click,'tireTable_110')])[2]")
	WebElement EquipmentTab_TiresTable;
	
	/* Electrical Variants of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleElectroVariantArrangement.visible')]")
	WebElement ElectricalVariantsTab;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_Variant')]")
    List<WebElement> ElectricalVariantsTabContents;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.electroVariantDesignation')]")
	WebElement ElectricalVariantDesignation;
	
	/* Technical Data Tab of Vehicle Data Module*/
	
	@FindBy (xpath="//li[@data-ng-show='viewControl.VehicleTechnicalDataArrangement.visible']")
	WebElement TechnicalData_Tab;
	
	@FindBy(xpath="//span[@data-ng-bind='viewDataObject.vehicle.activeState.technicalData.correction']")
	WebElement TechnicalData_Tab_SpeedometerCorrectionValue;
	
	@FindBy(xpath="//span[@data-ng-bind='viewDataObject.vehicle.activeState.technicalData.impulsValue']")
	WebElement TechnicalData_Tab_PulseValue;
	
	/* Plant Text Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[@data-ng-show='viewControl.VehiclePlantTextArrangement.visible']")
	WebElement PlantTextTab;
	
	@FindBy(xpath="//*[@id=\"prodOrderTextTable\"]/thead/tr/th[2]/div[1]/a")
	WebElement PlantTextTabSort;
	
	/* Internal Text Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleInternalTextArrangement.visible')]")
	WebElement InternalTextTab;
	
	@FindBy(xpath="//*[@id=\"internalTextTable\"]/thead/tr/th[2]/div[1]/a")
	WebElement InternalTexttab_Sort;
	
	/* Factory Addition Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleAdditionalPlantInformationArrangement.visible')]")
	WebElement FactoryAdditionTab;
	
	@FindBy(xpath="//*[@id=\"additionalPlantInfo\"]/thead/tr/th[3]/div[1]/a")
	WebElement FactoryAdditionTab_Sort;
	
	/* Logging Tab of Vehicle Data Module*/
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.ProductLogArrangement.visible')]")
	WebElement LoggingTab;
	
	@FindBy(id="AccessLogging_380_search")
	WebElement LoggingTab_SearchButton;
	
	@FindBy(xpath="//*[@id='accessLog']/thead/tr/th[5]/div[1]/a")
	WebElement LoggingTab_Sort;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editVehicleHeadData')]")
	WebElement Edit_Basic_Data;
	
	@FindBy(name="vehicle_AS_orderNumber")
	WebElement OderNumber_Edit;
	
	@FindBy(name="vehicle_AS_vin")
	WebElement VinNumberEdit;
	
	@FindBy(name="vehicle_AS_productionNumber")
	WebElement ProductionNumber_Edit;
	
	@FindBy(xpath="//form[@name='fVehicleSearchFoot_000']//button[@data-ng-click='save($event)']")
	WebElement Save_Changes;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editStamping')]")
	WebElement FIN_Stamping_Button;
	
	@FindBy(name="vehicle_AS_finStamping")
	WebElement Fin_Stamping_Checkbox;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'modifyVehicleType')]")
	WebElement Edit_VehicleType_button;
	
	@FindBy(name="vehicle_AS_cvVehicleType")
	WebElement EditCustomizedVehicleType;
	
	@FindBy(name="vehicle_AS_plant")
	WebElement Edit_ProductionPlant;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'correctMajorAssembly')]")
	WebElement RepositionMajorAssembly_button;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-pencil')])[1]")
	WebElement EngineID_Edit;
	
	@FindBy(name="engineId")
	WebElement EngineID_text;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'afterTreatmentSystemId')])[2]")
	WebElement Exhaust_Aftertreatment_EditButton;
	
	@FindBy(name="afterTreatmentSystemId")
	WebElement Exhaust_Aftertreatment_text;
	
	@FindBy(xpath="//span[contains(@data-ng-bind-html,'save_label')]")
	WebElement Save_Changes_MajorAssemblies;
	
	@FindBy(name="clearingOption")
	WebElement ClearingOption_Button;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'okAction($event)')]")
	WebElement Modal_Dialog_Ok_Button;
	
	@FindBy(xpath="//button[contains(@ng-show,'closeable')]")
	WebElement TechnicalError_Dialog;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'vehicle.activeState.transmission')]")
	WebElement TransmissionEdit_button;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'transmission')])[2]")
	WebElement TransmissionNumber_button;
	
	@FindBy(name="transmissionId")
	WebElement TranimissionNumber_text;
	
	@FindBy(name="vehicle_AS_transmission_objectNumber")
	WebElement Transmission_ObjectNumber_Edit;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-pencil')])[6]")
	WebElement FrontAxle2_Edit;
	
	@FindBy(name="frontAxle2Id")
	WebElement FrontAxle2_text;
	
	@FindBy(name="vehicle_AS_axle_typeOf_front2_objectNumber")
	WebElement FrontAxle2_ObjectNumber_text;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-pencil')])[11]")
	WebElement RearAxle3_Edit;
	
	@FindBy(name="rearAxle3Id")
	WebElement RearAxle3_text;
	
	@FindBy(name="vehicle_AS_axle_typeOf_rear3_objectNumber")
	WebElement RearAxle3_ObjectNumber_text;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-trash')])[8]")
	WebElement RearAxle3_Delete;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-pencil')])[12]")
	WebElement RearAxle4_Edit;
	
	@FindBy(name="rearAxle4Id")
	WebElement RearAxle4_text;
	
	@FindBy(name="vehicle_AS_axle_typeOf_rear4_objectNumber")
	WebElement RearAxle4_ObjectNumber_text;
	
	@FindBy(xpath="(//span[contains(@class,'field-icon rc-i-line-trash')])[8]")
	WebElement RearAxle4_Delete;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.VehicleMajorAssembly_021')]")
	WebElement PlantMajorAssemblies_Tab;
	
	@FindBy(xpath="//span[contains(@data-ng-bind-html,'VehicleMajorAssembly_021')]")
	WebElement PlantMajorAssemblies_Tab_Edit;
	
	@FindBy(name="vehicle_activeProductionInfo_originAfterTreatmentSystemId")
	WebElement PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text;
	
	@FindBy(name="vehicle_activeProductionInfo_originAxleRear4Id")
	WebElement PlantMajorAssemblies_Tab_RearAxle4_text;
	
	@FindBy(name="vehicle_activeProductionInfo_originAxleRear4ObjectNo")
	WebElement PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text;
	
	@FindBy(xpath="//span[contains(@data-ng-bind-html,'VehicleMajorAssembly_023')]")
	WebElement AlternateDrive_EditMajorAssemblies_button;
	
	@FindBy(name="eEngine1Id")
	WebElement ElectricMotorNumber1_text;
	
	@FindBy(xpath="(//span[@class='field-icon rc-i-line-pencil'])[1]")
	WebElement AlternateDrive_EditMajorAssemblies_Editbutton;
	
	@FindBy(name="eEngine1ObjectNumber")
	WebElement ElectricMotorNumber2_text;
	
	@FindBy(xpath="//a[@href='MasterDataArrangement.html']")
	WebElement MasterDataModule;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataVpd_730.visible')]")
	WebElement VPDIDs_Tab;

	@FindBy(xpath="//button[@data-ng-click='showdata($event)']")
	WebElement VPDIDs_ShowButton_Click;
	
	@FindBy(xpath="//button[@data-ng-click='newVPDIdent($event)']")
	WebElement MasterDataModule_CreateVPDID_Code;
	
	@FindBy(name="vpdIdent_id")
	WebElement MasterDataModule_text;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
	WebElement MasterDataModule_SaveCode;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'save($event)')])[2]")
	WebElement MasterDataModule_SaveCode_button;
	
	@FindBy(xpath = "//a[@href='VehicleArrangement.html']")
	WebElement VehicleData;
	
	//SWVARAD
	
			@FindBy(xpath="//span[text()='Add/remove SAA']")
			WebElement addRemoveSaaButton;
			
			
			@FindBy(xpath="//textarea[@name='inputField']")
			WebElement saaData;
			
			@FindBy(xpath="//button[@data-ng-click='addSaas($event)']")
			WebElement go;
			
			@FindBy(xpath="//span[text()='Go to assignment']")
			WebElement goToAssignment;
			
			@FindBy(xpath="//select[starts-with(@data-ng-change,'addedSaaAssignedChanged()')]")
			WebElement usageDropdown;
			
			@FindBy(xpath="//span[text()='Apply']")
			WebElement apply;
			
			@FindBy(xpath="//span[text()='Save']")
			WebElement save;
			
			@FindBy(xpath="//span[text()='rear axle']")
			WebElement rearAxle;
			
			@FindBy(xpath="//th[@data-path='designGroup.designation.requestedText']//a")
			WebElement designable;
			
			@FindBy(xpath="//span[text()='chassis- / sub frame']")
			WebElement chassisSubframe;
			
			@FindBy(xpath="//span[text()='Continue to deletions']//preceding::span[contains(@class,'arrow')]")
			WebElement continueToDeletions;
			
			@FindBy(xpath="//span[text()='Continue to assignments']")
			WebElement continueToAssignments;
					
			@FindBy(xpath="//div[@class='taskbar ng-scope']//*[contains(text(),'SAA')]")
			WebElement saaPlus;
			
			@FindBy(xpath="//button[@data-ng-click='addSaasFromFieldToRemoveList($event)']")
			WebElement remove;
			
			@FindBy(xpath="//tr[@tabindex='0']//div[@class='input-group']//select")
			WebElement firstElement;
			
			@FindBy(xpath="//option[text()='Chassis']")
			WebElement chassis;
			
			@FindBy(xpath="//tr[@tabindex='1']//option[text()='Chassis']")
			WebElement chassisRow2;
			
			@FindBy(xpath="//tr[@tabindex='1']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row2;	
			
			@FindBy(xpath="//tr[@tabindex='2']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row3;	
			
			@FindBy(xpath="//tr[@tabindex='3']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row4;	
			
			@FindBy(xpath="//tr[@tabindex='4']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row5;
			
			@FindBy(xpath="//tr[@tabindex='5']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row6;
			
			@FindBy(xpath="//tr[@tabindex='6']//span[starts-with(@data-ng-bind,'addTable_rec.saa.saaDesignation')]")
			WebElement row7;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[1]")
			WebElement element1;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[2]")
			WebElement element2;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[3]")
			WebElement element3;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[4]")
			WebElement element4;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[5]")
			WebElement element5;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[6]")
			WebElement element6;
			
			@FindBy(xpath="(//select[@data-ng-change='addedSaaAssignedChanged()'])[7]")
			WebElement element7;
			
			@FindBy(xpath="//*[text()='50585372']")
			WebElement checkSaaNumber1;
			
			@FindBy(xpath="//*[text()='50581321']")
			WebElement checkSaaNumber2;
			
			@FindBy(xpath="//*[text()='50585382']")
			WebElement checkSaaNumber3;
			
			@FindBy(xpath="//*[text()='50585339']")
			WebElement checkSaaNumber4;
			
			@FindBy(xpath="//a[text()='Navigation']")
			WebElement navigation;
			
			//VIAGARW 
			@FindBy(xpath="//*[@class='mdsd-alert ng-scope ng-isolate-scope alert alert-dismissible alert-danger']")
			WebElement alertBox;	  	
			
			//"//*[@class='close']//span[@aria-hidden='true']")
			@FindBy(xpath="//*[@class='close']")
			WebElement alertBoxClose;
			
			@FindBy(xpath="//a[text()='Identification']")
			WebElement IdentificationTab;	
			
			@FindBy(xpath="//*[@class='cell-icon rc-i-line-close-circle']")
			WebElement crossIcon;
			
			@FindBy(xpath="//span[text()='Request CoC paper']")
			WebElement CocPaperButton;
			
			@FindBy(xpath="//div[contains(@class,'mdsd-alert ng-scope ng-isolate-scope alert alert-dismissible alert-info')]")
			WebElement InfoAlertMessage;
					
			@FindBy(xpath="//*[@id='VehicleCocRequestConfirmation_130']//following::button")
			WebElement AcceptCoCCapability;
			
			@FindBy(xpath="//*[@class='mdsd-alert ng-scope ng-isolate-scope alert alert-dismissible alert-warning']")
			WebElement alertBoxWarning;	
			
			////span[text()='Yes. Save now.']
			@FindBy(xpath="//button[@ng-click='saveAnyhow()']")
			WebElement AcceptSaveNow;
			
			@FindBy(xpath="//span[text()='Edit document key']")
			WebElement EditDocumentKey;
			
			@FindBy(xpath="//span[text()='Additional approval']")
			WebElement AdditionalApproval;
			
			@FindBy(xpath="/html/body/div/div[2]/div[2]/div[2]/div/div/div/div[17]/div/div/div/div/div/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/ul/li[6]/a")
			WebElement AdditionalApprovalPrintingInformation;
			
			@FindBy(xpath="//*[@id='VehicleCertificationPrintInfo_138']/div/div[2]/form/div[1]/div[4]")
			WebElement AdditionalApprovalPrintMotorInformation;
			
			@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.frontAxleTransmissionNo')]")
			WebElement AllWheelDriveFrontAxleTransmission;	
			
			@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCaseSerialNo')]")
			WebElement AllWheelDriveTransferCaseNo;
			
			//end
			@FindBy(xpath="//table[@id='existingLicences']//tr[@tabindex='0']")
			WebElement existingMapVersionTableData;
			
			@FindBy(xpath="//table[@id='existingLicences']//tr[@tabindex='0']//td[1]")
			WebElement emvMapVersionData;
			
			@FindBy(xpath="//table[@id='existingLicences']//tr[@tabindex='0']//td[2]")
			WebElement emvDvdData;
			
			@FindBy(xpath="//table[@id='existingLicences']//tr[@tabindex='0']//td[3]")
			WebElement emvLicenseData;
			
			@FindBy(xpath="//table[@id='possibleLicences']//tr[@tabindex='0']")
			WebElement possibleMapVersionTableData;
			
			@FindBy(xpath="//table[@id='possibleLicences']//tr[@tabindex='0']//td[1]")
			WebElement pmvMapVersionData;
			
			@FindBy(xpath="//table[@id='possibleLicences']//tr[@tabindex='0']//td[2]")
			WebElement pmvDvdData;
			
			@FindBy(xpath="//table[@id='possibleLicences']//tr[@tabindex='0']//td[3]")
			WebElement pmvLicenseData;
			
			@FindBy(xpath="(//div[@class='fcol'])[2]//span[text()]")
			List<WebElement> navigation1;
			
			@FindBy(xpath="(//div[@class='fcol'])[3]//span[text()]")
			List<WebElement> navigation2;
			
			@FindBy(xpath="(//div[@class='fcol'])[4]//span[text()]")
			List<WebElement> navigation3;
			
			@FindBy(xpath="(//div[@class='fcol'])[5]//span[text()]")
			List<WebElement> navigation4;
			
			@FindBy(xpath="(//div[@class='fcol'])[6]//span[text()]")
			List<WebElement> navigation5;
			
			@FindBy(xpath="(//div[@class='fcol'])[7]//span[text()]")
			List<WebElement> navigation6;
			
			@FindBy(xpath="(//div[@class='fcol'])[8]//span[text()]")
			List<WebElement> navigation7;
			
			@FindBy(xpath="(//div[@class='fcol'])[9]//span[text()]")
			List<WebElement> navigation8;
			
			@FindBy(xpath="(//div[@class='fcol'])[10]//span[text()]")
			List<WebElement> navigation9;
			
			@FindBy(xpath="(//div[@class='fcol'])[11]//span[text()]")
			List<WebElement> navigation10;
			
			@FindBy(xpath="(//div[@id='VehicleHeadUnitNavigationMajorVersions_335']//div[@class='row rowspace'])[2]")
			WebElement navigationcompIdentifierTableData;
			
			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']")
			WebElement informationTableData;
			
			@FindBy(xpath="//table[@id='dgTableFO']//tr[@tabindex='0']")
			WebElement dgTableFOTableData;

			@FindBy(xpath ="//*[@id='VehicleCertification_130']/div/div[2]/form/div[2]/div[2]/span")
			WebElement document_key;

			@FindBy(xpath = "//*[@id='VehicleCertification_120']/div/div[2]/form/div[2]/div[2]")
			WebElement ownership_number;
			@FindBy(xpath="//table[@id='foTable']//tr[@tabindex='0']")
			WebElement foTableData;
			
			@FindBy(xpath="//table[@id='prodOrderTextTable']//tr[@tabindex='0']")
			WebElement prodOptionTableData;
			
			@FindBy(xpath="//table[@id='prodOrderPosTextTable']//tr[@tabindex='0']")
			WebElement prodOrderPosTextTableData;

			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']//td[1]")
			WebElement developmentStatusData;

			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']//td[2]")
			WebElement softwareIdData;
			
			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']//td[3]")
			WebElement majorVersionNoData;
			
			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']//td[4]")
			WebElement minorVersionNoData;
			
			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex='0']//td[5]")
			WebElement regionData;
			
			@FindBy(xpath="//*[@id='possibleLicences']/tbody//tr")
			List<WebElement> fetchRows;
	
			@FindBy(xpath="//a[text()='FO texts']")
			WebElement foTexts;
			
			@FindBy(xpath="//table[@id='dgTableFO']//tr[@tabindex]")
			List<WebElement> dgTableFoFetchRows;
			
			
			@FindBy(xpath="//table[@id='foTable']//tr[@tabindex]")
			List<WebElement> foTableFetchRows;
			
			@FindBy(xpath="//table[@id='existingLicences']//tr[@tabindex]")
			List<WebElement> emvFetchRows;	
			
			@FindBy(xpath="//table[@id='possibleLicences']//tr[@tabindex]")
			List<WebElement> pmvFetchRows;
			
			@FindBy(xpath="//span[text()='Navigation compatibility identifier (Major versions)']//following-sibling::div/div")
			List<WebElement> nciFetchRows;
			
			@FindBy(xpath="//table[@id='MapVersionsTable']//tr[@tabindex]")
			List<WebElement> licenseKeyFetchRows;
			
			@FindBy(xpath="//i[contains(@class,'rc-i-line-warning')]")
			WebElement warningIcon;
			
			@FindBy(xpath="//div[text()='The input field for SAAs to be added contains SAA numbers with the incorrect format.']")
			WebElement addWarningMessage;
			
			@FindBy(xpath="//*[text()='The input field for SAAs to be deleted contains SAA numbers that do not appear in the existing list.']")
			WebElement deleteWarningMessage;
			
			@FindBy(xpath="//a[text()='Plant texts']")
			WebElement plantText;
			
			//VIAGARW		
			@FindBy(xpath="//*[@id='prodOrderTextTable']/tbody/tr[1]/td[4]")
			WebElement modelPlantText;	
			@FindBy(xpath="//*[@id='prodOrderTextTable']/tbody/tr[2]/td[4]")
			WebElement modelPlantText1;
			@FindBy(xpath="//a[contains(@ng-click,'launchPrint()')]")
			WebElement printModelPlantText;	
			
			@FindBy(xpath="//input[contains(@name,'plantTexts')]")
			WebElement selectPlantTexts;
			@FindBy(xpath="//button[contains(@data-ng-click,'okAction($event)')]")
			WebElement okPlantTexts;
			@FindBy(xpath="//a[text()='Logging']")
			WebElement logging;
			@FindBy(id="AccessLogging_380_search")
			WebElement searchLogging;
			@FindBy(xpath="//*[@id='accessLog']/thead/tr/th[9]/button/span")
			WebElement exportLogging;
			@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.logEntry)')]")
			WebElement totalRecordsLogging;
			@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
	    	WebElement dateModified_columnHeader;
			@FindBy(xpath="//table//tbody//tr[1]//td//a")
	    	WebElement getRow1_dateModified;
			@FindBy(xpath="//input[contains(@data-ng-model,'viewControl.dateFrom')]")
			WebElement fromDateLogging;
			@FindBy(xpath="//input[contains(@data-ng-model,'viewControl.dateTo')]")
			WebElement toDateLogging;
			@FindBy(xpath="//button[contains(@data-ng-disabled,'isEmpty() || !listHasData(viewDataObject.logEntry)')]")
			WebElement filterLogging;
			@FindBy(xpath="//input[(@class='form-control')]")
			WebElement searchbarFilterLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[1]/span")
			WebElement accessedTimeLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[2]/span")
			WebElement UserIDLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[3]/span")
			WebElement FirstNameLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[4]/span")
			WebElement LastNameLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[5]/span")
			WebElement accessedTypeLogging;
			@FindBy(xpath="//*[@id='accessLog']/tbody/tr/td[8]/span")
			WebElement accessedDataLogging;
			@FindBy(xpath="//button[contains(@data-ng-disabled,'isEmpty() || !listHasData(viewDataObject.logEntry)')]")
			WebElement cancelFilterLogging;
			@FindBy(xpath="//a[contains(@ng-click,'launchPrint()')]/span")
			WebElement PDFIcon;
			@FindBy(xpath="//input[contains(@name,'vpdId')]")
			WebElement VPDPDF;
			@FindBy(xpath="//input[contains(@name,'controlUnits')]")
			WebElement ControlUnitsPDF;
			@FindBy(xpath="//input[contains(@name,'changeHistory')]")
			WebElement ModificationHistoryPDF;
			@FindBy(xpath="//input[contains(@name,'saaNumbers')]")
			WebElement SAANumbersPDF;
			@FindBy(xpath="//input[contains(@name,'plantTexts')]")
			WebElement PlantTextsPDF;
			@FindBy(xpath="//input[contains(@name,'engineControlUnit')]")
			WebElement EngineControlUnitPDF;
			@FindBy(xpath="//a[contains(text(),'Data validation')]")
			WebElement DataValidationTab;
			@FindBy(xpath="//button[contains(@data-ng-click,'toggleAllOpen($event)')]")
			WebElement DataValidationTab_ShowAllErrors;
			@FindBy(xpath="//*[@id='ruleViolations']//following::button")
			WebElement DataValidationTab_ExportButton;
			@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.validationResult.ruleViolations)')]")
			WebElement DataValidationTab_TotalRecords;
			@FindBy(xpath="//*[@id='ruleViolations']/tbody/tr[2]/td[11]/span/button[2]")
			WebElement DataValidationTab_NavigateIcon;
			@FindBy(xpath="//*[@id='ruleViolations']/tbody/tr[3]/td[7]")
			WebElement DataValidationTab_HighlightRow;
			@FindBy(xpath="//a[contains(@data-ng-disabled,'!viewControl.VehicleSpecificValidationRules_295.enabled')]")
			WebElement DataValidation_ValidationRulesTab;
			@FindBy(xpath="//*[@id='VehicleSpecificValidationRules_295']//following::form/div[1]/div/button")
			WebElement DataValidation_ValidationRulesFilter;
			@FindBy(xpath="//input[contains(@input-binding,'viewControl.ruleTable_filterExpression')]")
			WebElement DataValidation_ValidationRulesFilterInput;
			@FindBy(xpath="//*[@id='ruleTable']//following::th[8]/button")
			WebElement DataValidation_ValidationRulesExport;
			@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.vehicle.vehicleSpecificValidationRules)')]")
			WebElement DataValidation_ValidationRulestotalRecords;
			@FindBy(xpath="//a[contains(@data-ng-disabled,'!viewControl.VpdListComparisonCheckResults_296.enabled')]")
			WebElement DataValidation_VPDComparisonTab;
			@FindBy(xpath="//button[contains(@data-ng-click,'showData($event)')]")
			WebElement DataValidation_VPDComparisonShowData;
			@FindBy(xpath="//*[@id='VpdListComparisonCheckResults_296']//following::form/div[1]/div/button[2]")
			WebElement DataValidation_VPDComparisonFilter;
			@FindBy(xpath="//input[contains(@input-binding,'viewControl.vpdListComparisonCheckResults_filterExpression')]")
			WebElement DataValidation_VPDComparisonFilterInput;
			@FindBy(xpath="//*[@id='vpdListComparisonCheckResults']//following::th[5]/button")
			WebElement DataValidation_VPDComparisonExport;
			@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.vpdListComparisonCheckResult)')]")
			WebElement DataValidation_VPDComparisonTotalRecords;
			@FindBy(xpath="//a[text()='Factory addition']")
			WebElement factoryAdditionTab;
			@FindBy(xpath="//*[@id='VehicleAdditionalPlantInformation_065']//following::div/button")
			WebElement factoryAdditionFilter;
			@FindBy(xpath="//input[contains(@input-binding,'viewControl.additionalPlantInfo_filterExpression')]")
			WebElement factoryAdditionFilterInput;
			@FindBy(xpath="//*[@id='additionalPlantInfo']//following::th[5]/button")
			WebElement factoryAdditionExport;
			@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.additionalPlantInformation)')]")
			WebElement factoryAdditionTotalRecords;
			//over	
			@FindBy(xpath="//span[@class='sub_icon rc-i-line-engine']")
			WebElement majorAssembly;
			@FindBy(xpath="//span[@class='sub_icon rc-i-line-car']")
			WebElement vehicleData;
			@FindBy(xpath="//table[@id='prodOrderTextTable']//tr[@tabindex]")
			List<WebElement> prodOrderFetchRows;
			@FindBy(xpath="//table[@id='prodOrderPosTextTable']//tr[@tabindex]")
			List<WebElement> prodOrderPosFetchRows;
			@FindBy(xpath="//table[@id='dgTableFO']//span[text()='DG']")
			WebElement dg;
			
			@FindBy(xpath="//table[@id='dgTableFO']//th[@class='selection-column']")
			WebElement checkbox_dgTableFO;
			
			@FindBy(xpath="//span[text()='Show expanded view']")
			WebElement showExpandedView;
			
			@FindBy(xpath="//div[@id='VehicleHeadUnitNavigationMajorVersions_335']//span[@class='sym rc-i-line-pencil ']")
			WebElement editMajorVersionsIcon;
			
			@FindBy(xpath="//span[text()='Edit major versions']")
			WebElement editMajorVersions;

			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[1]")
			WebElement majorVersions1;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[2]")
			WebElement majorVersions2;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[3]")
			WebElement majorVersions3;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[4]")
			WebElement majorVersions4;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[5]")
			WebElement majorVersions5;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[6]")
			WebElement majorVersions6;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[7]")
			WebElement majorVersions7;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[8]")
			WebElement majorVersions8;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[9]")
			WebElement majorVersions9;
			
			@FindBy(xpath="(//div[@class='fcol']//div[@class='input-group']//input)[10]")
			WebElement majorVersions10;
			
			@FindBy(xpath="//span[text()='Add activation code info']")
			WebElement addActivationcodeInfo;
			
			@FindBy(xpath="(//table[@id='MapVersionsTable']//input[@type='text'])[1]")
			WebElement developmentStatus;
			
			@FindBy(xpath="(//table[@id='MapVersionsTable']//input[@type='text'])[2]")
			WebElement softwareId;
			
			@FindBy(xpath="//button[@type='submit']")
			WebElement submit;
			
			@FindBy(xpath="//span[text()='0001110B']")
			WebElement createdValueClick;
			
			@FindBy(xpath="//tr[@class='ng-scope selected']//button[@uib-popover='Delete activation code info']")
			WebElement createdValueDelete;
			
			@FindBy(xpath="//span[text()='Add text']")
			WebElement addTextButton;
			
			@FindBy(xpath="//span[text()='engine case']")
			WebElement engineCaseSelect;
			
			@FindBy(xpath="//textarea")
			WebElement textContent_Enter;
		
			@FindBy(xpath="//span[text()='Create Engine Case']")
			WebElement createdEngineCase_Click;
			
			@FindBy(xpath="//tr[@class='ng-scope selected']//button[1]")
			WebElement editFoTexts;
			
			@FindBy(xpath="//span[text()='Edit Engine Case']")
			WebElement editedEngineCase_Click;
			
			@FindBy(xpath="//tr[@class='ng-scope selected']//span[@class='cell-icon rc-i-line-trash']")
			WebElement removeAddedText;
			
			@FindBy(xpath="//span[contains(@class,'sym rc-i-line-plus')]")
			WebElement plus_SaaNumber;
			
			@FindBy(xpath="//span[@class='sym  rc-i-line-filter']")
			WebElement filter_showExpandedView;
			
			@FindBy(xpath="//a[text()='Identification']")
			WebElement identification_Tab;

			@FindBy(xpath = "//*[@id='VehicleArrangement']/div[2]/div[2]/div/div/ul/li[2]/a")
			WebElement MajorAssembly;
			@FindBy(xpath="//a[text()='Technical data']")
			WebElement technicalData_Tab;
			
			@FindBy(xpath="//a[text()='Bodies']")
			WebElement bodies_Tab;
			
			@FindBy(xpath="//a[text()='Installation documentation']")
			WebElement installationDocumentation_Tab;
			
			@FindBy(xpath="//button[@uib-popover='Edit text']")
			WebElement edit;
			
			@FindBy(xpath="//span[text()='Navigation compatibility identifier (Major versions)']")
			WebElement navigationCompatibilityIdentifier_Table;
			
			@FindBy(xpath="//span[text()='Information on license key generation']")
			WebElement informationOnLicenseKeyGenearation_Table;
			
			@FindBy(xpath="//span[text()='PV (0)']")
			WebElement pv;
			
			@FindBy(xpath="//*[contains(text(),'The technical advisor Testuser C0X01586 (UserID: C0X01586')]")
			WebElement technicalAdvisor_Alert;
			
			@FindBy(xpath="//span[contains(@data-ng-bind,'logout')]/following-sibling::span")
			WebElement logout;
			
			@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleControlUnitArrangement.visible')]")
			WebElement controlUnitTab;
			
			@FindBy(xpath="//div[contains(@id,'ControlUnits')]//span[contains(@class,'rc-i-line-pencil')]")
			WebElement controlUnitsTab_Edit;
			
			@FindBy(xpath="//select[@data-ng-model='viewDataObject.vehicleSearchCategory']")
			WebElement fin_DropDown;
			
			@FindBy(xpath="//select[@data-ng-model='viewDataObject.vehicleSearchCategory']")
			WebElement fin_Search;
			
			@FindBy(xpath="(//span[@data-ng-bind-html='::alert.msg'])[1]")
			WebElement multipleResults_AlertMessage_1;
			
			@FindBy(xpath="(//span[@data-ng-bind-html='::alert.msg'])[9]")
			WebElement multipleResults_AlertMessage_2;
			
			@FindBy(xpath="(//span[@data-ng-bind-html='::alert.msg'])[10]")
			WebElement multipleResults_AlertMessage_3;
			
			@FindBy(xpath="(//span[@data-ng-bind-html='::alert.msg'])[11]")
			WebElement multipleResults_AlertMessage_4;
			
			@FindBy(xpath="//a[text()='WDB9066351S539414']")
			WebElement clickOnFin_1;
			
			@FindBy(xpath="//span[text()='WDB9066351S539414']")
			WebElement checkFin_1;
			
			@FindBy(xpath="//a[text()='WDB9300471K952347']")
			WebElement clickOnFin_2;
			
			@FindBy(xpath="//span[text()='WDB9300471K952347']")
			WebElement checkFin_2;
			@FindBy(xpath ="//*[@id='mainwrapper']/div[4]/div/div[1]/button" )
			WebElement click_alert;
			
			@FindBy(xpath="//table[@id='addTable']//span[contains(@class,'plus')]")
			WebElement saaNumber_Plus;
			
			@FindBy(xpath="//span[@data-ng-bind='addTable_rec.saa.amountPerSaa']")
			WebElement saaNumber1_Quantity_Added;
			
			@FindBy(xpath="//span[@data-ng-bind='saaTable_rec.amountPerSaa']")
			WebElement saaNumber1_Quantity;
			
//KELKARK- Certification
			@FindBy(xpath="//span[contains(text(),'Request CoC hard copy directly')]")
			WebElement RequestCocHardCopy;
			
			@FindBy(xpath="(//div[@data-ng-repeat='alert in alerts'])[1]")
			WebElement blueAlertBox2;
			
			//-History tab
			//(//button[contains(@data-ng-click,'toggleFilter')])//span[text()='Filter']
			@FindBy(xpath="//div[@id='ModificationHistory_280']//form[@name='fModificationHistory_280']//button[6]")
			WebElement history_filterButton;
			
			@FindBy(xpath="//input[@input-binding='viewControl.historyTable_filterExpression']")
			WebElement history_filterSearchBar;
			
			@FindBy(xpath="(//span[contains(@data-ng-bind,'historyTable_rec.newValue')])[1]")
			WebElement historyTab_fetchNewValue;
			
			
			// Rinttho

			public String vinNumberInput = "WDB9670058L327005";
			public String orderNumberInput = "2752923902";
			public String productionNumberInput = "4410599";
			public String transmissionNumberInput = "718840T0019230";
			public String radioComandDeviceNumberInput = "CM0245K0506459";
			public String axleEndNumberInput = "M884174";
			public String electronicLockNumberInput = "600009880996200210010401";
			public String bodyInput = "9438992L951966";

			public String vehicleOwnershipTitleNumberInput = "FT191482";
			public String modelSeriesNumberInput = "213A412823";
			public String CodeLetterNumberInput = "04335060600";
			//public String  keyIDENumberInput = "8406D243";
	        public String  BatteryNumberInput = "790001MA000199";
			public String engineNumberInput ="473905C0382877";
			public String vinNumberInputForPlantText = "WDB9630021L859303";
	public String Changeuser = "WDB9634035L920469";
			public String PlantText="Werkstext aus Migration";
			public String PlantText1="Werkstexte aus dem Aggregatewerk";

			public String TruckFinInput = "WDB9634241L992928";

			public String PDFTheftRelvnt = "WDB9634272L992621";
			public String FinTruckwriteAccessInput = "WDB9634272L898136";
	        public String ChangeuserMajorAssembly = "WDB4374671V252154";
	        public String SupportAndFeedbackFINnumber = "WDB9634272L992616";
	        public String CertificationTabFINInput = "WDB9634272L992621";
			public String GClassNewFinNumberInput = "WDB9634272L992620";

	        public String FinInput = "WEB41058013103813";
			public String NonPassengerCarsFinNumberInput = "WDF4702101G000024";
			public String CoCCapabilityFinNumberInput = "WDC4633491X297606";
			public String MajorAssemblyFinNumberInput = "WDB9010611P500501";
			public String XFunctionFinNumberInput = "WDB9010611P500500";
			public String PARControlUnitFinNumberInput = "WEB41058013103813";
			public String NavigationFinNumberInput = "WDDGF4HB7EA953094";

	        public String FOTextTabInput = "WEB62868713703726";
	        public String SAANumberFinNumberInput = "WDB9634272L992617";
			public String GraveyardvinNumberInput = "W1T96763710609583";

			//KELKARK U-082 VeDoc-3009
			public String ScrappedVehicleFinNumberInput = "WDB4051221W196714";// "WDB1179121N123456";
			public String StolenVehicleFinNumberInput ="WEB62901113521073";
			public String DeletedVehicleFinNumberInput = "WDB9634035L920469";
			public String LockedVehicleFinNumberInput = "WDB9010611P713740";
			public String LockedVehicle_And_UserHasNoRightsFinNumberInput = "WDD2050001F595854";
			public String ProductSeriesCategory_C0_or_C6 = "LE43X8HB5KL020348";
			//Used in U-111 Scrapped
			public String PCSmart_ScrappedVehicleFinNumberInput = "4JGCB5HE4CA125341";
			public String HistoryTab_ScrappedVehicleFinNumberInput = "WDB4371171W194040";
			public String HistoryTab2_ScrappedVehicleFinNumberInput = "WEB62800013098415";
			public String Truck_ScrappedVehicleFinNumberInput = "WDB9670052L327005";
			public String Canter_ScrappedVehicleFinNumberInput = "TYB4691781A100014";
			public String BusEvoBus_ScrappedVehicleFinNumberInput = "WEB63203513102389";
			public String TrapoVan_ScrappedVehicleFinNumberInput = "WDF44781313007267";
			public String MiniBus_ScrappedVehicleFinNumberInput = "WDF4702311G000039";
			
			//Used in U-083
			public String SalesTabFinNumberInput = "WDB9634272L992616";

			public String FinInputChangeuser2 = "WDB9634035L920469";
			public String PlantTextFinInput = "WDB9644262L990584";
			public String FactoryadditionFinInput = "WDB9634272L992617";
			public String Truck_VehicleFinNumberInput = "WDB96702110366655";
			//public String TrapoVan_VehicleFinNumberInput = "WDF44781313000382";removed
			public String Bus_VehicleFinNumberInput = "WEB41058013103813"; //sales tab in second row need to ....
			public String MiniBus_VehicleFinNumberInput = "";

	        public String DataValidationFinInput = "WDB9630021L859303";
			
			
//KELKARK			
    //-Customer service data			
			@FindBy(xpath = "//a[text()='Sales data']")
			WebElement salesDataTab;
			
			@FindBy(xpath = "//button[contains(@data-ng-click,'modifySalesData')]")
			WebElement editSalesData_button;
			
			
			@FindBy(xpath = "//button[contains(@data-ng-click,'modifyCustomerServiceData')]")
			WebElement editCustomerServiceData_button;
			
			@FindBy(xpath = "//form[@name='fVehicleSalesData_150']//div[contains(@data-ng-if,'customer_service_data')][2]")
			WebElement fetch_forwardingnoticeArea;
			
			
			@FindBy(xpath = "//form[@name='fVehicleSalesData_150']//div[contains(@data-ng-if,'customer_service_data')][2]//input")
			WebElement sendValue_forwardingnoticeArea;
			
			@FindBy(xpath = "//button[@data-ng-click='NextVehicle($event)']")
			WebElement nextArrow_searchBar;
			@FindBy(xpath = "//*[@id='mainwrapper']/div[4]/div/div[1]/button")
			WebElement graveyard_ok;


				@FindBy(xpath = "//button[contains(@data-ng-click,'modifySalesData')]")
				WebElement edit_salesData_button_sd;
			
					//@FindBy(xpath = "(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.orderNumber')])[2]")
					//WebElement orderNo_sd;
					
//					@FindBy(xpath = "//input[@data-ng-model='get_salesAreaType_orderCountry(viewDataObject.vehicle.activeState.salesAreaInformation).salesArea']")
//					WebElement salesUnit_sd_edit;
					@FindBy(xpath = "//*[@id='3fbba67f:11c4e15ff82:-7ffb']")
					WebElement salesUnit_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='get_salesAreaType_consumerCountry(viewDataObject.vehicle.activeState.salesAreaInformation).salesArea']")
					WebElement counsumerCountry_sd_edit;
					
					@FindBy(xpath = "//input[@ng-delta='vehicle.activeState.nationalSalesType']")
					WebElement nationalSalesType_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeAuthorizedAgent.agent1']")
					WebElement authorizedAgent_1_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeAuthorizedAgent.agent2']")
					WebElement authorizedAgent_2_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeAuthorizedAgent.agent3']")
					WebElement authorizedAgent_3_sd_edit;
					
					@FindBy(xpath = "//select[@data-ng-model='viewDataObject.vehicle.activeState.modeOfShipment']")
					WebElement modeOfShipment_sd_edit;
					
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeState.dateOfTechnicalState']")
					WebElement dateOfTechnicalState_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeProductDate.technicalApprovalDate']")
					WebElement finalAcceptanceDate_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeProductDate.shipmentDate']")
					WebElement shipmentDate_sd_edit;
					
					@FindBy(xpath = "//input[@data-ng-model='viewDataObject.vehicle.activeProductDate.transferDate']")
					WebElement transferDate_sd_edit;
					
					public void SalesDataTab(){
						Actions act=new Actions(driver);
						act.moveToElement(IdentificationTab).perform();
						warmup();
						salesDataTab.click();
						warmup5();
						act.moveToElement(nextArrow_searchBar).perform();
						
					}
					public void EditSalesData_button(){
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].scrollIntoView();", editSalesData_button);
						editSalesData_button.click();
					}
					public void EditCustomerServiceData_Button(){
						warmup();
						Actions act=new Actions(driver);
						act.moveToElement(edit_salesData_button_sd).perform();
						warmup();
						act.moveToElement(editCustomerServiceData_button).click().build().perform();
						warmup6();
					}
					
					public void SendValue_ForwardingnoticeArea(String value) {
						sendValue_forwardingnoticeArea.clear();
						sendValue_forwardingnoticeArea.sendKeys(value);	
					}
					public void BackToOriginalValue_ForwardingnoticeArea() {
						sendValue_forwardingnoticeArea.clear();
						sendValue_forwardingnoticeArea.sendKeys("");	
					}
					public void Save_Button(){
						warmup6();
						JavascriptExecutor js=(JavascriptExecutor)driver;
						js.executeScript("arguments[0].scrollIntoView();", Save_Changes);
						//js.executeScript("arguments[0].click();", Save_Changes);
						Save_Changes.click();
						warmup();
						}
		//-Sales data section
					
					public String Fetch_SalesData(int row, int column) {
						WebElement salesData = driver.findElement(By.xpath("//form[@name='fVehicleSalesData_150']//div[3]//div[@class='row rowspace']["+row+"]//div["+column+"]"));
						String value=salesData.getText();
						System.out.println(value);
						return value;
					}
					public int Fetch_ElementCountInRow_SalesData(int row) {
						List<WebElement> count = driver.findElements(By.xpath("//form[@name='fVehicleSalesData_150']//div[3]//div[@class='row rowspace']["+row+"]//span"));
						int size = count.size();
						//System.out.println("Row "+row+"- Size "+size);
						return size;
					}
					
					public String Fetch_CustomerServiceData(int row, int column) {
						WebElement salesData = driver.findElement(By.xpath("//form[@name='fVehicleSalesData_150']//div[5]//div[@class='row rowspace']["+row+"]//div["+column+"]"));
						String value=salesData.getText();
						System.out.println(value);
						return value;
					}
					public int Fetch_ElementCountInRow_CustomerServiceData(int row) {	
						List<WebElement> count = driver.findElements(By.xpath("//form[@name='fVehicleSalesData_150']//div[5]//div[@class='row rowspace']["+row+"]//span"));
						int size = count.size();
						System.out.println("Row "+row+"- Size "+size);
						return size;
					}
					

					public void edit_SalesData_button_sd(){
						warmup();
						Actions act=new Actions(driver);
//						act.moveToElement(editCustomerServiceData_button).perform();
						warmup();
						act.moveToElement(edit_salesData_button_sd).click().build().perform();
						warmup6();	
					}
					
					public void send_SalesUnit(String value) {
						salesUnit_sd_edit.clear();
						salesUnit_sd_edit.sendKeys(value);
					}
					public void send_CounsumerCountry(String value) {
						counsumerCountry_sd_edit.clear();
						counsumerCountry_sd_edit.sendKeys(value);
					}
					public void send_NationalSalesType(String value) {
						nationalSalesType_sd_edit.clear();
						nationalSalesType_sd_edit.sendKeys(value);
					}
					public void send_AuthorizedAgent_1(String value) {
						authorizedAgent_1_sd_edit.clear();
						authorizedAgent_1_sd_edit.sendKeys(value);
					}
					public void send_AuthorizedAgent_2(String value) {
						authorizedAgent_2_sd_edit.clear();
						authorizedAgent_2_sd_edit.sendKeys(value);
					}
					public void send_AuthorizedAgent_3(String value) {
						authorizedAgent_3_sd_edit.clear();
						authorizedAgent_3_sd_edit.sendKeys(value);
					}
					public void SelectModeOfShipment(String category) {
						Select mode = new Select(modeOfShipment_sd_edit);
						mode.selectByVisibleText(category);
					}
					
					
					public void send_DateOfTechnicalState(String value) {
						dateOfTechnicalState_sd_edit.clear();
						dateOfTechnicalState_sd_edit.sendKeys(value);
					}
					public void send_FinalAcceptanceDate(String value) {
						finalAcceptanceDate_sd_edit.clear();
						finalAcceptanceDate_sd_edit.sendKeys(value);
					}
					public void send_ShipmentDate(String value) {
						shipmentDate_sd_edit.clear();
						shipmentDate_sd_edit.sendKeys(value);
					}
					public void send_TransferDate(String value) {
						transferDate_sd_edit.clear();
						transferDate_sd_edit.sendKeys(value);
					}
			
			
					
					
					
			@FindBy(xpath = "(//span[text()='Vehicle identification number (VIN)'])/parent::label/parent::div/following-sibling::div[1]")
			public
			WebElement vinNumber;

			@FindBy(xpath = "//span[text()='Order number']/parent::label/parent::div/following-sibling::div")
			WebElement orderNumber;

			@FindBy(xpath = "//span[text()='Production number']/parent::label/parent::div/following-sibling::div[1]")
			WebElement productionNumber;

			@FindBy(xpath = "(//span[text()='Transmission'])[1]/parent::div/following-sibling::div[1]/div/span[1]")
			WebElement transmissionNumber;

			@FindBy(xpath = "//select[@name='vehicleSearchCategory']")
			WebElement dropdownVehicleCategory;
			@FindBy(xpath = "//a[@href='VehicleArrangement.html']")
			public WebElement vehicleDatatab;
			@FindBy(xpath = "(//span[text()='Vehicle identification no. (FIN)'])[1]/parent::label/parent::div/following-sibling::div[1]/span")
			public WebElement finNumber;
			@FindBy(xpath = "(//span[text()='Rear axle 1'])[1]/parent::div/following-sibling::div[1]/div/span[1]")
			public WebElement rearAxle3Number;
			@FindBy(xpath = "(//span[text()='Body'])[1]/parent::div/following-sibling::div[1]/div/span[1]")
			public WebElement bodyNumber;

			@FindBy(xpath = "//datalist[@id='localSearchAutoComplete']/option")
			WebElement searchHistory;
			
			@FindBy(xpath = "//span[text()='Vehicle data']/following-sibling::span")
			WebElement vehicleData_SidePanel;
			
			
			// datalist[@id='localSearchAutoComplete']/option

			public void searchCategoryNumber(String CategoryNumberInput) {
				warmup1();
				warmup1();
				warmup1();
				// (//span[text()='Vehicle data'])[1]
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Vehicle
				// data'])[1]")));
				wait.until(ExpectedConditions.elementToBeClickable(searchInput));

				searchInput.clear();
				warmup5();
				searchInput.sendKeys(CategoryNumberInput);
				searchButton.click();
				warmup6();
				// warmup6();
			}
			public void enterCategoryNumber(String CategoryNumberInput) {

				warmup1();
				warmup1();
				// (//span[text()='Vehicle data'])[1]
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[text()='Vehicle
				// data'])[1]")));
				wait.until(ExpectedConditions.elementToBeClickable(searchInput));

			searchInput.clear();
				warmup5();
				searchInput.sendKeys(CategoryNumberInput,Keys.DOWN,Keys.ENTER);
				warmup6();
				//searchInput.sendKeys(Keys.ENTER);
				//searchInput.sendKeys(Keys.ENTER);	
				
			}
			public String fetchVinNumber() {
				warmup1();
				wait.until(ExpectedConditions.elementToBeClickable(searchInput));
				String vinNumberUI = vinNumber.getText();
				System.out.println(vinNumberUI);
				return vinNumberUI;

			}

			public void searchVehicleCategory(String category) {
				Select drpVehicleCategory = new Select(dropdownVehicleCategory);
				drpVehicleCategory.selectByVisibleText(category);

			}

			public String fetchVehicleCategorySelected() {
				//warmup5();
				Select select = new Select(dropdownVehicleCategory);
				WebElement option = select.getFirstSelectedOption();
				warmup5();
				String selectedCategory = option.getText();
				System.out.println(selectedCategory);
				warmup5();
				return selectedCategory;

			}

			public String fetchOrderNumber() {
				//wait.until(ExpectedConditions.elementToBeClickable(searchInput));
				warmup1();
				String orderNumberWithSpace = orderNumber.getText();
				System.out.println(orderNumberWithSpace);
				String orderNumberUI = orderNumberWithSpace.replaceAll("\\s+", "");
				System.out.println(orderNumberUI);
				return orderNumberUI;

			}

			public String fetchProductionNumber() {
				warmup1();
				wait.until(ExpectedConditions.elementToBeClickable(searchInput));
				String productionNumberWithSpace = productionNumber.getText();
				click_alert.click();
				System.out.println(productionNumberWithSpace);
				String productionNumberUI = productionNumberWithSpace.replaceAll("\\s+", "");
				System.out.println(productionNumberUI);
				return productionNumberUI;

			}

			public String fetchTransmissionNumber() {
				wait.until(ExpectedConditions.elementToBeClickable(MajorAssmeblyTab));
				MajorAssmeblyTab.click();

				warmup1();
				Actions act=new Actions(driver);
				act.moveToElement(searchButton).perform();
				warmup();
				String transmissionWithSpace = transmissionNumber.getText();
				String transmissionNumberUI = transmissionWithSpace.replaceAll("\\s+", "");
				System.out.println(transmissionNumberUI);

				return transmissionNumberUI;

			}

			public String fetchRearAxleNumber() {
				warmup6();
				wait.until(ExpectedConditions.elementToBeClickable(MajorAssmeblyTab));
				MajorAssmeblyTab.click();

				warmup1();
				String rearAxle3WithSpace = rearAxle3Number.getText();
				String rearAxle3NumberUI = rearAxle3WithSpace.replaceAll("\\s+", "");
				System.out.println(rearAxle3NumberUI);

				return rearAxle3NumberUI;

			}

			public String fetchBodyNumber() {
				warmup6();
				wait.until(ExpectedConditions.elementToBeClickable(MajorAssmeblyTab));
				MajorAssmeblyTab.click();

				warmup1();
				String bodyNumberWithSpace = bodyNumber.getText();
				String bodyNumberUI = bodyNumberWithSpace.replaceAll("\\s+", "");
				System.out.println(bodyNumberUI);
				warmup1();
				return bodyNumberUI;

			}

			public String fetchFinNumber() {

				warmup1();
				String finNumberWithSpace = finNumber.getText();
				String finNumberNumberUI = finNumberWithSpace.replaceAll("\\s+", "");
				System.out.println(finNumberNumberUI);

				return finNumberNumberUI;

			}

			public void alertHandle() {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			}

			public boolean autoSearcHistory() {

				warmup5();
				

				String arr[] = { CodeLetterNumberInput, modelSeriesNumberInput, vehicleOwnershipTitleNumberInput,
						electronicLockNumberInput, bodyInput, axleEndNumberInput, radioComandDeviceNumberInput,
						transmissionNumberInput, productionNumberInput, orderNumberInput };
				warmup();
				searchInput.click();

				warmup();

				List<WebElement> search_listHistory = driver
						.findElements(By.xpath("//datalist[@id='localSearchAutoComplete']/option"));
				int size = search_listHistory.size();
				System.out.println(size);
				System.out.println("Size of the dropdown list is: " + search_listHistory.size());

				int count = 0;
				int i;
				for (i = 0; i < search_listHistory.size(); i++) {

					if ((arr[i].equals(search_listHistory.get(i).getAttribute("value")))) {
						count++;
					
						System.out.println(search_listHistory.get(i).getAttribute("value"));

					}

				}
				System.out.println(count);
				System.out.println(arr.length);

				Assert.assertEquals(count, arr.length);
				return true;
				

			}

			public boolean autoSearcHistoryAfterNewSearch() {

				warmup5();

				String arr[] = { BatteryNumberInput, CodeLetterNumberInput, modelSeriesNumberInput,
						vehicleOwnershipTitleNumberInput, electronicLockNumberInput, bodyInput, axleEndNumberInput,
						radioComandDeviceNumberInput, transmissionNumberInput, productionNumberInput };
				warmup();
				searchInput.click();

				warmup();

				List<WebElement> search_listHistory = driver
						.findElements(By.xpath("//datalist[@id='localSearchAutoComplete']/option"));
				int size = search_listHistory.size();
				System.out.println(size);
				System.out.println("Size of the dropdown list is: " + search_listHistory.size());

				int count = 0;
				int i;
				for (i = 0; i < search_listHistory.size(); i++) {
					String value = search_listHistory.get(i).getAttribute("value");
					System.out.println(value);
					if ((arr[i].equals(search_listHistory.get(i).getAttribute("value")))) {
						count++;

					}

				}

				Assert.assertEquals(count, arr.length);
				return true;

			}

			public boolean savedCategoryVal() {
				String arr[] = {"Code letter/end number/plant (CV)",
						"Model series/plant/end no. (PC)", "Vehicle ownership title number", "electronic lock number",
						"Body (CV)", "Axle end number (CV)", "Radio/COMAND device number", "Transmission no.",
						};
				String CategoryNumberInput[] = {CodeLetterNumberInput,modelSeriesNumberInput,vehicleOwnershipTitleNumberInput,
						electronicLockNumberInput,bodyInput,axleEndNumberInput,radioComandDeviceNumberInput,
						transmissionNumberInput };

				warmup5();

				

				warmup();

				List<WebElement> search_listHistory = driver
						.findElements(By.xpath("//datalist[@id='localSearchAutoComplete']/option"));
				int size = search_listHistory.size();
				System.out.println(size);
				System.out.println("Size of the dropdown list is: " + search_listHistory.size());

				int count = 0;
				int i;
			
				for (i = 1; i < 9; i++) {
					System.out.println("Entered loop");
					
					warmup1();
					
					searchInput.sendKeys(CategoryNumberInput[i],Keys.DOWN);
					warmup6();
					//searchInput.sendKeys(Keys.ENTER);
					searchInput.sendKeys(Keys.ENTER);	
				
					
					
					warmup1();
					String value = fetchVehicleCategorySelected();
					System.out.println("enter Category"+value);
					warmup1();
					System.out.println(arr[i]);
					System.out.println(value);
					/*
					 * String arr[] = { "Production number", "Transmission no.",
					 * "Radio/COMAND device number", "Axle end number (CV)", "Body (CV)",
					 * "electronic lock number", "Vehicle ownership title number",
					 * "Model series/plant/end no. (PC)", "Code letter/end number/plant (CV)",
					 * "Vehicle identification no. (FIN or VIN)" };
					 */
					if ((arr[i].equals(value))) {
						count++;
						System.out.println("pass");
						System.out.println(arr[i]);
						System.out.println(value);

					}
					warmup5();
					searchInput.clear();
					warmup5();

				}
				System.out.println(count);

				return true;

			}
	// Initializing the page objects
	public VehicleDataPage_S() {
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validateVehicleDataPage() {
		warmup();
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		return searchInput.isDisplayed();


	}
	
	public void dropdowncheck(){
		
 warmup5();
		
		
		String arr[]={"Vehicle identification no. (FIN or VIN)", "Order number", "Production number", "Engine no.", "Transmission no.", "Radio/COMAND device number", "Axle end number (CV)", "Body (CV)","electronic lock number","Key IDE","Vehicle ownership title number", "Model series/plant/end no. (PC)", "Code letter/end number/plant (CV)"};
		warmup();

		Select s1=new Select(driver.findElement(By.name("vehicleSearchCategory")));
		warmup();
		
		List<WebElement>search_list=s1.getOptions();
		System.out.println("Size of the dropdown list is: "+search_list.size());

		int count=0;
		int i;
		for (i=0;i<search_list.size()-1;i++){

			if((arr[i].equals(search_list.get(i).getText()))){
				count++;

			}

		}
		
		Assert.assertEquals(count, arr.length);
	}
	
	public void searchfin_Truck() throws InterruptedException {
//		
//		Select s=new Select(SearchCategory);
//		s.selectByValue("string:productionNumber");
		
		warmup1();
		warmup1();
		searchInput.sendKeys("WDB96342420024454 ");
		// WDF3753031B950400 Plant text
		// WDDGF4HB7EA953094
		searchButton.click();
		Thread.sleep(5000);
		
	}
	
	public void searchfin() throws InterruptedException {
//		
//		Select s=new Select(SearchCategory);
//		s.selectByValue("string:productionNumber");
		
		warmup1();
		warmup1();
		warmup1();
		searchInput.clear();
	//	searchInput.sendKeys("WDD2042011F483679");
		searchInput.sendKeys("W1T96763720433506");
		searchButton.click();
		warmup1();
     	// wait.until(ExpectedConditions.visibilityOf(pv));
	}
	
	
	public void searchfin_NewTab() throws InterruptedException {		
		searchInput.clear();
		//searchInput.sendKeys("WDD2042011F483679");
		searchInput.sendKeys("WDB9630021L985434");
		searchButton.click();
		warmup5();
		}
	
	public void searchfin_TruckWithRightAccess() throws InterruptedException{
		
		warmup();
		
		searchInput.sendKeys("WDB9634272L898132");
		searchButton.click();
		Thread.sleep(5000);
		
		try{
			
			driver.findElement(By.xpath("//button[contains(@data-ng-click,'cancelAction($event)')]")).click();;
			
		}catch (Exception e){
			
			System.out.println("Modal dialog is displayed");
			
		}
		
	}
	
	public String fin() {
		String fin_value=fin.getText();
		return fin_value;
	}
	
	public String vin() {
		String vin_value=vin.getText();
		return vin_value;
	}
	
	public String brand() {
		String brand_value=brand.getText();
		System.out.println(brand_value);
		return brand_value;
	}
	
	public String category() {
		String category_value=category.getText();
		return category_value;
	}
	
	public String VehicleModel() {
		String VehicleModel_value=VehicleModel.getText();
		return VehicleModel_value;
	}
	
	public String CustomizedVehicleType() {
		String CustomizedVehicleType_value=CustomizedVehicleType.getText();
		return CustomizedVehicleType_value;
	}
	
	public String OrderNumber() {
		String OrderNumber_value=OrderNumber.getText();
		return OrderNumber_value;
	}
	
	public String ProductionNumber() {
		String ProductionNumber_value=ProductionNumber.getText();
		return ProductionNumber_value;
	}
	
	public String BodyTypeNumber() {
		String BodyTypeNumber_value=BodyTypeNumber.getText();
		return BodyTypeNumber_value;
	}
	
	public String ProductionPlant() {
		String ProductionPlant_value=ProductionPlant.getText();
		return ProductionPlant_value;
	}
	
	public String ShipmentDate() {
		String ShipmentDate_value=ShipmentDate.getText();
		return ShipmentDate_value;
	}
	
	public String Status() {
		String Status_value=Status.getText();
		return Status_value;
	}
	
	public void MajorAssembliesTab(){
		
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssmeblyTab));
		MajorAssmeblyTab.click();
		
		warmup();
		JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
		  javaScriptExecutor.executeScript("window.scrollBy(-100,0)"); 
		
		List<WebElement> clickOnTabs=driver.findElements(By.xpath("//button[contains(@data-ng-click,'openLink')]"));
		
		for(int i=1;i<clickOnTabs.size();i++){
			String openTabs=Keys.chord(Keys.CONTROL,Keys.ENTER);
			clickOnTabs.get(i).sendKeys(openTabs);
			
		}
	}
	
	public String EngineNumber(){
		
		warmup5();
	    String EngineNumber_ThinClient=	EngineNumber.getText();
	    return EngineNumber_ThinClient;
	
	}
	
	public String EngineVariantNumber(){
		
		warmup();
			String EngineVariantNumber_ThinClient=	Engine_VariantNumber.getText();
			return EngineVariantNumber_ThinClient;

	}
	
	public String ObjectNumber(){
		
		warmup();
		
		String EngineObjectNumber_ThinClient= Engine_ObjectNumber.getText();
		return EngineObjectNumber_ThinClient;

	}
	
	public String ExhaustAfterTreatment(){
		
		warmup();

//		wait.until(ExpectedConditions.visibilityOf(Exhaust_afterTreatment));
		String Exhaust_afterTreatment_ThinClient= Exhaust_afterTreatment.getText();
		return Exhaust_afterTreatment_ThinClient;

	}
	
	public String ExhaustAfterTreatment_Variant(){
		
		warmup();
		
		String ExhaustAfterTreatment_ThinClient=Exhaust_afterTreatment_Variant.getText();
		return ExhaustAfterTreatment_ThinClient;

	}
	
	public String ExhaustAfterTreatment_ObjectNumber() throws InterruptedException{
		
		warmup();
		String ExhaustAfterTreatment_ThinClient=Exhaust_afterTreatment_ObjectNumber.getText();
		return ExhaustAfterTreatment_ThinClient;

	}
	
	public String Transmission(){
		
		warmup();
	
		String Transmission_ThinClient=	Transmission.getText();
		return Transmission_ThinClient;	

	}
	
	public String TransmissionVariant(){
	
		warmup();		
		String Transmission_Variant_ThinClient=Transmission_Variant.getText();
		return Transmission_Variant_ThinClient;

	}
	
	public String TransmissionObjectNumber(){
		
		warmup();
		String Transmission_ObjectNumber_ThinClient=Transmission_ObjectNumber.getText();
		return Transmission_ObjectNumber_ThinClient;

	}
	
	public String FrontAxle1(){
	
		warmup();
		String Front_Axle1_ThinClient=Front_Axle1.getText();
		return Front_Axle1_ThinClient;

	}
	
	public String FrontAxle1Variant(){
		
		warmup();
		String Front_Axle1Variant_ThinClient=Front_Axle_Variant.getText();
		return Front_Axle1Variant_ThinClient;
	
	}
	
	public String FrontAxle1ObjectNumber(){
		
		warmup();
		String Front_Axle_ObjectNumber_ThinClient=Front_Axle_ObjectNumber.getText();
		return Front_Axle_ObjectNumber_ThinClient;

	}
	
	public String FrontAxle2() throws InterruptedException{
	
		warmup();
		String Front_Axle2_ThinClient=Front_Axle2.getText();
		return Front_Axle2_ThinClient;

	}
	
	public String FrontAxle2Variant() throws InterruptedException{
		
		warmup();
		String Front_Axle2_Variant_ThinClient=Front_Axle2_Variant.getText();
		return Front_Axle2_Variant_ThinClient;

	}
	
	public String FrontAxle2ObjectNumber() throws InterruptedException{
		
		warmup();
		String Front_Axle2_ObjectNumber_ThinClient=Front_Axle2_ObjectNumber.getText();
		return Front_Axle2_ObjectNumber_ThinClient;

	}
	
	public String FrontAxle3() throws InterruptedException{
		
		warmup();
		String Front_Axle3_ThinClient=Front_Axle3.getText();
		return Front_Axle3_ThinClient;

	}
	
	public String FrontAxle3Variant() throws InterruptedException{
		
		warmup();
		String Front_Axle3_Variant_ThinClient=Front_Axle3_Variant.getText();
		return Front_Axle3_Variant_ThinClient;

	}
	
	public String FrontAxle3ObjectNumber() throws InterruptedException{
		
		warmup();
		String Front_Axle3_ObjectNumber_ThinClient=Front_Axle3_ObjectNumber.getText();
		return Front_Axle3_ObjectNumber_ThinClient;

	}
	
	public String RearAxle1() throws InterruptedException{
		
		warmup();
		String Rear_Axle1_ThinClient=Rear_Axle1.getText();
		return Rear_Axle1_ThinClient;

	}
	
	public String RearAxle1Variant() throws InterruptedException{
		
		warmup();
		String Rear_Axle1_Variant_ThinClient=Rear_Axle1_Variant.getText();
		return Rear_Axle1_Variant_ThinClient;

	}
	
	public String RearAxle1ObjectNumber() throws InterruptedException{
				
		warmup();
		String Rear_Axle1_ObjectNumber_ThinClient=Rear_Axle1_ObjectNumber.getText();
	    return Rear_Axle1_ObjectNumber_ThinClient;

	}
	
	public String RearAxle2() throws InterruptedException{
				
		warmup();
		String Rear_Axle2_ThinClient=Rear_Axle2.getText();
		return Rear_Axle2_ThinClient;

	}
	
	public String RearAxle2Variant() throws InterruptedException{
				
		warmup();
		String Rear_Axle2_Variant_ThinClient=Rear_Axle2_Variant.getText();
		return Rear_Axle2_Variant_ThinClient;
	
	}
	
	public String RearAxle2ObjectNumber() throws InterruptedException{
				
		warmup();
		String Rear_Axle2_ObjectNumber_ThinClient=Rear_Axle2_ObjectNumber.getText();
		return Rear_Axle2_ObjectNumber_ThinClient;

	}
	
	public String RearAxle3() throws InterruptedException{
			
		warmup();
		String Rear_Axle3_ThinClient=Rear_Axle3.getText();
		return Rear_Axle3_ThinClient;

	}
	
	public String RearAxle3Variant() throws InterruptedException{
			
		warmup();
		String Rear_Axle2_Variant_ThinClient=Rear_Axle3_Variant.getText();
		return Rear_Axle2_Variant_ThinClient;

	}
	
	public String RearAxle3ObjectNumber() throws InterruptedException{
				
		warmup();
		String Rear_Axle3_ObjectNumber_ThinClient=Rear_Axle3_ObjectNumber.getText();
		return Rear_Axle3_ObjectNumber_ThinClient;

	}
	
	public String Body() throws InterruptedException{
			
		warmup();
		String Body_ThinClient=	Body.getText();
		return Body_ThinClient;

	}
	
	public String Platform() throws InterruptedException{
			
		warmup();
		String Platform_ThinClient=	Platform.getText();
		return Platform_ThinClient;

		
	}
	
	public String Retarder() throws InterruptedException{
		
		warmup();
		String Retarder_ThinClient=	Retarder.getText();
		return Retarder_ThinClient;

		
	}
	
	public String Steering() throws InterruptedException{
		
		warmup();
		String Steering_ThinClient=	Steering.getText();
		return Steering_ThinClient;

		
	}
	
	public String TheftRelevantTab_LockType(){
		
		warmup();
		
		String LockType_ThinClient=TheftRelevantTab_LockType.getText();
		return LockType_ThinClient;
	}
	
	public String TheftRelevantTab_RadioNumber(){
		
		warmup();
		
		String RadioNumber_ThinClient=	TheftRelevantTab_RadioNumber.getText();
		return RadioNumber_ThinClient;
		
	}
	
	public String SalesDataTab_OrderNumber(){
		
		wait.until(ExpectedConditions.elementToBeClickable(SalesDataTab));

		SalesDataTab.click();
		
		warmup();
		
		String SalesDataTab_OrderNumber_ThinClient=	SalesDataTab_OrderNumber.getText();
		return SalesDataTab_OrderNumber_ThinClient;
	}
	
	public String SalesDataTab_TechnicalDate(){
		
		warmup();
		
		String SalesDataTab_TechnicalState_ThinClient=	SalesDataTab_TechnicalState.getText();
		return SalesDataTab_TechnicalState_ThinClient;
		
	}
	
	public String SalesDataTab_InitialState(){
		
		warmup();
		
		String SalesDataTab_InitialState_ThinClient=	SalesDataTab_InitialRegistrationTab.getText();
		
		return SalesDataTab_InitialState_ThinClient;
		
		
	}
	
	public String AlternativeDrives() throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(AlternativeDrive));
		AlternativeDrive.click();
		
		warmup();
		String AlternativeDrive_Content_ThinClient=	AlternativeDrive_Content.getText();
		return AlternativeDrive_Content_ThinClient;
	}
	
	public String ThirdParty_MajorAssemblies() throws InterruptedException{
		wait.until(ExpectedConditions.elementToBeClickable(ThirdParty_MajorAssemblies));
		ThirdParty_MajorAssemblies.click();
		warmup();
		String ThirdParty_MajorAssemblies_Content_ThinClient=	ThirdParty_MajorAssemblies_Content.getText();
		return ThirdParty_MajorAssemblies_Content_ThinClient;
	}
	
	
	public void CodesTab() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(CodesTab));
		CodesTab.click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		wait.until(ExpectedConditions.elementToBeClickable(HideDesignation_button));
		
		warmup();
		
		js.executeScript("arguments[0].click();", HideDesignation_button);
		
//		HideDesignation_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(ShowDesignation_button));
//		ShowDesignation_button.click();
		
		js.executeScript("arguments[0].click();", ShowDesignation_button);
		
		wait.until(ExpectedConditions.elementToBeClickable(Sort));
		
		try{
			warmup();
			js.executeScript("arguments[0].click();", Sort);
			
		}catch(Exception e){
			
			warmup();
			
			Sort.click();
			
		}
		
		warmup();

		wait.until(ExpectedConditions.elementToBeClickable(ResetSorting));
		ResetSorting.click();


	}
	
public void clickSaaNumbers_Tab() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(SAA_numbers_Tab));
		SAA_numbers_Tab.click();
		Thread.sleep(5000);
		SAA_numbers_Tab.click();

	}
	
	public void SAANumbers_Tab() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(SAA_numbers_Tab));
		SAA_numbers_Tab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(DesignationTable));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", DesignationTable);
		wait.until(ExpectedConditions.elementToBeClickable(FirstElement_FromEngineCaseID));

		js.executeScript("arguments[0].click();", FirstElement_FromEngineCaseID);
		
		wait.until(ExpectedConditions.elementToBeClickable(AllContentofDesignationTable));

		
		js.executeScript("arguments[0].click();", AllContentofDesignationTable);
		
		wait.until(ExpectedConditions.visibilityOf(Benz_logo));
		
		js.executeScript("arguments[0].scrollIntoView();", Benz_logo);
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-class,'($index==viewControl.saaTable_selNdx')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-class,'($index==viewControl.saaTable_selNdx')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}

		warmup();

		List<WebElement> rows1=driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'saaTable_rec in viewDataObject.consolidatedProductData')])"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows1.get(rows1.size()-1));
			 List<WebElement> tempRows1 = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'saaTable_rec in viewDataObject.consolidatedProductData')])[100]"));
			 
			  if(tempRows1.size() > rows1.size()) {
				  rows1 = tempRows1;
			    } else {
			        break;
			    }
		}
		
		List<WebElement> rows2=driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'saaTable_rec in viewDataObject.consolidatedProductData')])"));

		
		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows2.get(rows1.size()-1));
			 List<WebElement> tempRows2 = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'saaTable_rec in viewDataObject.consolidatedProductData')])[150]"));
			 
			  if(tempRows2.size() > rows1.size()) {
				  rows1 = tempRows2;
			    } else {
			        break;
			    }
		}
	
		warmup();
		
		
		WebElement IdentificationTab=driver.findElement(By.xpath("//li[contains(@data-ng-show,'viewControl.VehicleIdentificationArrangement.visible')]"));
		
		js.executeScript("arguments[0].scrollIntoView();", IdentificationTab);
		
		
	}
	
	public void showSAAGraveyard() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(showSAAGraveyard));
		warmup6();
		showSAAGraveyard.click();
		warmup6();
		graveyardSAANumbers_Sort.click();
		warmup6();
		graveyard_ok.click();
		}
		public void graveyardAlert(){

		}
	public void graveyardSAANumbers_Export() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(graveyardSAANumbers_Export));
		warmup6();
		graveyardSAANumbers_Export.click();
		warmup6();
		String fileName=  GetDownloadedFileName_NewTab(1, 0);
		 int dataCountInCSV= getRecordsCountInCSV(fileName);
		 System.out.println("Verifying total records in table with number of entries in csv");
		 Assert.assertEquals(getNumberOfEntries_graveyardSAA(), dataCountInCSV);
}
	 public int getNumberOfEntries_graveyardSAA() throws InterruptedException {
		 	String entriesTxt = graveyardSAANumbers_totalRecords();
			String[] aEntriesText = entriesTxt.split(" / ");
			System.out.println(aEntriesText.length);
			String totalEntriesText = aEntriesText[1];
			int i=Integer.parseInt(totalEntriesText);
			return i;
		}
	 public String graveyardSAANumbers_totalRecords() {
			String records=graveyardSAANumbers_totalRecords.getText().trim();
			warmup6();
			System.out.println(records);
			return records;
			}
	public void VPDandSerialNumberTab(){
		
		wait.until(ExpectedConditions.elementToBeClickable(VPD_SerialNumberTab));
		VPD_SerialNumberTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(VPD_sorting));
		
		VPD_sorting.click();
		
		wait.until(ExpectedConditions.visibilityOf(VPD_FilterButton));
		
		VPD_FilterButton.click();
		
		wait.until(ExpectedConditions.visibilityOf(VPD_SearchVPD));

		
		VPD_SearchVPD.sendKeys("111");
		
		VPD_SearchVPD.sendKeys(Keys.ENTER);
		
		WebElement IdentificationTab=driver.findElement(By.xpath("//li[contains(@data-ng-show,'viewControl.VehicleIdentificationArrangement.visible')]"));



		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", IdentificationTab);
		
	}
	
	public void ControlUnitTab() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab));
		ControlUnitTab.click();
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_IDCode));
		warmup5();
		warmup5();
		ActualIdCode=ControlUnitTab_IDCode.getText();
		warmup5();
		System.out.println(ActualIdCode);
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_sort));
		Thread.sleep(5000);
		ControlUnitTab_sort.click();
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_ResetSort));
		js.executeScript("arguments[0].click();", ControlUnitTab_ResetSort);
		warmup5();
		ControlUnitTab_ResetSort.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));

		
		js.executeScript("arguments[0].click();", ControlUnitTab_FilterButton);

		
//		ControlUnitTab_FilterButton.click();
		
//		Thread.sleep(4000);
		
//		ControlUnitTab_FilterText.sendKeys("0024463633");
////		
//		ControlUnitTab_FilterText.sendKeys(Keys.ENTER);
////		
//		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_CancelFilter));
////
//		js.executeScript("arguments[0].click();", ControlUnitTab_CancelFilter);
		
		

//		ControlUnitTab_CancelFilter.click();
	}
	public void ControlUnitTab_CheckForArrowLink(){
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab));
		ControlUnitTab.click();
		warmup5();
		warmup5();
		
         try{
        	 
        	 warmup();
        	 
        	 wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_arrowButton));
        	 
        	 ControlUnitTab_arrowButton.click();
        	 
       	 Set<String> handles=driver.getWindowHandles();
//				
				Iterator<String> it=	handles.iterator();
//				
////					
					parentwindowID=it.next();
					childwindowID=it.next();
					childwindowID2=it.next();
//					
                    warmup();
//                     
					driver.switchTo().window(childwindowID);
					
					warmup();
					
		 wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_NewWindow));
	
		 warmup();
		 
		String ExpectedIdCode=	ControlUnitTab_NewWindow.getText();
		
		System.out.println(ExpectedIdCode);
		
		Assert.assertEquals(ExpectedIdCode, ActualIdCode);
		
		warmup();
		
		

        	 
         }catch(Exception e){
        	 
        	 System.out.println("Arrow button is not present for the truck vehicle");
         }
		
		
	}
	
	public String MajorAssemblyDataTab(){
		
		driver.switchTo().window(childwindowID);
//		
//		System.out.println(driver.getTitle());
		
		warmup();
		
		driver.findElement(By.xpath("//*[@id='cuTable']/tbody/tr[1]/td[15]/span/button[2]")).click();

		warmup();
		
		wait.until(ExpectedConditions.visibilityOf(EATNumber));

	String EATNumberThinClient=	EATNumber.getText();
	
	return EATNumberThinClient;

		
		}
		
		
	
	
	public void TheftRelevantDataTab(){
		
		try{
			
			driver.switchTo().window(parentwindowID);
		}catch(Exception e){
			
			System.out.println("Switched to the parent window");
		}
		
		warmup1();
		
		wait.until(ExpectedConditions.visibilityOf(TheftRelevantTab));
		
		TheftRelevantTab.click();
		
		wait.until(ExpectedConditions.visibilityOf(TheftRelevantTab_LockType));
		
	//	System.out.println(TheftRelevantTab_LockType.getText());
	
	try{
		
		System.out.println(TheftRelevantTab_RadioNumber.getText());
	}catch(Exception e){
		
		System.out.println("Radio unit number is not present for the vehicle search");
	}
		
	}
	
	//karik
        public void HistoryTab_Click(){
		//wait.until(ExpectedConditions.elementToBeClickable(HistoryTab));
		//HistoryTab.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(TheftRelevantTab).perform();
		warmup();
		act.moveToElement(HistoryTab).click().build().perform();
		act.moveToElement(searchButton).perform();
        }
	
	public void HistoryTab(){
		
		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab));
		warmup5();
		HistoryTab.click();
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_TechnicalEntryButton));
		
		HistoryTab_TechnicalEntryButton.click();
		
		warmup1();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", HistoryTab_TechnicalEntryButton);
		
		HistoryTab_TechnicalEntryButton.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_HistoryOfDependentObject_button));

		warmup1();
		
		js.executeScript("arguments[0].click();", HistoryTab_HistoryOfDependentObject_button);
		
		
		
		HistoryTab_HistoryOfDependentObject_button.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_InitialStateButton));
		
		warmup1();
		
		js.executeScript("arguments[0].click();", HistoryTab_InitialStateButton);
		
		
		warmup5();
		
	}
	
		public void HistoryTab_CurrentState(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_CurrentStateButton));

			js.executeScript("arguments[0].click();", HistoryTab_CurrentStateButton);
			warmup5();
			warmup5();
		}
		

		public String CertificationTab_DocumentKey() throws InterruptedException{
			
			warmup();
			
			wait.until(ExpectedConditions.elementToBeClickable(CertificationTab));

			CertificationTab.click();
			
			String CertificationTab_DocumentKey_ThinClient=CertificationTab_DocumentKey.getText();
			return CertificationTab_DocumentKey_ThinClient;

		}
		
		public String CertificationTab_Brand() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_Brand_ThinClient=CertificationTab_Brand.getText();
			return CertificationTab_Brand_ThinClient;

		}
		
		public String CertificationTab_Fuel() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_Fuel_ThinClient=CertificationTab_Fuel.getText();
			return CertificationTab_Fuel_ThinClient;

		}
		
		public String CertificationTab_Variant() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_Variant_ThinClient=CertificationTab_Variant.getText();
			return CertificationTab_Variant_ThinClient;

		}
		
		public String CertificationTab_SalesDesignation() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_SalesDesignation_ThinClient=CertificationTab_SalesDesignation.getText();
			return CertificationTab_SalesDesignation_ThinClient;

		}
		
		public String CertificationTab_Displayment() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_Displayment_ThinClient=CertificationTab_Displayment.getText();
			return CertificationTab_Displayment_ThinClient;

		}	
		
		public String CertificationTab_Version() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_Version_ThinClient=CertificationTab_Version.getText();
			return CertificationTab_Version_ThinClient;

		}	
		
		public String CertificationTab_ManufacturerCode() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_ManufacturerCode_ThinClient=CertificationTab_ManufacturerCode.getText();
			return CertificationTab_ManufacturerCode_ThinClient;

		}	
		
		public String CertificationTab_OutputKW() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_OutputKW_ThinClient=CertificationTab_OutputKW.getText();
			return CertificationTab_OutputKW_ThinClient;

		}	
		
		public String CertificationTab_EUapprovalNumber() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_EUapprovalNumber_ThinClient=CertificationTab_EUapprovalNumber.getText();
			return CertificationTab_EUapprovalNumber_ThinClient;

		}		
		
		public String CertificationTab_IndexOfModelCodes() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_IndexOfModelCodes_ThinClient=CertificationTab_IndexOfModelCodes.getText();
			return CertificationTab_IndexOfModelCodes_ThinClient;

		}	
		
		public String CertificationTab_EUaprovalDate() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_EUaprovalDate_ThinClient=CertificationTab_EUaprovalDate.getText();
			return CertificationTab_EUaprovalDate_ThinClient;

		}	
		
		public String CertificationTab_ExhaustGuidelines() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_ExhaustGuidelines_ThinClient=CertificationTab_ExhaustGuidelines.getText();
			return CertificationTab_ExhaustGuidelines_ThinClient;

		}	
		
		public String CertificationTab_EmissionsStandards() throws InterruptedException{
			
			warmup();
			
			String CertificationTab_EmissionsStandards_ThinClient=CertificationTab_EmissionsStandards.getText();
			return CertificationTab_EmissionsStandards_ThinClient;

		}	
		
		public void CertificationTab_TiresTab(){
			
			warmup();
			
			wait.until(ExpectedConditions.elementToBeClickable(CertificationTab_TiresTab));


			
			CertificationTab_TiresTab.click();


			warmup1();
			
		}
		
		public void ModelPlateTab(){
			
			JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
			  javaScriptExecutor.executeScript("window.scrollBy(-500,0)"); 
			  warmup6();
			  Actions actions = new Actions(driver);
			  actions.moveToElement(SAA_numbers_Tab).build().perform(); 
			  warmup6();
			  ModelPlateTab.click(); 
			  warmup1(); 
		}
		public String ModelPlateTab_PermGrossVehicleWeight(){
		
			String ModelPlateTab_PermGrossVehicleWeight_ThinClient=ModelPlateTab_PermGrossVehicleWeight.getText();
			return ModelPlateTab_PermGrossVehicleWeight_ThinClient;
			
		}
		
		public String ModelPlateTab_PermGrossCombWeight(){
			
			warmup();
			
		String ModelPlateTab_PermGrossCombWeight_ThinClien= ModelPlateTab_PermGrossCombWeight.getText();
			
			return ModelPlateTab_PermGrossCombWeight_ThinClien;
			
		}
		
		public String ModelPlateTab_Permissible_axle_loadAxle1(){
			
			warmup();
			
		String Permissible_axle_loadAxle1_ThinClien= Permissible_axle_loadAxle1.getText();
			
			return Permissible_axle_loadAxle1_ThinClien;
			
		}
		
		public String ModelPlateTab_Permissible_axle_loadAxle2(){
			
			warmup();
			
		String Permissible_axle_loadAxle2_ThinClien= Permissible_axle_loadAxle2.getText();
			
			return Permissible_axle_loadAxle2_ThinClien;
			
		}
		
		public String ModelPlateTab_Permissible_axle_loadAxle3(){
			
			warmup();
			
		String Permissible_axle_loadAxle3_ThinClien= Permissible_axle_loadAxle3.getText();
			
			return Permissible_axle_loadAxle3_ThinClien;
			
		}
		
		
		public String ModelPlateTab_Permissible_axle_loadAxle4(){
			
			warmup();
			
		String Permissible_axle_loadAxle4_ThinClien= Permissible_axle_loadAxle4.getText();
			
			return Permissible_axle_loadAxle4_ThinClien;
			
		}
		
		public String ModelPlateTab_Permissible_axle_loadAxle5(){
			
			warmup();
			
		String Permissible_axle_loadAxle5_ThinClien= Permissible_axle_loadAxle5.getText();
			
			return Permissible_axle_loadAxle5_ThinClien;
			
		}
		
		public String ModelPlateTab_Permissible_axle_loadAxle6(){
			
			warmup();
			
		String Permissible_axle_loadAxle6_ThinClien= Permissible_axle_loadAxle6.getText();
			
			return Permissible_axle_loadAxle6_ThinClien;
			
		}
		
		
		public String ModelPlateTab_Permissible_loadof_Axlegroup1(){
			
			warmup();
			
		String Permissible_loadof_Axlegroup1_ThinClien= Permissible_loadof_Axlegroup1.getText();
			
			return Permissible_loadof_Axlegroup1_ThinClien;
			
		}
		
		
public String ModelPlateTab_Permissible_loadof_Axlegroup2(){
			
			warmup();
			
		String Permissible_loadof_Axlegroup2_ThinClien= Permissible_loadof_Axlegroup2.getText();
			
			return Permissible_loadof_Axlegroup2_ThinClien;
			
		}


public String ModelPlateTab_Permissible_loadof_Axlegroup3(){
	
	warmup();
	
String Permissible_loadof_Axlegroup3_ThinClien= Permissible_loadof_Axlegroup3.getText();
	
	return Permissible_loadof_Axlegroup3_ThinClien;
	
}

public String ModelPlateTab_Permissible_loadof_Axlegroup4(){
	
	warmup();
	
String Permissible_loadof_Axlegroup4_ThinClien= Permissible_loadof_Axlegroup4.getText();
	
	return Permissible_loadof_Axlegroup4_ThinClien;
	
}

public String ModelPlateTab_Object_no_modelplate(){
	
	warmup();
	
String Object_no_modelplate_ThinClien= Object_no_modelplate.getText();
	
	return Object_no_modelplate_ThinClien;
	
}
public String ModelPlateTab_ModelDesignation(){
	
	warmup();
	
String ModelDesignation_ThinClient= ModelDesignation.getText();
	
	return ModelDesignation_ThinClient;
	
}
public String ModelPlateTab_ProductionYear(){
	
	warmup();
	
String ProductionYear_ThinClien= ProductionYear.getText();
	
	return ProductionYear_ThinClien;
	
}
public String ModelPlateTab_ProductionMonth(){
	
	warmup();
	
String ProductionMonth_ThinClien= ProductionMonth.getText();
	
	return ProductionMonth_ThinClien;
	
}
public String ModelPlateTab_LowBeamLightBundle(){
	
	warmup();
	
String LowBeamLightBundle_ThinClien= LowBeamLightBundle.getText();
	
	return LowBeamLightBundle_ThinClien;
	
}
public String ModelPlateTab_PaintBottom(){
	
	warmup();
	
String PaintBottom_ThinClien= PaintBottom.getText();
	
	return PaintBottom_ThinClien;
	
}
public String ModelPlateTab_DieselSmokeCoefficient() {
	warmup();
	
	String DieselSmokeCoefficient_ThinClien= DieselSmokeCoefficient.getText();
		
		return DieselSmokeCoefficient_ThinClien;
}
public String ModelPlateTab_EUapprovalnumber(){
	
	warmup();
	
String EUapprovalnumber_ThinClien= EUapprovalnumber.getText();
	
	return EUapprovalnumber_ThinClien;
	
}
public void EquipmentTab_PaintsTable(){
	
//	warmup();
//	
//    JavascriptExecutor js=(JavascriptExecutor)driver;
//
//	
//	WebElement ITab=driver.findElement(By.xpath("//li[@data-ng-show='viewControl.VehicleIdentificationArrangement.visible']"));
//	
//	js.executeScript("arguments[0].scrollIntoView();", ITab);
	
	warmup5();
	
	WebElement MajorAssemblies=driver.findElement(By.xpath("//li[contains(@data-ng-show,'viewControl.VehicleMajorAssembliesArrangement.visible')]"));

	Actions a=new Actions(driver);
	
	a.moveToElement(MajorAssemblies).build().perform();

	warmup5();
	
	wait.until(ExpectedConditions.elementToBeClickable(EquipmentTab));
	
	warmup();
	
	EquipmentTab.click();

//	js.executeScript("arguments[0].click();", EquipmentTab);

//	EquipmentTab.click();
		
	wait.until(ExpectedConditions.visibilityOf(EquipmentTab_PaintsTable));
	warmup();

	EquipmentTab_PaintsTable.click();
}

public void EquipmentsTab_TiresTable(){
	
	warmup5();
    JavascriptExecutor js=(JavascriptExecutor)driver;

    
	wait.until(ExpectedConditions.visibilityOf(EquipmentTab_TiresTable));
	
	js.executeScript("arguments[0].click();", EquipmentTab_TiresTable);

	
//	EquipmentTab_TiresTable.click();
	
	warmup5();
	

	Actions a=new Actions(driver);
	
	a.moveToElement(EquipmentTab).build().perform();

	
}

		public void ElectricalVariantsTab(){
			
			warmup5();
			
			wait.until(ExpectedConditions.visibilityOf(ElectricalVariantsTab));
			ElectricalVariantsTab.click();
			warmup();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(ElectricalVariantsTab).build().perform();
			
			warmup5();
			
//			ElectricalVariantsTabContents.getText();
			
				
			
		}
		
		public String ElectricalVariantsTabContents(){
			
			warmup();
			
			String expectedVehicleCode = null;
			
//	String contents=ElectricalVariantsTabContents.getText();
	
//	List<WebElement> contents=driver.findElements(By.xpath("(//span[contains(@data-ng-bind-html,'viewDataObject.consolidatedProductData.equipmentCode | codeLineFormatter : this')])[2]"));
	
	for(WebElement contents: ElectricalVariantsTabContents ){
		 expectedVehicleCode=contents.getText();
		System.out.println(expectedVehicleCode);
		
		}
	return expectedVehicleCode;
	
		}
		
		
		public String ElectricalVariantDesignation(){
			
			warmup();
			
		String DesignationContents=	ElectricalVariantDesignation.getText();
		
		return DesignationContents;
		
		}
		
		public void TechnicalDataTab(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(TechnicalData_Tab));

			TechnicalData_Tab.click();
			
		}
		public String TechnicalData_Tab_SpeedometerCorrectionValue(){
			
			warmup();
			
			String SpeedometerCorrectionValu_ThinClien=	TechnicalData_Tab_SpeedometerCorrectionValue.getText();
			
			return SpeedometerCorrectionValu_ThinClien;
		}
		
		public String TechnicalData_Tab_PulseValue(){
			
			warmup();
			
			String TechnicalData_Tab_PulseValue_ThinClien=	TechnicalData_Tab_PulseValue.getText();
			
			warmup5();
			

			Actions a=new Actions(driver);
			
			a.moveToElement(TechnicalData_Tab).build().perform();
			warmup();
			
			return TechnicalData_Tab_PulseValue_ThinClien;

			
			
			
		}
		
            
		public void PlantTextTab(){
			
			warmup5();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(ControlUnitTab).build().perform();
			
			wait.until(ExpectedConditions.visibilityOf(PlantTextTab));
			
			warmup();
			
			PlantTextTab.click();
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(PlantTextTabSort));

			
			PlantTextTabSort.click();	
			
			warmup5();
			
			
		}
		
		
		public void InternalTextTab(){
			
			warmup5();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(ControlUnitTab).build().perform();
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(InternalTextTab));
			
			InternalTextTab.click();
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(InternalTexttab_Sort));
			
			InternalTexttab_Sort.click();
			
			warmup5();
			
			
			
			
		}
		
		public void FactoryAdditionTab_SpecialTruckVehicle(){
			
			warmup5();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(ControlUnitTab).build().perform();
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(FactoryAdditionTab));

			
			FactoryAdditionTab.click();
			
			warmup5();
			
			wait.until(ExpectedConditions.visibilityOf(FactoryAdditionTab_Sort));

			
			FactoryAdditionTab_Sort.click();
			
			warmup5();
			
			
		}
		
		public void LoggingTab(){
			
			
			warmup5();
			
			Actions a=new Actions(driver);
			
			a.moveToElement(ControlUnitTab).build().perform();
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(LoggingTab));

			LoggingTab.click();
			
			wait.until(ExpectedConditions.visibilityOf(LoggingTab_SearchButton));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			warmup();

			js.executeScript("arguments[0].click();", LoggingTab_SearchButton);
			
			warmup();
		//	LoggingTab_FilterButton.click();
			
			wait.until(ExpectedConditions.visibilityOf(LoggingTab_Sort));

			
			LoggingTab_Sort.click();
			
			warmup5();
		}
		
		public void Edit_Basic_Data(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(Edit_Basic_Data));

			
			Edit_Basic_Data.click();
		}
		
		public void OrderNumber_Edit(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(OderNumber_Edit));

			
			OderNumber_Edit.click();
			
			OderNumber_Edit.clear();
			
			OderNumber_Edit.sendKeys("1111111120");
		}
		
		public void VINNumber_Edit(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(VinNumberEdit));

			
			VinNumberEdit.click();
			
			VinNumberEdit.clear();
			
			VinNumberEdit.sendKeys(RandomVINNumber);
		}
		
		public void ProductionNumber_Edit(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(ProductionNumber_Edit));

			
			ProductionNumber_Edit.click();
			
			ProductionNumber_Edit.clear();
			
			ProductionNumber_Edit.sendKeys("1111121");
		}
		
		public void CancelChanges(){
			warmup5();
			warmup5();
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", Save_Changes);
			warmup5();
			js.executeScript("arguments[0].click();", Save_Changes);
			warmup5();
			warmup5();
			Save_Changes.click();
			
			try{
				//button[contains(@ng-show,'closeable')]
				warmup();
				
				wait.until(ExpectedConditions.visibilityOf(TechnicalError_Dialog));
				
				TechnicalError_Dialog.click();
			}catch(Exception e){
				
				System.out.println("Technical error is displayed");
			}
			
			try{
				
				warmup5();
				warmup5();
				ClearingOption_Button.click();
				warmup5();
				warmup5();
				Modal_Dialog_Ok_Button.click();
				
			}catch (Exception e){
				
				System.out.println("Modal dialog is displayed");
				
			}
		}
		
		public void FIN_Stamping_Button(){
			
			warmup();
			
			wait.until(ExpectedConditions.visibilityOf(FIN_Stamping_Button));
			
			FIN_Stamping_Button.click();
			
			try{
				
				driver.findElement(By.xpath("//button[contains(@data-ng-click,'cancelAction($event)')]")).click();;
				
			}catch (Exception e){
				
				System.out.println("Modal dialog is displayed");
				
			}
			
			
		}
		
		public void Fin_Stamping_Checkbox(){
			
			warmup();
			
			driver.findElement(By.xpath("//button[contains(@ng-click,'showHideTechnicalErrorDetails()')]")).click();
			
			wait.until(ExpectedConditions.visibilityOf(Fin_Stamping_Checkbox));
			
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
//			js.executeScript("arguments[0].scrollIntoView();", Save_Changes);
			js.executeScript("arguments[0].click();", Fin_Stamping_Checkbox);

			
			Fin_Stamping_Checkbox.click();
		}
		
		public void EditCustomizedVehicleType(){
			
			warmup();
			
			Edit_VehicleType_button.click();
			
			warmup();
			
			EditCustomizedVehicleType.click();
			
			EditCustomizedVehicleType.clear();
			
			EditCustomizedVehicleType.sendKeys("Truck Created from Postman tool");
		}
		
		public void Edit_ProductionPlant(){
			
			warmup();
			
			Edit_ProductionPlant.click();
			
			Select s=new Select(Edit_ProductionPlant);
			
			s.selectByValue("string:P6010");
			
		}
		
		public void RepositionMajorAssembly_button(){
			
			warmup5();
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", RepositionMajorAssembly_button);

			
			js.executeScript("arguments[0].click();", RepositionMajorAssembly_button);
		}
		
		public void EngineID_Edit(){
			warmup5();
			wait.until(ExpectedConditions.visibilityOf(EngineID_Edit));
			warmup5();
			EngineID_Edit.click();
			warmup5();
			EngineID_text.clear();
			warmup5();
			warmup5();
			EngineID_text.sendKeys(RandomEngineNumber);

		}
		
		public void Exhaust_Aftertreatment_EditButton(){
			
			warmup5();
			
            JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", MajorAssmeblyTab);
			
			warmup5();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			warmup5();
			
			wait.until(ExpectedConditions.visibilityOf(Exhaust_Aftertreatment_EditButton));
			warmup5();
			Exhaust_Aftertreatment_EditButton.click();
			
			warmup5();
			
			wait.until(ExpectedConditions.visibilityOf(Exhaust_Aftertreatment_text));
			
			warmup5();
			
			Exhaust_Aftertreatment_text.clear();
			
			warmup5();
			
			Exhaust_Aftertreatment_text.sendKeys(RandomExhaustAftertreatmentNumber);
			warmup5();
		}
		
		public void Save_Changes_MajorAssemblies(){
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(Save_Changes_MajorAssemblies));
			warmup5();
			Save_Changes_MajorAssemblies.click();
			warmup5();
			WebElement closeError=driver.findElement(By.xpath("//*[@id='mainwrapper']/div[4]/div/div[2]/button"));
			closeError.click();
			WebElement cancelclick=driver.findElement(By.xpath("//*[@id='VehicleSearchFoot_000']/div/div[2]/form/div[2]/div/div/button[2]"));
			cancelclick.click();
			warmup5();
			driver.switchTo().alert().accept();
			System.out.println("Alert popup accepted");
			warmup6();
		}
		public void onlySave(){
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(Save_Changes_MajorAssemblies));
			warmup5();
			Save_Changes_MajorAssemblies.click();
		}
       public void SaveChanges_RepositionMajorAssemblies(){
			
			warmup5();
			
			wait.until(ExpectedConditions.elementToBeClickable(Save_Changes_MajorAssemblies));
			warmup5();
			Save_Changes_MajorAssemblies.click();
			
			warmup5();
		}
		
		public void TransmissionEdit_button(){

			warmup5();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			TransmissionNumber_button.click();
			
			warmup5();
			
			TranimissionNumber_text.clear();
			warmup5();
			TranimissionNumber_text.sendKeys(RandomTransmissionNumber);
			warmup5();
			TranimissionNumber_text.sendKeys(Keys.TAB);
			warmup5();
			Transmission_ObjectNumber_Edit.clear();
			warmup5();
			Transmission_ObjectNumber_Edit.sendKeys(RandomTransmissionVariantNumber_Length);
			warmup5();
		}
		public void FrontAxle2_Edit(){
			
	        warmup1();
				
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			FrontAxle2_Edit.click();
			
			warmup5();
			
			FrontAxle2_text.clear();
			warmup5();
			FrontAxle2_text.sendKeys(RandomFrontAxle2Number);
			warmup();
			FrontAxle2_text.sendKeys(Keys.TAB);
			warmup5();
			FrontAxle2_ObjectNumber_text.clear();
			warmup();
			FrontAxle2_ObjectNumber_text.sendKeys(RandomFrontAxle2ObjectNumber);
			
			
		}
		
		public void RearAxle3_Edit(){
			
	        warmup1();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			RearAxle3_Edit.click();
			warmup5();
			RearAxle3_text.clear();
			
			warmup5();
			
			RearAxle3_text.sendKeys(RandomRearAxle3Number);
			
			warmup5();
			
			RearAxle3_text.sendKeys(Keys.TAB);
			
			warmup5();
			
			RearAxle3_ObjectNumber_text.sendKeys(RandomRearAxle3ObjectNumber);
		}
		
		public void RearAxle3_Delete(){
			
	        warmup1();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			RearAxle3_Delete.click();
		}
		
		
           public void RearAxle4_Edit(){
			
	        warmup1();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			RearAxle4_Edit.click();
			
			RearAxle4_text.clear();
			
			warmup5();
			
			RearAxle4_text.sendKeys(RandomRearAxle4Number);
			
			warmup5();
			
			RearAxle4_text.sendKeys(Keys.TAB);
			
			warmup5();
			
			RearAxle4_ObjectNumber_text.sendKeys(RandomRearAxle4ObjectNumber);
		}
		public void RearAxle4_Delete(){
			
	        warmup1();
			
			RepositionMajorAssembly_button.click();
			
			warmup5();
			
			RearAxle4_Delete.click();
		}
		
		public void PlantMajorAssemblies_Tab(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", PlantMajorAssemblies_Tab);
			js.executeScript("arguments[0].click();", PlantMajorAssemblies_Tab);
			warmup5();
			warmup5();
			WebElement plantData=driver.findElement(By.xpath("//*[@id='VehicleMajorAssembly_021']/div/div[2]/form/div[3]/div"));
			plantData.getText();
//			PlantMajorAssemblies_Tab_Edit.click();
//
//			warmup5();
//
//			PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.click();
//			warmup5();
//			warmup5();
//			PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.clear();
//			warmup5();
//			warmup5();
//			PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.sendKeys(RandomExhaustAftertreatmentNumber);
//
//			warmup5();
//
//			PlantMajorAssemblies_Tab_RearAxle4_text.click();
//			warmup5();
//			PlantMajorAssemblies_Tab_RearAxle4_text.clear();
//			warmup5();
//			PlantMajorAssemblies_Tab_RearAxle4_text.sendKeys(RandomRearAxle4Number);
//
//			warmup5();
//
//			PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.click();
//			warmup5();
//			PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.clear();
//			warmup5();
//			PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.sendKeys(RandomRearAxle4ObjectNumber);
		}
		
		public void AlternativeDriveTab(){
			
			warmup5();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", AlternativeDrive);
			warmup5();
			js.executeScript("arguments[0].click();", AlternativeDrive);
			
			warmup5();
			
			js.executeScript("arguments[0].click();", AlternateDrive_EditMajorAssemblies_button);

			warmup5();
			AlternateDrive_EditMajorAssemblies_Editbutton.click();
			
			warmup5();
			
			ElectricMotorNumber1_text.click();
			warmup5();
			ElectricMotorNumber1_text.clear();
			warmup5();
			ElectricMotorNumber1_text.sendKeys(RandomElectricMotor1Number);
			warmup5();
			ElectricMotorNumber1_text.sendKeys(Keys.TAB);
			
			warmup5();
			
			ElectricMotorNumber2_text.sendKeys(RandomElectricMotor2Number);	
			
			
			
		}
		
		public void MasterDataModule(){
			
			warmup();
			
			wait.until(ExpectedConditions.elementToBeClickable(MasterDataModule));
			
			MasterDataModule.click();
			
			warmup();
			
			wait.until(ExpectedConditions.elementToBeClickable(VPDIDs_Tab));
			
			VPDIDs_Tab.click();
			
			warmup();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
//			js.executeScript("arguments[0].scrollIntoView();", AlternativeDrive);

			
			js.executeScript("arguments[0].click();", VPDIDs_ShowButton_Click);
			
			warmup1();
			
			js.executeScript("arguments[0].click();", MasterDataModule_CreateVPDID_Code);
			
			
			wait.until(ExpectedConditions.visibilityOf(MasterDataModule_text));
			
			warmup();
			
			MasterDataModule_text.sendKeys(RandomAddVPDCode);
			
			wait.until(ExpectedConditions.elementToBeClickable(MasterDataModule_SaveCode));
			
			MasterDataModule_SaveCode.click();
			
			MasterDataModule_SaveCode_button.click();
			
			warmup4();
			
						
			
		}
		
		public void VPDandSerialNumberTab_WriteAccess(){
			
			warmup1();
			
			wait.until(ExpectedConditions.elementToBeClickable(VehicleData));
			
			VehicleData.click();
			
			warmup();
			
			
		
			
			searchInput.sendKeys("WDB9634272L898132");
			searchButton.click();
			
			warmup1();
			
			wait.until(ExpectedConditions.elementToBeClickable(VPD_SerialNumberTab));
			VPD_SerialNumberTab.click();
			
			try{
				
				if(driver.findElement(By.xpath("//*[contains(text(),'Serial numbers')]")).isDisplayed()){
					driver.findElement(By.xpath("//*[contains(text(),'Serial numbers')]")).click();
					System.out.println("Serial Number Tab is present");
				}
			}
			catch (Exception NoSuchElementException)
			{
			    System.out.println("Serial Number Tab isn't present");
			}

				
				warmup();
				
				JavascriptExecutor js=(JavascriptExecutor)driver;
				
				js.executeScript("arguments[0].click();", VPD_AddVPD_button);
				
				warmup();
				
				VPD_AddVPD_text.click();
				
				VPD_AddVPD_text.clear();
				
				
				
				VPD_AddVPD_text.sendKeys(RandomAddVPDCode);
				
				VPD_AddVPD_text.sendKeys(Keys.TAB);
				
				warmup();
				
				VPD_AddContent.sendKeys(RandomAddVPDContent);

				
				warmup();
				
				VPDCode_Save.click();
				
	//			warmup();
				
	//			Save_Changes_MajorAssemblies.click();
				
		
	}
		

		//SWVARAD
		public  void  clickaddRemoveSaaButton() {
			warmup1();
			searchInput.click();;
			wait.until(ExpectedConditions.elementToBeClickable(addRemoveSaaButton));
			warmup1();
			addRemoveSaaButton.click();
		}

		public void invalidSaaNumbers() {
			saaData.sendKeys("50623936L");
		}
		
		public void enterSaaNumberLine1() {
			saaData.sendKeys("50585372");
			saaData.sendKeys(Keys.ENTER);
			}
		
		public void enterSaaNumberLine2() {
			saaData.sendKeys("50581321,50585382;50585339");
		}
		
		public void saaNumberPlus() {
			saaNumber_Plus.click();
//			saaNumber_Plus.click();
//			saaNumber_Plus.click();
			}

		public  void goButton() {
			wait.until(ExpectedConditions.elementToBeClickable(go));
			go.click();
		}

		public  void goToAssignment() {
			wait.until(ExpectedConditions.elementToBeClickable(goToAssignment));
			warmup5();
			goToAssignment.click();
		}

		public void usageDropdownValues() throws InterruptedException
		{
			element1.click();
			chassis.click();
			
			row2.click();
			element2.click();
			chassisRow2.click();
		
	        row3.click();
			element3.click();
			element3.sendKeys(Keys.ARROW_DOWN);
			element3.sendKeys(Keys.ENTER);
	    	
			row4.click();
			element4.click();
			element4.sendKeys(Keys.ARROW_DOWN);
			element4.sendKeys(Keys.ENTER);
			
			row5.click();
			element5.click();
			element5.sendKeys(Keys.ARROW_DOWN);
			element5.sendKeys(Keys.ARROW_DOWN);
			element5.sendKeys(Keys.ENTER);
			
//			row6.click();
//			element6.click();
//			element6.sendKeys(Keys.ARROW_DOWN);
//			element6.sendKeys(Keys.ARROW_DOWN);
//			element6.sendKeys(Keys.ENTER);
//			
//			row7.click();
//			element7.click();
//			element7.sendKeys(Keys.ARROW_DOWN);
//			element7.sendKeys(Keys.ARROW_DOWN);
//			element7.sendKeys(Keys.ENTER);
		}
		

		public void apply()
		{
			apply.click();
		}

		public void save() throws InterruptedException
		{
			warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		warmup1();
		}

		public void scrollToSaaNumber1() {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView();", checkSaaNumber1);
		}
		
		public boolean checkSaaNumber1(){
			if (checkSaaNumber1.isDisplayed()) {
				return true;
			}else {
			return false;
			}
		}

		public void scrollToSaaNumber2() {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView();", checkSaaNumber2);
		}

		public boolean checkSaaNumber2() {
			if (checkSaaNumber2.isDisplayed()) {
				return true;
			}else {
			return false;
			}
		}
		

		public void scrollToSaaNumber3() {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView();", checkSaaNumber3);
		}
		
		public boolean checkSaaNumber3() {
			if (checkSaaNumber3.isDisplayed()) {
				return true;
			}else {
			return false;
			}
		}
		
		public void scrollToSaaNumber4() {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView();", checkSaaNumber4);
		}
		
		public boolean checkSaaNumber4() {
			if (checkSaaNumber4.isDisplayed()) {
				return true;
			}else {
			return false;
			}
		}

		public void clickOnAddRemoveSaaButton() throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
			 js.executeScript("arguments[0].scrollIntoView();", addRemoveSaaButton);
			 js.executeScript("arguments[0].scrollIntoView();", plus_SaaNumber);
			warmup6();
			saaPlus.click();
		}

		public void scrollLeftSaaNumberspage() throws InterruptedException {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
			 js.executeScript("arguments[0].scrollIntoView();", addRemoveSaaButton);
			 js.executeScript("arguments[0].scrollIntoView();", plus_SaaNumber);
			 }
		
		public void continueToDeletions()  {
		continueToDeletions.click();
		}

		public void remove()  {
			remove.click();
		}

		public void continueToAssignments()  {
			continueToAssignments.click();
		}	
		
		public void copypaste() throws InterruptedException  {
			saaData.sendKeys(Keys.CONTROL+"A");
			saaData.sendKeys(Keys.CONTROL+"C");
			saaData.sendKeys(Keys.BACK_SPACE);
			saaData.sendKeys(Keys.CONTROL+"V");
		}

		public void navigation() throws InterruptedException {
			Actions actions = new Actions(driver);
			actions.moveToElement(SAA_numbers_Tab).build().perform();
			warmup6();
			navigation.click();
		}
		public boolean existingMapVersionTableData() throws InterruptedException {
				Thread.sleep(8000);
				if (existingMapVersionTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public String emvMapVersionGetData() {
			String emvMapVersion = emvMapVersionData.getText();
			return emvMapVersion;
			}
		
		public String emvDvdData() {
			String emvDvdObjectNumber = emvDvdData.getText();
			return emvDvdObjectNumber;
		}
		
		public String emvLicenseData() {
			String emvLicenseObjectNumber = emvLicenseData.getText();
			return emvLicenseObjectNumber;
		}
		
		
		public boolean possibleMapVersionTableData() {
if (possibleMapVersionTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean navigationcompIdentifierTableData() {
if (navigationcompIdentifierTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean informationTableData() {
			warmup1();
if (informationTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean dgTableFOTableData() {
if (dgTableFOTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public String pmvMapVersionData() {
			String pmvMapVersion = pmvMapVersionData.getText();
			return pmvMapVersion;
		}
		
		public String pmvDvdData() {
			String pmvDvdObjectNumber = pmvDvdData.getText();
			return pmvDvdObjectNumber;
		}
		
		public String pmvLicenseData() {
			String emvLicenseObjectNumber = pmvLicenseData.getText();
			return emvLicenseObjectNumber;
		}
		
		public String developmentStatusData() {
			String developmentStatus = developmentStatusData.getText();
            return developmentStatus;
		}
		
		public String softwareIdData() {
			String softwareId = softwareIdData.getText();
            return softwareId;
		}
		
		public String majorVersionNoData() {
			String majorVersionNo = majorVersionNoData.getText();
            return majorVersionNo;
		}
		
		
		public String minorVersionNoData() {
			String minorVersionNo = minorVersionNoData.getText();
            return minorVersionNo;
		}
		
		public String regionData() {
			String region = regionData.getText();
            return region;
		}
		
		public List<WebElement> getRows(){
			if(fetchRows != null && ! fetchRows.isEmpty())
				return fetchRows;
			else
				return new ArrayList<>();
		}
		
		public void foTexts() throws InterruptedException {
			warmup5();
//			JavascriptExecutor js=(JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", foTexts);
//			warmup1();
			foTexts.click();
		}
		
		public List<WebElement> dgTableFoFetchRows(){
			if(dgTableFoFetchRows != null && ! dgTableFoFetchRows.isEmpty())
				return dgTableFoFetchRows;
			else
				return new ArrayList<>();
		
		}
		
		public boolean foTableData() {
if (foTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
		
		public boolean prodOptionTableData() {
if (prodOptionTableData.isDisplayed()) {
				return true;
			} else {
				return false;
			}
		}
			
		public boolean prodOrderPosTextTableData() {
			if (prodOrderPosTextTableData.isDisplayed()) {
							return true;
						} else {
							return false;
						}
					}
						
		
		
		public List<WebElement> foTableFetchRows(){
			if(foTableFetchRows != null && ! foTableFetchRows.isEmpty())
				return foTableFetchRows;
			else
				return new ArrayList<>();
		
		}
		
		public List<WebElement> emvFetchRows(){
			if(emvFetchRows != null && ! emvFetchRows.isEmpty())
				return emvFetchRows;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> pmvFetchRows(){
			if(pmvFetchRows != null && ! pmvFetchRows.isEmpty())
				return pmvFetchRows;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> nciFetchRows(){
			wait.until(ExpectedConditions.elementToBeClickable(addActivationcodeInfo));
			if(nciFetchRows != null && ! nciFetchRows.isEmpty())
				return nciFetchRows;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> navigation1(){
			if(navigation1 != null && ! navigation1.isEmpty())
				return navigation1;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> navigation2(){
			if(navigation2 != null && ! navigation2.isEmpty())
				return navigation2;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> navigation3(){
			if(navigation3 != null && ! navigation3.isEmpty())
				return navigation2;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> licenseKeyFetchRows(){
			if(licenseKeyFetchRows != null && ! licenseKeyFetchRows.isEmpty())
				return licenseKeyFetchRows;
			else
				return new ArrayList<>();
		}
		
		public boolean warningIcon() {
			if (warningIcon.isDisplayed()) 
			{
				return true;
			}
			else 
			{
			return false;
			}
		}
		
		public void mouseMoveWarningMessage() throws InterruptedException {
		     warningIcon.click();
		     Thread.sleep(5000);
			 Actions actions = new Actions(driver);
			 actions.moveToElement(warningIcon).build().perform();
			 actions.moveToElement(addWarningMessage).build().perform();
		}
		
		public void mouseMoveDeleteWarningMessage() throws InterruptedException {
		     warningIcon.click();
		     Thread.sleep(5000);
			 Actions actions = new Actions(driver);
			 actions.moveToElement(warningIcon).build().perform();
			 actions.moveToElement(deleteWarningMessage).build().perform();
		}
		
		public String addWarningMessage() {
			String warningMsg=addWarningMessage.getText();
			return warningMsg;
		}
		
		public String deletewarningMessage() {
			String warningMsg=deleteWarningMessage.getText();
			return warningMsg;
		}
		
		public void clearSaaData() {
		     saaData.clear();
		}
		
		public void plantTextTab () throws InterruptedException {
			JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
			javaScriptExecutor.executeScript("window.scrollBy(-500,0)");
			warmup6();
			 Actions actions = new Actions(driver);
			 actions.moveToElement(SAA_numbers_Tab).build().perform();
			warmup6();
			plantText.click();
			 warmup1();
		}
		public void loggingTab() throws InterruptedException {
			String downloadPath = "C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads";
			JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
			javaScriptExecutor.executeScript("window.scrollBy(-500,0)");
			 warmup6();
			 Actions actions = new Actions(driver);
			 actions.moveToElement(SAA_numbers_Tab).build().perform();
			 warmup6();
			 logging.click();
			 warmup5();
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView();", searchLogging);
			 js.executeScript("arguments[0].click();", searchLogging);
			 warmup6();
			 wait.until(ExpectedConditions.elementToBeClickable(exportLogging));
			 js.executeScript("arguments[0].click();", exportLogging);
			 String fileName= GetDownloadedFileName_NewTab(4, 1);
			 int dataCountInCSV= getRecordsCountInCSV(fileName);
			 System.out.println("Verifying total records in table with number of entries in csv");
			 Assert.assertEquals(getNumberOfEntries(), dataCountInCSV);
		}
		public int getNumberOfEntries() throws InterruptedException {
			//String entriesTxt = totalRecordsLogging();
			//String[] aEntriesText = entriesTxt.split(" / ");
			//System.out.println(aEntriesText.length);
			//String totalEntriesText = aEntriesText[1];
			//int i=Integer.parseInt(totalEntriesText);
			//System.out.println(totalEntriesText);
			ClickOnDataCountLink();
			int i= GetDataCountfromLink();
			return i;
		}
		 public int getNumberOfEntries_DataValidation() throws InterruptedException {
			 	String entriesTxt = DataValidationTab_TotalRecords();
//				String[] aEntriesText = entriesTxt.split(" / ");
//				System.out.println(aEntriesText.length);
//				String totalEntriesText = aEntriesText[1];
				int i=Integer.parseInt(entriesTxt);
				return i;
			}
		 public String DataValidationTab_TotalRecords() {
				String records=DataValidationTab_TotalRecords.getText().trim();
				warmup6();
				System.out.println(records);
				return records;	} 
		//KELKARK
		 @FindBy(xpath = "//a[contains(@data-ng-click,'viewDataObject.logEntry.length')]")
			WebElement clickOnDataCountLink;
		 
		 public void ClickOnDataCountLink() throws InterruptedException {
			 warmup6();
			 clickOnDataCountLink.click();
			 warmup6();
			}
		 public int GetDataCountfromLink() throws InterruptedException {
			 warmup6();
			 String count= clickOnDataCountLink.getText();
			 int c=Integer.parseInt(count);
			 return c;
			}
		public String GetDownloadedFileName_NewTab(int DownloadWindo, int RevertWindo){
	    	warmup5();
	    	JavascriptExecutor js= ((JavascriptExecutor)driver);
	    	js.executeScript("window.open()");
	   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
	   		driver.switchTo().window(opentabs.get(DownloadWindo));//6   1for dataError  /wexportlogs 4
	   		//driver.get("C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads");
			driver.get("C:\\Users\\deenara\\Downloads");
	   		warmup6();
	   		dateModified_columnHeader.click();
	   		warmup6();
	   		String name= getRow1_dateModified.getText();
	   		System.out.println("file name-"+name);
	   		driver.close();
	   		driver.switchTo().window(opentabs.get(RevertWindo));//1   0      /1
	   		return name;
	    	}
		public void searchLogging() throws InterruptedException {
			fromDateLogging.clear();
			fromDateLogging.sendKeys("08/01/2023");
			toDateLogging.clear();
			toDateLogging.sendKeys("09/01/2023");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();", searchLogging);
			js.executeScript("arguments[0].click();", searchLogging);
			warmup6();
			moveToAlertBoxCloseAndClick();
			warmup6();
			js.executeScript("arguments[0].scrollIntoView();", searchLogging);
			js.executeScript("arguments[0].click();", searchLogging);
			warmup6();
			filterLogging.click();
			warmup();
			searchbarFilterLogging.sendKeys("33");
			warmup5();
		}
		public String accessedTimeLogging() throws InterruptedException {
			 String AccessedTime=accessedTimeLogging.getText();
			 return AccessedTime;
		}
		public String UserIDLogging() throws InterruptedException {
			 String UserID=UserIDLogging.getText();
			 return UserID;
		}
		public String FirstNameLogging() throws InterruptedException {
			 String FirstName=FirstNameLogging.getText();
			 return FirstName;
		}
		public String LastNameLogging() throws InterruptedException {
			 String LastName=LastNameLogging.getText();
			 return LastName;
		}
		public String accessedTypeLogging() throws InterruptedException {
			 String accessedType=accessedTypeLogging.getText();
			 return accessedType;
		}
		public String accessedDataLogging() throws InterruptedException {
			 String AccessedData=accessedDataLogging.getText();
			 return AccessedData;
		}
		public void cancelsearchLogging() throws InterruptedException {
			cancelFilterLogging.click();
		}
		public int getRecordsCountInCSV(String csvFileName) {
    		//String downloadPath = "C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads";
			String downloadPath = "C:\\Users\\deenara\\Downloads";
    		int lineNumberCount = 0;
    		try {
    			if (!csvFileName.isEmpty() || csvFileName != null) {
    				String filePath =	downloadPath + System.getProperty("file.separator") + csvFileName;
    				System.out.println(filePath);
    				File file = new File(filePath);
    				if (file.exists()) {
    					System.out.println("File found :" +csvFileName);
    					FileReader fr = new FileReader(file);
    					LineNumberReader linenumberreader = new LineNumberReader(fr);
    					while (linenumberreader.readLine() != null ) {
    						lineNumberCount++;
    					}
    					//To remove the header
    					lineNumberCount=lineNumberCount-1;
    					System.out.println("Total number of lines found in csv : " + (lineNumberCount));
    					linenumberreader.close();
    				} else {
    					System.out.println("File does not exists");
    				}
    			}
    		}
    		catch (IOException e) {
    			e.printStackTrace();
    		}return lineNumberCount;
    	}
		public String totalRecordsLogging() {
				String records=totalRecordsLogging.getText().trim();
				System.out.println(records);
				return records;	
		} 
public void PDF() throws InterruptedException, IOException {
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.elementToBeClickable(PDFIcon));
			js.executeScript("arguments[0].click();", PDFIcon);
			VPDPDF.click();
			ControlUnitsPDF.click();
			ModificationHistoryPDF.click();
			okPlantTexts.click();
			warmup1();
			String fileName= GetDownloadedFileName_PDF();
			String url= getRecordsPDF(fileName);
			Vehicledata_PDF(url);
			warmup6();
			String FINFromPDF=getPdfContent(url);
			String StatusFromPDF=getPdfContent(url);
			String OrderFromPDF=getPdfContent(url);
			String EngineFromPDF=getPdfContent(url);
			String PaintCodeFromPDF=getPdfContent(url);
			String CodeFromPDF=getPdfContent(url);
			String CodesFromPDF=getPdfContent(url);
			String VPDIdentFromPDF=getPdfContent(url);
			String DesignationFromPDF=getPdfContent(url);
			String DiogenesShortNameFromPDF=getPdfContent(url);
			String ObjectTypeFromPDF=getPdfContent(url);
			String NewValueFromPDF=getPdfContent(url);
//			 System.out.println("Verifying data from PDF");
//			 Assert.assertTrue(FINFromPDF.contains("WEB41058013103813"));
//			 Assert.assertTrue(StatusFromPDF.contains("Delivered"));
//			 Assert.assertTrue(OrderFromPDF.contains("8 7 292 00321"));
//			 Assert.assertTrue(EngineFromPDF.contains("699301 C0 009337"));
//			 Assert.assertTrue(PaintCodeFromPDF.contains("9139"));
//			 Assert.assertTrue(CodeFromPDF.contains("292L"));
//			 Assert.assertTrue(CodesFromPDF.contains("ZY8"));
//			 Assert.assertTrue(VPDIdentFromPDF.contains("00012"));
//			 Assert.assertTrue(DesignationFromPDF.contains("Rack-and-Pinion Steering"));
//			 Assert.assertTrue(VPDIdentFromPDF.contains("80018"));
//			 Assert.assertTrue(DesignationFromPDF.contains("Renault Transmission Item Number"));
//			 Assert.assertTrue(DiogenesShortNameFromPDF.contains("ADAS"));
//			 Assert.assertTrue(DesignationFromPDF.contains("ADAS Advanced Driver Assistance Systems"));
//			 Assert.assertTrue(DiogenesShortNameFromPDF.contains("SMV"));
//			 Assert.assertTrue(DesignationFromPDF.contains("SAM-V SAM-Modul vorn"));
//			 Assert.assertTrue(ObjectTypeFromPDF.contains("ControlUnitStateType"));
//			 Assert.assertTrue(NewValueFromPDF.contains("2139014109M090H3848150"));
		}
public void ControlUnit_PDF() throws InterruptedException, IOException {
	PARControlUnit.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	wait.until(ExpectedConditions.elementToBeClickable(PDFIcon));
	js.executeScript("arguments[0].click();", PDFIcon);
	SAANumbersPDF.click();
	PlantTextsPDF.click();
	ControlUnitsPDF.click();
	EngineControlUnitPDF.click();
	ModificationHistoryPDF.click();
	okPlantTexts.click();
	warmup1();
	String fileName= GetDownloadedFileName_PDF();
	String url= getRecordsPDF(fileName);
	ControlUnit_PDF(url);
	warmup6();
	String FINFromPDF=getPdfContent(url);
	String StatusFromPDF=getPdfContent(url);
	String OrderFromPDF=getPdfContent(url);
	String EngineFromPDF=getPdfContent(url);
	String TransmissionFromPDF=getPdfContent(url);
	String ElectricalVariantFromPDF=getPdfContent(url);
	String DesignationFromPDF=getPdfContent(url);
	String CodeFromPDF=getPdfContent(url);
	String PaintCodeFromPDF=getPdfContent(url);
	String SAANumberFromPDF=getPdfContent(url);
	String PlantTextFromPDF=getPdfContent(url);
	String DiogenesShortNameFromPDF=getPdfContent(url);
	String ObjectTypeFromPDF=getPdfContent(url);
	String NewValueFromPDF=getPdfContent(url);
//	 System.out.println("Verifying data from PDF");
//	 Assert.assertTrue(FINFromPDF.contains("WEB41058013103813"));
//	 Assert.assertTrue(StatusFromPDF.contains("Delivered"));
//	 Assert.assertTrue(OrderFromPDF.contains("1 2 843 00107"));
//	 Assert.assertTrue(EngineFromPDF.contains("906920 00 179247"));
//	 Assert.assertTrue(TransmissionFromPDF.contains("715320 00 022241"));
//	 Assert.assertTrue(ElectricalVariantFromPDF.contains("XVK51 511069"));
//	 Assert.assertTrue(DesignationFromPDF.contains("FRAME TRUNK CIRCUIT"));
//	 Assert.assertTrue(CodeFromPDF.contains("9074"));
//	 Assert.assertTrue(PaintCodeFromPDF.contains("9147"));
//	 Assert.assertTrue(CodeFromPDF.contains("A71"));
//	 Assert.assertTrue(SAANumberFromPDF.contains("50503608"));
//	 Assert.assertTrue(PlantTextFromPDF.contains("Werkstext aus Migration"));
//	 Assert.assertTrue(DiogenesShortNameFromPDF.contains("PLD"));
//	 Assert.assertTrue(DesignationFromPDF.contains("Protected control units with IDCode"));
//	 Assert.assertTrue(ObjectTypeFromPDF.contains("ControlUnitStateType"));
//	 Assert.assertTrue(NewValueFromPDF.contains("0200"));
}
public void OrdersOfTheftRelevantParts_PDF() throws InterruptedException, IOException {
	OrdersOfTheftRelevantParts_OrderingInfo.click();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	wait.until(ExpectedConditions.elementToBeClickable(PDFIcon));
	js.executeScript("arguments[0].click();", PDFIcon);
	SAANumbersPDF.click();
	VPDPDF.click();
	PlantTextsPDF.click();
	ControlUnitsPDF.click();
	ModificationHistoryPDF.click();
	okPlantTexts.click();
	warmup1();
	String fileName= GetDownloadedFileName_PDF();
	String url= getRecordsPDF(fileName);
	OrderOfTheftRelevantParts_PDF(url);
	warmup6();
	String FINFromPDF=getPdfContent(url);
	String StatusFromPDF=getPdfContent(url);
	String OrderFromPDF=getPdfContent(url);
	String EngineFromPDF=getPdfContent(url);
	String TransmissionFromPDF=getPdfContent(url);
	String VPDIdentFromPDF=getPdfContent(url);
	String DesignationFromPDF=getPdfContent(url);
	String CodeFromPDF=getPdfContent(url);
	String PaintCodeFromPDF=getPdfContent(url);
	String SAANumberFromPDF=getPdfContent(url);
	String PlantTextFromPDF=getPdfContent(url);
	String DiogenesShortNameFromPDF=getPdfContent(url);
	String ObjectTypeFromPDF=getPdfContent(url);
	String NewValueFromPDF=getPdfContent(url);
//	 System.out.println("Verifying data from PDF");
//	 Assert.assertTrue(FINFromPDF.contains("WDB9634272L992621"));
//	 Assert.assertTrue(StatusFromPDF.contains("Delivered"));
//
//	 //Assert.assertTrue(EngineFromPDF.contains("642884 41 907220"));
//	 //Assert.assertTrue(TransmissionFromPDF.contains("722638 20 248499"));
//	// Assert.assertTrue(VPDIdentFromPDF.contains("10037"));
//	 Assert.assertTrue(DesignationFromPDF.contains("Brake Unit"));
//	 Assert.assertTrue(CodeFromPDF.contains("040U"));
//	 //Assert.assertTrue(PaintCodeFromPDF.contains("9040"));
//	 Assert.assertTrue(CodeFromPDF.contains("ZE0"));
//	// Assert.assertTrue(SAANumberFromPDF.contains("50400240"));
//	 //Assert.assertTrue(PlantTextFromPDF.contains("Werkstexte aus dem Aggregatewerk"));
//	 Assert.assertTrue(DiogenesShortNameFromPDF.contains("MSG"));
//	 Assert.assertTrue(DesignationFromPDF.contains("MSG Motor-Steuergerä"));
//	 Assert.assertTrue(ObjectTypeFromPDF.contains("ControlUnitStateType"));
//	 //Assert.assertTrue(NewValueFromPDF.contains("38363439333032323531"));
}
		public String getRecordsPDF(String FileName) {
    		String downloadPath = "C:\\Users\\deenara\\Downloads";
    				String filePath =	downloadPath + System.getProperty("file.separator") + FileName;
    				System.out.println(filePath);
    				File file = new File(filePath);
    				if (file.exists()) {
    					System.out.println("File found :" +FileName);
    					} else {
    					System.out.println("File does not exists");
    				}
			String url="file:///" +filePath;
    				return url;
			}
		
		public static String getPdfContent(String url) throws IOException {
		    URL pdfURL = new URL(url);
			InputStream is = pdfURL.openStream();
			BufferedInputStream bis = new BufferedInputStream(is);
			PDDocument doc = PDDocument.load(bis);
			int pages=doc.getNumberOfPages();
			System.out.println("The total number of pages "+pages);
			PDFTextStripper strip = new PDFTextStripper();
			strip.setStartPage(1);
			strip.setEndPage(9);
			String stripText = strip.getText(doc);
			System.out.println(stripText);
			doc.close();
			return stripText;
			}
		public String GetDownloadedFileName_PDF(){
	    	warmup5();
	    	JavascriptExecutor js= ((JavascriptExecutor)driver);
	    	js.executeScript("window.open()");
	   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
	   		driver.switchTo().window(opentabs.get(1));
	   		driver.get("C:\\Users\\deenara\\Downloads");
	   		warmup6();
	   		dateModified_columnHeader.click();
	   		warmup6();
	   		String name= getRow1_dateModified.getText();
	   		System.out.println("file name-"+name);
	   		driver.close();
	   		driver.switchTo().window(opentabs.get(0));
	   		return name;
	    	}
		public void DataValidationTab() throws InterruptedException {
			//Actions a=new Actions(driver);
			//a.moveToElement(identification_Tab).build().perform();
			wait.until(ExpectedConditions.visibilityOf(DataValidationTab));
			warmup6();
			DataValidationTab.click();
			warmup6();
		}
		public void DataValidationTab_ShowAllErrors() throws InterruptedException {
			DataValidationTab_ShowAllErrors.click();
			warmup6();
		}
		public void DataValidationTab_ExportButton() throws InterruptedException {
			warmup6();
			DataValidationTab_ExportButton.click();
			 String fileName= GetDownloadedFileName_NewTab(1, 0);
			 int dataCountInCSV= getRecordsCountInCSV(fileName);
			 System.out.println("Verifying total records in table with number of entries in csv");
			 Assert.assertEquals(getNumberOfEntries_DataValidation(), dataCountInCSV);
}
		public void DataValidationTab_Navigate() throws InterruptedException {
			DataValidationTab_HighlightRow.click();
			warmup();
			DataValidationTab_NavigateIcon.click();
			warmup6();
		}
		public void DataValidation_ValidationRulesTab() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(DataValidation_ValidationRulesTab));
			warmup6();
			DataValidation_ValidationRulesTab.click();
			warmup6();
		}
		public void DataValidation_ValidationRulesFilter() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(DataValidation_ValidationRulesFilter));
			warmup6();
			DataValidation_ValidationRulesFilter.click();
			warmup6();
			DataValidation_ValidationRulesFilterInput.sendKeys("activeModelPlate.objectNumber");
			warmup6();
			DataValidation_ValidationRulesFilter.click();
		}
		public void DataValidation_ValidationRulesExport() throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(DataValidation_ValidationRulesExport));
			warmup6();
			DataValidation_ValidationRulesExport.click();
			warmup6();
			String fileName= GetDownloadedFileName_NewTab(1, 0);
			 int dataCountInCSV= getRecordsCountInCSV(fileName);
			 System.out.println("Verifying total records in table with number of entries in csv");
			 Assert.assertEquals(getNumberOfEntries_ValidationRules(), dataCountInCSV);
		}
		 public String DataValidation_ValidationRulestotalRecords() {
				String records=DataValidation_ValidationRulestotalRecords.getText().trim();
				warmup6();
				System.out.println(records);
				return records;
				} 
		 public int getNumberOfEntries_ValidationRules() throws InterruptedException {
			 	String entriesTxt = DataValidation_ValidationRulestotalRecords();
//				String[] aEntriesText = entriesTxt.split(" / ");
//				System.out.println(aEntriesText.length);
//				String totalEntriesText = aEntriesText[1];
				int i=Integer.parseInt(entriesTxt);
				return i;
			}
		 public void DataValidation_VPDComparisonTab() throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOf(DataValidation_VPDComparisonTab));
				warmup6();
				DataValidation_VPDComparisonTab.click();
				warmup6();
			}
		 public void DataValidation_VPDComparisonShowData() throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOf(DataValidation_VPDComparisonShowData));
				warmup6();
				DataValidation_VPDComparisonShowData.click();
				warmup6(); 
		 }
		 public void DataValidation_VPDComparisonFilter() throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOf(DataValidation_VPDComparisonFilter));
				warmup6();
				DataValidation_VPDComparisonFilter.click();
				warmup6(); 
				DataValidation_VPDComparisonFilterInput.sendKeys("00007");
				warmup6();
				DataValidation_VPDComparisonFilter.click();
		 }  
		 public void DataValidation_VPDComparisonExport() throws InterruptedException {
				wait.until(ExpectedConditions.visibilityOf(DataValidation_VPDComparisonExport));
				warmup6();
				DataValidation_VPDComparisonExport.click();
				warmup6(); 
				String fileName= GetDownloadedFileName_NewTab(1, 0);
				 int dataCountInCSV= getRecordsCountInCSV(fileName);
				 System.out.println("Verifying total records in table with number of entries in csv");
				 Assert.assertEquals(getNumberOfEntries_VPDComparison(), dataCountInCSV);
		}
		 public String DataValidation_VPDComparisonTotalRecords() {
				String records=DataValidation_VPDComparisonTotalRecords.getText().trim();
				warmup6();
				System.out.println(records);
				return records;
				}
		 public int getNumberOfEntries_VPDComparison() throws InterruptedException {
			 	String entriesTxt = DataValidation_VPDComparisonTotalRecords();
				String[] aEntriesText = entriesTxt.split(" / ");
				System.out.println(aEntriesText.length);
				String totalEntriesText = aEntriesText[1];
				int i=Integer.parseInt(totalEntriesText);
				return i;
			}
		 public void factoryAdditionTab() throws InterruptedException {
			 	Actions actions = new Actions(driver);
				actions.moveToElement(SAA_numbers_Tab).build().perform();
				warmup6();
				factoryAdditionTab.click();
				warmup6();
		 }
		 public void factoryAdditionModelType() throws InterruptedException{
				Select dropdown =new Select(driver.findElement(By.name("additionalPlantInfoSelection")));
				dropdown.selectByIndex(2);
				warmup6();
				dropdown.selectByIndex(3);
				warmup6();
				dropdown.selectByIndex(0);
				warmup5();
		}
		 public void factoryAdditionFilter() throws InterruptedException{
			 wait.until(ExpectedConditions.visibilityOf(factoryAdditionFilter));
				warmup6();
				factoryAdditionFilter.click();
				warmup6(); 
				factoryAdditionFilterInput.sendKeys("120121A");
				Thread.sleep(5000);
				factoryAdditionFilter.click();
			 		}
		 public void factoryAdditionExport() throws InterruptedException{
			 wait.until(ExpectedConditions.visibilityOf(factoryAdditionExport));
				warmup6();
				factoryAdditionExport.click();
				warmup6(); 
				String fileName= GetDownloadedFileName_NewTab(1, 0);
				int dataCountInCSV= getRecordsCountInCSV(fileName);
				System.out.println("Verifying total records in table with number of entries in csv");
				Assert.assertEquals(getNumberOfEntries_factoryAddition(), dataCountInCSV);
		}
		 public String factoryAdditionTotalRecords() {
				String records=factoryAdditionTotalRecords.getText().trim();
				warmup6();
				System.out.println(records);
				return records;
				}
		 public int getNumberOfEntries_factoryAddition() throws InterruptedException {
			 	String entriesTxt = factoryAdditionTotalRecords();
//				String[] aEntriesText = entriesTxt.split(" / ");
//				System.out.println(aEntriesText.length);
//				String totalEntriesText = aEntriesText[1];
				int i=Integer.parseInt(entriesTxt);
				return i;
			}
		
		public List<WebElement> prodOrderFetchRows(){
			if(prodOrderFetchRows != null && ! prodOrderFetchRows.isEmpty())
				return prodOrderFetchRows;
			else
				return new ArrayList<>();
		}
		
		public List<WebElement> prodOrderPosFetchRows(){
			if(prodOrderPosFetchRows != null && ! prodOrderPosFetchRows.isEmpty())
				return prodOrderPosFetchRows;
			else
				return new ArrayList<>();
		}
		public String modelPlantText() {
			String ModelText= modelPlantText.getText();
			return ModelText;
		}
		
		public String modelPlantText1() {
			String ModelText= modelPlantText1.getText();
			return ModelText;
		}
		public void printModelPlantText() throws InterruptedException {
			printModelPlantText.click();
			warmup1();
			selectPlantTexts.click();
			okPlantTexts.click();
			warmup1();
		}
		
		public  void showExpandedView() {
			JavascriptExecutor js=(JavascriptExecutor)driver;	
			 js.executeScript("arguments[0].scrollIntoView();", filter_showExpandedView);
			warmup6();
			showExpandedView.click();
		}
		
		public  void editMajorVersions() throws InterruptedException {
			JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
		javaScriptExecutor.executeScript("window.scrollBy(-500,0)");
		warmup();
		editMajorVersions.click();

		}
		
		
	public void editMajorVersionsData() throws InterruptedException{		
		majorVersions1.click();
		warmup();
		majorVersions1.sendKeys(Keys.CONTROL+"A");
		majorVersions1.sendKeys(Keys.CONTROL+"X");
		majorVersions1.sendKeys("20");
		majorVersions2.click();
		warmup();
		majorVersions2.sendKeys(Keys.CONTROL+"A");
		majorVersions2.sendKeys(Keys.CONTROL+"X");
		majorVersions2.sendKeys("20");
		majorVersions3.click();
		warmup();
		majorVersions3.sendKeys(Keys.CONTROL+"A");
		majorVersions3.sendKeys(Keys.CONTROL+"X");
		majorVersions3.sendKeys("20");
		majorVersions4.click();
		warmup();
		majorVersions4.sendKeys(Keys.CONTROL+"A");
		majorVersions4.sendKeys(Keys.CONTROL+"X");
		majorVersions4.sendKeys("20");
		majorVersions5.click();
		warmup();
		majorVersions5.sendKeys(Keys.CONTROL+"A");
		majorVersions5.sendKeys(Keys.CONTROL+"X");
		majorVersions5.sendKeys("20");
		majorVersions6.click();
		warmup();
		majorVersions6.sendKeys(Keys.CONTROL+"A");
		majorVersions6.sendKeys(Keys.CONTROL+"X");
		majorVersions6.sendKeys("20");
		majorVersions7.click();
		warmup();
		majorVersions7.sendKeys(Keys.CONTROL+"A");
		majorVersions7.sendKeys(Keys.CONTROL+"X");
		majorVersions7.sendKeys("20");
		majorVersions8.click();
		warmup();
		majorVersions8.sendKeys(Keys.CONTROL+"A");
		majorVersions8.sendKeys(Keys.CONTROL+"X");
		majorVersions8.sendKeys("20");
		majorVersions9.click();
		warmup();
		majorVersions9.sendKeys(Keys.CONTROL+"A");
		majorVersions9.sendKeys(Keys.CONTROL+"X");
		majorVersions9.sendKeys("20");
		majorVersions10.click();
		warmup();
		majorVersions10.sendKeys(Keys.CONTROL+"A");
		majorVersions10.sendKeys(Keys.CONTROL+"X");
		majorVersions10.sendKeys("20");
		}

	public  void addActivationcodeInfo() throws InterruptedException {
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		 js.executeScript("arguments[0].scrollIntoView();", identification_Tab);
//		 JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
//		javaScriptExecutor.executeScript("window.scrollBy(-500,0)");
		warmup6();
		addActivationcodeInfo.click();
	}
	
	public void developmentStatus_Edit(){
		developmentStatus.sendKeys("DB_DCNTG45A_USA_USA_E23.0071");
	}
	
	public void softwareId_Edit(){
		softwareId.clear();
		softwareId.click();
		softwareId.sendKeys("0001110B");
	}
	
	public  void submit() {
		submit.click();
	}
	
	public  void createdValueClick() {
		createdValueClick.click();
	}
	
	public  void createdValueDelete() {
		createdValueDelete.click();
	}
	
	public  void addTextButton() throws InterruptedException {
	wait.until(ExpectedConditions.visibilityOf(save));
	    JavascriptExecutor js=(JavascriptExecutor)driver;
 	js.executeScript("arguments[0].click();", addTextButton);
//		addTextButton.click();
		warmup5();
	
	}
	
	public  void engineCaseClick() {
		engineCaseSelect.click();
	}
	
	public  void textContent_Enter() {
		textContent_Enter.sendKeys("Create Engine Case");
	}
	
	public  void textContent_Edit() {
		textContent_Enter.clear();
		textContent_Enter.sendKeys("Edit Engine Case");
	}
	
	public  void createdEngineCase_Click() {
		createdEngineCase_Click.click();
	}
	
	public  void editedEngineCase_Click() {
		editedEngineCase_Click.click();
	}
	
	public  void removeAddedText() {
		removeAddedText.click();
	}
	
	public Boolean technicalData_Tab(){
		Actions actions = new Actions(driver);
		 actions.moveToElement(SAA_numbers_Tab).build().perform();
		 warmup6();
			return technicalData_Tab.isDisplayed();
	}	
	
	public Boolean bodies_Tab(){
		return bodies_Tab.isDisplayed();
	}

	public Boolean installationDocumentation_Tab(){
		return installationDocumentation_Tab.isDisplayed();	
	}
	
	public  void editFoTexts() {
		editFoTexts.click();
	}
	
	public Boolean editMajorVersionsButton(){
		return editMajorVersions.isDisplayed();
	}
	
	public Boolean addActivationcodeInfoButton(){
		return addActivationcodeInfo.isDisplayed();
	}
	
	public Boolean edit(){
		return edit.isDisplayed();
	}
	
	public Boolean navigationCompatibilityIdentifier_Table(){
		return navigationCompatibilityIdentifier_Table.isDisplayed();
	}
	
	public Boolean informationOnLicenseKeyGenearation_Table(){
		return informationOnLicenseKeyGenearation_Table.isDisplayed();
	}
	
	public void OpenNewTab(){
		warmup5();
		((JavascriptExecutor)driver).executeScript("window.open(arguments[0])", "https://test1.core-t.public.vedoc.daimlertruck.com/ui/VehicleArrangement.html");

		Set<String> handles=driver.getWindowHandles();		
		Iterator<String> it=	handles.iterator();
				
		parentwindowID=it.next();
		childwindowID=it.next();					
		driver.switchTo().window(childwindowID);
	}
	
	
	public Boolean alert(){
		return technicalAdvisor_Alert.isDisplayed();	
	}
	
	public String technicalAdvisor_Alert() throws InterruptedException {
		//wait.until(ExpectedConditions.visibilityOf(technicalAdvisor_Alert));
		String alert = technicalAdvisor_Alert.getText();

		//String alert = technicalAdvisor_Alert.getText();
		return alert;
	}
	
	public  void logout() {
		logout.click();
		warmup1();	
	
	}
	
	public void openNewTab_RU_PDF(){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	   driver.get("https://test1.core-n.public.vedoc.i.mercedes-benz.com/ui/homepage.html");
	}
	
	public void Vehicledata_PDF(String url){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	   driver.get(url);
	}
	public void ControlUnit_PDF(String url){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	   driver.get(url);
	}
	public void OrderOfTheftRelevantParts_PDF(String url){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(3));
	   driver.get(url);
	}
	public void openNewTab_RU(){
		warmup5();
		((JavascriptExecutor)driver).executeScript("window.open(arguments[0])", "https://mbag-test.core-t.public.vedoc.daimlertruck.com/ui/homepage.html");
		 warmup6();
		
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(2));//1
	    driver.get("https://test1.core-n.public.vedoc.i.mercedes-benz.com/ui/homepage.html");
	    warmup6();
	}
	
	public  void controlUnitTab() {
		wait.until(ExpectedConditions.elementToBeClickable(controlUnitTab));
		controlUnitTab.click();
	}
	
	public Boolean controlUnitsTab_EditButton() {	
		return controlUnitsTab_Edit.isDisplayed();
	}
	
	//
	
	public void searchfin_MultipleResults() throws InterruptedException {
		warmup1();
		searchInput.clear();
		searchInput.sendKeys("1603482");
		searchButton.click();
	}
	
	public void fin_DropDown_Radio(){
		wait.until(ExpectedConditions.elementToBeClickable(fin_Search));
		Select s=new Select(fin_DropDown);
		s.selectByValue("string:productionNumber");
		wait.until(ExpectedConditions.elementToBeClickable(fin_Search));
		fin_Search.click();
	}
	
	public void fin_DropDown_FinOrVin(){
		warmup5();
		driver.close();//again its close tab 1
		warmup6();
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
		wait.until(ExpectedConditions.elementToBeClickable(fin_Search));
		Select s=new Select(fin_DropDown);
		s.selectByValue("string:finOrVin");
		wait.until(ExpectedConditions.elementToBeClickable(fin_Search));
		fin_Search.click();
		click_alert.click();
	}
	
	public String multipleResults_AlertMessage_1() {
		wait.until(ExpectedConditions.visibilityOf(multipleResults_AlertMessage_1));
		String msg=multipleResults_AlertMessage_1.getText();
		return msg;
	}
	
	public String multipleResults_AlertMessage_2() {
		String msg=multipleResults_AlertMessage_2.getText();
		return msg;
	}
	
	public String multipleResults_AlertMessage_3() {
		String msg=multipleResults_AlertMessage_3.getText();
		return msg;
	}
	
	public String multipleResults_AlertMessage_4() {
		String msg=multipleResults_AlertMessage_4.getText();
		return msg;
	}
	
	public  void clickAlertMessage_1() {
		wait.until(ExpectedConditions.visibilityOf(multipleResults_AlertMessage_2));
		clickOnFin_1.click();
	}
	
	public void openNewTab_1(){
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    warmup6();
	    driver.switchTo().window(tabs.get(1));
	}
	//kartik
	public void CloseCurrentWindow_and_SwitchTo(int w){
		warmup6();
		driver.close();//gain agan it close the tab 1
		warmup6();
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    warmup6();
	    driver.switchTo().window(tabs.get(w));
	}
	
	public String checkFin_1() {
		wait.until(ExpectedConditions.visibilityOf(checkFin_1));
		String fin=checkFin_1.getText();
		return fin;
	}
	
	public  void clickAlertMessage_2() {
		warmup5();
		driver.close(); //it close tab 1
   		warmup6();
		
		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(0));
		wait.until(ExpectedConditions.visibilityOf(multipleResults_AlertMessage_3));
		clickOnFin_2.click();
	}
	
	public void openNewTab_2(){
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));//2
       // click_alert.click();
	}
//	public void clickOk(){
//			 click_alert.click();
//	}
	
	public String checkFin_2() {
		wait.until(ExpectedConditions.visibilityOf(checkFin_2));
		String fin=checkFin_2.getText();
		return fin;
	}
	
	public String saaNumber1_Quantity_Added() {
		String quantity=saaNumber1_Quantity_Added.getText();
		return quantity;
	}
	
	public String saaNumber1_Quantity() {
		String quantity=saaNumber1_Quantity.getText();
		return quantity;
	}
	//VIAGARW	
		public boolean alertBox() {
					if (alertBox.isDisplayed()) {
									return true;
								} else {
									return false;
								}
							}
		
		public  boolean alertBoxWarning() {
			if (alertBoxWarning.isDisplayed()) {
			return true;
		} else {
			return false;
		}}
		public  void crossIcon() {
			crossIcon.click();
		}
		public void CertificationTab() throws InterruptedException {
			 JavascriptExecutor js=(JavascriptExecutor)driver;
			 js.executeScript("arguments[0].scrollIntoView();", MajorAssembly);
			 warmup5();
			CertificationTab.click();
				}
				public String SeriesProductAproval(){
                   String SeriesProductAproval= series_product_aproval_contests.getText();
				   return SeriesProductAproval;
				}
				public String CertificationContents(){
					String contents=Certification_content.getText();
					return contents;
				}
		public void CocPaperButton()throws InterruptedException {
			CocPaperButton.click();
				}
				public String documentKey(){
               String key=  document_key.getText();
				 return key;
				}
				public String ownershipNumber(){
			    String ownershipNumber=ownership_number.getText();
				return ownershipNumber;
				}
		
		public String InfoAlertMessage()throws InterruptedException {
			String message=InfoAlertMessage.getText();
			return message;
		}
		public void AcceptCoCCapability()throws InterruptedException {
			AcceptCoCCapability.click();
			}
		public boolean AcceptSaveNow() throws InterruptedException {
			if (alertBoxWarning.isDisplayed()) {
				AcceptSaveNow.click();
				return true;
			} else {
				return false;
			}
		}
		
		public void EditDocumentKey()throws InterruptedException {
			wait.until(ExpectedConditions.visibilityOf(EditDocumentKey));
			}
		public void AdditionalApproval()throws InterruptedException {
			wait.until(ExpectedConditions.elementToBeClickable(AdditionalApproval));
			AdditionalApproval.click();
			
		}
		public String AdditionalApprovalPrintingInformation(){
			warmup();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,1000)");
			AdditionalApprovalPrintingInformation.click();
		    String Certification_PrintingInformation=AdditionalApprovalPrintMotorInformation.getText();
			return Certification_PrintingInformation;
			
		}
		
		public  String alertBoxGClass() {
			return alertBox.getText();
		}
		public void openNewTab_CU(){
			warmup5();
		    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    driver.get("https://test1.core-n.public.vedoc.i.mercedes-benz.com/ui/homepage.html");
		}
		public String AllWheelDriveTransferCaseNo(){
			warmup();
	
		    String MajorAssemblies_Allwheeldrivetransfercasenumber=AllWheelDriveTransferCaseNo.getText();
			return MajorAssemblies_Allwheeldrivetransfercasenumber;
		}
		public String AllWheelDriveFrontAxleTransmission(){
				warmup();
		
			    String MajorAssemblies_AllWheelDriveFrontAxleTransmission=AllWheelDriveFrontAxleTransmission.getText();
				return MajorAssemblies_AllWheelDriveFrontAxleTransmission;
				}
		public String changeUserMABody(){
			 WebElement body=driver.findElement(By.xpath("//*[@id='VehicleMajorAssembly_030']/div/div[2]/form/div[15]/div[2]"));
			String Body=body.getText();
			return Body;
		}
		public String trnsferCaseNo(){
			 WebElement Transfercaseno=driver.findElement(By.xpath("//*[@id='VehicleMajorAssembly_030']/div/div[2]/form/div[5]/div[2]/div/span[1]"));
			 String tCaseNo=Transfercaseno.getText();
			 return tCaseNo;

		}
		public void ExchangeOrRemoveMajorAssemblies() {
			WebElement button = driver.findElement(By.xpath("//div[@id='VehicleMajorAssembly_030']//button[contains(@data-ng-click,'exchangeMajorAssembly')]"));
//			JavascriptExecutor jse = (JavascriptExecutor)driver;
//			jse.executeScript("arguments[0].scrollIntoView()", button);
			//Actions act=new Actions(driver);
     		//act.moveToElement(RepositionOfMejorassembly).perform();
			//warmup();
			//act.moveToElement(button).click().build().perform();
			warmup5();
			button.click();
		}
		public void simpleClick(){
			WebElement simpleclick=driver.findElement(By.xpath("//*[@id=\"VehicleMajorAssembly_030\"]/div/div[2]/form/div[5]"));
			simpleclick.click();
		}
       public void RepositionOfMejorassemblyButton()throws InterruptedException {
    	   warmup6();
			WebElement button = driver.findElement(By.xpath("//span[text()='Exchange or remove major assembly']"));
			WebElement Repositionbutton = driver.findElement(By.xpath("//div[@id='VehicleMajorAssembly_030']//button[contains(@data-ng-click,'correctMajorAssembly')]"));	
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].scrollIntoView()", Repositionbutton); 			
						
			Actions act=new Actions(driver);
			act.moveToElement(button).perform();
			
			act.moveToElement(Repositionbutton).click().build().perform();
			warmup5();
		}
		
		public void EditEngineMajorAssemblies_Icon()throws InterruptedException {
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(EditEngineMajorAssemblies_Icon));
			EditEngineMajorAssemblies_Icon.click();
		}
		public void EditEngineMajorAssemblies()throws InterruptedException {
			EditEngineMajorAssemblies.clear();
			EditEngineMajorAssemblies.sendKeys("473900C0196999");
		}
		public void  EditEngine_ObjectNoMajorAssemblies()throws InterruptedException {
			EditEngine_ObjectNoMajorAssemblies.clear();
			EditEngine_ObjectNoMajorAssemblies.sendKeys("X11080061780");
		}
		public void OriginalEngineMajorAssemblies()throws InterruptedException {
			EditEngineMajorAssemblies.clear();
			EditEngineMajorAssemblies.sendKeys("11197910000018");
		}
		public void OriginalEngine_ObjectNoMajorAssemblies()throws InterruptedException {
			EditEngine_ObjectNoMajorAssemblies.clear();
		}
		
		public void XFunctionsTab () {
			wait.until(ExpectedConditions.elementToBeClickable(XFunctionsTab));
			XFunctionsTab.click();
		
		}
		public void FourCharacterNumber(){
			FourCharacterNumber.click();
			FourCharacterNumber.sendKeys(RandomPaintCode);
		}
		public WebElement IDCode(){
			wait.until(ExpectedConditions.elementToBeClickable(IDCode));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", IDCode);
			//		IDCode.click();
			IDCode.sendKeys("00000009");
			warmup5();
			return IDCode;
			}
		public WebElement IDCodeTwoDigit(){
			wait.until(ExpectedConditions.elementToBeClickable(IDCode));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", IDCode);
			//		IDCode.click();
			IDCode.sendKeys("10000011");
			warmup5();
			return IDCode;
			}
			public WebElement IDCodeDoubleDigit(){
			wait.until(ExpectedConditions.elementToBeClickable(IDCode));
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();", IDCode);
			//		IDCode.click();
			IDCode.sendKeys("02355DB5");
			warmup5();
			return IDCode;
			}
		public void calculationType_X1(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X1");
		}
		public void calculationType_X2(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X2");
		}
		public void calculationType_X3(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X3");
		}
		public void calculationType_X4(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X4");
		}
		
		public void calculationType_X5(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X5");
		}
		
		public void calculationType_X6(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X6");
		}
		
		public void calculationType_X7(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X7");
		}
		
		public void calculationType_X8(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:X8");
		}
		
		public void calculationType_XA(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XA");
		}
		public void calculationType_XB(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XB");
		}
		public void calculationType_XD(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XD");
		}
		public void calculationType_XE(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XE");
		}
		public void calculationType_XI(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XI");
		}
		public void calculationType_XM(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XM");
		}
		public void calculationType_XN(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XN");
		}
		public void calculationType_XS(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XS");
		}
		public void calculationType_XT(){
			warmup5();
			JavascriptExecutor js=(JavascriptExecutor)driver;
			wait.until(ExpectedConditions.visibilityOf(CalculationType));
			js.executeScript("arguments[0].click();", CalculationType);
			Select option=new Select(CalculationType);
			option.selectByValue("string:XT");
		}
		public void xfunction_NumberofKeys(){
			xfunction_NumberofKeys.sendKeys("1");
		}
		
		public void xfunction_transponder(){
			xfunction_Transponder.sendKeys("1211111111");
		}
		public void xfunction_Checksum(){
			xfunction_Checksum.sendKeys("XXX");
		}
		public void xfunction_Datarecord(){
			xfunction_Datarecord.sendKeys("A1234567890");
		}
		public void xfunction_DrawingAndGeometry(){
			xfunction_DrawingAndGeometry.sendKeys("123");
		}
		public void xfunction_Version1(){
			xfunction_Version1.sendKeys("123AB");
		}
		public void xfunction_Datarecord_X8Positive(){
			xfunction_Datarecord.sendKeys("A0014460404");
		}
		public void xfunction_DrawingAndGeometry_X8Positive(){
			xfunction_DrawingAndGeometry.sendKeys("002");
		}
		public void xfunction_Version1_X8Positive(){
			xfunction_Version1.sendKeys("ACM01");
		}
		public void GenerateNumberButton(){
			warmup();
			wait.until(ExpectedConditions.visibilityOf(GenerateNumberButton));
			GenerateNumberButton.click();
		}

		public String RandomNumberGenerated(){
			warmup();
			wait.until(ExpectedConditions.visibilityOf(RandomNumberGenerated));
			String number=	RandomNumberGenerated.getText();
			return number;
		}

		public void ResetEntryButton(){
			warmup5();
			ResetEntryButton.click();
			warmup1();
		}
		public void supportAndFeedback(){
            warmup5();
            Feedback.click();
            warmup4();
            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(2));//4
            }

	 public void supportAndFeedbackWithFin(){
            warmup5();
            Feedback.click();
            warmup4();
            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(3));//5
            }
        public void revert(){
            warmup5();
            ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
            driver.switchTo().window(tabs.get(0));//1
            //driver.get("https://vedoc-test1-em1.i.daimler.com/vedocweb/");
        }
			//end
		
		public void vehicleData_SidePanel(){
			wait.until(ExpectedConditions.visibilityOf(vehicleData_SidePanel));
			vehicleData_SidePanel.click();
			warmup1();
			warmup1();
			wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		}
		//KELKARK
		public void RequestCocHardCopyButton()throws InterruptedException {
		RequestCocHardCopy.click();
		}
		
//		public boolean RequestCocHardCopyButtonCheck() {
//			if (RequestCocHardCopy.isEnabled()) {
//							return true;
//						} else {
//							return false;
//						}
//					}
		
		public  String blueAlertBox2() {
			return blueAlertBox2.getText();
		}
		
		public void moveToAlertBoxCloseAndClick() throws InterruptedException {
			Thread.sleep(15000);
			Actions	act = new Actions(driver);
			act.moveToElement(alertBoxClose).click().build().perform();	
			}
		
		public  void alertBoxCloseClick() {
			alertBoxClose.click();
		}
		
		public void moveToIdentificationTab_toShowHiddenTabs() {		
			Actions act=new Actions(driver);
			act.moveToElement(IdentificationTab).perform();
			warmup();
			act.moveToElement(CertificationTab).click().build().perform();
		}
		
		//-History tab		
		public void History_SearchBar_ScrapComment(){	
			warmup6();
			history_filterSearchBar.clear();
			history_filterSearchBar.sendKeys("Scrap Comments");
			warmup6();
		}
			
		public void History_SearchBar_ScrapDate(){
			warmup6();
			history_filterSearchBar.clear();
			history_filterSearchBar.sendKeys("Scrap date");
			warmup6();
		}
		
		public void History_FilterButton_Click(){
			//history_filterButton.click();
			
			Actions act=new Actions(driver);
			act.moveToElement(HistoryTab_TechnicalEntryButton).perform();
			warmup();
			act.moveToElement(history_filterButton).click().build().perform();
		}
		
		public String History_FetchScrapInformation(){
			String comment=historyTab_fetchNewValue.getText();			
			return comment;
			}
		
		//to check its displayed or not		
		public Boolean editSalesDataButton_DesplayedOrNot_sd(){
			warmup6();
			return edit_salesData_button_sd.isDisplayed();	
		}
		public Boolean editCustomerServiceDataButton_DesplayedOrNot_sd(){
			warmup6();
			return editCustomerServiceData_button.isDisplayed();	
		}
		
		
		
		// for orders Of Theft Relevant Parts
        //ul//li[@heading='Orders of theft-relevant parts']2
       //li[@data-ng-show='viewControl.VehicleReservationArrangement.visible']
//		@FindBy(name="//body/div/div[2]/div[2]/div[2]/div/div/ul/li[@heading='Orders of theft-relevant parts']/a")
//		WebElement ordersOfTheftRelevantParts_Tab;
//		
//		
//		@FindBy(name="//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'showOverview')]")
//		WebElement showOverview_button;
//		
//		@FindBy(name="//div[@id='VehicleReservation_391']//button[@data-ng-click='showDetails($event)']")
//		WebElement showDetails_button;
//		
//		@FindBy(name="//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'filterOrder')]")
//		WebElement filterOrderButton_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//input[contains(@input-binding,'filterExpression')]")
//		WebElement filterSearchBar_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table//tr//td//button[contains(@data-ng-click,'reservationTable/')]")
//		WebElement editOrderingInfo_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderNumber']")
//		WebElement passOrderNo_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderDate']")
//		WebElement passOrderDate_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderer']")
//		WebElement passOrderer_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderNoteNumber']")
//		WebElement passOrdererNoteNo_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_designation']")
//		WebElement passDescription_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//div//select[@name='vehicle_reservation_status']")
//		WebElement passStatus_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='reservationTable']//td//button[@type='submit']")
//		WebElement clickOnSubmit_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'filterPart')]")
//		WebElement filterPartsButton_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//button[contains(@data-ng-click,'localOrderedParts/)')]")
//		WebElement editOrderParts_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//tbody//input[@name='vehicle_reservation_cur_finRelatedParts_quantity']")
//		WebElement passPartsQuantity_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//tbody//select[@name='vehicle_reservation_cur_finRelatedParts_typeOf']")
//		WebElement passPartsTypeOfPartsOrder_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//tbody//select[@name='vehicle_reservation_cur_finRelatedParts_changedIdentifier']")
//		WebElement passPartsStatus_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//tbody//input[@name='vehicle_reservation_cur_finRelatedParts_comment']")
//		WebElement passPartsComment_ordersOfTheftRelevantParts;
//		
//		@FindBy(name="//table[@id='localOrderedParts']//button[@type='submit']")
//		WebElement clickOnPartsSubmit_ordersOfTheftRelevantParts;
		
		
		public void OrderOfTheftReleventTab(){
			
			warmup6();
			 Actions actions = new Actions(driver);
			 actions.moveToElement(IdentificationTab).build().perform();
			warmup6();
			 WebElement button = driver.findElement(By.xpath("//body/div/div[2]/div[2]/div[2]/div/div/ul/li[@heading='Orders of theft-relevant parts']/a"));
			 button.click();
		}
	
		public void ShowOverview_button(){
			warmup6();
			 WebElement button = driver.findElement(By.xpath("//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'showOverview')]"));
			 button.click();
		}
		public void ShowDetails_button(){
			warmup6();
			WebElement button = driver.findElement(By.xpath("//div[@id='VehicleReservation_391']//button[@data-ng-click='showDetails($event)']"));
			 button.click();
		}
		
		 public int Fetch_OrderinginformationCount() {
	        	warmup();
				List<WebElement> count = driver.findElements(By.xpath("//div[@id='VehicleReservation_391']//table[@id='reservationOverviewTable']//tbody/tr"));
				int size = count.size();
				System.out.println("Ordering information data count is- "+size);
				
				if(size>=1) {
					return size;
				}else {
					return 0;
				}
			} 
		 public int Fetch_ElementCountInRow_OrderOfTheft(int row) {
				List<WebElement> count = driver.findElements(By.xpath("//div[@id='VehicleReservation_391']//table[@id='reservationOverviewTable']//tbody/tr["+row+"]//td"));
				int size = count.size();	
				return size;
			}
		 public String Fetch_OrderingInformationData(int row, int column) {
				WebElement orderingData = driver.findElement(By.xpath("//div[@id='VehicleReservation_391']//table[@id='reservationOverviewTable']//tbody/tr["+row+"]//td["+column+"]//span"));
				String value=orderingData.getText();
				System.out.println(value);
				return value;
		 }
	
		 public void FilterOrderButton_ordersOfTheftRelevantParts() {
			 warmup6();
				WebElement button = driver.findElement(By.xpath("//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'filterOrder')]"));
				 button.click();
		 }
		 public void FiltersearchBar_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//input[contains(@input-binding,'filterExpression')]"));
			 button.sendKeys(value);
		 }
		 
		 public String GetTextFromTable_orderingInfo() {
	    		warmup();
	    		WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//tbody//tr[1]//td[1]//span"));
	    		String text = button.getText();	
	    	return text;
			}
		 public String GetTextFromTable_orderedParts() {
	    		warmup();
	    		WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//tbody//tr[1]//td[2]//span"));
	    		String text = button.getText();	
	    	return text;
			}
		 
		 public void EditOrderingInfo_ordersOfTheftRelevantParts() {
			 warmup6();
				WebElement button = driver.findElement(By.xpath("//table//tr//td//button[contains(@data-ng-click,'reservationTable/')]"));
				 button.click();
		 }
		 public void PassOrderNo_ordersOfTheftRelevantParts(String value) {
			 
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderNumber']"));
			 button.clear();
			 button.sendKeys(value);
		 }
		 public void PassOrderDate_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderDate']"));
			 button.clear();
			 button.sendKeys(value);
		}
		 public void PassOrderer_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderer']"));
			 button.clear();
			 button.sendKeys(value);
		 }
		 public void PassOrdererNoteNo_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_orderNoteNumber']"));
			 button.clear();
			 button.sendKeys(value);
		 }
		 public void PassDescription_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//input[@name='vehicle_reservation_designation']"));
			 button.clear();
			 button.sendKeys(value);
		 }
		 public void PassStatus_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//div//select[@name='vehicle_reservation_status']"));
			
			 warmup6();				 
			 Select mode = new Select(button);
			mode.selectByVisibleText(value);
			warmup6();
         }
		 public void clickOnSubmit_ordersOfTheftRelevantParts() {
			 WebElement button = driver.findElement(By.xpath("//table[@id='reservationTable']//td//button[@type='submit']"));
			 button.click();
			 warmup6();
       }
		 public void FilterPartsButton_ordersOfTheftRelevantParts() {
			 warmup();
			 WebElement button = driver.findElement(By.xpath("//form[@name='fVehicleReservation_390']//button[contains(@data-ng-click,'filterPart')]"));
			 button.click();
			 warmup();
			 }
		 public void EditOrderParts_ordersOfTheftRelevantParts() {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//button[contains(@data-ng-click,'localOrderedParts/)')]"));
			 button.click();
			 warmup();
	    }
		 public void PassPartsQuantity_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//tbody//input[@name='vehicle_reservation_cur_finRelatedParts_quantity']"));
			 button.clear();
			 button.sendKeys(value);
			 warmup();
		 }
		 public void PassPartsTypeOfPartsOrder_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//tbody//select[@name='vehicle_reservation_cur_finRelatedParts_typeOf']"));
			 warmup6();				 
			 Select mode = new Select(button);
			mode.selectByVisibleText(value);
			warmup6();
		 }
		 public void PassPartsStatus_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//tbody//select[@name='vehicle_reservation_cur_finRelatedParts_changedIdentifier']"));
			 warmup6();				 
			 Select mode = new Select(button);
			mode.selectByVisibleText(value);
			warmup6();
		 }
		 public void PassPartsComment_ordersOfTheftRelevantParts(String value) {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//tbody//input[@name='vehicle_reservation_cur_finRelatedParts_comment']"));
			 button.clear();
			 button.sendKeys(value);
			 warmup();
		 }
		 public void ClickOnPartsSubmit_ordersOfTheftRelevantParts() {
			 WebElement button = driver.findElement(By.xpath("//table[@id='localOrderedParts']//button[@type='submit']"));
			 button.click();
			 warmup6();
			}
		 public void ClickOnSave_ordersOfTheftRelevantParts() {
			 WebElement button = driver.findElement(By.xpath("//div[@id='VehicleSearchFoot_000']//button[@data-ng-click='save($event)']"));
			 JavascriptExecutor javaScriptExecutor= (JavascriptExecutor)driver;
			  javaScriptExecutor.executeScript("window.scrollBy(-100,0)");
			warmup5();
			 button.click();
			 warmup5();
			}
		 
		 
		 @FindBy(xpath="//span[@data-ng-bind-html='::alert.msg']")
			WebElement theftAlert;
		 
			public String theftAlert(){
				wait.until(ExpectedConditions.visibilityOf(theftAlert));
				String alert = theftAlert.getAttribute("textContent");
				return alert;
			}
			public void searchRandomfin() throws InterruptedException {
				warmup5();
				warmup5();
				wait.until(ExpectedConditions.elementToBeClickable(searchInput));
				searchInput.click();
				searchInput.sendKeys(1111111111+RandomLabelData_FINNumber);
				searchButton.click();
				Thread.sleep(5000);
			}
}




