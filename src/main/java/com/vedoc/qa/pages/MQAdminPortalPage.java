package com.vedoc.qa.pages;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.util.TestUtil;

public class MQAdminPortalPage extends TestBase {
	public MQAdminPortalPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	

	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(name="login")
	WebElement login;
	
	@FindBy(xpath ="//b[text()='TEST']")
	WebElement testLink;
	
	@FindBy(xpath ="//input[@placeholder='Search...']")
	WebElement searchText;
	
	@FindBy(xpath ="//xx-icon[@name='search']/i")
	WebElement searchIcon;
	
	@FindBy(xpath ="//*[@title='Put Message On Queue']")
	WebElement firstPlus;
	
	@FindBy(xpath ="//*[@data-toggle='Put Message']")
	WebElement first_Plus;
	
	@FindBy(xpath ="//div[@class='mat-select-arrow-wrapper']")
	WebElement codePage;
	
	@FindBy(xpath ="//span[text()='UTF-8 (1208)']")
	WebElement codePage_Utf8;
	
	@FindBy(xpath ="//div[@class='mat-select-value']")
	WebElement codePage_GetText;
	
	@FindBy(xpath ="//textarea")
	WebElement RawMqMessageFormat;
	
	@FindBy(xpath ="//button[text()='Write']")
	WebElement writeButton;
	
	@FindBy(xpath ="//button[text()='Ok']")
	WebElement okButton;

	@FindBy(xpath ="//*[@role='alert']")
	WebElement alertMessage;
	
	@FindBy(xpath="//input[@list='localSearchAutoComplete']")
	WebElement searchInput;
	
	@FindBy(xpath="//button[starts-with(@id,'VehicleSearch')]")
	WebElement searchButton;
	
	@FindBy(xpath="//li[starts-with(@data-ng-show,'viewControl.VehicleCodesArrangement.visible')]")
	WebElement codesTab;
	
	@FindBy(xpath="//a[text()='History']")
	WebElement historyTab;
	
	@FindBy(xpath="//span[text()='Technical entries']")
	WebElement technicalEntriesButton;	
	
	@FindBy(xpath="//table[@id='historyTable']//tr[@tabindex]")
	List<WebElement> historyTable;
	
	@FindBy(xpath="//tr[1]//td[1]")
	WebElement historyTableRow1;
	
	@FindBy(xpath="//div[text()='File Import']")
	WebElement fileImport;
	
	@FindBy(xpath="//label[text()='Select file']")
	WebElement selectFile;
	
    @FindBy(xpath = "//select[@data-ng-model='viewDataObject.majorAssemblySearchCategory']")
    WebElement majorAssembly_SearchDropDown;
    
    @FindBy(xpath="//input[@name='majAssySearch']")
	WebElement majorAssembly_SearchInput;
	
	@FindBy(xpath="//button[starts-with(@id,'MajAssySearch')]")
	WebElement majorAssembly_SearchButton;
	
	@FindBy(xpath="//*[contains(@data-ng-bind,'viewDataObject.highVoltageBattery.id')]")
	WebElement majorAssembly_HighVoltageBatteryNumber;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.vehicle.fin')]")
	WebElement vehicleData_Fin;
	
	@FindBy(xpath="//span[contains(@data-ng-bind,'viewDataObject.highVoltageBattery.reessCode')]")
	WebElement majorAssembly_ReessCode;
	
	@FindBy(xpath="//span[text()='History']")
	WebElement traceableParts_History;
	
	@FindBy(xpath="//form[contains(@name,'fModificationHistory')]//input")
	WebElement traceableParts_IdCode;
	
	@FindBy(xpath="//form[contains(@name,'fModificationHistory')]//span[text()='Search']")
	WebElement traceableParts_Search;
	
	public MQAdminPortalPage login(String un, String pwd){
		System.out.println(un);
		System.out.println(pwd);
		warmup6();
		wait.until(ExpectedConditions.elementToBeClickable(username));
		username.sendKeys(un);
	
		wait.until(ExpectedConditions.elementToBeClickable(password));
		password.sendKeys(pwd);
		login.click();
	 	
		return new MQAdminPortalPage();
	}
	

	public void clickTestLink()
	{
		warmup4();
		testLink.click();
		warmup4();
		warmup4();
		warmup4();

	}
	public void switchToTESTWindow()
	{
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		String p = it.next();
		String c= it.next();
		driver.switchTo().window(c);
		warmup5();
	}
	public void searchText_Afab()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.AFAB.VEDOC.01");
		//warmup5();
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));

	//	warmup4();
	}
	
	public void firstPlus()
	{
		firstPlus.click();
	}
	
	public void first_Plus()
	{
		first_Plus.click();
	}
	
	
	public void codePage()
	{
		codePage.click();
		codePage.sendKeys(Keys.ENTER);
	}
	
	public String codePage_GetText(){
		String codePage=	codePage_GetText.getText();
		return codePage;
	}
	
	public void RawMqMessageFormat_Afab()
	{
		RawMqMessageFormat.sendKeys("0 5V26953474                        00000 26.04.2022 21:31:45:76 77505 FDOK 77505026 R20426 X775052602005V26953474  3010004290                             Mercedes-Benz AG                  Flotten-Gebrauchtwagen-Center                                       Lilienthalstraße 8                D  04509  Wiedemar              FGC INTERN       02005V26953474  30129                       202204202021011320210113SA        20220420W1V447811138348797                     2021013         2021018                 20210200202101  202101132021013W1V447811138348797                          02005V26953474  301302021011320210200     44781113         V 250ED/K 4X2   3200CB01                        000                                                             2V 250ED/K 4X2   3200 269040XCB              +00000                  02005V26953474  30143                                         3334                                                                                                                                                                                  5V26953474    150+A1M +BA3 +BH1 +BS1 +CF8 +CL1 +CL3 +CL4 +CM2 +CU4 +C70 +D14 +ED4 +EL9 +ES2 +ES3 +EW6 +EX8 +EX9 +EY2 +EY5 +EY6 +EZ5 +EZ8 +E07 +E1D +E1E +E1F +E1T +E34 +E4S +E57 +E6M +E7B +E70 +FC1 +FG0 +FP3 +FP5 +FR8 +FS5 +FZ8 +F2Z         5V26953474    150+F48 +F65 +F66 +F69 +F72 +G43 +HH9 +HI1 +HX1 +HZ0 +HZ7 +H00 +H15 +H16 +H20 +IB6 +IG4 +IH6 +IK0 +IK3 +IL1 +IL4 +IL5 +IL6 +IN1 +JA1 +JA7 +JF1 +JH3 +JK5 +JP1 +JP2 +JW5 +JW8 +JX2 +J55 +KB5 +KP7 +LA2 +LB9 +LC4 +LC5 +LC6         5V26953474    150+LC7 +LC8 +LE1 +LG2 +LG4 +LG8 +LX5 +MG9 +MJ2 +MJ8 +MO6 +MS1 +MU6 +MX0 +M3E +M60 +RD9 +RG7 +RK8 +RM4 +RM7 +RX1 +RY2 +R22 +SA6 +SB1 +SB2 +SE4 +SE5 +SH1 +SH2 +SH9 +SZ7 +SZ8 +T14 +T19 +T70 +T74 +UR1 +US5 +US6 +US7 +U73         5V26953474    150+VD5 +VH1 +VL2 +V36 +V4Y +V41 +V44 +WG7 +WJ7 +WJ8 +WK7 +WL2 +WM3 +WQ3 +WV9 +WX6 +W16 +W17 +W32 +W64 +W68 +W70 +XA8 +XC9 +XM0 +XM4 +XM8 +XN0 +XO7 +XU1 +XW9 +XZ1 +X30 +X99 +Y10 +Y44 +ZC6 +ZH7 +Z3R +Z42                    02005V26953474  30190    0                               26999999L 00000T0000110 00000                          269040         040                        EURX                                                                              19  02005V26953474  3095051836664654920810636072021013 15701900        20201204      202101300982528VEB                    2021011320210118                                                                     202101132021011320210113         N\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Ispd()
	{
			RawMqMessageFormat.sendKeys("        FDOKVVAE00022022.04.21#11:49:58000042189871W1K2231686L001206                                     IWSSVPDTIWSSVPDTIMPO.DG 1114958354SONSTIGE00010000000302000000010187940278W1K2231686L001206 W1K2231686L001206062847645         504  197       879  05002        20211130        20211105                                                                                                                                              0039B87907FDOCODES0001000000079000000152AA5  BHA  B08  B36  B51  B53  FV   F223 GA   GHC  HA   H37  K17  LS2  L5C  ME10 M008 M014 M256 M30  N29  PBG  PCA  P07  P09  P20  P21  P34  P43  P47  P53  P64  R    RVQ  R01  R06  R8N  U01  U10  U19  U22  U25  U26  U35  U58  VL   VR   0B3  0U7  01U  02J  1B6  1U1  13U  14U  16U  17U  194  197U 2U3  22U  223  233  235  243  249  251B 266  275  276  282  292  293  297  302  32U  321  322  323  33U  351  355  355B 365  367  384  401  402  406  413  421  43B  439  447  452  453  477  481  489  49V  500A 501  502  504A 53B  534  540  543  561  562  581  582  587  596  61U  628  63B  634  641  7B5  712  72B  726  735  77B  772  78B  8S2  8XXL 802  810  82B  827  83B  854  868  871  879L 881  883  887  889  891  897  898  902  903  913  927  942  950  999  VPDATEN 000100000226080000042600001256830                                          00007HBM655N2504169                                  0002222390143140001D0127480                          00032HBM397MS012542                                  0004322390116130009E211023003953                     0004422390115130009E211017016863                     00046DB_MBW223SO_ASN_SEA_E71.02140x316000D6          0004771000000000000000000                            000622239012414000DA2110VI40A04382                   00075HM1193                                          00076HU7          D5KSFH3WPNXNKYXTTMVICDG4           000800E1PE203030111C320000001                        0008380DD4558CC84CC0AC164D518ECA645065B961436        001060008174004                                      100022239018111000032239008330T6421102350469         1001900090117050009E100090117052129410614101001002000100322239013706000032239003427350412210684EB0003     1008122390196060001522390091281521110200608          1011922390164100008D223901641000BAGI012546000000000001012222390100160002721110408000002740000             1012322390101160002721110808000001470000             1013029790172010001529790043071521102200749          1013822390194060000301274413                         101580009013015000152127818774                       101787893409427000FE22030200000119901                1019500090195040009E2111210013715861                 10200302E                               MRG1PI       102012E2E                               MRG1PI       102022E2C                               MRG1PI       102033432                               MRG1PI       102043331                               MRG1PI       10205302D                               MRG1PI       102120008357803000620078220137103028002000235000000  102170003403403000382129900253                       102180008306804000F5211029120224121A0122172G22824B101102202239014414000220521A1400063                     102242239019113000032127753F001021400017000DY00100074102410009015515000AA2203040082                       10242000901411800046A2C757586290000221A2301470       102927259012000000232107080007                       103152239015315000122239005028182202171950           1031624790077080001524790077081521101439368          1040020690176070009ERB11HRWAE21431000480             10401RAMSES       IMEI 355000100420562               10402RAMSES       IMSI 204047159205631               10403RAMSES       ICCID89314404001054221915          10404RAMSES       TELNR000000000000000               10405RAMSES       EID1 890330240632009433010000      10406RAMSES       EID2 26658679                      1041722390106130003CA2C78053500Q01121A0904480000000001041822390107130003CA2C78053600Q01121A1002150000000001041922390160110003CA2C76287110Q112192610086         1042022390165070003CA2C77956800Q1121A2510097         1042322390154030003CA2C77013204Q112182811862         1042422390154030003CA2C77013204Q112190212083         1042522390159140009E16628814002111280066             104260009019816000EFS680746000H214410446             104270009019816000EFS680746000H214410448             104280009019816000EFS680745710G214060744             104290009019816000EFS680745710G214060792             104362239018713000EF2239006128EF2112170393           10441PXL_FL223    00004B0000FF2626262C2C2826001A2233 10442PXL_FL223    3E485562625E585954525B5D5D6161635B 10443PXL_FL223    5648453423201F202D2D3A414D5759504C 10444PXL_FL223    4B4241494B4C565960524A3F3D31291B19 10445PXL_FL223    1D262D3A364B4854575C524F4C4B4E4B4E 10446PXL_FL223    4E4E4A4F5E504A4B3634312216         10451PXL_FR223    00004B0000FF2626262C2C2826001B2031 10452PXL_FR223    3F43546262585A505050585F5E5E5E635A 10453PXL_FR223    574C4A3B25231C1F2B283A3C4C51594C47 10454PXL_FR223    47443F474B4E4E52594C4A3D392D271A19 10455PXL_FR223    212730403D4A4A53565F52525653504F51 10456PXL_FR223    53524D5257514C513C37332416         10461HLI_FL223    641E00000000000000640226640316     10462HLI_FL223    64031664028A000000                 10463HLI_FR223    641E0000000000000064026C640384     10464HLI_FR223    64031664028A000000                 10470RAMSES       RUICC00000000000000000000          104752239012910000DA108VICL688555                    1047622390107080003CA2C7594462100A21A0100574         1047722390109080003CA2C7594511800A21A0200609         1047822390112080003CA2C7595221700A21A1900DB8         1047922390114080003CA2C7595261700A21913003FF         1048422390185120009E01012702159967                   1048522390163140009E16629114002110070216             104972239012907000032239004727311910210165EB0003     104982239015614000C4000000000052100536823001         10501SEAT_D223    7DB57FF97DAC7FF97FFC7FFA80007F18   10502SEAT_P223    7E0A7FF97DAC7FFB7FFB7FFBFFFFFFFF   10503SEAT_D223    7FFBFFFFFFFF                       10504SEAT_P223    7FFB7FF97EDC                       10505SEAT_D223    7DB57FF97DAC7FF97FFC7FFA80007F18   10506SEAT_P223    7E0A7FF97DAC7FFB7FFB7FFBFFFFFFFF   10507SEAT_D223    7FFBFFFFFFFF                       10508SEAT_P223    7FFB7FF97EDC                       10509SEAT_RL223   FFFFFFFF7F687F307FFAFFFF7EF17D72   10510SEAT_RR223   FFFFFFFF7FF17F7F7FFAFFFFFFFFFFFF   10511SEAT_RL223   7FFAFFFFFFFFFFFF                   10512SEAT_RR223   7FFBFFFFFFFFFFFF                   10513SEAT_RL223   FFFFFFFF7F687F307FFAFFFF7EF17D72   10514SEAT_RR223   FFFFFFFF7FF17F7F7FFAFFFFFFFFFFFF   10515SEAT_RL223   7FFAFFFFFFFFFFFF                   10516SEAT_RR223   7FFBFFFFFFFFFFFF                   10517SEAT_D223    14440D1A1300081B12710A16FFFFFFFF   10518SEAT_P223    16010E001300081B13850A4AFFFFFFFF   10519SEAT_D223    1D141400                           10520SEAT_P223    201E1400                           10521SEAT_RL223   FFFFFFFFFFFFFFFF18510E0017000B06   10522SEAT_RR223   FFFFFFFFFFFFFFFF1D400F0017000B06   10523SEAT_RL223   FFFFFFFF1300130013000D08           10524SEAT_RR223   FFFFFFFFFFFFFFFFFFFFFFFF           10525SEAT_RL223   FFFFFFFF                           10526SEAT_RR223   FFFFFFFF                           1055122390119120000792624TKK001H2                    1055222390138120000792171UGC000DM                    1055322390132120000792624TKK001BS                    1055422390147120000792624TJU000UY                    105620997608903000AE330BTZQ04A0002F2                 105630997609003000AE300BTZQ04A00050E                 105640997609103000AE310BTZQ04A000509                 105650997609203000AE320BTZQ04A000509                 10570223901051600038PA1707M0147350                   10571223901051600038PA1707M0147348                   105732239010310000434421000092272008                 105752239016408000D710811212053585010000000000000000010576223901781200048212651523                        1057700090129160000337258100000030712111050219000253 10579223901211400048PEN1211019100567                 1058100090102200009Dihipoljioh                       106082239019305000825CEF11R15235868400210929000000000106092239019305000825CEF11R1523719440021100900000000010628223905181000048PEN1210824101527                 10629223905181000048PEN1211212103257                 106312239002703000F2287101277W223Q1RX25600042        1064022386007039C94ZC082130800274                    1064122386008039C94ZC082131200147                    106530009064512000E621101200150                      106582239052000000F514020969                         1066200090141170001C30403430050000000000000000000000010679000901161300015212855083446                     10701D78924EA000241                                  10716SWSP223      09990122020000792907UJH0005N       10717SWSP223      09990523080000792772UJ5000LF       10718SWSP223      09990523080000792772UJ5000LK       107263010212239060904030111123100259100              107272710212239061004030111123200256694              107310009050815000150000001061904712270020400119020001073222390579100000321110521000000000103             107360009055912C771312000000A21A1902342              107370009059412C771312000000A2162900006              107380009055912C771312000000A2182000393              107390009055912C771312000000A2181903359              10750ORC223       37353244373743313438353200000000   10751ORC223       39353244373743304632413700000000   10752ORC223       37463331394437313738383400000000   10753ORC223       37463331394437313938363500000000   10754ORC223       42423034413835453330353500000000   10755ORC223       43373034463346313436323500000000   10756ORC223       42423034413835453231323600000000   10757ORC223       43373034463346313238313900000000   10761HU7          62E6F078FD7F                       10762HU7          62E6F018FD7F                       10763HU7          60E6F0D8FD7F                       10764HU7          000000000000                       10765HU7          60E6F0D8FD81                       10810CPC3         000000000000                       10850BMS40        74                                 108690076 01 20                                      20002n3h220ba07ub_31sk00002AT31                      300012569011000140005                                300020009013015140001                                300032239024522140019                                300042239022219140002                                300050009023684140001                                300092069020704140027                                300122239029622140004                                300212069025604140053                                300232069020304140048                                300242069028404140012                                300280009028182140001                                300312979021904140002                                300322239022612140002                                300362069025704140003                                300372239023422140003                                300432479007708140004                                300442236708100140001                                300492239022612140002                                300597899024202140002                                300642239021221140014                                300652239023922140002                                300662239023922140002                                300682069027604140011                                300692069027604140011                                300702069027704140009                                300712069027704140009                                300792239026011140001                                300802239025911140001                                300812979023104140002                                300902239022413140001                                301092239026322140001                                301102239020821140004                                301142239020313140001                                301152239020413140001                                301172239020513140001                                301182239020613140001                                301212239022815140006                                301222239024413140001                                301232239024513140001                                301280009019504140006                                301292239029311140002                                301362239027620140001                                301382239029311140002                                301397259012000140001                                301492239026917140001                                301550009025367140001                                301592979028003140001                                301600009025383140014                                301710009021576140002                                301740009021576140002                                301750009025574140003                                301780009025574140003                                301832239022408140001                                301842239022408140001                                301912239023719140001                                301922239052000140004                                301982069026206140002                                302102239022618140001                                302272230031799140002                                302282230031799140002                                302292230031799140002                                302302230031799140002                                302430009028381140004                                302452239021619140001                                302532239026717140002                                302542239021322140001                                302810009050815140001                                40001106A4F3D                                        4000267780943                                        400047AE2E307                                        400050C0011D3                                        40009B1C07D5E                                        400597112F265                                        40128E232815F                                        40139EB846CE2                                        401555AEB0000                                        4019111077402                                        500102069016107   ZGW   GW223                        500112069025704                                      500402369019000   HU    HU7                          500412979042800   2979021604   2979021904            500422979022104   2239031104   2239039902            500432239036203   2239029019   2979033901            500442979022304   2979022604                         501202239014314   SND   SND7                         501212239043601   2239023822   2239030404            501222239038001                                      501300009011705   NAG   VGS2NAG3M                    501310009023684                                      501502239019406   EPS   EPS223                       501512239027119                                      501902239018111   ORC   ORC223                       501912239040001   2239029622   2239032101            501922239032201                                      502002569011000   MSG   MRG1PI                       502012569040400   2569020401   2569032201            502102239013706   ESP   ESP223                       502112239022219                                      502202239016410   KI    IC223                        502212239049101   2239024522   2239024622            502222239024722   2239024822   2239024922            502232239025022                                      502802979017201   BCF   BC_F206                      502812069042800   2069020304   2069020504            502902239019606   BCR   BC_R206                      502912069028404   2069042600                         503002239011006   KLA   HVAC223                      503012069020704                                      503302239011311   TS1   DMD223                       503312069027604                                      503402239011111   TS2   DMP223                       503412069027604                                      503502239011611   TS3   DMRL223                      503512069027704                                      503602239011811   TS4   DMRR223                      503612069027704                                      503700009019218   DBE   OHCM223                      503710009028182                                      504102239010613   FDSL  MCMS_FL223                   504112239024413                                      504202239010713   FDSR  MCMS_FR223                   504212239024513                                      504302239016011   FDSHL MCMS_RL223                   504312239031502   2239026011                         504402239016507   FDSHR MCMS_RR223                   504412239031402   2239025911                         504602239011513   LRL   HLI_FL223                    504612239022612                                      504702239011613   LRR   HLI_FR223                    504712239022612                                      505102239012414   ZDP   DISPC223                     505112239020123                                      505302239016408   KLA_H HVAC_R223                    505312069025803   2069021001                         505402239016212   FU    RSU7                         505412979042900   2979023004   2979023104            505422979023204   2239031304   2979034001            505432979023404   2979034101                         505602239010310   ASBMDBCTRLU223                     505612239021619   2239024519                         506202239019113   IDC   IDC223                       506212239040201   2239021221                         506300009014118   LRR   LRR223                       506310009047202   0009029782                         506702239010016   GSL   RBTMFL223                    506712239023922                                      506802239010116   GSR   RBTMFR223                    506812239023922                                      507000009013015   TDS   FSCM_GEN6                    507010009043100   0009027171   0009032848            507502239016707   PFD   MCMS_P223                    507512239034602   2239022413                         508702239017414   PTCM  PTCM223                      508712239023422                                      508802239017812   MRM   SCCM223                      508812239025822                                      509100009019816   MMRFL MMR223_FL                    509110009021576                                      509400009019816   MMRFR MMR223_FR                    509410009021576                                      509500009019816   MMRRR MMR223_RR                    509510009025574                                      509800009019816   MMRRL MMR223_RL                    509810009025574                                      510000009019504   CPC   CPC3                         510010009046202   2569028201                         510207899013801   HV 1  BMS40                        510217899049300   7899024202   7899030001            510300003403403   DCDC  DCDC223                      510310009020048   0009042101                         510602239014414   SPC   SPC223                       510612239022815   2239037702   2239038703            510622239044200                                      510902239010708   SFD   SEAT_D223                    510912239034503   2239020313                         511002239010908   SFP   SEAT_P223                    511012239034503   2239020413                         511302239018713   MPC   SMPC223                      511312239020821                                      511502239010516   DSPRL DISPRL7                      511512239028822                                      511602239010516   DSPRR DISPRR7                      511612239028822                                      512707259012000   TUBE  INV1G40                      512717259040700   7259022200   7259033200            513002239011208   SRL   SEAT_RL223                   513012239034703   2239020513                         513102239011408   SRR   SEAT_RR223                   513112239034703   2239020613                         513700009015515   OBC   OBL223_GEN4                  513710009025367                                      514602069016007   EZS   EZS223                       514612069025604                                      514802239015315   ASD   TSSR223                      514812239027620                                      514902239019305   PXLL  PXL_FL223                    514912239029311                                      515002239019305   PXLR  PXL_FR223                    515012239029311                                      515302239016802   AVAS  AVAS223                      515312979028003   2979032401   2979042700            516400009012916   PAS   PARK223                      516410009049902   0009025383   0009034860            517800999012202   LRE   SWSP223                      517810999025500                                      517902239015914   WMI   WMI7D                        517912239026917                                      518602069017607   RAMSESRAMSES                       518612069026206   2069023304   0009028875            518620009028975   0009029075   0009027076            518630009029275   0009029375   0009029475            518640009029575   0009029675   0009024572            518650009024672   0009020577   0009029875            518660009024972   0009025072   0009025172            518670009025272   0009025372   0009025472            518680009025572   0009025672                         520202239015403   PMSHL PMCU_RL223                   520212239030501   2239022408                         520302239015403   PMSHR PMCU_RR223                   520312239030501   2239022408                         520402239012910   OMS   OMSH223                      520412239021322   2239021422   2239021522            520422239021622                                      520602239018512   DKI   DISPD223ENTRY                520612239022111                                      520702239016314   WMIR  WMI7R                        520712239026322                                      520902239012907   EBB   EBB223                       520912239023719                                      521002239015614   CCH   CCRAD223                     521012239026717                                      521402239011912   SIS-VLDSM_MS_D223                  521412239020913                                      521502239013812   SIS-VRDSM_MS_P223                  521512239020913                                      521602239013212   SIS-HLDSM_MS_RL223                 521612239020913                                      521702239014712   SIS-HRDSM_MS_RR223                 521712239020913                                      522302239052000   HFA   HFA223                       523002239012114   FHS   DSM_WM_FR223                 523012239028715                                      524000009010220   AUBC  DCDC_R223                    524010009029882   0009041803                         525602239051810   FH-RL DSM_WRB_RL223                525702239051810   FH-RR DSM_WRB_RR223                525902239013802   OCM   OCM223                       525912239040800   2239022001   2239030702            528800009011613   MAM   MAM_X                        528810009021755                                      529200009014117   HOSWD HOSWD223                     529210009028391                                      529802239017814   MVC   WPRA223                      529812239022618                                      89942Test_abgeschlossen                              89944Test_abgeschlossen                              89946Test_abgeschlossen                              VPDSOLI 0001000000003000000000FZEGDRCK0001000000003500000001NN   FZEGDOK_0002000000014300000001            R     223168    AAAAA5AA220                      11100000                                            TYPSDATA00020000000393000000010187940278197   2022                                          3070        1370 1700 R2S                      1,0                                                                                                                      5  256930           2999                                          RUE-DE.MT02.00994                                                  FASPTEDA00020000000030       0\r\n"
					+ "");
			warmup4();
			warmup4();
	}
	
	public void RawMqMessageFormat_Vega()
	{
		RawMqMessageFormat.sendKeys("W1K1183871N219296W1K1183871N21929620210531");
	}
	
	// Changed id is high voltage battery id
	// Create high voltage battery id in administration - major assemblies - major assembly of the high-voltage battery type
	
	public void RawMqMessageFormat_Pla()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-8\"?><ns1:storeTransmissionRequest xmlns:ns1=\"http://majorassembly.vedoc.daimler.com/ai\" category=\"MajorAssemblyAdapter\" version=\"2.2.10\">\r\n"
				+ "<requestHeader context=\"\" credentials=\"\" userId=\"VEDOC_tec_C9\"/>\r\n"
				+ "<transmission modelDesignation=\"725017\" id=\"72501704820590\" dataCardAvailable=\"true\" objectId=\"0\" delta=\"true\">\r\n"
				+ "<activeState electroEngineStatorId=\"22096004724411\" electroEngineRotorId=\"2210900028301\" plant=\"P0100\"/>\r\n"
				+ "</transmission>\r\n"
				+ "<executionSettings date=\"currentDateTime\" causation=\"plant\" issueThreshold=\"err\" source=\"XZ0.VEDOC.U.PLA.IN\" systemPriority=\"2\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_C9\"/>\r\n"
				+ "</ns1:storeTransmissionRequest>");	
	}
	
	
	public void RawMqMessageFormat_Gtc()
	{
		RawMqMessageFormat.sendKeys("WDD2130421A000525J");
	}
	
	public void RawMqMessageFormat_Pkw_MBFS_Tuscaloosa()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:storeHighVoltageBatteryRequest category=\"MajorAssemblyAdapter\" version=\"21.4.1.1\" xmlns:ns2=\"http://majorassembly.vedoc.daimler.com/ai\"><requestHeader userId=\"VEDOC_tec_DX\"/><highVoltageBattery dataCardAvailable=\"true\" id=\"789080CA000530\" productionSerialNumber=\"178934004272211500022118000000000000\" reessCode=\"0FLPE004020111C4S0000006\"><activeState plant=\"P1384\"><modules reessCode=\"001MEAUK000001BCV0700235\"><cells reessCode=\"001CE330000001BBH6003563\"/><cells reessCode=\"001CE330000001BBK6002090\"/><cells reessCode=\"001CE330000001BBK6000222\"/><cells reessCode=\"001CE330000001BBH6005499\"/><cells reessCode=\"001CE330000001BBH6005050\"/><cells reessCode=\"001CE330000001BBK6000047\"/><cells reessCode=\"001CE330000001BBH6003452\"/><cells reessCode=\"001CE330000001BBK6000069\"/><cells reessCode=\"001CE330000001BBH6005026\"/><cells reessCode=\"001CE330000001BBK6000256\"/><cells reessCode=\"001CE330000001BBH6004264\"/><cells reessCode=\"001CE330000001BBK6002833\"/><cells reessCode=\"001CE330000001BBK6000245\"/><cells reessCode=\"001CE330000001BBK6001918\"/><cells reessCode=\"001CE330000001BBH6003569\"/><cells reessCode=\"001CE330000001BBK6002687\"/><cells reessCode=\"001CE330000001BBH6004525\"/><cells reessCode=\"001CE330000001BBK6001290\"/></modules><modules reessCode=\"001MEAUK000001BCV0700238\"><cells reessCode=\"001CE330000001BBH6003627\"/><cells reessCode=\"001CE330000001BBK6002395\"/><cells reessCode=\"001CE330000001BBH6003502\"/><cells reessCode=\"001CE330000001BBK6001505\"/><cells reessCode=\"001CE330000001BBH6003622\"/><cells reessCode=\"001CE330000001BBK6002397\"/><cells reessCode=\"001CE330000001BBH6005368\"/><cells reessCode=\"001CE330000001BBK6000612\"/><cells reessCode=\"001CE330000001BBH6005367\"/><cells reessCode=\"001CE330000001BBK6001711\"/><cells reessCode=\"001CE330000001BBH6003484\"/><cells reessCode=\"001CE330000001BBK6000297\"/><cells reessCode=\"001CE330000001BBH6005210\"/><cells reessCode=\"001CE330000001BBK6001959\"/><cells reessCode=\"001CE330000001BBH6004279\"/><cells reessCode=\"001CE330000001BBK6001987\"/><cells reessCode=\"001CE330000001BBH6005255\"/><cells reessCode=\"001CE330000001BBK6000589\"/></modules><modules reessCode=\"001MEAUK000001B9E0300084\"><cells reessCode=\"001CE330000001B8W3804040\"/><cells reessCode=\"001CE330000001B8Y3811186\"/><cells reessCode=\"001CE330000001B8W3803444\"/><cells reessCode=\"001CE330000001B8Y3810685\"/><cells reessCode=\"001CE330000001B8W3803090\"/><cells reessCode=\"001CE330000001B8C3803736\"/><cells reessCode=\"001CE330000001B8Y3807494\"/><cells reessCode=\"001CE330000001B8W3803686\"/><cells reessCode=\"001CE330000001B8W3803541\"/><cells reessCode=\"001CE330000001B8W3803494\"/><cells reessCode=\"001CE330000001B8Y3810688\"/><cells reessCode=\"001CE330000001B8W3803078\"/><cells reessCode=\"001CE330000001B8Y3806651\"/><cells reessCode=\"001CE330000001B803805295\"/><cells reessCode=\"001CE330000001B8W3803565\"/><cells reessCode=\"001CE330000001B8Y3811247\"/><cells reessCode=\"001CE330000001B8Y3810737\"/><cells reessCode=\"001CE330000001B803805323\"/></modules><modules reessCode=\"001MEAUK000001B9F0300230\"><cells reessCode=\"001CE330000001B923809240\"/><cells reessCode=\"001CE330000001B923809709\"/><cells reessCode=\"001CE330000001B923809393\"/><cells reessCode=\"001CE330000001B923809439\"/><cells reessCode=\"001CE330000001B913810267\"/><cells reessCode=\"001CE330000001B923809248\"/><cells reessCode=\"001CE330000001B923808905\"/><cells reessCode=\"001CE330000001B913810550\"/><cells reessCode=\"001CE330000001B923809335\"/><cells reessCode=\"001CE330000001B923809526\"/><cells reessCode=\"001CE330000001B923809747\"/><cells reessCode=\"001CE330000001B923809522\"/><cells reessCode=\"001CE330000001B913803739\"/><cells reessCode=\"001CE330000001B923809572\"/><cells reessCode=\"001CE330000001B913807409\"/><cells reessCode=\"001CE330000001B923807754\"/><cells reessCode=\"001CE330000001B923809712\"/><cells reessCode=\"001CE330000001B923809524\"/></modules><modules reessCode=\"001MEAUK000001BCK0700186\"><cells reessCode=\"001CE330000001B9M6008215\"/><cells reessCode=\"001CE330000001B9J6008216\"/><cells reessCode=\"001CE330000001B8D5900878\"/><cells reessCode=\"001CE330000001B9J6010391\"/><cells reessCode=\"001CE330000001B9M6005887\"/><cells reessCode=\"001CE330000001B8H5900622\"/><cells reessCode=\"001CE330000001B9K6009578\"/><cells reessCode=\"001CE330000001B8K5910129\"/><cells reessCode=\"001CE330000001B9M6006918\"/><cells reessCode=\"001CE330000001B8B5905893\"/><cells reessCode=\"001CE330000001B8C5904664\"/><cells reessCode=\"001CE330000001B9J6000501\"/><cells reessCode=\"001CE330000001B9J6007347\"/><cells reessCode=\"001CE330000001B8E5907129\"/><cells reessCode=\"001CE330000001B8L5902725\"/><cells reessCode=\"001CE330000001B8L5902572\"/><cells reessCode=\"001CE330000001B9F6009475\"/><cells reessCode=\"001CE330000001B8K5907425\"/></modules><modules reessCode=\"001MEAUK000001B9C0300299\"><cells reessCode=\"001CE330000001B8G3810020\"/><cells reessCode=\"001CE330000001B803802027\"/><cells reessCode=\"001CE330000001B813803469\"/><cells reessCode=\"001CE330000001B8G3809951\"/><cells reessCode=\"001CE330000001B8G3810622\"/><cells reessCode=\"001CE330000001B8G3810641\"/><cells reessCode=\"001CE330000001B8G3810766\"/><cells reessCode=\"001CE330000001B8G3810781\"/><cells reessCode=\"001CE330000001B8W3802820\"/><cells reessCode=\"001CE330000001B8W3802865\"/><cells reessCode=\"001CE330000001B8W3803771\"/><cells reessCode=\"001CE330000001B8X3806433\"/><cells reessCode=\"001CE330000001B8Y3805699\"/><cells reessCode=\"001CE330000001B8Y3806004\"/><cells reessCode=\"001CE330000001B8Y3806637\"/><cells reessCode=\"001CE330000001B8Y3806665\"/><cells reessCode=\"001CE330000001B8Y3806891\"/><cells reessCode=\"001CE330000001B8Y3807007\"/></modules><modules reessCode=\"001MEAUK000001BCV0700246\"><cells reessCode=\"001CE330000001BBH6005687\"/><cells reessCode=\"001CE330000001BBK6000167\"/><cells reessCode=\"001CE330000001BBH6003516\"/><cells reessCode=\"001CE330000001BBK6002452\"/><cells reessCode=\"001CE330000001BBH6003285\"/><cells reessCode=\"001CE330000001BBK6002282\"/><cells reessCode=\"001CE330000001BBH6003455\"/><cells reessCode=\"001CE330000001BBK6002433\"/><cells reessCode=\"001CE330000001BBH6004221\"/><cells reessCode=\"001CE330000001BBH6004884\"/><cells reessCode=\"001CE330000001BAF6008113\"/><cells reessCode=\"001CE330000001BBK6002294\"/><cells reessCode=\"001CE330000001BBH6002943\"/><cells reessCode=\"001CE330000001BBK6000143\"/><cells reessCode=\"001CE330000001BBH6003460\"/><cells reessCode=\"001CE330000001BBK6001970\"/><cells reessCode=\"001CE330000001BBH6005766\"/><cells reessCode=\"001CE330000001BBH6003535\"/></modules><modules reessCode=\"001MEAUK000001B9F0300067\"><cells reessCode=\"001CE330000001B7P3807230\"/><cells reessCode=\"001CE330000001B7R3803538\"/><cells reessCode=\"001CE330000001B923800944\"/><cells reessCode=\"001CE330000001B6W3804168\"/><cells reessCode=\"001CE330000001B923800994\"/><cells reessCode=\"001CE330000001B913810846\"/><cells reessCode=\"001CE330000001B913810320\"/><cells reessCode=\"001CE330000001B923801639\"/><cells reessCode=\"001CE330000001B923800559\"/><cells reessCode=\"001CE330000001B923802629\"/><cells reessCode=\"001CE330000001B913802638\"/><cells reessCode=\"001CE330000001B923801104\"/><cells reessCode=\"001CE330000001B913809618\"/><cells reessCode=\"001CE330000001B8X3811140\"/><cells reessCode=\"001CE330000001B923801382\"/><cells reessCode=\"001CE330000001B923802684\"/><cells reessCode=\"001CE330000001B913803926\"/><cells reessCode=\"001CE330000001B913800208\"/></modules><modules reessCode=\"001MEAUK000001B9F0300069\"><cells reessCode=\"001CE330000001B923801368\"/><cells reessCode=\"001CE330000001B913810855\"/><cells reessCode=\"001CE330000001B923802601\"/><cells reessCode=\"001CE330000001B923801855\"/><cells reessCode=\"001CE330000001B923801694\"/><cells reessCode=\"001CE330000001B923801814\"/><cells reessCode=\"001CE330000001B923801710\"/><cells reessCode=\"001CE330000001B923801542\"/><cells reessCode=\"001CE330000001B923802010\"/><cells reessCode=\"001CE330000001B913810653\"/><cells reessCode=\"001CE330000001B923801426\"/><cells reessCode=\"001CE330000001B923801734\"/><cells reessCode=\"001CE330000001B923801971\"/><cells reessCode=\"001CE330000001B923801560\"/><cells reessCode=\"001CE330000001B913801185\"/><cells reessCode=\"001CE330000001B923801405\"/><cells reessCode=\"001CE330000001B913804102\"/><cells reessCode=\"001CE330000001B913812598\"/></modules><modules reessCode=\"001MEAUK000001BCV0700218\"><cells reessCode=\"001CE330000001B9P6005293\"/><cells reessCode=\"001CE330000001BBK6002338\"/><cells reessCode=\"001CE330000001BBC6005454\"/><cells reessCode=\"001CE330000001BBK6001737\"/><cells reessCode=\"001CE330000001BBC6002952\"/><cells reessCode=\"001CE330000001BBK6002581\"/><cells reessCode=\"001CE330000001BBA6004588\"/><cells reessCode=\"001CE330000001BBK6002202\"/><cells reessCode=\"001CE330000001BB26009206\"/><cells reessCode=\"001CE330000001BBK6001512\"/><cells reessCode=\"001CE330000001BBB6002635\"/><cells reessCode=\"001CE330000001BBK6000958\"/><cells reessCode=\"001CE330000001BBC6003562\"/><cells reessCode=\"001CE330000001BBK6002332\"/><cells reessCode=\"001CE330000001BBC6003156\"/><cells reessCode=\"001CE330000001BBK6001524\"/><cells reessCode=\"001CE330000001BBB6001844\"/><cells reessCode=\"001CE330000001BBK6001506\"/></modules><modules reessCode=\"001MEAUK000001BCV0700209\"><cells reessCode=\"001CE330000001BBK6002929\"/><cells reessCode=\"001CE330000001BBL6002118\"/><cells reessCode=\"001CE330000001BBH6003349\"/><cells reessCode=\"001CE330000001BBL6003383\"/><cells reessCode=\"001CE330000001BAR6006637\"/><cells reessCode=\"001CE330000001BBH6003694\"/><cells reessCode=\"001CE330000001BAR6007181\"/><cells reessCode=\"001CE330000001BBL6002180\"/><cells reessCode=\"001CE330000001BBK6000659\"/><cells reessCode=\"001CE330000001BBL6003385\"/><cells reessCode=\"001CE330000001BBK6000629\"/><cells reessCode=\"001CE330000001BBL6003456\"/><cells reessCode=\"001CE330000001BBL6000154\"/><cells reessCode=\"001CE330000001BBH6003817\"/><cells reessCode=\"001CE330000001BBK6002894\"/><cells reessCode=\"001CE330000001BBL6003178\"/><cells reessCode=\"001CE330000001BA96001724\"/><cells reessCode=\"001CE330000001BBL6003155\"/></modules><modules reessCode=\"001MEAUK000001BC60300421\"><cells reessCode=\"001CE330000001B363801151\"/><cells reessCode=\"001CE330000001B3S3807366\"/><cells reessCode=\"001CE330000001B3S3806547\"/><cells reessCode=\"001CE330000001B3K3801454\"/><cells reessCode=\"001CE330000001B3K3801345\"/><cells reessCode=\"001CE330000001B3K3801655\"/><cells reessCode=\"001CE330000001B3G3806337\"/><cells reessCode=\"001CE330000001B3J3806961\"/><cells reessCode=\"001CE330000001B3J3806086\"/><cells reessCode=\"001CE330000001B3L3808530\"/><cells reessCode=\"001CE330000001B3K3802633\"/><cells reessCode=\"001CE330000001B3K3807792\"/><cells reessCode=\"001CE330000001B3L3803248\"/><cells reessCode=\"001CE330000001B3J3804626\"/><cells reessCode=\"001CE330000001B3K3805463\"/><cells reessCode=\"001CE330000001B3K3806636\"/><cells reessCode=\"001CE330000001B3K3802099\"/><cells reessCode=\"001CE330000001B3H3804842\"/></modules></activeState></highVoltageBattery><executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_DX\"/></ns2:storeHighVoltageBatteryRequest>\r\n"
				+ "");	
	}

	public void RawMqMessageFormat_Pkw_Mbfs_Peking()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns2:storeHighVoltageBatteryRequest category=\"MajorAssemblyAdapter\" version=\"19.3.1.1\" xmlns:ns2=\"http://majorassembly.vedoc.daimler.com/ai\"><requestHeader userId=\"VEDOC_tec_DK\"/><highVoltageBattery dataCardAvailable=\"true\" productionSerialNumber=\"129334078002211700021104003000000000\" reessCode=\"079PE313010111C4V0000021\"><activeState plant=\"P1040\"><modules reessCode=\"079ME0B2A23211C4V0000049\"><cells reessCode=\"001CE200000001C1N5300345\"/><cells reessCode=\"001CE200000001C1N5300189\"/><cells reessCode=\"001CE200000001C1N5350100\"/><cells reessCode=\"001CE200000001C1N5350166\"/><cells reessCode=\"001CE200000001C1N5300339\"/><cells reessCode=\"001CE200000001C1M5305980\"/><cells reessCode=\"001CE200000001C1M5305940\"/><cells reessCode=\"001CE200000001C1N5300045\"/><cells reessCode=\"001CE200000001C1N5300088\"/><cells reessCode=\"001CE200000001C1N5300181\"/><cells reessCode=\"001CE200000001C1M5305994\"/><cells reessCode=\"001CE200000001C1M5355504\"/><cells reessCode=\"001CE200000001C1J5304692\"/><cells reessCode=\"001CE200000001C1M5354781\"/><cells reessCode=\"001CE200000001C1N5300090\"/><cells reessCode=\"001CE200000001C1M5353029\"/><cells reessCode=\"001CE200000001C1M5305999\"/><cells reessCode=\"001CE200000001C1N5350171\"/><cells reessCode=\"001CE200000001C1M5305975\"/><cells reessCode=\"001CE200000001C2F5353380\"/><cells reessCode=\"001CE200000001C1N5300097\"/><cells reessCode=\"001CE200000001C1M5306027\"/><cells reessCode=\"001CE200000001C1N5350114\"/><cells reessCode=\"001CE200000001C2F5354693\"/><cells reessCode=\"001CE200000001C1N5350110\"/><cells reessCode=\"001CE200000001C2F5354874\"/><cells reessCode=\"001CE200000001C2F5303883\"/><cells reessCode=\"001CE200000001C2F5355111\"/><cells reessCode=\"001CE200000001C1N5300091\"/><cells reessCode=\"001CE200000001C2F5354022\"/><cells reessCode=\"001CE200000001C2F5303888\"/><cells reessCode=\"001CE200000001C255351564\"/><cells reessCode=\"001CE200000001C2F5354451\"/><cells reessCode=\"001CE200000001C2A5351231\"/><cells reessCode=\"001CE200000001C2F5354423\"/><cells reessCode=\"001CE200000001C2F5355113\"/><cells reessCode=\"001CE200000001C2F5352711\"/><cells reessCode=\"001CE200000001C245301741\"/><cells reessCode=\"001CE200000001C2F5354236\"/><cells reessCode=\"001CE200000001C245351437\"/><cells reessCode=\"001CE200000001C1N5300035\"/><cells reessCode=\"001CE200000001C245301725\"/><cells reessCode=\"001CE200000001C2F5355199\"/><cells reessCode=\"001CE200000001C2D5352780\"/><cells reessCode=\"001CE200000001C1J5352284\"/><cells reessCode=\"001CE200000001C2F5355112\"/><cells reessCode=\"001CE200000001C2F5355094\"/><cells reessCode=\"001CE200000001C2D5303512\"/><cells reessCode=\"001CE200000001C1N5300350\"/><cells reessCode=\"001CE200000001C1J5303159\"/><cells reessCode=\"001CE200000001C1N5300167\"/><cells reessCode=\"001CE200000001C1N5350163\"/><cells reessCode=\"001CE200000001C1N5300203\"/><cells reessCode=\"001CE200000001C1J5350570\"/><cells reessCode=\"001CE200000001C1M5355486\"/><cells reessCode=\"001CE200000001C1N5350160\"/><cells reessCode=\"001CE200000001C1N5350156\"/><cells reessCode=\"001CE200000001C1L5301823\"/><cells reessCode=\"001CE200000001C1N5300342\"/><cells reessCode=\"001CE200000001C1N5300086\"/><cells reessCode=\"001CE200000001C1N5300351\"/><cells reessCode=\"001CE200000001C1N5300178\"/><cells reessCode=\"001CE200000001C1M5304746\"/><cells reessCode=\"001CE200000001C1M5354213\"/><cells reessCode=\"001CE200000001C1N5350149\"/><cells reessCode=\"001CE200000001C1N5300087\"/><cells reessCode=\"001CE200000001C1N5350201\"/><cells reessCode=\"001CE200000001C1N5350151\"/><cells reessCode=\"001CE200000001C1N5300355\"/><cells reessCode=\"001CE200000001C1N5300041\"/><cells reessCode=\"001CE200000001C1M5354778\"/><cells reessCode=\"001CE200000001C1N5350211\"/></modules><modules reessCode=\"079ME0B2A23211C4V0000052\"><cells reessCode=\"001CE200000001C1N5300288\"/><cells reessCode=\"001CE200000001C1N5300421\"/><cells reessCode=\"001CE200000001C1N5350565\"/><cells reessCode=\"001CE200000001C1N5300106\"/><cells reessCode=\"001CE200000001C1N5350311\"/><cells reessCode=\"001CE200000001C1N5300681\"/><cells reessCode=\"001CE200000001C1N5300688\"/><cells reessCode=\"001CE200000001C1N5300682\"/><cells reessCode=\"001CE200000001C1N5300733\"/><cells reessCode=\"001CE200000001C1N5300724\"/><cells reessCode=\"001CE200000001C1N5300426\"/><cells reessCode=\"001CE200000001C1N5350302\"/><cells reessCode=\"001CE200000001C1N5300316\"/><cells reessCode=\"001CE200000001C1M5305034\"/><cells reessCode=\"001CE200000001C1N5300402\"/><cells reessCode=\"001CE200000001C1N5350508\"/><cells reessCode=\"001CE200000001C1N5350566\"/><cells reessCode=\"001CE200000001C1N5300419\"/><cells reessCode=\"001CE200000001C1N5300691\"/><cells reessCode=\"001CE200000001C1N5300414\"/><cells reessCode=\"001CE200000001C1N5350312\"/><cells reessCode=\"001CE200000001C1N5300675\"/><cells reessCode=\"001CE200000001C1N5300521\"/><cells reessCode=\"001CE200000001C1N5300670\"/><cells reessCode=\"001CE200000001C1N5300569\"/><cells reessCode=\"001CE200000001C1N5350303\"/><cells reessCode=\"001CE200000001C1N5300566\"/><cells reessCode=\"001CE200000001C1N5300522\"/><cells reessCode=\"001CE200000001C1N5300410\"/><cells reessCode=\"001CE200000001C1N5300728\"/><cells reessCode=\"001CE200000001C1N5300534\"/><cells reessCode=\"001CE200000001C1M5305018\"/><cells reessCode=\"001CE200000001C1N5300523\"/><cells reessCode=\"001CE200000001C1M5355496\"/><cells reessCode=\"001CE200000001C1N5350301\"/><cells reessCode=\"001CE200000001C1N5300143\"/><cells reessCode=\"001CE200000001C1N5300723\"/><cells reessCode=\"001CE200000001C1N5300098\"/><cells reessCode=\"001CE200000001C1N5300680\"/><cells reessCode=\"001CE200000001C1M5355494\"/><cells reessCode=\"001CE200000001C1N5300518\"/><cells reessCode=\"001CE200000001C1M5355488\"/><cells reessCode=\"001CE200000001C1N5300251\"/><cells reessCode=\"001CE200000001C1M5305453\"/><cells reessCode=\"001CE200000001C1N5300596\"/><cells reessCode=\"001CE200000001C1N5300096\"/><cells reessCode=\"001CE200000001C1N5350570\"/><cells reessCode=\"001CE200000001C1N5300121\"/><cells reessCode=\"001CE200000001C1N5300925\"/><cells reessCode=\"001CE200000001C1N5300540\"/><cells reessCode=\"001CE200000001C1N5350516\"/><cells reessCode=\"001CE200000001C1N5300543\"/><cells reessCode=\"001CE200000001C1N5300874\"/><cells reessCode=\"001CE200000001C1N5300840\"/><cells reessCode=\"001CE200000001C1N5300737\"/><cells reessCode=\"001CE200000001C1N5350594\"/><cells reessCode=\"001CE200000001C1N5350821\"/><cells reessCode=\"001CE200000001C1N5350314\"/><cells reessCode=\"001CE200000001C1N5300743\"/><cells reessCode=\"001CE200000001C1N5300784\"/><cells reessCode=\"001CE200000001C1N5350797\"/><cells reessCode=\"001CE200000001C1N5350507\"/><cells reessCode=\"001CE200000001C1N5300732\"/><cells reessCode=\"001CE200000001C1N5350307\"/><cells reessCode=\"001CE200000001C1N5300612\"/><cells reessCode=\"001CE200000001C1N5350308\"/><cells reessCode=\"001CE200000001C1M5304745\"/><cells reessCode=\"001CE200000001C1M5354273\"/><cells reessCode=\"001CE200000001C1N5350823\"/><cells reessCode=\"001CE200000001C1N5350514\"/><cells reessCode=\"001CE200000001C1N5350511\"/><cells reessCode=\"001CE200000001C1N5300544\"/></modules><modules reessCode=\"079ME0B2A23211C4V0000048\"><cells reessCode=\"001CE200000001C2F5355092\"/><cells reessCode=\"001CE200000001C245301730\"/><cells reessCode=\"001CE200000001C2F5303885\"/><cells reessCode=\"001CE200000001C2D5353267\"/><cells reessCode=\"001CE200000001C2F5302274\"/><cells reessCode=\"001CE200000001C245351544\"/><cells reessCode=\"001CE200000001C2F5355103\"/><cells reessCode=\"001CE200000001C2D5353266\"/><cells reessCode=\"001CE200000001C2F5302268\"/><cells reessCode=\"001CE200000001C2F5355114\"/><cells reessCode=\"001CE200000001C2F5355101\"/><cells reessCode=\"001CE200000001C245351541\"/><cells reessCode=\"001CE200000001C2F5354435\"/><cells reessCode=\"001CE200000001C2F5355115\"/><cells reessCode=\"001CE200000001C2F5304240\"/><cells reessCode=\"001CE200000001C2F5354848\"/><cells reessCode=\"001CE200000001C2F5304239\"/><cells reessCode=\"001CE200000001C2D5303510\"/><cells reessCode=\"001CE200000001C2F5304241\"/><cells reessCode=\"001CE200000001C2F5354851\"/><cells reessCode=\"001CE200000001C2F5303880\"/><cells reessCode=\"001CE200000001C2D5303509\"/><cells reessCode=\"001CE200000001C2F5304237\"/><cells reessCode=\"001CE200000001C2D5302598\"/><cells reessCode=\"001CE200000001C2F5304243\"/><cells reessCode=\"001CE200000001C2D5303717\"/><cells reessCode=\"001CE200000001C2F5354845\"/><cells reessCode=\"001CE200000001C2F5355013\"/><cells reessCode=\"001CE200000001C255351565\"/><cells reessCode=\"001CE200000001C2D5303715\"/><cells reessCode=\"001CE200000001C1M5304955\"/><cells reessCode=\"001CE200000001C1M5354439\"/><cells reessCode=\"001CE200000001C245301739\"/><cells reessCode=\"001CE200000001C2F5355002\"/><cells reessCode=\"001CE200000001C2F5354237\"/><cells reessCode=\"001CE200000001C2F5355123\"/><cells reessCode=\"001CE200000001C285300900\"/><cells reessCode=\"001CE200000001C2F5355008\"/><cells reessCode=\"001CE200000001C245351475\"/><cells reessCode=\"001CE200000001C2F5354869\"/><cells reessCode=\"001CE200000001C2F5355102\"/><cells reessCode=\"001CE200000001C2F5353961\"/><cells reessCode=\"001CE200000001C2D5302605\"/><cells reessCode=\"001CE200000001C2F5355005\"/><cells reessCode=\"001CE200000001C2F5355098\"/><cells reessCode=\"001CE200000001C2F5354855\"/><cells reessCode=\"001CE200000001C245301651\"/><cells reessCode=\"001CE200000001C2F5355010\"/><cells reessCode=\"001CE200000001C1N5350104\"/><cells reessCode=\"001CE200000001C1N5350168\"/><cells reessCode=\"001CE200000001C1N5300043\"/><cells reessCode=\"001CE200000001C2F5352622\"/><cells reessCode=\"001CE200000001C1N5300095\"/><cells reessCode=\"001CE200000001C1N5300004\"/><cells reessCode=\"001CE200000001C1J5352462\"/><cells reessCode=\"001CE200000001C2F5352208\"/><cells reessCode=\"001CE200000001C1M5305993\"/><cells reessCode=\"001CE200000001C2F5354021\"/><cells reessCode=\"001CE200000001C1M5305138\"/><cells reessCode=\"001CE200000001C1M5304941\"/><cells reessCode=\"001CE200000001C1M5354704\"/><cells reessCode=\"001CE200000001C1N5350097\"/><cells reessCode=\"001CE200000001C1N5300063\"/><cells reessCode=\"001CE200000001C245301727\"/><cells reessCode=\"001CE200000001C1N5350172\"/><cells reessCode=\"001CE200000001C2F5352201\"/><cells reessCode=\"001CE200000001C2F5352628\"/><cells reessCode=\"001CE200000001C2F5355109\"/><cells reessCode=\"001CE200000001C1N5300053\"/><cells reessCode=\"001CE200000001C2F5303963\"/><cells reessCode=\"001CE200000001C2F5352618\"/><cells reessCode=\"001CE200000001C2F5355106\"/></modules><modules reessCode=\"079ME0B1A23111C4V0000033\"><cells reessCode=\"001CE200000001C1L5354588\"/><cells reessCode=\"001CE200000001C1L5354159\"/><cells reessCode=\"001CE200000001C1L5305741\"/><cells reessCode=\"001CE200000001C1L5354019\"/><cells reessCode=\"001CE200000001C1L5354589\"/><cells reessCode=\"001CE200000001C1L5354262\"/><cells reessCode=\"001CE200000001C1L5305731\"/><cells reessCode=\"001CE200000001C1L5354023\"/><cells reessCode=\"001CE200000001C1L5305746\"/><cells reessCode=\"001CE200000001C1L5354017\"/><cells reessCode=\"001CE200000001C1L5305743\"/><cells reessCode=\"001CE200000001C1L5354021\"/><cells reessCode=\"001CE200000001C2F5302823\"/><cells reessCode=\"001CE200000001C2F5301206\"/><cells reessCode=\"001CE200000001C1L5354591\"/><cells reessCode=\"001CE200000001C1L5353593\"/><cells reessCode=\"001CE200000001C1L5354580\"/><cells reessCode=\"001CE200000001C1L5304901\"/><cells reessCode=\"001CE200000001C1L5354575\"/><cells reessCode=\"001CE200000001C1L5305455\"/><cells reessCode=\"001CE200000001C1L5354577\"/><cells reessCode=\"001CE200000001C1L5305523\"/><cells reessCode=\"001CE200000001C1L5354564\"/><cells reessCode=\"001CE200000001C1L5305453\"/><cells reessCode=\"001CE200000001C1L5354318\"/><cells reessCode=\"001CE200000001C1L5354578\"/><cells reessCode=\"001CE200000001C1L5304774\"/><cells reessCode=\"001CE200000001C1L5305825\"/><cells reessCode=\"001CE200000001C1L5353532\"/><cells reessCode=\"001CE200000001C1L5353783\"/><cells reessCode=\"001CE200000001C1L5303105\"/><cells reessCode=\"001CE200000001C1L5305564\"/><cells reessCode=\"001CE200000001C1L5353781\"/><cells reessCode=\"001CE200000001C1L5305127\"/><cells reessCode=\"001CE200000001C1L5354579\"/><cells reessCode=\"001CE200000001C1L5305132\"/><cells reessCode=\"001CE200000001C1L5353788\"/><cells reessCode=\"001CE200000001C1L5305139\"/><cells reessCode=\"001CE200000001C1L5353787\"/><cells reessCode=\"001CE200000001C1L5305178\"/><cells reessCode=\"001CE200000001C1L5354587\"/><cells reessCode=\"001CE200000001C1L5354433\"/><cells reessCode=\"001CE200000001C1L5354586\"/><cells reessCode=\"001CE200000001C1L5353480\"/><cells reessCode=\"001CE200000001C1L5354592\"/><cells reessCode=\"001CE200000001C1L5354430\"/><cells reessCode=\"001CE200000001C1L5354582\"/><cells reessCode=\"001CE200000001C1L5305126\"/></modules><modules reessCode=\"079ME0B1A23111C4V0000032\"><cells reessCode=\"001CE200000001C1L5354190\"/><cells reessCode=\"001CE200000001C1L5354454\"/><cells reessCode=\"001CE200000001C1L5304553\"/><cells reessCode=\"001CE200000001C1L5305280\"/><cells reessCode=\"001CE200000001C1L5354029\"/><cells reessCode=\"001CE200000001C1L5305278\"/><cells reessCode=\"001CE200000001C1L5305185\"/><cells reessCode=\"001CE200000001C1L5354455\"/><cells reessCode=\"001CE200000001C1L5354472\"/><cells reessCode=\"001CE200000001C1L5354457\"/><cells reessCode=\"001CE200000001C1L5305154\"/><cells reessCode=\"001CE200000001C1L5353786\"/><cells reessCode=\"001CE200000001C1L5305506\"/><cells reessCode=\"001CE200000001C1L5354463\"/><cells reessCode=\"001CE200000001C1L5305156\"/><cells reessCode=\"001CE200000001C1L5353792\"/><cells reessCode=\"001CE200000001C1L5354196\"/><cells reessCode=\"001CE200000001C1L5354462\"/><cells reessCode=\"001CE200000001C1L5354470\"/><cells reessCode=\"001CE200000001C1L5305253\"/><cells reessCode=\"001CE200000001C1L5354258\"/><cells reessCode=\"001CE200000001C1L5354471\"/><cells reessCode=\"001CE200000001C1L5354160\"/><cells reessCode=\"001CE200000001C1L5305493\"/><cells reessCode=\"001CE200000001C1L5354427\"/><cells reessCode=\"001CE200000001C1L5304900\"/><cells reessCode=\"001CE200000001C1L5304390\"/><cells reessCode=\"001CE200000001C1L5303952\"/><cells reessCode=\"001CE200000001C1L5305119\"/><cells reessCode=\"001CE200000001C1L5303877\"/><cells reessCode=\"001CE200000001C1L5304378\"/><cells reessCode=\"001CE200000001C1L5303956\"/><cells reessCode=\"001CE200000001C1L5305140\"/><cells reessCode=\"001CE200000001C1L5305152\"/><cells reessCode=\"001CE200000001C1L5305130\"/><cells reessCode=\"001CE200000001C1L5303880\"/><cells reessCode=\"001CE200000001C1L5354585\"/><cells reessCode=\"001CE200000001C1L5305264\"/><cells reessCode=\"001CE200000001C1L5353484\"/><cells reessCode=\"001CE200000001C1L5305265\"/><cells reessCode=\"001CE200000001C1L5305121\"/><cells reessCode=\"001CE200000001C1L5354450\"/><cells reessCode=\"001CE200000001C1L5354424\"/><cells reessCode=\"001CE200000001C1L5354456\"/><cells reessCode=\"001CE200000001C1K5302647\"/><cells reessCode=\"001CE200000001C1L5305114\"/><cells reessCode=\"001CE200000001C1L5353496\"/><cells reessCode=\"001CE200000001C1L5303882\"/></modules><modules reessCode=\"079ME0B2A23211C4V0000047\"><cells reessCode=\"001CE200000001C2F5300945\"/><cells reessCode=\"001CE200000001C2F5351928\"/><cells reessCode=\"001CE200000001C245350153\"/><cells reessCode=\"001CE200000001C2F5355016\"/><cells reessCode=\"001CE200000001C2F5304169\"/><cells reessCode=\"001CE200000001C2F5355090\"/><cells reessCode=\"001CE200000001C1M5304954\"/><cells reessCode=\"001CE200000001C1M5354490\"/><cells reessCode=\"001CE200000001C245351545\"/><cells reessCode=\"001CE200000001C2F5353560\"/><cells reessCode=\"001CE200000001C245351482\"/><cells reessCode=\"001CE200000001C2F5355011\"/><cells reessCode=\"001CE200000001C2F5354840\"/><cells reessCode=\"001CE200000001C2F5354231\"/><cells reessCode=\"001CE200000001C2F5355206\"/><cells reessCode=\"001CE200000001C2F5355019\"/><cells reessCode=\"001CE200000001C2F5355127\"/><cells reessCode=\"001CE200000001C2F5354232\"/><cells reessCode=\"001CE200000001C2F5354846\"/><cells reessCode=\"001CE200000001C2F5354233\"/><cells reessCode=\"001CE200000001C2F5354864\"/><cells reessCode=\"001CE200000001C2F5352455\"/><cells reessCode=\"001CE200000001C285300889\"/><cells reessCode=\"001CE200000001C2F5355015\"/><cells reessCode=\"001CE200000001C2F5355083\"/><cells reessCode=\"001CE200000001C2F5355014\"/><cells reessCode=\"001CE200000001C2E5351743\"/><cells reessCode=\"001CE200000001C2F5354959\"/><cells reessCode=\"001CE200000001C2F5355089\"/><cells reessCode=\"001CE200000001C2F5353782\"/><cells reessCode=\"001CE200000001C2F5355145\"/><cells reessCode=\"001CE200000001C2F5354014\"/><cells reessCode=\"001CE200000001C2F5355212\"/><cells reessCode=\"001CE200000001C2F5354031\"/><cells reessCode=\"001CE200000001C2F5355138\"/><cells reessCode=\"001CE200000001C2F5354026\"/><cells reessCode=\"001CE200000001C2F5355217\"/><cells reessCode=\"001CE200000001C2F5354024\"/><cells reessCode=\"001CE200000001C2F5355035\"/><cells reessCode=\"001CE200000001C2F5354023\"/><cells reessCode=\"001CE200000001C2F5355126\"/><cells reessCode=\"001CE200000001C2E5351804\"/><cells reessCode=\"001CE200000001C2F5355036\"/><cells reessCode=\"001CE200000001C2F5354943\"/><cells reessCode=\"001CE200000001C2F5355216\"/><cells reessCode=\"001CE200000001C2F5354013\"/><cells reessCode=\"001CE200000001C2F5355132\"/><cells reessCode=\"001CE200000001C2F5354939\"/><cells reessCode=\"001CE200000001C2F5355110\"/><cells reessCode=\"001CE200000001C285300901\"/><cells reessCode=\"001CE200000001C235300550\"/><cells reessCode=\"001CE200000001C2F5354872\"/><cells reessCode=\"001CE200000001C2F5355099\"/><cells reessCode=\"001CE200000001C2F5304173\"/><cells reessCode=\"001CE200000001C2F5355105\"/><cells reessCode=\"001CE200000001C2F5355095\"/><cells reessCode=\"001CE200000001C2F5355097\"/><cells reessCode=\"001CE200000001C285300899\"/><cells reessCode=\"001CE200000001C2F5355204\"/><cells reessCode=\"001CE200000001C2F5355189\"/><cells reessCode=\"001CE200000001C2F5355093\"/><cells reessCode=\"001CE200000001C255350563\"/><cells reessCode=\"001CE200000001C1M5304926\"/><cells reessCode=\"001CE200000001C1M5304880\"/><cells reessCode=\"001CE200000001C2C5304818\"/><cells reessCode=\"001CE200000001C2G5353638\"/><cells reessCode=\"001CE200000001C2F5304172\"/><cells reessCode=\"001CE200000001C2F5355125\"/><cells reessCode=\"001CE200000001C2F5303887\"/><cells reessCode=\"001CE200000001C2F5354867\"/><cells reessCode=\"001CE200000001C1M5354835\"/><cells reessCode=\"001CE200000001C1M5304827\"/></modules></activeState></highVoltageBattery><executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_DK\"/></ns2:storeHighVoltageBatteryRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Farasis()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-8\" standalone=\"yes\"?>\r\n"
				+ "<ns2:storeHighVoltageBatteryRequest category=\"MajorAssemblyAdapter\" version=\"20.6.1.1\" xmlns:ns2=\"http://majorassembly.vedoc.daimler.com/ai\">\r\n"
				+ "  <requestHeader userId=\"VEDOC_tec_DR\" />\r\n"
				+ "  <highVoltageBattery dataCardAvailable=\"true\" id=\"789062PA011095\" productionSerialNumber=\"124334079022211900073100001001011095\" reessCode=\"03NPE00VDC001SC4X0011095\">\r\n"
				+ "    <activeState plant=\"P6858\">\r\n"
				+ "      <modules reessCode=\"03NME05GDC001SC302300055\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281403159\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281407421\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281407530\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281407534\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281408182\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291400128\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291400207\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291400422\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291401633\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291401939\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291403498\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291403647\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291403853\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC291404182\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1309758\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1309767\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1310614\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1310640\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1310701\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1310708\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1300751\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1301187\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1301188\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1301432\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1301565\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1301580\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302133\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302412\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302567\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302626\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302637\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302642\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302709\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302902\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1302953\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1303242\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1303252\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1304180\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1305938\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1305945\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1305988\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1106523\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05GDC001SC302300313\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1203618\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1203637\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204058\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204063\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204220\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205672\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1206230\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1206231\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1402707\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1402719\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1309601\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1100913\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1101702\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1102261\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403157\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403158\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1404361\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1408849\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300037\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300096\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300102\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300231\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300304\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300308\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300324\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1300662\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301012\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301017\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301250\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301498\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301549\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301564\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301573\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301575\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301653\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2L1301662\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2M1101767\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2M1400932\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2M1401162\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2M1401164\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2N1400269\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2N1400271\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05GDC001SC412300099\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1203867\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1203869\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204372\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204638\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204760\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1204853\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205001\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205337\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205338\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205349\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1205626\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1206372\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1206944\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1206974\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1208559\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1208925\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1209137\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1209268\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1210183\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1200578\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1200583\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1201283\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1201296\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1205300\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2D1202015\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1101561\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1102397\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1107444\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1108233\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1108236\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1100055\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1100687\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1101428\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1101439\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103323\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103327\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103328\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103330\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103532\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103671\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103674\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2G1103675\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05HDC002SC3R2300003\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCC1105410\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCC1407523\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCE1108533\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCG1205289\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCG1302691\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCG1302700\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCH1401380\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCH1402817\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCJ1104358\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCM1107121\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCM1107139\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCM1305661\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCM1306096\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCN1100991\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCN1204545\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCN1206558\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1104237\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1301888\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1304220\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1304223\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1400444\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1401670\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCR1402165\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCS1401438\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCT1402693\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCV1301865\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCV1302000\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCV1302471\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCV1403131\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCX1205635\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC191302521\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC191305751\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1A1303032\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1A1303511\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1A1303551\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1B1107607\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1B1200823\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1B1302085\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1K1201371\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC271408551\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281401158\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC281401160\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05JDC003SC3Y2300174\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1400966\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401009\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401407\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401408\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401460\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401495\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401501\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401505\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401544\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1401659\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1402180\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1402185\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2E1402196\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1303003\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1303010\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1304151\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1304203\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1304209\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1303724\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304018\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304547\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304700\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304887\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304899\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304933\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304934\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304939\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304941\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1304953\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1305199\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1402102\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1402104\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403523\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403562\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403564\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403571\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1403577\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1405274\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1405276\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1405337\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1408238\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1408294\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05KDC004SC422300184\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1L1307097\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1P1304044\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1207310\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1207314\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2B1209169\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1201803\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203606\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203624\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203627\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203634\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1204548\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1205555\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1107971\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1206657\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1207866\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1102820\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1103441\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1104969\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1105062\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1106867\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2H1107190\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1407254\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1407553\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2K1407557\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2S1106026\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2T1403208\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2W1400369\" />\r\n"
				+ "      </modules>\r\n"
				+ "      <modules reessCode=\"03NME05KDC004SC422300187\">\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSBCV1306746\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1F1308537\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1G1406142\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1M1306352\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC1W1407317\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC211406607\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC251400507\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1207637\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1207845\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2A1208595\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1103084\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1104899\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1104903\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1105026\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1105031\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1200524\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203592\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203602\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2C1203611\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1102169\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1102176\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1102180\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2F1206638\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2N1304625\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2S1106739\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2W1400994\" />\r\n"
				+ "        <cells reessCode=\"03NCE00NFN76CSC2W1400996\" />\r\n"
				+ "      </modules>\r\n"
				+ "    </activeState>\r\n"
				+ "  </highVoltageBattery>\r\n"
				+ "  <executionSettings causation=\"plant\" date=\"currentDateTime\" systemPriority=\"10\" issueThreshold=\"err\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_DR\" />\r\n"
				+ "</ns2:storeHighVoltageBatteryRequest>\r\n"
				+ "\r\n"
				+ "");
	}
	

	public void RawMqMessageFormat_Minibus_Sap()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-16\"?>\r\n"
				+ "<ns1:storeVehicleRequest xmlns:ns1=\"http://vehicle.vedoc.daimler.com/ai\" category=\"VehicleAdapter\" version=\"15.1.1.1\">\r\n"
				+ "  <requestHeader userId=\"VEDOC_tec_28\"/>\r\n"
				+ "  <vehicle delta=\"true\" fin=\"W1V9076571P433522\" productSeries=\"907\" vehicleModelDesignation=\"907657\">\r\n"
				+ "    <activeAssignedFpd>\r\n"
				+ "      <equipmentCodes code=\"EL9\" codeType=\"sales\" deleted=\"false\"/>\r\n"
				+ "    </activeAssignedFpd>\r\n"
				+ "    <activeState>\r\n"
				+ "      <cab id=\"61371400433522\"/>\r\n"
				+ "    </activeState>\r\n"
				+ "  </vehicle>\r\n"
				+ "  <executionSettings causation=\"plantOnlyUpdate\" date=\"2022-04-28T10:10:21+02:00\" issueThreshold=\"err\" source=\"XZ0.VEDOC.U.MINIBUS.IN\" systemPriority=\"4\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_28\"/>\r\n"
				+ "</ns1:storeVehicleRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap()
	{
		RawMqMessageFormat.sendKeys("<ECUDATA>\r\n"
				+ "<HEADER>\r\n"
				+ "<TIMESTAMP>2022-04-30-11:54:44</TIMESTAMP>\r\n"
				+ "<VIN>WEB62833113291864</VIN>\r\n"
				+ "<AIN>93074720249637</AIN>\r\n"
				+ "</HEADER>\r\n"
				+ "<ECU>\r\n"
				+ "<DIAG-PARTNUMBER>0044442454</DIAG-PARTNUMBER>\r\n"
				+ "<DIAG-ZGS>005</DIAG-ZGS>\r\n"
				+ "<ECUNAME>ACM301T</ECUNAME>\r\n"
				+ "<HW-PARTNUMBER>0014461454</HW-PARTNUMBER>\r\n"
				+ "<HW-ZGS>001</HW-ZGS>\r\n"
				+ "<PLANT>0280</PLANT>\r\n"
				+ "<SERIALNUMBER>10052E97</SERIALNUMBER>\r\n"
				+ "<SW-PARTNUMBER-LIST>\r\n"
				+ "<SW-PARTNUMBER prio=\"1\">0204484054</SW-PARTNUMBER>\r\n"
				+ "<SW-ZGS prio=\"1\">001</SW-ZGS>\r\n"
				+ "</SW-PARTNUMBER-LIST>\r\n"
				+ "<DS-PARTNUMBER-LIST>\r\n"
				+ "<DS-PARTNUMBER prio=\"1\">0334482054</DS-PARTNUMBER>\r\n"
				+ "<DS-ZGS prio=\"1\">001</DS-ZGS>\r\n"
				+ "</DS-PARTNUMBER-LIST>\r\n"
				+ "<DIAGVERSION>88</DIAGVERSION>\r\n"
				+ "<IDCODE>10052E97</IDCODE>\r\n"
				+ "<CODINGSTATUS>X6</CODINGSTATUS>\r\n"
				+ "<CERTIFICATIONNUMBER>OM936LA.6GE-60-00</CERTIFICATIONNUMBER>\r\n"
				+ "<CVN>0AF5F2DF</CVN>\r\n"
				+ "<CAL-ID>38r00J6956660140</CAL-ID>\r\n"
				+ "</ECU>\r\n"
				+ "<VARCODEDOMAINS>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR001_CAN_Config</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR001_CAN_Config Default length 7</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0054470854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Powertrain_CAN_Baudrate</FRAGNAME>\r\n"
				+ "<FRAGVAL>3</FRAGVAL>\r\n"
				+ "<FRAGMEANING>667 KBaud</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054470454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Engineering_CAN_Baudrate</FRAGNAME>\r\n"
				+ "<FRAGVAL>2</FRAGVAL>\r\n"
				+ "<FRAGMEANING>500 KBaud</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054470554</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>CAN3 Baudrate</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>250 KBaud</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054470654</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>NOX_Sensor_CAN_Baudrate</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>250 KBaud</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054470754</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>edu_present</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR002_Output_Config1</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR002_Output_Config1 Default length 16</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0054471954</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Line Heater 1 Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054471054</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Line Heater 2 Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054471254</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Line Heater 3 Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054471454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Line Heater 4 Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054471654</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Line Heater 5 Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054471854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR003_OBD</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR003_OBD Default length 72</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0054473854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_eu6_cal_id_par[0]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>0</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054472354</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_eu6_cal_id_par[1]</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064474754</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_eu6_cal_id_par[2]</FRAGNAME>\r\n"
				+ "<FRAGVAL>4</FRAGVAL>\r\n"
				+ "<FRAGMEANING>4</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054472954</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_eu6_cal_id_par[3]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>0</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054473154</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_block_number1_arr_uc[0]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_block_number1_arr_uc[1]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_block_number1_arr_uc[2]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_block_number1_arr_uc[3]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_cal_id_parameter_set</FRAGNAME>\r\n"
				+ "<FRAGVAL/>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_block_number1_vers_uc</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_ecu_id_vers</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_obd_indc_stage_v_only</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Tier4 and Euromot Inducement</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dbg_prescaler</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_ucm_sc_utank_blind_mass</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_epf_trq_lim_fac_not_cpc</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>60pct EuroV Torque Limiter configured</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_mu_ccc_protect_inactive</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_mu_flash_protect_inactive</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_mu_asw_protect_inactive</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR005_DPF</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR005_DPF Default length 43</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0054477854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>PTO DPF Dosing Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Enabled</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054474054</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Extended Idle Auto RPM Elevate</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Enabled</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054474154</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DPF Trigger Option</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054474354</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DPF MIN Vehicle Speed</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>0</FRAGMEANING>\r\n"
				+ "<FRAGUNIT>km/h</FRAGUNIT>\r\n"
				+ "<PARTNUMBER>A0054474454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DPF Zone turn on regen switch</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054475154</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DPF Exhaust Pipe Volume (From Doser to DOC inlet)</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.047499</FRAGVAL>\r\n"
				+ "<FRAGMEANING>0.04749871</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054475854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Select extended cool down</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054477454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dpf_doc_unplug_fcn_enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>2.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>2</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054477654</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Park Brake on DPF Dosing Inhibit</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Disabled</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DPF Manual REGEN only Enable</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Disabled</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>ATD Hardware Type</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>DPF/SCR in 1 Box</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Purge in Progress Lamp</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>off</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>SCR Air Valve Normally Open</FRAGNAME>\r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "<FRAGMEANING>no</FRAGMEANING>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Exhaust pipe variant behind DPF</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Activation of High Sulfur Fuel</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Selection of delta p DPF sensor</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_ehc_sel_eht_support</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_scr_sp_exh_len_ats_dwnstream</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>m</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dpf_pred_regen_en</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR006_DEF_Tank_Level</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR006_DEF_Tank_Level Default length 72</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064471554</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_sel_l_DEF_tank</FRAGNAME>\r\n"
				+ "<FRAGVAL>5.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>5</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0054479554</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_1</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_2</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_3</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_4</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_5</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_6</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_7</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Level_8</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_1</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_2</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_3</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_4</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_5</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_6</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_7</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF_Level_Sensor_Cal_Voltage_8</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>V</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_1</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_2</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_1_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_2_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_3_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_4_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_3</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_4</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_trc_sel_lvl_sns_usonic</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_5</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>trc_l_DEF_tank_lim_5_refill</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR007_Prod</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR007_Prod Default length 24</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064475354</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_acm_not_parametrized</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>par_ats_start_not_effect</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR008_SCR_Sys</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR008_SCR_Sys Default length 24</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064472254</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_scr_t_est_en_b</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>True</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064472054</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_udq_exh_len_ats_upstream</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1.00</FRAGMEANING>\r\n"
				+ "<FRAGUNIT>m</FRAGUNIT>\r\n"
				+ "<PARTNUMBER>A0064472154</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_DEF_tank_volume</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR009_App</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR009_App Default length 36</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064472354</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>App_Code_PartNumber</FRAGNAME>\r\n"
				+ "<FRAGVAL/>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>Application_Code</FRAGNAME>\r\n"
				+ "<FRAGVAL/>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR010_Function</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR010_Function Default length 20</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064473054</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_unheated_def</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>0</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064472654</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_sys_sel_acm_thc_valve_avl</FRAGNAME>\r\n"
				+ "<FRAGVAL>1.000000</FRAGVAL>\r\n"
				+ "<FRAGMEANING>1</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064472954</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>ucm_l_DEF_tank_max</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>ucm_DEF_consum_mon_limit</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dpf_var_sel_fuel_flt_wtr</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>dpf_var_ash_pack_dsabl_b</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_obd_dsr_gdc_sna_handling</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dpf_zone_man_slew_reg_dis</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_unheated_du</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR011_DEF</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR011_DEF Default length 52</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064473554</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>DEF Tank Level and Temperature</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>CAN Based</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064473254</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>CAN-based DEF Quality Sensor</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Enabled</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064473454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_uqs_kus_sens_sel</FRAGNAME>\r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "<FRAGMEANING>Enabled</FRAGMEANING>\r\n"
				+ "<PARTNUMBER>A0064476454</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[1]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[2]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[3]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[4]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[5]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[6]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[7]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can_2m[8]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[1]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[2]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[3]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[4]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[5]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[6]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[7]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can_sen[8]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can2_2m[9]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can2_2m[10]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_can2_2m[11]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can2_sen[9]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can2_sen[10]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>isp_l_DEF_tank_x_can2_sen[11]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>mm</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR012_Logistic</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR012_Logistic Default length 14</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064473654</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[1]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[2]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[3]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[4]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[5]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[6]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[7]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[8]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[9]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[10]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[11]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[12]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[13]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_par_agn_serial_nr[14]</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR013_ATS_DIA</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR013_ATS_DIA Default length 28</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064473854</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_ats_dia_enth_thr</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "<FRAGUNIT>MJ</FRAGUNIT>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "<VCDQUALIFIER>VCD_PGR014_Logistic</VCDQUALIFIER>\r\n"
				+ "<DEFAULT>\r\n"
				+ "<DEFAULTNAME>VCD_PGR014_Logistic Default Length 14</DEFAULTNAME>\r\n"
				+ "<PARTNUMBER>A0064473954</PARTNUMBER>\r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "</DEFAULT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_pms_present</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_nox1_present</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_nox2_present</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "<FRAGMENT>\r\n"
				+ "<FRAGNAME>e2p_dps_en</FRAGNAME>\r\n"
				+ "<FRAGVAL>0.000000</FRAGVAL>\r\n"
				+ "</FRAGMENT>\r\n"
				+ "</VARCODEDOMAIN>\r\n"
				+ "</VARCODEDOMAINS>\r\n"
				+ "</ECUDATA>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Werk800_Van_Charleston()
	{
		RawMqMessageFormat.sendKeys("100A2204275660660W1Y9076431T0973224642899 42 376843   419 K           37 2 740 18571     9337109                  11 255272             40062                                                      <                                  <USA30346  Atlanta, Georgia                   230346RF8                                                                                                                                                 A  10550                        741421  1 369288                                                                W1Y4EBVY1NT097322                                                               7709                                                                                                            74000                           22117  22117     72740185719337109\r\n"
				+ "300A2204275660660W1Y9076431T0973224AR2 BA3 BH1 BH6 BK4 CL1 CL3 C6L D03 D13 D93 ED4 ED8 EE5 EK1 ES0 ET4 EW6 EX9 EY2 EY5 EY6 E07 E1E E1U E1Z E2N E3M E30 E40 E46 FF5 FG8 FI1 FJ1 FJ4 FJ5 FM3 FR8 FZ9 F64 F68 G42 HH2 HH9 H21 IC1 IE0 IG4 IG5 IH7 IK0 IL5 IR4 IT9 JA7 JA8 JB4 JF1 JH3 JI9 JK5 JW8 J11 J55 J58 J65 KB7 KL1 KL5 KP6 K56 K60 LA2 LB5 LC4 LX7 L65 L94 MG5 MI0 M46 P47 P48 Q11 RF8 RH8 RM0 RS3 RX5 RY2 R65 R87 SA5 SA6 SB1 SB2 SE4 SE5 SH1 SH2 SH9 SK0 SK1 SK2 S22 S25 S28 T16 T75 VA3 VF6 V43 V94 V95 WB9 WW8 W54 W73 XC8 XL2 XM4 XN1 XO5 XQ1 XY2 XZ0 X64 X99 Y43 ZG3 ZM0 ZU8 ZY9 ZZ4 Z4X Z44 Z5W Z74 Z75                                                                                                                                                                                             72740185719337109\r\n"
				+ "400A2204275660660W1Y9076431T097322400007HBM586NC1NL3U7                                  0000990727024001125527204                            00010A9073504700  741421K1369288                     00011A9073307501 22W06 OA 10550                      0001290746033002201700770                            00014A90741001000000DNZ006Q00201220410006412         00026A9072800500 21W50 OA 40062                      00027A6420106015  642899423768430                    00030000982972404432209502530                        00046DB_MBW177SO_NAM_NAM_E63.03400x21000154          0004763000000000000000000                            000540E00                                            00055310003880101                                    00056800013392036505110010401                              72740185719337109\r\n"
				+ "400B2204275660660W1Y9076431T0973224000629079018401000DA2112NV48A02494000000000000000000000075000000                                          00076HU6          VTOOZJUCTLI6YBAWJXBJB2R3           00081NMBXD03.0HD3                                    10002907901810000003T6422032050949                   10003AD07DB613A43                                    10004ACC79B133588                                    1000600086058019116262204851829                      10007A9078601200282206601272                         10014AF07A27B0B2C                                    10015BB0722912356                                    1001900090171009E2202000151                          100320009011716000039079007806330303221991EB0003     10037A9104300400302205954276                               72740185719337109\r\n"
				+ "400C2204275660660W1Y9076431T097322410050A9078606001282203102459                         10051A9078606101282206301859                         1011990790155030009E1220861086                       1013090790177020009EA2C7664701000A2132901842         1015600544619109E2202040014062741                    101580009015303000152216286559                       10159000900901802220322000185040                     1016790790540071530303332333331323838                101740009011703001582204090019915851                 1019500090133139E2203260018115821                    1019904330022ABB3A90022AB98A90022ABB3740022ABB24F    1020081H5AWH                            CR61NFZ      102018SSAA5G                            CR61NFZ      102027H8M5AG                            CR61NFZ            72740185719337109\r\n"
				+ "400D2204275660660W1Y9076431T0973224102037SHNA5H                            CR61NFZ      102047HY635H                            CR61NFZ      102057ZZT71H                            CR61NFZ      10214000013103712303213012301                        102512203135298FAN3ECZ56027A9074900200MB55241316     102522202751523TZN3EAFY4006A90649026140100173321     10291200013395298706113012301                        10293100013681263201013012301                        10294000013862484403212012201                        1031691090531000001591090531001522020838853          103272238130896                                      103282238130895                                      103300009014513000490002105001209685000000000000000001036322381308962238130895                                  72740185719337109\r\n"
				+ "400E2204275660660W1Y9076431T09732241036600090124100000380000000196455300220208127448674010400238900910100084M598NA1KLCG6                     10401HERMES       IMEI 354877880164986               10402HERMES       IMSI 901405221315738               10403HERMES       ICCID89882280000040795623          10404HERMES       TELNRFFFFFFFFFFFFFFF               10405HERMES       EID1 890330240632009433150000      10406HERMES       EID2 59591807                      1042800090103080000380000000195719380220120127448674210429000901030800003800000001957223602201201274486742104362139013812000EF2479008515EF2203180236           104742139016312000152202230000001905                 105769079018802000071050604292793VAJ00076            10610HERMES       MUAPNON                                  72740185719337109\r\n"
				+ "400F2204275660660W1Y9076431T097322410810CPC_NG       NMBXD03.0HD3                       1101681H5AWH18SSAA5G27H8M5AG3                        11077A90741012000000DNZ006Q00401220320000405         11115A907460510000000068Z006Q00918220440000170       11236A9073200400000000OCZ007Q00301220110185920       11237A9073200400000000OCZ007Q00301220110185921       1132590790001050002717018202006110662208002500000000011327098 40 Nein 250 27.04.2022 05:39:14             11328-00001 05:39:14 27.04.2022                      20002w48aaz1t49stvmg8ap49                            300016429014100380026                                300020009015303380031                                300039079023706380009                                300049079029704380035                                      72740185719337109\r\n"
				+ "400G2204275660660W1Y9076431T0973224300050009023052380005                                300099079025304380152                                300129079026605380002                                300219079023605386227                                30023907902520438A1F5                                300290009029548380001                                300312479029610380040                                300351679029403380001                                300410009030463290001                                300439109053100380001                                300681679024909380001                                300691679024909380001                                300910009020660380020                                301019079023502380001                                      72740185719337109\r\n"
				+ "400H2204275660660W1Y9076431T0973224301102479021712380005                                301120009059112290035                                301130009059112290035                                301190009050214290001                                301280009013313380461                                301519079054806380001                                3016900090591122900350009059112290035                301739079024503380014                                301759079022303380016                                301789079022303380016                                301982389029605380004                                40001A08B8317                                        400022AEC3DDF                                        400057BC18698                                              72740185719337109\r\n"
				+ "400I2204275660660W1Y9076431T097322440041F95F2806                                        40112609192E2                                        40113609192E2                                        40119D92FF5BC                                        40128990F1E00                                        40169609192E2609192E2                                500401779018105   HU    HU6                          500412479043000   2479029310   2479029610            500422479037602   2479037702   2479037802            500439079033700   9079033900   9079027606            500442479029810   2479037902   2479038002            501300009017100   NAG   VGS4NAG2                     501310009023052                                      501909079018100   ORC   ORC177                             72740185719337109\r\n"
				+ "400J2204275660660W1Y9076431T0973224501919079026605   9079031800   9079031300            502006429014100   MSG   CR61NFZ                      502016429040500   6429026304   6429037618            502100009011716   ESP   ESP907                       502119079029704                                      502209079015503   KI    IC907                        502219079044000   9079023706   9079023806            502229079023906   9079024006   9079024106            502809079017702   BCF   BCMFA2                       502819079025204                                      503009079017702   KLA   HVAC177                      503019079025304                                      503200054461910   DSM   DSM222                       503210124486110   0124483610                               72740185719337109\r\n"
				+ "400K2204275660660W1Y9076431T0973224503302139010208   TS1   DMFL222_MOPF                 503311679024909                                      503402139010608   TS2   DMFR222_MOPF                 503411679024909                                      505109079018401   ZDP   DISP6                        505119079023502                                      505500009014513   RFK   RVC177                       505510009020660                                      506500009014511   TPM   TPMMFA2                      506510009029548                                      507000009015303   TDS   FSCM_GEN5                    507010009043200   0009026661   0009036646            508809079018802   MRM   SCCM177                      508811779025909                                            72740185719337109\r\n"
				+ "400L2204275660660W1Y9076431T0973224509300009012410   FCW   FCW177                       509319079024503                                      509500009010308   BSM_R1IMRR177_R1                   509519079022303                                      509800009010308   BSM_R3IMRR177_R3                   509819079022303                                      509900009011703   SCR   UDCM                         509910009044600   0009029667   0009030463            510000009013313   CPC   CPC_NG                       510010009047701   0009025652   0009032063            511302139013812   MPC   MMPC213                      511312479021712                                      511402139016312   AAG   TM205                        511411679029403                                            72740185719337109\r\n"
				+ "400M2204275660660W1Y9076431T0973224514601679010005   EZS   EZS167                       514619079023605                                      517800999016200   LRE   SWSP177                      517810999022400                                      518602389016200   HERMESHERMES                       518612389029605   0009022062   0009029683            518620009029783   0009029883   0009029983            518630009020084   0009020184   0009020284            518640009020384   0009020484   0009020584            518650009027046   0009020684   0009020784            518660009020884   0009020984   0009021084            518670009021184   0009021284   0009021384            518680009021484   0009021584                         521109079017602   ASB   ASBM_HU                            72740185719337109\r\n"
				+ "400N2204275660660W1Y9076431T0973224521119079025503                                      11084MO A6420106015         1V A9073307501           11084GE A9072702400         1H A9073504700           00106          TRUC    1,5 04223,92TRUCK             001024105        6319  2000 2431                     00109 9050       13930  4410 5360                                                                                                                                                                                                                                                                                                                                                                                                                                                                  72740185719337109\r\n"
				+ "900A2204275660660W1Y9076431T0973224T740LT7709TC907TF907TFKA TL   TIR4 TIT9   \r\n"
				+ "");
	}
	
	public void RawMqMessageFormat__Werk800_Van_Podi()
	{
		RawMqMessageFormat.sendKeys("1N20220426398    W1V4206331U3138623608915 A0 149425  42063313          8 1 543 00687     4975226                                                                                                                                                                                                                                                                                                                                                                                                                                                              W1V4206331U313862                                                               9147                                                                                        220426                                              220420220426     8154300687U0250103N20220426398    W1V4206331U3138623B26 BB0 BB3 C1K C61 C6L CK1 CL1 CU9 D50 DV2 E07 E1D E2X E4S EC5 EW6 EY5 EY6 F68 FC5 FE8 FG1 FQ3 FR8 GK6 H06 H20 HI2 HX1 I03 I07 I0T I0V I0Z I11 I14 I15 I17 I1D I1F I1G I1M I1N I1P I1Q I1U I1W I1X I1Z I20 I23 I24 I25 I2B I2D I2G I2I I2K I2L I2M I2S I2W I2X I2Y I39 I3D I3E I3G I3H I3L I3O I40 I43 I45 I46 I47 I48 I49 I4A I4E I4L I4R I4V I4Y I5A I5D I5L I5N I5T I5V I5X I6F I70 I80 I81 I82 I83 I8D I8V I9H I9K IA0 IC3 IF6 IG4 II1 IK0 IK7 IL2 IL4 IL5 IM1 IV1 IY5 J10 J1B J1F J56 JA5 JH3 JK3 JW8 JY8 KA1 KL5 L12 LA1 MJ8 MO6 MS1 MW6 NM4 P4B P6A R2B R87 RD9 RM7 SA4 SH5 SK9 SL1 SL3 T16 V4V VF4 VG0 W50 X0I X1G X46 X99 XC8 XC9 XE5 XE7 XO9 XW9 XZ0 Z10 Z1L Z1N ZZ7                                                                                             8154300687U0250104N20220426398    W1V4206331U3138623504814209024904                                      504804209015501   PTS   USA420                       503004209012501   KLA   HVAC_CAMAN420                502914209021611                                      502904209014702   SSM   USM420                       502814209022701                                      502804209019400   SAM   BCM420                       502214209041300   4209021505                         502204209010201   KI    IC907_420                    502114209023706                                      502104209017800   ESP   ESP420                       502014209023011                                      502004209018801   MSG   MD1C420                      501914209023110                                            8154300687U0250104N20220426398    W1V4206331U3138623501904209016901   ORC   AIRBAG420                    501514209025208                                      501504209017401   EPS   EPS420                       500434209029810   4209029910   4209031300            500424209020011   4209029610   4209029710            500414209042000   4209029410   4209029510            500409079014003   HU    CONNECT907                   500114209020811                                      500104209012700   ZGW   RCGW420                      36194285U34804R                                      36165284X94433R                                      36163282A23759R                                      36153285U76894R                                      36110284A64719R                                            8154300687U0250104N20220426398    W1V4206331U313862336101253F94973R                                      36091285Z65470R                                      36031283C66597R                                      36024284A93029R                                      80018320104034R                                      80017100014020R                                      80016       S003444                                  80015K9KU876D149425                                  533414209022903                                      533404209018100   IDM   IDM420                       521119079028305                                      521109079014203   HUBL  ASBM_HU                      518680009024833                                      518670009024533   0009024633   0009024733                  8154300687U0250104N20220426398    W1V4206331U3138623518660009027152   0009024333   0009024433            518650009026746   0009024033   0009027052            518640009023733   0009023833   0009023933            518630009026752   0009026852   0009026952            518620009026452   0009026552   0009026652            518612479020809   0009026252   0009026352            518602479017002   HERMESHERMES                       517810999022400                                      517800999016200   LRE   SWSP177_420                  516924209029713                                      516914209024814   4209024914   4209029613            516904209017700   HGW   CCGW420                      511314209029607                                      511304209016401   MPC   FCAM420                            8154300687U0250104N20220426398    W1V4206331U3138623509914209020115                                      509904209015002   SCRCM DCU420                       508814209026503                                      508804209018600   MRM   SCCM420                      505510009024867                                      505500009014513   RFK   RVC177                       505112539026407                                      505102539018701   ZDP   DISP6                        10400247900261300084M177N0502399                     1033000090145130004922050001116470000000             10203ASSLD5E                            MD1C420      10202AH85B5C                            MD1C420      10201A187DID                            MD1C420      10200ASIPEAD                            MD1C420            8154300687U0250104N20220426398    W1V4206331U31386231017442090150022154112204                            101494209012501T643449EE21250000460                  10138420901740122102B262AN0101                       10130420901940000BCM B3C06684 F778B                  1011942090102010009E1220770097                       10051420860250022069L00806108L                       10050420860260022070L008061043                       100374204300400220876232790928                       1003242090178001422652781                            10029420901880194830746280322023921                  10015220109A305A2A1461B                              10014220109A105A2A1431D                              1000742086002002202211023502502407                   10006420860170022082L008157989                             8154300687U0250104N20220426398    W1V4206331U3138623100042C2612A2C79B134F13                              100032C2612A6C79B136D35                              10002          285556781RT220720534                  00106              0,211,0         MFK               001022021        3500  1170 1070                     00076CONNECT907   X6Q4N7BOU6TZHVQIB5SNEJC7           00067A7003600500  700721S0003444                     0006285M155H0A001                                    00027A6080106800  608915A0149425                     00012420900710622102B262AN0101                       00007VTWBEJL1043852                                  00003CONTINEN                                        36023284B37877R                                      36012985990146R                                            8154300687U0250104N20220426398    W1V4206331U313862336009275336480R                                      36008259868032R                                      36004478577042R                                      36003248366133R                                      36001237618360S                                      35041237G80620R      DCU420                          35001237618988S      MD1C420                         114734209018100479E55BN20824485A701                  11340285556781RT220720534                            113364209014702000N3080072NA000A306                  11326HBZ002Q00701220520048119M171FN0G0048119         113259079014203907900510700027170426930021106922     112654203501400                                      112061DAD72C2                                              8154300687U0250104N20220426398    W1V4206331U31386231120506AD72C2                                        11204BE9F5ED98BB0A9C956F669A598FD1214                1120323434223                                        1073042090177004462010792                            10718SWSP177_420  0999052104007C 2022x02x08B0066     10717SWSP177_420  0999052104007C 2022x02x08B0066     10716SWSP177_420  0999016200007C 22x03x04B001220     10610HERMES       MUAPNOFF                           1057642090186001052807092590VC901004                 10436420901640122073000Z4CAE3                        10406HERMES       EID2 98765442                      10405HERMES       EID1 890330242081009433000004      10404HERMES       TELNRFFFFFFFFFFFFFF                10403HERMES       ICCID89314404001055142508                8154300687U0250104N20220426398    W1V4206331U313862310402HERMES       IMSI 204047159297690               10401HERMES       IMEI 356287108093454                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 8154300687U0250109N20220426398    W1V4206331U3138623T543LT9147TC420TFKA TIK0 TIL5 TIM1 TL   TMW6                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                8154300687U025010\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Zbl_Nfz_Neu()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\"?><v:storeVehicleEeInformationRequest xmlns:v=\"http://vehicle.vedoc.daimler.com/ai\" xmlns:xalan=\"http://xml.apache.org/xalan\" xmlns:ext=\"xalan://com.daimler.zbl.transformation.common.jaxb.xslt.XSLTExtensions\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" category=\"VehicleAdapter\" version=\"21.2.1.1\">\r\n"
				+ "    <requestHeader context=\"\" credentials=\"\" delta=\"true\" userId=\"VEDOC_tec_52\"/>\r\n"
				+ "    <activeVehicleEeInformation delta=\"true\" fin=\"9BM938142LS057394\">\r\n"
				+ "        <activeState>\r\n"
				+ "            <maxSpeedData modifiedMaxSpeed=\"116.0\" cesarNumber=\"87540588\" unit=\"km/h\"/>\r\n"
				+ "        </activeState>\r\n"
				+ "    </activeVehicleEeInformation>\r\n"
				+ "    <executionSettings userId=\"D7APALEO\" date=\"2022-04-25T12:14:57.068Z\" causation=\"flash\" issueThreshold=\"err\" unresolvedConflictAction=\"notifyAdmin\" systemPriority=\"1\"/>\r\n"
				+ "</v:storeVehicleEeInformationRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Zbl_Pkw_Neu()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\"?><v:storeVehicleEeInformationRequest xmlns:v=\"http://vehicle.vedoc.daimler.com/ai\" xmlns:xalan=\"http://xml.apache.org/xalan\" xmlns:ext=\"xalan://com.daimler.zbl.transformation.common.jaxb.xslt.XSLTExtensions\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" category=\"VehicleAdapter\" version=\"21.2.1.1\">\r\n"
				+ "    <requestHeader context=\"\" credentials=\"\" delta=\"true\" userId=\"VEDOC_tec_46\"/>\r\n"
				+ "    <activeVehicleEeInformation delta=\"true\" fin=\"WDCYC3KF7HX276380\">\r\n"
				+ "        <activeState>\r\n"
				+ "            <controlUnit delta=\"true\" cuDesignation=\"CEPC\" allowCuCreationWithoutProductionView=\"true\">\r\n"
				+ "                <activeState cvnCoding=\"9361076B\" serialNumber=\"03856\" version=\"64\" objectNumber=\"0009015402\" installedSoftwareDelta=\"false\">\r\n"
				+ "                    <installedSoftware drawingAndGeometryStatus=\"\" objectNumber=\"0009041700\"/>\r\n"
				+ "                    <installedSoftware drawingAndGeometryStatus=\"\" objectNumber=\"0009028829\"/>\r\n"
				+ "                    <installedSoftware drawingAndGeometryStatus=\"\" objectNumber=\"0009034607\"/>\r\n"
				+ "                    <scnIdentification scnIdentification=\"000901540290000C\"/>\r\n"
				+ "                    <sumsCuData groupScnIdentification=\"000901540290000C\">\r\n"
				+ "                        <qntData scnIdentification=\"0009028829900002\" softwareObjectNumber=\"0009028829\" variantNumber=\"QNT463I2518\" vcDefVariantNumber=\"QNT463I2518\"/>\r\n"
				+ "                    </sumsCuData>\r\n"
				+ "                </activeState>\r\n"
				+ "            </controlUnit>\r\n"
				+ "        </activeState>\r\n"
				+ "    </activeVehicleEeInformation>\r\n"
				+ "    <executionSettings userId=\"D7AJTHAO\" date=\"2022-04-28T23:11:32.602Z\" causation=\"flash\" issueThreshold=\"err\" unresolvedConflictAction=\"notifyAdmin\" systemPriority=\"1\"/>\r\n"
				+ "</v:storeVehicleEeInformationRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\r\n"
				+ "<ECUDATA>\r\n"
				+ "  <HEADER>\r\n"
				+ "    <TIMESTAMP>2022-04-24-07:44:07</TIMESTAMP>\r\n"
				+ "    <VIN>RS396440250577421</VIN>\r\n"
				+ "  </HEADER>\r\n"
				+ "  <ECU>\r\n"
				+ "    <DIAG-PARTNUMBER>0014442921</DIAG-PARTNUMBER>\r\n"
				+ "    <DIAG-ZGS>007</DIAG-ZGS>\r\n"
				+ "    <ECUNAME>ICUC01T</ECUNAME>\r\n"
				+ "    <HW-PARTNUMBER>0134467421</HW-PARTNUMBER>\r\n"
				+ "    <HW-ZGS>001</HW-ZGS>\r\n"
				+ "    <PLANT>0600</PLANT>\r\n"
				+ "    <SERIALNUMBER>22031-0368</SERIALNUMBER>\r\n"
				+ "    <SW-PARTNUMBER-LIST>\r\n"
				+ "      <SW-PARTNUMBER prio=\"1\">0324486721</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"1\">001</SW-ZGS>\r\n"
				+ "      <SW-PARTNUMBER prio=\"2\">0364480721</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"2\">001</SW-ZGS>\r\n"
				+ "      <SW-PARTNUMBER prio=\"3\">0274488821</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"3\">001</SW-ZGS>\r\n"
				+ "      <SW-PARTNUMBER prio=\"4\">0224486021</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"4\">001</SW-ZGS>\r\n"
				+ "      <SW-PARTNUMBER prio=\"5\">0224483021</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"5\">001</SW-ZGS>\r\n"
				+ "      <SW-PARTNUMBER prio=\"6\">0364480821</SW-PARTNUMBER>\r\n"
				+ "      <SW-ZGS prio=\"6\">001</SW-ZGS>\r\n"
				+ "    </SW-PARTNUMBER-LIST>\r\n"
				+ "  </ECU>\r\n"
				+ "  <VARCODEDOMAINS>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x4001_Vehicle_config</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String PID 4001h Truck</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A0554478521</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramFOTA</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>FOTA disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0414473121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDifflockSwitch</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Difflock switch disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0434472121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPairing</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Pairing disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0434472321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramAdditionalTank</FRAGNAME>\r\n"
				+ "          <FRAGVAL>2</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Warning additional tank right</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0434472721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramBSMTrailerConfig</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>BSMTrailerConfig disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0434472921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTSUSource</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>TSU source sensor</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0434473021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPanelDimTm_Enable</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Panal DimTm disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0554478621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPanelLmpDimVal_Night</FRAGNAME>\r\n"
				+ "          <FRAGVAL>50</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Panel Lamp Dimming 50 percent</FRAGMEANING>\r\n"
				+ "          <FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "          <PARTNUMBER>A0554478821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUpHystInfinity</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>PPC Upper Hysteresis infinity not allowed</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0554479021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUpHystMaxVal</FRAGNAME>\r\n"
				+ "          <FRAGVAL>15</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>PPC Upper Hysteresis maximum value 15 km/h</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0554479121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDimmingConcept</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Dimming concept new enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0554479621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramWeightMenu</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>WeightMenu not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0564470921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramBSMToggleInhibit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>BSM Toggle Inhibit not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0564471121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramSeatbeltSpeed</FRAGNAME>\r\n"
				+ "          <FRAGVAL>10</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>SeatbeltSpeed 10 km/h</FRAGMEANING>\r\n"
				+ "          <FRAGUNIT>km/h</FRAGUNIT>\r\n"
				+ "          <PARTNUMBER>A0564471421</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramSeatbeltDuration</FRAGNAME>\r\n"
				+ "          <FRAGVAL>35000</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>SeatbeltDuration 35000 ms</FRAGMEANING>\r\n"
				+ "          <FRAGUNIT>ms</FRAGUNIT>\r\n"
				+ "          <PARTNUMBER>A0564471721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramABAToggleInhibit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>ABA Toggle Inhibit not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0564472921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramLDWToggleInhibit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>LDW Toggle Inhibit not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0564473121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramRockOutMode</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Rock Out Mode enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614477121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDPFInhibit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>DPF inhibit Disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614477221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>002</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDPFRegen</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>DPF Regen Disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614477421</PARTNUMBER>\r\n"
				+ "          <PARTZGS>002</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTPMNewConcept</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>TPM new concept enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614477721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDifflockNewConcept</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Difflock new concept disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614477821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramNightLight</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Night Light enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614478121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTruckEntranceLight</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Entrance Light enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614478321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTempCompensationTSU</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Temperature compensation TSU enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614478921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramEAPUType</FRAGNAME>\r\n"
				+ "          <FRAGVAL>2</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>EAPU type EAPU2 with ePBC</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9624471321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x41_Video_configuration_general</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String PID 41h_general Truck</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9604473821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>002</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramVideoInput1</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>VideoInput1 no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604473221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramVideoChannelReverseGear</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>no camera</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604476321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramVideoReversePopup</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Video reverse popup no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604478321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x41_Video_configuration_channel_1</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String PID 41h_channel_1 Truck</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9604474521</PARTNUMBER>\r\n"
				+ "          <PARTZGS>003</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x42_Trailer_config</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String PID 42h Truck</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9604474621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>002</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x36_Dynamic_Trip_computer_parameters</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String PID 36h Truck ab Cluster 3</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9614470821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTCDieselRangeCons</FRAGNAME>\r\n"
				+ "          <FRAGVAL>8750</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Initial value diesel consumption HDEP</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604479521</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTCConsCyclesAuto</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1500</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Initial consumption after reset HDEP EURO 3</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614479221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x37_Dynamic_EDF_configuration_parameters</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Default String Gen5 PID 37h Truck</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9614474321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramEDFVersion</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>EDF version 1.0</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614479521</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x43_MBT_config</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Defaultstring_PID43 MBT R1502</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9614478721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramEQR</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>paramEQR not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0414479621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMaxAllowedSpeed</FRAGNAME>\r\n"
				+ "          <FRAGVAL>200</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Overspeed 200 km per h</FRAGMEANING>\r\n"
				+ "          <FRAGUNIT>km/h</FRAGUNIT>\r\n"
				+ "          <PARTNUMBER>A0594479121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTrailerCoupling</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Trailer coupling available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604476921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramHeadlightLeveling</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>ParamHeadlightLeveling not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614474021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>002</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramHydromove</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Hydromove not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614476021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDispModePNM</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>New PNM menu not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9624470021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PID_0x40_Vehicle_config</VCDQUALIFIER>\r\n"
				+ "        <DEFAULT>\r\n"
				+ "          <DEFAULTNAME>Defaultstring_PID40 Truck Gen5 R1502</DEFAULTNAME>\r\n"
				+ "          <PARTNUMBER>A9614478821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </DEFAULT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramAdBlueTripmeter</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>no indication AdBlue range</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A0354477921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUnitSpeed</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Speed Unit km/h</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604470121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUnitConsumption</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Fuel Consumptiion Unit l/100km</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604470321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUnitDistance</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Distance Unit kilometers</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604470621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramUnitVolume</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Volume Unit liters</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604470821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramAirPressureUnit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Air Pressure Unit bar</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604471121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramWeightUnit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Weight Unit metric ton</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604471421</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTemperatureUnit</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Temperature Unit Celsius</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604471721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTimeDisplayMode</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Time display mode: 24h indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604472221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDateDisplayMode</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Date display mode: dd.mm.yyyy</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604472321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPTO</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Power take-off not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604472621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMenuAxleLoad</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Menu Axle Load no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604472821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMenuLevelIndication</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Menu Level Indication indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604473121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramHillholder</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Hillholder indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604474221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramESP</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>ESP indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604474421</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramDTCIndicationStatus</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Only current active DTC</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604475121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramAudio</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Audio indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604475621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPhone</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Phone indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604475821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramNavigation</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Navigation no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604475921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTelematic</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Telematic no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604476121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMenuEmergencyGear</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Emergency gear menu no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604476621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramPNMMenuPage</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>PNM menu no indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604477021</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramLINavailable</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>EAPU LIN not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604477321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramEDF</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>menu EDF available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604477621</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramFMSavailable</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>FMS menu not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604477921</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>param2ndLevel</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>without 2nd level</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604478121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramASR</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Traction control indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604478721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMVBVIndication</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>menu MV/BV not available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9604478821</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramMenuCrawling</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>Menu crawling available</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614470121</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTCVolumeCorrectionFactor</FRAGNAME>\r\n"
				+ "          <FRAGVAL>$5F</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>correction 97%</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614470221</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramStartCheck</FRAGNAME>\r\n"
				+ "          <FRAGVAL>0</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>StartCheck disabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614470321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramNewOilLevelConcept</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>paramNewOilLevelConcept enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614470721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramIPPCNewConcept</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>paramIPPCNewConcept indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614471321</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramTCOAdditionalData</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>paramTCOAdditionalData indication</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614471521</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "        <FRAGMENT>\r\n"
				+ "          <FRAGNAME>paramStereoSound</FRAGNAME>\r\n"
				+ "          <FRAGVAL>1</FRAGVAL>\r\n"
				+ "          <FRAGMEANING>paramStereoSound enabled</FRAGMEANING>\r\n"
				+ "          <PARTNUMBER>A9614471721</PARTNUMBER>\r\n"
				+ "          <PARTZGS>001</PARTZGS>\r\n"
				+ "        </FRAGMENT>\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "  </VARCODEDOMAINS>\r\n"
				+ "</ECUDATA>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Iag_Achswerke_Kassel()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-8\"?><ns1:storeAxleRequest xmlns:ns1=\"http://majorassembly.vedoc.daimler.com/ai\" category=\"MajorAssemblyAdapter\" version=\"16.1.1.1\"><requestHeader userId=\"VEDOC_tec_BI\" context=\"==741421K1471836==\"/><axle id=\"741421K1471836\" dataCardAvailable=\"true\" delta=\"false\" objectNumber=\"A9073503000\" objectNumberVariant=\"X004071303\"><activeAssignedFpd><saa amountPerSaa=\"1\" saaDesignation=\"50423414\"/><saa amountPerSaa=\"1\" saaDesignation=\"50400047\"/><saa amountPerSaa=\"1\" saaDesignation=\"50400889\"/><saa amountPerSaa=\"1\" saaDesignation=\"50400972\"/><saa amountPerSaa=\"1\" saaDesignation=\"50401136\"/><saa amountPerSaa=\"1\" saaDesignation=\"50401210\"/><saa amountPerSaa=\"1\" saaDesignation=\"50401310\"/><saa amountPerSaa=\"1\" saaDesignation=\"50440843\"/><saa amountPerSaa=\"1\" saaDesignation=\"50401613\"/><saa amountPerSaa=\"1\" saaDesignation=\"50423119\"/><saa amountPerSaa=\"1\" saaDesignation=\"50423233\"/><saa amountPerSaa=\"1\" saaDesignation=\"T6900164\"/><saa amountPerSaa=\"1\" saaDesignation=\"T6900165\"/></activeAssignedFpd><activeProductDate technicalApprovalDate=\"20220429\"/><activeCustomer customerNumber=\"MBVCHAA\" addressOld=\"MB AG W90 - Schenker / Charleston,Mercatorinsel 20,47119,Duisburg\"/><activeState orderNumber=\"6940018015\" plant=\"P0690\" productionNumber=\"5150510\" status=\"inFinalAccept\" wheel=\"51:13 I=3,923\"/></axle><executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_BI\"/></ns1:storeAxleRequest>\r\n"
				+ "\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Finas_Vedoc_RD()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\"?><ns1:storeVehicleRequest xmlns:ns1=\"http://vehicle.vedoc.daimler.com/ai\" category=\"VehicleAdapter\" version=\"20.2.1.1\"><requestHeader userId=\"VEDOC_tec_RD\" context=\"fin=W1K2971231A000093\"/><vehicle fin=\"W1K2971231A000093\" productSeries=\"297\" vehicleModelDesignation=\"297123\"><activeAssignedFpd><equipmentCodes code=\"003\" codeType=\"sales\"/><equipmentCodes code=\"017\" codeType=\"sales\"/><equipmentCodes code=\"01T\" codeType=\"sales\"/><equipmentCodes code=\"01U\" codeType=\"sales\"/><equipmentCodes code=\"04T\" codeType=\"sales\"/><equipmentCodes code=\"0U5\" codeType=\"sales\"/><equipmentCodes code=\"100\" codeType=\"sales\"/><equipmentCodes code=\"12U\" codeType=\"sales\"/><equipmentCodes code=\"13U\" codeType=\"sales\"/><equipmentCodes code=\"14U\" codeType=\"sales\"/><equipmentCodes code=\"16U\" codeType=\"sales\"/><equipmentCodes code=\"17U\" codeType=\"sales\"/><equipmentCodes code=\"1B5\" codeType=\"sales\"/><equipmentCodes code=\"200A\" codeType=\"sales\"/><equipmentCodes code=\"201\" codeType=\"sales\"/><equipmentCodes code=\"215\" codeType=\"sales\"/><equipmentCodes code=\"21U\" codeType=\"sales\"/><equipmentCodes code=\"221A\" codeType=\"sales\"/><equipmentCodes code=\"233\" codeType=\"sales\"/><equipmentCodes code=\"235\" codeType=\"sales\"/><equipmentCodes code=\"23B\" codeType=\"sales\"/><equipmentCodes code=\"241\" codeType=\"sales\"/><equipmentCodes code=\"242\" codeType=\"sales\"/><equipmentCodes code=\"247\" codeType=\"sales\"/><equipmentCodes code=\"249\" codeType=\"sales\"/><equipmentCodes code=\"251B\" codeType=\"sales\"/><equipmentCodes code=\"262\" codeType=\"sales\"/><equipmentCodes code=\"266\" codeType=\"sales\"/><equipmentCodes code=\"272\" codeType=\"sales\"/><equipmentCodes code=\"275\" codeType=\"sales\"/><equipmentCodes code=\"287\" codeType=\"sales\"/><equipmentCodes code=\"290\" codeType=\"sales\"/><equipmentCodes code=\"292\" codeType=\"sales\"/><equipmentCodes code=\"294\" codeType=\"sales\"/><equipmentCodes code=\"299\" codeType=\"sales\"/><equipmentCodes code=\"306\" codeType=\"sales\"/><equipmentCodes code=\"309\" codeType=\"sales\"/><equipmentCodes code=\"30U\" codeType=\"sales\"/><equipmentCodes code=\"318\" codeType=\"sales\"/><equipmentCodes code=\"321\" codeType=\"sales\"/><equipmentCodes code=\"324\" codeType=\"sales\"/><equipmentCodes code=\"326\" codeType=\"sales\"/><equipmentCodes code=\"32T\" codeType=\"sales\"/><equipmentCodes code=\"32U\" codeType=\"sales\"/><equipmentCodes code=\"346B\" codeType=\"sales\"/><equipmentCodes code=\"351\" codeType=\"sales\"/><equipmentCodes code=\"355\" codeType=\"sales\"/><equipmentCodes code=\"35U\" codeType=\"sales\"/><equipmentCodes code=\"365\" codeType=\"sales\"/><equipmentCodes code=\"367\" codeType=\"sales\"/><equipmentCodes code=\"384\" codeType=\"sales\"/><equipmentCodes code=\"401\" codeType=\"sales\"/><equipmentCodes code=\"413\" codeType=\"sales\"/><equipmentCodes code=\"431\" codeType=\"sales\"/><equipmentCodes code=\"436\" codeType=\"sales\"/><equipmentCodes code=\"437\" codeType=\"sales\"/><equipmentCodes code=\"464\" codeType=\"sales\"/><equipmentCodes code=\"475\" codeType=\"sales\"/><equipmentCodes code=\"489\" codeType=\"sales\"/><equipmentCodes code=\"500\" codeType=\"sales\"/><equipmentCodes code=\"501\" codeType=\"sales\"/><equipmentCodes code=\"502\" codeType=\"sales\"/><equipmentCodes code=\"513\" codeType=\"sales\"/><equipmentCodes code=\"51U\" codeType=\"sales\"/><equipmentCodes code=\"534\" codeType=\"sales\"/><equipmentCodes code=\"546\" codeType=\"sales\"/><equipmentCodes code=\"55B\" codeType=\"sales\"/><equipmentCodes code=\"580\" codeType=\"sales\"/><equipmentCodes code=\"587\" codeType=\"sales\"/><equipmentCodes code=\"5B1\" codeType=\"sales\"/><equipmentCodes code=\"5V5\" codeType=\"sales\"/><equipmentCodes code=\"628\" codeType=\"sales\"/><equipmentCodes code=\"653\" codeType=\"sales\"/><equipmentCodes code=\"65B\" codeType=\"sales\"/><equipmentCodes code=\"682\" codeType=\"sales\"/><equipmentCodes code=\"6P5\" codeType=\"sales\"/><equipmentCodes code=\"6T3\" codeType=\"sales\"/><equipmentCodes code=\"70B\" codeType=\"sales\"/><equipmentCodes code=\"723\" codeType=\"sales\"/><equipmentCodes code=\"72B\" codeType=\"sales\"/><equipmentCodes code=\"772\" codeType=\"sales\"/><equipmentCodes code=\"799U\" codeType=\"sales\"/><equipmentCodes code=\"7U2\" codeType=\"sales\"/><equipmentCodes code=\"802\" codeType=\"sales\"/><equipmentCodes code=\"810\" codeType=\"sales\"/><equipmentCodes code=\"819L\" codeType=\"sales\"/><equipmentCodes code=\"81B\" codeType=\"sales\"/><equipmentCodes code=\"830\" codeType=\"sales\"/><equipmentCodes code=\"83B\" codeType=\"sales\"/><equipmentCodes code=\"868\" codeType=\"sales\"/><equipmentCodes code=\"871\" codeType=\"sales\"/><equipmentCodes code=\"876\" codeType=\"sales\"/><equipmentCodes code=\"878\" codeType=\"sales\"/><equipmentCodes code=\"889\" codeType=\"sales\"/><equipmentCodes code=\"890\" codeType=\"sales\"/><equipmentCodes code=\"891\" codeType=\"sales\"/><equipmentCodes code=\"897\" codeType=\"sales\"/><equipmentCodes code=\"898\" codeType=\"sales\"/><equipmentCodes code=\"8U4\" codeType=\"sales\"/><equipmentCodes code=\"8XXL\" codeType=\"sales\"/><equipmentCodes code=\"914\" codeType=\"sales\"/><equipmentCodes code=\"981\" codeType=\"sales\"/><equipmentCodes code=\"986\" codeType=\"sales\"/><equipmentCodes code=\"989\" codeType=\"sales\"/><equipmentCodes code=\"AB1\" codeType=\"sales\"/><equipmentCodes code=\"B08\" codeType=\"sales\"/><equipmentCodes code=\"B53\" codeType=\"sales\"/><equipmentCodes code=\"B59\" codeType=\"sales\"/><equipmentCodes code=\"BAC\" codeType=\"sales\"/><equipmentCodes code=\"EMQ\" codeType=\"sales\"/><equipmentCodes code=\"F297\" codeType=\"sales\"/><equipmentCodes code=\"FV\" codeType=\"sales\"/><equipmentCodes code=\"GA\" codeType=\"sales\"/><equipmentCodes code=\"H12\" codeType=\"sales\"/><equipmentCodes code=\"HA\" codeType=\"sales\"/><equipmentCodes code=\"IA4\" codeType=\"sales\"/><equipmentCodes code=\"K14\" codeType=\"sales\"/><equipmentCodes code=\"K32\" codeType=\"sales\"/><equipmentCodes code=\"K33\" codeType=\"sales\"/><equipmentCodes code=\"K34\" codeType=\"sales\"/><equipmentCodes code=\"L\" codeType=\"sales\"/><equipmentCodes code=\"L5C\" codeType=\"sales\"/><equipmentCodes code=\"MEC3\" codeType=\"sales\"/><equipmentCodes code=\"N02\" codeType=\"sales\"/><equipmentCodes code=\"N03\" codeType=\"sales\"/><equipmentCodes code=\"N17\" codeType=\"sales\"/><equipmentCodes code=\"N1H\" codeType=\"sales\"/><equipmentCodes code=\"N29\" codeType=\"sales\"/><equipmentCodes code=\"N2E\" codeType=\"sales\"/><equipmentCodes code=\"N5C\" codeType=\"sales\"/><equipmentCodes code=\"P14\" codeType=\"sales\"/><equipmentCodes code=\"P17\" codeType=\"sales\"/><equipmentCodes code=\"P20\" codeType=\"sales\"/><equipmentCodes code=\"P31\" codeType=\"sales\"/><equipmentCodes code=\"P47\" codeType=\"sales\"/><equipmentCodes code=\"P49\" codeType=\"sales\"/><equipmentCodes code=\"P53\" codeType=\"sales\"/><equipmentCodes code=\"PAI\" codeType=\"sales\"/><equipmentCodes code=\"PAX\" codeType=\"sales\"/><equipmentCodes code=\"PBF\" codeType=\"sales\"/><equipmentCodes code=\"PDB\" codeType=\"sales\"/><equipmentCodes code=\"QB4\" codeType=\"sales\"/><equipmentCodes code=\"QR4\" codeType=\"sales\"/><equipmentCodes code=\"R03\" codeType=\"sales\"/><equipmentCodes code=\"R06\" codeType=\"sales\"/><equipmentCodes code=\"R7Q\" codeType=\"sales\"/><equipmentCodes code=\"U01\" codeType=\"sales\"/><equipmentCodes code=\"U10\" codeType=\"sales\"/><equipmentCodes code=\"U19\" codeType=\"sales\"/><equipmentCodes code=\"U22\" codeType=\"sales\"/><equipmentCodes code=\"U25\" codeType=\"sales\"/><equipmentCodes code=\"U60\" codeType=\"sales\"/><equipmentCodes code=\"U82\" codeType=\"sales\"/><equipmentCodes code=\"VL\" codeType=\"sales\"/><equipmentCodes code=\"VR\" codeType=\"sales\"/><equipmentCodes code=\"025K\" codeType=\"sales\"/></activeAssignedFpd><activeProductDate dateOfFirstRegistration=\"20200916\" technicalApprovalDate=\"20201012\"/><activeModelPlate countOfSeats=\"5\" modelYear=\"2022\" power=\"245\" salesDesignation=\"EQS 450+\" vehicleWeightKg=\"3015\"/><activeState vin=\"W1KCG2DBXNA000093\"><controlUnit cuDesignation=\"EPT20INV2\"><activeState objectNumber=\"2979014602\"><installedSoftware objectNumber=\"2979041400\"/><installedSoftware objectNumber=\"2979027802\"/><installedSoftware objectNumber=\"2979033300\"/></activeState></controlUnit><controlUnit cuDesignation=\"SEAT_D223\"><activeState objectNumber=\"2069011300\"><installedSoftware objectNumber=\"2069035401\"/><installedSoftware objectNumber=\"2069021803\"/></activeState></controlUnit><controlUnit cuDesignation=\"PTCM223\"><activeState objectNumber=\"2979019402\"><installedSoftware objectNumber=\"2979025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"HFA223\"><activeState objectNumber=\"2239052000\"/></controlUnit><controlUnit cuDesignation=\"WMI7R\"><activeState objectNumber=\"0000000000\"/></controlUnit><controlUnit cuDesignation=\"SPC223\"><activeState objectNumber=\"2979010101\"><installedSoftware objectNumber=\"2239044200\"/><installedSoftware objectNumber=\"2239026808\"/><installedSoftware objectNumber=\"2239036103\"/><installedSoftware objectNumber=\"2239032903\"/></activeState></controlUnit><controlUnit cuDesignation=\"VCS177\"><activeState objectNumber=\"2479007708\"/></controlUnit><controlUnit cuDesignation=\"BMS40\"><activeState objectNumber=\"7899011601\"><installedSoftware objectNumber=\"7899048500\"/><installedSoftware objectNumber=\"7899022002\"/><installedSoftware objectNumber=\"7899032001\"/></activeState></controlUnit><controlUnit cuDesignation=\"IBS206\"><activeState objectNumber=\"0009056511\"/></controlUnit><controlUnit cuDesignation=\"DH_FR223\"><activeState objectNumber=\"0997603203\"><installedSoftware objectNumber=\"??????????\"/></activeState></controlUnit><controlUnit cuDesignation=\"PHD206_FR\"><activeState objectNumber=\"2069012105\"><installedSoftware objectNumber=\"2069025403\"/></activeState></controlUnit><controlUnit cuDesignation=\"ESP223\"><activeState objectNumber=\"2239017303\"><installedSoftware objectNumber=\"2979020101\"/></activeState></controlUnit><controlUnit cuDesignation=\"SND7\"><activeState objectNumber=\"2979017803\"><installedSoftware objectNumber=\"2979041000\"/><installedSoftware objectNumber=\"2979028203\"/><installedSoftware objectNumber=\"2979032501\"/><installedSoftware objectNumber=\"2979034300\"/><installedSoftware objectNumber=\"2979031001\"/><installedSoftware objectNumber=\"2979032700\"/></activeState></controlUnit><controlUnit cuDesignation=\"TPM223\"><activeState objectNumber=\"0009012514\"><installedSoftware objectNumber=\"0009040102\"/><installedSoftware objectNumber=\"0009020276\"/></activeState></controlUnit><controlUnit cuDesignation=\"DH_RR223\"><activeState objectNumber=\"0997603003\"><installedSoftware objectNumber=\"??????????\"/></activeState></controlUnit><controlUnit cuDesignation=\"DISPD223ENTRY\"><activeState objectNumber=\"2979017102\"><installedSoftware objectNumber=\"2979023600\"/></activeState></controlUnit><controlUnit cuDesignation=\"SEAT_P223\"><activeState objectNumber=\"2069011000\"><installedSoftware objectNumber=\"2069035401\"/><installedSoftware objectNumber=\"2069021903\"/></activeState></controlUnit><controlUnit cuDesignation=\"DSM_WM_D223\"><activeState objectNumber=\"2239012214\"><installedSoftware objectNumber=\"??????????\"/><installedSoftware objectNumber=\"2239028715\"/></activeState></controlUnit><controlUnit cuDesignation=\"DH_RL223\"><activeState objectNumber=\"0997602903\"><installedSoftware objectNumber=\"??????????\"/></activeState></controlUnit><controlUnit cuDesignation=\"HOSWD223\"><activeState objectNumber=\"0009010317\"><installedSoftware objectNumber=\"0009028672\"/></activeState></controlUnit><controlUnit cuDesignation=\"DH_FL223\"><activeState objectNumber=\"0997603103\"><installedSoftware objectNumber=\"??????????\"/></activeState></controlUnit><controlUnit cuDesignation=\"CTRLU223\"><activeState objectNumber=\"2239010310\"><installedSoftware objectNumber=\"2239021619\"/><installedSoftware objectNumber=\"2239028520\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_FR223\"><activeState objectNumber=\"0000000000\"><installedSoftware objectNumber=\"2239025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_RR223\"><activeState objectNumber=\"0000000000\"><installedSoftware objectNumber=\"2239025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"PHD206_FL\"><activeState objectNumber=\"2069012105\"><installedSoftware objectNumber=\"2069025403\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_CR223\"><activeState objectNumber=\"0000000000\"/></controlUnit><controlUnit cuDesignation=\"WMI7D\"><activeState objectNumber=\"2239014511\"><installedSoftware objectNumber=\"2239026917\"/></activeState></controlUnit><controlUnit cuDesignation=\"SMPC223\"><activeState objectNumber=\"2239018212\"><installedSoftware objectNumber=\"2239020821\"/></activeState></controlUnit><controlUnit cuDesignation=\"DSM_MS_P223\"><activeState objectNumber=\"2239013612\"><installedSoftware objectNumber=\"??????????\"/><installedSoftware objectNumber=\"2239020913\"/></activeState></controlUnit><controlUnit cuDesignation=\"CAL223\"><activeState objectNumber=\"2239011015\"><installedSoftware objectNumber=\"2979022502\"/><installedSoftware objectNumber=\"2979028503\"/></activeState></controlUnit><controlUnit cuDesignation=\"LSM223_FR\"><activeState objectNumber=\"2069011306\"><installedSoftware objectNumber=\"2239025706\"/><installedSoftware objectNumber=\"2069022002\"/></activeState></controlUnit><controlUnit cuDesignation=\"OBL297\"><activeState objectNumber=\"0009017514\" serialNumber=\"2006170014\"><installedSoftware objectNumber=\"0009028085\"/></activeState></controlUnit><controlUnit cuDesignation=\"RAMSES\"><activeState objectNumber=\"2069017707\" serialNumber=\"RB11HCND320506000317\"><additionalComponent alias=\"IMEI\" id=\"356853100103656\"/><additionalComponent alias=\"IMSI\" id=\"460094024711961\"/><additionalComponent alias=\"ICCID\" id=\"89860920740025433714\"/><additionalComponent alias=\"EID1\" id=\"FFFFFFFFFFFFFFFFFFFFFFFF\"/><additionalComponent alias=\"EID2\" id=\"FFFFFFFF\"/><installedSoftware objectNumber=\"2069024605\"/><installedSoftware objectNumber=\"2069023304\"/><installedSoftware objectNumber=\"0009028875\"/><installedSoftware objectNumber=\"0009028975\"/><installedSoftware objectNumber=\"0009029075\"/><installedSoftware objectNumber=\"0009027076\"/><installedSoftware objectNumber=\"0009029275\"/><installedSoftware objectNumber=\"0009029375\"/><installedSoftware objectNumber=\"0009029475\"/><installedSoftware objectNumber=\"0009029575\"/><installedSoftware objectNumber=\"0009029675\"/><installedSoftware objectNumber=\"0009024572\"/><installedSoftware objectNumber=\"0009024672\"/><installedSoftware objectNumber=\"0009020577\"/><installedSoftware objectNumber=\"0009029875\"/><installedSoftware objectNumber=\"0009024972\"/><installedSoftware objectNumber=\"0009025072\"/><installedSoftware objectNumber=\"0009025172\"/><installedSoftware objectNumber=\"0009025272\"/><installedSoftware objectNumber=\"0009025372\"/><installedSoftware objectNumber=\"0009025472\"/><installedSoftware objectNumber=\"0009025572\"/><installedSoftware objectNumber=\"0009025672\"/></activeState></controlUnit><controlUnit cuDesignation=\"RBTMFR223\"><activeState objectNumber=\"2239011800\"><installedSoftware objectNumber=\"2239026311\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_RL223\"><activeState objectNumber=\"0000000000\"><installedSoftware objectNumber=\"2239025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"AVAS223\"><activeState objectNumber=\"2239016802\"><installedSoftware objectNumber=\"2979042700\"/><installedSoftware objectNumber=\"2979028003\"/><installedSoftware objectNumber=\"2979032401\"/></activeState></controlUnit><controlUnit cuDesignation=\"DMRR223\"><activeState objectNumber=\"2239011711\"><installedSoftware objectNumber=\"2069027704\"/></activeState></controlUnit><controlUnit cuDesignation=\"HVAC223\"><activeState objectNumber=\"2239011006\"><installedSoftware objectNumber=\"2069020804\"/></activeState></controlUnit><controlUnit cuDesignation=\"RAS223\"><activeState objectNumber=\"2239017607\"><installedSoftware objectNumber=\"0000000000\"/><installedSoftware objectNumber=\"2239023821\"/></activeState></controlUnit><controlUnit cuDesignation=\"EC213\"><activeState objectNumber=\"2978101000\"/></controlUnit><controlUnit cuDesignation=\"BC_R206\"><activeState objectNumber=\"2979018201\"><installedSoftware objectNumber=\"2069042600\"/><installedSoftware objectNumber=\"2069028404\"/></activeState></controlUnit><controlUnit cuDesignation=\"DSM_MS_D223\"><activeState objectNumber=\"2239011712\"><installedSoftware objectNumber=\"??????????\"/><installedSoftware objectNumber=\"2239020913\"/></activeState></controlUnit><controlUnit cuDesignation=\"MMR223_FL\"><activeState objectNumber=\"0009019115\"><installedSoftware objectNumber=\"0009025080\"/></activeState></controlUnit><controlUnit cuDesignation=\"HLI_FL223\"><activeState objectNumber=\"2239018405\"><installedSoftware objectNumber=\"2239022612\"/></activeState></controlUnit><controlUnit cuDesignation=\"MMR223_RL\"><activeState objectNumber=\"0009019115\"><installedSoftware objectNumber=\"0009024980\"/></activeState></controlUnit><controlUnit cuDesignation=\"MMR223_RR\"><activeState objectNumber=\"0009019115\"><installedSoftware objectNumber=\"0009024980\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_CL223\"><activeState objectNumber=\"2979016700\"><installedSoftware objectNumber=\"2239025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"HLI_FR223\"><activeState objectNumber=\"2239018505\"><installedSoftware objectNumber=\"2239022612\"/></activeState></controlUnit><controlUnit cuDesignation=\"MMR223_FR\"><activeState objectNumber=\"0009019115\"><installedSoftware objectNumber=\"0009025080\"/></activeState></controlUnit><controlUnit cuDesignation=\"ORC223\"><activeState objectNumber=\"2239018111\"><installedSoftware objectNumber=\"2239040001\"/><installedSoftware objectNumber=\"2239029622\"/><installedSoftware objectNumber=\"2979039800\"/><installedSoftware objectNumber=\"2069039600\"/></activeState></controlUnit><controlUnit cuDesignation=\"SWSP223\"><activeState objectNumber=\"0999017601\"><installedSoftware objectNumber=\"0999025500\"/></activeState></controlUnit><controlUnit cuDesignation=\"CPC3EV297\"><activeState objectNumber=\"0009014908\" serialNumber=\"2105280001515800\"><installedSoftware objectNumber=\"0009041601\"/><installedSoftware objectNumber=\"0009021683\"/></activeState></controlUnit><controlUnit cuDesignation=\"BC_F206\"><activeState objectNumber=\"2979017101\"><installedSoftware objectNumber=\"2069042800\"/><installedSoftware objectNumber=\"2069020404\"/><installedSoftware objectNumber=\"2069020604\"/></activeState></controlUnit><controlUnit cuDesignation=\"RBTMFL223\"><activeState objectNumber=\"2239011700\"><installedSoftware objectNumber=\"2239026311\"/></activeState></controlUnit><controlUnit cuDesignation=\"WPRA206\"><activeState objectNumber=\"2978207000\"/></controlUnit><controlUnit cuDesignation=\"EACHV223\"><activeState objectNumber=\"0008305404\"/></controlUnit><controlUnit cuDesignation=\"EPS223\"><activeState objectNumber=\"2979019801\"><installedSoftware objectNumber=\"2979023302\"/></activeState></controlUnit><controlUnit cuDesignation=\"OCM223\"><activeState objectNumber=\"2239013802\"><installedSoftware objectNumber=\"2239040800\"/><installedSoftware objectNumber=\"2239022001\"/><installedSoftware objectNumber=\"2979031000\"/></activeState></controlUnit><controlUnit cuDesignation=\"GW223\"><activeState objectNumber=\"2069016107\"><installedSoftware objectNumber=\"2069025704\"/></activeState></controlUnit><controlUnit cuDesignation=\"DMD223\"><activeState objectNumber=\"2239011111\"><installedSoftware objectNumber=\"2069027604\"/></activeState></controlUnit><controlUnit cuDesignation=\"CLT_FL223\"><activeState objectNumber=\"0000000000\"><installedSoftware objectNumber=\"2239025803\"/></activeState></controlUnit><controlUnit cuDesignation=\"LRR223\"><activeState objectNumber=\"0009014114\"><installedSoftware objectNumber=\"0009047202\"/><installedSoftware objectNumber=\"0009029782\"/></activeState></controlUnit><controlUnit cuDesignation=\"DMP223\"><activeState objectNumber=\"2239011311\"><installedSoftware objectNumber=\"2069027604\"/></activeState></controlUnit><controlUnit cuDesignation=\"HVPTC_BAT297\"><activeState objectNumber=\"HETER?BS\"/></controlUnit><controlUnit cuDesignation=\"IC223\"><activeState objectNumber=\"2239016410\"><installedSoftware objectNumber=\"2239049101\"/><installedSoftware objectNumber=\"2239024522\"/><installedSoftware objectNumber=\"2239024622\"/><installedSoftware objectNumber=\"2239024722\"/><installedSoftware objectNumber=\"2239024822\"/><installedSoftware objectNumber=\"2239024922\"/><installedSoftware objectNumber=\"2239025022\"/></activeState></controlUnit><controlUnit cuDesignation=\"DCB223\"><activeState objectNumber=\"0009011410\"><installedSoftware objectNumber=\"0009041703\"/><installedSoftware objectNumber=\"0009029583\"/><installedSoftware objectNumber=\"0009035860\"/></activeState></controlUnit><controlUnit cuDesignation=\"HVPTC223\"><activeState objectNumber=\"HETER?BS\"/></controlUnit><controlUnit cuDesignation=\"DMRL223\"><activeState objectNumber=\"2239011511\"><installedSoftware objectNumber=\"2069027704\"/></activeState></controlUnit><controlUnit cuDesignation=\"HU7\"><activeState objectNumber=\"2369019300\" serialNumber=\"HBM656LS000160\"><installedSoftware objectNumber=\"2979042800\"/><installedSoftware objectNumber=\"2979021604\"/><installedSoftware objectNumber=\"2979021904\"/><installedSoftware objectNumber=\"2979022104\"/><installedSoftware objectNumber=\"2979033601\"/><installedSoftware objectNumber=\"2979036000\"/><installedSoftware objectNumber=\"2239030203\"/><installedSoftware objectNumber=\"2979020303\"/><installedSoftware objectNumber=\"2979033901\"/><installedSoftware objectNumber=\"2979022304\"/><installedSoftware objectNumber=\"2979022704\"/></activeState></controlUnit><controlUnit cuDesignation=\"EBB223\"><activeState objectNumber=\"2979018502\"><installedSoftware objectNumber=\"2239028400\"/></activeState></controlUnit><controlUnit cuDesignation=\"IDC223\"><activeState objectNumber=\"2239012415\"><installedSoftware objectNumber=\"2239045901\"/><installedSoftware objectNumber=\"2239023221\"/></activeState></controlUnit><controlUnit cuDesignation=\"EZS223\"><activeState objectNumber=\"2069016007\"><installedSoftware objectNumber=\"2069025604\"/></activeState></controlUnit><controlUnit cuDesignation=\"OHCM223\"><activeState objectNumber=\"0009017216\"><installedSoftware objectNumber=\"0009028182\"/></activeState></controlUnit><controlUnit cuDesignation=\"PARK223\"><activeState objectNumber=\"0009012916\"><installedSoftware objectNumber=\"0009049902\"/><installedSoftware objectNumber=\"0009025383\"/><installedSoftware objectNumber=\"0009034860\"/></activeState></controlUnit><controlUnit cuDesignation=\"TSSR223\"><activeState objectNumber=\"2239013108\"><installedSoftware objectNumber=\"2239025318\"/></activeState></controlUnit><controlUnit cuDesignation=\"DISPC223\"><activeState objectNumber=\"2239010513\"><installedSoftware objectNumber=\"2239020123\"/></activeState></controlUnit><controlUnit cuDesignation=\"LSM223_FL\"><activeState objectNumber=\"2069011306\"><installedSoftware objectNumber=\"2239025706\"/><installedSoftware objectNumber=\"2069022002\"/></activeState></controlUnit><controlUnit cuDesignation=\"DCDC223\"><activeState objectNumber=\"0003407902\"><installedSoftware objectNumber=\"0009042101\"/><installedSoftware objectNumber=\"0009020048\"/></activeState></controlUnit><controlUnit cuDesignation=\"DSM_MS_RR223\"><activeState objectNumber=\"2979019901\"><installedSoftware objectNumber=\"??????????\"/><installedSoftware objectNumber=\"2239028300\"/></activeState></controlUnit><controlUnit cuDesignation=\"SCCM223\"><activeState objectNumber=\"2979015702\"><installedSoftware objectNumber=\"2239025822\"/></activeState></controlUnit></activeState></vehicle><executionSettings causation=\"plant\" date=\"2022-03-06T04:46:02+01:00\" issueThreshold=\"err\" systemPriority=\"1\" unresolvedConflictAction=\"inclIssues\" userId=\"VEDOC_tec_RD\"/></ns1:storeVehicleRequest>\r\n"
				+ "\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Vanis()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\r\n"
				+ "<ns2:addProductLabelToParkingLotRequest category=\"ProductAdapter\" version=\"20.6.1.1\" xmlns:ns2=\"http://product.vedoc.daimler.com/ai\">\r\n"
				+ "	<requestHeader userId=\"VEDOC_tec_DS\"/>\r\n"
				+ "	<productId>W1V9101432N172823</productId>\r\n"
				+ "	<productType>vehicle</productType>\r\n"
				+ "	<productLabel>\r\n"
				+ "		<productLabel id=\"VAN_VIRTUAL\" name=\"VAN_VIRTUAL\" type=\"complete\">\r\n"
				+ "			<content key=\"#002\" value=\"172823\"/>\r\n"
				+ "			<content key=\"E002\" value=\"W1V9101432N172823\"/>\r\n"
				+ "			<content key=\"E004\" value=\"901\"/>\r\n"
				+ "			<content key=\"E021\" value=\"1\"/>\r\n"
				+ "			<content key=\"E022\" value=\"4\"/>\r\n"
				+ "			<content key=\"E023\" value=\"3\"/>\r\n"
				+ "			<content key=\"E024\" value=\"2\"/>\r\n"
				+ "			<content key=\"E025\" value=\"N\"/>\r\n"
				+ "			<content key=\"E026\" value=\"172823\"/>\r\n"
				+ "			<content key=\"E030\" value=\"W1V\"/>\r\n"
				+ "			<content key=\"E411\" value=\"\"/>\r\n"
				+ "			<content key=\"E412\" value=\"\"/>\r\n"
				+ "			<content key=\"E413\" value=\"410 4,1 60\"/>\r\n"
				+ "			<content key=\"E414\" value=\"550 5,5 80\"/>\r\n"
				+ "			<content key=\"0030\" value=\"FL3A5\"/>\r\n"
				+ "			<content key=\"0170\" value=\"-\"/>\r\n"
				+ "			<content key=\"0260\" value=\"225/75 R 16 CP 118 R\"/>\r\n"
				+ "			<content key=\"0300\" value=\"225/75 R 16 CP 118 R\"/>\r\n"
				+ "			<content key=\"0511\" value=\"1,0\"/>\r\n"
				+ "			<content key=\"0512\" value=\"\"/>\r\n"
				+ "			<content key=\"1150\" value=\"4200\"/>\r\n"
				+ "			<content key=\"1161\" value=\"2100\"/>\r\n"
				+ "			<content key=\"1163\" value=\"2430\"/>\r\n"
				+ "			<content key=\"1530\" value=\"5500\"/>\r\n"
				+ "		</productLabel>\r\n"
				+ "	</productLabel>\r\n"
				+ "	<executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_DS\"/>\r\n"
				+ "</ns2:addProductLabelToParkingLotRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Ascc_Xdcv()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"UTF-8\"?><p:storeProductCuInformationRequest xmlns:p=\"http://product.vedoc.daimler.com/ai\" xmlns:ext=\"xalan://com.daimler.zbl.jaxb.xslt.XSLTExtensions\" xmlns:xalan=\"http://xml.apache.org/xalan\" category=\"ProductAdapter\" version=\"18.6.1.1\"><requestHeader context=\"\" credentials=\"\" delta=\"true\" userId=\"VEDOC_tec_CP\"/><cuInformation delta=\"true\" finOrVin=\"WDB96423110194149\" productType=\"vehicle\"><controlUnit delta=\"true\" cuDesignation=\"SCH01T\" allowCuCreationWithoutProductionView=\"false\"><activeConfiguration downloadVersion=\"01.04.891\" diagDrawingAndGeometryStatus=\"002\" diagObjectNumber=\"0004442161\" dataRecordsDelta=\"false\" varCodingDomainDelta=\"false\"><cpVarCodingDomain>1F8B0800000000000000ED5DDD6EE4B8723EB9C86B0486817315AC47A47E1BC81EC063CFEC2EE2F9893DD893AB086A89ED56462DF591D49EF1224F14E422377981BC4FDE21A4FA4FEA16A522A9EA3D0862EFAC67DC627D2CFE7C2C9155C5FFF89F3FFCEDBFFD417CFDCDDFFDFB3FBC44E55D91A4F9F37DB18AD2FC2A8F56ECC7EB5FEFEEC3DBB84E5F58F8B09997691CD56991871FA23C7A662B96D7E15D912FD2E74DD97C70FDA7A39CCF51C945D4ACDC89BA678B6893D521546448AEAF8AF9BFB2B8FEB859CD59F9E3F5AD4589E3F8D4F1F847F5EB9A7D5AFC789D6CC55E5F2565F48DC3DEE6C94FACE0C0E5EB531DD59BEAC76BCBE2CFBF44D986D78230CB6681655B11FF63B9D662F775FD66A0EAEBA80C6F1F3E8491A8F6B6BA355BAD19577A53B2635D1665F42C34B8BEDAE469FDE3F501D5B66E2C10027F9EB74B1B275D0D0054470420405C6C72FEDBB06275B82E52216AB4F6C4B2D4EA5F320D0D881A46A283216FA5158B72FE8B234A5ED461F412A55934CFB8EC938170FCA07F885AED217AACCFC818DD56376171BA8AB243A561ADD26D0FA5D1198CB5FC3C2BE2AFBC572B56BEB05EC54E248ECEA88E44AA20F1CD094FFD499BB81E8AE2EB661D7E69BA7190B7222871B545CAE9CB36A0AF85E1177138E7896F8F7FFBFC3BB222A54FDB5FFCC9FFF39F0EB5866F05FC7BC67F3FB7626B612D3A9F2EF8EF0EDFC4214EBB1F40537A379C5E2C127EB020D38EBA2E90433BA221F34F53B48D27DAC113EDE289F6F044FB78A2033CD13334D1C4C2138D371B09DE6C2478B391E0CD4682341B291EA9523C52A578A44AF14895E2912AC523558A47AA148F54291EA9523C52A578A44AF14895E2912AC523558A47AA361EA9DA78A46A434915BA45D1910CE945AD2A43FA504B30844FB50443D8D4D3110CE1522DC11026F535048378544B3064FA81F7DA3A9221B34F4F321287DA781C6AE371A883C7A10E1E873A681CEA6071A883C5A10E16873A581CEA6071A883C5A10E16873A681CEAA071A883C7A10E1E873A781CEAE271A88BC7A12E1A87BA581CEA023954ABC6100ED5120CE1502DC1100ED5120CE1501DC1200ED5120C997E3AC30D44A15A829118D4C56350178F413D3C06F5F018D44363500F8B413D2C06F5B018D4C362500F8B413D2C06F5B018D4C362500F8B413D3C06F5F018D4C363501F8F417D3C06F5D118D4C762501F8B417D2C06F5B118D4C762501F8B417D2C06F5B118D4C762501F8F417D3C06F5F11834C063D0008F410334060DB01834C062D0008B41032C060DB01834C062D0008B41032C060DB01834C063D0008F41033C069DE131E80C8F4167680C3AC362D0191683CEB0187486C5A0332C069D6131E80C8B4167580C3AC362D0191E83CEF0187486C6A0C44263D046340E8336A25118B4918CC1A08D600C066D04633068231883411BC1180CDA08C66050211885411BC1180CDA08C660D046300E8336A27118B4118DC4A078D14B042F7A8980A397948734347849ABCA280C0A0D5CD2128CC2A0D0A0252DC1280C0A0D58D2128CC2A0D060252DC1480C8A17AA44F04295085EA812C10B5522E05025E5210D8D54D2AA320A8342A394B404A330283442494B300A8342A393B404A330283432494B301283E2C52511BCB82482179744F0E292085A5C12C18A4B22587149042B2E8960C52511ACB82482159744B0E292085A5C12418B4B22787149042F2E89E0C52511BCB82482179744D0E29208342E4979B640E392021DC1100ED5120CE1D0998E600887AA4F6F686012211A92412C4AA88E64108DEACC12188D6A4946A251BCD02482179A44F04293085E6812410B4D22D0D024F5A1078D4D529F88D0E0243DC91026D5930CA2522DC9202AD5918C44A5D00825ADF10C4B37A22519894AF16294C874314A8FDB74910059C7247B38F92277296A87D2466A0994278DA40649237D8BF88E4516B643090DA84D29752C87CE16018D1694CE594C63E6D1845994258E6DC5814DE7B1EDCC2DDBB32CFE7C62FB76EC10C773E6AEE5BA6EE42E3CC70F82583D99E1E0DAF77175A8F30F0E3CE9EC41F4C0B46B8BA61AA207E65D5B3471D5450FCCBB8E688D5A0FCCBBB668DF55963CB0FAB5246BB4C6C0E2D712ACD318038B5F5B32556F8C81C5AF2D59BD358616BFB664F50E1C5AFC5A9235A6CAD0E2D796ACD11AB049686BD41936076D8D3AC3A6A03ADBBD0C11E9D7D59BA5BED7E240077604DBEA597380921DF55C1240C91A31D640C99E7A8C2754B27A4C0E50B2AF1E130095ACEEC309943C9AADFCCC021D20D1AE64F5337FA0E499FA992354B2FA0E3150325166A42116ED8AD678F7818A76C644EF92CE2778AF11799D865F966C51879FCBA2E6C63CEC668C2B69E17015F2779FF35703CBE5AF069EABFC6A601F299C2E164A79C9171B9685197BE1FF4FCA622D6FC43F9EBDE8AAB4E1DB2816FD7E9B45E50ADA74ED32C32DE629B798735C4D775F644666368D0322F2BF538B060109945A72BEAD6ED45437D94459F852649B150BAB3A2AEB912B2D5669AEB4BE4BC1589E6042CD37BFFDC6CAFD85268C43EF2E8A91C3558A6F0F7D7887CB30F0113B3DF72DADE365582D0BDE81EB4DB504A03FBDE144DBAAC004F859913FEBC15375FDD79BAC62E1B734A9976014C89AD503B28E36D5C040ED82804E843A207519E5D52AAD2AC1B87C12E6C9FC55616E40B6203B78FBD1828F343C46E76C19BDA4C5A694A343AFA4E9DCA2D3A9429E3E2FEBEE25352F69741CAAD7B2BA9F17EC61754FB0FA6CC23B77A8B282CBE8B7A84CC24C54B76ADFE094E6CD3F9854435949999ECE05EE1692EBD933967AAF495228D4AB2699524DA2DE9D2C4AB268B5DE5737616BBE544679FC1AE685BC2BA5A5245AFA97BD286A8C7F9A1B996A4C1ED85EA594B0BD653B32374E1E978D15F7771D2BE3E37F68B00B8B74362577114D63FB411010FF5CD1DEDE171B36B97D65939B1E8DA2801BD8B66529BEAAEC7AA0998FF34D360F8B4D1DC69BB26C9A56BAD0DEB67674E43644DF686890E2ED414E26DEE0F8C40A4BD13C3D03A3F5B0E4CC67D2516DABEAF1E9414CBB705524AC9FF14E9F92319C3735C3290DED32FACAC2CF5112FE99F1AA3FB1BC2A4AF000EF2B3C3CCC0383633ACB060DF04E8F3DA4E2EF9DFA3DDE92766FC99EE8ADBF155C9A487BAB47AFB8A19F8C6A41655A4CCEA6635A6469CEDF8144E53679C24A6E5C17354BF6AB575A9D2E0E83CFB37CC02C727ED7E9749F2E164CF067CAED39C16EBF88CB44A3EF190B1F8AF86B15BE672C11FCD07CB8AD01F44E581DD9E1D39F43CB0DC56B5FBFAD6C4D74D7E2E9E2039D9FE94187C5BEF655337CAFF2A2BE5A0B732BEFAC0ED2023D1A3A4243FAD73D1ECA22AF6FC5BF1FF9686FFE42420A25604DF18314ED9B0C0916388E15595662799EB83AD276161EB74D2C2F9EF3C7F87F8E182A96E507B3B9F839E32F31E267426DB6FD379D899F342071F35C44C469A5354FB848F11CB39ACF6DD7F29BFB28FDDD0595BEE5349B8EC46A9E771381CA9FF7AD46BE70EF68CA79DB9FDB5A5856BCFB1945DB9F41BCFDE9DB872B2F23E21046039BDAB1E3B9961BF1F74BE607010DE29917F1927367CEE220A149CCBC85B5882C723E158053E338CCEF96FC9731FF5D5AD5691CDE6DCA17BED2D6BCF79A4EFCC2B86DF138B0E5FF69793C3BF57CFB4668E269A3520D54DB751A549961358E6A6BA0929973235B91C6111D1D4462DD6CC7A236ACABD3A9EE8D7ECB7A3AFD39BB09CCFAD3D740A5CECD4CC0EAF769A0D3A7DE8D15C8B6B8C621673A90D60D5F90F579C1D2C0F46FA815E843EA7091E84E7D1E225A4474E3123141F5FB93E83011BD71A981A65A54741338FA2C44746888DCD89E6F343F890E19911BCB3680D46122CEF28141E3EAD010A704835585E8D09075E3F88D85A43F5BA80E155937B66F00A943451C527F08511D26B26EA8EB9AADA154878A38EED65C3668611D3EB26E88AF8FA843471C517F0DA53A4CC41189C11C6D217E9123FEF77FDEB51DBF01C79B104B1E0A689B00DA1A8020EF27880D0F05049D8543AC7720A0099CA70E67A49EAF8E67D47F813A9ED1009DA9E319CDC08EA50E040479BD80EC742020C8571764A50301418EB620FB1C0808F2920559E74040908B2BC83607CF7A23441D9E31221AA2C13430475990510E4534221BA2C136E31EBB606B1C8A68C43754836F8811E1500DC221468C4335188718510ED5A01C62C43954837360FE9120031C8A38C0399D9326710012EE4E407627A43DC74BE74F494ECEE8C54F828F55A3BBAAC9CEC8CE9F949CF510F2577D38F6B44C177513FDDB9C63352A8D85146B090DEDAFAB6578FBF6499C45B3FC397AEE395E6E7C4E2C6272601A59F6F6FCCA728D4E87AA830E8B468746BD55F43DDCD63DACD66C287EA31310020BE794221E1A4C09D406409645DDB879F27E6C4473A86DD7C6036EC0DDD81F13C5765A4571CC3236EA22FFA6FA17AAF47A0768D069A13B5CF26553E661B15884C293BBAF26C2F758CC07FEDFF6C47DE78D9865C5B7AEE789A62899A7A27D015A1D1863F192C55FE1FE9DCAAE84E3F454642C2FD244243CA8CB229BCC15E054F0B013803ACDD92D9ADB7E73B2E374B7FB3BDC3FE4D83B62C28719AFBD26CBC0A8ED8882CAA047C7154C658E28A8CA942C8B9AD41D6D84D6A49F7219E8852A85897311A41693A98242D69F03E8C9A8506F4CC59E3BC55355CE10CEA05961C8ED75296B1850B6102939F34F4AF65F4444157FE427DE026F8BEF9371FD89DC61AA77FEDFDFCBCCDFAB67699BD4E36BDF9BA1E8CECBBB7E19C04FE10366006FEA0C66023D85579849C79BB98799F4F9047E6206F053388C99F4BBA9E79809B6B10B9901B8B12F9901B6B15399C9709FC2BBCC64BC9BBA99990C38537F3323EC091CCF8CF00D3DD00CB08D5DD18CB00D7DD28CB0A7704E33AA80A1979A19B691BB9A11F4147E6B661598C081CDA802669E6C66D0462E6D66D046BE6D3DD0177272334036F476334036747B334036F47FD347367384D3C735F488D30736748DD30736F491D307367596D34736F59AD34736759FD34736F5A3D3473675A8D34736F5AC33A11143173B0368535F3B036853A73B036853EF3B036853373C0368537F3C036853C73C0368530F3D036853573D0368539F3D13DBC4D079CF001AEAC5D78510675BC3AE70B2E725EE27F6949951F0CE0B8FDAC0BD44603944A4086399445CA3CC3E96E4102D523C44ABF7D57FE6D59F8B93CFE87BBADAAC446AABF5A60EAB65B4A8C7FC21CAF50AF082D2199667B82F6C99C6D9FEB03B2FC297F05B548A02D743D5ED16CBD2555AF7B47770E6A1A33852FB8FD39586EA66B5E6F5567552EA941A3E9656CFDADCF282730953F334DA566C5D54E92E2765B2BF90A6DA26D2E9F64CBDE454B32CB2049AE01C92D155BB12E0FB08743AFA95FF9DF3BC608EC649EA50F3C1C4450DF7FEF456A4212AEBCF3B8D06D682FF3AE6187640D6CE2FB7775AC2416BDCD3FB5B3CE1A2591E391F891457EFBEB378530F91917A0E4BD13298F245E318CA571980EF8BE7F0215AAD2179B2AE3A0586F9C524E1A21F08076ECBB63C43A78F05AF6B9327B0F181D24AC24860A3AE8BC43B4DB846A939064238EC046697BE51C99D766CADED429CE64BEDB101070BC8FCFCFD4B8777EC6B596DABD94E2FB928CAF0E1DD7D9F4EE74FCB149AD2B2B59527B1B815E1A1B91541D8DFFC917D0C0E69CCD00FD1F7F033EFB96A530E467874E6B982CC2BCFB5AEBE5FF996B51ABEFAC09F29D382DB3163DB5FFCADA639AEB4D8CE0BCDD979A1ED3EF7D9F6A73D3B145950CF8DA37811F545888CCEBEA649BE44F9D7F02E5A47715ABFCAE7DE83D226FC47AE6DC9DF197E8A2AD1B08D4D7DE83029C63C2A4DB6FAE3E351D2E321CB9F94127F3D5255A0F3121D1F8F8FD4D07C9DF7E6F87864A486E6E8EC43C5C76322253432D3D9EB8B8F47436A685467B7293E1E0829A1B93AFB4BAD21D9DCF4F21C6D9E0726C01F2719FE5411CB331A8E6A58C4BD513E946F8D463530DBBB51F6316B0D46C5560C0CC03CD56684A6D2E64B5CC27A43574F3FE9DFE0BA44D8EAC982B45DA3DFA7996826BE4ABF6BF2F72ABC3328E1EC6D81BBA866CF45F94AC2CF696EFB0337BE99BFA2482D114826D7704404E7B4326595D81E58BD86EC2FE2AA88BA08FFD1FB27590A64DB64EB64F74576360BB17736CCCEA39EB93B3779BAB35DE8C176F108A1892F82BD1C23DB854E6EBDF4CE52AA6559E8AF5054CBB6D039FA69E1A95A174329FD21788AF605A5FA961AD5B1303C7D7B86EAD81886CD79312B83EAD819F446D933AD333455AD1ACDE598EA981A24301C976A708EB6B1412F616ED0302FEA01A3838E981DCEE48926A0E60035363C542C819F7EBD0BEFA33A82EE611C9EEFDF8D08D437298F876A9EE3F5ACC390EC122C5B889B9A32D166DBAB2C074E18149D617A840F5CB87A2E5CB5377E8EF24460A9F4C8A18CA4578C8E3A89626F3CBFC4874BA0D0C6EDCFFB7BB99EB6775EEDCF3D42026D37B984C1FDB6407DBFAD65AB52CBB5822622D48F45D097036ADB0EC1ADA2F22B27B0A6EAEFFEF9CBD97EB284F7468A4968703665760B107FB7EBF9F4CBFD3BC87EF958199907C0C52FA4CBD2989B622C5C67E222D3A6BEC0EE1B2F29513298FC7A993125E38CF10FF2980D1C7A48B40414955D4A35B91F8CC240DD9D69B0EFFC219199E570391C60324ACBCA66E494FB21E3AB5F5F8FB4AA687A48DB69D17D43749B27DEF95E08A8F0F39F3F841FC409D3DB4D366FB7E878D99EF6F4CFF2635D82047A3BBF737C96E6E1A7F7EF7F10802C9CBF86F16BCCE77FF859DC995B9DA93E2A4F3692A66406D0F5AA559AB081CEFD58945CE4B67F4F4E0F874BCABA76F29B94D4156C776BC47BE5A3D809E39DBBF5A46A0C8E4A74F1AE6F47D51EEED646EB295735D9EBF2C8AA069DB56325656BDAEF701DDC7945F567EC8834D97C9D92A940F3B5E63CAF64A5480B48C6AA3DE5859830BFC77D0DA143545240A6D0C5BD305AF53B1D901FB7E3F1EF7783F1D3C30FBBF1D81EAD125DC7796652CFE3F138DD56DDB4BC8E867CC507CCD79361926F97A855CF1235544EC66397D8641A54EECC736790C886D41DF7EAD9AA3CE5EA4455770D8ECEE37B8F5EE17BF8B9E5BFBA69362EF63BE6AA2E9D1F52A0E3A54D21BE6942FEFD2187E87D93906CC039AD0DE0ABCB7F07160E0BEFE94A7FFA78BBF5131EDA166A8368B410C7C8D973A482A1B149F7B9F8C65FD5F830FFB5C86A911FEE038B84575103023C3D1D9421C9DF6C92F68C537642027FB6B05C3709DC99F216EBCFE9F37257D70FC2B38A359BD5A023A5E6C015D0972D887BB6520521309087E29BA61A14A8C611415D0B6A5B3ADBC6C7F4D9BF64D96695E6DB0CBCC08DD0FED2839BA033932B574F6367465BF4906E314CDB15D47009069A009F3F3F3D8883F65EDCF622B87D509619F812AF9FA3AD7466884FE7572F413C986793834A466AC771C6F1FCD0F1027C3D11DD739E9651C91260E04A7B2A9F151C9EC526A9E183D863716CCD9557928777E1E387A7F065B7F0DDFD7CFBF4047465B1C1367CB42A368B4CC86FACDA0664FBD25A54557A72777BEFD3922836EFE2DBE9F7876CCFD53E21F6FB5B59F468EFC3928BC6BB24FE3BA9F2780B54E351AAC694340B7AE53EBE45EC6BD7A7C3F95332052E7E31C76914A76C349D3E27E1918BECB31E6BC5FF7C0DE765F495E99C44801A6817D8B87F85AFB627C407B4BEB61A2922E9FBCBEF6426ED80EA668A2DB8FD348FC45CDBD6F9F196F42A08292853734AD69C4C4DAAAB2695A979F1997CCC9E7F5ACB5FDECB66F5501919455DDC0D60A0928F8A4A3DCA94BAF8A0ECF06928C2E77BEF1F396A309829424F9A8CC32F6E0CA4CFF9BE8B76EF2869159D586667CFB07CE068DC9D5C0735A3BDE79A26117AACB5BDD8DE2CD290DCDF401E3530F85D6611B13F31F3F86F67D67479E4CF62D7E1BBA8A07D48215F7317D586EC4176E54FBD8BDA958EB38B7A8671815DD4A7BA58AB85C91F4B0CBFD5AA0FF2E34D407C5C1337B0A8F8D3048B0827BD9E98F971AF5151D9E62474B36EEC42DE76221C55EBEC0A16307F842CD3E7651D8A8BAF3443F461411547C08C2D2E8957EDFC4B43BE342CC5E53722B3C3F68DA010DB359C4C123610EFA0FECEC1750BA3B4558529854BF43ABEE74CEC67251B9BE787FCD780110D3CE9BFB87DD11A9DCDC03CD54E1CF4879F36F59BA76551D6C22DE7A78FF7C77FBCBDFDD2AF7DAF34992FCE94AF77B27CCE12AD9B5DCB6E578DFA2536A5AF9AE25743E525EA928B3B610EAADB3ED7968DE5E162123DE9C5CFED4F2A7C9A6BE3D46945FEB82CCA76CA2D1CE5641B4FAF55CD56DC04899EF342440A814D82D382C396817A9869EB2AD48515D9D412D73711719A1A583663FC7FCD6F231D0B61FB5E238EB09ECB62B30E073273A9C7179F491F08889940FA4044CC04D21D54E92EAA740F55BA4290B8867485533480F4ED5C9DB365F49272CEBA7D0CAB66B1FD16A57C3162655A0C1CE3AE5AEF4DB073F81EBCACC89F95E15C3DB8C73B12E60DFF700E1EB9A4F5A89A1610550782DC2E790EE4E068B4E4AF2B87F3C06C72BF1261BBAB4B271E4CFA5EF252B496B0A860D261C2EB74C5C28A9B27D92BB738AB8197A94AA9C5DB722BDE3E10B9908D8446EE221256C7C8C1FF597D55EC852F25B743B7693973BECC8B045A508BA1A7A8D46668BCAED4B37A1E7713847DE039CDBD92623BC106DB06F5AE960BFE63531EBA6A3FD60E7934271D6B3BCCAC8812B1A1C8D622523AAF0F9580A0DEB65121CE520FB4B971F5356C8E17A77BA73E68D36C85DC7FB96BDA50E4FF9AD80966B4D9505C6FF6A8C7D7D95DC2D524ADEA329D6FD400C757EFBACCC25A5C50BBDDA7D88820FADD0E4FAB12BBBC7FC2937E93893935A5C69D0AECFC9265D088C802A4D9E4124DCD8B6CD26AB9DFEC529C23818EB3DFE955B9223BABB607F359C6DB893D9885FCE3CEB2F0F004EE8D8313D31EA53F0CAD63BDFBD50AC27136DECF30D436DE9D3D88D2F81143F9297DCEA30CBCF5DE2E33FC8AED192C97CDA6BB2FEE4D537C956E6667D5546FBBE181B415DD3DCCED0735DB668409956C4BB953BA1F80761BDBD58D92A46190D18D645821998E17DF7A6BAADBEA8BB3B0B1BE0DB8A142B22DB88B672338ADE4D8AEE2C0F3329DA6F41B91C5889DEBB43B4B398E2DF94EF0E8F39271E85C3E72B1A9A93868DB1EEFB5AA3BBAAF0F292B53747287D7B3C5EA7F01AF4D1760B71E0100</cpVarCodingDomain></activeConfiguration><activeState objectNumber=\"0004468961\" drawingAndGeometryStatus=\"001\" diagnosticVersion=\"App_0363\" installedSoftwareDelta=\"false\"><installedSoftware priority=\"prio1\" objectNumber=\"0004485961\" drawingAndGeometryStatus=\"001\"/><installedSoftware priority=\"prio2\" objectNumber=\"0004484861\" drawingAndGeometryStatus=\"001\"/></activeState></controlUnit></cuInformation><executionSettings userId=\"D8ALYACH\" date=\"2020-05-10T11:11:42.269Z\" causation=\"flash\" issueThreshold=\"err\" unresolvedConflictAction=\"notifyAdmin\" systemPriority=\"1\"/></p:storeProductCuInformationRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Iag_Motorenwerke_Mannheim_Reconditioned_Engine()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-8\"?><ns1:storeReconditionedEngineRequest category=\"MajorAssemblyAdapter\" version=\"22.1.1.1\" xmlns:ns1=\"http://majorassembly.vedoc.daimler.com/ai\"><requestHeader userId=\"VEDOC_tec_97\"/><engine id=\"473909C0353708\" dataCardAvailable=\"true\" delta=\"false\" objectNumber=\"X110802133   0080\" objectNumberVariant=\"X11080213380\"><activeAssignedFpd><equipmentCodes code=\"MW45\" codeType=\"sales\"/><equipmentCodes code=\"MLE4\" codeType=\"sales\"/><equipmentCodes code=\"MJC5\" codeType=\"sales\"/><equipmentCodes code=\"MB50\" codeType=\"sales\"/><equipmentCodes code=\"ME11\" codeType=\"sales\"/><equipmentCodes code=\"MR06\" codeType=\"sales\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700022\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700130\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700304\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700435\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700501\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700603\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700710\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700828\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700939\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701007\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701218\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701407\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701504\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701506\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701507\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701512\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701519\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701530\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701539\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701618\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701825\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701944\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702217\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702304\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702403\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702510\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702787\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702808\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702821\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703127\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703219\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703316\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703415\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703717\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704026\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704212\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704433\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704614\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705075\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705144\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705203\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705434\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705508\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705603\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705894\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706020\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706260\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706401\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706551\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706606\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707041\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707209\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707341\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707442\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707532\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707622\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707804\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708005\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708104\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708477\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708906\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709001\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709106\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709233\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709355\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709403\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709701\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709706\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709803\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709902\"/><saa amountPerSaa=\"1\" saaDesignation=\"53710104\"/><saa amountPerSaa=\"1\" saaDesignation=\"53711502\"/><saa amountPerSaa=\"1\" saaDesignation=\"53711801\"/><saa amountPerSaa=\"1\" saaDesignation=\"53712101\"/><saa amountPerSaa=\"1\" saaDesignation=\"53712221\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713568\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713588\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713589\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714101\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714105\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714106\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714108\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714114\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714129\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714144\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714147\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714150\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714154\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714169\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715724\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715815\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715986\"/><saa amountPerSaa=\"1\" saaDesignation=\"53716105\"/><saa amountPerSaa=\"1\" saaDesignation=\"53716810\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717105\"/><saa amountPerSaa=\"1\" saaDesignation=\"59902801\"/><saa amountPerSaa=\"1\" saaDesignation=\"59905701\"/><saa amountPerSaa=\"1\" saaDesignation=\"59911206\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1101005\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115505\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115618\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115701\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115902\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1120102\"/></activeAssignedFpd><activeProductDate shipmentDate=\"20220401\" technicalApprovalDate=\"20220331\"/><activeCustomer customerNumber=\"EO20007\" addressOld=\"MB Türkei ELC2,Mercedes Caddesi, No.2,34522,Esenyurt/Istanbul\"/><activeState plant=\"P0200\" productionNumber=\"89555464\" status=\"delivered\" luNumber=\"\"><label id=\"B\" name=\"Euro6 + CO2\" type=\"individual\"><content key=\"P0200_01\" value=\"DAIMLER TRUCK AG\"/><content key=\"P0200_02\" value=\"OM473LA.6-5\"/><content key=\"P0200_03\" value=\"473.909-C-0353708\"/><content key=\"P0200_04\" value=\"e1 DC0025/00E0100\"/><content key=\"P0200_05\" value=\"1M4H02\"/></label></activeState></engine><executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_97\"/></ns1:storeReconditionedEngineRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Iag_Motorenwerke_Mannheim()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"utf-8\"?><ns1:storeEngineRequest category=\"MajorAssemblyAdapter\" version=\"22.1.1.1\" xmlns:ns1=\"http://majorassembly.vedoc.daimler.com/ai\"><requestHeader userId=\"VEDOC_tec_BB\"/><engine id=\"471926C0729759\" dataCardAvailable=\"true\" delta=\"false\" objectNumber=\"X069741328\" objectNumberVariant=\"X110775848\"><activeAssignedFpd><equipmentCodes code=\"MC76\" codeType=\"sales\"/><equipmentCodes code=\"MZ20\" codeType=\"sales\"/><equipmentCodes code=\"MB17\" codeType=\"sales\"/><equipmentCodes code=\"MLE2\" codeType=\"sales\"/><equipmentCodes code=\"MJG4\" codeType=\"sales\"/><equipmentCodes code=\"MB50\" codeType=\"sales\"/><equipmentCodes code=\"ME22\" codeType=\"sales\"/><equipmentCodes code=\"MC75\" codeType=\"sales\"/><equipmentCodes code=\"MN51\" codeType=\"sales\"/><equipmentCodes code=\"NN20\" codeType=\"sales\"/><equipmentCodes code=\"MD94\" codeType=\"sales\"/><equipmentCodes code=\"MYD8\" codeType=\"sales\"/><equipmentCodes code=\"MYE0\" codeType=\"sales\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1103001\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1113001\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1114001\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115552\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115629\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115701\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1115910\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1120001\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1123502\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1126001\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1126004\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1199921\"/><saa amountPerSaa=\"1\" saaDesignation=\"J1199922\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700014\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700132\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700308\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700403\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700511\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700622\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700779\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700868\"/><saa amountPerSaa=\"1\" saaDesignation=\"53700933\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701007\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701222\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701405\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701504\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701506\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701507\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701519\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701530\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701544\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701618\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701826\"/><saa amountPerSaa=\"1\" saaDesignation=\"53701944\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702016\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702212\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702307\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702402\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702515\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702806\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702808\"/><saa amountPerSaa=\"1\" saaDesignation=\"53702821\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703127\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703217\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703318\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703415\"/><saa amountPerSaa=\"1\" saaDesignation=\"53703925\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704029\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704208\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704422\"/><saa amountPerSaa=\"1\" saaDesignation=\"53704605\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705026\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705141\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705219\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705432\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705508\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705634\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705707\"/><saa amountPerSaa=\"1\" saaDesignation=\"53705888\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706080\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706250\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706570\"/><saa amountPerSaa=\"1\" saaDesignation=\"53706643\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707048\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707049\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707213\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707329\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707447\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707530\"/><saa amountPerSaa=\"1\" saaDesignation=\"53707624\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708088\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708104\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708106\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708107\"/><saa amountPerSaa=\"1\" saaDesignation=\"53708109\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709222\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709402\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709701\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709706\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709802\"/><saa amountPerSaa=\"1\" saaDesignation=\"53709902\"/><saa amountPerSaa=\"1\" saaDesignation=\"53710104\"/><saa amountPerSaa=\"1\" saaDesignation=\"53711503\"/><saa amountPerSaa=\"1\" saaDesignation=\"53711802\"/><saa amountPerSaa=\"1\" saaDesignation=\"53712101\"/><saa amountPerSaa=\"1\" saaDesignation=\"53712234\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713567\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713568\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713571\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713587\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713588\"/><saa amountPerSaa=\"1\" saaDesignation=\"53713589\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714101\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714114\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714129\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714146\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714150\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714154\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714165\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714179\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714187\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714192\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714193\"/><saa amountPerSaa=\"1\" saaDesignation=\"53714194\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715616\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715814\"/><saa amountPerSaa=\"1\" saaDesignation=\"53715824\"/><saa amountPerSaa=\"1\" saaDesignation=\"53716104\"/><saa amountPerSaa=\"1\" saaDesignation=\"53716422\"/><saa amountPerSaa=\"1\" saaDesignation=\"53716610\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717105\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717307\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717314\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717462\"/><saa amountPerSaa=\"1\" saaDesignation=\"53717902\"/><saa amountPerSaa=\"1\" saaDesignation=\"53718165\"/><saa amountPerSaa=\"1\" saaDesignation=\"53718234\"/><saa amountPerSaa=\"1\" saaDesignation=\"53718304\"/></activeAssignedFpd><activeProductDate technicalApprovalDate=\"20220428\"/><activeCustomer customerNumber=\"39306099\" addressOld=\"Daimler Truck AG W60,Daimlerstraße 20,76744,Wörth\"/><activeState plant=\"P0200\" productionNumber=\"89588377\" status=\"inFinalAccept\" luNumber=\"X069741328\"><label id=\"B\" name=\"Euro6 + CO2\" type=\"individual\"><content key=\"P0200_01\" value=\"DAIMLER TRUCK AG\"/><content key=\"P0200_02\" value=\"OM471LA.6GE-06\"/><content key=\"P0200_03\" value=\"471.926-C-0729759\"/><content key=\"P0200_04\" value=\"e1 DE0143/01E0346\"/><content key=\"P0200_05\" value=\"1M4G4307\"/></label></activeState></engine><executionSettings causation=\"plant\" date=\"currentDateTime\" issueThreshold=\"err\" systemPriority=\"10\" unresolvedConflictAction=\"notifyAdmin\" userId=\"VEDOC_tec_BB\"/></ns1:storeEngineRequest>\r\n"
				+ "");
	}
	
	public void RawMqMessageFormat_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim()
	{
		RawMqMessageFormat.sendKeys("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?><ECUDATA><HEADER><ECUVERSION>17.12.00</ECUVERSION><TIMESTAMP>2022-04-28-22:00:41</TIMESTAMP><VIN></VIN><MIN>470913C0730110</MIN><AIN></AIN></HEADER><ECU><ECUNAME>MCM21T</ECUNAME><HW-PARTNUMBER>0024465035</HW-PARTNUMBER><HW-ZGS>001</HW-ZGS><SW-PARTNUMBER-LIST><SW-PARTNUMBER prio=\"1\">0644482835</SW-PARTNUMBER><SW-ZGS prio=\"1\">001</SW-ZGS></SW-PARTNUMBER-LIST><DS-PARTNUMBER-LIST><DS-PARTNUMBER prio=\"1\">0044583435</DS-PARTNUMBER><DS-ZGS prio=\"1\">001</DS-ZGS></DS-PARTNUMBER-LIST><DIAG-PARTNUMBER>0014444935</DIAG-PARTNUMBER><DIAG-ZGS>001</DIAG-ZGS><CBFREVISION>000</CBFREVISION><DIAGVERSION>19</DIAGVERSION><IDCODE>02A11111</IDCODE><ACTIVATIONFLAG>C</ACTIVATIONFLAG><CODINGSTATUS>X6</CODINGSTATUS><CERTIFICATIONNUMBER>OM470LA.6GE-01-00</CERTIFICATIONNUMBER><CAL-ID>4HC030E18666000B</CAL-ID><CVN>6B17568F</CVN><PLANT>0200</PLANT><UPGRADEFLAG>false</UPGRADEFLAG></ECU><VARCODEDOMAINS><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR001_PropValve</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR001_PropValve Default length 5</DEFAULTNAME><PARTNUMBER>A0174472535</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>PWM1 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM2 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM3 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM4 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM5 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR001_PropValve_1</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR001_PropValve_1 Default length 1</DEFAULTNAME><PARTNUMBER>A0174472735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>PWM6 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>PWM6 Configuration Not Parameterized</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244473135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR001_PropValve_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR001_PropValve_2 Default length 7</DEFAULTNAME><PARTNUMBER>A0174473335</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>PWM7 Configuration</FRAGNAME><FRAGVAL>7</FRAGVAL><FRAGMEANING>PWM7 Configuration Jake-Brake-2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174472835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>PWM8 Configuration</FRAGNAME><FRAGVAL>15</FRAGVAL><FRAGMEANING>PWM8 Configuration fuel cut off valve</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174472935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>PWM9 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM10 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM11 Configuration</FRAGNAME><FRAGVAL>23</FRAGVAL><FRAGMEANING>PWM11 Configuration test (switchable air compressor)</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174473035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>PWM12 Configuration</FRAGNAME><FRAGVAL>10</FRAGVAL><FRAGMEANING>PWM12 Configuration HC-Doser</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174473135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>PWM13 Configuration</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING>PWM13 Configuration Jake-Brake-1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174473235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR001_PropValve_3</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR001_PropValve_3 Default length 1</DEFAULTNAME><PARTNUMBER>A0174473435</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>PWM14 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>PWM14 Configuration Not Parameterized</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244473235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR001_PropValve_4</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR001_PropValve_4 Default length 4</DEFAULTNAME><PARTNUMBER>A0174473635</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>PWM15 Configuration</FRAGNAME><FRAGVAL>20</FRAGVAL><FRAGMEANING>PWM15 Configuration test (valve water heating urea tank)</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174473535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>PWM16 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM17 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PWM18 Configuration</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR002_SensorConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR002_SensorConfig Default length 23</DEFAULTNAME><PARTNUMBER>A0124471935</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>CAC Outlet Pressure</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Doser Pressure Inlet</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Doser Pressure Inlet Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Charge Air Temperature</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Charge Air Temperature Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Coolant Temperature In</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Coolant Temperature In Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Fuel Temperature</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Fuel Temperature Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Temperature</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Oil Temperature Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Pressure</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Oil Pressure Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Catalyst Inlet Temp</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Catalyst Outlet Temp</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Ambient Air Temperature</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Ambient Air Humidity</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Charge Air Temperature (Post)</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>EGR Temperature</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Rail Pressure</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Rail Pressure Installed</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Pressure Sensor Type</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Oil Pressure Sensor Type absolute Sensor</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124472035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Absolute Pressure after Charge Air Cooler</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fuel Filter Water Level</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is4_ews_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_wif_ews_awas_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR003_CANConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR003_CANConfig Default length 6</DEFAULTNAME><PARTNUMBER>A0124472835</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>MCM accepts CPC2 commands</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>MCM accepts CPC2 commands On</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124473135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>one wire capability CAN</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAN 3 active</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>CAN 3 active On</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124473035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>XCP CCP ROM Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Strict Vehicle Check Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR004_EngineConfig</VCDQUALIFIER><FRAGMENT><FRAGNAME>Engine Serial Number</FRAGNAME><FRAGVAL>470913C0730110</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR004_EngineConfig_1</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR004_EngineConfig_1 Default length 2</DEFAULTNAME><PARTNUMBER>A0174473735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Trans Limp Home Mode</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>Trans Limp Home Mode Manual</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0204477635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Starter Type Control</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>Starter Type Control Starter activated via MCM with modified diagnostic</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174476235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR004_EngineConfig_2</VCDQUALIFIER><FRAGMENT><FRAGNAME>Application Code</FRAGNAME><FRAGVAL></FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR004_EngineConfig_3</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR004_EngineConfig_3 Default Length 1</DEFAULTNAME><PARTNUMBER>A0174477035</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_pbs_enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR004_EngineConfig_4</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR004_EngineConfig_4 Default Length 1</DEFAULTNAME><PARTNUMBER>A0174477135</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_iol_l_oil_refill_type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR005_EOL</VCDQUALIFIER><FRAGMENT><FRAGNAME>Index 1 of speed characteristic point of EOL map</FRAGNAME><FRAGVAL>1100</FRAGVAL><FRAGMEANING /><FRAGUNIT>rpm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 2 of speed characteristic point of EOL map</FRAGNAME><FRAGVAL>1600</FRAGVAL><FRAGMEANING /><FRAGUNIT>rpm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 3 of speed characteristic point of EOL map</FRAGNAME><FRAGVAL>3000</FRAGVAL><FRAGMEANING /><FRAGUNIT>rpm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 4 of speed characteristic point of EOL map</FRAGNAME><FRAGVAL>3000</FRAGVAL><FRAGMEANING /><FRAGUNIT>rpm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 1 of correction factor of EOL map</FRAGNAME><FRAGVAL>1.000974</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 2 of correction factor of EOL map</FRAGNAME><FRAGVAL>0.999997</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 3 of correction factor of EOL map</FRAGNAME><FRAGVAL>0.999997</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Index 4 of correction factor of EOL map</FRAGNAME><FRAGVAL>0.999997</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR006_FanConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR006_FanConfig Default length 68</DEFAULTNAME><PARTNUMBER>A0104479735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Fan Type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Coolant Temp Stage 1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Air Temp Stage 1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Coolant Temp Stage 2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Air Temp Stage 2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Air Temp Stage 1 Eng Brake</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Air Temp Stage 2 Eng Brake</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_air_ofs_basic_fan1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_air_ofs_basic_fan2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmc_dpf_fan_mode</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Temp Offset Ambient Temperature</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Temp Offset Ambient Temperature (Brake Mode)</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Low Speed Ratio</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>%</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan High Speed Ratio</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>%</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>Fan Trq for Trq Loss Y1 0</FRAGMEANING><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER>A0244477535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Trq for Trq Loss Y8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Nm</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>Fan Speed for Trq Loss X1 0</FRAGMEANING><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER>A0294479335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Speed for Trq Loss X8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>1/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Dyn FAN Brake Temp Threshold</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Dyn FAN Brake On Time</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>s</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Dyn FAN Brake Hold Time</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>s</FRAGUNIT><PARTNUMBER /><PARTZGS />");
		RawMqMessageFormat.sendKeys("</FRAGMENT><FRAGMENT><FRAGNAME>Dyn FAN Brake Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Temp Threshold in Brake Mode Fan 1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Temp Threshold in Brake Mode Fan 2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Fan Coolant Temp In Stage 1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR007_DPFConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR007_DPFConfig Default length 64</DEFAULTNAME><PARTNUMBER>A0114470235</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>DPF Exhaust Pipe Volume (from Doser to DOC inlet)</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>m^3</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Time Interval Regen</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 1 Time Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 3 Time Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 4 Time Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Distance Interval Regen</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 1 Dist Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 3 Dist Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 4 Dist Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Fuel Interval Regen</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 1 Fuel Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 3 Fuel Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 4 Fuel Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Park Brake On Dosing Inhibit</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>charge_air_temp_after_compressor</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Initiate DPF Regen</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 2 Time Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 2 Dist Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 2 Fuel Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF HEST Max Speed Threshold</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km/h</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF HEST Lamp Min Time</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>s</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF HEST Lamp Temp Off</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF HEST Lamp Temp On</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF HEST Lamp Speed Hyst</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km/h</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 5 Time Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 5 Dist Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF zone 5 Fuel Trigger</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>EPA HIR Min Dist</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>EPA HIR Min Fuel</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>EPA HIR Min Time</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Min Vehicle Speed Hyst</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km/h</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Min Vehicle Speed</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>km/h</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF CAN Vehicle Speed Signal Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>PTO Dosing Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is2_ccv_dev_avl_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_epf_shutdown_derate_mode_bf</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_isp_p_low_fuel_active_b</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_isp_p_low_fuel_active_b Enabled</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0114470335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>DPF Manual Regen Only Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Diag Slow On Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>DPF Shutdown Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR008_ColdStartConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR008_ColdStartConfig Default length 2</DEFAULTNAME><PARTNUMBER>A0124475235</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Cold Start Type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR009_Engine_Service_Hour_Counter</VCDQUALIFIER><FRAGMENT><FRAGNAME>Engine Service Hours</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>h</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Engine Service Minutes</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Engine Service Seconds</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>s</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR010_OtherFactors</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR010_OtherFactors Default length 15</DEFAULTNAME><PARTNUMBER>A0124475335</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>port_closing_tdc_balancing</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>KW</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Start enrichment factor</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Start enrichment factor 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124475535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Torque Temperature Compensation Bit</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>EGR System Active Bit</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Turbo Type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Idle Smooth Cntl Reset</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Idle Smooth Cntl Reset Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0134474235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>TDC Correction</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°Crank</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>sp_air_mass_c0_select_uc</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>-</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmw_wp_type</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>e2p_tmw_wp_type 2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124475635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_par_dtna_process_tag</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>-</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>tmw_types_bf.tmw_types_u8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR011_E_TRIM_Cyl_1_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_1</FRAGNAME><FRAGVAL>0.02</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_2</FRAGNAME><FRAGVAL>0.015</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_3</FRAGNAME><FRAGVAL>0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_4</FRAGNAME><FRAGVAL>0.015</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_5</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_1_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR012_E_TRIM_Cyl_2_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_1</FRAGNAME><FRAGVAL>0.044</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_2</FRAGNAME><FRAGVAL>0.027</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_3</FRAGNAME><FRAGVAL>0.021</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_4</FRAGNAME><FRAGVAL>0.021</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_5</FRAGNAME><FRAGVAL>0.015</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR013_E_TRIM_Cyl_3_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_1</FRAGNAME><FRAGVAL>-0.004</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_2</FRAGNAME><FRAGVAL>0.009</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT>\r\n");
		RawMqMessageFormat.sendKeys("<FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_3</FRAGNAME><FRAGVAL>-0.021</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_4</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_5</FRAGNAME><FRAGVAL>0.009</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR014_E_TRIM_Cyl_4_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_1</FRAGNAME><FRAGVAL>0.02</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_2</FRAGNAME><FRAGVAL>0.009</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_3</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_4</FRAGNAME><FRAGVAL>0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_5</FRAGNAME><FRAGVAL>0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR015_E_TRIM_Cyl_5_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_1</FRAGNAME><FRAGVAL>0.004</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_2</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_3</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_4</FRAGNAME><FRAGVAL>0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_5</FRAGNAME><FRAGVAL>-0.015</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR016_E_TRIM_Cyl_6_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_1</FRAGNAME><FRAGVAL>0.004</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_2</FRAGNAME><FRAGVAL>-0.009</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_3</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_4</FRAGNAME><FRAGVAL>-0.003</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_5</FRAGNAME><FRAGVAL>-0.021</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR017_E_TRIM_Cyl_7_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR018_E_TRIM_Cyl_8_CurrentDurationTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_TrimPoint_10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR019_E_TRIM_NozzleBeginTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_1_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_NozzleBeginTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR020_E_TRIM_NozzleEndTrim</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_1_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_NozzleEndTrim</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>msec</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR024_SensorConfig_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR024_SensorConfig_2 Default length 26</DEFAULTNAME><PARTNUMBER>A0124475835</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Intake Manifold Pressure</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Intake Manifold Pressure Enabled</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124476635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Position of Intake Air Throttle</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Exhaust Pressure before DPF Inlet</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Outlet Temperature DOC</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Inlet Temperature DOC</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Outlet Temperature DPF</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Turbo Compressor Outlet Temperature</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Turbo Compressor Inlet Temperature</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Turbo Compressor Inlet Temperature Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124477135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Pressure after DPF Outlet</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_isp_t_turb_in_enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Doser Pressure Outlet</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Doser Pressure Outlet Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124476535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Differential Pressure EGR (Venturi)</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Differential Pressure after Charge Air Cooler</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAC Outlet Temperature</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>CAC Outlet Temperature Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124476135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>EGR Valve Position</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Coolant Temperature Out</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Coolant Temperature Out Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124476035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Level (Engine)</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Oil Level (Engine) Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174473935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Turbocharger Speed</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Turbocharger Speed Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124476235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>E2P_AM_ACC_ENABLE_B</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>E2P_AM_ACC_ENABLE_B Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR025_EBMConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR025_EBMConfig Default length 9</DEFAULTNAME><PARTNUMBER>A0124477235</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Turbobrake Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Hydraulic Konstant Drossel Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Jake Brake 1 Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Jake Brake 2 Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAN Actuator 1 Wastegate</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAN Actuator 3 EGR</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>CAN Actuator 3 EGR Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124477335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>CAN Actuator 5 VGT</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAN Actuator 2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>CAN Actuator 4</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>CAN Actuator 4 Active</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0284472635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR026_Analog_Value_List_1</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list1, number of analog values</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 1</FRAGNAME><FRAGVAL>43</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 2</FRAGNAME><FRAGVAL>44</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS />\r\n");
		RawMqMessageFormat.sendKeys("</FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list1, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR027_Analog_Value_List_2</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list2, number of analog values</FRAGNAME><FRAGVAL>14</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 1</FRAGNAME><FRAGVAL>4</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 2</FRAGNAME><FRAGVAL>5</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 3</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 4</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 5</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 6</FRAGNAME><FRAGVAL>9</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 7</FRAGNAME><FRAGVAL>10</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 8</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 9</FRAGNAME><FRAGVAL>7</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 10</FRAGNAME><FRAGVAL>8</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 11</FRAGNAME><FRAGVAL>11</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 12</FRAGNAME><FRAGVAL>12</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 13</FRAGNAME><FRAGVAL>27</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 14</FRAGNAME><FRAGVAL>28</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list2, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR028_Analog_Value_List_3</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list3, number of analog values</FRAGNAME><FRAGVAL>16</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 1</FRAGNAME><FRAGVAL>20</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 2</FRAGNAME><FRAGVAL>24</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 3</FRAGNAME><FRAGVAL>38</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 4</FRAGNAME><FRAGVAL>18</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 5</FRAGNAME><FRAGVAL>54</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 6</FRAGNAME><FRAGVAL>56</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 7</FRAGNAME><FRAGVAL>57</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 8</FRAGNAME><FRAGVAL>59</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 9</FRAGNAME><FRAGVAL>61</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 10</FRAGNAME><FRAGVAL>25</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 11</FRAGNAME><FRAGVAL>65</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 12</FRAGNAME><FRAGVAL>66</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 13</FRAGNAME><FRAGVAL>39</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 14</FRAGNAME><FRAGVAL>62</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 15</FRAGNAME><FRAGVAL>36</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 16</FRAGNAME><FRAGVAL>37</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list3, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR029_Analog_Value_List_4</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list4, number of analog values</FRAGNAME><FRAGVAL>12</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 1</FRAGNAME><FRAGVAL>29</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 2</FRAGNAME><FRAGVAL>30</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 3</FRAGNAME><FRAGVAL>31</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 4</FRAGNAME><FRAGVAL>32</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 5</FRAGNAME><FRAGVAL>33</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 6</FRAGNAME><FRAGVAL>34</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 7</FRAGNAME><FRAGVAL>35</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 8</FRAGNAME><FRAGVAL>68</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 9</FRAGNAME><FRAGVAL>69</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 10</FRAGNAME><FRAGVAL>70</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 11</FRAGNAME><FRAGVAL>22</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 12</FRAGNAME><FRAGVAL>23</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list4, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR030_Analog_Value_List_5</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list5, number of analog values</FRAGNAME><FRAGVAL>13</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 1</FRAGNAME><FRAGVAL>16</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 2</FRAGNAME><FRAGVAL>14</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 3</FRAGNAME><FRAGVAL>13</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 4</FRAGNAME><FRAGVAL>67</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 5</FRAGNAME><FRAGVAL>17</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 6</FRAGNAME><FRAGVAL>55</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 7</FRAGNAME><FRAGVAL>58</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 8</FRAGNAME><FRAGVAL>60</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 9</FRAGNAME><FRAGVAL>42</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 10</FRAGNAME><FRAGVAL>63</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 11</FRAGNAME><FRAGVAL>40</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 12</FRAGNAME><FRAGVAL>41</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 13</FRAGNAME><FRAGVAL>53</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list5, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR031_Analog_Value_List_6</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list6, number of analog values</FRAGNAME><FRAGVAL>5</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 1</FRAGNAME><FRAGVAL>21</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 2</FRAGNAME><FRAGVAL>19</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 3</FRAGNAME><FRAGVAL>15</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 4</FRAGNAME><FRAGVAL>64</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 5</FRAGNAME><FRAGVAL>26</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list6, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR032_Analog_Value_List_7</VCDQUALIFIER><FRAGMENT><FRAGNAME>analog value list7, number of analog values</FRAGNAME><FRAGVAL>8</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 1</FRAGNAME><FRAGVAL>45</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 2</FRAGNAME><FRAGVAL>46</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 3</FRAGNAME><FRAGVAL>47</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 4</FRAGNAME><FRAGVAL>48</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 5</FRAGNAME><FRAGVAL>49</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 6</FRAGNAME><FRAGVAL>50</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 7</FRAGNAME><FRAGVAL>51</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 8</FRAGNAME><FRAGVAL>52</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 17</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 18</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 19</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>analog value list7, analog value number 20</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR033_Binary_Value_List_1</VCDQUALIFIER><FRAGMENT><FRAGNAME>binary value list1, number of binaryvalues</FRAGNAME><FRAGVAL>4</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 1</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 2</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 3</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 4</FRAGNAME><FRAGVAL>13</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list1, binary value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR034_Binary_Value_List_2</VCDQUALIFIER><FRAGMENT><FRAGNAME>binary value list2, number of binaryvalues</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 1</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 2</FRAGNAME><FRAGVAL>4</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 3</FRAGNAME><FRAGVAL>7</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 5</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 6</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list2, binary value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR035_Binary_Value_List_3</VCDQUALIFIER><FRAGMENT><FRAGNAME>binary value list3, number of binaryvalues</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 1</FRAGNAME><FRAGVAL>5</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 2</FRAGNAME><FRAGVAL>8</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 3</FRAGNAME><FRAGVAL>10</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 4</FRAGNAME><FRAGVAL>11</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 5</FRAGNAME><FRAGVAL>12</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 6</FRAGNAME><FRAGVAL>9</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 7</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 9</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 10</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 11</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 12</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 13</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 14</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>binary value list3, binary value number 15</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR037_SWINDI_TABLE</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR037_SWINDI_TABLE Default length 30</DEFAULTNAME><PARTNUMBER>A0124477735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Swindi_Table_CAN_Config_1</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>Swindi_Table_CAN_Config_1 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124477835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Swindi_Table_CAN_Config_2</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>Swindi_Table_CAN_Config_2 2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124477935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Swindi_Table_CAN_Config_3</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>Swindi_Table_CAN_Config_3 2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124478035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Swindi_Table_CAN_Config_4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eeprom_fw_version_string_1</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eeprom_fw_version_string_2</FRAGNAME><FRAGVAL>20</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eeprom_fw_version_string_3</FRAGNAME><FRAGVAL>20</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eeprom_fw_version_string_4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>align</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR039_PTO_Config</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR039_PTO_Config Default length 6</DEFAULTNAME><PARTNUMBER>A0174474135</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_pto_kp_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_ki_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_kd_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR040_Oil_Level</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR040_Oil_Level Default length 57</DEFAULTNAME><PARTNUMBER>A0134474635</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL x0</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>%</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL x1</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>Oil Norm Eng On EOL x1 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164472635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL x2</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>Oil Norm Eng On EOL x2 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164472735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL x3</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>Oil Norm Eng On EOL x3 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164472835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL x4</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>Oil Norm Eng On EOL x4 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164472935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL y0</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>Oil Norm Eng On EOL y0 2</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164473035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL y1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>l</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL y2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>l</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL y3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>l</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng On EOL y4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>l</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL x0</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL x0 0</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0154472135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL x1</FRAGNAME><FRAGVAL>48</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL x1 48</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0154478435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL x2</FRAGNAME><FRAGVAL>57</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL x2 57</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0154479135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL x3</FRAGNAME><FRAGVAL>66</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL x3 66</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164470035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL x4</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL x4 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164470635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL y0</FRAGNAME><FRAGVAL>12</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL y0 12</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164470935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL y1</FRAGNAME><FRAGVAL>5</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL y1 5</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164471435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL y2</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL y2 3</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164471735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL y3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL y3 0</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0194470535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Oil Norm Eng Off EOL y4</FRAGNAME><FRAGVAL>-9</FRAGVAL><FRAGMEANING>Oil Norm Eng Off EOL y4 -9</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164472435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>MinMaxValue</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING>MinMaxValue 6</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0154477235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Prewarning Threshold</FRAGNAME><FRAGVAL>6</FRAGVAL><FRAGMEANING>Prewarning Threshold 6</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164473335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Warning Threshold</FRAGNAME><FRAGVAL>11</FRAGVAL><FRAGMEANING>Warning Threshold 11</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164473835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Warnbuzzer Threshold</FRAGNAME><FRAGVAL>11</FRAGVAL><FRAGMEANING>Warnbuzzer Threshold 11</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164474135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>UPP Warn Threshold</FRAGNAME><FRAGVAL>-10.5</FRAGVAL><FRAGMEANING>UPP Warn Threshold -10.5</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164473635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Refill Threshold</FRAGNAME><FRAGVAL>15.5</FRAGVAL><FRAGMEANING>Refill Threshold 15.5</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164473435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>Measurement Mode</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING>Measurement Mode 3</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0154477335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_isp_l_oil_max_level_1m</FRAGNAME><FRAGVAL>31</FRAGVAL><FRAGMEANING>e2p_isp_l_oil_max_level_1m 31</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164474735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR041_OBD</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR041_OBD Default length 11</DEFAULTNAME><PARTNUMBER>A0124478335</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>par_cal_id_parameter_set</FRAGNAME><FRAGVAL></FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>eu6_cal_id_par 1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>eu6_cal_id_par 1 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>eu6_cal_id_par 2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>eu6_cal_id_par 2 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>eu6_cal_id_par 3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>eu6_cal_id_par 3 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>eu6_cal_id_par 4</FRAGNAME><FRAGVAL>B</FRAGVAL><FRAGMEANING>eu6 cal id par 4 B</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0294477435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR042_AM_Config</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR042_AM_Config Default length 2</DEFAULTNAME><PARTNUMBER>A0124478435</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_am_vcp_frame_enable_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_am_egr_frame_enable_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR043_WFB</VCDQUALIFIER><FRAGMENT><FRAGNAME>e2p_woerth_factory_block</FRAGNAME><FRAGVAL>FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR044_EPF_Config</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR044_EPF_Config Default length 1</DEFAULTNAME><PARTNUMBER>A0124478535</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_epf_gen_speed_factor</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_epf_gen_speed_factor 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174475235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR045_Thermomanagement</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR045_Thermomanagement Default length 2</DEFAULTNAME><PARTNUMBER>A0124478735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_idle_zone_offset</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_idle_zone_offset 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_mixed_mode_type</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_mixed_mode_type 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0124478835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR046_EngineConfig</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR046_EngineConfig Default length 1</DEFAULTNAME><PARTNUMBER>A0124478935</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_sys_can_flywheel_sel</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR048_EngineConfig5</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR048_EngineConfig5 Default length 5</DEFAULTNAME><PARTNUMBER>A0124479135</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_scl_par_easy_starter_start</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR049_OtherFactors</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR049_OtherFactors Default length 4</DEFAULTNAME><PARTNUMBER>A0124479235</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_engine_with_pto</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ign_variant_evobus_enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_t_coolant_out_ign_off</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR050_OtherFactors</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR050_OtherFactors Default length 2</DEFAULTNAME><PARTNUMBER>A0134474535</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_tmw_acc_type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_vehicle_is_bus</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR051_PAR_CODE_ENGINE</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR051_PAR_CODE_ENGINE Default length 41</DEFAULTNAME><PARTNUMBER>A0134474435</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_pto_kp_s_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_wif_act_b</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_wif_act_b 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0134474335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is1_p_crankcase_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_type4_valid</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_rc4_egr_cool_fail_thr_fac</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_rc4_egr_cool_fail_thr_fac 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0184472235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_sys_engine_brake_variant</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p_sys_engine_brake_variant Premium</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0174474835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_ki_s_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_kd_s_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_dev_thr_l_s_type4</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Water Pump Speed Control Enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_sp_egr_vol_icooler_comp</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmc_thermo_roll_enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmc_thermo_roll_zone_offset</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>e2p_tmc_thermo_roll_zone_offset 2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0234474535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmw_wp_pto</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is1_p_wdm_fuel_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR052_PAR_CODE_VEHICLE</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR052_PAR_CODE_VEHICLE Default length 22</DEFAULTNAME><PARTNUMBER>A0134474135</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>fan_sys6_par_version</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fct_05_fan2_pwm_freq</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Hz</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_can_in_t_amb_air_diag_ena_b</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p can in t amb air diag ena b 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244476835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fct_17_fan1_pwm_freq</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>Hz</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_starter_ocp_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p starter ocp active b 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244477835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_air_ofs_fan1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_epf_starter_max_prewarn</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_fluid_ofs_fan1</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_wif_aux_act_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p wif aux act b 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244478035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_air_ofs_fan2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_t_fluid_ofs_fan2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>°C</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_bus_refuse_act_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_rc4_engine_coolant_amount</FRAGNAME><FRAGVAL>16</FRAGVAL><FRAGMEANING>e2p_rc4_engine_coolant_amount 16</FRAGMEANING><FRAGUNIT>kg</FRAGUNIT><PARTNUMBER>A0184475635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR053_Oil_Level_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR053_Oil_Level_2 Default length 27</DEFAULTNAME><PARTNUMBER>A0144472235</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>isp_l_oil_en_sump2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>isp_l_oil_en_sump2 Disable</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0224473135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_x 0</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_x 0 0</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0154473935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_x 1</FRAGNAME><FRAGVAL>48</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_x 1 48</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164476635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_x 2</FRAGNAME><FRAGVAL>57</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_x 2 57</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164477335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_x 3</FRAGNAME><FRAGVAL>71</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_x 3 71</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164478235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_x 4</FRAGNAME><FRAGVAL>100</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_x 4 100</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164478735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_y 0</FRAGNAME><FRAGVAL>12</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_y 0 12</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164478935</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_y 1</FRAGNAME><FRAGVAL>5</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_y 1 5</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164479435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_y 2</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_y 2 3</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0174470035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_y 3</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_y 3 0</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0154473435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_norm_eng_off2_ipo_eol_y 4</FRAGNAME><FRAGVAL>-7</FRAGVAL><FRAGMEANING>isp_l_oil_norm_eng_off2_ipo_eol_y 4 -7</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0174470835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_decl_up_trsh_1m</FRAGNAME><FRAGVAL>50</FRAGVAL><FRAGMEANING>isp_l_oil_decl_up_trsh_1m 50</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164475235</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_ok_high_trsh_1m</FRAGNAME><FRAGVAL>-3</FRAGVAL><FRAGMEANING>isp_l_oil_ok_high_trsh_1m -3</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164475335</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_ok_low_trsh_1m</FRAGNAME><FRAGVAL>3</FRAGVAL><FRAGMEANING>isp_l_oil_ok_low_trsh_1m 3</FRAGMEANING><FRAGUNIT>l</FRAGUNIT><PARTNUMBER>A0164475435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>isp_l_oil_decl_down_trsh_1m</FRAGNAME><FRAGVAL>-50</FRAGVAL><FRAGMEANING>isp_l_oil_decl_down_trsh_1m -50</FRAGMEANING><FRAGUNIT>%</FRAGUNIT><PARTNUMBER>A0164475135</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR054_EngineConfig2</VCDQUALIFIER><FRAGMENT><FRAGNAME>Application Code Part Number</FRAGNAME><FRAGVAL></FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR055_DPF_Config_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR055_DPF_Config_2 Default length 18</DEFAULTNAME><PARTNUMBER>A0134474935</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_30g_nox_enable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR056_PAR_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR056_PAR_2 Default length 12</DEFAULTNAME><PARTNUMBER>A0174473835</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_dbg_prescaler</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmw_mth_type</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_tmw_mth_radiator</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_pto_can_ratio_p_en</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_obd_indc_trq_grdt_rmp_ovrd</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>%/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_obd_indc_spd_grdt_rmp_ovrd</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>%/min</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is1_p_turb_in_bank1_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is1_p_turb_in_bank2_active_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p isi1 p turb in bank2 active 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0284472435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_bta_sel_trq_adapt_reset</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR057_E_TRIM_NozzleBeginTrim2</VCDQUALIFIER><FRAGMENT><FRAGNAME>Cyl_1_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_2_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_3_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_4_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_5_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_6_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_7_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>Cyl_8_NozzleBeginTrim2</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>ms</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR058_PCM</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR058_PCM Default length 12</DEFAULTNAME><PARTNUMBER>A0204470735</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_ecm2_gearbox_config</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p_ecm2_gearbox_config 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0204477835</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ecm2_gearbox_config_cpl</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p_ecm2_gearbox_config_cpl 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0204478035</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR059_PAR_CODE_ENGINE_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR059_PAR_CODE_ENGINE_2 Default length 40</DEFAULTNAME><PARTNUMBER>A0204470935</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_esa_fis_func_ena_bf</FRAGNAME><FRAGVAL>2</FRAGVAL><FRAGMEANING>e2p esa fis func ena bf 2</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244477635</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_lig_hc_acc_eng_spd_mode</FRAGNAME><FRAGVAL>1</FRAGVAL><FRAGMEANING>e2p lig hc acc eng spd mode 1</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0244476535</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ebm_brake_diag_var_ena</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[1]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[2]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[3]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[4]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[5]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[6]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[7]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[8]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[9]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[10]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[11]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccf_fbf_dyn_limit[12]</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fis_wdm_type_sel</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_opc_enable_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_obd_indc_stage_v_only</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>E2P_DTCTestModeEnable</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>E2P_DTCTestModeConfig</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fis_eng_fuel_type</FRAGNAME><FRAGVAL>4</FRAGVAL><FRAGMEANING>e2P_fis_eng_fuel_type_4</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0234476735</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ccs_ofs_tdc_cor_clas</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT>deg</FRAGUNIT><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eng_prod_step_req_bf</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_opc_ml_re_lrn_allwd</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_pwm_out_sel</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fan_pwm_ctrl_mode</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING>e2p fan pwm ctrl mode 0</FRAGMEANING><FRAGUNIT /><PARTNUMBER>A0294479435</PARTNUMBER><PARTZGS>001</PARTZGS></FRAGMENT><FRAGMENT><FRAGNAME>e2p_is2_eng_srvc_btn_var_bf</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR060_PAR_CODE_VEHICLE_2</VCDQUALIFIER><DEFAULT><DEFAULTNAME>VCD_PGR060_PAR_CODE_VEHICLE_2 Default length 40</DEFAULTNAME><PARTNUMBER>A0204471135</PARTNUMBER><PARTZGS>001</PARTZGS></DEFAULT><FRAGMENT><FRAGNAME>e2p_esa_fis_func_ena_bf_veh</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_ecf_eng_purge_ena</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_eaf_exg_heat_sys_on_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_qtpir_veh_sel_ampl_map</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_fuel_lvl_diag_sel_b</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_obd_dsr_gdc_sna_handling</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN><VARCODEDOMAIN><VCDQUALIFIER>VCD_PGR061_PROTO</VCDQUALIFIER><FRAGMENT><FRAGNAME>e2p_proto_par1_t_u32</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_proto_par1_t_u16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_proto_par2_t_u16</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_proto_par1_t_u8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT><FRAGMENT><FRAGNAME>e2p_proto_par2_t_u8</FRAGNAME><FRAGVAL>0</FRAGVAL><FRAGMEANING /><FRAGUNIT /><PARTNUMBER /><PARTZGS /></FRAGMENT></VARCODEDOMAIN></VARCODEDOMAINS></ECUDATA>\r\n");
	}
	
	public void RawMqMessageFormat_Programmierstation_Glc()
	{
		RawMqMessageFormat.sendKeys("<ECUDATA>\r\n"
				+ "  <HEADER>\r\n"
				+ "    <ECUVERSION />\r\n"
				+ "    \r\n"
				+ "<TIMESTAMP />\r\n"
				+ "    \r\n"
				+ "<VIN />\r\n"
				+ "    \r\n"
				+ "<MIN />\r\n"
				+ "    \r\n"
				+ "<AIN>93072020031083</AIN>\r\n"
				+ "    \r\n"
				+ "\r\n"
				+ "  </HEADER>\r\n"
				+ "  \r\n"
				+ "<ECU>\r\n"
				+ "    <ECUNAME>ACM02T</ECUNAME>\r\n"
				+ "    \r\n"
				+ "<HW-PARTNUMBER>0014462554</HW-PARTNUMBER>\r\n"
				+ "    \r\n"
				+ "<HW-ZGS>001</HW-ZGS>\r\n"
				+ "    \r\n"
				+ "<SW-PARTNUMBER-LIST>\r\n"
				+ "      <SW-PARTNUMBER prio=\"2\">0104487054</SW-PARTNUMBER>\r\n"
				+ "      \r\n"
				+ "<SW-PARTNUMBER prio=\"1\">0084484754</SW-PARTNUMBER>\r\n"
				+ "      \r\n"
				+ "<SW-ZGS prio=\"2\">001</SW-ZGS>\r\n"
				+ "      \r\n"
				+ "<SW-ZGS prio=\"1\">001</SW-ZGS>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </SW-PARTNUMBER-LIST>\r\n"
				+ "    \r\n"
				+ "<DS-PARTNUMBER-LIST>\r\n"
				+ "      <DS-PARTNUMBER prio=\"2\">0114489954</DS-PARTNUMBER>\r\n"
				+ "      \r\n"
				+ "<DS-PARTNUMBER prio=\"1\">0214485554</DS-PARTNUMBER>\r\n"
				+ "      \r\n"
				+ "<DS-ZGS prio=\"2\">001</DS-ZGS>\r\n"
				+ "      \r\n"
				+ "<DS-ZGS prio=\"1\">001</DS-ZGS>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </DS-PARTNUMBER-LIST>\r\n"
				+ "    \r\n"
				+ "<DIAG-PARTNUMBER>0004446154</DIAG-PARTNUMBER>\r\n"
				+ "    \r\n"
				+ "<DIAG-ZGS>003</DIAG-ZGS>\r\n"
				+ "    \r\n"
				+ "<DIAGVERSION>acm_0x084B</DIAGVERSION>\r\n"
				+ "    \r\n"
				+ "<CBFREVISION>2.81.364</CBFREVISION>\r\n"
				+ "    \r\n"
				+ "<IDCODE>01A11111</IDCODE>\r\n"
				+ "    \r\n"
				+ "<ACTIVATIONFLAG />\r\n"
				+ "    \r\n"
				+ "<CODINGSTATUS>X6</CODINGSTATUS>\r\n"
				+ "    \r\n"
				+ "<CERTIFICATIONNUMBER />\r\n"
				+ "    \r\n"
				+ "<CAL-ID>2EE00JB616660000</CAL-ID>\r\n"
				+ "    \r\n"
				+ "<CVN>9B9C23D8</CVN>\r\n"
				+ "    \r\n"
				+ "<PLANT>0060</PLANT>\r\n"
				+ "    \r\n"
				+ "\r\n"
				+ "  </ECU>\r\n"
				+ "  \r\n"
				+ "<VARCODEDOMAINS>\r\n"
				+ "    <VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR003_OBD_4</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_eu6_cal_id_par[1]</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_eu6_cal_id_par[1] 0</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014479654</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_eu6_cal_id_par[2]</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_eu6_cal_id_par[2] 0</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014479754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_eu6_cal_id_par[0]</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_eu6_cal_id_par[0] 0</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014479554</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_eu6_cal_id_par[3]</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_eu6_cal_id_par[3] 0</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014479854</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR003_OBD_4 Default Settings length 9</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014477654</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR003_OBD_1</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR003_OBD_1 Default Settings</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004474954</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR008_SCR_Sys</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR008_SCR_Sys Default Settings</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014470754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>isp_scr_t_est_en_b</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>isp_scr_t_est_en_b True</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014471054</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR005_DPF_0E</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR005_DPF_0E Length 1</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0024470354</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR011_Urea</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR011_Urea Default Settings length 52</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0024475154</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_trc_l_urea_tank_lim_5_refill</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0.25</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_trc_l_urea_tank_lim_5_refill 0.25</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014471654</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>e2p_trc_l_urea_tank_lim_5</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0.1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>e2p_trc_l_urea_tank_lim_5 0.1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT>%</FRAGUNIT>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014471754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR006_Urea_Tank_Level_1</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR006_Urea_Tank_Level_1 Default Settings length 34</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014477854</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR001_CAN_Config</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>Powertrain_CAN_Baudrate</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>3</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>Powertrain_CAN_Baudrate 667 KBaud</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004476454</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>Engineering_CAN_Baudrate</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>Engineering_CAN_Baudrate 250 KBaud</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004476554</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>edu_present</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>edu_present 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014478654</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR001_CAN_Config Default Settings length 7</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014478554</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR006_Urea_Tank_Level_2</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR006_Urea_Tank_Level_2 Default Settings length 17</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014477954</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>E2P_ISP_SEL_L_UREA_TANK</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>3</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>E2P_ISP_SEL_L_UREA_TANK 3</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004476754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR012_Urea</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR012_Urea Default Settings length 44</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014471854</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR003_OBD_2</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR003_OBD_2 Default Settings</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004475054</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR003_OBD_3</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR003_OBD_3 Default Settings</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004475154</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR005_DPF</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR005_DPF Default Settings length 14</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0014477754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>DPF Zone turn on regen switch</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>2</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>DPF Zone turn on regen switch 2</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004472754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>DPF Trigger Option</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>DPF Trigger Option 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004475554</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>Extended Idle Auto RPM Elevate</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>Extended Idle Auto RPM Elevate 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004473154</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>DPF Exhaust Pipe Volume (From Doser to DOC inlet)</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>0.0100155</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>DPF Exhaust Pipe Volume (From Doser to DOC inlet) 0.0100155</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT>m^3</FRAGUNIT>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004479954</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR010_Function</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR010_Function Default Settings length 16</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0024472054</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "<VARCODEDOMAIN>\r\n"
				+ "      <VCDQUALIFIER>VCD_PGR002_Output_Config1</VCDQUALIFIER>\r\n"
				+ "      \r\n"
				+ "<DEFAULT>\r\n"
				+ "        <DEFAULTNAME>VCD_PGR002_Output_Config1 Default Settings</DEFAULTNAME>\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004471754</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </DEFAULT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>SCR Line Heater 4 Enable</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>SCR Line Heater 4 Enable 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004472554</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>SCR Line Heater 3 Enable</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>SCR Line Heater 3 Enable 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004473354</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "<FRAGMENT>\r\n"
				+ "        <FRAGNAME>SCR Line Heater 5 Enable</FRAGNAME>\r\n"
				+ "        \r\n"
				+ "<FRAGVAL>1</FRAGVAL>\r\n"
				+ "        \r\n"
				+ "<FRAGMEANING>SCR Line Heater 5 Enable 1</FRAGMEANING>\r\n"
				+ "        \r\n"
				+ "<FRAGUNIT />\r\n"
				+ "        \r\n"
				+ "<PARTNUMBER>A0004473454</PARTNUMBER>\r\n"
				+ "        \r\n"
				+ "<PARTZGS>001</PARTZGS>\r\n"
				+ "        \r\n"
				+ "\r\n"
				+ "      </FRAGMENT>\r\n"
				+ "      \r\n"
				+ "\r\n"
				+ "    </VARCODEDOMAIN>\r\n"
				+ "    \r\n"
				+ "\r\n"
				+ "  </VARCODEDOMAINS>\r\n"
				+ "  \r\n"
				+ "\r\n"
				+ "</ECUDATA>\r\n"
				+ "");
	}
	
	public void writeButton()
	{
		writeButton.click();
	}
	
	public void okButton()
	{
		okButton.click();
	}
	
	public String alertMessage(){
		String alert=	alertMessage.getText();
		return alert;
	}
	

	public Boolean validateVehicleDataPage() {
		warmup();
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.elementToBeClickable(searchInput));
		return searchInput.isDisplayed();
	}
	
	public void searchFin_Afab() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1V44781113834879");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Ispd() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1K2231686L001206");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Vega() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1K1183871N219296");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Gtc() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("WDD2130421A000525");
		searchButton.click();
		warmup1();
	}

	public void searchFin_MiniBusSap() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1V9076571P433522");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("WEB62833113291864");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Werk800_Van_Charleston() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1Y9076431T097322");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Werk800_Van_Podi() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1V4206331U313862");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Zbl_Nfz_Neu() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("9BM938142LS057394");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Zbl_Pkw_Neu() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("WDCYC3KF7HX276380");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Werksschnittstelle_Steuergeräte_Neue_Generation_Worth() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("RS396440250577421");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Finas_Vedoc_RD() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1K2971231A000093");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Vanis() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("W1V9101432N172823");
		searchButton.click();
		warmup1();
	}
	
	public void searchFin_Ascc_Xdcv() throws InterruptedException {
		warmup1();
		warmup1();
		wait.until(ExpectedConditions.visibilityOf(codesTab));
		searchInput.sendKeys("WDB96423110194149");
		searchButton.click();
		warmup1();
	}
	
	// change
	
	public void historyTab()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", historyTab);
		warmup5();
	}
	
	public void technicalEntriesButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(technicalEntriesButton));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", technicalEntriesButton);
		warmup5();
	}
	
	public List<WebElement> historyTable(){
		if(historyTable != null && ! historyTable.isEmpty())
			return historyTable;
		else
			return new ArrayList<>();
	}
	
	public void searchText_Ispd()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.ISPD.VEDOC.01");
		//warmup5();
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));

	//	warmup4();
	}
	
	public void searchText_Vega()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.EVENT.VEGACV.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Gtc()
	{
		searchText.sendKeys("XZ0.VEDOC.U.GTC.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
		}
	
	public void searchText_Pla()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.PLA.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Pkw_MBFS_Tuscaloosa()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MBFSTUS.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Pkw_Mbfs_Peking()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MBFSPKG.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Pkw_Farasis()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.FARASIS.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Nfz_MiniBusSap()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.SAPMB.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Sap()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.EVOBUS.MCM.IN");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Werk800_Van_Charleston()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.CHS.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Werk800_Van_Podi()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.PODI.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Zbl_Nfz_Neu()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MAIN.IN");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Zbl_Pkw_Neu()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MAIN.IN");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Iag_Achswerke_Kassel()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.KASAXL.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Werksschnittstelle_Steuergeräte_Neue_Generation_EvoBus_Worth()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.EVOBUS.MCM.IN");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Finas_Vedoc_RD()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.FINAS.VEDOC.02");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Vanis()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.VANIS.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void mqPage_Ascc_Xdcv()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.CLUSTER.IN");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Iag_Motorenwerke_Mannheim_Reconditioned_Engine()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MANENG.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Iag_Motorenwerke_Mannheim()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.BFDAPLD.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Vollständigkeitsprüfung_Mannheim_Iag()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MANCC.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Iag_Motorenwerke_Versorgung_Mcm_Steuergeräte_Mannheim()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.MCMMAN.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	public void searchText_Programmierstation_Glc()
	{
		warmup5();
		searchText.sendKeys("XZ0.VEDOC.U.GLCMCM.VEDOC.01");
		searchIcon.click();
		wait.until(ExpectedConditions.visibilityOf(historyTableRow1));
	}
	
	   public void select_HighVoltageBatteryId() 
	    {
	    Select drpCountry = new Select(majorAssembly_SearchDropDown);
	     drpCountry.selectByValue("string:highVoltageBatteryID");       
	    }
	
	   public void select_HighVoltageBatteryReess() 
	    {
	    Select reess = new Select(majorAssembly_SearchDropDown);
	    reess.selectByValue("string:highVoltageBatteryREESS");       
	    }
	   
	   public void search_HighVoltageBatteryId_Pla() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("72501704820590");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	

	   public void search_HighVoltageBatteryId_Pkw_MBFS_Tuscaloosa() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("789080CA000530");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_HighVoltageBatteryId_Pkw_Mbfs_Peking() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("079PE313010111C4V0000021");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_HighVoltageBatteryId_Pkw_Farasis() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("789062PA011095");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_Iag_Achswerke_Kassel() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("741421K1471836");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_Iag_Motorenwerke_Mannheim_Reconditioned_Engine() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("473909C0353708");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_Iag_Motorenwerke_Mannheim() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("471926C0729759");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public void search_Vollständigkeitsprüfung_Mannheim_Iag() throws InterruptedException {
		   majorAssembly_SearchInput.sendKeys("470911C0726393");
		   majorAssembly_SearchButton.click();
	        Thread.sleep(5000);
	    }
	   
	   public String majorAssembly_HighVoltageBatteryNumber(){
			String batteryNumber=	majorAssembly_HighVoltageBatteryNumber.getText();
			return batteryNumber;
		}
	
	   public String vehicleData_Fin(){
				String fin=	vehicleData_Fin.getText();
				return fin;
	   }
	   
	   public String majorAssembly_ReessCode(){
			String fin=	majorAssembly_ReessCode.getText();
			return fin;
  }
	   
	   public void traceableParts_History()
		{
		   warmup1();
		   warmup1();
		   traceableParts_History.click();
		}
	   
	   public void traceableParts_IdCode()
		{
		   wait.until(ExpectedConditions.visibilityOf(traceableParts_Search));
		   traceableParts_IdCode.sendKeys("02A11111");
		   traceableParts_Search.click();
		   warmup1();
		}
	   
	
		
	  
}
