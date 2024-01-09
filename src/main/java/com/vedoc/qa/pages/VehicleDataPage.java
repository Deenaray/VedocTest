package com.vedoc.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vedoc.qa.base.TestBase;

import junit.framework.Assert;

public class VehicleDataPage extends TestBase{

	//Page Factory (or) Object Repository of Vehicle Data Page
	@FindBy(xpath="//input[@list='localSearchAutoComplete']")
	WebElement searchInput;
	
	@FindBy(xpath="//button[@data-ng-click='NextVehicle($event)']")
	WebElement rightArrowButton;
	
	@FindBy(xpath="//button[@data-ng-click='PreviousVehicle($event)']")
	WebElement leftArrowButton;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleIdentificationArrangement.visible')]")
	WebElement IdentificationTab;

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

	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicleModelDesignation.designation.requestedText')]")
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

	@FindBy(xpath="//button[contains(@data-ng-click,'startSaaInputWizard($event)')]")
	WebElement Add_RemoveSAAButton;

	@FindBy(xpath="//textarea[contains(@name,'inputField')]")
	WebElement SAANumber_AddNumber;

	@FindBy(xpath="//button[contains(@data-ng-click,'addSaas($event)')]")
	WebElement SAANumber_arrowButton;

	@FindBy(xpath="//button[contains(@data-ng-click,'finalStep($event)')]")
	WebElement GoToAssignmentButton;

	@FindBy(xpath="//select[contains(@name,'addedSaaAssigned_saa_source')]")
	WebElement Usage;

	@FindBy(xpath="//button[contains(@data-ng-click,'save($event)')]")
	WebElement ApplyButton;

	@FindBy(xpath="//button[contains(@data-ng-click,'save($event)')]")
	WebElement SaveButton;


	@FindBy(xpath="//input[starts-with(@data-ng-model,'viewControl.dgTableSaa_selectAll')]")
	WebElement DesignationTable;

	@FindBy(xpath="//tr[starts-with(@data-ng-repeat,'dgTableSaa_rec in viewControl.designGroup')]")
	WebElement FirstElement_FromEngineCaseID;

	@FindBy(xpath="//img[@class='img-brand-black']")
	WebElement Benz_logo;

	@FindBy(xpath="//input[contains(@data-ng-model,'viewControl.dgTableSaa_selectAll')]")
	WebElement AllContentofDesignationTable;

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

	@FindBy(xpath="(//button[contains(@data-ng-click,'VPDTable')])")
	WebElement VPD_FilterButton;

	@FindBy(xpath="//input[starts-with(@placeholder,'Search the table')]")
	WebElement VPD_SearchVPD;


	/* Control Unit Tab of Vehicle Data Module*/

	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleControlUnitArrangement.visible')]")
	WebElement ControlUnitTab;

	@FindBy(xpath="//button[contains(@data-ng-click,'addCU($event)')]")
	WebElement AddControlUnit_button;

	@FindBy(xpath="//select[contains(@name,'consolidatedProductData_controlUnit_typeOf')]")
	WebElement ControlUnitModel;

	@FindBy(xpath="//input[contains(@name,'consolidatedProductData_controlUnit_cuDesignation')]")
	WebElement ControlUnit_DiogenesName;

	@FindBy(xpath="//button[contains(@type,'submit')]")
	WebElement ControlUnit_CheckMarkButton;

	@FindBy(xpath="//span[contains(@data-ng-bind-html,'VehicleSearchFoot_000')]")
	WebElement ControlUnit_SaveButton;

	@FindBy(xpath="//button[contains(@data-ng-click,'addSoftware($event)')]")
	WebElement AddSoftwareButton;

	//Vishakha
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[2]/td[2]")
	WebElement controlUnit_MCM;

	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]/td[4]")
	WebElement controlUnit_PLD;
		
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_MCM_TrashButton;
		
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_PLD_TrashButton;
		
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleNavigationArrangement.visible')]")
	WebElement NavigationTab;

	@FindBy(xpath="//button[contains(@data-ng-click,'showAllExistingLicences($event)')]")
	WebElement NavigationTab_ShowExpandedView;

	@FindBy(xpath="//button[contains(@data-ng-click,'editMajVersionNumbers')]")
	WebElement EditMajorAssembliesButton;

	@FindBy(xpath="//input[contains(@name,'AS_navigationMajorVerNumber_usage_majorNum3_majorVersionNumber')]")
	WebElement NavigationTab_MajorVersionNumber;

	@FindBy(xpath="//button[contains(@data-ng-click,'addLicenseGenerationInfo($event)')]")
	WebElement NavigationTab_AddActivationCodeInfoButton;

	@FindBy(xpath="//input[contains(@name,'vehicle_activeMapVersionInfo_mapVersion_eStand')]")
	WebElement NavigationTab_MapversionEStand;

	@FindBy(xpath="//input[contains(@name,'vehicle_activeMapVersionInfo_mapVersion_softwareId')]")
	WebElement NavigationTab_SoftwareID;

	@FindBy(xpath="(//button[contains(@data-ng-click,'MapVersionsTable')])[2]")
	WebElement NavigationTab_CheckMark;

	@FindBy(xpath="(//button[contains(@data-ng-click,'MapVersionsTable')])[1]")
	WebElement NavigationTab_FilterButton;

	@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
	WebElement NavigationTab_FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'MapVersionsTable_rec')])[2]")
	WebElement NavigationTab_FilterText_Delete;

	@FindBy(xpath="//input[contains(@name,'AS_installedSoftware_objectNumber')]")
	WebElement AddSoftware_ObjectNumber;

	@FindBy(xpath="//button[contains(@data-ng-click,'addComponent($event)')]")
	WebElement AddComponentButton;

	@FindBy(xpath="//input[contains(@name,'AS_additionalComponent_alias')]")
	WebElement Alias_component;

	@FindBy(xpath="//a[contains(@data-ng-click,'partsGroup.designation.requestedText')]")
	WebElement ControlUnitTab_sort;

	@FindBy(xpath="(//button[contains(@data-ng-click,'resetSorting($event)')])")
	WebElement ControlUnitTab_ResetSort;

	@FindBy(xpath="//span[contains(@data-ng-bind-html,'ControlUnitXML_211')]")
	WebElement CloseButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind-html,'VehicleControlUnits_201')])[2]")
	WebElement ControlUnitTab_FilterButton;

	@FindBy(xpath="//input[contains(@input-binding,'controlUnitTable_filterExpression')]")
	WebElement ControlUnitTab_FilterText;

	@FindBy(xpath="(//button[contains(@data-ng-click,'controlUnitTable_rec')])[2]")
	WebElement ControlUnit_DeleteButton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'softwareTable_rec')])")
	WebElement ControlUnit_Software_DeleteButton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'componentTable_rec')])")
	WebElement ControlUnit_Component_DeleteButton;

	@FindBy(xpath="//*[@id=\"VehicleControlUnits_201\"]/div/div[2]/form/div[1]/div/button[2]")
	WebElement ControlUnitTab_CancelFilter;

	@FindBy(xpath="//button[contains(@data-ng-click,'showControlUnitOverview')]")
	WebElement ControlUnitTab_arrowButton;

	@FindBy(xpath="//*[@id=\"controlUnitTable\"]/tbody/tr[1]/td[5]/span")
	WebElement ControlUnitTab_IDCode;

	@FindBy(xpath="//*[@id=\"cuTable\"]/tbody/tr[1]/td[1]/span")
	WebElement ControlUnitTab_NewWindow;

	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.afterTreatmentSystem.id')]")
	WebElement EATNumber;

	String ActualIdCode;
	String parentwindowID;
	String childwindowID;
	String childwindowID2;

	/* Theft Relevant Tab of Vehicle Data Module*/

	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleTheftRelevantDataArrangement.visible')]")
	WebElement TheftRelevantTab;

	@FindBy(xpath="//button[contains(@data-ng-click,'showLockData($event)')]")
	WebElement LockButton;

	@FindBy(xpath="//button[contains(@data-ng-click,'editLockData')]")
	WebElement EditLock_Data;

	@FindBy(xpath="//input[contains(@name,'mechanicalLockNumber')]")
	WebElement Mechanical_Lock;

	@FindBy(name="electronicLockNumber")
	WebElement Electrical_Lock;

	@FindBy(xpath="//button[contains(@data-ng-click,'editDevice')]")
	WebElement Infotainment;

	@FindBy(xpath="//input[contains(@name,'vehicle_AS_cdPlayer_serialNumber')]")
	WebElement CDChanger;

	@FindBy(xpath="//button[contains(@data-ng-click,'showComandPin($event)')]")
	WebElement Pin;

	@FindBy(xpath="//button[contains(@data-ng-click,'editComandPin')]")
	WebElement EditPin;

	@FindBy(xpath="//input[contains(@name,'vehicle_AS_controlUnit_typeOf_HEADUNIT_AS_theftProtectionPin')]")
	WebElement PinText;

	@FindBy(xpath="//button[contains(@data-ng-click,'showImmobilizerCode($event)')]")
	WebElement ImmobilizerCode;

	@FindBy(xpath="//button[contains(@data-ng-click,'editImmobilizerCode')]")
	WebElement ImmobilizerCode_Edit;

	@FindBy(xpath="//input[contains(@name,'vehicle_AS_immobilizer_code')]")
	WebElement ImmobilizerCode_text;

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

	@FindBy(xpath="//button[contains(@data-ng-click,'modifySalesData')]")
	WebElement EditSalesData;

	@FindBy(xpath="//input[contains(@name,'orderCountry')]")
	WebElement OrderCountry;

	@FindBy(xpath="//input[contains(@name,'consumerCountry')]")
	WebElement ConsumerCountry;

	@FindBy(xpath="//Select[contains(@name,'vehicle_AS_modeOfShipment')]")
	WebElement ModeOfShopment;

	@FindBy(xpath="//input[contains(@name,'vehicle_AS_dateOfTechnicalState')]")
	WebElement DateOfTechnicalState;

	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.orderNumber')])[2]")
	WebElement SalesDataTab_OrderNumber;

	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.dateOfTechnicalState')]")
	WebElement SalesDataTab_TechnicalState;

	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductDate.shipmentDate')])[2]")
	WebElement SalesDataTab_InitialRegistrationTab;

	/* Certification Tab of Vehicle Data Module*/

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleCertificationArrangement.visible')]")
	WebElement CertificationTab;

	@FindBy(xpath="//button[contains(@data-ng-click,'editVehicleOwnershipTitleNo')]")
	WebElement EditVehicleOwnershipTitleNo_Button;

	@FindBy(xpath="//input[contains(@name,'vehicle_activeCustomerServiceData_vehicleOwnershipTitleNo')]")
	WebElement VehicleOwnershipTitleNo_Text;

	@FindBy(xpath="//button[contains(@data-ng-click,'editDocumentKey')]")
	WebElement EditDocumentKey;

	@FindBy(xpath="(//button[contains(@data-ng-click,'editDocumentKey')])[2]")
	WebElement AdditionalApproval_EditDocumentKey;

	@FindBy(xpath="//input[contains(@name,'cocNumber')]")
	WebElement Documentkey_Text;

	@FindBy(xpath="(//input[contains(@name,'cocNumber')])[2]")
	WebElement AdditionalApproval_Documentkey_Text;

	@FindBy(xpath="//span[contains(@data-ng-bind,'VehicleCertificationAdditionalDataArrangement')]")
	WebElement AdditionalApproval_Button;

	@FindBy(xpath="//span[contains(@data-ng-bind-html,'VehicleSearchFoot_000')]")
	WebElement Save_Button;

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

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleModelPlateArrangement.visible')]")
	WebElement ModelPlateTab;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editData')]")
	WebElement ModelPlateTab_EditDataButton;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_combinedWeightKg')]")
	WebElement ModelPlateTab_CombinedWeightKG;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_axleLoadLb1')]")
	WebElement ModelPlateTab_AxleLoad1Update;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_axleLoadLb2')]")
	WebElement ModelPlateTab_AxleLoad2Update;
	
	@FindBy(xpath="//*[@id='1f99b051:119848e3b40:-7fae']")
	WebElement ModelPlateTab_Premaxleloadaxle4;
	
	@FindBy(xpath="//*[@id='1f99b051:119848e3b40:-7fb0']")
	WebElement ModelPlateTab_Premaxleloadaxle3;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_egPermitNumber')]")
	WebElement ModelPlateTab_EUApprovalNumber_Update;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_productionYear')]")
	WebElement ModelPlateTab_ProductionYear_Update;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_productionMonth')]")
	WebElement ModelPlateTab_ProductionMonth_Update;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_engineModelDesignation')]")
	WebElement ModelPlate_EngineModelDesignation;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeModelPlate_countOfSeats')]")
	WebElement ModelPlate_CountSeats;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'extendedApproval($event)')]")
	WebElement ModelPlate_ShowAdditionalModalPlate_Button;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editModelPlateData')]")
	WebElement ModalPlate_EditModalPlateData_Button;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeAdditionalModelPlate_egPermitNumber')]")
	WebElement ModalPlate_EgPermitNumber;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeAdditionalModelPlate_modelYear')]")
	WebElement ModalPlate_ModelYear;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_activeAdditionalModelPlate_emptyMassKg')]")
	WebElement ModalPlate_CurbWeight;

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

	/* Equipment Tab of Vehicle Data Module*/

	@FindBy(xpath="//*[@id=\"VehicleArrangement\"]/div[2]/div[2]/div/div/ul/li[19]")
	WebElement EquipmentTab;
	
	@FindBy(xpath="//*[@id='VehicleEquipment_110']/div/div[2]/form/div[1]/div/button[1]")
	WebElement EquipmentTab_Addcolor_button;

	@FindBy(xpath = "//*[@id='paintTable_110']/tbody/tr[3]/td[2]/div/input")
	WebElement colorsCode;
	@FindBy(xpath="//input[contains(@name,'vehicle_AS_scratchResistantVarnish')]")
	WebElement EquipmentTab_ScratchResistant_text;
	
	@FindBy(xpath="//*[@id='paintTable_110']/tbody/tr[3]/td[5]/span/button[1]")
	WebElement EquipmentTab_submit;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editMiscellaneous')]")
	WebElement EquipmentTab_EditOtherButton;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_AS_lights')]")
	WebElement EquipmentTab_Lamps;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_AS_windscreenWiper')]")
	WebElement EquipmentTab_WindWipers;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_AS_tire')]")
	WebElement EquipmentTab_TiresManufacturer;

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
	
	@FindBy(xpath="//button[contains(@data-ng-click,'add($event)')]")
	WebElement InternalTextTab_AddTextButton;
	
	@FindBy(xpath="//textarea[contains(@name,'consolidatedProductData_internalText_textContent')]")
	WebElement InternalTextTab_TextContent;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'internalTextTable')]")
	WebElement InternalText_FilterButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
	WebElement InternalText_FilterText;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'internalTextTable_rec')])[2]")
	WebElement InternalText_TrashButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'internalTextTable')])[2]")
	WebElement InternalTextTab_CheckmarkButton;
	
//	@FindBy(xpath="(//button[contains(@data-ng-click,'editRow')])[3]")
//	WebElement InternalTextTab_EditButton;
	
	@FindBy(xpath="//table[@id='internalTextTable']//button[contains(@data-ng-click,'editRow')]")
	WebElement InternalTextTab_EditButton;

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
	WebElement LoggingTab_FilterButton;

	@FindBy(xpath="//*[@id=\"accessLog\"]/thead/tr/th[5]/div[1]/a")
	WebElement LoggingTab_Sort;

	@FindBy(xpath="//button[contains(@data-ng-click,'editVehicleHeadData')]")
	WebElement Edit_Basic_Data;

	@FindBy(name="vehicle_AS_orderNumber")
	WebElement OderNumber_Edit;

	@FindBy(name="vehicle_AS_vin")
	WebElement VinNumberEdit;

	@FindBy(name="vehicle_AS_productionNumber")
	WebElement ProductionNumber_Edit;

	@FindBy(xpath="//button[contains(@data-ng-click,'save($event)')]")
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

	@FindBy(xpath="(//span[contains(@data-ng-bind,'cvBodyType')])[2]")
	WebElement BodyType;

	@FindBy(xpath="(//li[contains(@data-ng-show,'viewControl.VehicleFOTextArrangement.visible')])")
	WebElement FOText_Tab;

	@FindBy(xpath="(//button[contains(@data-ng-click,'addFoText($event)')])")
	WebElement FOText_AddTextButton;

	@FindBy(xpath="(//span[contains(@data-ng-bind,'gTableFO_rec.designation.requestedText')])")
	WebElement FOText_Designation;

	@FindBy(xpath="(//textarea[contains(@name,'consolidatedProductData_fieldOrganisationText_textContent')])")
	WebElement FOText_TextContent;

	@FindBy(xpath="(//button[contains(@data-ng-click,'foTable')])")
	WebElement FOText_CheckMarkButton;

	@FindBy(xpath="(//button[contains(@data-ng-click,'foTable')])[2]")
	WebElement FOText_DeleteButton;

	@FindBy(xpath="(//li[contains(@data-ng-show,'viewControl.VehicleTheftArrangement.visible')])")
	WebElement TheftArrangementTab;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleTATextArrangement')]")
	WebElement TechnicalAdviceTest_Tab;
	
	@FindBy(xpath="//a[contains(@ng-click,'logoutUser()')]")
	WebElement LogoutUser;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'addText($event)')]")
	WebElement TechnicalAdviceTest_AddTextButton;
	
	@FindBy(xpath="//textarea[contains(@name,'consolidatedProductData_technicalAdviceText_textContent')]")
	WebElement TechnicalAdviceTest_TextContent;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
	WebElement TechnicalAdviceTest_CheckMarkButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'localTextTable_rec')]")
	WebElement TechnicalAdviceTest_EditButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'localTextTable_rec')])[2]")
	WebElement TechnicalAdviceTest_TrashButton;

	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleInternalArrangement.visible')]")
	WebElement InternalTab;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editVehicleState')]")
	WebElement InternalTab_EdiVehicleStateButton;
	
	@FindBy(xpath="//select[contains(@name,'Status')]")
	WebElement InternalTab_Status;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'editProductIndicators')]")
	WebElement InternalTab_EditProductIndicator;
	
	@FindBy(xpath="//input[contains(@name,'lockIndicator')]")
	WebElement InternalTab_LockIndicator;
	
	@FindBy(xpath="//textarea[contains(@name,'liabilityComment')]")
	WebElement InternalTab_LiabilityComment;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleReservationArrangement')]")
	WebElement OrdersOfTheftRelevantPartsTab;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'reservationTable_rec')]")
	WebElement OrdersOfTheftRelevantPartsTab_pencilButton_ReadingUser;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'createOrder($event)')]")
	WebElement OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_reservation_orderNumber')]")
	WebElement OrdersOfTheftRelevantPartsTab_OrderNumber;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_reservation_designation')]")
	WebElement OrdersOfTheftRelevantPartsTab_Description;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
	WebElement OrdersOfTheftRelevantPartsTab_CheckmarkButton;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'createPartOrder($event)')]")
	WebElement OrdersOfTheftRelevantPartsTab_CreatePart;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_reservation_cur_finRelatedParts_objectNumber')]")
	WebElement OrdersOfTheftRelevantPartsTab_ObjectNumber;
	
	@FindBy(xpath="//select[contains(@name,'vehicle_reservation_cur_finRelatedParts_typeOf')]")
	WebElement OrdersOfTheftRelevantPartsTab_TypeOfPartOrder;
	
	@FindBy(xpath="//input[contains(@name,'vehicle_reservation_cur_finRelatedParts_comment')]")
	WebElement OrdersOfTheftRelevantPartsTab_Comment;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
	WebElement OrdersOfTheftRelevantPartsTab_Checkmark;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'filterOrder')]")
	WebElement OrdersOfTheftRelevantPartsTab_FilterOrderButton;
	
	@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
	WebElement OrdersOfTheftRelevantPartsTab_FilterOrderText;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'reservationTable')])[3]")
	WebElement OrdersOfTheftRelevantPartsTab_DeleteButton;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'reservationTable')])[2]")
	WebElement OrdersOfTheftRelevantPartsTab_FilterOrderEditButton;
	
	@FindBy(xpath="//input[contains(@name,'userid')]")
	WebElement Username;
	
	@FindBy(xpath="//button[contains(@id,'next-btn')]")
	WebElement Nextbutton;
	
	@FindBy(xpath="//input[contains(@name,'password')]")
	WebElement Password;
	
	@FindBy(xpath="//button[contains(@id,'loginSubmitButton')]")
	WebElement LogOnButton;
	
	@FindBy(xpath="//a[contains(@ng-click,'logoutUser()')]")
	WebElement LogoutButton;
	
	@FindBy(xpath="//a[contains(@href,'VehicleArrangement.html')]")
	WebElement VehicleDataTab;

	@FindBy(xpath="//div[contains(@id,'ControlUnits')]//span[contains(@class,'rc-i-line-pencil')]")
	WebElement controlUnitsTab_Edit;
	
	@FindBy(xpath="//input[contains(@name,'consolidatedProductData_controlUnit_AS_version')]")
	WebElement controlUnitsTab_Version;
	
	@FindBy(xpath="//input[contains(@name,'consolidatedProductData_controlUnit_AS_objectNumber')]")
	WebElement controlUnitsTab_HardwareObject;
	
	@FindBy(xpath="//input[contains(@name,'consolidatedProductData_controlUnit_AS_serialNumber')]")
	WebElement controlUnitsTab_SerialNumber;
	
	@FindBy(xpath="//table[@id='controlUnitTable']//tr[@tabindex='0']")
	WebElement controlUnits_FilteredResult;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]")
	WebElement controlUnits_FilteredResult_Display;
	
	@FindBy(xpath="//table[@id='internalTextTable']//tr[@tabindex='0']")
	WebElement internalTextsTab_filteredResult;
	
	@FindBy(xpath="//span[@data-ng-bind-html='::alert.msg']")
	WebElement controlUnits_Error_Line1;
	
	@FindBy(xpath="//div[@data-ng-repeat='alert in alerts']//p[1]")
	WebElement controlUnits_Error_Line2;
	
	@FindBy(xpath="//div[@data-ng-repeat='alert in alerts']//p[2]")
	WebElement controlUnits_Error_Line3;

	@FindBy(xpath="//input[@name='consolidatedProductData_controlUnit_idCode']")
	WebElement controlUnits_IdCode;

	@FindBy(xpath="//select[@name='lockingSystemType']")
	WebElement editLock_Model;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]/td[2]")
	WebElement controlUnit_Seat;
	
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_Seat_TrashButton;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]/td[2]")
	WebElement controlUnit_Obc;
	
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_Obc_TrashButton;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[1]/td[2]")
	WebElement controlUnit_Vpdpar;
	
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_Vpdpar_TrashButton;
	
	@FindBy(xpath="//*[@id='controlUnitTable']/tbody/tr[2]/td[2]")
	WebElement controlUnit_Par;
	
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_Par_TrashButton;
	
	@FindBy(xpath="(//*[@id='controlUnitTable']//*[text()='DIA'])[1]")
	WebElement controlUnit_Dia;
	
	@FindBy(xpath="//*[@id='softwareTable']//*[contains(@class,'trash')]")
	WebElement controlUnit_Par_Dia;
	
	@FindBy(xpath="//table[@id='controlUnitTable']//tr[@tabindex='0']")
	WebElement controlUnitTable_FirstRow;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[3]")
	WebElement controlUnitTable_McmSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeProductId')]")
	WebElement controlUnitTable_MajorAssemblyNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.cuDesignation')]")
	WebElement controlUnitTable_EcuName;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.idCode')]")
	WebElement controlUnitTable_IdCode;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.objectNumber')]")
	WebElement controlUnitTable_HardwareObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.calibrationId')]")
	WebElement controlUnitTable_CalibrationId;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.activation')]")
	WebElement controlUnitTable_PerformanceMapProtection;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.version')]")
	WebElement controlUnitTable_Version;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.dateOfFirstAfterSalesAccess | idate')]")
	WebElement controlUnitTable_ServiceStatusSince;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.downloadVersion')]")
	WebElement controlUnitTable_CbfRevision;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.immobilizierStatus')]")
	WebElement controlUnitTable_ImmobilizerStatus;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.cvnCoding')]")
	WebElement controlUnitTable_Cvn;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.certificationId')]")
	WebElement controlUnitTable_CerficateDesignation;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.plant')]")
	WebElement controlUnitTable_Plant;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.lastModificationDate')]")
	WebElement controlUnitTable_LastModification;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.specialCharacteristic')]")
	WebElement controlUnitTable_SpecialProperties;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.diagnosticVersion')]")
	WebElement controlUnitTable_DiagVersion;
	
	@FindBy(xpath="//table[@id='dataRecordTable']")
	WebElement controlUnit_DataRecordTable;
	
	@FindBy(xpath="//table[@id='varCodingDomainTable']")
	WebElement controlUnit_VarCodingDomainTable;
	
	@FindBy(xpath="//table[@id='parameterTable']")
	WebElement controlUnit_ParameterTable;
	
	@FindBy(xpath="//span[text()='Close']")
	WebElement controlUnit_Close;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[2]")
	WebElement controlUnitTabe_PldSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeProductId')]")
	WebElement controlUnit_EngineNo;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_priority_prio1')]")
	WebElement controlUnit_DataRecordObjectNumber_1;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'get_priority_prio1')])[2]")
	WebElement controlUnit_DataRecordObjectNumber_2;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_eolFineCorrectionX')]")
	WebElement controlUnit_EolFineCorrectionX;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_eolFineCorrectionY')]")
	WebElement controlUnit_EolFineCorrectionY;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_pldParam1')]")
	WebElement controlUnit_Parameterization1;

	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_pldParam2')]")
	WebElement controlUnit_Parameterization2;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_pldParam3')]")
	WebElement controlUnit_Parameterization3;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_pldParam4')]")
	WebElement controlUnit_Parameterization4;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_pldParam5')]")
	WebElement controlUnit_Parameterization5;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeConfiguration.calibrationId')]")
	WebElement controlUnit_calId;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.rechi')]")
	WebElement controlUnit_PerformanceChange;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_erraticValuePump')]")
	WebElement controlUnit_UnitPumpDispersion;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_usage_correctionAngleOt')]")
	WebElement controlUnit_TdcCorrectionAngle;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.used ')]")
	WebElement controlUnit_Used;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[2]")
	WebElement controlUnit_SeatSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.cuDesignation')]")
	WebElement controlUnit_CuDesignation;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewControl.description')]")
	WebElement controlUnit_Designation;
	
	@FindBy(xpath="//span[text()='Back']")
	WebElement controlUnit_Back;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[2]")
	WebElement controlUnit_ObcSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.provisioningCertificateId')]")
	WebElement controlUnit_ProvisioningCertificateIdPaid;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[2]")
	WebElement controlUnit_VpdparSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewControl.description')]")
	WebElement controlUnit_Vpdpar_Description;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'iewDataObject.activeState.object')]")
	WebElement controlUnit_Vpdpar_ObjectNumber;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[3]")
	WebElement controlUnit_ParSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewControl.description')]")
	WebElement controlUnit_Par_Description;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'iewDataObject.activeState.object')]")
	WebElement controlUnit_Par_ObjectNumber;
	
	@FindBy(xpath="(//span[contains(@class,'line-search')])[3]")
	WebElement controlUnit_DiaSearch;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewControl.description')]")
	WebElement controlUnit_Dia_Description;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.activeState.objectNumber')]")
	WebElement controlUnit_Dia_HardwareObjectNumber;
	
	@FindBy(xpath="//table[@id='objectNumberParameterTable']")
	WebElement controlUnit_Dia_Table;
	
	@FindBy(xpath="//table[@id='typeParameterTable']")
	WebElement controlUnit_Dia_ModelTable;
	@FindBy(xpath="//span[contains(@data-ng-bind,'logout')]/following-sibling::span")
	WebElement logout;
	@FindBy(xpath="//span[text() = 'Edit PCID']")
	WebElement controlUnit_ProvisioningCertificateIdEdit;
	@FindBy(xpath="//input[@name='AS_provisioningCertificateId']")
	WebElement controlUnit_ProvisioningCertificateIdUpdate;
	@FindBy(xpath="//button[contains(@data-ng-click,'save($event)')]")
	WebElement controlUnit_ProvisioningCertificateIdApply;
	@FindBy(xpath="(//span[contains(@class,'line-industry')])[4]")
	WebElement controlUnit_ProductionStatus;
	@FindBy(xpath="(//span[contains(@class,'line-industry')])[3]")
	WebElement controlUnit_ProductionStatus_ACM;

	@FindBy(xpath = "//*[@id='controlUnitTable']/tbody/tr[1]/td[2]/span")
	WebElement ACMClick;
//Kartik
	@FindBy(xpath="//*[@class='mdsd-alert ng-scope ng-isolate-scope alert alert-dismissible alert-danger']")
	WebElement alertBox;
	
	@FindBy(xpath="//*[@class='close']")
	WebElement alertBoxClose;
	
	// Initializing the page objects
	public VehicleDataPage() {
		PageFactory.initElements(driver, this);
	}

	public Boolean validateVehicleDataPage() {	
		warmup4();
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
		for (i=0;i<search_list.size();i++){

			if((arr[i].equals(search_list.get(i).getText()))){
				count++;

			}

		}

		Assert.assertEquals(count, arr.length);
	}

	public void searchfin() throws InterruptedException {

		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WDB964426 2L 990584");
		searchButton.click();
		Thread.sleep(5000);

	}

	public void searchfin_PassengerCarWithRightAccess() throws InterruptedException {

		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WDB9634272L898132");
		// updated for test2 env
		//searchInput.sendKeys("WDD2042011F483679");

		searchButton.click();
		Thread.sleep(5000);

	}
	public void searchfin_PassengerCarWithRightAccessRU() throws InterruptedException {

		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WDB9634272L992621");
		// updated for test2 env
		//searchInput.sendKeys("WDD2042011F483679");

		searchButton.click();
		Thread.sleep(5000);

	}
	public void searchfin_PassengerCarWithRightAccessMCM() throws InterruptedException {

		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.clear();
		warmup();			  
		searchInput.sendKeys("WDB9630021L859303");
		searchButton.click();
		Thread.sleep(3000);
	}
	public void controlUnit_MCM() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_MCM));
		warmup5();
		controlUnit_MCM.click();
	}
	public void searchfin_PassengerCarWithRightAccessPLD() throws InterruptedException {

		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WKK62962713115728");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void controlUnit_Seat() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_Seat));
		controlUnit_Seat.click();
	}
	
	public void controlUnit_Obc() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_Obc));
		controlUnit_Obc.click();
	}
	
	public void controlUnit_Vpdpar() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_Vpdpar));
		controlUnit_Vpdpar.click();
	}
	
	public void controlUnit_Par() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_Par));
		controlUnit_Par.click();
	}
	
	public void controlUnit_Dia() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_Dia));
		controlUnit_Dia.click();
	}
	
	public void searchfin_PassengerCarWithRightAccess_Seat() throws InterruptedException {
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.clear();			  
		searchInput.sendKeys("WDD2043881G442534");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void searchfin_PassengerCarWithRightAccess_Obc() throws InterruptedException {
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.clear();			  
		searchInput.sendKeys("WDB9634272L992621");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void searchfin_PassengerCarWithRightAccess_Vpdpar() throws InterruptedException {
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("W1V9077331P285142");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void searchfin_PassengerCarWithRightAccess_Par() throws InterruptedException {
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.clear();			  
		searchInput.sendKeys("WDF3753031B950398");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void searchfin_PassengerCarWithRightAccess_Dia() throws InterruptedException {
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.clear();			  
		searchInput.sendKeys("WDB9303191L991052");
		searchButton.click();
		Thread.sleep(5000);
	}
	
	public void controlUnit_PLD() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_PLD));
		controlUnit_PLD.click();
		warmup5();
	}
	
	public void AddSoftware_ObjectNumberMCM(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AddSoftware_ObjectNumber));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AddSoftware_ObjectNumber);
		AddSoftware_ObjectNumber.click();
		AddSoftware_ObjectNumber.sendKeys("Small letters ");
	}
	
	public void controlUnit_MCM_TrashButton(){
		warmup6();
		controlUnit_MCM_TrashButton.click();
	}
	
	public void controlUnit_PLD_TrashButton(){
		warmup6();
		controlUnit_PLD_TrashButton.click();
	}
	
	public void controlUnit_Seat_TrashButton(){
		warmup6();
		controlUnit_Seat_TrashButton.click();
	}
	
	public void controlUnit_Obc_TrashButton(){
		warmup6();
		controlUnit_Obc_TrashButton.click();
	}
	
	public void controlUnit_Vpdpar_TrashButton(){
		warmup6();
		controlUnit_Vpdpar_TrashButton.click();
	}
	
	public void controlUnit_Par_TrashButton(){
		warmup6();
		controlUnit_Par_TrashButton.click();
	}
	
	public void controlUnit_Dia_TrashButton(){
		warmup6();
		controlUnit_Par_TrashButton.click();
	}
	
	public void searchfin_TruckWithRightAccess() throws InterruptedException{

		warmup();

		searchInput.sendKeys("WDB10216360999750");
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

	public String BodyType(){
		String BodyType_value=BodyType.getText();
		return BodyType_value;
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

	public void SalesDataTab(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SalesDataTab));
		SalesDataTab.click();
	}

	public void EditSalesData(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(EditSalesData));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", EditSalesData);
		js.executeScript("arguments[0].click();", EditSalesData);
		//		
		//		Actions act=new Actions(driver);
		//		act.moveToElement(EditSalesData).build().perform();
		//EditSalesData.click();
	}

	public void OrderCountry(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(OrderCountry));
		Actions a=new Actions(driver);
		a.moveToElement(OrderCountry).click().perform();
		OrderCountry.clear();
		OrderCountry.sendKeys("714");
	}

	public void ConsumerCountry(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ConsumerCountry));
		Actions a=new Actions(driver);
		a.moveToElement(ConsumerCountry).click().perform();
		ConsumerCountry.clear();
		ConsumerCountry.sendKeys("705");

	}

	public List<String> ModeOfShopment(){
		warmup();
		Select select=new Select(ModeOfShopment);

		List<String> dropdown = new ArrayList<String>();
		List<WebElement> allOptions = select.getAllSelectedOptions();
		Iterator<WebElement> itr = allOptions.iterator();
		while (itr.hasNext()) {
			String st = itr.next().getText();
			dropdown.add(st);
			warmup();
		}
		return dropdown;
	}

	public void DateOfTechnicalState(){
		warmup();
		DateOfTechnicalState.click();
		wait.until(ExpectedConditions.elementToBeClickable(DateOfTechnicalState));
		Actions a=new Actions(driver);
		a.moveToElement(DateOfTechnicalState).click().perform();
		DateOfTechnicalState.clear();
		DateOfTechnicalState.sendKeys("03/08/2018");
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

	public void SAANumbersTab_PassengerCar(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(SAA_numbers_Tab));
		SAA_numbers_Tab.click();
	}

	public void Add_RemoveSAAButton(){

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", Add_RemoveSAAButton);
		js.executeScript("arguments[0].click();", Add_RemoveSAAButton);
		warmup5();
		//		Add_RemoveSAAButton.click();
	}

	public Boolean Add_RemoveSAAButton_StdUser(){

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", Add_RemoveSAAButton);
		js.executeScript("arguments[0].click();", Add_RemoveSAAButton);
		return Add_RemoveSAAButton.isDisplayed();
		//		Add_RemoveSAAButton.click();
	}

	public void SAANumber_AddNumber(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(SAANumber_AddNumber));
		SAANumber_AddNumber.click();
		SAANumber_AddNumber.sendKeys("40007074");
	}

	public void SAANumber_arrowButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SAANumber_arrowButton));
		SAANumber_arrowButton.click();
	}

	public void GoToAssignmentButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(GoToAssignmentButton));
		GoToAssignmentButton.click();
	}

	public void Usage(){
		warmup();
		Select dropdown=new Select(Usage);
		dropdown.selectByValue("string:engine");
	}

	public void ApplyButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ApplyButton));
		ApplyButton.click();
	}

	public void SaveButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(SaveButton));
		SaveButton.click();
		warmup5();
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

	public void ControlUnitTab_PassengerCar() throws InterruptedException{
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab));
		ControlUnitTab.click();
		
		try{
			//button[contains(@ng-show,'closeable')]
			warmup();

			TechnicalError_Dialog.click();
		}catch(Exception e){

			System.out.println("Technical error is displayed");
		}
		warmup1();

	}

	public void AddControlUnit_button(){
		wait.until(ExpectedConditions.elementToBeClickable(AddControlUnit_button));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AddControlUnit_button);
		js.executeScript("arguments[0].click();", AddControlUnit_button);
		//	AddControlUnit_button.click();
	}

	public void ControlUnitModel(){
		Select dropdown=new Select(ControlUnitModel);
		dropdown.selectByValue("string:SEAT");
	}
	
	public void ControlUnit_DiogenesName(){
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_DiogenesName));
		ControlUnit_DiogenesName.click();
		ControlUnit_DiogenesName.sendKeys("ABC221");
	}

	public void ControlUnit_CheckMarkButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_CheckMarkButton));
		//		JavascriptExecutor js=(JavascriptExecutor)driver;
		//		js.executeScript("arguments[0].scrollIntoView();", AddSoftwareButton);
		ControlUnit_CheckMarkButton.click();

	}

	public void ControlUnit_CheckMarkButton_Alias(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_CheckMarkButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnit_CheckMarkButton);
		ControlUnit_CheckMarkButton.click();
		warmup5();

	}

	public void ControlUnit_SaveButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_SaveButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnit_SaveButton);
		ControlUnit_SaveButton.click();
		warmup1();
	}

	public void AddSoftwareButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(AddSoftwareButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AddSoftwareButton);
		//		js.executeScript("arguments[0].click();", AddSoftwareButton);

		AddSoftwareButton.click();
	}

	public void AddSoftware_ObjectNumber(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AddSoftware_ObjectNumber));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AddSoftware_ObjectNumber);
		AddSoftware_ObjectNumber.click();
		AddSoftware_ObjectNumber.sendKeys("1234");
	}

	public void AddComponentButton(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(AddComponentButton));
		AddComponentButton.click();
	}

	public void Alias_component(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Alias_component));
		Alias_component.click();
		Alias_component.sendKeys("CEID1");
	}

	public void ControlUnitTab_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AddControlUnit_button);
		//		js.executeScript("arguments[0].click();", ControlUnitTab_FilterButton);
		ControlUnitTab_FilterButton.click();
	}

	public void ControlUnitTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitTab_FilterButton);
		js.executeScript("arguments[0].click();", ControlUnitTab_FilterText);
		ControlUnitTab_FilterText.click();
		ControlUnitTab_FilterText.sendKeys("ABC");
		ControlUnitTab_FilterText.sendKeys(Keys.ENTER);
	}
	
	public void ControlUnitTab_FilterText_MCM(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitTab_FilterButton);
		js.executeScript("arguments[0].click();", ControlUnitTab_FilterText);
		ControlUnitTab_FilterText.click();
		ControlUnitTab_FilterText.sendKeys("MCM");
		ControlUnitTab_FilterText.sendKeys(Keys.ENTER);
	}
	
	public void ControlUnitTab_FilterText_PLD(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitTab_FilterButton);
		js.executeScript("arguments[0].click();", ControlUnitTab_FilterText);
		ControlUnitTab_FilterText.click();
		ControlUnitTab_FilterText.sendKeys("PLD");
		ControlUnitTab_FilterText.sendKeys(Keys.ENTER);
	}
	
	public void ControlUnit_DeleteButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_DeleteButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnit_DeleteButton);
		ControlUnit_DeleteButton.click();
	}

	public void ControlUnit_Software_DeleteButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_Software_DeleteButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnit_Software_DeleteButton);
		ControlUnit_Software_DeleteButton.click();
	}

	public void ControlUnit_Component_DeleteButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_Component_DeleteButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnit_Component_DeleteButton);
		ControlUnit_Component_DeleteButton.click();
	}
	

	public void NavigationTab(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab));
		NavigationTab.click();
		warmup();
		Actions a=new Actions(driver);
		a.moveToElement(searchButton).perform();
		warmup();
	}

	public void NavigationTab_ShowExpandedView(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_ShowExpandedView));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", NavigationTab_ShowExpandedView);
		//js.executeScript("arguments[0].click();", NavigationTab_ShowExpandedView);
		NavigationTab_ShowExpandedView.click();
	}

	public void NavigationTab_MajorVersionNumber(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_MajorVersionNumber));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", NavigationTab_MajorVersionNumber);
		js.executeScript("arguments[0].click();", NavigationTab_MajorVersionNumber);
		NavigationTab_MajorVersionNumber.click();
		warmup();
		NavigationTab_MajorVersionNumber.clear();
		NavigationTab_MajorVersionNumber.sendKeys(RandomLabelData_MajorVersionNumber);
	}

	public void NavigationTab_AddActivationCodeInfoButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_AddActivationCodeInfoButton));
		NavigationTab_AddActivationCodeInfoButton.click();
	}

	public void NavigationTab_MapversionEStand(){
		warmup();
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_MapversionEStand));
		js.executeScript("arguments[0].scrollIntoView();", NavigationTab_MapversionEStand);
		js.executeScript("arguments[0].click();", NavigationTab_MapversionEStand);
		NavigationTab_MapversionEStand.click();
		NavigationTab_MapversionEStand.clear();
		NavigationTab_MapversionEStand.sendKeys("DB_DCNTG45A_USA_USA_E23.0072");
	}

	public void NavigationTab_SoftwareID(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_SoftwareID));
		NavigationTab_SoftwareID.click();
		NavigationTab_SoftwareID.clear();
		NavigationTab_SoftwareID.sendKeys("0001110B");
	}

	public void NavigationTab_CheckMark(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_SoftwareID));
		NavigationTab_CheckMark.click();
	}
	public void TheftRelevantData_Tab(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TheftRelevantTab));
		TheftRelevantTab.click();
		warmup5();
	}

	public void NavigationTab_FilterButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_FilterButton));
		NavigationTab_FilterButton.click();
	}

	public void NavigationTab_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_FilterText));
		NavigationTab_FilterText.click();
		NavigationTab_FilterText.sendKeys("DB_DCNTG45A_USA_USA_E23.0072");
		NavigationTab_FilterText.sendKeys(Keys.ENTER);
	}

	public void NavigationTab_FilterText_Delete(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(NavigationTab_FilterText_Delete));
		NavigationTab_FilterText_Delete.click();
	}
	public void LockButton(){
		warmup5();
//		wait.until(ExpectedConditions.visibilityOf(LockButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", LockButton);
		js.executeScript("arguments[0].click();", LockButton);
		//		LockButton.click();
	}

	public void EditLock_Data(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(EditLock_Data));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", EditLock_Data);
	}

	public void Mechanical_Lock(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(Mechanical_Lock));
		Mechanical_Lock.click();
		Mechanical_Lock.clear();
		Mechanical_Lock.sendKeys("11123");
	}

	public void Electrical_Lock(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(Electrical_Lock));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		Actions a=new Actions(driver);
		a.moveToElement(Electrical_Lock).click().build().perform();

		//		js.executeScript("arguments[0].scrollIntoView();", Electrical_Lock);
		//		js.executeScript("arguments[0].click();", Electrical_Lock);
		Electrical_Lock.click();
		Electrical_Lock.clear();
		Electrical_Lock.sendKeys("11113");
	}

	public void Infotainment(){
		wait.until(ExpectedConditions.visibilityOf(Infotainment));
		Infotainment.click();
	}

//	public void CDChanger(){
//		warmup();
//		wait.until(ExpectedConditions.visibilityOf(CDChanger));
//		CDChanger.click();
//		CDChanger.clear();
//		CDChanger.sendKeys(RandomLabelData_DeviceNumber);
//	}

	public void Pin(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(Pin));
		Pin.click();
	}

	public void EditPin(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(EditPin));
		EditPin.click();
	}

	public void PinText(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(PinText));
		warmup();
		PinText.click();
		PinText.clear();
		PinText.sendKeys("EMZ0PW5VRW9FODEH89QNX77J2");
	}

	public void ImmobilizerCode(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(ImmobilizerCode));
		ImmobilizerCode.click();
	}

	public void ImmobilizerCode_Edit(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(ImmobilizerCode_Edit));
		ImmobilizerCode_Edit.click();

	}

	public void ImmobilizerCode_text(){
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(ImmobilizerCode_text));
		ImmobilizerCode_text.click();
		ImmobilizerCode_text.clear();
		ImmobilizerCode_text.sendKeys(RandomRearAxle4ObjectNumber);
	}

	public void ControlUnitTab() throws InterruptedException{

		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab));
		ControlUnitTab.click();
		wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_IDCode));
		ActualIdCode=ControlUnitTab_IDCode.getText();
		System.out.println(ActualIdCode);

		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_sort));

		ControlUnitTab_sort.click();
		warmup5();

		JavascriptExecutor js=(JavascriptExecutor)driver;


		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_ResetSort));

		js.executeScript("arguments[0].click();", ControlUnitTab_ResetSort);

		ControlUnitTab_ResetSort.click();

		//		warmup5();
		//		CloseButton.click();

		//		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitTab_FilterButton));
		//
		//		
		//		js.executeScript("arguments[0].click();", ControlUnitTab_FilterButton);


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

	public Boolean AddControlUnit_button_StdUser(){
		AddControlUnit_button.click();
		return AddControlUnit_button.isDisplayed();
	}

	public Boolean AddSoftwareButton_StdUser(){
		AddSoftwareButton.click();
		return AddSoftwareButton.isDisplayed();
	}

	public Boolean AddComponentButton_StdUser(){
		AddComponentButton.click();
		return AddComponentButton.isDisplayed();
	}
	public void ControlUnitTab_CheckForArrowLink(){

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

		driver.findElement(By.xpath("//*[@id=\"cuTable\"]/tbody/tr[1]/td[15]/span/button[2]")).click();

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

		System.out.println(TheftRelevantTab_LockType.getText());

		try{

			System.out.println(TheftRelevantTab_RadioNumber.getText());
		}catch(Exception e){

			System.out.println("Radio unit number is not present for the vehicle search");
		}

	}

	public void HistoryTab(){

		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab));

		HistoryTab.click();

		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_TechnicalEntryButton));

		//	HistoryTab_TechnicalEntryButton.click();

		warmup1();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", HistoryTab_TechnicalEntryButton);

		//	HistoryTab_TechnicalEntryButton.click();

		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_HistoryOfDependentObject_button));

		warmup1();

		js.executeScript("arguments[0].click();", HistoryTab_HistoryOfDependentObject_button);



		//		HistoryTab_HistoryOfDependentObject_button.click();

		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_InitialStateButton));

		warmup1();

		js.executeScript("arguments[0].click();", HistoryTab_InitialStateButton);


		warmup5();

	}

	public void HistoryTab_CurrentState(){

		JavascriptExecutor js=(JavascriptExecutor)driver;

		wait.until(ExpectedConditions.elementToBeClickable(HistoryTab_CurrentStateButton));

		js.executeScript("arguments[0].click();", HistoryTab_CurrentStateButton);

		warmup5();
	}

	public void CertificationTab(){
		warmup();

		wait.until(ExpectedConditions.elementToBeClickable(CertificationTab));

		CertificationTab.click();
	}

	public void EditVehicleOwnershipTitleNo_Button(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(EditVehicleOwnershipTitleNo_Button));
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("arguments[0].scrollIntoView();", EditVehicleOwnershipTitleNo_Button);
		js.executeScript("arguments[0].click();", EditVehicleOwnershipTitleNo_Button);
		//			Actions act=new Actions(driver);
		//			act.moveToElement(EditVehicleOwnershipTitleNo_Button).click().build().perform();
		//		EditVehicleOwnershipTitleNo_Button.click();
	}

	public void VehicleOwnershipTitleNo_Text(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(VehicleOwnershipTitleNo_Text));
		VehicleOwnershipTitleNo_Text.click();
		VehicleOwnershipTitleNo_Text.clear();
		VehicleOwnershipTitleNo_Text.sendKeys("DT111111");
	}

	public void EditDocumentKey(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(EditDocumentKey));
		EditDocumentKey.click();

	}

	public void Documentkey_Text(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Documentkey_Text));
		Documentkey_Text.click();
		Documentkey_Text.clear();
		Documentkey_Text.sendKeys("U     204047    BAAAAAAA014");
	}

	public void AdditionalDocumentkey_Text(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AdditionalApproval_Documentkey_Text));
		AdditionalApproval_Documentkey_Text.click();
		AdditionalApproval_Documentkey_Text.clear();
		AdditionalApproval_Documentkey_Text.sendKeys("U     204047    BAAAAAAA014");
	}

	public void AdditionalApproval_Button(){
		warmup6();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", AdditionalApproval_Button);										   
		wait.until(ExpectedConditions.elementToBeClickable(AdditionalApproval_Button));
		AdditionalApproval_Button.click();
	}

	public void AdditionalApproval_EditDocumentKey(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(AdditionalApproval_EditDocumentKey));
		AdditionalApproval_EditDocumentKey.click();
	}

	public void Save_Button(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
		Actions act=new Actions(driver);
		act.moveToElement(Save_Button).click().build().perform();
		warmup1();
	}
	
	public void PageRefresh(){
		warmup6();
        driver.navigate().refresh();
	}

	public String CertificationTab_DocumentKey() throws InterruptedException{



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
		warmup5();
		Actions a=new Actions(driver);
		a.moveToElement(IdentificationTab).build().perform();
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab));
		ModelPlateTab.click();

	}
	
	public void ModelPlateTab_EditDataButton(){
		warmup6();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ModelPlateTab_EditDataButton);
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_EditDataButton));
		js.executeScript("arguments[0].click();", ModelPlateTab_EditDataButton);
//		ModelPlateTab_EditDataButton.click();
	}
	
	public void ModelPlateTab_CombinedWeightKG(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_CombinedWeightKG));
		Actions a=new Actions(driver);
		a.moveToElement(ModelPlateTab_CombinedWeightKG).build().perform();
		a.click().build().perform();
		ModelPlateTab_CombinedWeightKG.clear();
		ModelPlateTab_CombinedWeightKG.sendKeys("2021");
	}
	
	public void ModelPlateTab_AxleLoad1Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_AxleLoad1Update));
		ModelPlateTab_AxleLoad1Update.click();
		ModelPlateTab_AxleLoad1Update.clear();
		ModelPlateTab_AxleLoad1Update.sendKeys("2414");
	}
	
	public void ModelPlateTab_AxleLoad2Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_AxleLoad2Update));
		Actions a=new Actions(driver);
		a.moveToElement(ModelPlateTab_AxleLoad2Update).build().perform();
		a.click();
		ModelPlateTab_AxleLoad2Update.clear();
		ModelPlateTab_AxleLoad2Update.sendKeys("2414");
	}
	
	public void ModelPlateTab_TiresAxle1Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_Premaxleloadaxle4));
		Actions a=new Actions(driver);
		a.moveToElement(ModelPlateTab_Premaxleloadaxle4).build().perform();
		a.click();
//		ModelPlateTab_TiresAxle1Update.click();
		ModelPlateTab_Premaxleloadaxle4.clear();//Perm. axle load, axle 4
		ModelPlateTab_Premaxleloadaxle4.sendKeys("2145");
	}
	
	public void ModelPlateTab_RimAxle1Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_Premaxleloadaxle3));
		ModelPlateTab_Premaxleloadaxle3.click();
		ModelPlateTab_Premaxleloadaxle3.clear();
		ModelPlateTab_Premaxleloadaxle3.sendKeys("2567");
	}
	
	public void ModelPlateTab_EUApprovalNumber_Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_EUApprovalNumber_Update));
		ModelPlateTab_EUApprovalNumber_Update.click();
		ModelPlateTab_EUApprovalNumber_Update.clear();
		ModelPlateTab_EUApprovalNumber_Update.sendKeys("2022");
	}
	
	public void ModelPlateTab_ProductionYear_Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_ProductionYear_Update));
		ModelPlateTab_ProductionYear_Update.click();
		ModelPlateTab_ProductionYear_Update.clear();
		ModelPlateTab_ProductionYear_Update.sendKeys("2020");
	}
	
	public void ModelPlateTab_ProductionMonth_Update(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab_ProductionMonth_Update));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", ModelPlateTab_ProductionMonth_Update);
		js.executeScript("arguments[0].click();", ModelPlateTab_ProductionMonth_Update);
//		ModelPlateTab_ProductionMonth_Update.click();
		ModelPlateTab_ProductionMonth_Update.clear();
		ModelPlateTab_ProductionMonth_Update.sendKeys("7");
	}
	
	public void ModelPlate_EngineModelDesignation(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlate_EngineModelDesignation));
		ModelPlate_EngineModelDesignation.click();
		ModelPlate_EngineModelDesignation.clear();
		ModelPlate_EngineModelDesignation.sendKeys("1111");
	}

	public void ModelPlate_CountSeats(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlate_EngineModelDesignation));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ModelPlate_CountSeats);
		js.executeScript("arguments[0].click();", ModelPlate_CountSeats);
//		ModelPlate_CountSeats.click();
		ModelPlate_CountSeats.clear();
		ModelPlate_CountSeats.sendKeys("5");
	}
	
	public void ModelPlate_ShowAdditionalModalPlate_Button(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(ModelPlate_ShowAdditionalModalPlate_Button));
		ModelPlate_ShowAdditionalModalPlate_Button.click();
	}
	
	public void ModalPlate_EditModalPlateData_Button(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ModalPlate_EditModalPlateData_Button));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ModalPlate_EditModalPlateData_Button);
		js.executeScript("arguments[0].click();", ModalPlate_EditModalPlateData_Button);
	//	ModalPlate_EditModalPlateData_Button.click();
	}
	
	public void ModalPlate_EgPermitNumber(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ModalPlate_EgPermitNumber));
		Actions a=new Actions(driver);
		a.moveToElement(ModalPlate_EgPermitNumber).build().perform();
		a.click();
		ModalPlate_EgPermitNumber.clear();
		ModalPlate_EgPermitNumber.sendKeys("2222");	
	}
	
	public void ModalPlate_ModelYear(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ModalPlate_ModelYear));
		Actions a=new Actions(driver);
		a.moveToElement(ModalPlate_ModelYear).build().perform();
		a.click();
		ModalPlate_ModelYear.clear();
		ModalPlate_ModelYear.sendKeys("2020");		
	}
	
	public void ModalPlate_CurbWeight(){
		warmup();
		wait.until(ExpectedConditions.elementToBeClickable(ModalPlate_CurbWeight));
		Actions a=new Actions(driver);
		a.moveToElement(ModalPlate_CurbWeight).build().perform();
		a.click();
		ModalPlate_CurbWeight.clear();
		ModalPlate_CurbWeight.sendKeys(WLTP_VECTO_ID_For2ndEntry);
	}
	
	public String ModelPlateTab_PermGrossVehicleWeight(){
		warmup();
		String ModelPlateTab_PermGrossVehicleWeight_ThinClient=	ModelPlateTab_PermGrossVehicleWeight.getText();

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
		warmup6();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", IdentificationTab);
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(ControlUnitTab).build().perform();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab));
		InternalTextTab.click();
	}
	
	public void InternalTextTab_AddTextButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab_AddTextButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", InternalTextTab_AddTextButton);
		InternalTextTab_AddTextButton.click();
	}
	
	public void InternalTextTab_TextContent(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab_TextContent));
		InternalTextTab_TextContent.click();
		InternalTextTab_TextContent.clear();
		InternalTextTab_TextContent.sendKeys("DTICI Create Internal Texts");
	}
	
	public void InternalTextTab_UpdateTextContent(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab_TextContent));
		InternalTextTab_TextContent.click();
		InternalTextTab_TextContent.clear();
		InternalTextTab_TextContent.sendKeys("DTICI Edit Internal Texts");
	}
	
	
	public void InternalTextTab_CheckmarkButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab_CheckmarkButton));
		InternalTextTab_CheckmarkButton.click();
	}
	
	public void InternalTextTab_EditButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTextTab_EditButton));
		InternalTextTab_EditButton.click();
	}
	
	public void InternalText_FilterButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(InternalText_FilterButton));
		warmup5();
		InternalText_FilterButton.click();
	}
	
	public void InternalText_Create_FilterText(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(InternalText_FilterText));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", InternalText_FilterText);
		InternalText_FilterText.click();
		InternalText_FilterText.sendKeys("DTICI Create Internal Texts");
	}
	
	public void InternalText_FilterText(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(InternalText_FilterText));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", InternalText_FilterText);
		warmup5();
		InternalText_FilterText.click();
		warmup5();
		InternalText_FilterText.sendKeys("DTICI Edit Internal Texts");
	}
	
	public void InternalText_TrashButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(InternalText_TrashButton));
		Actions a=new Actions(driver);
		a.moveToElement(InternalText_TrashButton).build().perform();
	//	a.click();
		InternalText_TrashButton.click();
	}

	public void FactoryAdditionTab_SpecialTruckVehicle(){

		warmup5();

		Actions a=new Actions(driver);

		a.moveToElement(ControlUnitTab).build().perform();

		warmup();

		wait.until(ExpectedConditions.visibilityOf(FactoryAdditionTab));


		FactoryAdditionTab.click();

		warmup();

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

		wait.until(ExpectedConditions.visibilityOf(LoggingTab_FilterButton));

		JavascriptExecutor js=(JavascriptExecutor)driver;

		warmup();

		js.executeScript("arguments[0].click();", LoggingTab_FilterButton);

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

		warmup5();

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

		warmup();	

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", Save_Changes);
		wait.until(ExpectedConditions.elementToBeClickable(Save_Changes));
		js.executeScript("arguments[0].click();", Save_Changes);

		
		//Save_Changes.click();
 //KartikTrial
		try{
			//button[contains(@ng-show,'closeable')]
			warmup();

			TechnicalError_Dialog.click();
		}catch(Exception e){

			System.out.println("Technical error is displayed");
		}
		//KartikTrialEnd

//		try{
//
//			warmup();
//
//			ClearingOption_Button.click();
//
//			warmup();
//
//			Modal_Dialog_Ok_Button.click();
//
//		}catch (Exception e){
//
//			System.out.println("Modal dialog is displayed");
//
//		}
//
//		warmup();
//
//		try{
//			//button[contains(@ng-show,'closeable')]
//			warmup();
//
//			TechnicalError_Dialog.click();
//		}catch(Exception e){
//
//			System.out.println("Technical error is displayed");
//		}
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

		warmup();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", RepositionMajorAssembly_button);


		js.executeScript("arguments[0].click();", RepositionMajorAssembly_button);
	}

	public void EngineID_Edit(){

		warmup();

		wait.until(ExpectedConditions.visibilityOf(EngineID_Edit));

		EngineID_Edit.click();

		EngineID_text.clear();


		warmup();

		EngineID_text.sendKeys(RandomEngineNumber);


	}

	public void Exhaust_Aftertreatment_EditButton(){

		warmup();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", MajorAssmeblyTab);

		warmup();

		RepositionMajorAssembly_button.click();

		warmup();

		wait.until(ExpectedConditions.visibilityOf(Exhaust_Aftertreatment_EditButton));

		Exhaust_Aftertreatment_EditButton.click();

		warmup();

		wait.until(ExpectedConditions.visibilityOf(Exhaust_Aftertreatment_text));

		warmup();

		Exhaust_Aftertreatment_text.clear();

		warmup();

		Exhaust_Aftertreatment_text.sendKeys(RandomExhaustAftertreatmentNumber);


	}

	public void Save_Changes_MajorAssemblies(){

		warmup();

		wait.until(ExpectedConditions.elementToBeClickable(Save_Changes_MajorAssemblies));

		Save_Changes_MajorAssemblies.click();

		warmup1();
	}

	public void TransmissionEdit_button(){

		warmup();

		RepositionMajorAssembly_button.click();

		warmup();

		TransmissionNumber_button.click();

		warmup();

		TranimissionNumber_text.clear();

		TranimissionNumber_text.sendKeys(RandomTransmissionNumber);

		TranimissionNumber_text.sendKeys(Keys.TAB);



		Transmission_ObjectNumber_Edit.clear();

		Transmission_ObjectNumber_Edit.sendKeys(RandomTransmissionVariantNumber_Length);


	}

	public void FrontAxle2_Edit(){

		warmup1();

		RepositionMajorAssembly_button.click();

		warmup();

		FrontAxle2_Edit.click();

		warmup();

		FrontAxle2_text.clear();

		FrontAxle2_text.sendKeys(RandomFrontAxle2Number);

		FrontAxle2_text.sendKeys(Keys.TAB);

		warmup();

		FrontAxle2_ObjectNumber_text.clear();

		FrontAxle2_ObjectNumber_text.sendKeys(RandomFrontAxle2ObjectNumber);


	}

	public void RearAxle3_Edit(){

		warmup1();

		RepositionMajorAssembly_button.click();

		warmup();

		RearAxle3_Edit.click();

		RearAxle3_text.clear();

		warmup();

		RearAxle3_text.sendKeys(RandomRearAxle3Number);

		warmup();

		RearAxle3_text.sendKeys(Keys.TAB);

		warmup();

		RearAxle3_ObjectNumber_text.sendKeys(RandomRearAxle3ObjectNumber);


	}

	public void RearAxle3_Delete(){

		warmup1();

		RepositionMajorAssembly_button.click();

		warmup();

		RearAxle3_Delete.click();
	}


	public void RearAxle4_Edit(){

		warmup1();

		RepositionMajorAssembly_button.click();

		warmup();

		RearAxle4_Edit.click();

		RearAxle4_text.clear();

		warmup();

		RearAxle4_text.sendKeys(RandomRearAxle4Number);

		warmup();

		RearAxle4_text.sendKeys(Keys.TAB);

		warmup();

		RearAxle4_ObjectNumber_text.sendKeys(RandomRearAxle4ObjectNumber);


	}

	public void RearAxle4_Delete(){

		warmup1();

		RepositionMajorAssembly_button.click();

		warmup();

		RearAxle4_Delete.click();
	}

	public void PlantMajorAssemblies_Tab(){

		warmup();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", PlantMajorAssemblies_Tab);


		js.executeScript("arguments[0].click();", PlantMajorAssemblies_Tab);


		warmup();

		PlantMajorAssemblies_Tab_Edit.click();

		warmup();

		PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.click();

		PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.clear();

		PlantMajorAssemblies_Tab_Exhaust_aftertreatment_text.sendKeys(RandomExhaustAftertreatmentNumber);

		warmup();

		PlantMajorAssemblies_Tab_RearAxle4_text.click();

		PlantMajorAssemblies_Tab_RearAxle4_text.clear();

		PlantMajorAssemblies_Tab_RearAxle4_text.sendKeys(RandomRearAxle4Number);

		warmup();

		PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.click();

		PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.clear();

		PlantMajorAssemblies_Tab_RearAxle4_ObjectNumber_text.sendKeys(RandomRearAxle4ObjectNumber);



	}

	public void AlternativeDriveTab(){

		warmup();

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", AlternativeDrive);


		js.executeScript("arguments[0].click();", AlternativeDrive);

		warmup();

		js.executeScript("arguments[0].click();", AlternateDrive_EditMajorAssemblies_button);

		warmup();
		AlternateDrive_EditMajorAssemblies_Editbutton.click();

		warmup();

		ElectricMotorNumber1_text.click();

		ElectricMotorNumber1_text.clear();

		ElectricMotorNumber1_text.sendKeys(RandomElectricMotor1Number);

		ElectricMotorNumber1_text.sendKeys(Keys.TAB);

		warmup();

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




		searchInput.sendKeys("WDB10216360999750");
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

	public Boolean VPD_AddVPD_button_StdUser(){

		warmup();
		VPD_AddVPD_button.click();
		return VPD_AddVPD_button.isDisplayed();
	}

	public void FOText_Tab(){
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(FOText_Tab));
		FOText_Tab.click();
	}

	public void FOText_AddTextButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FOText_AddTextButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", FOText_AddTextButton);
		js.executeScript("arguments[0].click();", FOText_AddTextButton);
	}

	public void FOText_Designation(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FOText_Designation));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", FOText_Designation);
		js.executeScript("arguments[0].click();", FOText_Designation);
		//		FOText_Designation.click();
	}

	public void FOText_TextContent(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FOText_TextContent));
		FOText_TextContent.click();
		FOText_TextContent.sendKeys("Created By MBRDI");
	}

	public void FOText_CheckMarkButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FOText_CheckMarkButton));
		FOText_CheckMarkButton.click();
	}

	public void FOText_DeleteButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(FOText_DeleteButton));
		FOText_DeleteButton.click();
	}

	public void TheftArrangementTab(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(TheftArrangementTab));
		TheftArrangementTab.click();
	}

	public void EditMajorAssembliesButton(){
		warmup();
		wait.until(ExpectedConditions.visibilityOf(EditMajorAssembliesButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", EditMajorAssembliesButton);
		js.executeScript("arguments[0].click();", EditMajorAssembliesButton);
		EditMajorAssembliesButton.click();
	}
	
	public void EquipmentTab(){
		warmup();
		Actions act =new Actions(driver);
		act.moveToElement(IdentificationTab).perform();
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(EquipmentTab));
		warmup5();
		EquipmentTab.click();
		warmup5();
	}
	
	public void EquipmentTab_ADDcolor_button(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_Addcolor_button));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", EquipmentTab_Addcolor_button);
		js.executeScript("arguments[0].click();", EquipmentTab_Addcolor_button);
//		EquipmentTab_EditScratchResistantclearvarnish_button.click();
	}
	
	public void EquipmentTab_colorsCode_text(){
		warmup6();
//		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_ScratchResistant_text));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", EquipmentTab_ScratchResistant_text);
//		js.executeScript("arguments[0].click();", EquipmentTab_ScratchResistant_text);
//		EquipmentTab_ScratchResistant_text.clear();
//		EquipmentTab_ScratchResistant_text.sendKeys("Created By DTICI");
		colorsCode.sendKeys("1234");
	}
	
	public void EquipmentTab_submit(){
		warmup6();
//		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_submit));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", EquipmentTab_submit);
//		js.executeScript("arguments[0].click();", EquipmentTab_EditTires);
//		EquipmentTab_EditTires.click();
		EquipmentTab_submit.click();
	}
	
	public void EquipmentTab_Deletecolor(){
		warmup6();
		WebElement trash=driver.findElement(By.xpath("//*[@id='paintTable_110']/tbody/tr[3]/td[5]/span/button[2]"));
		trash.click();
//		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_TiresManufacturer));
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].scrollIntoView();", EquipmentTab_TiresManufacturer);
//		js.executeScript("arguments[0].click();", EquipmentTab_TiresManufacturer);
//		EquipmentTab_TiresManufacturer.clear();
//		EquipmentTab_TiresManufacturer.sendKeys("CONTINENTAL    CONTINENTAL");

	}
	
	public void EquipmentTab_EditOtherButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_EditOtherButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", EquipmentTab_EditOtherButton);
		js.executeScript("arguments[0].click();", EquipmentTab_EditOtherButton);
//		EquipmentTab_EditOtherButton.click();
	}
	
	public void EquipmentTab_Lamps(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_Lamps));
		Actions a=new Actions(driver);
		a.moveToElement(EquipmentTab_Lamps).build().perform();
		a.click();
		EquipmentTab_Lamps.clear();
		EquipmentTab_Lamps.sendKeys("Created By DTICI");
	}
	
	public void EquipmentTab_WindWipers(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(EquipmentTab_WindWipers));
		Actions a=new Actions(driver);
		a.moveToElement(EquipmentTab_WindWipers).build().perform();
		a.click();
		EquipmentTab_WindWipers.clear();
		EquipmentTab_WindWipers.sendKeys(RandomLabelData_MajorVersionNumber);
		
	}
	
	public void TechnicalAdviceTest_Tab(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_Tab));
		TechnicalAdviceTest_Tab.click();
		warmup5();
//		Actions a=new Actions(driver);
//		a.moveToElement(TechnicalAdviceTest_Tab).build().perform();
//		a.click();
	}
	
	public void TechnicalAdviceTest_AddTextButton(){
		warmup6();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", TechnicalAdviceTest_AddTextButton);
		wait.until(ExpectedConditions.elementToBeClickable(TechnicalAdviceTest_AddTextButton));
		js.executeScript("arguments[0].click();", TechnicalAdviceTest_AddTextButton);
	}
	
	public void TechnicalAdviceTest_TextContent(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_TextContent));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", TechnicalAdviceTest_TextContent);
		TechnicalAdviceTest_TextContent.click();
		TechnicalAdviceTest_TextContent.clear();
		TechnicalAdviceTest_TextContent.sendKeys("Created By DTICI");
	}
	
	public void TechnicalAdviceTest_CheckMarkButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_CheckMarkButton));
//		TechnicalAdviceTest_CheckMarkButton.click();
		Actions a=new Actions(driver);
		a.moveToElement(TechnicalAdviceTest_CheckMarkButton).build().perform();
		a.click().build().perform();
		
	}
	
	public void TechnicalAdviceTest_EditButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_EditButton));
//		TechnicalAdviceTest_CheckMarkButton.click();
		Actions a=new Actions(driver);
		a.moveToElement(TechnicalAdviceTest_EditButton).build().perform();
		a.click().build().perform();
		
	}
	
	public void TechnicalAdviceTest_TextContent_Edit(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_TextContent));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", TechnicalAdviceTest_TextContent);
		TechnicalAdviceTest_TextContent.click();
		TechnicalAdviceTest_TextContent.clear();
		TechnicalAdviceTest_TextContent.sendKeys("Random Data");
	}
	
	public void TechnicalAdviceTest_TrashButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(TechnicalAdviceTest_TrashButton));
//		TechnicalAdviceTest_CheckMarkButton.click();
		Actions a=new Actions(driver);
		a.moveToElement(TechnicalAdviceTest_TrashButton).build().perform();
		a.click().build().perform();
	}
	
	public void InternalTab(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab));
//		TechnicalAdviceTest_CheckMarkButton.click();
		Actions a=new Actions(driver);
		a.moveToElement(InternalTab).build().perform();
		a.click().build().perform();
	}
	
	public void InternalTab_EdiVehicleStateButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab_EdiVehicleStateButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", InternalTab_EdiVehicleStateButton);
		js.executeScript("arguments[0].click();", InternalTab_EdiVehicleStateButton);
//		InternalTab_EdiVehicleStateButton.click();
	}
	
	public void InternalTab_Status(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab_Status));
		Select s=new Select(InternalTab_Status);
		
		try{
			s.selectByValue("string:delivered");
			warmup6();
	//		wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			Actions act=new Actions(driver);
			act.moveToElement(Save_Button).click().build().perform();
			warmup5();
		}catch(Exception e){
			System.out.println("Delivered Status is selected");
		}

		try{
			s.selectByValue("string:inFinalAccept");
			warmup6();
		//	wait.until(ExpectedConditions.elementToBeClickable(Save_Button));
			Actions act=new Actions(driver);
			act.moveToElement(Save_Button).click().build().perform();
			warmup5();
		}catch(Exception e){
			System.out.println("Final Acceptance completed Status is selected");
		}
		
	}
	
	public void InternalTab_EditProductIndicator(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab_EditProductIndicator));
		InternalTab_EditProductIndicator.click();
	}
	
	public void InternalTab_LockIndicator(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab_LockIndicator));
//		TechnicalAdviceTest_CheckMarkButton.click();
		Actions a=new Actions(driver);
		a.moveToElement(InternalTab_LockIndicator).build().perform();
		a.click().build().perform();
	}
	
	public void InternalTab_LiabilityComment(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(InternalTab_LiabilityComment));
		InternalTab_LiabilityComment.click();
		InternalTab_LiabilityComment.clear();
		InternalTab_LiabilityComment.sendKeys(AliasID_Designation1);
	}
	
	public void OrdersOfTheftRelevantPartsTab(){
		warmup6();
		Actions a=new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab));
		OrdersOfTheftRelevantPartsTab.click();
		warmup6();
		a.moveToElement(searchButton).perform();
		warmup();
	}
	
	public void OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton);
		OrdersOfTheftRelevantPartsTab_CreateOrderManuallyButton.click();
		warmup();   
	}
	
	public void OrdersOfTheftRelevantPartsTab_OrderNumber(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_OrderNumber));
		OrdersOfTheftRelevantPartsTab_OrderNumber.click();
		OrdersOfTheftRelevantPartsTab_OrderNumber.clear();
		OrdersOfTheftRelevantPartsTab_OrderNumber.sendKeys(RandomSpecialEquipmentCode);
	}
	
	public void OrdersOfTheftRelevantPartsTab_Description(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_Description));
		OrdersOfTheftRelevantPartsTab_Description.click();
		OrdersOfTheftRelevantPartsTab_Description.clear();
		OrdersOfTheftRelevantPartsTab_Description.sendKeys("Created By DTICI");
	}
	
	public void OrdersOfTheftRelevantPartsTab_CheckmarkButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_CheckmarkButton));
		OrdersOfTheftRelevantPartsTab_CheckmarkButton.click();
	}
	
	public void OrdersOfTheftRelevantPartsTab_CreatePart(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_CreatePart));
		OrdersOfTheftRelevantPartsTab_CreatePart.click();
	}
	
	public void OrdersOfTheftRelevantPartsTab_ObjectNumber(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_ObjectNumber));
		OrdersOfTheftRelevantPartsTab_ObjectNumber.click();
		OrdersOfTheftRelevantPartsTab_ObjectNumber.clear();
		OrdersOfTheftRelevantPartsTab_ObjectNumber.sendKeys(RandomAddVPDContent);
	}
	
	public void OrdersOfTheftRelevantPartsTab_TypeOfPartOrder(){
		warmup6();
		Select s=new Select(OrdersOfTheftRelevantPartsTab_TypeOfPartOrder);
		s.selectByValue("string:theftPartsOrder");
	}
	
	public void OrdersOfTheftRelevantPartsTab_Comment(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_Comment));
		OrdersOfTheftRelevantPartsTab_Comment.click();
		OrdersOfTheftRelevantPartsTab_Comment.clear();
		OrdersOfTheftRelevantPartsTab_Comment.sendKeys("Created By DTICI");
	}
	
	public void OrdersOfTheftRelevantPartsTab_Checkmark(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_Checkmark));
		OrdersOfTheftRelevantPartsTab_Checkmark.click();
	}
	
	
	public void OrdersOfTheftRelevantPartsTab_FilterOrderButton(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_FilterOrderButton));
		OrdersOfTheftRelevantPartsTab_FilterOrderButton.click();
	}
	
	public void OrdersOfTheftRelevantPartsTab_FilterOrderText(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_FilterOrderButton));
		OrdersOfTheftRelevantPartsTab_FilterOrderText.click();
		OrdersOfTheftRelevantPartsTab_FilterOrderText.clear();
		OrdersOfTheftRelevantPartsTab_FilterOrderText.sendKeys(RandomSpecialEquipmentCode);
	}
	
	public boolean OrdersOfTheftRelevantPartsTab_DeleteButton(){
		warmup6();
		OrdersOfTheftRelevantPartsTab_DeleteButton.isDisplayed();
		return true;
		}
	
	
	public void OrdersOfTheftRelevantPartsTab_FilterOrderEditButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_FilterOrderButton));
		OrdersOfTheftRelevantPartsTab_FilterOrderEditButton.click();
	}
	
	public void OrdersOfTheftRelevantPartsTab_OrderNumber_AfterEdit(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_OrderNumber));
		OrdersOfTheftRelevantPartsTab_OrderNumber.click();
		OrdersOfTheftRelevantPartsTab_OrderNumber.clear();
		OrdersOfTheftRelevantPartsTab_OrderNumber.sendKeys(givensalesareanumber);
	}
	
	public void OrdersOfTheftRelevantPartsTab_ObjectNumber_Edit(){
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab_ObjectNumber));
		OrdersOfTheftRelevantPartsTab_ObjectNumber.click();
		OrdersOfTheftRelevantPartsTab_ObjectNumber.clear();
		OrdersOfTheftRelevantPartsTab_ObjectNumber.sendKeys(ControlUnit_SCNVPDIdenta);
	}
	
	
	public void Username(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(Username));
		Username.click();
		Username.clear();
		Username.sendKeys("C0X01477");
	}
	
	public void Nextbutton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(Nextbutton));
		Nextbutton.click();
	}
	
	public void Password(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(Password));
		Password.clear();
		Password.clear();
		Password.sendKeys("3KzDeneTHA");
		
	}
	
	public void VehicleDataTab(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(VehicleDataTab));
		VehicleDataTab.click();
	}
	
	public void LogOnButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(LogOnButton));
		LogOnButton.click();
	}
	
	public void LogoutButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(LogoutButton));
		LogoutButton.click();
		warmup5();
	}
	
    public Boolean TechnicalAdviceTestTab_ForChangingUser(){
		warmup6();
//		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab));
		Actions a=new Actions(driver);
		a.moveToElement(ControlUnitTab).build().perform();
		
		warmup5();
	    return	TechnicalAdviceTest_Tab.isDisplayed();
	}
    
    public void tabClose(){
		warmup6();

//		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab));
	    driver.quit();
	}
    
    public void SwitchToOldTab(){
    	warmup6();
		Set<String> handles=driver.getWindowHandles();		
		List<String> it=new ArrayList<String>(handles);
				
		parentwindowID=it.get(0);
//		childwindowID=it.get(1);			
		warmup4();                   
		driver.switchTo().window(parentwindowID);
    }
    
    public void LogoutUser(){
    	warmup6();
    	wait.until(ExpectedConditions.visibilityOf(LogoutUser));
    	LogoutUser.click();
    }
    
    public void newWindowforReadingUser(){
    	warmup1();
		Set<String> handles=driver.getWindowHandles();
		
		Iterator<String> it=	handles.iterator();					
			
		String parentwindowID=it.next();
		String childwindowID=it.next();
	
	    driver.switchTo().window(parentwindowID);
	    
//	    driver.get("https://vedoc-test1-em1.i.daimler.com/vedocweb/VehicleArrangement.html");
	    
	    warmup6();
	    
	    driver.manage().window().maximize();
    	
    }
    
	public void OpenNewTab(){
		warmup5();
		((JavascriptExecutor)driver).executeScript("window.open(arguments[0])", "https://vedoc-test1-em1.i.daimler.com/vedocweb/");

		Set<String> handles=driver.getWindowHandles();		
		Iterator<String> it=	handles.iterator();	
				
		String parentwindowID=it.next();
		String childwindowID=it.next();			
		warmup6();                   
		driver.switchTo().window(childwindowID);
		warmup5();
		driver.manage().window().maximize();

	}
	public void openNewTab_RU(){
		warmup5();
		JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("https://vedoc-test1-em1.i.daimler.com/vedocweb/");
	}
	
	public void OrdersOfTheftRelevantPartsTab_ReadinguserRights(){
		warmup6();
		Actions a=new Actions(driver);
		a.moveToElement(ControlUnitTab).build().perform();
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(OrdersOfTheftRelevantPartsTab));
		OrdersOfTheftRelevantPartsTab.click();
	}
	
	public boolean OrdersOfTheftRelevantPartsTab_pencilButton_ReadingUser(){
		warmup6();
	     return OrdersOfTheftRelevantPartsTab_pencilButton_ReadingUser.isDisplayed();
	}
	
	public void searchfin_PassengerCarWithRightAccess_ForRightArrowbuttons() throws InterruptedException {
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WDB9");
		rightArrowButton.click();
		Thread.sleep(5000);

	}
	public void searchfin_PassengerCarWithRightAccess_ForlefttArrowbuttons() throws InterruptedException {
		warmup6();
		wait.until(ExpectedConditions.visibilityOf(searchInput));
		searchInput.sendKeys("WDB9");
		leftArrowButton.click();
		Thread.sleep(5000);
	}
	
    public void controlUnitsTab_Edit(){
    	wait.until(ExpectedConditions.visibilityOf(controlUnitsTab_Edit));
    	controlUnitsTab_Edit.click();
    }
    
	public void controlUnitTab_Model_Edit(){
    	wait.until(ExpectedConditions.visibilityOf(ControlUnitModel));
		Select dropdown=new Select(ControlUnitModel);
		dropdown.selectByValue("string:OBC");
	}
	   
	public void controlUnitsTab_Version(){
		controlUnitsTab_Version.clear();
		controlUnitsTab_Version.sendKeys("1");
	}
	
	public void controlUnitsTab_HardwareObject(){
		controlUnitsTab_HardwareObject.clear();
		controlUnitsTab_HardwareObject.sendKeys("100");
	}
	
	public void controlUnitsTab_SerialNumber(){
		controlUnitsTab_SerialNumber.clear();
		controlUnitsTab_SerialNumber.sendKeys("1000");
	}
	
	public String  controlUnits_FilteredResult(){
		String filteredResult = controlUnits_FilteredResult.getText();
		return filteredResult;
	}
	
	public Boolean controlUnits_FilteredResult_DisplayedOrNot(){
		warmup1();
		warmup1();
		return controlUnits_FilteredResult_Display.isDisplayed();
	}
	
	
//	public void controlUnits_FilteredResult_DisplayedOrNot(){
//		if(controlUnits_FilteredResult_Display!= null){
//
//			System.out.println("Element is Present");
//
//			}else{
//
//			System.out.println("Element is Absent");
//
//			}
//}
	
	public Boolean controlUnitsTab_EditButton() {	
		wait.until(ExpectedConditions.elementToBeClickable(controlUnitsTab_Edit));
		return controlUnitsTab_Edit.isDisplayed();
	}
	
	public Boolean internalTextsTab_filteredResult(){
		warmup6();
		return internalTextsTab_filteredResult.isDisplayed();
	}
	
	public void ControlUnitModel_HeadUnit(){
		Select dropdown=new Select(ControlUnitModel);
		dropdown.selectByValue("string:HEADUNIT");
	}

	
	public String controlUnits_Error_Line1() {
		String error=controlUnits_Error_Line1.getText();
		return error;
	}
	
	public void controlUnitsTab_HeadUnit_SerialNumber(){
		controlUnitsTab_SerialNumber.clear();
		controlUnitsTab_SerialNumber.sendKeys("11111111");
	}
	
	public void controlUnits_IdCode(){
		controlUnits_IdCode.click();
		controlUnits_IdCode.click();

		controlUnits_IdCode.click();

		warmup6();

	}
	
	public void editLock_Model(){
    	wait.until(ExpectedConditions.visibilityOf(editLock_Model));
		Select dropdown=new Select(editLock_Model);
		dropdown.selectByValue("string:fbs2");
	}

	public void controlUnitTable_FirstRow(){
		controlUnitTable_FirstRow.click();
	}
	
	public void controlUnitTable_McmSearch(){
		controlUnitTable_McmSearch.click();
		warmup6();
	}
	
	public String controlUnitTable_MajorAssemblyNumber() {
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(controlUnitTable_MajorAssemblyNumber));
		String value =controlUnitTable_MajorAssemblyNumber.getText();
		return value;
	}
	
	public String controlUnitTable_EcuName() {
		String value=controlUnitTable_EcuName.getText();
		return value;
	}
	
	public String controlUnitTable_IdCode() {
		String value=controlUnitTable_IdCode.getText();
		return value;
	}
	
	public String controlUnitTable_HardwareObjectNumber() {
		String value=controlUnitTable_HardwareObjectNumber.getText();
		return value;
	}
	
	public String controlUnitTable_CalibrationId() {
		String value=controlUnitTable_CalibrationId.getText();
		return value;
	}
	
	public String controlUnitTable_PerformanceMapProtection() {
		String value=controlUnitTable_PerformanceMapProtection.getText();
		return value;
	}
	
	public String controlUnitTable_Version() {
		String value=controlUnitTable_Version.getText();
		return value;
	}
	
	public String controlUnitTable_ServiceStatusSince() {
		String value=controlUnitTable_ServiceStatusSince.getText();
		return value;
	}
	
	public String controlUnitTable_CbfRevision() {
		String value=controlUnitTable_CbfRevision.getText();
		return value;
	}
	
	public String controlUnitTable_ImmobilizerStatus() {
		String value=controlUnitTable_ImmobilizerStatus.getText();
		return value;
	}
	
	public String controlUnitTable_Cvn() {
		String value=controlUnitTable_Cvn.getText();
		return value;
	}
	
	public String controlUnitTable_CerficateDesignation() {
		String value=controlUnitTable_CerficateDesignation.getText();
		return value;
	}
	
	public String controlUnitTable_Plant() {
		String value=controlUnitTable_Plant.getText();
		return value;
	}
	
	public String controlUnitTable_LastModification() {
		String value=controlUnitTable_LastModification.getText();
		return value;
	}
	
	public String controlUnitTable_SpecialProperties() {
		String value=controlUnitTable_SpecialProperties.getText();
		return value;
	}
	
	public String controlUnitTable_DiagVersion() {
		String value=controlUnitTable_DiagVersion.getText();
		return value;
	}
	
	public String controlUnit_DataRecordTable() {
		String value=controlUnit_DataRecordTable.getText();
		return value;
	}
	
	public String controlUnit_VarCodingDomainTable() {
		String value=controlUnit_VarCodingDomainTable.getText();
		return value;
	}
	
	public String controlUnit_ParameterTable() {
		String value=controlUnit_ParameterTable.getText();
		return value;
	}
	
	public void controlUnit_Close(){
		controlUnit_Close.click();
		warmup5();
		warmup5();
	}
	
	public void controlUnitTabe_PldSearch(){
		controlUnitTabe_PldSearch.click();
	}
	
	public String controlUnit_EngineNo() {
		wait.until(ExpectedConditions.visibilityOf(controlUnit_EngineNo));
		String value=controlUnit_EngineNo.getText();
		return value;
	}
	
	public String controlUnit_DataRecordObjectNumber_1() {
		String value=controlUnit_DataRecordObjectNumber_1.getText();
		return value;
	}
	
	public String controlUnit_DataRecordObjectNumber_2() {
		String value=controlUnit_DataRecordObjectNumber_2.getText();
		return value;
	}
	
	public String controlUnit_EolFineCorrectionX() {
		String value=controlUnit_EolFineCorrectionX.getText();
		return value;
	}
	
	public String controlUnit_EolFineCorrectionY() {
		String value=controlUnit_EolFineCorrectionY.getText();
		return value;
	}
	
	public String controlUnit_Parameterization1() {
		String value=controlUnit_Parameterization1.getText();
		return value;
	}
	
	public String controlUnit_Parameterization2() {
		String value=controlUnit_Parameterization2.getText();
		return value;
	}
	
	public String controlUnit_Parameterization3() {
		String value=controlUnit_Parameterization3.getText();
		return value;
	}
	
	public String controlUnit_Parameterization4() {
		String value=controlUnit_Parameterization4.getText();
		return value;
	}
	
	public String controlUnit_Parameterization5() {
		String value=controlUnit_Parameterization5.getText();
		return value;
	}
	
	public String controlUnit_calId() {
		String value=controlUnit_calId.getText();
		return value;
	}
	
	public String controlUnit_PerformanceChange() {
		String value=controlUnit_PerformanceChange.getText();
		return value;
	}
	
	public String controlUnit_UnitPumpDispersion() {
		String value=controlUnit_UnitPumpDispersion.getText();
		return value;
	}
	
	public String controlUnit_TdcCorrectionAngle() {
		String value=controlUnit_TdcCorrectionAngle.getText();
		return value;
	}
	
	public void controlUnit_SeatSearch(){
		controlUnit_SeatSearch.click();
	}
	
	public String controlUnit_Used() {
		String value=controlUnit_Used.getText();
		return value;
	}
	
	public String controlUnit_CuDesignation() {
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(controlUnit_CuDesignation));
		String value=controlUnit_CuDesignation.getText();
		return value;
	}
	
	public String controlUnit_Designation() {
		String value=controlUnit_Designation.getText();
		return value;
	}
	
	public void controlUnit_Back(){
		controlUnit_Back.click();
	}
	
	public void controlUnit_ObcSearch(){
		controlUnit_ObcSearch.click();
	}
	
	public String controlUnit_ProvisioningCertificateIdPaid() {
        warmup5();
		wait.until(ExpectedConditions.visibilityOf(controlUnit_ProvisioningCertificateIdPaid));
		String value=controlUnit_ProvisioningCertificateIdPaid.getText();
		return value;
	}

	public void controlUnit_VpdparSearch(){
		controlUnit_VpdparSearch.click();
	}
	
	public String controlUnit_Vpdpar_Description() {
		String value=controlUnit_Vpdpar_Description.getText();
		return value;
	}
	
	public String controlUnit_Vpdpar_ObjectNumber() {
		String value=controlUnit_Vpdpar_ObjectNumber.getText();
		return value;
	}
	
	public void controlUnit_ParSearch(){
		controlUnit_ParSearch.click();
	}
	
	public String controlUnit_Par_Description() {
		String value=controlUnit_Par_Description.getText();
		return value;
	}
	
	public String controlUnit_Par_ObjectNumber() {
		String value=controlUnit_Par_ObjectNumber.getText();
		return value;
	}
	
	public void controlUnit_DiaSearch(){
		controlUnit_DiaSearch.click();
	}
	
	public String controlUnit_Dia_Description() {
		   warmup5();
			wait.until(ExpectedConditions.visibilityOf(controlUnit_Dia_Description));
		String value=controlUnit_Dia_Description.getText();
		return value;
	}
	
	public String controlUnit_Dia_HardwareObjectNumber() {
		String value=controlUnit_Dia_HardwareObjectNumber.getText();
		return value;
	}
	
	public String controlUnit_Dia_Table() {
		String value=controlUnit_Dia_Table.getText();
		return value;
	}
	
	public String controlUnit_Dia_ModelTable() {
		String value=controlUnit_Dia_ModelTable.getText();
		return value;
	}
	public void controlUnit_ProvisioningCertificateIdEdit() {
		controlUnit_ProvisioningCertificateIdEdit.click();
		
	}
	public void controlUnit_ProvisioningCertificateIdUpdate() {
		controlUnit_ProvisioningCertificateIdUpdate.clear();
		controlUnit_ProvisioningCertificateIdUpdate.sendKeys("0032336399163809");
	}
	public void controlUnit_ProvisioningCertificateIdRevert() {
		controlUnit_ProvisioningCertificateIdUpdate.clear();
		controlUnit_ProvisioningCertificateIdUpdate.sendKeys("0032336399163808");
	}
	public void controlUnit_ProvisioningCertificateIdApply() {
		controlUnit_ProvisioningCertificateIdApply.click();
		
	}
	public void controlUnitTable_ProductionStatus(){
		controlUnit_ProductionStatus.click();
		warmup5();
	}
	public void controlUnitTable_ProductionStatus_ACM(){
		warmup5();
		warmup5();
		controlUnit_ProductionStatus_ACM.click();
		warmup5();
		warmup5();
	}
	public void controlunitTab_ACMclick(){
		ACMClick.click();
	}
//Kartik
	public boolean alertBox() {
		if (alertBox.isDisplayed()) {
						return true;
					} else {
						return false;
					}
				}
	
	public void moveToAlertBoxCloseAndClick() throws InterruptedException {
		Thread.sleep(5000);
		Actions	act = new Actions(driver);
		act.moveToElement(alertBoxClose).click().build().perform();	
		}
	
	public  void logout() {
		logout.click();
	}
	
}



