package com.vedoc.qa.pages;

import com.vedoc.qa.base.TestBase;
import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class VehicleCoparisionPage extends TestBase {

    @FindBy(xpath = "//*[@id='-5a950ae9:153327f8e20:-8000']")
    WebElement searchInput;

    @FindBy(xpath = "//*[@id='VCSelectVehicle_620_search']")
    WebElement loadBaseModelVehiclebutton;

    @FindBy(xpath = "//*[@id='407666fd:11c6f9f75ae:-7fe2']")
    WebElement vehicleendNofrom;

    @FindBy(xpath = "//*[@id='407666fd:11c6f9f75ae:-7fe1']")
    WebElement vehicleendNoTo;

    @FindBy(xpath = "//*[@id='407666fd:11c6f9f75ae:-7ffe']")
    WebElement additionalCode;

    @FindBy(xpath = "//*[@id='VCSelectVehicle_620']/div/div[2]/form/div[1]/div/button[2]")
    WebElement selectComparsionvehicleButton;

    @FindBy(xpath = "//*[@id='VCSelectCodes_620']/div/div[2]/form/div[2]/div/div/div/div/a")
    WebElement firstDatacount;

    @FindBy(xpath = "//*[@id='vehicleOutlineResultCollection_vehicleOutlineResults']/tbody/tr[1]/td[1]")
    WebElement firtsrowTable;

    @FindBy(xpath = "//*[@id='VCSelectComparisonVehicle_630']/div/div[2]/form/div[1]/div/button[2]")
    WebElement compareVehiclebutton;

    @FindBy(xpath = "//*[@id='VCCompareVehicles_640']/div/div[2]/form/div[1]/div/button[3]")
    WebElement showallbutton;

    @FindBy(xpath = "//*[@id='VCCompareVehicles_640']/div/div[2]/form/div[2]/div/div/a")
    WebElement datalink2;

    @FindBy(xpath = "//*[@id='codeTable']/thead/tr/th[1]/input")
    WebElement uncheck;

    @FindBy(xpath = "//*[@id='vehicleComparisonTable']/thead/tr/th[4]/button/span")
    WebElement vehicleComparisionCSV;

    @FindBy(xpath="//table//thead//th[@id='dateColumnHeader']")
    WebElement dateModified_columnHeader;
    @FindBy(xpath="//table//tbody//tr[1]//td//a")
    WebElement getRow1_dateModified;

    public VehicleCoparisionPage() {
        PageFactory.initElements(driver, this);
    }

    public Boolean validateVehicleComparisionPage() {
        warmup();
        warmup1();
        warmup1();
        wait.until(ExpectedConditions.elementToBeClickable(searchInput));
        return searchInput.isDisplayed();


    }
    public void inputFinField(){
        warmup5();
        searchInput.sendKeys("W1T96342720711622");
        warmup5();

    }
    public void clickloadBaseModelVehiclebutton() {
        loadBaseModelVehiclebutton.click();
        warmup5();
        uncheck.click();
        warmup5();
    }
    public String datacount(){
        String dtcount= firstDatacount.getText();
        return dtcount;
    }
    public void vechicleEndNoRange(){
        vehicleendNofrom.sendKeys("602264");
        warmup5();
        vehicleendNoTo.sendKeys("612264");
        warmup5();
        additionalCode.sendKeys("N2E");
        warmup5();
        selectComparsionvehicleButton.click();

    }
    public void vechicleComparision(){
        firtsrowTable.click();
        warmup5();
        compareVehiclebutton.click();
        showallbutton.click();
    }
    public String compareVehicledatalink(){
        warmup5();
        String datalinkcnt=datalink2.getText();
        return datalinkcnt;
    }
    public String comparedvehicleData(){
        WebElement data= driver.findElement(By.xpath("//*[@id='VCCompareVehicles_640']/div/div[2]/form/div[2]/div/div/div"));
        String loadedData=data.getText();
        return loadedData;
    }
    public void reportForVehiclecomparision() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(vehicleComparisionCSV));
        warmup6();
        vehicleComparisionCSV.click();
        warmup6();
        String fileName=  GetDownloadedFileName_NewTab(1, 0);
        int dataCountInCSV= getRecordsCountInCSV(fileName);
        System.out.println("Verifying total records in table with number of entries in csv");
      //  Assert.assertEquals(getNumberOfEntries_graveyardSAA(), dataCountInCSV);
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
    public int getNumberOfEntries_graveyardSAA() throws InterruptedException {
        String entriesTxt = comparedvehicleData();
        String[] aEntriesText = entriesTxt.split(" / ");
        System.out.println(aEntriesText.length);
        String totalEntriesText = aEntriesText[1];
        int i=Integer.parseInt(totalEntriesText);
        return i;
    }
}
