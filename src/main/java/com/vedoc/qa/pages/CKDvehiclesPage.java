package com.vedoc.qa.pages;

import com.vedoc.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class CKDvehiclesPage extends TestBase {
//W1T4374671V262627
    @FindBy(xpath = "//*[@id='27800209:11ac5931e04:-7ff9']")
    WebElement searchInputCKD;

    @FindBy(xpath = "//*[@id='CkdSearch_001_search']")
    WebElement CKDsearchbutton;

    @FindBy(xpath = "//*[@id='CkdData_800']/div/div[2]/form/div[1]/div/button")
    WebElement editbutton;

    @FindBy(xpath = "//*[@id='45620eb2:11ada317478:-7ffd']")
    WebElement customizeVechicletype;

    @FindBy(xpath = "//button[contains(@data-ng-click,'showModificationsOfAssignedObjects')]")
    WebElement HistoryOfDependentObjButton;

    @FindBy(xpath = "//button[contains(@data-ng-click,'showExcludedEntries')]")
    WebElement TechnicalEnteriesButton;

    @FindBy(xpath = "//button[contains(@data-ng-click,'historyTable')]/span[@class='sym rc-i-line-filter ']")
    WebElement FilterButton;

    @FindBy(xpath = "//*[@id='historyTable']/tbody")
    WebElement HistoryTable;
    @FindBy(xpath = "//*[@id='3c76a38b:13d92037a09:-7ff4']")
    WebElement CKDproductionNo;

    @FindBy(xpath = "//*[@id='710a700c:11ad9eafb36:-7ffb']")
    WebElement CKDEngNo;

    @FindBy(xpath = "//*[@id='731bc6ee:172044f554f:-7fef']")
    WebElement exhaustAfterTreatment;

    @FindBy(xpath = "//*[@id='710a700c:11ad9eafb36:-7ff9']")
    WebElement body;

    @FindBy(xpath = "//*[@id='3c76a38b:13d92037a09:-7ff1']")
    WebElement date;
    @FindBy(xpath = "//*[@id='CkdSearchFoot_001']/div/div[2]/form/div[2]/div/div/button[1]")
    WebElement CKDsave;

    @FindBy(xpath = "//*[@id='CKDArrangement']/div[2]/div[2]/div/div/ul/li[2]/a")
    WebElement CKDcodes;

    @FindBy(xpath = "//*[@id='VehicleCodes_040']/div/div[2]/form/div[1]/div/button[4]")
    WebElement hideDesignation;

//    @FindBy(xpath = "//*[@id=\"VehicleCodes_041\"]/div/div[2]/form/div[2]/div/span")
//    WebElement desinationdata;
    @FindBy(xpath = "//*[@id='VehicleCodes_041']/div/div[2]/form/div[1]/div/button")
    WebElement showdesignation;
    @FindBy(xpath = "//*[@id='VehicleCodes_040']/div/div[2]/form/div[1]/div/button[3]")
    WebElement Resetsortbutton;

    @FindBy(xpath = "//*[@id='VehicleCodes_040']/div/div[2]/form/div[1]/div/button[1]")
    WebElement ckdAddcode;

    @FindBy(xpath = "//*[@id='codeTable']/tbody/tr[48]/td[2]/div/input")////*[@id="codeTable"]/tbody/tr[48]/td[2]/div/input
    WebElement sendcode;

    @FindBy(xpath = "//*[@id='codeTable']/tbody/tr[48]/td[5]/div/select")
    WebElement dropdownckd;
    @FindBy(xpath = "//*[@id='codeTable']/tbody/tr[48]/td[6]/span/button[1]")
    WebElement submitButton;
    @FindBy(xpath = "//*[@id='VehicleCodes_040']/div/div[2]/form/div[1]/div/button[2]")
    WebElement filterButton;

    @FindBy(xpath = "//*[@id='VehicleCodes_040']/div/div[2]/form/div[2]/div/div/ng-form/div/div/input")
    WebElement filterInput;
    @FindBy(xpath = "//*[@id='codeTable']/tbody/tr/td[6]/span/button/span")
    WebElement deletebutton;

    @FindBy(xpath = "//*[@id='CkdSearchFoot_001']/div/div[2]/form/div[2]/div/div/button[1]")
    WebElement codeSave;
    @FindBy(xpath = "//*[@id='CKDArrangement']/div[2]/div[2]/div/div/ul/li[3]/a")
    WebElement VPDdataTab;

    @FindBy(xpath = "//*[@id='VehicleVPDData_070']/div/div[2]/form/div[1]/div/button[1]")
    WebElement addVPD;

    @FindBy(xpath = "//*[@id='VPDTable']/tbody/tr[7]/td[1]/div/input")
    WebElement vpdData;

    @FindBy(xpath = "//*[@id='VPDTable']/tbody/tr[7]/td[3]/div/input")
    WebElement vpdContent;

    @FindBy(xpath = "//*[@id='VPDTable']/tbody/tr[7]/td[4]/span/button[1]/span")
    WebElement vpdSubmit;
    @FindBy(xpath = "//*[@id='CkdSearchFoot_001']/div/div[2]/form/div[2]/div/div/button[1]")
    WebElement vpdSave;

    @FindBy(xpath = "//*[@id='VehicleVPDData_070']/div/div[2]/form/div[1]/div/button[2]")
    WebElement vpdFilter;

    @FindBy(xpath = "//*[@id='VehicleVPDData_070']/div/div[2]/form/div[2]/div/div/ng-form/div/div/input")
    WebElement vpdsearch;

    @FindBy(xpath = "//*[@id='VPDTable']/tbody/tr/td[4]/span/button[1]/span")
    WebElement vpdEdit;

    @FindBy(xpath = "//*[@id='VPDTable']/tbody/tr/td[4]/span/button[2]/span")
    WebElement vpddelete;

    @FindBy(xpath = "//a[text()='History']")
    WebElement ckdHistoryTab;

    @FindBy(xpath = "//*[@id='CKDArrangement']/div[2]/div[2]/div/div/ul/li[4]")
    WebElement ckdLogs;

    @FindBy(xpath = "//*[@id='ProductLogArrangement_body']/div/div/div[1]/ul/li[2]/a")
    WebElement writeProtectonLogging;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[2]/div[2]/div/div/div/div[4]/div/div/div/div/div/div[2]/div/div[2]/div/div/div/div/div/div/div[2]/form/div[2]/div[2]/div/input")
    WebElement logsFromDate;

    @FindBy(xpath = "//*[@id='WriteProtectionLogging_381_search']")
    WebElement logsSearch;

    @FindBy(xpath = "//*[@id='WriteProtectionLogging_381']/div/div[2]/form/div[3]/div")
    WebElement loadeddata;
    public CKDvehiclesPage() {
        PageFactory.initElements(driver, this);
    }
    public Boolean validateCKDVehiclePage() {
        warmup();
        warmup1();
        warmup1();
        wait.until(ExpectedConditions.elementToBeClickable(searchInputCKD));
        return searchInputCKD.isDisplayed();


    }
    public void editCKDdata(){
        searchInputCKD.sendKeys("W1T4374671V262627");
        warmup5();
        CKDsearchbutton.click();
        warmup5();
        editbutton.click();
        customizeVechicletype.sendKeys("Truck");
        warmup5();
        CKDproductionNo.sendKeys("12345");
        warmup5();
        CKDEngNo.sendKeys("46577778456");
        warmup5();
        exhaustAfterTreatment.sendKeys(" 99999911999999");
        warmup5();
        body.sendKeys("999999999999");
        warmup5();
    //    date.sendKeys("11/08/2023");
        warmup5();
        CKDsave.click();
        warmup5();
    }
    public void reverseToOriginalvalue(){
        warmup5();
        editbutton.click();
        warmup5();
        customizeVechicletype.clear();
        warmup5();
        CKDproductionNo.clear();
        warmup5();
        CKDEngNo.clear();
        warmup5();
        exhaustAfterTreatment.clear();
        warmup5();
        body.clear();
        warmup5();
      //  date.sendKeys("");
        warmup5();
        CKDsave.click();
        warmup5();
    }
    public void ckdCode() {
        warmup5();
        CKDcodes.click();
        warmup5();
    }
    public void addCode(){
        hideDesignation.click();
        warmup5();
        showdesignation.click();
        warmup5();
        Resetsortbutton.click();
        warmup5();
        ckdAddcode.click();
       // warmup5();
        warmup5();
        sendcode.sendKeys("BLT");
        warmup5();
        Select option=new Select(dropdownckd);
        option.selectByValue("string:vehicle");
        warmup5();
        submitButton.click();
        warmup5();
        codeSave.click();
        warmup5();
    }
    public void deletCode(){
        warmup5();
        filterButton.click();
        warmup5();
        filterInput.sendKeys("BLT");
        warmup5();
        deletebutton.click();
        warmup5();
        codeSave.click();
        warmup5();
    }
    public void clickckdHistoryTab() throws InterruptedException {
        ckdHistoryTab.click();
        Thread.sleep(1000);
    }
    public boolean HistoryOfDependentObjButton() {
        if (HistoryOfDependentObjButton.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
        public boolean TechnicalEnteriesButton() {
            if (TechnicalEnteriesButton.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        }
        public boolean FilterButton() {
            if (FilterButton.isDisplayed()) {
                return true;
            } else {
                return false;
            }
        }
    public boolean HistoryTable() {
        if (HistoryTable.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }
    public void ckdLogsTab(){
        warmup5();
        wait.until(ExpectedConditions.elementToBeClickable(ckdLogs));

        ckdLogs.click();

//        ckdLogs.click();
//        warmup5();
        writeProtectonLogging.click();
        warmup5();
        logsFromDate.clear();
        warmup5();
        logsSearch.click();
        warmup5();
    }
    public String loadedLog(){
        String data=loadeddata.getText();
        return data;
    }
    public void vpdTab(){
        wait.until(ExpectedConditions.elementToBeClickable(VPDdataTab));

        VPDdataTab.click();

//        warmup5();
//        VPDdataTab.click();
//        warmup5();
    }
    public void vpdadd(){
        addVPD.click();
        warmup5();
        vpdData.sendKeys("10006");
        warmup5();
        vpdContent.sendKeys("196086003022328100021102011000000000");
        warmup5();
        vpdSubmit.click();
        warmup5();
        vpdSave.click();
        warmup5();
    }
    public void vpdFilter(){
        vpdFilter.click();
        WebElement filterInput=driver.findElement(By.xpath("//*[@id='VehicleVPDData_070']/div/div[2]/form/div[2]/div/div/ng-form/div/div/input"));
        filterInput.sendKeys("10006");
        warmup5();
    }
    public void deletVpd(){
        warmup5();
        vpddelete.click();
        warmup5();
        vpdSave.click();
        warmup5();

    }

}



