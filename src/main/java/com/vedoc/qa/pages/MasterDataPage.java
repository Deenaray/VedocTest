package com.vedoc.qa.pages;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.vedoc.qa.base.TestBase;

public class MasterDataPage extends TestBase {
	
//Kartik
	public String CorrectDocumentKey = "R05   245207   QAAAAAAA 601";
	public String IncorrectDocumentKey = "R05   245207   QAAAAAAA 602";
//Kartik end	
	
@FindBy(xpath="//button[starts-with(@data-ng-click,'show($event)')]")
WebElement showButton;

@FindBy(xpath="//button[@class='btn in-cell table-export']")
WebElement SpecialEquipment_CSVButton_download;

@FindBy(xpath="(//button[@class='btn in-cell table-export'])[2]")
WebElement Paint_CSVButton_download;

@FindBy(xpath="(//button[starts-with(@data-ng-click,'toggleFilter')])")
WebElement SpecialEquipment_FilterButton;

@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.CodeDesignation_codeNumber')]")
WebElement SpecialEquipment_CodeFilter;

@FindBy(xpath="//button[starts-with(@data-ng-click,'resetSorting($event)')]")
WebElement SpecialEquipment_CodeReset;

@FindBy(xpath="//input[starts-with(@placeholder,'Search the table')]")
WebElement SpecialEquipment_serachText;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataEquipmentCodes_701')]")
WebElement SpecialEquipment_CancelFilter;


@FindBy(xpath="//span[starts-with(@data-ng-bind,'::viewUIObject.labels.PaintDesignation_code')]")
WebElement Paint_CodeSort;

@FindBy(xpath="(//button[starts-with(@data-ng-click,'resetSorting($event)')])[2]")
WebElement Paint_CodeReset;

//button[contains(@data-ng-click,'paintDesignationTable')]

@FindBy(xpath="(//button[starts-with(@data-ng-click,'toggleFilter')])[2]")
WebElement Paint_FilterButton;

@FindBy(xpath="//input[starts-with(@placeholder,'Search the table')]")
WebElement Paint_SearchText;

@FindBy(xpath="//button[starts-with(@ng-click,'exportTable')]")
WebElement InteriorEquipment_CSVButton_download;

@FindBy(xpath="(//span[contains(@data-ng-bind,'MasterDataInteriorEquipment_705')])[3]")
WebElement InteriorEquipment_CodeSort;

@FindBy(xpath="(//button[starts-with(@data-ng-click,'resetSorting($event)')])[3]")
WebElement InteriorEquipment_CodeReset;

@FindBy(xpath="(//button[starts-with(@data-ng-click,'toggleFilter')])[3]")
WebElement InteriorEquipment_FilterButton;

@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
WebElement InteriorEquipment_SearchText;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataInteriorEquipment_705')]")
WebElement InteriorEquipment_CancelFilter;

@FindBy(xpath="//li[@vtab='MasterDataAdditionalPaintworkDesignation_708']")
WebElement AdditionalPaintwork;

@FindBy(xpath="(//button[@class='btn in-cell table-export'])[4]")
WebElement AdditionalPaintWork_CSVdownload;

@FindBy(xpath="(//span[contains(@data-ng-bind,'MasterDataAdditionalPaintworkDesignation')])[3]")
WebElement AdditionalPaintWork_CodeSort;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataAdditionalPaintworkDesignation_708')]")
WebElement AdditionalPaintWork_FilterButton;

@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])[2]")
WebElement AdditionalPaintWork_SearchText;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataAdditionalPaintworkDesignation_708')]")
WebElement AdditionalPaintWork_CancelFilter;

@FindBy(xpath="(//li[@vtab='MasterDataAdditionalCodeMapping_709'])")
WebElement ProvisionCode;

@FindBy(xpath="(//button[@class='btn in-cell table-export'])[5]")
WebElement ProvisionCode_CSVdownload;

@FindBy(xpath="(//li[@vtab='ThirdPartyCodeMasterData_711'])")
WebElement OtherManufacturerCode;

@FindBy(xpath="(//button[@class='btn in-cell table-export'])[6]")
WebElement OtherManufacturerCode_CSVdownload;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'ThirdPartyCodeMasterData_711')]")
WebElement OtherManufacturerCode_FilterButton;

@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])[3]")
WebElement OtherManufacturerCode_SearchText;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'ThirdPartyCodeMasterData_711')]")
WebElement OtherManufacturer_CancelFilter;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataSaa_725.visible')]")
WebElement SAANumber_Tab;

@FindBy(name="SaaSearch")
WebElement SAATextField_Search;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.saaDesignation.length')]")
WebElement SAA_CSVdownloadbutton;

@FindBy(xpath="//span[contains(@data-ng-bind,'saaDesignation_id_label')]")
WebElement SAAIDs_Sort;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataSaa_725')])[2]")
WebElement SAA_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'viewControl.saaDesignation_filterExpression')]")
WebElement SAAID_Search;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataSaa_725')])[2]")
WebElement SAA_CancelFilter;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataAssemblyGroups_740.visible')]")
WebElement DesignGroupTab;

@FindBy(name="assemblyGroupSearch")
WebElement DesignGroup_Textfield;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.assemblyGroupDesignation.length')]")
WebElement DesignGroup_CSVdownloadButton;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataVpd_730.visible')]")
WebElement VPDIDs_Tab;

@FindBy(xpath="//button[@data-ng-click='showdata($event)']")
WebElement VPDIDs_ShowButton_Click;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.vpdIdent.length')]")
WebElement VPDIDs_CSVdownloadButton;

@FindBy(xpath="//span[contains(@data-ng-bind,'::viewUIObject.labels.VpdIdent_id')]")
WebElement VPDID_Sort;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataCodesArrangement.visible')]")
WebElement CodesTab;

@FindBy(xpath="//button[contains(@data-ng-click,'VpdIdentTable')]")
WebElement VPDID_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'VpdIdentTable')]")
WebElement VPDID_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'VpdIdentTable')]")
WebElement VPDID_CancelFilter;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataModelDesignationArrangement')]")
WebElement VehicleModelTab;

@FindBy(id="MasterDataVehicleModelDesignation_751_search")
WebElement ModelDesignation_Search;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.vehicleModelDesignation.length')]")
WebElement ModelDesignation_CSVdownloadButton;

@FindBy(xpath="//span[contains(@data-ng-bind,'ProductModelDesignation_id')]")
WebElement ModelDesignation_sort;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataVehicleModelDesignation_751')])[3]")
WebElement ModelDesignation_ResetSort;


@FindBy(xpath="//button[contains(@data-ng-click,'vehicleModelDesShowTable')]")
WebElement ModelDesignation_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'vehicleModelDesShowTable')]")
WebElement ModelDesignation_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'vehicleModelDesShowTable')]")
WebElement ModelDesignation_CancelFilter;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataCuVpdIdentMapping_731.visible')]")
WebElement ControlUnitVPDIDTab;

@FindBy(id="MasterDataCuVpdIdentMapping_731_search")
WebElement ControlUnitVPDIDTab_ShowDataButton;

@FindBy(xpath="//button[@data-ng-click='exportCsv($event)']")
WebElement ControlUnitVPDIDTab_ExportAssignment_Button;

@FindBy(xpath="//span[contains(@data-ng-bind,'cuDesignation_diogenesName_label')]")
WebElement ControlUnitVPDIDTab_DiogenesName;

@FindBy(xpath="//button[contains(@data-ng-click,'exportCsv($event)')]//following::button[1]")
WebElement ControlUnitVPDID_Filterbutton;

@FindBy(xpath="//input[contains(@input-binding,'Mapping_filterExpression')]")
WebElement ControlUnitVPDID_Searchtext;

@FindBy(xpath="(//button[contains(@data-ng-click,'Mapping')])[2]")
WebElement ControlUnitVPDID_CancelFilter_Button;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.cuDesignation.length')]")
WebElement ControlUnitVPDID_CSVdownload_Button;
//Vishakha
@FindBy(xpath="//*[@id='Mapping']/tbody/tr/td[10]/span/button/span")
WebElement ControlUnitVPDID_EditButton;

@FindBy(xpath="//input[contains(@data-ng-model,'Mapping_rec.diogenesShortName')]")
WebElement ControlUnitVPDID_ShortDesignation;

@FindBy(xpath="//input[contains(@data-ng-model,'Mapping_rec.scnVpdIdent')]")
WebElement ControlUnitVPDID_SCNVPDIdent;

@FindBy(xpath="//button[contains(@data-ng-if,'Mapping_rec === viewControl.editing_object')][1]")
WebElement ControlUnitVPDID_SaveIcon;

@FindBy(xpath="//*[@id='MasterDataCuVpdIdentMapping_731']/div/div[2]/form/div[3]/div/div/button[1]/span[2]")
WebElement ControlUnitVPDID_SaveButton;

@FindBy(xpath="//a[contains(@data-ng-if,'listHasData(viewDataObject.cuDesignation)')]")
WebElement ControlUnitVPDID_totalRecords;
//over
@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataCountryDesignation_710.visible')]")
WebElement CountryDesignationTab;

@FindBy(xpath="//button[contains(@ng-click,'salesAreaConsumer.length')]")
WebElement CountryDesignationTab_CSVdownload_button;

@FindBy(xpath="//button[contains(@data-ng-click,'salesAreaConsumer')]")
WebElement CountryDesignationTab_FilterButton;

@FindBy(xpath="//input[@placeholder='Search the table']")
WebElement CountryDesignationTab_FilterText;

@FindBy(xpath="//input[contains(@input-binding,'salesAreaConsumer_filterExpression')]")
WebElement CountryDesignationTab_CancelFilterButton;

@FindBy(xpath="//span[contains(@data-ng-bind,'salesAreaConsumer_salesArea_label')]")
WebElement CountryDesignationTab_Sort;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataPlant_715.visible')]")
WebElement PlantTab;

@FindBy(xpath="//button[contains(@ng-click,'viewDataObject.plant.length')]")
WebElement Plants_CSVbuttonDownload;

@FindBy(xpath="//button[contains(@data-ng-click,'plantTable')]")
WebElement PlantsTab_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'plantTable_filterExpression')]")
WebElement Plants_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'plantTable')]")
WebElement Plants_CancelFilterButtont;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataSpecialPlantText_795.visible')]")
WebElement SpecialPlantTab;

@FindBy(id="MasterDataSpecialPlantText_795_search")
WebElement SpecialPlantTab_ShowDataButton;

@FindBy(xpath="//button[contains(@ng-click,'specialPlantTextDesignation.length')]")
WebElement SpecialPlantTab_CSVdownloadButton;

@FindBy(xpath="//span[contains(@data-ng-bind,'SpecialPlantTextDesignation_id')]")
WebElement SpecialPlantTab_Sort;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataDesignGroup_720.visible')]")
WebElement DGDesignatinTab;

@FindBy(xpath="(//button[contains(@ng-click,'viewDataObject.designGroup.length')])[3]")
WebElement DGDesignationTab_CSVButtonDownload;

//(//button[contains(@data-ng-click,'designGroup')])
@FindBy(xpath="//div[@id='MasterDataDesignGroup_720']//button[contains(@data-ng-click,'designGroup')]")
WebElement DGDesignationTab_FilterButton;

@FindBy(xpath="//div[@id='MasterDataDesignGroup_720']//a[@data-ng-if='listHasData(viewDataObject.designGroup)']")
WebElement DGDesignationTab_tableCount;

@FindBy(xpath="//input[contains(@input-binding,'designGroup_filterExpression')]")
WebElement DGDesignationTab_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'designGroup')]")
WebElement DGDesignationTab_CancelFilterButton;

@FindBy(xpath="(//span[contains(@data-ng-bind,'::viewUIObject.labels.DesignGroup_id')])[2]")
WebElement DGDesignationTab_Sort;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataElectroVariants_745.visible')]")
WebElement ElectricalVariantTab;

@FindBy(xpath="(//button[contains(@ng-click,'electroVariantDesignation.length')])")
WebElement ElectricalVariantsTab_CSVdownloadButton;

@FindBy(xpath="//button[contains(@data-ng-click,'electroVariantDesignation')]")
WebElement ElectricalVariantsTab_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'electroVariantDesignation_filterExpression')]")
WebElement ElectricalVariantsTab_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'electroVariantDesignation')]")
WebElement ElectricalVariantsTab_CancelFilter;

@FindBy(xpath="(//a[contains(@data-ng-click,'electroVariantDesignation')])[3]")
WebElement ElectricalVariantsTab_Sort;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataBodyManufacturer_760.visible')]")
WebElement BodiesTab;

@FindBy(id="MasterDataBodyManufacturer_760_search")
WebElement MasterBodyManufacturer;

@FindBy(xpath="//button[contains(@ng-click,'bodyManufacturer.length')]")
WebElement BodiesTab_CSVdownloadButton;

@FindBy(xpath="//button[contains(@data-ng-click,'BodyManufNaviagtion')]")
WebElement Bodies_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'BodyManufNaviagtion_filterExpression')]")
WebElement Bodies_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'BodyManufNaviagtion')]")
WebElement Bodies_CancelFilterButton;

@FindBy(xpath="(//a[@ng-click='select($event)'])[16]")
WebElement BodiesKWTab;

@FindBy(name="customerRequestCodeSearch")
WebElement BodiesKWTab_customerRequestCodeSearch;

@FindBy(xpath="//button[contains(@ng-click,'customerRequestCodeDesignation.length')]")
WebElement BodiesKWTab_CSVButtonDownload;

@FindBy(xpath="//button[contains(@data-ng-click,'localCustomerRequestCodes')]")
WebElement BodiesKWTab_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'localCustomerRequestCodes_filterExpression')]")
WebElement BodiesKWTab_SearchText;

@FindBy(xpath="//button[contains(@data-ng-click,'localCustomerRequestCodes')]")
WebElement BodiesKWTab_CancelFilter;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataLabelData_775.visible')]")
WebElement LabelDataTab;

@FindBy(xpath="//button[contains(@ng-click,'labelContentDesignation.length')]")
WebElement LabelDataTab_CSVButtonDownload;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataLabelData_775')]")
WebElement LabelDataTab_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'labelContentDesignationTable_filterExpression')]")
WebElement LabelDataTab_Searchtext;

@FindBy(xpath="//button[contains(@data-ng-click,'labelContentDesignationTable')]")
WebElement LabelDataTab_CancelFilterButton;

@FindBy(xpath="//button[contains(@data-ng-click,'addCode($event)')]")
WebElement SpecialEquipment_AddCodeButton;

@FindBy(xpath="//button[contains(@data-ng-click,'setRightCategory($event)')]")
WebElement BatchProcessingButton;

@FindBy(xpath="//button[@ng-show='closeable']")
WebElement MasterData_TechnicalAdvisorDialog_Dismiss;

@FindBy(name="codeDesignation_category")
WebElement SpecialEquipment_SelectCategory;

@FindBy(name="codeDesignation_productGroupIndication")
WebElement SpecialEquipment_SelectProductGroupIndication;

@FindBy(name="codeDesignation_codeNumber")
WebElement SpecialEquipmentCode_text;

@FindBy(name="codeDesignation_productSeries")
WebElement SpecialEquipment_ModelSeries;

@FindBy(name="codeDesignation_modelDesignation")
WebElement SpecialEquipment_ModelDesignation;

@FindBy(xpath="//button[contains(@data-ng-click,'editMDText')]")
WebElement SpecialEquipment_Designation;

@FindBy(xpath="(//input[contains(@name,'masterDataDesignation_internationalText_text')])[2]")
WebElement MasterDataManagement_ModalDialog;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'ManageMasterData_006')]")
WebElement MasterDataManagement_SaveButton;

@FindBy(xpath="(//button[contains(@data-ng-click,'specialEquipmentCodeTable')])[3]")
WebElement SpecialEquipment_SaveChanges;

@FindBy(xpath="//button[contains(@ng-show,'closeable')]")
WebElement TechnicalError_Dialog;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataCodesFoot_706')]")
WebElement SpecialEquipment_SaveButton;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataCodesFoot_706')])[2]")
WebElement SpecialEquipment_CancelButton;



@FindBy(xpath="//button[contains(@data-ng-click,'addPaintCode($event)')]")
WebElement Paint;

@FindBy(name="paintDesignation_category")
WebElement Paint_Category;

@FindBy(name="paintDesignation_productGroupIndication")
WebElement Paint_SelectProductGroupIndication;

@FindBy(name="paintDesignation_code")
WebElement PaintCode_text;

@FindBy(name="paintDesignation_productSeries")
WebElement Paint_ModelSeries;

@FindBy(name="paintDesignation_modelDesignation")
WebElement Paint_ModelDesignation;

@FindBy(xpath="(//button[contains(@data-ng-click,'paintDesignationTable')])[3]")
WebElement Paint_SaveChanges;

@FindBy(xpath="(//button[contains(@data-ng-click,'addCode($event)')])[2]")
WebElement InteriorEquipment_AddCode;

@FindBy(name="interiorEquipment_category")
WebElement InteriorEquipment_SelectCategory;

@FindBy(name="interiorEquipment_productGroupIndication")
WebElement InteriorEquipment_SelectProductGroupIndication;

@FindBy(name="interiorEquipment_code")
WebElement InteriorEquipmentCode_text;

@FindBy(name="interiorEquipment_productSeries")
WebElement InteriorEquipment_ModelSeries;

@FindBy(name="interiorEquipment_modelDesignation")
WebElement InteriorEquipment_ModelDesignation;

@FindBy(xpath="(//button[contains(@data-ng-click,'interiorEquipmentTable')])[3]")
WebElement InteriorEquipment_SaveChanges;

@FindBy(xpath="//button[contains(@data-ng-click,'addAdditionalCode($event)')]")
WebElement ProvisionCode_AddEntry;

@FindBy(name="additionalCodeMapping_codeOfProduct")
WebElement ProvisionCode_ProductGroup;

@FindBy(name="additionalCodeMapping_additionalCode")
WebElement ProvisionCode_AdditionalCode;

@FindBy(xpath="(//button[contains(@data-ng-click,'additionalCodeMappingTable')])[2]")
WebElement ProvisionCode_SaveChanges;

@FindBy(xpath="//button[@data-ng-click='newVPDIdent($event)']")
WebElement MasterDataModule_CreateVPDID_Code;

@FindBy(name="vpdIdent_id")
WebElement MasterDataModule_text;

@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
WebElement MasterDataModule_SaveCode;

@FindBy(xpath="//button[contains(@data-ng-click,'editMDText')]")
WebElement MasterDataModule_Designation;

@FindBy(xpath="(//input[contains(@name,'masterDataDesignation_internationalText_text')])[2]")
WebElement MasterDataModdule_DesignationText;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'ManageMasterData_006')])")
WebElement MasterDataModule_ModalDialog_SaveButton;

@FindBy(xpath="(//button[contains(@data-ng-click,'save($event)')])[2]")
WebElement MasterDataModule_SaveCode_button;

@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.MasterDataVehicleModelDesignation_750')]")
WebElement VehicleModel_ManageVehileModel_button;

@FindBy(id="MasterDataVehicleModelDesignation_750_search")
WebElement VehicleModel_ManageVehileModel_ShowDataButton;

@FindBy(xpath="//button[@data-ng-click='addProductSeries($event)']")
WebElement VehicleModel_ManageVehileModel_AddModelSeries;

@FindBy(name="productSeries_id")
WebElement VehicleModel_ManageVehileModel_ProductSeries;

@FindBy(name="prodSerDes")
WebElement VehicleModel_ManageVehileModel_ProdSer;

@FindBy(name="productSeries_brand")
WebElement VehicleModel_ManageVehileModel_Brand;

@FindBy(name="productSeries_category")
WebElement VehicleModel_ManageVehileModel_Category;

@FindBy(xpath="(//button[contains(@data-ng-click,'productSeriesTable')])[2]")
WebElement VehicleModel_ManageVehileModel_SaveChanges;

@FindBy(xpath="(//span[@class='cell-icon rc-i-line-pencil'])[51]")
WebElement VehicleModel_EditButton;

@FindBy(xpath="//a[starts-with(@data-ng-click,'unlockScroll')]")
WebElement UnlockScroll;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataVehicleModelDesignation_750')])[6]")
WebElement VehicleModel_SaveButton;

@FindBy(xpath="//a[@class='unlock-scroll ng-scope']")
WebElement SpecialEquipment_lockbutton;

@FindBy(xpath="(//a[@class='unlock-scroll ng-scope'])[2]")
WebElement Paint_lockbutton;

@FindBy(xpath="(//a[@class='unlock-scroll ng-scope'])[3]")
WebElement InteriorEquipment_lockbutton;

@FindBy(xpath="//button[contains(@data-ng-click,'addEntry($event)')]")
WebElement ControlUnit_AddEntryButton;

@FindBy(name="cuDesignation_diogenesName")
WebElement ControlUnit_diogenesName;

@FindBy(name="cuDesignation_diogenesShortName")
WebElement ControlUnit_ShortDesignation;

@FindBy(name="cuDesignation_scnVpdIdent")
WebElement ControlUnit_SCNVPDIdent;

@FindBy(xpath="//button[contains(@data-ng-click,'endEditing')]")
WebElement ControlUnit_SaveChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataCuVpdIdentMapping_731')])[5]")
WebElement Control_SaveButton;

@FindBy(xpath="(//a[contains(@data-ng-click,'unlockScroll')])")
WebElement ControlUnit_SaveButton;

@FindBy(xpath="(//span[contains(@data-ng-bind,'::viewUIObject.messageProviders')])[2]")
WebElement ControlUnit_Dismiss_Message;

@FindBy(xpath="(//span[contains(@data-ng-bind,'messageProviders')])[3]")
WebElement ControlUnit_ExceptionDialog;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataCuComponentAlias_735')]")
WebElement ECU_Component_Aliases_Tab;

@FindBy(xpath="//button[contains(@data-ng-click,'newAlias($event)')]")
WebElement ECU_Component_Aliases_CreateNewAlias_button;

@FindBy(name="cuComponentAlias_id")
WebElement ECU_Component_Aliases_AliasID_text;

@FindBy(xpath="//button[contains(@data-ng-click,'cuComponentAliasTable_rec')]")
WebElement ECU_Component_Aliases_Tab_Designation;

@FindBy(xpath="(//button[contains(@data-ng-click,'cuComponentAliasTable')])[3]")
WebElement ECU_Component_Aliases_Tab_UpdateChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataCuComponentAlias_735')])[3]")
WebElement ECU_Component_Aliases_Tab_SaveButton;

@FindBy(xpath="//button[contains(@data-ng-click,'cuComponentAliasTable')]")
WebElement ECU_Component_Aliases_Tab_FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'cuComponentAliasTable_filterExpression')]")
WebElement ECU_Component_Aliases_Tab_FilterButton_Text;

@FindBy(xpath="//button[contains(@data-ng-click,'cuComponentAliasTable')]")
WebElement ECU_Component_Aliases_Tab_ResetFilterButton;

@FindBy(xpath="//button[contains(@data-ng-click,'cuComponentAliasTable_rec')]")
WebElement ECU_Component_Aliases_Tab_Edit_AliasID;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataPartsGroup_734.visible')]")
WebElement CUGroupTab;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataPartsGroup_734')])")
WebElement CUGroupTab_AddEntry_Button;

@FindBy(name="partsGroup_id")
WebElement CUGroupTab_Identifier;

@FindBy(xpath="(//button[contains(@data-ng-click,'PartsGroupTable')])[2]")
WebElement CUGroupTab_Designation;

@FindBy(xpath="(//button[contains(@data-ng-click,'PartsGroupTable')])[3]")
WebElement CUGroup_SaveChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataPartsGroup_734')])[3]")
WebElement CUGroupTab__SaveButton;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataPartsGroup_734')])[2]")
WebElement CUGroupTab__FilterButton;

@FindBy(xpath="//input[contains(@input-binding,'PartsGroupTable_filterExpression')]")
WebElement CUGroupTab__FilterButton_text;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataPartsGroup_734')])[2]")
WebElement CUGroupTab__CancelFilterButton;

@FindBy(xpath="(//button[contains(@data-ng-click,'PartsGroupTable_rec')])[2]")
WebElement CUGroup_DeleteIdentifier;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataElectroVariants_745.visible')]")
WebElement Electrical_Variants_Tab;

@FindBy(xpath="//button[contains(@data-ng-click,'addElectroVariant($event)')]")
WebElement Electrical_Variants_Tab_AddElectroVariantbutton;

@FindBy(name="electroVariantDesignation_prefix")
WebElement Electrical_Variants_Tab_ElectroVariantPrefix;

@FindBy(xpath="(//button[contains(@data-ng-click,'electroVariantDesignation')])[2]")
WebElement Electrical_Variants_Tab_Designation;

@FindBy(xpath="(//button[contains(@data-ng-click,'electroVariantDesignation')])[3]")
WebElement Electrical_Variants_Tab_SaveChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataElectroVariants_745')])[3]")
WebElement Electrical_Variants_Savebutton;

@FindBy(xpath="//button[contains(@data-ng-click,'electroVariantDesignation')]")
WebElement Electrical_Variants_Filterbutton;

@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
WebElement Electrical_Variants_Filterbutton_text;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataElectroVariants_745')])[2]")
WebElement Electrical_Variants_CancelFilterbutton;

@FindBy(xpath="(//button[contains(@data-ng-click,'electroVariantDesignation_rec')])[2]")
WebElement Electrical_Variants_DeleteEntry;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataTransmissionArrangement.visible')]")
WebElement TransmissionModal_Tab;

@FindBy(xpath="//button[contains(@id,'MasterDataTransmissionMapping')]")
WebElement TransmissionModal_Tab_SearchButton;

@FindBy(xpath="//button[contains(@data-ng-click,'addConfiguration($event)')]")
WebElement TransmissionModal_Tab_AddButton;

@FindBy(name="transmissionModInfoBundle_transmissionModInfo_objectNumber")
WebElement TransmissionModal_Tab_TransmissionObjectNumber;

@FindBy(name="transmissionModInfoBundle_transmissionModInfo_modelDesignation")
WebElement TransmissionModal_Tab_TranmissionModal;

@FindBy(xpath="(//button[contains(@data-ng-click,'transmissionModInfoTable')])[2]")
WebElement TransmissionModal_Tab_SaveChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataTransmissionMapping_786')])[3]")
WebElement TransmissionModal_Tab_SaveButton;

@FindBy(xpath="//button[contains(@data-ng-click,'transmissionModInfoTable')]")
WebElement TransmissionModal_Tab_FilterButton;

@FindBy(xpath="//input[contains(@placeholder,'Search the table')]")
WebElement TransmissionModal_Tab_Filtertext;

@FindBy(xpath="//div[contains(@id,'MasterDataTransmissionMapping')]//span[contains(@class,'pencil')]")
WebElement TransmissionModal_EditButton;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataExtendedCocData_770.visible')]")
WebElement WLTP_VectoTab;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataExtendedCocData_770')]")
WebElement WLTP_VectoTab_AddLabel_Button;

@FindBy(name="extendedCocDataDesignation_id")
WebElement WLTP_VectoTab_AddLabel_ID;

@FindBy(xpath="//button[contains(@data-ng-click,'extendedCocDataDesignationTable_rec')]")
WebElement WLTP_VectoTab_Designation;

@FindBy(xpath="(//button[contains(@data-ng-click,'extendedCocDataDesignationTable')])[3]")
WebElement WLTP_VectoTab_SaveChanges;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataExtendedCocData_770')])[3]")
WebElement WLTP_VectoTab_SaveButton;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataExtendedCocData_770')])[2]")
WebElement WLTP_VectoTab_FilterButton;

@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
WebElement WLTP_VectoTab_Filter_text;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataExtendedCocData_770')])[2]")
WebElement WLTP_VectoTab_CancelFilterButton;

@FindBy(xpath="(//button[contains(@data-ng-click,'extendedCocDataDesignationTable_rec')])[2]")
WebElement WLTP_VectoTab_Delete2ndEntry;

@FindBy(name="labelContentDesignation_key")
WebElement LabelData_Key;

@FindBy(xpath="//button[contains(@data-ng-click,'labelContentDesignationTable_rec')]")
WebElement LabelData_Designation;

@FindBy(xpath="(//button[contains(@data-ng-click,'labelContentDesignationTable')])[3]")
WebElement LabelData_SaveChangesButton;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataLabelData_775')])[3]")
WebElement LabelData_SaveButton;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'MasterDataLabelData_775')])[2]")
WebElement LabelData_FilterButton;

@FindBy(xpath="(//input[contains(@placeholder,'Search the table')])")
WebElement LabelData_FilterText;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataLabelData_775')]")
WebElement LabelData_KeyButton;

@FindBy(xpath="(//button[contains(@data-ng-click,'labelContentDesignationTable_rec')])[2]")
WebElement LabelData_DeleteEntry;

// arj
@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataModelDesignationArrangement')]/a")
WebElement VehicleModel;

@FindBy(xpath="//a[contains(@data-ng-show,'viewControl.MasterDataVehicleModelDesignation_750')]")
WebElement ManageVehicleModelLeft;

@FindBy(xpath="//button[contains(@id,'MasterDataVehicleModelDesignation_750_search')]")
WebElement ShowData;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'addModelDesignation')]")
WebElement AddModelDesignation;

@FindBy(xpath="(//div[@class='input-group']/input[@ng-enter='vehicleModelDesignationEditTable'])[1]")
WebElement input1;

@FindBy(xpath="(//div[@class='input-group']/input[@ng-enter='vehicleModelDesignationEditTable'])[2]")
WebElement input2;

@FindBy(xpath="//button[@type='submit']")
WebElement sumbittick;

@FindBy(xpath="(//button[contains(@data-ng-click,'save')])[2]")
WebElement savebutton;

@FindBy(xpath="//li[contains(@data-ng-show,'viewControl.MasterDataCodesArrangement')]/a")
WebElement Codes;
@FindBy(xpath="//button[contains(@id,'MasterDataCodes_700_search')]")
WebElement show;
@FindBy(xpath="(//span[contains(@data-ng-bind-html,'addCode_label')])[1]")
WebElement addspecialEquip;
@FindBy(xpath="(//span[contains(@data-ng-bind-html,'addCode_label')])[2]")
WebElement addinteriorEquip;
@FindBy(xpath="//span[contains(@data-ng-bind-html,'addPaintCode_label')]")
WebElement addpaintEquip;
@FindBy(xpath="//input[contains(@name,'codeDesignation_codeNumber')]")
WebElement addspecialcode;
@FindBy(xpath="//button[contains(@data-ng-click,'editMDText')]")
WebElement editMDText;
@FindBy(xpath="(//input[@name='masterDataDesignation_internationalText_text'])[2]")
WebElement Enginput;
@FindBy(xpath="(//button[contains(@data-ng-click,'save')])[1]")
WebElement popupapply;
@FindBy(xpath="//span[@class='cell-icon rc-i-line-check-circle']")
WebElement submittick;
@FindBy(xpath="//input[contains(@name,'paintDesignation_code')]")
WebElement addpaintcode;
@FindBy(xpath="//input[contains(@name,'interiorEquipment_code')]")
WebElement addinteriorcode;
@FindBy(xpath="//button[contains(@data-ng-click,'save')]")
WebElement codesave;
@FindBy(xpath="//input[@name='codeSearchFragment']")
WebElement filtercode;
@FindBy(xpath="(//span[contains(@data-ng-bind,'specialEquipmentCodeTable_rec')])[3]")
WebElement savedspeacialcode;
@FindBy(xpath="(//span[contains(@data-ng-bind,'paintDesignationTable_rec')])[3]")
WebElement savedpaintcode;
@FindBy(xpath="(//span[contains(@data-ng-bind,'interiorEquipmentTable_rec')])[3]")
WebElement savedinteriorcode;




@FindBy(xpath="//li[contains(@data-ng-show,'MasterDataCountryDesignation_710')]")
WebElement CountryDesigTab;
@FindBy(xpath="//span[contains(@data-ng-bind-html,'MasterDataCountryDesignation')]")
WebElement addsalesArea;
@FindBy(xpath="//input[contains(@data-ng-model,'salesAreaConsumer_rec.salesArea')]")
WebElement salesAreaInput;
@FindBy(xpath="//span[contains(@class,'cell-icon rc-i-line-check-circle')]")
WebElement submitsalestick;
@FindBy(xpath="(//button[contains(@data-ng-click,'save')])[2]")
WebElement savesales;
@FindBy(xpath="(//span[@class='sym rc-i-line-filter '])[4]")
WebElement countrydesigFilter;
@FindBy(xpath="//input[contains(@input-binding,'viewControl.salesAreaConsumer_filterExpression')]")
WebElement filterInput;
@FindBy(xpath="(//tr/td/span[@data-ng-bind='salesAreaConsumer_rec.salesArea'])[1]")
WebElement searchresultfirst;
@FindBy(name="productGroup")
WebElement Dropdown_list;
@FindBy(xpath="//tr[contains(@data-ng-repeat,'specialEquipmentCodeTable_rec')]")
List<WebElement> SpecialEquipmentCodeTable_Contents;

// SWEDHA

@FindBy(xpath="//a[text()='Codes']")
WebElement codesTab;

@FindBy(xpath="//span[text()='Add code']")
WebElement codesTab_SpecialEquipment_AddCode;

@FindBy(xpath="//select[@name='codeDesignation_category']")
WebElement codesTab_SpecialEquipment_Category;

@FindBy(xpath="//select[@name='codeDesignation_productGroupIndication']")
WebElement codesTab_SpecialEquipment_Pg;

@FindBy(xpath="//input[@name='codeDesignation_codeNumber']")
WebElement codesTab_SpecialEquipment_Code;

@FindBy(xpath="//input[@name='codeDesignation_productSeries']")
WebElement codesTab_ModelSeries;

@FindBy(xpath="//input[@name='codeDesignation_modelDesignation']")
WebElement codesTab_ModelDesignation;

@FindBy(xpath="//input[@name='codeDesignation_validFrom']")
WebElement codesTab_SpecialEquipment_ValidFrom;

@FindBy(xpath="//input[@name='codeDesignation_validTo']")
WebElement codesTab_SpecialEquipment_ValidUntil;

@FindBy(xpath="//select[@name='codeDesignation_rightCategory']")
WebElement codesTab_SpecialEquipment_AuthorizationCategory;

@FindBy(xpath="//select[@name='productGroup']")
WebElement codesTab_ProductGroup;

@FindBy(xpath="//div[@id='MasterDataProductCodesArrangement_body']//span[text()='Show']")
WebElement codesTab_ShowButton;

@FindBy(xpath="//div[@id='MasterDataProductCodesArrangement_body']//i[contains(@class,'pencil')]")
WebElement codesTab_Pencil;

@FindBy(xpath="(//input[@name='masterDataDesignation_internationalText_text'])[2]")
WebElement codesTab_English;

@FindBy(xpath="//span[text()='Apply']")
WebElement codesTab_Apply;

@FindBy(xpath="//input[@name='codeDesignation_modelDesignation']")
WebElement codesTab_modelDesignation;

@FindBy(xpath="//span[contains(@class,'check-circle')]")
WebElement codesTab_Checkmark;

@FindBy(xpath="//div[@id='MasterDataProductCodesArrangement_body']//span[contains(text(),'Save')]")
WebElement codesTab_Save;

@FindBy(xpath="(//div[@id='MasterDataProductCodesArrangement_body']//span[contains(@class,'filter')])[1]")
WebElement codesTab_SpecialEquipmentFilter;

@FindBy(xpath="//div[@id='MasterDataProductCodesArrangement_body']//input[@placeholder='Search the table']")
WebElement codesTab_Search;

@FindBy(xpath="//table[@id='specialEquipmentCodeTable']//span[contains(@class,'cell-icon rc-i-line-pencil')]")
WebElement codesTab_EditSpecialEquipment;

@FindBy(xpath="//table[@id='specialEquipmentCodeTable']//span[contains(@class,'trash')]")
WebElement codesTab_SpecialEquipment_Delete;

@FindBy(xpath="//table[@id='specialEquipmentCodeTable']//tr[@tabindex='0']")
WebElement codesTab_SpecialEquipment_filteredResult;

@FindBy(xpath="(//span[text()='Add code'])[2]")
WebElement codesTab_Paint_AddCode;

@FindBy(xpath="//select[@name='paintDesignation_category']")
WebElement codesTab_Paint_Category;

@FindBy(xpath="//select[@name='paintDesignation_productGroupIndication']")
WebElement codesTab_Paint_Pg;

@FindBy(xpath="//input[@name='paintDesignation_code']")
WebElement codesTab_Paint_Code;

@FindBy(xpath="//*[@id='paintDesignationTable']/tbody/tr[52]/td[7]/div/select")
WebElement codesTab_Paint_Kbacolor;

@FindBy(xpath="//input[@name='paintDesignation_validFrom']")
WebElement codesTab_Paint_ValidFrom;

@FindBy(xpath="//select[@name='paintDesignation_usage']")
WebElement codesTab_Paint_Usage;

@FindBy(xpath="(//div[@id='MasterDataProductCodesArrangement_body']//span[contains(@class,'filter')])[2]")
WebElement codesTab_Paint_Filter;

@FindBy(xpath="//table[@id='paintDesignationTable']//span[contains(@class,'cell-icon rc-i-line-pencil')]")
WebElement codesTab_EditPaint_Button;

@FindBy(xpath="//input[@name='codeSearchFragment']")
WebElement codesTab_Code_Search;

@FindBy(xpath="//table[@id='paintDesignationTable']//span[contains(@class,'trash')]")
WebElement codesTab_Paint_Delete;

@FindBy(xpath="//table[@id='paintDesignationTable']//tr[@tabindex='0']")
WebElement codesTab_Paint_filteredResult;

@FindBy(xpath="(//span[text()='Add code'])[3]")
WebElement codesTab_InteriorEquipment_AddCode;

@FindBy(xpath="//select[@name='interiorEquipment_category']")
WebElement codesTab_InteriorEquipment_Category;

@FindBy(xpath="//select[@name='interiorEquipment_productGroupIndication']")
WebElement codesTab_InteriorEquipment_Pg;

@FindBy(xpath="//input[@name='interiorEquipment_code']")
WebElement codesTab_InteriorEquipment_Code;

@FindBy(xpath="//div[contains(@id,'MasterDataInteriorEquipment')]//span[contains(@class,'cell-icon rc-i-line-pencil')]")
WebElement codesTab_EditInteriorEquipment_Button;

@FindBy(xpath="(//div[@id='MasterDataProductCodesArrangement_body']//span[contains(@class,'filter')])[3]")
WebElement codesTab_InteriorEquipment_Filter;

@FindBy(xpath="//div[contains(@id,'MasterDataInteriorEquipment')]//span[contains(@class,'trash')]")
WebElement codesTab_InteriorEquipment_Delete;

@FindBy(xpath="//div[contains(@id,'MasterDataInteriorEquipment')]//tr[@tabindex='0']")
WebElement codesTab_InteriorEquipment_filteredResult;

@FindBy(xpath="//a[@data-ng-disabled='!viewControl.MasterDataAdditionalCodeMapping_709.enabled']")
WebElement codesTab_ProvisionCodeTab;

@FindBy(xpath="//span[text()='Add entry']")
WebElement codesTab_ProvisionCodeAddEntryButton;

@FindBy(xpath="//input[@name='additionalCodeMapping_codeOfProduct']")
WebElement codesTab_ProvisionCodeDataCardCodeInput;

@FindBy(xpath="//input[@name='additionalCodeMapping_additionalCode']")
WebElement codesTab_ProvisionCodeInput;

@FindBy(xpath="//button[contains(@data-ng-if,'additionalCodeMappingTable_rec === viewControl.editing_object')][1]")
WebElement codesTab_ProvisionCodeSubmit;

@FindBy(xpath="//*[@id='MasterDataAdditionalCodeMapping_709']//form/div[3]//button[1]")
WebElement codesTab_ProvisionCodeSave;

@FindBy(xpath="//*[@id='additionalCodeMappingTable']//td[5]//button[1]")
WebElement codesTab_ProvisionCodeEdit;

@FindBy(xpath="//*[@id='additionalCodeMappingTable']//td[5]//button[2]")
WebElement codesTab_ProvisionCodeDelete;



@FindBy(xpath="//li[contains(@data-ng-show,'MasterDataFlexibleBatteryData_776')]")
WebElement batteryFlexibleTab;

// Rintu
@FindBy(xpath="//span[text()='Add entry']")
WebElement addEntryBatteryFlexible;

@FindBy(xpath="//input[@name='flexibleBatteryDataDesignation_key']")
WebElement keyBatteryFlexible;
@FindBy(xpath="//button[contains(@class,'text-button')]")
WebElement editDesignationBatteryFlexible;
@FindBy(xpath="(//input[contains(@name,'internationalText')])[2]")
WebElement englishDesignationBatteryFlexible;
@FindBy(xpath="(//input[contains(@name,'internationalText')])[1]")
WebElement germanDesignationBatteryFlexible;

@FindBy(xpath="//span[text()='Apply']")
WebElement applyBatteryFlexible;
@FindBy(xpath="//span[contains(@class,'line-check')]")
WebElement checkBatteryFlexible;
@FindBy(xpath="(//span[text()='Save'])[2]")
WebElement saveBatteryFlexible;
@FindBy(xpath="(//span[text()='Speichern'])[2]")
WebElement saveGermanBatteryFlexible;

@FindBy(xpath="(//span[contains(@class,'pencil')])[2]")
WebElement editBatteryFlexible;
@FindBy(xpath="(//span[contains(@class,'trash')])[1]")
WebElement deleteBatteryFlexible;
@FindBy(xpath="//span[contains(@class,'globe')]")
WebElement languageSelectionBatteryFlexible;

@FindBy(xpath="//span[text()='Deutsch']")
WebElement germanLanguageSelectionBatteryFlexible;

@FindBy(xpath="//span[text()='Apply']")
WebElement applyLanguageSelectionBatteryFlexible;

@FindBy(xpath="//span[text()='German']")
WebElement germanLanguageSelectedBatteryFlexible;

@FindBy(xpath="//span[text()='English']")
WebElement englishLanguageSelectionBatteryFlexible;

@FindBy(xpath="//span[text()='Übernehmen']")
WebElement applyGermanLanguageSelectionBatteryFlexible;

@FindBy(xpath="//a[text()='Vehicle model']")
WebElement vehicleModel;

@FindBy(xpath="//span[text()='Manage vehicle model']")
WebElement vehicleModel_ManageVehicleModel;

@FindBy(xpath="//button[starts-with(@id,'MasterDataVehicleModelDesignation')]//span[text()='Show data']")
WebElement manageVehicleModel_ShowData;

@FindBy(xpath="//span[text()='Model series filter']")
WebElement manageVehicleModel_ModelSeriesFilterButton;

@FindBy(xpath="//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//input[@placeholder='Search the table']")
WebElement manageVehicleModel_SearchTheTable;

@FindBy(xpath="//span[text()='Add model series']")
WebElement manageVehicleModel_AddModelSeriesButton;

@FindBy(xpath="//input[@name='productSeries_id']")
WebElement manageVehicleModel_ModelSeries;

@FindBy(xpath="//input[@name='prodSerDes']")
WebElement manageVehicleModel_Designation;

@FindBy(xpath="//select[@name='productSeries_brand']")
WebElement manageVehicleModel_Brand;

@FindBy(xpath="//select[@name='productSeries_category']")
WebElement manageVehicleModel_Category;

@FindBy(xpath="//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//span[contains(@class,'line-pencil')]")
WebElement manageVehicleModel_Edit;

@FindBy(xpath="//span[contains(@class,'check-circle')]")
WebElement manageVehicleModel_CheckMark;

@FindBy(xpath="//span[text()='Add model designation']")
WebElement manageVehicleModel_AddModelDesignationButton;

@FindBy(xpath="//input[@name='productSeries_cur_vehicleModelDesignation_id']")
WebElement manageVehicleModel_ModelDesignation;

@FindBy(xpath="//input[@name='vehicleDes']")
WebElement manageVehicleModel_Model_Designation;

@FindBy(xpath="//select[@name='productSeries_cur_vehicleModelDesignation_bodyType']")
WebElement manageVehicleModel_BodyType;

@FindBy(xpath="//input[@name='productSeries_cur_vehicleModelDesignation_code1']")
WebElement manageVehicleModel_Code1;

@FindBy(xpath="//input[@name='productSeries_cur_vehicleModelDesignation_code2']")
WebElement manageVehicleModel_Code2;

@FindBy(xpath="//input[@name='productSeries_cur_vehicleModelDesignation_code3']")
WebElement manageVehicleModel_Code3;

@FindBy(xpath="//input[@name='productSeries_cur_vehicleModelDesignation_code4']")
WebElement manageVehicleModel_Code4;

@FindBy(xpath="//*[@id='vehicleModelDesignationEditTable']/tbody/tr[34]/td[8]/div/span/button")
WebElement manageVehicleModel_ValidFrom;
@FindBy(xpath ="//*[@id='datepicker-39174-9527-28']")
WebElement validfromdate;
@FindBy(xpath="//*[@id='vehicleModelDesignationEditTable']/tbody/tr[34]/td[9]/div/span/button")
WebElement manageVehicleModel_ValidTo;
@FindBy(xpath = "//*[@id='datepicker-39283-9725-32']")
WebElement validtodate;
@FindBy(xpath="//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//*[text()='Save']")
WebElement manageVehicleModel_Save;

@FindBy(xpath="//span[text()='Model designation filter']")
WebElement manageVehicleModel_ModelDesignationFilter;

@FindBy(xpath="//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//tr[@tabindex='0']")
WebElement manageVehicleModel_ModelSeriesDataRow;

@FindBy(xpath="(//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//tr[@tabindex='0'])[2]")
WebElement manageVehicleModel_VehicleModelDesignationRow;

@FindBy(xpath="//button[@uib-popover='Edit model designation']//span[contains(@class,'line-pencil')]")
WebElement manageVehicleModel_EditVehicleModelDesignation;

@FindBy(xpath="//div[starts-with(@id,'MasterDataVehicleModelDesignation')]//span[contains(@class,'line-trash')]")
WebElement manageVehicleModel_Delete_VehicleModelDesignation;

@FindBy(xpath="//a[text()='VPD IDs']")
WebElement vpdIds;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[text()='Show data']")
WebElement vpdIds_ShowData;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[text()='Create VPD ID']")
WebElement createVpdId;

@FindBy(xpath="//input[@name='vpdIdent_id']")
WebElement vpdIds_VpdIdent;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//i[contains(@class,'pencil')]")
WebElement vpdIds_Description_Icon;

@FindBy(xpath="(//input[@name='masterDataDesignation_internationalText_text'])[2]")
WebElement vpdIds_Description_English;

@FindBy(xpath="//span[text()='Apply']")
WebElement vpdIds_Apply;

@FindBy(xpath="//select[@name='vpdIdent_typeOf']")
WebElement vpdIds_PvBreakdown;

@FindBy(xpath="//select[@name='vpdIdent_typeOfCv']")
WebElement vpdIds_CvBreakdown;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[contains(@class,'check-circle')]")
WebElement vpdIds_Checkmark;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[text()='Save']")
WebElement vpdIds_Save;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[text()='Filter']")
WebElement vpdIds_FilterButton;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//input[@placeholder='Search the table']")
WebElement vpdIds_SearchTheTable;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[contains(@class,'pencil')]")
WebElement vpdIds_Edit;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//tr[@tabindex='0']")
WebElement vpdIds_FilteredResult;

@FindBy(xpath="//span[contains(@data-ng-bind-html,'::alert.msg')]")
WebElement vpdIds_AlreadyExistingAlert_Line1;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'::alert.msg')]//p)[1]")
WebElement vpdIds_AlreadyExistingAlert_Line2;

@FindBy(xpath="(//span[contains(@data-ng-bind-html,'::alert.msg')]//p)[2]")
WebElement vpdIds_AlreadyExistingAlert_Line3;

@FindBy(xpath="//input[@name='vpdIdent_confidential']")
WebElement vpdIds_Confidential;

@FindBy(xpath="//span[text()='×']")
WebElement vpdIds_close;

@FindBy(xpath="//div[contains(@id,'MasterDataVpd')]//span[text()='Cancel']")
WebElement vpdIds_Cancel;

@FindBy(xpath="//a[text()='CU group']")
WebElement cuGroup;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//span[text()='Add entry']")
WebElement cuGroup_AddEntry;

@FindBy(xpath="//input[contains(@name,'partsGroup_id')]")
WebElement cuGroup_Identifier;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//i[contains(@class,'pencil')]")
WebElement cuGroup_Pencil;

@FindBy(xpath="(//input[contains(@name,'masterDataDesignation_internationalText_text')])[2]")
WebElement cuGroup_English;

@FindBy(xpath="//*[text()='Apply']")
WebElement cuGroup_Apply;

@FindBy(xpath="//select[@name='partsGroup_typeOfControlUnit']")
WebElement cuGroup_EcuModel;

@FindBy(xpath="//select[@name='partsGroup_typeOf']")
WebElement cuGroup_PartsFamiliesModel;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//span[contains(@class,'check-circle')]")
WebElement cuGroup_CheckMark;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//*[text()='Save']")
WebElement cuGroup_Save;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//span[text()='Filter']")
WebElement cuGroup_Filter;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//input[@placeholder='Search the table']")
WebElement cuGroup_SearchTheTable;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//tr[@tabindex='0']")
WebElement cuGroup_FilteredResult;

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//span[contains(@class,'pencil')]")
WebElement cuGroup_Edit;	

@FindBy(xpath="//form[contains(@name,'MasterDataPartsGroup')]//span[contains(@class,'trash')]")
WebElement cuGroup_Delete;

@FindBy(xpath="//a[text()='Country designations']")
WebElement countryDesignation;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//span[text()='Filter']")
WebElement countryDesignation_Filter;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//input[@placeholder='Search the table']")
WebElement countryDesignation_SearchTheTable;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//span[contains(@class,'pencil')]")
WebElement countryDesignation_Edit;

@FindBy(xpath="//table[contains(@id,'salesAreaConsumer')]//i[contains(@class,'pencil')]")
WebElement countryDesignation_SalesArea_Edit;

@FindBy(xpath="(//input[contains(@name,'masterDataDesignation_internationalText_text')])[2]")
WebElement countryDesignation_Designation;

@FindBy(xpath="//form[contains(@name,'ManageMasterData')]//span[text()='Apply']")
WebElement countryDesignation_Apply;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//input[@name='salesAreaConsumer_validFrom']")
WebElement countryDesignation_ValidFrom;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//input[@name='salesAreaConsumer_validTo']")
WebElement countryDesignation_ValidUntil;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//span[contains(@class,'check-circle')]")
WebElement countryDesignation_CheckMark;

@FindBy(xpath="//form[contains(@name,'MasterDataCountryDesignation')]//span[contains(text(),'Save')]")
WebElement countryDesignation_Save;

@FindBy(xpath="//div[contains(@id,'MasterDataCountryDesignation')]//tr[@tabindex='0']")
WebElement countryDesignation_FilteredResult;

@FindBy(xpath="//i[@class='sym rc-i-line-calendar ']")
WebElement countryDesignation_a;

@FindBy(xpath="//button[text()='✔']")
WebElement countryDesignation_b;


//Kartik
       @FindBy(xpath="//a[text()='Certification']")
       WebElement certificationTab;

       @FindBy(xpath="//input[@name='documentKeySearch']")
       WebElement documentKey;
       
       @FindBy(xpath="//button[@id='MasterDataCoC_765_search']")
       WebElement SearchForCOCData;
       
       //(//div[@class='mdsd-control fcol'])[6]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoC')]//span[@data-ng-bind='viewDataObject.cocNumber']")
   	   WebElement fetchDocumentKey;
       
       //(//div[@class='mdsd-control fcol'])[8]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoC')]//span[@data-ng-bind='viewDataObject.fuel']")
   	   WebElement fetchFuel;
       
       //(//div[@class='mdsd-control fcol'])[11]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoC')]//span[@data-ng-bind='viewDataObject.cocModelPlate.cubicCapacityCcm']")
   	   WebElement displacement;
       
     //(//div[@class='mdsd-control fcol'])[14]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoC')]//span[@data-ng-bind='viewDataObject.cocModelPlate.power']")
   	   WebElement output;
       
       //(//div[@class='mdsd-control fcol'])[18]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoC')]//span[@data-ng-bind='viewDataObject.egPermitDate | idate']")
   	   WebElement eu_approval_date;
       
       //(//li)[42]//a
       @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCoCCo2Data_766')]")
   	   WebElement gasoline_diesel_consumption;
        
       //(//li)[47]//a
       @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCocModelPlate')]")
   	   WebElement model_plate;
       //
       
       //(//span[contains(@class,'read-only consumption ng-binding')])[6]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data')]//span[contains(@data-ng-bind,'combinedCo2Emission | oneDigit : this')]")
   	   WebElement emision_combined;
       
       //(//form[@name='fMasterDataCocModelPlate_763']//span[@class='read-only ng-binding'])[9]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCocModelPlate')]//span[@data-ng-bind='viewDataObject.cocModelPlate.cubicCapacityCcm']")
   	   WebElement mp_displacement;
       
       //(//form[@name='fMasterDataCocModelPlate_763']//span[@class='read-only ng-binding'])[11]
       @FindBy(xpath="//form[contains(@name,'fMasterDataCocModelPlate')]//span[@data-ng-bind='viewDataObject.cocModelPlate.power']")
   	   WebElement mp_rated_output;
       
       @FindBy(xpath="//*[@class='mdsd-alert ng-scope ng-isolate-scope alert alert-dismissible alert-danger']")
		WebElement alertBox;
       
       @FindBy(xpath="//*[@class='close']")
		WebElement alertBoxClose;
       
  
       //-for U-034
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][1]//div[4]")
   	   WebElement fetchBrand;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][2]//div[2]")
   	   WebElement fetchVariant;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][2]//div[4]")
   	   WebElement fetchSalesDesignation;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][3]//div[2]")
   	   WebElement fetchVersion;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][3]//div[4]")
   	   WebElement fetchManufacturerCode;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][4]//div[2]")
   	   WebElement fetchEUApprovalNo;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][4]//div[4]")
   	   WebElement fetchIndexOfModelCodes;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][4]//div[6]")
   	   WebElement fetchHybridOutputInkW;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][5]//div[4]")
   	   WebElement fetchVariantVersionCode;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][5]//div[6]")
   	   WebElement fetchMaximumSspeed;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][6]//div[2]")
   	   WebElement fetchExhaustGuidelines;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][6]//div[4]")
   	   WebElement fetchCheckDigit;
       
       @FindBy(xpath="//div[@id='MasterDataCoC_765']//form//div[@class='panel sep-panel']//div[@class='panel-body']//div[@class='row rowspace'][6]//div[6]")
   	   WebElement fetchEmissionsStandard;
       //
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][1]//div[2]")
   	   WebElement fetchUrbanConsumption;
          
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][1]//div[4]")
   	   WebElement fetchCO2emissionsUrban;
       
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][2]//div[2]")
   	   WebElement fetchHighwayConsumption;
    
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][2]//div[4]")
   	   WebElement fetchCO2emissionHighway;
       
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][3]//div[2]")
   	   WebElement fetchCombinedConsumption;
       
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][4]//div[2]")
   	   WebElement fetchConsumptionWeighted;
       
       @FindBy(xpath="//form[contains(@name,'fMasterDataCoCCo2Data_766')]//div[@class='row rowspace'][4]//div[4]")
   	   WebElement fetchCO2emissionsWeighted;
       //
       @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCoCCo2DataFuelGas_767')]")
  	   WebElement gas_fuel_consumption;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[1]//div[2]")
  	   WebElement fetchUrbanConsumption_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[1]//div[4]")
  	   WebElement fetchCO2missionsUrban_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[2]//div[2]")
  	   WebElement fetchHighwayConsumption_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[2]//div[4]")
  	   WebElement fetchCO2emissionHighway_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[3]//div[2]")
  	   WebElement fetchCombinedConsumption_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[3]//div[4]")
 	   WebElement fetchCO2emissionsCombined_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[4]//div[2]")
  	   WebElement fetchConsumptionWeighted_Gas;
      
      @FindBy(xpath="//div[@id='MasterDataCoCCo2DataFuelGas_767_body']//form//div[4]//div[4]")
  	   WebElement fetchCO2emissionsWeighted_Gas;
    
      @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCoCCo2DataOthers_768')]")
	   WebElement other_consumption;
  
  @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[1]//div[2]")
	   WebElement fetchUrbanConsumption_other;
  
  @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[1]//div[4]")
	   WebElement fetchCO2missionsUrban_other;
  
  
  @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[2]//div[2]")
	   WebElement fetchHighwayConsumption_other;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[2]//div[4]")
	   WebElement fetchCO2emissionHighway_other;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[3]//div[2]")
	   WebElement fetchCombinedConsumption_other;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[3]//div[4]")
	   WebElement fetchCO2emissionsCombined_other;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[4]//div[2]")
	   WebElement fetchConsumptionWeighted_other;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataOthers_768_body']//form//div[4]//div[4]")
	   WebElement fetchCO2emissionsWeighted_other;
      
 
 @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCoCCo2DataElectricity_769')]")
 WebElement electricity_consumption_Button;
 
 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataElectricity_769_body']//form//div[1]//div[2]")
	   WebElement fetchCombinedConsumption_electricity;

 @FindBy(xpath="//div[@id='MasterDataCoCCo2DataElectricity_769_body']//form//div[2]//div[2]")
	   WebElement fetchRang_electricity;
 
 
 @FindBy(xpath="//a[contains(@data-ng-click,'MasterDataCocTires_764')]")
 WebElement tires_Button;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[1]//div[2]")
 WebElement tiresAxle_1;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[1]//div[4]")
 WebElement rimAxle_1;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[1]//div[6]")
 WebElement air_pressure_Axle_1;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[2]//div[2]")
 WebElement tiresAxle_2;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[2]//div[4]")
 WebElement rimAxle_2;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[2]//div[6]")
 WebElement air_pressure_Axle_2;

 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[3]//div[2]")
 WebElement tiresAxle_3;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[3]//div[4]")
 WebElement rimAxle_3;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[3]//div[6]")
 WebElement air_pressure_Axle_3;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[4]//div[2]")
 WebElement tiresAxle_4;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[4]//div[4]")
 WebElement rimAxle_4;
 
 @FindBy(xpath="//div[@id='MasterDataCocTires_764_body']//form//div[4]//div[6]")
 WebElement air_pressure_Axle_4;
 
       
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[1]//div[2]//div[2]")
 WebElement permissible_weight_modelplate;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[1]//div[3]//div[2]")
 WebElement permissible_weight_vehicle_combination_modelplate;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[1]//div[4]//div[2]")
 WebElement permissible_axle_load_Axle_1;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[1]//div[4]//div[2]")
 WebElement permissible_axle_load_Axle_2;
 
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[1]//div[2]")
 WebElement model_modelplate;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[2]//div[2]")
 WebElement sales_designation_modelplate;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[3]//div[2]")
 WebElement vehicle_model_designation;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[3]//div[5]")
 WebElement reated_electrical_output;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[4]//div[2]")
 WebElement engine_mode_designation;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[4]//div[4]")
 WebElement rated_output_kW_max;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[5]//div[2]")
 WebElement number_of_seats;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[5]//div[5]")
 WebElement battery_modelplate;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[6]//div[2]")
 WebElement low_beam_light_bundle;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[6]//div[4]")
 WebElement rated_voltage_in_volts;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[7]//div[2]")
 WebElement diesel_smoke_coefficient;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[7]//div[5]")
 WebElement cno_russia;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[8]//div[2]")
 WebElement curb_weight;
 
 @FindBy(xpath="(//div[@id='MasterDataCocModelPlate_763_body']//form//div[@class='panel-body'])[2]//div[8]//div[5]")
 WebElement china_model;
       
          
//Kartik end
    




private Alert externalServiceConfigurationTab_TimeoutTime;

public MasterDataPage() {
	PageFactory.initElements(driver, this);
}

public void VehicleModeltabclick() {
	VehicleModel.click();
}

public void ManageVehicleModelLeftclick() {
	ManageVehicleModelLeft.click();
}

public void ShowDataclick() {
	ShowData.click();
	warmup4();
}

public void AddModelDesignationclick() {
	AddModelDesignation.click();
}

public void input1add() {
	input1.sendKeys(givenmodeldesiginput1);
}

public void input2add() {
	input2.sendKeys(givenmodeldesiginput1);
}

public void selectBodyTypeDropdown() {
	Select BodyType=new Select(driver.findElement(By.xpath("//select[contains(@data-ng-model,'vehicleModelDesignationEditTable_rec.bodyType')]")));
	BodyType.selectByIndex(4);
}

public void sumbittickclick() {
	sumbittick.click();
}

public void saveclick() {
	savebutton.click();
	warmup4();
}

//codes tab

public void codes() {
	Codes.click();
	warmup1();
}

public void show() {
	show.click();
	warmup4();
}

public void addspecialEquip() {
	addspecialEquip.click();
}

public void addinteriorEquip() {
	addinteriorEquip.click();
}

public void addpaintEquip() {
	addpaintEquip.click();
}

public void addspecialcode() {
	addspecialcode.sendKeys(givenmodeldesiginput1);
}

public void editMDText() {
	editMDText.click();
	warmup5();;
}

public void Enginput() {
	Enginput.sendKeys("Created by automation script");
}

public void popupapply() {
	popupapply.click();
	warmup5();;
}

public void submittick() {
	submittick.click();
	warmup5();;
}

public void addpaintcode() {
	addpaintcode.sendKeys(givenmodeldesiginput1);
}

public void addinteriorcode() {
	addinteriorcode.sendKeys(givenmodeldesiginput1);
}

public void codesave() {
	codesave.click();
	warmup4();
}

public void categoryspecialdropdown() {
	Select category=new Select(driver.findElement(By.xpath("//select[@name='codeDesignation_category']")));
	category.selectByIndex(4);
}

public void PGcodespecialdropdown() {
	Select PG=new Select(driver.findElement(By.xpath("//select[@name='codeDesignation_productGroupIndication']")));
	PG.selectByIndex(4);
}

public void categorypaintdropdown() {
	Select category=new Select(driver.findElement(By.xpath("//select[@name='paintDesignation_category']")));
	category.selectByIndex(4);
}

public void PGpaintdropdown() {
	Select PG=new Select(driver.findElement(By.xpath("//select[@name='paintDesignation_productGroupIndication']")));
	PG.selectByIndex(4);
}

public void categoryinteriordropdown() {
	Select category=new Select(driver.findElement(By.xpath("//select[@name='interiorEquipment_category']")));
	category.selectByIndex(4);
}

public void PGinteriordropdown() {
	Select PG=new Select(driver.findElement(By.xpath("//select[@name='interiorEquipment_productGroupIndication']")));
	PG.selectByIndex(4);
}

public String Dropdown_list(){
	
	wait.until(ExpectedConditions.visibilityOf(Dropdown_list));
	String Dropdown_Items=Dropdown_list.getText();
	return Dropdown_Items;
}

public void filtercode() {
	filtercode.sendKeys(givenmodeldesiginput1);
	}

public String savedspeacialcode() {
	String speacialcode=savedspeacialcode.getText();
	return speacialcode;
}
public String savedpaintcode() {
	String paintcode=savedpaintcode.getText();
	return paintcode;
}
public String savedinteriorcode() {
	String interiorcode=savedinteriorcode.getText();
	return interiorcode;
}


public void CountryDesigTab() {
	CountryDesigTab.click();
	
}
public void addsalesArea() {
	warmup1();
	addsalesArea.click();
}
public void salesAreaInput() {
	salesAreaInput.sendKeys(givensalesareanumber);;
}
public void submitsalestick() {
	submitsalestick.click();
}
public void savesales() {
	CountryDesigTab.click();
	warmup1();
}
public void clickcountrydesigfilter() {
	countrydesigFilter.click();
}
public void inputfilter() {
	filterInput.sendKeys(givensalesareanumber);
}
public boolean searchresult() {	
	if(searchresultfirst.getText().contains(givensalesareanumber)) {
		return true;
	}else {
		return false;
	}
	
}

public void CodesData_MasterData(){
	
	warmup5();;
	
	/* To check if the System Message is present on Navigating to Master Data Module  */
	
	
	
	/* Clicking on Show button in the Master Data Module  */
	
	wait.until(ExpectedConditions.visibilityOf(showButton));

	showButton.click();
	
	warmup5();
	
	SpecialEquipment_CSVButton_download.click();
	
	warmup3();
	
	warmup6();
	
	/* To scroll to 50th element in the Special Equipment Table */
	
	List<WebElement> rows=driver.findElements(By.xpath("//span[contains(@data-ng-bind,'specialEquipmentCodeTable_rec.category')]"));

	while(true){
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
		 List<WebElement> tempRows = driver.findElements(By.xpath("(//span[contains(@data-ng-bind,'specialEquipmentCodeTable_rec.category')])[50]"));
		 
		  if(tempRows.size() > rows.size()) {
		        rows = tempRows;
		    } else {
		        break;
		    }
	}
	
	/* Clicking on the Code button to rearrange the table */
	
	warmup5();;
	
	wait.until(ExpectedConditions.visibilityOf(SpecialEquipment_CodeFilter));
	
	SpecialEquipment_CodeFilter.click();
	
	/* Clicking on the Reset button rearrange the table */
	warmup5();;
	
	wait.until(ExpectedConditions.visibilityOf(SpecialEquipment_CodeReset));
	
	SpecialEquipment_CodeReset.click();
	
	/* Clicking on the Filter button to search the code in the Special Equipment table */
	warmup5();;
	
	wait.until(ExpectedConditions.visibilityOf(SpecialEquipment_FilterButton));
	
	SpecialEquipment_FilterButton.click();
	
	/* Entering the vehicle code to search the relevant result in the Special Equipment table */
	
	warmup6();
	
	SpecialEquipment_serachText.sendKeys("003");
	
	SpecialEquipment_serachText.sendKeys(Keys.ENTER);
	
	/* Clicking on the Cancel Filter button to reset the search results in the Special Equipment table */
	
	wait.until(ExpectedConditions.visibilityOf(SpecialEquipment_CancelFilter));
	SpecialEquipment_FilterButton.click();
	//SpecialEquipment_CancelFilter.click();
	
//	warmup6();
//	/* To scroll to 100th element in the Special Equipment Table */
//
//	List<WebElement> rows1=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'specialEquipmentCodeTable_rec.category')]"));
////
//	while(true){
//		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
//		 List<WebElement> tempRows1 = driver.findElements(By.xpath("(//span[contains(@data-ng-bind,'specialEquipmentCodeTable_rec.category')])[100]"));
//		 
//		  if(tempRows1.size() > rows1.size()) {
//		        rows1 = tempRows1;
//		    } else {
//		        break;
//		    }
//	}

	warmup6();
	
	Paint_CSVButton_download.click();
	
		
	  warmup3();
	  
	  
		List<WebElement> rows2=driver.findElements(By.xpath("//span[contains(@data-ng-bind,'paintDesignationTable_rec.category')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows2.get(rows2.size()-1));
			 List<WebElement> tempRows2 = driver.findElements(By.xpath("(//span[contains(@data-ng-bind,'paintDesignationTable_rec.category')])[50]"));
			 
			  if(tempRows2.size() > rows2.size()) {
			        rows = tempRows2;
			    } else {
			        break;
			    }
		}
		
		warmup5();;
		wait.until(ExpectedConditions.visibilityOf(Paint_CodeSort));
		Paint_CodeSort.click();
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(Paint_CodeReset));
		Paint_CodeReset.click();
		
		warmup5();
		
		Paint_FilterButton.click();
		
		Paint_SearchText.click();
		
		Paint_SearchText.sendKeys("221");
		
		Paint_SearchText.sendKeys(Keys.ENTER);
		
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(InteriorEquipment_CSVButton_download));
		
		InteriorEquipment_CSVButton_download.click();
		
		Paint_FilterButton.click();
        warmup3();
		  
			
			List<WebElement> rows4=driver.findElements(By.xpath("//span[contains(@data-ng-bind,'interiorEquipmentTable_rec.code')]"));

			while(true){
				 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows4.get(rows4.size()-1));
				 List<WebElement> tempRows = driver.findElements(By.xpath("(//span[contains(@data-ng-bind,'interiorEquipmentTable_rec.code')])[50]"));
				 
				  if(tempRows.size() > rows4.size()) {
				        rows = tempRows;
				    } else {
				        break;
				    }
			}
			
			warmup5();;
			wait.until(ExpectedConditions.visibilityOf(InteriorEquipment_CodeSort));
			InteriorEquipment_CodeSort.click();
			
			warmup5();;
			wait.until(ExpectedConditions.visibilityOf(InteriorEquipment_CodeReset));
			InteriorEquipment_CodeReset.click();
			
			warmup5();;
			wait.until(ExpectedConditions.visibilityOf(InteriorEquipment_FilterButton));
			InteriorEquipment_FilterButton.click();
			
			InteriorEquipment_SearchText.sendKeys("207");
			InteriorEquipment_SearchText.sendKeys(Keys.ENTER);
			
			warmup5();;
			wait.until(ExpectedConditions.visibilityOf(InteriorEquipment_CancelFilter));

			InteriorEquipment_FilterButton.click();
			//InteriorEquipment_CancelFilter.click();
			
			
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(AdditionalPaintwork));
			
	
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].scrollIntoView();", AdditionalPaintwork);
			js.executeScript("arguments[0].click();", AdditionalPaintwork);

			
			AdditionalPaintwork.click();
			
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(AdditionalPaintWork_CSVdownload));
			AdditionalPaintWork_CSVdownload.click();
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(AdditionalPaintWork_CodeSort));
			AdditionalPaintWork_CodeSort.click();
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(AdditionalPaintWork_FilterButton));
			AdditionalPaintWork_FilterButton.click();
			
			
            warmup6();
			AdditionalPaintWork_SearchText.sendKeys("46");
			
			AdditionalPaintWork_SearchText.sendKeys(Keys.ENTER);
			warmup5();
			
			AdditionalPaintWork_CancelFilter.click();
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(ProvisionCode));
			ProvisionCode.click();
			warmup5();
			wait.until(ExpectedConditions.elementToBeClickable(ProvisionCode_CSVdownload));
			ProvisionCode_CSVdownload.click();
			
			
			  warmup3();
			  
			  OtherManufacturerCode.click();
			  
			  warmup5();
			  wait.until(ExpectedConditions.elementToBeClickable(OtherManufacturerCode_CSVdownload));
			  OtherManufacturerCode_CSVdownload.click();
			  
              warmup3();
			  
				List<WebElement> rows6=driver.findElements(By.xpath("//span[contains(@data-ng-bind,'thirdPartyCodeDesignationsTable_rec.code')]"));

				while(true){
					 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows6.get(rows6.size()-1));
					 List<WebElement> tempRows6 = driver.findElements(By.xpath("(//span[contains(@data-ng-bind,'thirdPartyCodeDesignationsTable_rec.code')])[50]"));
					 
					  if(tempRows6.size() > rows6.size()) {
					        rows6 = tempRows6;
					    } else {
					        break;
					    }
				}
//				warmup5();
//				wait.until(ExpectedConditions.elementToBeClickable(OtherManufacturerCode_FilterButton));
//
//				OtherManufacturerCode_FilterButton.click();
//				warmup5();
//				Actions a=new Actions(driver);
//				a.moveToElement(OtherManufacturerCode_SearchText).build().perform();
//				
//				a.click().build().perform();
//				
//				OtherManufacturerCode_SearchText.sendKeys("11");
//				
//				OtherManufacturerCode_SearchText.sendKeys(Keys.ENTER);
//				warmup5();;
//				wait.until(ExpectedConditions.elementToBeClickable(OtherManufacturer_CancelFilter));
//				OtherManufacturer_CancelFilter.click();
				
				
			
}
	public void SAANumbers_DataTest(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(SAANumber_Tab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		js.executeScript("arguments[0].click();", SAANumber_Tab);

		
		
		SAANumber_Tab.click();
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(SAATextField_Search));
		
		SAATextField_Search.click();
		
		SAATextField_Search.sendKeys("123456");
		
		SAATextField_Search.sendKeys(Keys.ENTER);
		
		warmup5();;
		
		SAA_CSVdownloadbutton.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'saaDesignation_rec in viewDataObject.saaDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'saaDesignation_rec in viewDataObject.saaDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(SAAIDs_Sort));
		
		
		js.executeScript("arguments[0].scrollIntoView();", AdditionalPaintwork);
		js.executeScript("arguments[0].click();", SAAIDs_Sort);
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(SAA_FilterButton));
		SAA_FilterButton.click();
		
		SAAID_Search.sendKeys("SV LIGHTING");
		
		SAAID_Search.sendKeys(Keys.ENTER);
		
		SAA_CancelFilter.click();
		
		
		
	}
	
	public void DesignGroupTabTest(){
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(DesignGroupTab));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		js.executeScript("arguments[0].click();", DesignGroupTab);
		
		DesignGroupTab.click();
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(DesignGroup_Textfield));

		
		DesignGroup_Textfield.click();
		
		
		DesignGroup_Textfield.sendKeys("A0000000275");
	
		
		
		DesignGroup_Textfield.sendKeys(Keys.ENTER);
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(DesignGroup_CSVdownloadButton));

		DesignGroup_CSVdownloadButton.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'assemblyGroup_rec in viewDataObject.assemblyGroupDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'assemblyGroup_rec in viewDataObject.assemblyGroupDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		
	}
	

	public void VPDIDsTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(VPDIDs_Tab));
		
		VPDIDs_Tab.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(VPDIDs_ShowButton_Click));
		
		js.executeScript("arguments[0].click();", VPDIDs_ShowButton_Click);
		
		wait.until(ExpectedConditions.elementToBeClickable(VPDIDs_CSVdownloadButton));
		VPDIDs_CSVdownloadButton.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'VpdIdentTable_rec in viewDataObject.vpdIdent')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'VpdIdentTable_rec in viewDataObject.vpdIdent')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
	//	VPDID_Sort.click();
		
		warmup5();;
		
		js.executeScript("arguments[0].click();", VPDID_Sort);
		
		wait.until(ExpectedConditions.elementToBeClickable(VPDID_FilterButton));
		
		VPDID_FilterButton.click();
		
		VPDID_SearchText.sendKeys("45");
		
		VPDID_SearchText.sendKeys(Keys.ENTER);
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(VPDID_CancelFilter));

		VPDID_CancelFilter.click();
	}
	
	public void VehicleModelTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(VehicleModelTab));

		VehicleModelTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(ModelDesignation_Search));

		ModelDesignation_Search.click();
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ModelDesignation_CSVdownloadButton));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ModelDesignation_CSVdownloadButton);
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'vehicleModelDesShowTable_rec in viewDataObject.vehicleModelDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'vehicleModelDesShowTable_rec in viewDataObject.vehicleModelDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		ModelDesignation_sort.click();
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ModelDesignation_ResetSort));
		
		ModelDesignation_ResetSort.click();
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ModelDesignation_FilterButton));

		ModelDesignation_FilterButton.click();
		
		ModelDesignation_SearchText.sendKeys("963");
		
		ModelDesignation_SearchText.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ModelDesignation_CancelFilter));

		ModelDesignation_CancelFilter.click();
		
	}
	
	public void ControlUnitVPDIdDataTest(){
		
		warmup6();
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDIDTab));

		ControlUnitVPDIDTab.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDIDTab_ShowDataButton));
		
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ShowDataButton);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDIDTab_ExportAssignment_Button));
		
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ExportAssignment_Button);
		
		warmup3();
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_DiogenesName);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_Filterbutton));

		js.executeScript("arguments[0].click();", ControlUnitVPDID_Filterbutton);

		
		ControlUnitVPDID_Searchtext.sendKeys("TCM");
		
		ControlUnitVPDID_Searchtext.sendKeys(Keys.ENTER);
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_CancelFilter_Button));

		js.executeScript("arguments[0].click();", ControlUnitVPDID_CancelFilter_Button);

		
		warmup3();
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_CSVdownload_Button));

		
		ControlUnitVPDID_CSVdownload_Button.click();
		
		warmup3();
		warmup6();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'Mapping_rec in viewDataObject.cuDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'Mapping_rec in viewDataObject.cuDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}

	}
	public int getRecordsCountInCSV(String downloadPath, String csvFileName) {
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
					lineNumberCount=lineNumberCount-3;
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
public int getNumberOfEntries() {
		
		String entriesTxt = ControlUnitVPDID_TotalRecords();
		String[] aEntriesText = entriesTxt.split(" / ");
		System.out.println(aEntriesText.length);
		String totalEntriesText = aEntriesText[1];
		int i=Integer.parseInt(totalEntriesText);
		System.out.println(totalEntriesText);
		return i;
	}
	public void EditControlUnitVPDIdDataTest(){
		warmup5();
		ControlUnitVPDIDTab.click();
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitVPDIDTab_ShowDataButton);
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ShowDataButton);
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_Filterbutton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_Filterbutton);
		ControlUnitVPDID_Searchtext.sendKeys("ABP");
		ControlUnitVPDID_Searchtext.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_EditButton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_EditButton);
		warmup3();
		js.executeScript("arguments[0].click();", ControlUnitVPDID_ShortDesignation);
		ControlUnitVPDID_ShortDesignation.clear();
		ControlUnitVPDID_ShortDesignation.sendKeys("ABN");
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SCNVPDIdent);
		ControlUnitVPDID_SCNVPDIdent.clear();
		ControlUnitVPDID_SCNVPDIdent.sendKeys("30008");
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_SaveIcon));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SaveIcon);
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_SaveButton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SaveButton);
		warmup4();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_Filterbutton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_Filterbutton);
		warmup3();
		ControlUnitVPDID_Searchtext.sendKeys("ABP");
		ControlUnitVPDID_Searchtext.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_EditButton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_EditButton);
		warmup3();
		js.executeScript("arguments[0].click();", ControlUnitVPDID_ShortDesignation);
		ControlUnitVPDID_ShortDesignation.clear();
		ControlUnitVPDID_ShortDesignation.sendKeys("ABP");
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SCNVPDIdent);
		ControlUnitVPDID_SCNVPDIdent.clear();
		ControlUnitVPDID_SCNVPDIdent.sendKeys("30007");
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_SaveIcon));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SaveIcon);
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDID_SaveButton));
		js.executeScript("arguments[0].click();", ControlUnitVPDID_SaveButton);
		}
	public void ExportControlUnitVPDIdDataTest(){
		String downloadPath = "C:\\Users\\Administrator.VSI-AUTOTEST-VE\\Downloads";
		String csvFileName =  "VEDOC_MAPPING_" +date1+".csv";
		ControlUnitVPDIDTab.click();
		warmup5();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitVPDIDTab_ShowDataButton);
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ShowDataButton);
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnitVPDIDTab_ExportAssignment_Button));
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ExportAssignment_Button);
		System.out.println("EditControlUnitVPDIdDataTest");
		//Assert.assertEquals(getNumberOfEntries(), getRecordsCountInCSV(downloadPath,csvFileName));
		
		/*
		 * if(getNumberOfEntries()==getRecordsCountInCSV(downloadPath,csvFileName))
		 * System.out.println("No. of Rows matched in table & in csv file"); else
		 * System.out.println("Oops!! No. of Rows didnt match in table & in csv file");
		 */
	}
	
	//end
	public void CountryDesignationTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(CountryDesignationTab));

		CountryDesignationTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(CountryDesignationTab_CSVdownload_button));

		CountryDesignationTab_CSVdownload_button.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'salesAreaConsumer_rec in viewDataObject.salesAreaConsumer')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'salesAreaConsumer_rec in viewDataObject.salesAreaConsumer')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);

		js.executeScript("arguments[0].click();", CountryDesignationTab_FilterButton);
		
		warmup1();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(CountryDesignationTab_CancelFilterButton));

		CountryDesignationTab_CancelFilterButton.click();
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(CountryDesignationTab_Sort));

		js.executeScript("arguments[0].click();", CountryDesignationTab_Sort);

		
	}
	
	public void PlantsTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(PlantTab));

		PlantTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(Plants_CSVbuttonDownload));

		Plants_CSVbuttonDownload.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'plantTable_rec in viewDataObject.plant')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'plantTable_rec in viewDataObject.plant')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
	
		warmup5();;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", PlantsTab_FilterButton);

		js.executeScript("arguments[0].click();", PlantsTab_FilterButton);
		
		Plants_SearchText.sendKeys("2");
		
		Plants_SearchText.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(Plants_CancelFilterButtont));

		js.executeScript("arguments[0].click();", Plants_CancelFilterButtont);
		

	}
	
	public void SpecialPlantTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(SpecialPlantTab));

		SpecialPlantTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(SpecialPlantTab_ShowDataButton));

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);

		js.executeScript("arguments[0].click();", SpecialPlantTab_ShowDataButton);
		
		warmup4();
		
		wait.until(ExpectedConditions.elementToBeClickable(SpecialPlantTab_CSVdownloadButton));

		SpecialPlantTab_CSVdownloadButton.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'specialPlantTextDesignation_rec in viewDataObject.specialPlantTextDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'specialPlantTextDesignation_rec in viewDataObject.specialPlantTextDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		wait.until(ExpectedConditions.elementToBeClickable(SpecialPlantTab_Sort));

		js.executeScript("arguments[0].click();", SpecialPlantTab_Sort);

		
		
	}
	
	public void DGDesignationTabTest(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(DGDesignatinTab));

		DGDesignatinTab.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(DGDesignationTab_CSVButtonDownload));

		DGDesignationTab_CSVButtonDownload.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'designGroup_rec in viewDataObject.designGroup')])"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'designGroup_rec in viewDataObject.designGroup')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(DGDesignationTab_FilterButton));
		
		js.executeScript("arguments[0].click();", DGDesignationTab_FilterButton);
		
		DGDesignationTab_SearchText.sendKeys("XVK");
		
		DGDesignationTab_SearchText.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(DGDesignationTab_CancelFilterButton));

		
		DGDesignationTab_CancelFilterButton.click();
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(DGDesignationTab_Sort));

		
		
		js.executeScript("arguments[0].click();", DGDesignationTab_Sort);
		

	}
	
	public void ElectricalVariantTabTest(){
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ElectricalVariantTab));

		ElectricalVariantTab.click();
		
		ElectricalVariantsTab_CSVdownloadButton.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'electroVariantDesignation_rec in viewDataObject.electroVariantDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'electroVariantDesignation_rec in viewDataObject.electroVariantDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ElectricalVariantsTab_FilterButton));

		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);

		js.executeScript("arguments[0].click();", ElectricalVariantsTab_FilterButton);
		
		ElectricalVariantsTab_SearchText.sendKeys("51");
		
		ElectricalVariantsTab_SearchText.sendKeys(Keys.ENTER);
		
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ElectricalVariantsTab_CancelFilter));

		ElectricalVariantsTab_CancelFilter.click();
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(ElectricalVariantsTab_Sort));

		ElectricalVariantsTab_Sort.click();
		
	}
	
	public void BodiesTabTest(){
		warmup5();
		//Kartik
		Actions act=new Actions(driver);
		act.moveToElement(SAANumber_Tab).perform();
		warmup();
		act.moveToElement(BodiesTab).click().build().perform();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterBodyManufacturer));
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", MasterBodyManufacturer);
		
		js.executeScript("arguments[0].click();", MasterBodyManufacturer);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(BodiesTab_CSVdownloadButton));

		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'BodyManufNaviagtion_rec in viewDataObject.bodyManufacturer')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'BodyManufNaviagtion_rec in viewDataObject.bodyManufacturer')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(Bodies_FilterButton));

		
		js.executeScript("arguments[0].scrollIntoView();", Bodies_FilterButton);
		
		js.executeScript("arguments[0].click();", Bodies_FilterButton);
		
		Bodies_SearchText.sendKeys("12");
		
		Bodies_SearchText.sendKeys(Keys.ENTER);
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(Bodies_CancelFilterButton));
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		
		js1.executeScript("arguments[0].scrollIntoView();", Bodies_CancelFilterButton);
		js1.executeScript("arguments[0].click();", Bodies_CancelFilterButton);

//		Bodies_CancelFilterButton.click();
		
		
	}
	
	public void BodiesKWTabTest(){
		warmup5();
		
		//Kartik
				Actions act=new Actions(driver);
				act.moveToElement(SAANumber_Tab).perform();
				warmup();
				act.moveToElement(BodiesKWTab).click().build().perform();
		
		BodiesKWTab_customerRequestCodeSearch.sendKeys("12");
		
		BodiesKWTab_customerRequestCodeSearch.sendKeys(Keys.ENTER);
		
		wait.until(ExpectedConditions.elementToBeClickable(BodiesKWTab_CSVButtonDownload));

		BodiesKWTab_CSVButtonDownload.click();
		
		warmup3();
		
		List<WebElement> rows=driver.findElements(By.xpath("//tr[contains(@data-ng-repeat,'localCustomerRequestCodes_rec in viewDataObject.customerRequestCodeDesignation')]"));

		while(true){
			 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", rows.get(rows.size()-1));
			 List<WebElement> tempRows = driver.findElements(By.xpath("(//tr[contains(@data-ng-repeat,'localCustomerRequestCodes_rec in viewDataObject.customerRequestCodeDesignation')])[50]"));
			 
			  if(tempRows.size() > rows.size()) {
			        rows = tempRows;
			    } else {
			        break;
			    }
		}
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(BodiesKWTab_FilterButton));

		
		BodiesKWTab_FilterButton.click();
		
		BodiesKWTab_SearchText.sendKeys("25");
		
		BodiesKWTab_SearchText.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(BodiesKWTab_CancelFilter));
		warmup5();
		warmup5();
		//BodiesKWTab_CancelFilter.click();

	}
	
	public void LabelDataTabTest(){
		
		warmup5();
		//Kartik
		Actions act=new Actions(driver);
		act.moveToElement(SAANumber_Tab).perform();
		warmup();
		act.moveToElement(LabelDataTab).click().build().perform();
		
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(LabelDataTab_CSVButtonDownload));

		LabelDataTab_CSVButtonDownload.click();
		warmup5();;
		wait.until(ExpectedConditions.visibilityOf(LabelDataTab_FilterButton));

		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", CodesTab );
		
		js.executeScript("arguments[0].click();", LabelDataTab_FilterButton);
		warmup5();;
		wait.until(ExpectedConditions.visibilityOf(LabelDataTab_Searchtext));

		LabelDataTab_Searchtext.sendKeys("5");
		
		LabelDataTab_Searchtext.sendKeys(Keys.ENTER);
		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(LabelDataTab_CancelFilterButton));
		warmup5();
//		LabelDataTab_CancelFilterButton.click();
		
		
	}
	
	public void CodesDataTab_WriteAccess(){
		
		warmup5();
		
		warmup5();;
		wait.until(ExpectedConditions.visibilityOf(showButton));

		showButton.click();

		warmup5();;
		wait.until(ExpectedConditions.elementToBeClickable(SpecialEquipment_AddCodeButton));
		
		SpecialEquipment_AddCodeButton.click();
		
		warmup5();;
		
		MasterData_TechnicalAdvisorDialog_Dismiss.click();
		
		warmup5();;
		
		SpecialEquipment_SelectCategory.click();
		
		Select VehicleType=new Select(SpecialEquipment_SelectCategory);
		
		VehicleType.selectByValue("string:C1");
		
		warmup5();;
		
		SpecialEquipment_SelectProductGroupIndication.click();
		
		Select ProductGropuIndication=new Select(SpecialEquipment_SelectProductGroupIndication);
		
		ProductGropuIndication.selectByValue("string:D");
		
		warmup5();;
		
		SpecialEquipmentCode_text.click();
		
		SpecialEquipmentCode_text.sendKeys(RandomSpecialEquipmentCode);
		
		warmup5();;
		
		SpecialEquipment_ModelSeries.click();
		
		SpecialEquipment_ModelSeries.sendKeys(RandomModelSeries);
		
		warmup5();;
		
		SpecialEquipment_ModelDesignation.click();
		
		SpecialEquipment_ModelDesignation.sendKeys(RandomModelDesignation);
		
		warmup5();;
		
		SpecialEquipment_Designation.click();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();;
		
		MasterDataManagement_ModalDialog.sendKeys("Created by MBRDI");
		
		warmup5();;
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();;
		
		SpecialEquipment_SaveChanges.click();
		

		
		warmup5();;
		
		SpecialEquipment_SaveButton.click();
		
		try{
			//button[contains(@ng-show,'closeable')]
			warmup5();
			
			
			TechnicalError_Dialog.click();
		}catch(Exception e){
			
			System.out.println("Technical error is displayed");
		}
		
		warmup5();;
		
		try{
			
			warmup5();
			
			SpecialEquipment_lockbutton.click();
		}catch(Exception E){
			
			System.out.println("Lock button is present");
		}
		
		
	}
	
	public void PaintTab(){
		
		warmup5();;
		
		Paint.click();
		
		warmup5();;
		
		Paint_Category.click();
		
        Select VehicleType=new Select(Paint_Category);
		
		VehicleType.selectByValue("string:C1");
		
		warmup5();;
		
		Paint_SelectProductGroupIndication.click();
		
		Select ProductGropuIndication=new Select(Paint_SelectProductGroupIndication);
		
		ProductGropuIndication.selectByValue("string:D");
		
		warmup5();;
		
		PaintCode_text.click();
		
		PaintCode_text.sendKeys(RandomPaintCode);
		
		warmup5();;
		
		Paint_ModelSeries.click();
		
		Paint_ModelSeries.sendKeys(RandomPaintModelSeries);
		
		warmup5();;
		
		Paint_ModelDesignation.click();
		
		Paint_ModelDesignation.sendKeys(RandomAddModelDesignation);
		
		warmup5();;
		
		SpecialEquipment_Designation.click();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();;
		
		MasterDataManagement_ModalDialog.sendKeys("Created by MBRDI");
		
		warmup5();;
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();;
		
		Paint_SaveChanges.click();
		

		
		warmup5();;
		
		SpecialEquipment_SaveButton.click();
		

		try{
			//button[contains(@ng-show,'closeable')]
			warmup5();
			
			
			TechnicalError_Dialog.click();
		}catch(Exception e){
			
			System.out.println("Technical error is displayed");
		}
		
		warmup5();;
		
		try{
			
			warmup5();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("arguments[0].click();", Paint_lockbutton);
			
			Paint_lockbutton.click();
			
		}catch(Exception E){
			
			System.out.println("Lock button is present");
		}
		
		
		
	}
	
	public void InteriorEquipmentTab(){
		
		warmup5();;
		
		InteriorEquipment_AddCode.click();
		
		warmup5();;
		
        InteriorEquipment_SelectCategory.click();
		
        Select VehicleType=new Select(InteriorEquipment_SelectCategory);
		
		VehicleType.selectByValue("string:C1");
		
		warmup5();;
		
		InteriorEquipment_SelectProductGroupIndication.click();
		
		Select ProductGropuIndication=new Select(InteriorEquipment_SelectProductGroupIndication);
		
		ProductGropuIndication.selectByValue("string:D");
		
		warmup5();;
		
		InteriorEquipmentCode_text.click();
		
		InteriorEquipmentCode_text.sendKeys(RandomInteriorEquipmentCode);
		
		warmup5();;
		
		InteriorEquipment_ModelSeries.click();
		
		InteriorEquipment_ModelSeries.sendKeys(RandomInteriorEquipmentModelSeries);
		
		warmup5();;
		
		InteriorEquipment_ModelDesignation.click();
		
		InteriorEquipment_ModelDesignation.sendKeys(RandomInteriorEquipmentModelDesignation);
		
		warmup5();;
		
		SpecialEquipment_Designation.click();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys("Created by MBRDI");
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();
		
		InteriorEquipment_SaveChanges.click();
		

       warmup5();
		
		SpecialEquipment_SaveButton.click();
		
		
		
		try{
			//button[contains(@ng-show,'closeable')]
			warmup5();
			
			
			TechnicalError_Dialog.click();
		}catch(Exception e){
			
			System.out.println("Technical error is displayed");
		}
		
		try{
			
			warmup5();
			
			Paint_lockbutton.click();
			
		}catch(Exception E){
			
			System.out.println("Lock button is present");
		}
		
		try{
			
			warmup5();;
			
			SpecialEquipment_lockbutton.click();
		}catch(Exception E){
			
			System.out.println("Lock button is present");
		}
		
		try{
			
			warmup5();;
			
			Paint_lockbutton.click();
		}catch(Exception E){
			
			System.out.println("Lock button is present");
		}
		
		warmup5();;
		
		if(isAlertPresent()){
			
            System.out.println(isAlertPresent());
          Alert a=  driver.switchTo().alert();
          
          a.accept();

        }
		
		
		
		

		
		
	}
	
	
	protected boolean isAlertPresent() {
        try {
          driver.switchTo().alert();
          return true;
        } catch (NoAlertPresentException e) {
          return false;
        }
        
        
      }
	
	public void ProvisionCodeTab(){
		
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ProvisionCode));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		warmup5();
		
		js.executeScript("arguments[0].scrollIntoView();", ProvisionCode);
		
		js.executeScript("arguments[0].click();", ProvisionCode);
		
		ProvisionCode.click();
		
		warmup5();;
		
		if(isAlertPresent()){
			
            System.out.println(isAlertPresent());
          Alert a=  driver.switchTo().alert();
          
          a.accept();

        }
		
	//	SpecialEquipment_SaveButton.click();
		
		warmup5();
		
		js.executeScript("arguments[0].scrollIntoView();", ProvisionCode);
		
		js.executeScript("arguments[0].click();", ProvisionCode);
		
		warmup5();
		
		ProvisionCode_AddEntry.click();
		
		warmup5();
		
		ProvisionCode_ProductGroup.click();
		
		ProvisionCode_ProductGroup.sendKeys(RandomProvisionCode);
		
		warmup5();

		
		ProvisionCode_AdditionalCode.click();
		
		ProvisionCode_AdditionalCode.sendKeys(RandomProvisionAdditionalCode);
		
		warmup5();
		
		ProvisionCode_SaveChanges.click();
		
	    warmup5();
		
		SpecialEquipment_SaveButton.click();
		
		try{
			//button[contains(@ng-show,'closeable')]
			warmup5();
			
			
			TechnicalError_Dialog.click();
		}catch(Exception e){
			
			System.out.println("Technical error is displayed");
		}
		
		
	}
	
	public void VPDID_WriteAccess(){

		
		wait.until(ExpectedConditions.elementToBeClickable(VPDIDs_Tab));
		
		VPDIDs_Tab.click();
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		
		js.executeScript("arguments[0].click();", VPDIDs_ShowButton_Click);
		
		warmup1();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModule_CreateVPDID_Code));
		
		js.executeScript("arguments[0].click();", MasterDataModule_CreateVPDID_Code);
		
		
		wait.until(ExpectedConditions.visibilityOf(MasterDataModule_text));
		
		warmup5();
		
		MasterDataModule_text.sendKeys(RandomAddVPDCode);
		
		warmup5();
		
		MasterDataModule_Designation.click();
		
//		MasterDataModule_Designation.sendKeys("Designation created by MBRDI is" + RandomVPDIDsDesignation);
		
		warmup5();
		
		MasterDataModdule_DesignationText.click();
		
		warmup5();
		
		MasterDataModdule_DesignationText.sendKeys("Designation created by MBRDI is - " + VPDIDs_Designation);
		
		warmup5();
		
		MasterDataModule_ModalDialog_SaveButton.click();
		
		warmup5();
		
		
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModule_SaveCode));
		
		MasterDataModule_SaveCode.click();
		
		MasterDataModule_SaveCode_button.click();
		
		warmup4();
		
		
	}
	
	public void VehicleModelTab_WriteAccess(){
		
		warmup5();
		
		VehicleModelTab.click();
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.elementToBeClickable(VehicleModel_ManageVehileModel_button));
		
		js.executeScript("arguments[0].click();", VehicleModel_ManageVehileModel_button);
		
	//	VehicleModel_ManageVehileModel_button.click();
		
		warmup5();;
		
		
		
		js.executeScript("arguments[0].click();", VehicleModel_ManageVehileModel_ShowDataButton);
		
		VehicleModel_ManageVehileModel_ShowDataButton.click();
		
		warmup4();
		
		wait.until(ExpectedConditions.elementToBeClickable(VehicleModel_EditButton));
		
//		js.executeScript("arguments[0].click();", VehicleModel_EditButton);
		
		VehicleModel_EditButton.click();
		
//		js.executeScript("arguments[0].click();", VehicleModel_ManageVehileModel_ProductSeries);
//
//		
//	//	VehicleModel_ManageVehileModel_ProductSeries.click();
//		
//		VehicleModel_ManageVehileModel_ProductSeries.sendKeys(RandomAddCodeNumber);
//		
		warmup1();
//		
		warmup1();
		VehicleModel_ManageVehileModel_ProdSer.click();
		
		warmup6();
		
		VehicleModel_ManageVehileModel_ProdSer.clear();
		
		warmup5();
		
		VehicleModel_ManageVehileModel_ProdSer.sendKeys(VehicleCodeDesignation);
		
		warmup5();
		
		VehicleModel_ManageVehileModel_Brand.click();
		
		Select Brand=new Select(VehicleModel_ManageVehileModel_Brand);
		
		Brand.selectByValue("string:mitsu");
		
		warmup5();
		
		VehicleModel_ManageVehileModel_Category.click();
		
		Select Category=new Select(VehicleModel_ManageVehileModel_Category);
		
		Category.selectByValue("string:C6");

		
		warmup5();

		
		VehicleModel_ManageVehileModel_SaveChanges.click();
		
		warmup5();
		
		try{
			UnlockScroll.click();
		}catch(Exception e){
			
			System.out.println("Lock button is present");
		}
		
		
	//	VehicleModel_ManageVehileModel_SaveChanges.click();
		
		warmup5();
		
		VehicleModel_SaveButton.click();
		
		warmup4();
	
		
		}
	
	public void ControlUnitVPDIDTab_WriteAccess(){
		
		warmup5();
		
		ControlUnitVPDIDTab.click();
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", ControlUnitVPDIDTab_ShowDataButton);
		
		js.executeScript("arguments[0].click();", ControlUnitVPDIDTab_ShowDataButton);
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_AddEntryButton));
		
		warmup5();
		
		js.executeScript("arguments[0].click();", ControlUnit_AddEntryButton);
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_diogenesName));

		
		ControlUnit_diogenesName.click();
		
		warmup5();
		
		ControlUnit_diogenesName.sendKeys(ControlUnit_DiogenesName);
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ControlUnit_ShortDesignation));

		
		
		ControlUnit_ShortDesignation.click();
		
		ControlUnit_ShortDesignation.sendKeys(ControlUnit_DiogenesName);
		
		warmup5();
		
		ControlUnit_SCNVPDIdent.click();
		
		ControlUnit_SCNVPDIdent.sendKeys(ControlUnit_SCNVPDIdenta);
		
		warmup5();
		
		ControlUnit_SaveChanges.click();
		
		warmup5();
		
		try{
			
			ControlUnit_SaveButton.click();
		}catch(Exception e){
			
			System.out.println("Lock button is visible");
		}
		
		Control_SaveButton.click();
		
		warmup5();
		
		try{
			
			warmup5();
			
			ControlUnit_Dismiss_Message.click();
		}catch(Exception e){
			
			System.out.println("Dismissed the message");
		}
		
		try{
			
			ControlUnit_ExceptionDialog.click();
		}catch(Exception e){
			
			System.out.println("Exception dialog is displayed");
		}
		
		
		
	}
	
	public void ECU_Component_Aliases_Tab_WriteAccess(){
		
		warmup5();
		
		ECU_Component_Aliases_Tab.click();
		
		
	}
	
	public void ECU_Component_Aliases_CreateNewAlias_button(){
	
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_CreateNewAlias_button));
				
		js.executeScript("arguments[0].click();", ECU_Component_Aliases_CreateNewAlias_button);
		
	}
	
	
		public void ECU_Component_Aliases_AliasID_text(){
			
		warmup5();
		
		ECU_Component_Aliases_AliasID_text.click();
		
		ECU_Component_Aliases_AliasID_text.sendKeys(AliasID);
		
		}
		
		
		public void ECU_Component_Aliases_Tab_Designation(){
			
		warmup5();
		
		ECU_Component_Aliases_Tab_Designation.click();
		
		}
		
		
		public void ECU_MasterDataModdule_DesignationText(){
			
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_Designation));
		
		ECU_Component_Aliases_Tab_Designation.sendKeys(AliasID_Designation);
		
		warmup5();
		
		MasterDataModdule_DesignationText.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModdule_DesignationText));

		
		MasterDataModdule_DesignationText.sendKeys(AliasID_Designation);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		}
		
		public void ECU_Component_Aliases_Tab_UpdateChanges(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_UpdateChanges));

		
		ECU_Component_Aliases_Tab_UpdateChanges.click();
		
		try{
			
			warmup5();
			
			UnlockScroll.click();
		}catch(Exception e){
			
			System.out.println("Lock symbol is present");
		}
		}
		
		
		public void ECU_Component_Aliases_Tab_SaveButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(ECU_Component_Aliases_Tab_SaveButton));
		
		ECU_Component_Aliases_Tab_SaveButton.click();
		

		
		}
		
		public void ECU_Component_Aliases_Tab_FilterButton(){
			
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_FilterButton));
		
		ECU_Component_Aliases_Tab_FilterButton.click();
		
		}
		
		
		public void ECU_Component_Aliases_Tab_FilterButton_Text(){
			
		warmup5();
		
		ECU_Component_Aliases_Tab_FilterButton_Text.click();
		
		ECU_Component_Aliases_Tab_FilterButton_Text.sendKeys(AliasID);
		
		ECU_Component_Aliases_Tab_FilterButton_Text.sendKeys(Keys.ENTER);
		
		}
		
		
		public void ECU_Component_Aliases_Tab_ResetFilterButton(){
			
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_ResetFilterButton));
		
		ECU_Component_Aliases_Tab_ResetFilterButton.click();
		
		}
		
		public void ECU_Component_Aliases_CreateNewAlias_button_For2ndEntry(){
		
		warmup1();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_CreateNewAlias_button));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);

		
		js.executeScript("arguments[0].click();", ECU_Component_Aliases_CreateNewAlias_button);
		
		}
		
		public void ECU_Component_Aliases_AliasID_text_For2ndEntry(){
		
//		ECU_Component_Aliases_CreateNewAlias_button.click();
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", ECU_Component_Aliases_AliasID_text);
		
 //       ECU_Component_Aliases_AliasID_text.click();
        
        warmup5();
        
		
		ECU_Component_Aliases_AliasID_text.sendKeys(AliasID1);
		
		}
		
		
		public void ECU_Component_Aliases_Tab_Designation_For2ndEntry(){
			
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_Designation));
		
		ECU_Component_Aliases_Tab_Designation.click();
		
		warmup5();
		
		
//		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_Designation));
		
		
		MasterDataModdule_DesignationText.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModdule_DesignationText));

		
//		MasterDataModdule_DesignationText.sendKeys(RandomAliasID_Designation);
		
		MasterDataModdule_DesignationText.sendKeys(AliasID_Designation1);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		}
		
		public void ECU_MasterDataModdule_DesignationText_2ndEntry(){
		
		warmup5();
		
		MasterDataModdule_DesignationText.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModdule_DesignationText));

		
		MasterDataModdule_DesignationText.sendKeys(AliasID_Designation1);
		
		}
		
		public void ECU_Component_Aliases_Tab_FilterButton_For2ndEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_FilterButton));
		
		ECU_Component_Aliases_Tab_FilterButton.click();
		
		}
		
		public void ECU_Component_Aliases_Tab_FilterButton_Text_For2ndEntry(){
		
		warmup5();
		
		ECU_Component_Aliases_Tab_FilterButton_Text.click();
		
		ECU_Component_Aliases_Tab_FilterButton_Text.sendKeys(AliasID1);
		
		ECU_Component_Aliases_Tab_FilterButton_Text.sendKeys(Keys.ENTER);
		
        
        
		}
		
		public void ECU_Component_Aliases_Tab_Edit_AliasID(){
		
		warmup5();
        wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_Edit_AliasID));
        
        ECU_Component_Aliases_Tab_Edit_AliasID.click();
        
        warmup5();
  
        //Adding the code now
        
        ECU_Component_Aliases_Tab_Designation.click();
        
        warmup5();
        
       
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_Designation));
		
		ECU_Component_Aliases_Tab_Designation.sendKeys(AliasID_Designation1);
		
		warmup5();
		
		MasterDataModdule_DesignationText.click();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataModdule_DesignationText));
		
		warmup5();
		
		MasterDataModdule_DesignationText.clear();
		
		warmup5();

		
		MasterDataModdule_DesignationText.sendKeys(AliasID_Designation2);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_UpdateChanges));

		
		ECU_Component_Aliases_Tab_UpdateChanges.click();
		
//		try{
//			
//			warmup5();
//			
//			UnlockScroll.click();
//		}catch(Exception e){
//			
//			System.out.println("Lock symbol is present");
//		}
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_SaveButton));
		
		ECU_Component_Aliases_Tab_SaveButton.click();
		
        warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(ECU_Component_Aliases_Tab_ResetFilterButton));
		
		ECU_Component_Aliases_Tab_ResetFilterButton.click();
		

		
	}
	
	public void CUGroupTab(){
		
		warmup6();
				
		CUGroupTab.click();
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
	}
	
	public void CUGroupTab_AddEntry_Button(){
		
		warmup6();
		
		wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab_AddEntry_Button));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
						
		js.executeScript("arguments[0].click();", CUGroupTab_AddEntry_Button);
		
	}
	
	public void CUGroupTab_Identifier(){
		
		warmup6();
		
		wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab_Identifier));
		
		CUGroupTab_Identifier.click();
		
		CUGroupTab_Identifier.sendKeys(CUGroup_Identifier);
		
	}
	
	public void CUGroupTab_Designation(){
	
		warmup6();
		
		CUGroupTab_Designation.click();
		
		warmup5();
		
	}
	
	public void MasterDataManagement_ModalDialog_CUGroup(){
	
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(CUGroup_Designation);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();
		
		CUGroup_SaveChanges.click();
//		
//		try{
//			
//			warmup5();
//			
//			UnlockScroll.click();
//		}catch(Exception e){
//			
//			System.out.println("Lock symbol is present");
//		}
		
	}
	
	public void CUGroupTab__SaveButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab__SaveButton));
		
		CUGroupTab__SaveButton.click();
		
		
	}
	
	public void CUGroupTab__FilterButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(CUGroupTab__FilterButton));
		
		CUGroupTab__FilterButton.click();
		
		warmup1();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].scrollIntoView();", CodesTab);
        
        warmup1();
        
        wait.until(ExpectedConditions.visibilityOf(CUGroupTab__FilterButton_text));
        
        CUGroupTab__FilterButton_text.click();
        
        CUGroupTab__FilterButton_text.sendKeys(CUGroup_Identifier);
        
        CUGroupTab__FilterButton_text.sendKeys(Keys.ENTER);
        
	}
	
	public void CUGroupTab__CancelFilterButton(){
        
        warmup5();
        
        CUGroupTab__CancelFilterButton.click();
        
	}
        
        // Add second Identifier code
	
	public void CUGroupTab_AddEntry_Button_2ndEntry(){
        
		warmup1();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].scrollIntoView();", CodesTab);
        
        wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab_AddEntry_Button));
								
		js.executeScript("arguments[0].click();", CUGroupTab_AddEntry_Button);
		
		CUGroupTab_AddEntry_Button.click();
		
	}
	
	public void CUGroupTab_Identifier_For2ndEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab_Identifier));
		
		CUGroupTab_Identifier.click();
		
		CUGroupTab_Identifier.sendKeys(CUGroup_Identifier1);
		
	}
	
	public void MasterDataManagement_ModalDialog_CUGroup_2ndEnrty(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.clear();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(CUGroup_Designation1);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();
		
		CUGroup_SaveChanges.click();
		
//		try{
//			
//			warmup5();
//			
//			UnlockScroll.click();
//		}catch(Exception e){
//			
//			System.out.println("Lock symbol is present");
//		}
		
	}
	
public void MasterDataManagement_ModalDialog_CUGroup_3rdEnrty(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.clear();
		
		MasterDataManagement_ModalDialog.sendKeys("Created By MBRDI");
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		warmup5();
		
		CUGroup_SaveChanges.click();
		
		try{
			
			warmup5();
			
			UnlockScroll.click();
		}catch(Exception e){
			
			System.out.println("Lock symbol is present");
		}
		
	}
		
	public void CUGroupTab_SaveButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab__SaveButton));
		
		CUGroupTab__SaveButton.click();
		
		try{
			//button[contains(@ng-show,'closeable')]
			
			TechnicalError_Dialog.click();
			
		}catch(Exception e){
			
			System.out.println("Technical error is not displayed");
		}
		
	}
		
	
	public void CUGroupTab__FilterButton_2ndEntry(){
		
		warmup1();
		
		CUGroupTab__FilterButton.click();
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
        js.executeScript("arguments[0].scrollIntoView();", CodesTab);
        
        warmup5();
        
        wait.until(ExpectedConditions.elementToBeClickable(CUGroupTab__FilterButton_text));
        
        CUGroupTab__FilterButton_text.click();
        
        CUGroupTab__FilterButton_text.sendKeys(CUGroup_Identifier1);
        
        CUGroupTab__FilterButton_text.sendKeys(Keys.ENTER);
        
	}
	
	public void CUGroup_DeleteIdentifier(){
        
        warmup5();
        
        CUGroup_DeleteIdentifier.click();
        
        warmup5();
        
        CUGroupTab__SaveButton.click();
        
        warmup5();
        
        CUGroupTab__CancelFilterButton.click();
        
		
	}
	
	public void Electrical_Variants_Tab_click(){
		
		warmup5();
		 Actions actions = new Actions(driver);
		 actions.moveToElement(VehicleModelTab).build().perform();
		Electrical_Variants_Tab.click();
	}
	
	public void Electrical_Variants_Tab_AddElectroVariantbutton(){
		
		warmup1();
		warmup1();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.visibilityOf(Electrical_Variants_Tab_AddElectroVariantbutton));

		
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		warmup5();
		
		js.executeScript("arguments[0].click();", Electrical_Variants_Tab_AddElectroVariantbutton);
		
		
	}
	
	public void Electrical_Variants_Tab_ElectroVariantPrefix(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Tab_ElectroVariantPrefix));
		
		Electrical_Variants_Tab_ElectroVariantPrefix.click();
		
		Electrical_Variants_Tab_ElectroVariantPrefix.sendKeys(ElectricalVariantPrefix);
		
		Electrical_Variants_Tab_ElectroVariantPrefix.sendKeys(ElectricalVariantPrefix1);
		
		
	}
	
	public void Electrical_Variants_Tab_Designation(){
		
		warmup5();
		
		Electrical_Variants_Tab_Designation.click();
	}
	
	public void ModalDialog_ElectricalVariant(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(ElectricalVariant_Designation);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		
	}
	
	public void Electrical_Variants_Tab_SaveChanges(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Tab_SaveChanges));
		
		Electrical_Variants_Tab_SaveChanges.click();
	}
	
	public void Electrical_Variants_Savebutton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Savebutton));

		
		Electrical_Variants_Savebutton.click();
		
		warmup1();
		

	}
	
	public void Electrical_Variants_Filterbutton(){
		
		warmup5();
		
		Electrical_Variants_Filterbutton.click();
		
		
	}
	
	public void Electrical_Variants_Filterbutton_text(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Filterbutton_text));
				
		Electrical_Variants_Filterbutton_text.click();
		
		Electrical_Variants_Filterbutton_text.sendKeys(ElectricalVariantPrefix + ElectricalVariantPrefix1);
		
		Electrical_Variants_Filterbutton_text.sendKeys(Keys.ENTER);
		
		warmup5();
	}
	
	public void Electrical_Variants_CancelFilterbutton(){
		
		warmup5();
		
		Electrical_Variants_CancelFilterbutton.click();
	}
	
	
public void Electrical_Variants_Tab_ElectroVariantPrefix_For2ndEtry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Tab_ElectroVariantPrefix));
		
		Electrical_Variants_Tab_ElectroVariantPrefix.click();
		
		Electrical_Variants_Tab_ElectroVariantPrefix.sendKeys(ElectricalVariantPrefix_For2ndEntry);
		
		Electrical_Variants_Tab_ElectroVariantPrefix.sendKeys(ElectricalVariantPrefix1_For2ndEntry);
		
		
	}
	
	public void Electrical_Variants_Tab_Designation_For2ndEntry(){
		
		warmup5();
		
		Electrical_Variants_Tab_Designation.click();
	}
	
	public void ModalDialog_ElectricalVariant_For2ndEntry(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(ElectricalVariant_Designation_For2ndEntry);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		
	}
	
	public void ModalDialog_ElectricalVariant_For3rdEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(MasterDataManagement_ModalDialog));
		
		MasterDataManagement_ModalDialog.click();
		
		MasterDataManagement_ModalDialog.clear();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys("Created by MBRDI");
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		
	}
	
	public void Electrical_Variants_Filterbutton_text_For2ndEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_Filterbutton_text));
		
		Electrical_Variants_Filterbutton_text.click();
		
		Electrical_Variants_Filterbutton_text.sendKeys(ElectricalVariantPrefix_For2ndEntry + ElectricalVariantPrefix1_For2ndEntry);
		
		Electrical_Variants_Filterbutton_text.sendKeys(Keys.ENTER);
		
		warmup5();
	}
	
	public void Electrical_Variants_DeleteEntry(){
		
		warmup1();
		
		wait.until(ExpectedConditions.elementToBeClickable(Electrical_Variants_DeleteEntry));
		
		Electrical_Variants_DeleteEntry.click();
	}
	
	public void TransmissionModal_Tab(){
		
		warmup5();;
		 Actions actions = new Actions(driver);
		 actions.moveToElement(VehicleModelTab).build().perform();
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab));
		TransmissionModal_Tab.click();
	}
	
	public void TransmissionModal_Tab_SearchButton(){
		
		warmup1();
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_SearchButton));
		
		TransmissionModal_Tab_SearchButton.click();
	}
	
	public void TransmissionModal_Tab_AddButton(){
		
		warmup5();;
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_AddButton));

		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		js.executeScript("arguments[0].click();", TransmissionModal_Tab_AddButton);
		
//		TransmissionModal_Tab_AddButton.click();
		
	}
	
	public void TransmissionModal_Tab_TransmissionObjectNumber(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TransmissionObjectNumber));
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TransmissionObjectNumber));
		
		warmup5();;
		
		js.executeScript("arguments[0].click();", TransmissionModal_Tab_TransmissionObjectNumber);
		
//		TransmissionModal_Tab_TransmissionObjectNumber.click();
		
		TransmissionModal_Tab_TransmissionObjectNumber.sendKeys(TransmissionModal_Add);
	}
	
	public void TransmissionModal_Tab_TranmissionModal(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TranmissionModal));

		
		TransmissionModal_Tab_TranmissionModal.click();
		
		TransmissionModal_Tab_TranmissionModal.sendKeys(TransmissionModal);
	}
	

	
	public void TransmissionModal_Tab_SaveChanges(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_SaveChanges));

		
		TransmissionModal_Tab_SaveChanges.click();
	}
	
	public void TransmissionModal_Tab_SaveButton(){
		
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_SaveButton));

		TransmissionModal_Tab_SaveButton.click();
		warmup5();;
	
		
	}
	
	public void TransmissionModal_Tab_FilterButton(){
		warmup5();;
		
      JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_FilterButton));
		
		warmup1();
		
		js.executeScript("arguments[0].click();", TransmissionModal_Tab_FilterButton);
		
		
	}
	
	public void TransmissionModal_Tab_Filtertext(){
		
		warmup5();;
		
		TransmissionModal_Tab_Filtertext.click();
		
		TransmissionModal_Tab_Filtertext.sendKeys(TransmissionModal_Add);
		TransmissionModal_Tab_Filtertext.sendKeys(Keys.ENTER);
		
		
	}
	
	public void TransmissionModal_Tab_TransmissionObjectNumber_For2ndEntry(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TransmissionObjectNumber));
		
        JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", CodesTab);
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TransmissionObjectNumber));
		
		warmup5();
		
		js.executeScript("arguments[0].click();", TransmissionModal_Tab_TransmissionObjectNumber);
		
//		TransmissionModal_Tab_TransmissionObjectNumber.click();
		
		TransmissionModal_Tab_TransmissionObjectNumber.sendKeys(TransmissionModal_Add2ndEntry);
	}
	
	public void TransmissionModal_Tab_TranmissionModal_For2ndEntry(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TranmissionModal));

		
		TransmissionModal_Tab_TranmissionModal.click();
		
		TransmissionModal_Tab_TranmissionModal.sendKeys(TransmissionModal_2ndEntry);
	}
	
	public void TransmissionModal_Tab_Filtertext_For2ndEntry(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_Filtertext));
		
		TransmissionModal_Tab_Filtertext.click();
		
		TransmissionModal_Tab_Filtertext.sendKeys(TransmissionModal_Add);
		TransmissionModal_Tab_Filtertext.sendKeys(Keys.ENTER);
	}
	
	public void TransmissionModal_EditButton(){
		
		warmup1();
		warmup1();

		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_EditButton));
		
		TransmissionModal_EditButton.click();
	}
	
	public void TransmissionModal_Tab_TranmissionModal_For3rdEntry(){
		
		warmup5();;
		
		wait.until(ExpectedConditions.elementToBeClickable(TransmissionModal_Tab_TranmissionModal));

		
		TransmissionModal_Tab_TranmissionModal.click();
		
		TransmissionModal_Tab_TranmissionModal.clear();
		
		TransmissionModal_Tab_TranmissionModal.sendKeys(TransmissionModal_3rdEntry);
	
}
	
	public void WLTP_VectoTab(){
		
		warmup5();;
		
		Actions a=new Actions(driver);
		
		a.moveToElement(CUGroupTab).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(WLTP_VectoTab));
		
		WLTP_VectoTab.click();
	}
	
	
	public void WLTP_VectoTab_AddLabel_Button(){
		
		warmup5();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", BodiesTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(WLTP_VectoTab_AddLabel_Button));
		
		js.executeScript("arguments[0].scrollIntoView();", WLTP_VectoTab_AddLabel_Button);
		js.executeScript("arguments[0].click();", WLTP_VectoTab_AddLabel_Button);
		
//		WLTP_VectoTab_AddLabel_Button.click();
	}
	
	public void WLTP_VectoTab_AddLabel_ID(){
		
		warmup5();;
		

			
		wait.until(ExpectedConditions.visibilityOf(WLTP_VectoTab_AddLabel_ID));
		
		WLTP_VectoTab_AddLabel_ID.click();
		
		WLTP_VectoTab_AddLabel_ID.sendKeys(WLTP_VECTO_ID);
	}
	
	public void WLTP_VectoTab_Designation(){
		
		warmup5();
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(WLTP_VectoTab_Designation));

		WLTP_VectoTab_Designation.click();
	}
	
	public void ModalDialog_WLTP_VECTO(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(WLTP_VECTO_Designation);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
		
	}
	
	public void WLTP_VectoTab_SaveChanges(){
		
		warmup5();
		
		WLTP_VectoTab_SaveChanges.click();
	}
	
	public void WLTP_VectoTab_SaveButton(){
		
		warmup5();
		
		WLTP_VectoTab_SaveButton.click();
		warmup1();
		
		
	}
	
	public void WLTP_VectoTab_FilterButton(){
		
		warmup5();
		
		WLTP_VectoTab_FilterButton.click();
	}
	
	public void WLTP_VectoTab_Filter_text(){
		
		warmup5();
		WLTP_VectoTab_Filter_text.click();
		WLTP_VectoTab_Filter_text.sendKeys(WLTP_VECTO_ID);
		WLTP_VectoTab_Filter_text.sendKeys(Keys.ENTER);

	}
	
	public void WLTP_VectoTab_CancelFilterButton(){
		
		warmup5();
		
		WLTP_VectoTab_CancelFilterButton.click();
	}
	
	public void WLTP_VectoTab_AddLabel_ID_For2ndEntry(){
		
		warmup5();
			
		wait.until(ExpectedConditions.visibilityOf(WLTP_VectoTab_AddLabel_ID));
		
		WLTP_VectoTab_AddLabel_ID.click();
		
		WLTP_VectoTab_AddLabel_ID.sendKeys(WLTP_VECTO_ID_For2ndEntry);
	}
	
	
	public void ModalDialog_WLTP_VECTO_For2ndEntry(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(WLTP_VECTO_Designation_For2ndEntry);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
	}
	
	public void ModalDialog_WLTP_VECTO_For3rdEntry(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys("Created by MBRDI");
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
	}
	
	public void WLTP_VectoTab_Filter_text_For2ndEntry(){
		
		warmup5();
		WLTP_VectoTab_Filter_text.click();
		WLTP_VectoTab_Filter_text.sendKeys(WLTP_VECTO_ID_For2ndEntry);
		WLTP_VectoTab_Filter_text.sendKeys(Keys.ENTER);
		


	}
	
	public void WLTP_VectoTab_Delete2ndEntry(){
		
		warmup5();
		
		WLTP_VectoTab_Delete2ndEntry.click();
		
		warmup1();
	}
	
	public void LabelDataTab_WriteAccess(){
		
		warmup5();
		
		 Actions actions = new Actions(driver);
		 actions.moveToElement(VehicleModelTab).build().perform();
		
		wait.until(ExpectedConditions.visibilityOf(LabelDataTab));
		
		LabelDataTab.click();
	}
	
	
	public void LabelData_FilterButton(){
		
		warmup5();


		wait.until(ExpectedConditions.elementToBeClickable(LabelData_FilterButton));
//		js.executeScript("arguments[0].click();", LabelData_FilterButton);
		
		LabelData_FilterButton.click();
		
	}
	
	public void LabelData_Key(){
		
		warmup5();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		warmup5();
		
		js.executeScript("arguments[0].scrollIntoView();", BodiesTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_Key));
		
		js.executeScript("arguments[0].click();", LabelData_Key);
		
		
		LabelData_Key.click();
		
		LabelData_Key.sendKeys(LabelData_Keya);
		
		
	}
	
	public void LabelData_Designation(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_Designation));
		
		LabelData_Designation.click();
	}
	
	public void ModalDialog_LabelData(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(LabelData_Designationa);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
	}
	
	public void LabelData_SaveChangesButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(LabelData_SaveChangesButton));
		
		LabelData_SaveChangesButton.click();
	}
	
	public void LabelData_SaveButton(){
		
		warmup5();
		
		wait.until(ExpectedConditions.visibilityOf(LabelData_SaveButton));
		
		LabelData_SaveButton.click();
		
		warmup1();
	}
	
	public void LabelData_FilterText(){
		
		warmup5();
				
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_FilterText));

		
		LabelData_FilterText.click();
		
		LabelData_FilterText.sendKeys(LabelData_Keya);
		
		LabelData_FilterText.sendKeys(Keys.ENTER);
		
		
		
		
	}
	
	public void LabelData_KeyButton(){
		
		warmup5();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		warmup5();
		
		js.executeScript("arguments[0].scrollIntoView();", BodiesTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_KeyButton));
		
		js.executeScript("arguments[0].click();", LabelData_KeyButton);
		
	//	LabelData_KeyButton.click();
	}
	
	
	public void LabelData_Key_For2ndEntry(){
		
		warmup5();
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		warmup5();
		
		js.executeScript("arguments[0].scrollIntoView();", BodiesTab);
		
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_Key));
		
		js.executeScript("arguments[0].click();", LabelData_Key);
		
		
		LabelData_Key.click();
		
		LabelData_Key.sendKeys(LabelData_Key_2ndEntry);
		
		
	}
	
	public void ModalDialog_LabelData_For2ndEntry(){
		
		warmup5();
		
		MasterDataManagement_ModalDialog.click();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys(LabelData_Designation_For2ndEntry);
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
	}
	
	public void LabelData_FilterText_For2ndEntry(){
		
		warmup5();
				
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_FilterText));

		
		LabelData_FilterText.click();
		
		LabelData_FilterText.sendKeys(LabelData_Key_2ndEntry);
		
		LabelData_FilterText.sendKeys(Keys.ENTER);
		
		
	}
	
	public void LabelData_DeleteEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(LabelData_DeleteEntry));
		
		LabelData_DeleteEntry.click();
		
		
	}
	
	public void ModalDialog_LabelData_For3rdEntry(){
		
		warmup5();
		
		wait.until(ExpectedConditions.elementToBeClickable(MasterDataManagement_ModalDialog));
		
		MasterDataManagement_ModalDialog.click();
		
		MasterDataManagement_ModalDialog.clear();
		
		warmup5();
		
		MasterDataManagement_ModalDialog.sendKeys("Created By MBRDI");
		
		warmup5();
		
		MasterDataManagement_SaveButton.click();
		
	}
	
	public void showButton(){
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(showButton));
		showButton.click();
	}
	
	public String SpecialEquipmentCodeTable_Contents(){
		
		String SpecialEquipmentCodeTable = null;
		for (WebElement SpecialEquipmentCodeTable_Contentss : SpecialEquipmentCodeTable_Contents){
			
		 SpecialEquipmentCodeTable=	SpecialEquipmentCodeTable_Contentss.getText();
			
		}
		
		return SpecialEquipmentCodeTable;
	}
	
	public void SpecialEquipment_FilterButton(){
		warmup5();
		SpecialEquipment_FilterButton.click();
	}
	
	public void SpecialEquipment_serachDesignation(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(SpecialEquipment_serachText));
		
		SpecialEquipment_serachText.sendKeys("018");
		
		SpecialEquipment_serachText.sendKeys(Keys.ENTER);
		
		
		warmup1();
	}
	
	public void ProductGroup_Select(){
		
		Select s=new Select(Dropdown_list);
		s.selectByValue("string:F");
	}
	
	public void SpecialEquipment_serachText(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(SpecialEquipment_serachText));
		
		SpecialEquipment_serachText.sendKeys("450302");
		
		SpecialEquipment_serachText.sendKeys(Keys.ENTER);
		
		
		warmup1();
	}
	
	public boolean SpecialEquipment_AddCodeButton(){
		
		boolean AddCode_button=SpecialEquipment_AddCodeButton.isDisplayed();
		return AddCode_button;
	}
	
	public boolean BatchProcessingButton(){
		
		boolean BatchProcessing_button=	BatchProcessingButton.isDisplayed();
		return BatchProcessing_button;
	}
	
	// SWEDHA
	
	public void codesTab(){
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		codesTab.click();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
	}
	
	public void codesTab_SpecialEquipment_AddCode(){
		wait.until(ExpectedConditions.visibilityOf(codesTab_SpecialEquipment_AddCode));
		codesTab_SpecialEquipment_AddCode.click();
		warmup();
	}
	
	public void codesTab_AddSpecialEquipment_Category(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_SpecialEquipment_Category));
		Select s=new Select(codesTab_SpecialEquipment_Category);
		s.selectByValue("string:C1");
	}
	
	public void codesTab_AddSpecialEquipment_Pg(){
		Select s=new Select(codesTab_SpecialEquipment_Pg);
		s.selectByValue("string:D");
	}
	
	public void codesTab_SpecialEquipment_Code(){
		codesTab_SpecialEquipment_Code.sendKeys("000L");
	}
	
	public void codesTab_ModelSeries(){
		codesTab_ModelSeries.sendKeys("1A");
	}
	
	public void codesTab_SpecialEquipment_ValidFrom(){
		codesTab_SpecialEquipment_ValidFrom.sendKeys("04/08/2022");
	}
	
	public void codesTab_ValidUntil(){
		codesTab_SpecialEquipment_ValidUntil.sendKeys("04/04/2055");
	}

	public void codesTab_AuthorizationCategory(){
		Select s=new Select(codesTab_SpecialEquipment_AuthorizationCategory);
		s.selectByValue("string:standard");
	}
	
	public void codesTab_ProductGroup(){
		wait.until(ExpectedConditions.visibilityOf(codesTab_ProductGroup));
		Select s=new Select(codesTab_ProductGroup);
		s.selectByValue("string:T");
	}
	
	public void codesTab_ShowButton(){
		warmup4();
		wait.until(ExpectedConditions.visibilityOf(codesTab_ShowButton));
		codesTab_ShowButton.click();
		warmup4();
	}
	
	public void codesTab_CreateSpecialEquipment_Designation(){
		codesTab_Pencil.click();
		codesTab_English.sendKeys("Add code (Special Equipment)");
		codesTab_Apply.click();
		}
	
	public void codesTab_modelDesignation(){
		codesTab_modelDesignation.sendKeys("11");
		}
	
	public void codesTab_Checkmark(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_Checkmark));
		codesTab_Checkmark.click();
		}
	
	public void codesTab_Save(){
		codesTab_Save.click();
		//warmup5();
		warmup1();
		}
	
	public void codesTab_SpecialEquipmentFilter(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_SpecialEquipmentFilter));
		codesTab_SpecialEquipmentFilter.click();
		}
	
	public void codesTab_CreateSpecialEquipment_Search(){
		codesTab_Search.sendKeys("Add code (Special Equipment)");
		codesTab_Search.sendKeys(Keys.ENTER);
		warmup5();
		}
	
	public void codesTab_EditSpecialEquipment(){
		codesTab_EditSpecialEquipment.click();
		}
	
	public void codesTab_EditSpecialEquipment_Category(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_SpecialEquipment_Category));
		Select s=new Select(codesTab_SpecialEquipment_Category);
		s.selectByValue("string:C6");
	}
	
	public void codesTab_EditSpecialEquipment_Pg(){
		Select s=new Select(codesTab_SpecialEquipment_Pg);
		s.selectByValue("string:C6");
	}
	
	
	public void codesTab_EditSpecialEquipment_AuthorizationCategory(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_SpecialEquipment_AuthorizationCategory));
		Select s=new Select(codesTab_SpecialEquipment_AuthorizationCategory);
		s.selectByValue("string:safetyRelevant");
	}

	public void codesTab_EditSpecialEquipment_Search(){
		codesTab_Search.clear();
		codesTab_Search.sendKeys("Edit code (Special Equipment)");
		codesTab_Search.sendKeys(Keys.ENTER);
		warmup5();
		}
	
	public void codesTab_SpecialEquipment_Delete(){
		warmup();   
		codesTab_SpecialEquipment_Delete.click();
		 warmup();  
		}
	
	public void codesTab_EditSpecialEquipment_Designation(){
		codesTab_Pencil.click();
		codesTab_English.clear();
		codesTab_English.sendKeys("Edit code (Special Equipment)");
		codesTab_Apply.click();
		}
	
	public Boolean codesTab_SpecialEquipment_filteredResult(){
		warmup6();
		return codesTab_SpecialEquipment_filteredResult.isDisplayed();
	}
	
	public void codesTab_Paint_AddCode(){
		codesTab_Paint_AddCode.click();
		}
	
	public void codesTab_AddPaint_Category(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_Paint_Category));
		Select s=new Select(codesTab_Paint_Category);
		s.selectByValue("string:C1");
	}
	
	public void codesTab_AddPaint_Pg(){
		Select s=new Select(codesTab_Paint_Pg);
		s.selectByValue("string:D");
	}
	
	public void codesTab_AddPaint_Code(){
		codesTab_Paint_Code.sendKeys("000L");
	}
	
	public void codesTab_AddPaint_Kbacolor(){
//		codesTab_Paint_Kbacolor.clear();
//		codesTab_Paint_Kbacolor.sendKeys("1");
		Select s=new Select(codesTab_Paint_Kbacolor);
		s.selectByValue("string:1");
	}
	
	public void codesTab_AddPaint_Designation(){
		codesTab_Pencil.click();
		codesTab_English.clear();
		codesTab_English.sendKeys("Add code (Paint)");
		codesTab_Apply.click();
		}
	
	public void codesTab_AddPaint_Usage(){
		Select s=new Select(codesTab_Paint_Usage);
		s.selectByValue("string:paint1");
	}
	
	public void codesTab_Paint_Filter(){
		codesTab_Paint_Filter.click();
		}

	public void codesTab_AddPaint_Search(){
		codesTab_Search.sendKeys("Add code (Paint)");
		codesTab_Search.sendKeys(Keys.ENTER);
		warmup5();
		}
	
	public void codesTab_EditPaint_Button(){
		codesTab_EditPaint_Button.click();
		}
	
	public void codesTab_Code_Search(){
		codesTab_Code_Search.clear();
		codesTab_Code_Search.sendKeys("000L");
		codesTab_Code_Search.sendKeys(Keys.ENTER);
		warmup1();
		}
	
	public void codesTab_EditPaint_Category(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_Paint_Category));
		Select s=new Select(codesTab_Paint_Category);
		s.selectByValue("string:C3");
	}
	
	public void codesTab_EditPaint_Pg(){
		Select s=new Select(codesTab_Paint_Pg);
		s.selectByValue("string:I");
		warmup5();
	}
	
	public void codesTab_EditPaint_Kbacolor(){
		warmup5();
		Select s=new Select(codesTab_Paint_Kbacolor);
		s.selectByValue("string:3");
	}
	
	public void codesTab_EditPaint_Designation(){
		codesTab_Pencil.click();
		codesTab_English.clear();
		codesTab_English.sendKeys("Edit code (Paint)");
		codesTab_Apply.click();
		}
	
	public void codesTab_EditPaint_Usage(){
		Select s=new Select(codesTab_Paint_Usage);
		s.selectByValue("string:paint2");
	}
	
	public void codesTab_Paint_Delete(){
		codesTab_Paint_Delete.click();
		}
	
	public Boolean codesTab_Paint_filteredResult(){
		warmup6();
		return codesTab_Paint_filteredResult.isDisplayed();
	}
	
	public void codesTab_InteriorEquipment_AddCode(){
		codesTab_InteriorEquipment_AddCode.click();
		}
	
	public void codesTab_AddInteriorEquipment_Category(){
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_InteriorEquipment_Category));
		Select s=new Select(codesTab_InteriorEquipment_Category);
		s.selectByValue("string:C0");
	}
	
	public void codesTab_AddInteriorEquipment_Pg(){
		Select s=new Select(codesTab_InteriorEquipment_Pg);
		s.selectByValue("string:D");
	}
	
	public void codesTab_AddInteriorEquipment_Code(){
		codesTab_InteriorEquipment_Code.sendKeys("000L");
	}
	
	public void codesTab_AddInteriorEquipment_Designation(){
		codesTab_Pencil.click();
		codesTab_English.clear();
		codesTab_English.sendKeys("Add code (Interior Equipment)");
		codesTab_Apply.click();
		}
	
	public void codesTab_EditInteriorEquipment_Button(){
		codesTab_EditInteriorEquipment_Button.click();
		}
	
	public void codesTab_EditInteriorEquipment_Category(){
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_InteriorEquipment_Category));
		Select s=new Select(codesTab_InteriorEquipment_Category);
		s.selectByValue("string:C6");
	}
	
	public void codesTab_EditInteriorEquipment_Pg(){
		Select s=new Select(codesTab_InteriorEquipment_Pg);
		s.selectByValue("string:H");
	}
	
	public void codesTab_EditInteriorEquipment_Designation(){
		codesTab_Pencil.click();
		codesTab_English.clear();
		codesTab_English.sendKeys("Edit code (Interior Equipment)");
		codesTab_Apply.click();
		}
	
	public void codesTab_InteriorEquipment_Filter(){
		codesTab_InteriorEquipment_Filter.click();
		}
	
	public void codesTab_InteriorEquipment_Delete(){
		codesTab_InteriorEquipment_Delete.click();
		}
	
	public Boolean codesTab_InteriorEquipment_filteredResult(){
		warmup6();
		return codesTab_InteriorEquipment_filteredResult.isDisplayed();
	}
	
	public String codesTab_SpecialEquipment_Result(){
		String filteredResult = codesTab_SpecialEquipment_filteredResult.getText();
		return filteredResult;

	}
	
	public String codesTab_Paint_Result(){
		String filteredResult = codesTab_Paint_filteredResult.getText();
		return filteredResult;
	}
	
	public String codesTab_InteriorEquipment_Result(){
		String filteredResult = codesTab_InteriorEquipment_filteredResult.getText();
		return filteredResult;
	}
	public void codesTab_ProvisionCodeTab(){
		warmup5();
		//warmup5();
		//wait.until(ExpectedConditions.elementToBeClickable(codesTab_ProvisionCodeTab));
		codesTab_ProvisionCodeTab.click();
		warmup6();
		}
	public void codesTab_ProvisionCodeAddEntryButton(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_ProvisionCodeAddEntryButton));
		codesTab_ProvisionCodeAddEntryButton.click();

		}
	public void codesTab_ProvisionCodeAddEntry(){
		codesTab_ProvisionCodeTab.click();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_ProvisionCodeDataCardCodeInput));
		codesTab_ProvisionCodeDataCardCodeInput.sendKeys("12345");
		codesTab_ProvisionCodeInput.sendKeys("12345");
		warmup5();
		codesTab_ProvisionCodeSubmit.click();
		warmup5();
		codesTab_ProvisionCodeSave.click();
		}
	public void codesTab_ProvisionCodeEdit(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_ProvisionCodeEdit));
		codesTab_ProvisionCodeEdit.click();
		warmup5();
		Select dropdown =new Select(driver.findElement(By.name("additionalCodeMapping_productGroupOfAdditionalCode")));
		dropdown.selectByIndex(3);
		warmup5();
		codesTab_ProvisionCodeSubmit.click();
		warmup5();
		codesTab_ProvisionCodeSave.click();
		}
	public void codesTab_ProvisionCodeDelete(){
		warmup5();
		wait.until(ExpectedConditions.elementToBeClickable(codesTab_ProvisionCodeDelete));
		codesTab_ProvisionCodeDelete.click();
		warmup5();
		codesTab_ProvisionCodeSave.click();
		warmup5();
		}
	


	public void batteryFlexibleTab()
	{
	       
	       WebElement ele = driver.findElement(By.xpath("//li[contains(@data-ng-show,'viewControl.MasterDataSaa_725.visible')]"));

	       //Creating object of an Actions class
	       Actions action = new Actions(driver);

	       //Performing the mouse hover action on the target element.
	       action.moveToElement(ele).perform();
	       warmup5();
	wait.until(ExpectedConditions.elementToBeClickable(batteryFlexibleTab));
	       System.out.println("find tab");
	warmup5();
	       batteryFlexibleTab.click();
	       System.out.println("clicked tab");
	       
	}

	public void addEntryClickBatteryFlexible()
	{
	       warmup5();
	       addEntryBatteryFlexible.click();
	       warmup5();
	}

	public void enterKeyBatteryFlexible()
	{
	       warmup5();
	       keyBatteryFlexible.sendKeys("2");
	       warmup5();
	}

	public void enterDesignationBatteryFlexible()
	{
	       warmup5();
	       editDesignationBatteryFlexible.click();
	             warmup5();
	             englishDesignationBatteryFlexible.click();
	              englishDesignationBatteryFlexible.sendKeys("English");
	             applyBatteryFlexible.click();
	             warmup5();
	             
	             
	}
	public void changeLanguageToGerman()
	{
	       warmup5();
	       languageSelectionBatteryFlexible.click();
	       warmup5();

	       germanLanguageSelectionBatteryFlexible.click();
	       warmup5();
	       applyLanguageSelectionBatteryFlexible.click();
	       warmup5();
	       
	}
	public void changeLanguageToEnglish()
	{
	       warmup5();
	       languageSelectionBatteryFlexible.click();
	       warmup5();

	       englishLanguageSelectionBatteryFlexible.click();
	       warmup5();
	       
	       applyGermanLanguageSelectionBatteryFlexible.click();
	       warmup5();
	       
	}
	public String confirmDesignationChangeBatteryFlexible()
	{
	       String Designation =germanLanguageSelectedBatteryFlexible.getText();
	       return Designation;
	}

	public void checkButtonBatteryFlexible()
	{
	       checkBatteryFlexible.click();
	       warmup5();
	}
	public void saveButtonBatteryFlexible()
	{
	       saveBatteryFlexible.click();
	       warmup5();
	}
	public void saveGermanButtonBatteryFlexible()
	{
	saveGermanBatteryFlexible.click();
	warmup5();
	}
	public void updateDesignation()
	{
	       editBatteryFlexible.click();
	       warmup5();
	       editDesignationBatteryFlexible.click();
	       warmup5();
	       germanDesignationBatteryFlexible.clear();
	       germanDesignationBatteryFlexible.sendKeys("German");
	       warmup5();
	       applyBatteryFlexible.click();
	       warmup5();
	       
	}
	public void deleteEntryBatteryFlexible()
	{
	       warmup5();
	       warmup5();
	deleteBatteryFlexible.click();
	System.out.println("first delete");
	warmup5();

	}
	
	public void vehicleModel()
	{
		vehicleModel.click();
		warmup5();
	}
	
	public void vehicleModel_ManageVehicleModel()
	{
		vehicleModel_ManageVehicleModel.click();
	}
	
	public void manageVehicleModel_ShowData()
	{
		manageVehicleModel_ShowData.click();
		warmup1();
		warmup1();
	}
	
	public void manageVehicleModel_ModelSeriesFilterButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(manageVehicleModel_ModelSeriesFilterButton));
		manageVehicleModel_ModelSeriesFilterButton.click();
	}
	
	public void manageVehicleModel_Edit()
	{
		wait.until(ExpectedConditions.visibilityOf(manageVehicleModel_Edit));
		manageVehicleModel_Edit.click();
	}
	
	public void manageVehicleModel_SearchTheTable(){
		manageVehicleModel_SearchTheTable.sendKeys("930");
		manageVehicleModel_SearchTheTable.sendKeys(Keys.ENTER);
		warmup5();
		}
	
	public void manageVehicleModel_AddModelSeriesButton(){
		wait.until(ExpectedConditions.elementToBeClickable(manageVehicleModel_AddModelSeriesButton));
		manageVehicleModel_AddModelSeriesButton.click();
		}
	
	public void manageVehicleModel_ModelSeries(){
		manageVehicleModel_ModelSeries.sendKeys("2222");
		}
	
	public void manageVehicleModel_Designation(){
		manageVehicleModel_Designation.clear();
		manageVehicleModel_Designation.sendKeys(randomNumbers_6);
		}
	
	public void manageVehicleModel_Brand(){
		Select s=new Select(manageVehicleModel_Brand);
		s.selectByValue("string:smart");
	}
	
	public void manageVehicleModel_Category(){
		Select s=new Select(manageVehicleModel_Category);
		s.selectByValue("string:C7");
	}	
	
	public void manageVehicleModel_CheckMark()
	{
		manageVehicleModel_CheckMark.click();
	}	
	
	public void manageVehicleModel_AddModelDesignationButton()
	{
		manageVehicleModel_AddModelDesignationButton.click();
	}	
	
	public void manageVehicleModel_ModelDesignation(){
		manageVehicleModel_ModelDesignation.sendKeys("2222");
		}
	
	public void manageVehicleModel_Model_Designation(){
		manageVehicleModel_Model_Designation.sendKeys("Add Designation");
		}
	
	public void manageVehicleModel_BodyType(){
		Select s=new Select(manageVehicleModel_BodyType);
		s.selectByValue("string:S");
	}	

	public void manageVehicleModel_Code1(){
		manageVehicleModel_Code1.sendKeys("1");
		}
	
	public void manageVehicleModel_Code2(){
		manageVehicleModel_Code2.sendKeys("2");
		}
	
	public void manageVehicleModel_Code3(){
		manageVehicleModel_Code3.sendKeys("3");
		}
	
	public void manageVehicleModel_Code4(){
		manageVehicleModel_Code4.sendKeys("4");
		}

	public void manageVehicleModel_ValidFrom(){
		warmup5();
		manageVehicleModel_ValidFrom.click();
		warmup5();
		validfromdate.click();
	//	manageVehicleModel_ValidFrom.sendKeys(Keys.ENTER);
		}
	
	public String manageVehicleModel_ValidFrom_GetValue(){
		String row=manageVehicleModel_ValidFrom.getText();
		return row;
	}
	
	public void manageVehicleModel_ValidTo(){
		warmup5();
		manageVehicleModel_ValidTo.click();
		warmup5();
		validtodate.click();
		//manageVehicleModel_ValidTo.sendKeys(Keys.ENTER);
		}

	public void manageVehicleModel_Save()
	{
		manageVehicleModel_Save.click();
		warmup1();
		warmup1();
		warmup1();
	}	
	
	public void manageVehicleModel_ModelDesignationFilter(){
		wait.until(ExpectedConditions.elementToBeClickable(manageVehicleModel_ModelSeriesDataRow));
		manageVehicleModel_ModelDesignationFilter.click();
		}
	
	public String manageVehicleModel_ModelSeriesDataRow(){
		wait.until(ExpectedConditions.visibilityOf(manageVehicleModel_ModelSeriesDataRow));
		String row=manageVehicleModel_ModelSeriesDataRow.getText();
		return row;
	}
	
	public void manageVehicleModel_VehicleModelDesignation_SearchTheTable(){
		manageVehicleModel_SearchTheTable.sendKeys("Add Designation");
		manageVehicleModel_SearchTheTable.sendKeys(Keys.ENTER);
		warmup6();
		}
	
	public String manageVehicleModel_VehicleModelDesignationRow(){
		wait.until(ExpectedConditions.visibilityOf(manageVehicleModel_VehicleModelDesignationRow));
		String row=manageVehicleModel_VehicleModelDesignationRow.getText();
		return row;
	}
	
	public void manageVehicleModel_EditVehicleModelDesignation(){
		manageVehicleModel_EditVehicleModelDesignation.click();
		}
	
	public void manageVehicleModel_Edit_Model_Designation(){
		manageVehicleModel_Model_Designation.clear();
		manageVehicleModel_Model_Designation.sendKeys("Edit Designation");
		}
	
	public void manageVehicleModel_Edit_BodyType(){
		Select s=new Select(manageVehicleModel_BodyType);
		s.selectByValue("string:F");
	}	

	public void manageVehicleModel_Edit_Code1(){
		manageVehicleModel_Code1.clear();
		manageVehicleModel_Code1.sendKeys("5");
		}
	
	public void manageVehicleModel_Edit_Code2(){
		manageVehicleModel_Code2.clear();
		manageVehicleModel_Code2.sendKeys("6");
		}
	
	public void manageVehicleModel_Edit_Code3(){
		manageVehicleModel_Code3.clear();
		manageVehicleModel_Code3.sendKeys("7");
		}
	
	public void manageVehicleModel_Edit_Code4(){
		manageVehicleModel_Code4.clear();
		manageVehicleModel_Code4.sendKeys("8");
		}
	
	public void manageVehicleModel_VehicleModelDesignation_Edit_SearchTheTable(){
		manageVehicleModel_SearchTheTable.sendKeys("Edit Designation");
		manageVehicleModel_SearchTheTable.sendKeys(Keys.ENTER);
		warmup6();
		}
	
	public void manageVehicleModel_Delete_VehicleModelDesignation(){
		manageVehicleModel_Delete_VehicleModelDesignation.click();
		}
	
	public boolean vehicleModelDesignationRow() {
		if (manageVehicleModel_VehicleModelDesignationRow.isDisplayed()) {
			return true;
		}else {
		return false;
		}
	}
	
	public void vpdIds(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", vpdIds);
		warmup5();
		}
	
	public void vpdIds_ShowData(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", vpdIds_ShowData);
		warmup1();
		}
	
	public void createVpdId(){
		warmup1();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", createVpdId);
		}
	
	public void vpdIds_VpdIdent(){
		vpdIds_VpdIdent.sendKeys(randomNumbers_5);
		}
	
	public void vpdIds_Description_Icon(){
		vpdIds_Description_Icon.click();
		}
	
	public void vpdIds_Create_Description_English(){
		vpdIds_Description_English.sendKeys("Create Designation");
		}
	
	public void vpdIds_Apply(){
		vpdIds_Apply.click();
		}

	public void vpdIds_Create_PvBreakdown(){
		wait.until(ExpectedConditions.elementToBeClickable(vpdIds_PvBreakdown));
		Select s=new Select(vpdIds_PvBreakdown);
		s.selectByValue("string:telephoneBluetooth");
	}
	
	public void vpdIds_Create_CvBreakdown(){
		wait.until(ExpectedConditions.elementToBeClickable(vpdIds_CvBreakdown));
		Select s=new Select(vpdIds_CvBreakdown);
		s.selectByValue("string:cdChangerUnitNo");
	}
	
	public void vpdIds_Checkmark(){
		vpdIds_Checkmark.click();
		}
	
	public void vpdIds_Save(){
		vpdIds_Save.click();
		warmup1();
		}
	
	public void vpdIds_FilterButton(){
		vpdIds_FilterButton.click();
		}
	
	public void vpdIds_SearchTheTable(){
		vpdIds_SearchTheTable.sendKeys(randomNumbers_5);
		warmup5();
		}
	
	public void vpdIds_Edit(){
		vpdIds_Edit.click();
		}
	
	public void vpdIds_Edit_Description_English(){
		vpdIds_Description_English.clear();
		vpdIds_Description_English.sendKeys("Edit Designation");
		}
	
	public void vpdIds_Edit_PvBreakdown(){
		wait.until(ExpectedConditions.elementToBeClickable(vpdIds_PvBreakdown));
		Select s=new Select(vpdIds_PvBreakdown);
		s.selectByValue("string:BFS text");
	}
	
	public void vpdIds_Edit_CvBreakdown(){
		wait.until(ExpectedConditions.elementToBeClickable(vpdIds_CvBreakdown));
		Select s=new Select(vpdIds_CvBreakdown);
		s.selectByValue("string:Certificate chain ID");
	}
	
	public String vpdIds_FilteredResult(){
		String result=vpdIds_FilteredResult.getText();
		return result;
	}
	
	public String vpdIds_AlreadyExistingAlert_Line1(){
		String alert1=vpdIds_AlreadyExistingAlert_Line1.getText();
		return alert1;
	}
	
	public String vpdIds_AlreadyExistingAlert_Line2(){
		String alert1=vpdIds_AlreadyExistingAlert_Line2.getText();
		return alert1;
	}
	
	public String vpdIds_AlreadyExistingAlert_Line3(){
		String alert1=vpdIds_AlreadyExistingAlert_Line3.getText();
		return alert1;
	}
	
	public void vpdIds_Confidential(){
		vpdIds_Confidential.click();
		}
	
	public void cuGroup(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cuGroup);
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(cuGroup_AddEntry));
		}
	
	public void cuGroup_AddEntry(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", cuGroup_AddEntry);
	}
	
	public void cuGroup_Identifier(){
		cuGroup_Identifier.sendKeys("22222");
		}
	
	public void cuGroup_Pencil(){
		cuGroup_Pencil.click();
	}
	
	public void cuGroup_Create_English(){
		cuGroup_English.sendKeys("Create Designation");
		}
	
	public void cuGroup_Apply(){
		cuGroup_Apply.click();
	}

	public void cuGroup_Create_EcuModel(){
		Select s=new Select(cuGroup_EcuModel);
		s.selectByValue("string:DIA");
	}
	
	public void cuGroup_Create_PartsFamiliesModel(){
		Select s=new Select(cuGroup_PartsFamiliesModel);
		s.selectByValue("string:vehicle");
	}

	public void cuGroup_CheckMark(){
		cuGroup_CheckMark.click();
	}
	
	public void cuGroup_Save(){
		cuGroup_Save.click();
		warmup1();
	}

	public void cuGroup_Filter(){
		cuGroup_Filter.click();
	}
	
	public void cuGroup_SearchTheTable(){
		cuGroup_SearchTheTable.sendKeys("22222");
		warmup5();
		}
	
	public String cuGroup_FilteredResult(){
		wait.until(ExpectedConditions.visibilityOf(cuGroup_FilteredResult));
		String result=cuGroup_FilteredResult.getText();
		return result;
	}
	
	public void cuGroup_Edit(){
		cuGroup_Edit.click();
	}

	public void cuGroup_Edit_English(){
		cuGroup_English.clear();
		cuGroup_English.sendKeys("Edit Designation");
		}
	
	public void cuGroup_Edit_EcuModel(){
		Select s=new Select(cuGroup_EcuModel);
		s.selectByValue("string:SEAT");
	}
	
	public void cuGroup_Edit_PartsFamiliesModel(){
		Select s=new Select(cuGroup_PartsFamiliesModel);
		s.selectByValue("string:engine");
	}
	
	public void cuGroup_Delete(){
		cuGroup_Delete.click();
	}
	
	public Boolean cuGroup_DeletedResult(){
		warmup6();
		return cuGroup_FilteredResult.isDisplayed();
	}
	
	public void countryDesignation(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", countryDesignation);
		warmup5();
		wait.until(ExpectedConditions.visibilityOf(countryDesignation_Filter));
	}
	
	public void countryDesignation_Filter(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", countryDesignation_Filter);
	}
	
	
	public void countryDesignation_SearchTheTable(){
		countryDesignation_SearchTheTable.sendKeys("22222");
		warmup5();
		}

	public void countryDesignation_Edit(){
		countryDesignation_Edit.click();
	}

	public void countryDesignation_SalesArea_Edit(){
		countryDesignation_SalesArea_Edit.click();
	}
	
	public void countryDesignation_Designation(){
		countryDesignation_Designation.clear();
		countryDesignation_Designation.clear();
		warmup6();
		countryDesignation_Designation.sendKeys("Edit Sales Area - " +randomAlphabets_5);
		}
	
	public void countryDesignation_Apply(){
		countryDesignation_Apply.click();
	}

	public void countryDesignation_ValidFrom(){
		countryDesignation_ValidFrom.clear();
		countryDesignation_ValidFrom.sendKeys("02/02/1996");
		}
	
	public void countryDesignation_ValidUntil(){
		countryDesignation_ValidUntil.clear();
		countryDesignation_ValidUntil.sendKeys("02/02/2026");
		}
	
	public void countryDesignation_CheckMark(){
		countryDesignation_CheckMark.click();
	}
	
	public void countryDesignation_Save(){
		countryDesignation_Save.click();
	}
	
	public String countryDesignation_FilteredResult(){
		wait.until(ExpectedConditions.visibilityOf(countryDesignation_FilteredResult));
		String result=countryDesignation_FilteredResult.getText();
		return result;
	}

	public void vpdIds_close(){
		vpdIds_close.click();
	}
	
	public void vpdIds_Cancel(){
		vpdIds_Cancel.click();
	}
	public String ControlUnitVPDID_TotalRecords() {
		String records=ControlUnitVPDID_totalRecords.getText().trim();
		System.out.println(records);
		return records;	}
	
	 public Boolean countryDesignation_EditDisplayed(){
	        return countryDesignation_Edit.isDisplayed();
	    }
	 
//Kartik
	 
	 public void moveToControlUnitVPDIDTab_clickOnCertificationTab() {		
			Actions act=new Actions(driver);
			act.moveToElement(ControlUnitVPDIDTab).perform();
			warmup();
			act.moveToElement(certificationTab).click().build().perform();
	 }
	 
	 public void SearchForDocumentKey() {
		 documentKey.clear();
		 warmup();
		 documentKey.sendKeys(CorrectDocumentKey); 
	 }
	 public void SearchForIncorectDocumentKey() {
		 documentKey.clear();
		 warmup();
		 documentKey.sendKeys(IncorrectDocumentKey); 
	 }
	 public String GetSearchedDocumentKey() {
		 String DocKey=documentKey.getText();
		 return DocKey;
	 }
	 
	 public void searchForCOCData_Button() {
		 SearchForCOCData.click();
	 }
	 
	 public String FetchDocumentKey(){
			warmup6();
			String Key=	fetchDocumentKey.getText();
			return Key;
		}
	 public String FetchFuelValue(){
			warmup6();
			String Key=	fetchFuel.getText();
			System.out.println("Fuel-"+Key);
			return Key;
		}
	 public String FetchDisplacement(){
			warmup6();
			String Key=	displacement.getText();
			return Key;
		}
	 
	 public String FetchOutput(){
			warmup6();
			String Key=	output.getText();
			return Key;
		}
	 public String FetchEU_approval_date(){
			warmup6();
			String Key=	eu_approval_date.getText();
			return Key;
		}
	 
	 public String Fetch_ModelPlate_Displacement(){
			warmup6();
			String Key=	mp_displacement.getText();
			return Key;
	 }
	 public String Fetch_Rated_Output(){
			warmup6();
			String Key=	mp_rated_output.getText();
			return Key;
	 }
	 
	 //
	 public void Gasoline_diesel_consumption_Button() {
		 gasoline_diesel_consumption.click();
	 }

	 	 public void Model_Plate_Button() {
		 model_plate.click();
	 }
	 
	 	public boolean alertBox() {
			if (alertBox.isDisplayed()) {
							return true;
						} else {
							return false;
						}
					}
	 	public  String alertBoxGClass() {
			return alertBox.getText();
		}
	 
	 	public void moveToAlertBoxCloseAndClick() throws InterruptedException {
			Thread.sleep(15000);
			Actions	act = new Actions(driver);
			act.moveToElement(alertBoxClose).click().build().perform();	
			}
	 
	 public String FatchCO2_EmisionCombined(){
			warmup6();
			String Key=	emision_combined.getText();
			return Key;
		}
	 
	 //for u-034
     public String FetchBrandValue(){
			warmup6();
			String value=	fetchBrand.getText();
			System.out.println("Brand-"+value);
			return value;
		}
     public String FetchVariantValue(){
			warmup6();
			String value=fetchVariant.getText();
			System.out.println("Variant-"+value);
			return value;
		}
     public String FetchSalesDesignation(){
			warmup6();
			String value=fetchSalesDesignation.getText();
			System.out.println("SalesDesignation-"+value);
			return value;
		}
     public String FetchVersion(){
			warmup6();
			String value=fetchVersion.getText();
			System.out.println("Version-"+value);
			return value;
		}
     public String FetchManufacturerCode(){
			warmup6();
			String value=fetchManufacturerCode.getText();
			System.out.println("ManufacturerCode-"+value);
			return value;
		}
     public String FetchEUApprovalNo(){
			warmup6();
			String value=fetchEUApprovalNo.getText();
			System.out.println("fetch EU Approval No-"+value);
			return value;
		}
     public String FetchIndexOfModelCodes(){
			warmup6();
			String value=fetchIndexOfModelCodes.getText();
			System.out.println("Index of Model Codes-"+value);
			return value;
		}
     public String FetchHybridOutputInkW(){
			warmup6();
			String value=fetchHybridOutputInkW.getText();
			System.out.println("Hybrid Output in kW-"+value);
			return value;
		}
     public String FetchVariantVersionCode(){
			warmup6();
			String value=fetchVariantVersionCode.getText();
			System.out.println("Variant Version Code-"+value);
			return value;
		}
     public String FetchMaximumSpeed(){
			warmup6();
			String value=fetchMaximumSspeed.getText();
			System.out.println("Maximum speed-"+value);
			return value;
		}
     public String FetchExhaustGuidelines(){
			warmup6();
			String value=fetchExhaustGuidelines.getText();
			System.out.println("ExhaustGuidelines-"+value);
			return value;
		}
     public String FetchCheckDigit(){
			warmup6();
			String value=fetchCheckDigit.getText();
			System.out.println("Check Digit-"+value);
			return value;
		}
     public String FetchEmissionsStandard(){
			warmup6();
			String value=fetchEmissionsStandard.getText();
			System.out.println("Emissions Standard-"+value);
			return value;
		}
     //
     public String FetchUrbanConsumption(){
			warmup6();
			String value=fetchUrbanConsumption.getText();
			System.out.println("Urban Consumption-"+value);
			return value;
		}
     public String FetchCO2emissionsUrban(){
			warmup6();
			String value=fetchCO2emissionsUrban.getText();
			System.out.println("CO2 emissions Urban-"+value);
			return value;
		}
     public String FetchHighwayConsumption(){
			warmup6();
			String value=fetchHighwayConsumption.getText();
			System.out.println("Highway Consumption-"+value);
			return value;
		}
     public String FetchCO2emissionHighway(){
			warmup6();
			String value=fetchCO2emissionHighway.getText();
			System.out.println("CO2 emission Highway-"+value);
			return value;
		}
     public String FetchCombinedConsumption(){
			warmup6();
			String value=fetchCombinedConsumption.getText();
			System.out.println("Combined Consumption-"+value);
			return value;
		}
     public String FetchConsumptionWeighted(){
			warmup6();
			String value=fetchConsumptionWeighted.getText();
			System.out.println("Consumption Weighted-"+value);
			return value;
		}
    public String FetchCO2emissionsWeighted(){
			warmup6();
			String value=fetchCO2emissionsWeighted.getText();
			System.out.println("CO2 emissions Weighted-"+value);
			return value;
		}
     //

    public void Gas_fuel_consumption_Button() {
  	  gas_fuel_consumption.click();
	 }
    public String FetchUrbanConsumption_Gas(){
			warmup6();
			String value=fetchUrbanConsumption_Gas.getText();
			System.out.println("Urban Consumption_Gas-"+value);
			return value;
		}
  public String FetchCO2missionsUrban_Gas(){
			warmup6();
			String value=fetchCO2missionsUrban_Gas.getText();
			System.out.println("CO2 missions Urban_Gas-"+value);
			return value;
		}
  public String FetchHighwayConsumption_Gas(){
		warmup6();
		String value=fetchHighwayConsumption_Gas.getText();
		System.out.println("Highway Consumption_Gas_Gas-"+value);
		return value;
	}
  public String FetchCO2emissionHighway_Gas(){
		warmup6();
		String value=fetchCO2emissionHighway_Gas.getText();
		System.out.println("CO2emission Highway_Gas-"+value);
		return value;
	}
  public String FetchCombinedConsumption_Gas(){
		warmup6();
		String value=fetchCombinedConsumption_Gas.getText();
		System.out.println("Combined Consumption_Gas-"+value);
		return value;
	}
  public String fetchCO2emissionsCombined_Gas(){
		warmup6();
		String value=fetchCO2emissionsCombined_Gas.getText();
		System.out.println("CO2 emissions Combined_Gas-"+value);
		return value;
	}
  public String FetchConsumptionWeighted_Gas(){
		warmup6();
		String value=fetchConsumptionWeighted_Gas.getText();
		System.out.println("Consumption Weighted_Gas-"+value);
		return value;
	}
  public String FetchCO2emissionsWeighted_Gas(){
		warmup6();
		String value=fetchCO2emissionsWeighted_Gas.getText();
		System.out.println("CO2 emissions Weighted_Gas-"+value);
		return value;
	}
  //

 public void Other_consumption_Button() {
	   other_consumption.click();
	 }
 public String FetchUrbanConsumption_other(){
			warmup6();
			String value=fetchUrbanConsumption_other.getText();
			System.out.println("Urban Consumption_other-"+value);
			return value;
		}
public String FetchCO2missionsUrban_other(){
			warmup6();
			String value=fetchCO2missionsUrban_other.getText();
			System.out.println("CO2 missions Urban_other-"+value);
			return value;
		}

public String fetchHighwayConsumption_other(){
		warmup6();
		String value=fetchHighwayConsumption_other.getText();
		System.out.println("Highway Consumption other-"+value);
		return value;
	}
public String fetchCO2emissionHighway_other(){
		warmup6();
		String value=fetchCO2emissionHighway_other.getText();
		System.out.println("CO2emission Highway other-"+value);
		return value;
	}
public String fetchCombinedConsumption_other(){
		warmup6();
		String value=fetchCombinedConsumption_other.getText();
		System.out.println("Combined Consumption other-"+value);
		return value;
	}
public String fetchCO2emissionsCombined_other(){
		warmup6();
		String value=fetchCO2emissionsCombined_other.getText();
		System.out.println("CO2 emissions Combined_other-"+value);
		return value;
	}
public String fetchConsumptionWeighted_other(){
		warmup6();
		String value=fetchConsumptionWeighted_other.getText();
		System.out.println("Consumption Weighted_other-"+value);
		return value;
	}
public String fetchCO2emissionsWeighted_other(){
		warmup6();
		String value=fetchCO2emissionsWeighted_other.getText();
		System.out.println("CO2 emissions Weighted_other-"+value);
		return value;
	}
  //

    public void Electricity_consumption_Button() {
  	  electricity_consumption_Button.click();
 	 }
    public String FetchCombinedConsumption_electricity(){
		warmup6();
		String value=fetchCombinedConsumption_electricity.getText();
		System.out.println("Combined Consumption_electricity-"+value);
		return value;
	}
 public String FetchRange_electricity(){
		warmup6();
		String value=fetchRang_electricity.getText();
		System.out.println("Rang_electricity-"+value);
		return value;
	}

 public void Tires_Button() {
	   tires_Button.click();
	 }
 public String FetchTiresAxle_1(){
		warmup6();
		String value=tiresAxle_1.getText();
		System.out.println("tires Axle_1-"+value);
		return value;
	}
 public String FetchRimAxle_1(){
		warmup6();
		String value=rimAxle_1.getText();
		System.out.println("rim Axle_1-"+value);
		return value;
	}
 public String FetchAir_pressure_Axle_1(){
		warmup6();
		String value=air_pressure_Axle_1.getText();
		System.out.println("air_pressure_Axle_1-"+value);
		return value;
	}
 public String FetchTiresAxle_2(){
		warmup6();
		String value=tiresAxle_2.getText();
		System.out.println("tires Axle_2-"+value);
		return value;
	}
public String FetchRimAxle_2(){
		warmup6();
		String value=rimAxle_2.getText();
		System.out.println("rim Axle_2-"+value);
		return value;
	}
public String FetchAir_pressure_Axle_2(){
		warmup6();
		String value=air_pressure_Axle_2.getText();
		System.out.println("air_pressure_Axle_2-"+value);
		return value;
	}
    
public String FetchTiresAxle_3(){
		warmup6();
		String value=tiresAxle_3.getText();
		System.out.println("tires Axle_3-"+value);
		return value;
	}
public String FetchRimAxle_3(){
		warmup6();
		String value=rimAxle_3.getText();
		System.out.println("rim Axle_3-"+value);
		return value;
	}
public String FetchAir_pressure_Axle_3(){
		warmup6();
		String value=air_pressure_Axle_3.getText();
		System.out.println("air_pressure_Axle_3-"+value);
		return value;
	}
 
public String FetchTiresAxle_4(){
	warmup6();
	String value=tiresAxle_4.getText();
	System.out.println("tires Axle_4-"+value);
	return value;
}
public String FetchRimAxle_4(){
	warmup6();
	String value=rimAxle_4.getText();
	System.out.println("rim Axle_4-"+value);
	return value;
}
public String FetchAir_pressure_Axle_4(){
	warmup6();
	String value=air_pressure_Axle_4.getText();
	System.out.println("air_pressure_Axle_4-"+value);
	return value;
}
 

        public String Permissible_weight_modelplate(){
      		warmup6();
      		String value=permissible_weight_modelplate.getText();
      		System.out.println("permissible_weight_modelplate-"+value);
      		return value;
      	}
        
        public String permissible_weight_vehicle_combination_modelplate(){
    		warmup6();
    		String value=permissible_weight_vehicle_combination_modelplate.getText();
    		System.out.println("permissible_weight_vehicle_combination_modelplate-"+value);
    		return value;
    	}
        
        public String Permissible_axle_load_Axle_1(){
    		warmup6();
    		String value=permissible_axle_load_Axle_1.getText();
    		System.out.println("permissible_axle_load_Axle_1-"+value);
    		return value;
    	}
        public String Permissible_axle_load_Axle_2(){
      		warmup6();
      		String value=permissible_axle_load_Axle_2.getText();
      		System.out.println("permissible_axle_load_Axle_2-"+value);
      		return value;
      	}

        public String Model_modelplate(){
    		warmup6();
    		String value=model_modelplate.getText();
    		System.out.println("model_modelplate-"+value);
    		return value;
    	}
        public String Sales_designation_modelplate(){
      		warmup6();
      		String value=sales_designation_modelplate.getText();
      		System.out.println("sales_designation_modelplate-"+value);
      		return value;
      	}
        public String Vehicle_model_designation(){
    		warmup6();
    		String value=vehicle_model_designation.getText();
    		System.out.println("vehicle_model_designation-"+value);
    		return value;
    	}
        public String Reated_electrical_output(){
      		warmup6();
      		String value=reated_electrical_output.getText();
      		System.out.println("reated_electrical_output-"+value);
      		return value;
      	}
        public String Engine_mode_designation(){
    		warmup6();
    		String value=engine_mode_designation.getText();
    		System.out.println("engine_mode_designation-"+value);
    		return value;
    	}
        public String Rated_output_kW_max(){
      		warmup6();
      		String value=rated_output_kW_max.getText();
      		System.out.println("rated_output_kW_max-"+value);
      		return value;
      	}
        public String Number_of_seats(){
    		warmup6();
    		String value=number_of_seats.getText();
    		System.out.println("number_of_seats-"+value);
    		return value;
    	}
        public String Battery_modelplate(){
      		warmup6();
      		String value=battery_modelplate.getText();
      		System.out.println("battery -"+value);
      		return value;
      	}
        public String Low_beam_light_bundle(){
    		warmup6();
    		String value=low_beam_light_bundle.getText();
    		System.out.println("low_beam_light_bundle -"+value);
    		return value;
    	}
        public String Rated_voltage_in_volts(){
      		warmup6();
      		String value=rated_voltage_in_volts.getText();
      		System.out.println("rated_voltage_in_volts -"+value);
      		return value;
      	}
        public String Diesel_smoke_coefficient(){
    		warmup6();
    		String value=diesel_smoke_coefficient.getText();
    		System.out.println("diesel_smoke_coefficient -"+value);
    		return value;
    	}
        public String CNO_russia(){
      		warmup6();
      		String value=cno_russia.getText();
      		System.out.println("cno_russia -"+value);
      		return value;
      	}
        public String Curb_weight(){
    		warmup6();
    		String value=curb_weight.getText();
    		System.out.println("curb_weight -"+value);
    		return value;
    	}
        public String China_model(){
      		warmup6();
      		String value=china_model.getText();
      		System.out.println("china_model -"+value);
      		return value;
      	}
	 
	//DG Designation Tab
        
        public int Fetch_DesignationGroupCount() {
        	
			List<WebElement> count = driver.findElements(By.xpath("//form[@name='fMasterDataDesignGroup_720']//table[@id='designGroup']//tbody//tr"));
			int size = count.size();
			System.out.println("Designation count is- "+size);
			
			if(size>=1) {
				return size;
			}else {
				return 0;
			}
		} 
        
        public void DGDesignationTab_FilterButton() {
        	wait.until(ExpectedConditions.visibilityOf(DGDesignationTab_FilterButton));
        	DGDesignationTab_FilterButton.click();
		}
        public void DGDesignationTab_FilterSearchText(String value) {
        	DGDesignationTab_SearchText.clear();
        	DGDesignationTab_SearchText.sendKeys(value);
        	warmup6();
		}
 
        public String Fetch_DG_designationData(int row, int colummn) {
			WebElement data = driver.findElement(By.xpath("//form[@name='fMasterDataDesignGroup_720']//table[@id='designGroup']//tbody//tr["+row+"]//td["+colummn+"]"));
			String text=data.getText();
			return text;
		}
        
        public void DGDesignatinTab_click() {
        	wait.until(ExpectedConditions.visibilityOf(DGDesignatinTab));
        	DGDesignatinTab.click();
        	warmup();
        }
        
        public void DGDesignatin_TableCountValue() {
        	wait.until(ExpectedConditions.visibilityOf(DGDesignationTab_tableCount));
        	Actions act=new Actions(driver);
        	act.moveToElement(DGDesignationTab_tableCount).click().build().perform();       	
        	warmup();
        }
        
        @FindBy(xpath="//form[@name='fMasterDataDesignGroup_720']//button[@class='btn in-cell table-export']")
		WebElement dgDesignation_tableExport;
        
        public void dgDesignation_tableExport() {
        	wait.until(ExpectedConditions.visibilityOf(dgDesignation_tableExport));
        	wait.until(ExpectedConditions.elementToBeClickable(dgDesignation_tableExport));
        	dgDesignation_tableExport.click();
		}
            
        
        //Kartik- To verify data from .csv file
    	@FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
    	WebElement dateModified_columnHeder;
        
    	@FindBy(xpath="//table//tbody//tr[1]//td//a")
    	WebElement getRow1_dateModified;
    	
    	//To get .csv file name from download folder
    	public String GetDownloadedFileName_NewTab(){
    	warmup5();
    	JavascriptExecutor js= ((JavascriptExecutor)driver);
    	js.executeScript("window.open()");
   		ArrayList<String> opentabs = new ArrayList<String> (driver.getWindowHandles());
   		 driver.switchTo().window(opentabs.get(1));
   		 driver.get("C:\\Users\\deenara\\Downloads");
   		
   		 
   		 warmup6();
   		dateModified_columnHeder.click();
   		warmup6();
   		String name= getRow1_dateModified.getText();
   		System.out.println("file name-"+name);
   		
   		driver.close();
   		driver.switchTo().window(opentabs.get(0));
   		return name;
    	}
            	
    	public int getRecordsCountInCSV_fromFile(String csvFileName) {
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
    	
    	//History tab
    	
    	@FindBy(xpath="//li//a[text()='History']")
    	WebElement historyTab;
    	
    	@FindBy(xpath="//select[@data-ng-options='option.id as option.name for option in viewUIObject.literals.EnumMasterDataModificationLogCategory ']")
    	WebElement tabCatagory;
    	
    	@FindBy(xpath="//input[@name='dateFrom']")
    	WebElement dateFrom;
    	
    	@FindBy(xpath="//input[@name='dateTo']")
    	WebElement dateTo;
    	
    	@FindBy(xpath="//button[@id='MasterDataModificationHistory_753_search']")
    	WebElement search_history;
    	
    	@FindBy(xpath="//button[@data-ng-click='exportCsv($event)']")
    	WebElement exportCsvButton_history;
    	
    	
    	public void HistoryTab() {
    		Actions act =new Actions(driver);
    		act.moveToElement(CodesTab).perform();
    		
        	wait.until(ExpectedConditions.visibilityOf(historyTab));
        	historyTab.click();
        	warmup();
		}
    	public int GetAllTabCatagorySize() {
    		Select select = new Select(tabCatagory);
    		List<WebElement> AllTabOption =select.getOptions();
    		int optionSize= AllTabOption.size();
    		System.out.println("Tab catagory options size is- "+optionSize);
    	return optionSize;
		}
    	
    	public String GetAllTabCatagory(int index) {
    		Select select = new Select(tabCatagory);
    		String Option =select.getOptions().get(index).getText();
    		System.out.println("Select tab catagory options is- "+Option);

    	return Option;
		}
    	
    	public void TabCatagory(String value) {
    		Select select = new Select(tabCatagory);
    		select.selectByVisibleText(value);
    		warmup();
		}
    	
    	public void DateFrom(String value) {
    		dateFrom.clear();
    		dateFrom.sendKeys(value);
    		warmup();
		}
    	public void DateTo(String value) {
    		dateTo.clear();
    		dateTo.sendKeys(value);
    		warmup();
		}
    	public void Search_History() {
    		search_history.click();
    		warmup1();
		}
    	
    	public int Fetch_logEntryCount() {
    		
        	warmup();
			List<WebElement> count1 = driver.findElements(By.xpath("//table[@id='logEntry']//tbody//tr"));
			
			warmup();
			int size1 = count1.size();
			if(size1>=1) {
	        	WebElement logLength = driver.findElement(By.xpath("//a[contains(@data-ng-click,'viewDataObject.masterDataModificationLogReport.logEntry.length')]"));
				Actions act = new Actions(driver);
				act.moveToElement(logLength).click().build().perform();
			}
		
			warmup6();
			List<WebElement> count = driver.findElements(By.xpath("//table[@id='logEntry']//tbody//tr"));
			int size = count.size();
			System.out.println("Log entry count is-- "+size);
			
			if(size>=1) {
				return size;
			}else {
				return 0;
			}
			
		} 
    	public void ExportCsvButton_history() {
    		warmup();
    		WebElement button = driver.findElement(By.xpath("//form[@name='fMasterDataModificationHistory_753']//button[@data-ng-click='exportCsv($event)']"));
    		Actions act =new Actions(driver);
    		act.moveToElement(button).click().build().perform();   		
    		warmup6();
		}
    	
    	public  String GetBlueAlertBoxText() {
    		WebElement blueAlert = driver.findElement(By.xpath("(//div[@data-ng-repeat='alert in alerts'])[1]"));
    		String text= blueAlert.getText();
    		
			return text;
		}
    	public void FilterButton_history() {
    		warmup();
    		WebElement button = driver.findElement(By.xpath("//form[@name='fMasterDataModificationHistory_753']//button[contains(@data-ng-click,'filter')]"));
    		Actions act =new Actions(driver);
    		act.moveToElement(button).click().build().perform();   		
    		warmup6();
		}
    	public String GetTextFromTable_history() {
    		warmup();
    		WebElement button = driver.findElement(By.xpath("//table[@id='logEntry']//tbody//tr[1]//td[1]//span"));
    		String text = 	button.getText();	
    	return text;
		}
    	public void PassFilterText_history(String value) {
    		warmup();
    		WebElement button = driver.findElement(By.xpath("//input[@input-binding='viewControl.logEntry_filterExpression']"));
    		button.sendKeys(value); 		
    		warmup6();
		}
    	
     //Kartik over

     

}




