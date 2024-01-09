package com.vedoc.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.vedoc.qa.base.TestBase;

public class GClassVehiclePage extends TestBase {
	
	
	
	@FindBy(xpath="//input[@list='localSearchAutoComplete']")
	WebElement searchInput;
	
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
	
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind-html,'viewDataObject.vehicle.activeAssignedFpd.equipmentCodes')]")
	WebElement VehicleCodes;
	
	
	/*Major Assembly Tab*/
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleMajorAssembliesArrangement.visible')]")
	WebElement MajorAssmeblyTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.id')]")
	WebElement EngineNumber;
	
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.objectNumberVariant')]")
	WebElement Engine_VariantNumber;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.engine.objectNumber')])[2]")
	WebElement Engine_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.id')]")
	WebElement Transmission;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.objectNumberVariant')]")
	WebElement Transmission_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transmission.objectNumber')])[2]")
	WebElement Transmission_ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCase.id')]")
	WebElement TransferCaseNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCase.objectNumberVariant')]")
	WebElement TransferCase_Variant;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCase.objectNumber')])[2]")
	WebElement TransferCase_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).id')]")
	WebElement Front_Axle1;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).objectNumberVariant')]")
	WebElement Front_Axle_Variant;
	
	@FindBy(xpath="(//span[starts-with(@data-ng-bind,'get_typeOf_front1(viewDataObject.vehicle.activeState.axle).objectNumber')])[2]")
	WebElement Front_Axle_ObjectNumber;
	
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
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.cab.id | dPattern')]")
	WebElement Body;
	
	@FindBy(xpath="(//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.pallet')])")
	WebElement PlatformNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCaseSerialNo')]")
	WebElement wdtransfercaseNo;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.transferCaseObjectNo')]")
	WebElement wdtransfercaseNo_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.frontAxleTransmissionNo')]")
	WebElement AllWheelDriveFrontAxleTransmission;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.steeringInfoId')]")
	WebElement Steering;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.steeringInfoObjectNo')]")
	WebElement Steering_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.VehicleMajorAssembly_021')]")
	WebElement PlantMajorAssemblies;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originEngineId')]")
	WebElement PlantMajorAssemblies_EngineNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originEngineObjectVarNo')]")
	WebElement PlantMajorAssemblies_EngineVariantNuber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originEngineObjectNo')]")
	WebElement PlantMajorAssemblies_EngineObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAfterTreatmentSystemId')]")
	WebElement PlantMajorAssemblies_Exhaust_AfterTreatment;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAfterTreatmentSystemObjectVarNo')]")
	WebElement PlantMajorAssemblies_Exhaust_AfterTreatment_Variant;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAfterTreatmentSystemObjectNo')]")
	WebElement PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransmissionId')]")
	WebElement PlantMajorAssemblies_TransmissionNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransmissionObjectVarNo')]")
	WebElement PlantMajorAssemblies_TransmissionNumber_VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransmissionObjectNo')]")
	WebElement PlantMajorAssemblies_TransmissionNumber_ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransferCaseId')]")
	WebElement PlantMajorAssemblies_TransferCaseNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransferCaseObjectVarNo')]")
	WebElement PlantMajorAssemblies_Transfercase_VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originTransferCaseObjectNo')]")
	WebElement PlantMajorAssemblies_Transfercase_ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront1Id')]")
	WebElement PlantMajorAssemblies_FrontAxle1;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront1ObjectVarNo')]")
	WebElement PlantMajorAssemblies_FrontAxle1VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront1ObjectNo')]")
	WebElement PlantMajorAssemblies_FrontAxle1ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront2Id')]")
	WebElement PlantMajorAssemblies_FrontAxle2;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront2ObjectVarNo')]")
	WebElement PlantMajorAssemblies_FrontAxle2VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront2ObjectNo')]")
	WebElement PlantMajorAssemblies_FrontAxle2ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront3Id')]")
	WebElement PlantMajorAssemblies_FrontAxle3;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront3ObjectVarNo')]")
	WebElement PlantMajorAssemblies_FrontAxle3VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront3ObjectNo')]")
	WebElement PlantMajorAssemblies_FrontAxle3ObjectNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront4Id')]")
	WebElement PlantMajorAssemblies_FrontAxle4;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront4ObjectVarNo')]")
	WebElement PlantMajorAssemblies_FrontAxle4VariantNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleFront4ObjectNo')]")
	WebElement PlantMajorAssemblies_FrontAxle4ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear1Id')]")
	WebElement PlantMajorAssemblies_RearAxle1;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear1ObjectVarNo')]")
	WebElement PlantMajorAssemblies_RearAxle1_VariantNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear1ObjectNo')]")
	WebElement PlantMajorAssemblies_RearAxle1_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear2Id')]")
	WebElement PlantMajorAssemblies_RearAxle2;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear2ObjectVarNo')]")
	WebElement PlantMajorAssemblies_RearAxle2_VariantNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear2ObjectNo')]")
	WebElement PlantMajorAssemblies_RearAxle2_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear3Id')]")
	WebElement PlantMajorAssemblies_RearAxle3;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear3ObjectVarNo')]")
	WebElement PlantMajorAssemblies_RearAxle3_VariantNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear3ObjectNo')]")
	WebElement PlantMajorAssemblies_RearAxle3_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear4Id')]")
	WebElement PlantMajorAssemblies_RearAxle4;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear4ObjectVarNo')]")
	WebElement PlantMajorAssemblies_RearAxle4_VariantNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originAxleRear4ObjectNo')]")
	WebElement PlantMajorAssemblies_RearAxle4_ObjectNumber;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeProductionInfo.originCabId')]")
	WebElement PlantMajorAssemblies_Body;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'Displaydescription_label')]")
	WebElement PlantMajorAssemblies_Displaydescription_label;

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
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'hideDesignation($event)')]")
	WebElement HideDesignation_button;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'showDesignation($event)')]")
	WebElement ShowDesignation_button;
	
	@FindBy(xpath="//th[@data-path='consolidatedProductData.equipmentCode.code']/div/a[contains(@data-ng-click,'codeTable')]")
	WebElement Sort;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'resetSorting($event)')]")
	WebElement ResetSorting;
	
	/* VPD and Serial no. Tab */
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleVpdArrangement.visible')]")
	WebElement VPD_SerialNumberTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.Vpd_vpdIdent')]")
	WebElement VPD_sorting;
	
	@FindBy(xpath="(//button[contains(@data-ng-click,'toggleFilter')])[4]")
	WebElement VPD_FilterButton;
	
	@FindBy(xpath="//input[starts-with(@placeholder,'Search the table')]")
	WebElement VPD_SearchVPD;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.titles.VehicleParts_290')]")
	WebElement VPD_SerialButton;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.Vpd_vpdIdent')]")
	WebElement VPD_SerialButton_Sort;
	
	@FindBy(xpath="//*[@id=\"VehicleParts_290\"]/div/div[2]/form/div[1]/div/button")
	WebElement VPD_SerialButton_FilterButton;
	
	@FindBy(xpath="//input[starts-with(@input-binding,'viewControl.partTable_filterExpression')]")
	WebElement VPD_SerialButton_Search;
	
	@FindBy(xpath="//*[@id=\"VehicleParts_290\"]/div/div[2]/form/div[1]/div/button")
	WebElement VPD_SerialButton_CancelFilterButton;
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleControlUnitArrangement.visible')]")
	WebElement ControlUnitTab;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'asLast')]")
	WebElement ControlUnitTab_Search;
	
	@FindBy(xpath="//button[starts-with(@data-ng-click,'back($event)')]")
	WebElement ControlUnitTab_BackButton;
	
	@FindBy(xpath="//*[@id=\"controlUnitTable\"]/thead/tr/th[3]/div[1]/a/span[1]")
	WebElement ControlUnitTab_Sort;
	
	@FindBy(xpath="//*[@id=\"VehicleControlUnits_201\"]/div/div[2]/form/div[1]/div/button[2]")
	WebElement ControlUnitTab_ResetSort;
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleTheftRelevantDataArrangement.visible')]")
	WebElement TheftRelevantTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'viewDataObject.vehicle.activeState.lockingSystem.type')]")
	WebElement TheftRelevantTab_LockType;
	
	@FindBy(xpath="//*[@id=\"VehicleTheftRelevantData_240\"]/div/div[2]/form/div[5]/div/div[1]/div[2]/span")
	WebElement TheftRelevantTab_CommandNumber;
	
	
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
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleRuleArrangement.visible')]")
	WebElement DataValidationTab;
	
	@FindBy(xpath="//button[contains(@data-ng-click,'switchToModificationLog')]")
	WebElement DataValidationTab_ArrowLink;
	
	@FindBy(xpath="//*[@id=\"ruleViolations\"]/thead/tr/th[4]/div[1]/a/span[1]")
	WebElement DataValidationTab_Sort;
	
	@FindBy(xpath="//*[@id=\"VehicleRuleArrangement_body\"]/div/div/div[1]/ul/li[2]/a")
	WebElement DataValidationTab_ValidationRules;
	
	@FindBy(xpath="//*[@id=\"ruleTable\"]/thead/tr/th[3]/div[1]/a")
	WebElement DataValidationTab_ValidationRules_Sort;
	
	@FindBy(xpath="//*[@id=\"VehicleRuleArrangement_body\"]/div/div/div[1]/ul/li[3]/a")
	WebElement DataValidationTab_VPDComparison;
	
	@FindBy(xpath="//*[@id=\"vpdListComparisonCheckResults\"]/thead/tr/th[3]/div[1]/a/span[1]")
	WebElement DataValidationTab_VPDComparison_Sort;
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleSalesDataArrangement.visible')]")
	WebElement SalesDataTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'get_salesAreaType_orderCountry')]")
	WebElement SalesDataTab_SalesUnit;
	
	@FindBy(xpath="//*[@id=\"VehicleSalesData_150\"]/div/div[2]/form/div[3]/div/div[2]/div[3]/span")
	WebElement SalesDataTab_SalesUnit_designation;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeState.dateOfTechnicalState')]")
	WebElement SalesDataTab_TechnicalStateDate;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.activeProductDate.technicalApprovalDate')]")
	WebElement SalesDataTab_FinalAcceptanceDate;	
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'get_salesAreaType_consumerCountry')]")
	WebElement SalesDataTab_ConsumerCountry;
	
	@FindBy(xpath="//*[@id=\"VehicleSalesData_150\"]/div/div[2]/form/div[3]/div/div[3]/div[3]/span")
	WebElement SalesDataTab_ConsumerCountry_Designation;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleCertificationArrangement.visible')]")
	WebElement CertificationTab;
	
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
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.VehicleModelPlateArrangement.visible')]")
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
	
	@FindBy(xpath="//*[@id=\"VehicleArrangement\"]/div[2]/div[2]/div/div/ul/li[19]")
	WebElement EquipmentTab;
	
	@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.Paint_usage')]")
	WebElement EquipmentTab_PaintsTable;
	
	@FindBy(xpath="(//a[contains(@data-ng-click,'tireTable_110')])[2]")
	WebElement EquipmentTab_TiresTable;
	
	@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.ProductLogArrangement.visible')]")
	WebElement LoggingTab;
	
	@FindBy(id="AccessLogging_380_search")
	WebElement LoggingTab_FilterButton;
	
	@FindBy(xpath="//*[@id=\"accessLog\"]/thead/tr/th[5]/div[1]/a")
	WebElement LoggingTab_Sort;
	
	@FindBy(id="AccessLogging_380_search")
	WebElement LoggingTab_SearchButton;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewControl.globalFin')]")
	WebElement GlobalFin;
	
	
	
	public GClassVehiclePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public Boolean validateGClassVehicleDataPage() {
		
		warmup();
		
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		return searchInput.isDisplayed();

	}
	
	public void searchfin() throws InterruptedException {
		searchInput.sendKeys("WDB 461210 17 011140 ");
		searchButton.click();
		warmup5();
		
		
	}
	
	public String fin() {
		
		warmup();
		String fin_value=fin.getText();
		return fin_value;
	}
	
	public String GlobalFin(){
		
		warmup();
		String GLobalFin=GlobalFin.getText();
		return GLobalFin;
	}
	
	public String vin() {
		warmup();
		String vin_value=vin.getText();
		return vin_value;
	}
	
	public String brand() {
		warmup();
		String brand_value=brand.getText();
		System.out.println(brand_value);
		return brand_value;
	}
	
	public String category() {
		warmup();
		String category_value=category.getText();
		return category_value;
	}
	
	public String VehicleModel() {
		warmup();
		String VehicleModel_value=VehicleModel.getText();
		return VehicleModel_value;
	}
	
	public String CustomizedVehicleType() {
		warmup();
		String CustomizedVehicleType_value=CustomizedVehicleType.getText();
		return CustomizedVehicleType_value;
	}
	
	public String OrderNumber() {
		warmup();
		String OrderNumber_value=OrderNumber.getText();
		return OrderNumber_value;
	}
	
	public String ProductionNumber() {
		warmup();
		String ProductionNumber_value=ProductionNumber.getText();
		return ProductionNumber_value;
	}
	
	public String BodyTypeNumber() {
		warmup();
		String BodyTypeNumber_value=BodyTypeNumber.getText();
		return BodyTypeNumber_value;
	}
	
	public String ProductionPlant() {
		warmup();
		String ProductionPlant_value=ProductionPlant.getText();
		return ProductionPlant_value;
	}
	
	public String ShipmentDate() {
		warmup();
		String ShipmentDate_value=ShipmentDate.getText();
		return ShipmentDate_value;
	}
	
	public String Status() {
		warmup();
		String Status_value=Status.getText();
		return Status_value;
	}
	
	public String VehicleCodes(){
		warmup();
		String VehicleCodes_Value=VehicleCodes.getText();
		return VehicleCodes_Value;
	}
	
    public void MajorAssembliesTab(){
		
		wait.until(ExpectedConditions.elementToBeClickable(MajorAssmeblyTab));
		MajorAssmeblyTab.click();
		

	}
	
	public String EngineNumber(){
		warmup();
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
	
	public String TransferCaseNumber(){
		
		warmup();
		
		String TransferCaseNumber_ThinClient=TransferCaseNumber.getText();
		
		return TransferCaseNumber_ThinClient;
	}
	
	public String TransferCase_Variant(){
		
		warmup();
		
		String TransferCase_Variant_ThinClient=	TransferCase_Variant.getText();
		
		return TransferCase_Variant_ThinClient;
	}
	
	public String TransferCase_ObjectNumber(){
		
		warmup();
		
	String TransferCase_ObjectNumber_ThinClient=	TransferCase_ObjectNumber.getText();
	
	return TransferCase_ObjectNumber_ThinClient;
	
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
	
	public String Body(){
		
		warmup();
	String Body_ThinClien=	Body.getText();
	return Body_ThinClien;
	}
	
	public String PlatformNumber(){
		
	warmup();
	String PlatformNumber_ThinClien=PlatformNumber.getText();
	return PlatformNumber_ThinClien;
	
	}
	
	public String wdtransfercaseNo(){
		
		warmup();
		
		String wdtransfercaseNo_ThinClient=	wdtransfercaseNo.getText();
		
		return wdtransfercaseNo_ThinClient;
		
	}
	
	public String wdtransfercaseNo_ObjectNumber(){
		
		warmup();
		
		String wdtransfercaseNo_ObjectNumber_ThinClient	=wdtransfercaseNo_ObjectNumber.getText();
		return wdtransfercaseNo_ObjectNumber_ThinClient;
	}
	

	public String Steering() throws InterruptedException{
		
		warmup();
		String Steering_ThinClient=	Steering.getText();
		return Steering_ThinClient;

		
	}
	
	public String Steering_ObjectNumber(){
		
		warmup();
		String Steering_ObjectNumber_ThinClient	=Steering_ObjectNumber.getText();
		return Steering_ObjectNumber_ThinClient;
	}
	
	public String AllWheelDriveFrontAxleTransmission(){
		
		warmup();
	String AllWheelDriveFrontAxleTransmission_ThinClient=	AllWheelDriveFrontAxleTransmission.getText();
	return AllWheelDriveFrontAxleTransmission_ThinClient;
	
	}
	
	public void PlantMajorAssemblies(){
		
		warmup();
		
		PlantMajorAssemblies.click();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].scrollIntoView();", PlantMajorAssemblies_Displaydescription_label);
		
		wait.until(ExpectedConditions.visibilityOf(PlantMajorAssemblies));

		
		
	}
	public String PlantMajorAssemblies_EngineNumber(){
		
		warmup();
		
		String PlantMajorAssemblies_EngineNumber_ThinClient=PlantMajorAssemblies_EngineNumber.getText();
		
		return PlantMajorAssemblies_EngineNumber_ThinClient;
		
	}
	
	public String PlantMajorAssemblies_EngineVariantNuber(){
		
		warmup();
		String PlantMajorAssemblies_EngineVariantNumber_ThinClient=	PlantMajorAssemblies_EngineVariantNuber.getText();
		return PlantMajorAssemblies_EngineVariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_EngineObjectNumber(){
		
		warmup();
		
		String PlantMajorAssemblies_EngineObjectNumber_ThinClient=	PlantMajorAssemblies_EngineObjectNumber.getText();
		
		return PlantMajorAssemblies_EngineObjectNumber_ThinClient;
		
	}
	
	public String PlantMajorAssemblies_Exhaust_AfterTreatment(){
		
		warmup();
		
		String PlantMajorAssemblies_Exhaust_AfterTreatment_ThinClient=	PlantMajorAssemblies_Exhaust_AfterTreatment.getText();
		return PlantMajorAssemblies_Exhaust_AfterTreatment_ThinClient;
	}
	
	public String PlantMajorAssemblies_Exhaust_AfterTreatment_Variant(){
		
		warmup();
		String PlantMajorAssemblies_Exhaust_AfterTreatment_Variant_ThinClient=	PlantMajorAssemblies_Exhaust_AfterTreatment_Variant.getText();
		return PlantMajorAssemblies_Exhaust_AfterTreatment_Variant_ThinClient;
	}
	
	public String PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber_ThinClient=	PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber.getText();
		return PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber_ThinClient;
	}
	public String PlantMajorAssemblies_RearAxle1(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle1_ThinClient=	PlantMajorAssemblies_RearAxle1.getText();
		return PlantMajorAssemblies_RearAxle1_ThinClient;
		
	}
	
	public String PlantMajorAssemblies_TransmissionNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransmissionNumber_ThinClient=	PlantMajorAssemblies_TransmissionNumber.getText();
		return PlantMajorAssemblies_TransmissionNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_TransmissionNumber_VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransmissionNumber_VariantNumber_ThinClient=PlantMajorAssemblies_TransmissionNumber_VariantNumber.getText();
		return PlantMajorAssemblies_TransmissionNumber_VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_TransmissionNumber_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransmissionNumber_ObjectNumber_ThinClient=	PlantMajorAssemblies_TransmissionNumber_ObjectNumber.getText();
		return PlantMajorAssemblies_TransmissionNumber_ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_TransferCaseNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransferCaseNumber_ThinClient=	PlantMajorAssemblies_TransferCaseNumber.getText();
		return PlantMajorAssemblies_TransferCaseNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_Transfercase_VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransferCaseNumber_VariantNumber_ThinClient=PlantMajorAssemblies_Transfercase_VariantNumber.getText();
		return PlantMajorAssemblies_TransferCaseNumber_VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_Transfercase_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_TransferCaseNumber_OjectNumber_ThinClient=PlantMajorAssemblies_Transfercase_ObjectNumber.getText();
		return PlantMajorAssemblies_TransferCaseNumber_OjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle1(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle1_ThinClient=	PlantMajorAssemblies_FrontAxle1.getText();
		return PlantMajorAssemblies_FrontAxle1_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle1VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxleVariantNumber_ThinClient=PlantMajorAssemblies_FrontAxle1VariantNumber.getText();
		return PlantMajorAssemblies_FrontAxleVariantNumber_ThinClient;
		
	}
	
	public String PlantMajorAssemblies_FrontAxle1ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxleObject_ThinClient= PlantMajorAssemblies_FrontAxle1ObjectNumber.getText();
		return PlantMajorAssemblies_FrontAxleObject_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle2(){
		
	warmup();
	String 	PlantMajorAssemblies_FrontAxle2_ThinClient=PlantMajorAssemblies_FrontAxle2.getText();
	return PlantMajorAssemblies_FrontAxle2_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle2VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle2Variant_ThinClient= PlantMajorAssemblies_FrontAxle2VariantNumber.getText();
		return PlantMajorAssemblies_FrontAxle2Variant_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle2ObjectNumber(){
		
		warmup();
		String 	PlantMajorAssemblies_FrontAxle2ObjectNumber_ThinClient=PlantMajorAssemblies_FrontAxle2ObjectNumber.getText();
		return PlantMajorAssemblies_FrontAxle2ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle3(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle3_ThinClient=PlantMajorAssemblies_FrontAxle3.getText();
		return PlantMajorAssemblies_FrontAxle3_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle3VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle3VariantNumber_ThinClient=PlantMajorAssemblies_FrontAxle3VariantNumber.getText();
		return PlantMajorAssemblies_FrontAxle3VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle4(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle4_ThinClient=	PlantMajorAssemblies_FrontAxle4.getText();
		return PlantMajorAssemblies_FrontAxle4_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle4VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle4VariantNumber_ThinClient= PlantMajorAssemblies_FrontAxle4VariantNumber.getText();
		return PlantMajorAssemblies_FrontAxle4VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_FrontAxle4ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_FrontAxle4ObjectNumber_ThinClient=PlantMajorAssemblies_FrontAxle4ObjectNumber.getText();
		
		return PlantMajorAssemblies_FrontAxle4ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle1_VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle1_VariantNumber_ThinClient=PlantMajorAssemblies_RearAxle1_VariantNumber.getText();
		return PlantMajorAssemblies_RearAxle1_VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle1_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle1_ObjectNumber_ThinClient=PlantMajorAssemblies_RearAxle1_ObjectNumber.getText();
		return PlantMajorAssemblies_RearAxle1_ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle2(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle2_ObjectNumber_ThinClient=PlantMajorAssemblies_RearAxle2.getText();
		return PlantMajorAssemblies_RearAxle2_ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle2_VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle2_VariantNumber_ThinClient=	PlantMajorAssemblies_RearAxle2_VariantNumber.getText();
		return PlantMajorAssemblies_RearAxle2_VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle2_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle2_ObjectNumber_ThinClient=PlantMajorAssemblies_RearAxle2_ObjectNumber.getText();
		return PlantMajorAssemblies_RearAxle2_ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle3(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle3_ThinClient=	PlantMajorAssemblies_RearAxle3.getText();
		return PlantMajorAssemblies_RearAxle3_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle3_VariantNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle3_VariantNumber_ThinClient=PlantMajorAssemblies_RearAxle3_VariantNumber.getText();
		return PlantMajorAssemblies_RearAxle3_VariantNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_RearAxle3_ObjectNumber(){
		
		warmup();
		String PlantMajorAssemblies_RearAxle3_ObjectNumber_ThinClient=	PlantMajorAssemblies_RearAxle3_ObjectNumber.getText();
		return PlantMajorAssemblies_RearAxle3_ObjectNumber_ThinClient;
	}
	
	public String PlantMajorAssemblies_Body(){
		
		warmup();
		String PlantMajorAssemblies_Body_ThinClient=PlantMajorAssemblies_Body.getText();
		return PlantMajorAssemblies_Body_ThinClient;
	}
	
	public void AlternativeDrive_ContentTab(){
		
		
		wait.until(ExpectedConditions.visibilityOf(AlternativeDrive));

		AlternativeDrive.click();
	}
	
	
	public String AlternativeDrive_Content(){
		
		warmup();
		
		String AlternativeDrive_Content_ThinClient=	AlternativeDrive_Content.getText();
		warmup5();
		return AlternativeDrive_Content_ThinClient;
	}
	
public void CodesTab() throws InterruptedException{
		
		wait.until(ExpectedConditions.elementToBeClickable(CodesTab));
		CodesTab.click();
		
		
		warmup();
		
		wait.until(ExpectedConditions.elementToBeClickable(HideDesignation_button));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", HideDesignation_button);
		
//		HideDesignation_button.click();
		wait.until(ExpectedConditions.elementToBeClickable(ShowDesignation_button));
		ShowDesignation_button.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(Sort));
		
		Sort.click();
		
		warmup();

		wait.until(ExpectedConditions.elementToBeClickable(ResetSorting));
		ResetSorting.click();

	}

public void VPDandSerialNumberTab(){
	
	wait.until(ExpectedConditions.elementToBeClickable(VPD_SerialNumberTab));
	VPD_SerialNumberTab.click();
	
	
	wait.until(ExpectedConditions.elementToBeClickable(VPD_sorting));
	
	VPD_sorting.click();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_FilterButton));
	
	VPD_FilterButton.click();
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SearchVPD));

	
	VPD_SearchVPD.sendKeys("111");
	
	VPD_SearchVPD.sendKeys(Keys.ENTER);
	
	warmup();

	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	WebElement IdentificationTab=driver.findElement(By.xpath("//li[contains(@data-ng-show,'viewControl.VehicleIdentificationArrangement.visible')]"));

	
	js.executeScript("arguments[0].scrollIntoView();", IdentificationTab);
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SerialButton));
	
	

	VPD_SerialButton.click();
	

	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SerialButton));
	
	js.executeScript("arguments[0].click();", VPD_SerialButton_Sort);

	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SerialButton_FilterButton));

	
	VPD_SerialButton_FilterButton.click();
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SerialButton_Search));

	
	VPD_SerialButton_Search.sendKeys("75");
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(VPD_SerialButton_CancelFilterButton));
	
	js.executeScript("arguments[0].click();", VPD_SerialButton_CancelFilterButton);	

       warmup5();	
       
	js.executeScript("arguments[0].scrollIntoView();", IdentificationTab);
	
}

public void ControlUnitTab(){
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(ControlUnitTab));
	
	ControlUnitTab.click();
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_Sort));

	
	ControlUnitTab_Sort.click();
	
	warmup5();
	
	wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_ResetSort));

	
	ControlUnitTab_ResetSort.click();
	
	
	wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_Search));

	
	ControlUnitTab_Search.click();
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(ControlUnitTab_BackButton));
	
	ControlUnitTab_BackButton.click();
	
	
}

public void TheftRelevantTab(){
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(TheftRelevantTab));

	
	TheftRelevantTab.click();
	
}

public String TheftRelevantTab_LockType(){
	
String TheftRelevantTab_LockType_ThinClient=	TheftRelevantTab_LockType.getText();

  return TheftRelevantTab_LockType_ThinClient;
  
}

public String TheftRelevantTab_CommandNumber(){
	
	warmup();
	
	String TheftRelevantTab_CommandNumber_ThinClient=TheftRelevantTab_CommandNumber.getText();
	
	return TheftRelevantTab_CommandNumber_ThinClient;
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
	
	
	
//	HistoryTab_HistoryOfDependentObject_button.click();
	
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

public void DataValidationTab(){
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab));

	
	DataValidationTab.click();
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_ArrowLink));
	

	DataValidationTab_ArrowLink.click();
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab));

	
	DataValidationTab.click();
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_Sort));

	
	DataValidationTab_Sort.click();
	
	
}

public void DataValidationTab_ValidationRules(){
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_ValidationRules));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", DataValidationTab_ValidationRules);
	
    warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_ValidationRules));

	DataValidationTab_ValidationRules_Sort.click();

	
	
}

public void DataValidationTab_VPDComparison(){
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_VPDComparison));
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", DataValidationTab_VPDComparison);
	
    warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(DataValidationTab_VPDComparison_Sort));
	
	DataValidationTab_VPDComparison_Sort.click();
	
	
}

public void SalesDataTab(){
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(SalesDataTab));

	
	SalesDataTab.click();
}
	
public String SalesDataTab_SalesUnit(){
	
	warmup();
		
	
	String SalesDataTab_SalesUnit_ThinClient=SalesDataTab_SalesUnit.getText();
	
	return SalesDataTab_SalesUnit_ThinClient;
}

public String SalesDataTab_SalesUnit_designation(){
	
	warmup();
	
	String SalesDataTab_SalesUnit_ThinClient=SalesDataTab_SalesUnit_designation.getText();
	return SalesDataTab_SalesUnit_ThinClient;
	
}

public String SalesDataTab_TechnicalStateDate(){
	
	warmup();
	
	String SalesDataTab_TechnicalStateDate_ThinClient=	SalesDataTab_TechnicalStateDate.getText();
	
	return SalesDataTab_TechnicalStateDate_ThinClient;
}

public String SalesDataTab_FinalAcceptanceDate(){
	
	warmup();
	
	String SalesDataTab_FinalAcceptanceDate_ThinClient=	SalesDataTab_FinalAcceptanceDate.getText();
	return SalesDataTab_FinalAcceptanceDate_ThinClient;
}

public String SalesDataTab_ConsumerCountry(){
	
	warmup();
	
	String SalesDataTab_ConsumerCountry_ThinClient=	SalesDataTab_ConsumerCountry.getText();
	return SalesDataTab_ConsumerCountry_ThinClient;
}

public String SalesDataTab_ConsumerCountry_Designation(){
	
	warmup();
	
	String SalesDataTab_ConsumerCountry_Designation_ThinClient=SalesDataTab_ConsumerCountry_Designation.getText();
	
	return SalesDataTab_ConsumerCountry_Designation_ThinClient;
	
	
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

public String ModelPlateTab(){
	
	warmup();
	
	wait.until(ExpectedConditions.elementToBeClickable(ModelPlateTab));
	
	ModelPlateTab.click();
	
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
	
	warmup();

	
	wait.until(ExpectedConditions.elementToBeClickable(EquipmentTab));

	
	EquipmentTab.click();

//	js.executeScript("arguments[0].click();", EquipmentTab);

//	EquipmentTab.click();
		
	wait.until(ExpectedConditions.visibilityOf(EquipmentTab_PaintsTable));

	
	warmup();

	EquipmentTab_PaintsTable.click();
	
	
	
	
}

public void EquipmentsTab_TiresTable(){
	
	warmup();
    JavascriptExecutor js=(JavascriptExecutor)driver;

    
	wait.until(ExpectedConditions.visibilityOf(EquipmentTab_TiresTable));
	
	js.executeScript("arguments[0].click();", EquipmentTab_TiresTable);

	
//	EquipmentTab_TiresTable.click();
	
	warmup5();


	
}

public void LoggingTab(){
	
	
	warmup();
	
	Actions a=new Actions(driver);
	
	a.moveToElement(ControlUnitTab).build().perform();
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(LoggingTab));

	LoggingTab.click();
	
	warmup();
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	wait.until(ExpectedConditions.visibilityOf(LoggingTab_SearchButton));

	js.executeScript("arguments[0].click();", LoggingTab_SearchButton);

	
	
	warmup();
	
	wait.until(ExpectedConditions.visibilityOf(LoggingTab_FilterButton));
	

	
	warmup();

	js.executeScript("arguments[0].click();", LoggingTab_FilterButton);
	
	warmup();
//	LoggingTab_FilterButton.click();
	
	wait.until(ExpectedConditions.visibilityOf(LoggingTab_Sort));

	
	LoggingTab_Sort.click();
	
	warmup5();
}

public String ThirdParty_MajorAssemblies_Content(){
	
	warmup();
	
	ThirdParty_MajorAssemblies.click();
	
	String ThirdParty_MajorAssemblies_Content_ThinClient=ThirdParty_MajorAssemblies_Content.getText().substring(37);
	
	return ThirdParty_MajorAssemblies_Content_ThinClient;
}


}
