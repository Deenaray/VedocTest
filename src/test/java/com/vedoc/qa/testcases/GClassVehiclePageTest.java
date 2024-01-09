package com.vedoc.qa.testcases;

import java.io.IOException;

import org.openqa.selenium.NoSuchElementException;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.vedoc.qa.base.TestBase;
import com.vedoc.qa.pages.GClassVehiclePage;
import com.vedoc.qa.pages.HomePage;
import com.vedoc.qa.pages.LoginPage;
import com.vedoc.qa.pages.VehicleDataPage_S;

public class GClassVehiclePageTest extends TestBase {
	
	HomePage homePage;
	LoginPage loginPage;
	GClassVehiclePage vehicledatapage;
	GClassVehiclePage GclassVehicle;
	ITestResult result;
	public static String cook4;
	
	public GClassVehiclePageTest() {
		super();
	}
	
	 

	@BeforeTest
	public void setUp() throws IOException {

		initialization();
		loginPage = new LoginPage();
		vehicledatapage = new GClassVehiclePage();
		homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		vehicledatapage = homePage.VehicleData_GClass();
		
		SystemMessageCheck();
		

	}

	@Test(priority = 1)
	public void GclassVehiclePageTest() throws InterruptedException {
		
		
		
		GclassVehicle=new GClassVehiclePage();
		
		GclassVehicle.validateGClassVehicleDataPage();
		
		GclassVehicle.searchfin();
        logger = extent.createTest("U-008: Check for the 'Search' text field functionality");
        logger.createNode("Fin Number entered and clicked on the Search button is: " + GclassVehicle.fin());
		logger.log(Status.INFO, "TestCaseID: TC-003");
		
		logger = extent.createTest("U-003: Identification Tab of Vehicle Data Module");
		logger.log(Status.INFO, "TestCaseID: TC-065");
		logger.log(Status.INFO, "Fin Number entered and clicked on the Search button is: " + GclassVehicle.GlobalFin());

		
		
		GclassVehicle.fin();
		logger.createNode("Fin Number displayed on the ThinClient is:  " + GclassVehicle.fin());
		
		GclassVehicle.OrderNumber();
		logger.createNode("Order Number displayed on the ThinClient is:  " + GclassVehicle.OrderNumber());

		GclassVehicle.brand();
		logger.createNode("Brand Name displayed on the ThinClient is:  " + GclassVehicle.brand());
		
		GclassVehicle.ProductionNumber();
		logger.createNode("Production Number displayed on the ThinClient is:  " + GclassVehicle.ProductionNumber());

		GclassVehicle.category();
		logger.createNode("Category displayed on the ThinClient is:  " + GclassVehicle.category());
		
		GclassVehicle.ProductionPlant();
		logger.createNode("Production Plant displayed on the ThinClient is:  " + GclassVehicle.ProductionPlant());

		GclassVehicle.VehicleModel();
		logger.createNode("Vehicle Model displayed on the ThinClient is:  " + GclassVehicle.VehicleModel());

		GclassVehicle.Status();
		logger.createNode("Status displayed on the ThinClient is:  " + GclassVehicle.Status());

		GclassVehicle.VehicleCodes();
		logger.createNode("Codes displayed on the ThinClient are:  " +  GclassVehicle.VehicleCodes());
		

}
	
	@Test(priority = 2)
	public void MajorAssemblyTabTest() throws InterruptedException{
		
		GclassVehicle.MajorAssembliesTab();
		logger = extent.createTest("U-234: Major Assembly Data Tab of Vehicle Data Module");
		logger.log(Status.INFO, "Fin Number entered and clicked on the Search button is: " + GclassVehicle.GlobalFin());

		logger.createNode("Major Assemblies Tab is clicked ");

		
		GclassVehicle.EngineNumber();
		logger.createNode("Engine Number displayed on the ThinClient is:  " +  GclassVehicle.EngineNumber());
 
		String EngineVariantNumber= GclassVehicle.EngineVariantNumber();
	
			
  
		if(EngineVariantNumber.isEmpty()){
			
			logger.createNode("Engine Variant number is not displayed on Thin client for the G-Class vehicle");
		}
		else{
			
			logger.createNode("Engine Variant number value displayed on the Thin client is: " + EngineVariantNumber );	

		}
		
	    String EngineObjectNumber=	GclassVehicle.ObjectNumber();
	    
	    if(EngineObjectNumber.isEmpty()){
			logger.createNode("Engine Object number is not displayed on Thin client for the G-Class vehicle");
	    }else{
			logger.createNode("Engine Object number  displayed on Thin client for the G-Class vehicle is: " + EngineObjectNumber);

	    }
	    
	    String  Transmission= GclassVehicle.Transmission();
	    
	    if(Transmission.isEmpty()){
			logger.createNode("Transmission number is not displayed on Thin client for the G-Class vehicle");
	    }else{
			logger.createNode("Transmission number displayed on Thin client for the G-Class vehicle is: " + Transmission);
	    }
	    
	   String TransmissionVariant= GclassVehicle.TransmissionVariant();
	   
	   if(TransmissionVariant.isEmpty()){
			logger.createNode("Transmission Variant number is not displayed on Thin client for the G-Class vehicle");
	   }else{
			logger.createNode("Transmission Variant number displayed on Thin client for the G-Class vehicle is: " + TransmissionVariant); 
	   }
	   
	  String TransmissionObjectNumber= GclassVehicle.TransmissionObjectNumber();
	  
	  if(TransmissionObjectNumber.isEmpty()){
			logger.createNode("Transmission Object number is not displayed on Thin client for the G-Class vehicle");
	  }else{
			logger.createNode("Transmission Object number displayed on Thin client for the G-Class vehicle is: " + TransmissionObjectNumber); 
  
	  }
		
		String TransferCaseNumber=GclassVehicle.TransferCaseNumber();
		
		if(TransferCaseNumber.isEmpty()){
			
			logger.createNode("Transfer case number is not displayed on Thin client for the G-Class vehicle");
		}else{
			
			logger.createNode("Transfer case number value displayed on the Thin client is: " + TransferCaseNumber );	

		}
		
		String TransferCase_Variant=GclassVehicle.TransferCase_Variant();
		
		if(TransferCase_Variant.isEmpty()){
			logger.createNode("Transfer case Variant number is not displayed on Thin client for the G-Class vehicle");
		}else{
			logger.createNode("Transfer case Variant number value displayed on the Thin client is: " + TransferCase_Variant );	

		}
		
		String TransferCase_ObjectNumber=GclassVehicle.TransferCase_ObjectNumber();
		
		if(TransferCase_ObjectNumber.isEmpty()){
			logger.createNode("Transfer case Object number is not displayed on Thin client for the G-Class vehicle");
		}else{
			logger.createNode("Transfer case Object number value displayed on the Thin client is: " + TransferCase_ObjectNumber );	

		}

		
		String FrontAxle1=GclassVehicle.FrontAxle1();
		
		if(FrontAxle1.isEmpty()){
			
			logger.createNode("Front Axle1 is not displayed on Thin client for the G-Class vehicle");
		}
		else{
			
			logger.createNode("Front Axle1 displayed on Thin client for the G-Class vehicle is: " + FrontAxle1 );	

		}
		
		String FrontAxle1Variant=GclassVehicle.FrontAxle1Variant();
		
		if(FrontAxle1Variant.isEmpty()){
			
			logger.createNode("Front Axle1 Variant is not displayed on Thin client for the G-Class vehicle");
		}
		else{
			
			logger.createNode("Front Axle1 Variant displayed on the ThinClient is:  " +  GclassVehicle.FrontAxle1Variant());

		}
		
		String FrontAxle1ObjectNumber=GclassVehicle.FrontAxle1ObjectNumber();
		
		if(FrontAxle1ObjectNumber.isEmpty()){
			
			logger.createNode("Front Axle1 Object Number is not displayed on Thin client for the GClass vehicle");
			
		}
		else{
			
			logger.createNode("Front Axle1 ObjectNumber displayed on the ThinClient is:  " +  FrontAxle1ObjectNumber);

		}
		
		String RearAxle1=GclassVehicle.RearAxle1();
		
		if(RearAxle1.isEmpty()){
			
			logger.createNode("Rear Axle1 Object Number is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("Rear Axle1 ObjectNumber displayed on the ThinClient are:  " +  RearAxle1);

		}
		
		String RearAxle1Variant=GclassVehicle.RearAxle1Variant();
		
		if(RearAxle1Variant.isEmpty()){
			
			logger.createNode("Rear Axle1 Variant Number is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("Rear Axle1 Variant displayed on the ThinClient is:  " +  RearAxle1Variant);

		}
		
		String RearAxle1ObjectNumber=GclassVehicle.RearAxle1ObjectNumber();
		
		if(RearAxle1ObjectNumber.isEmpty()){
			
			logger.createNode("Rear Axle1 Object Number is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("Rear Axle1 Object Number displayed on the ThinClient is:  " +  RearAxle1ObjectNumber);

		}
		
		String RearAxle2=GclassVehicle.RearAxle2();
		if(RearAxle2.isEmpty()){
			logger.createNode("Rear Axle2 Number is not displayed on Thin client for the G-Class vehicle");	
		}else{
			logger.createNode("Rear Axle2 Number displayed on Thin client for the G-Class vehicle is: " + RearAxle2 );	
		}
		
		String RearAxle2Variant=GclassVehicle.RearAxle2Variant();
		if(RearAxle2Variant.isEmpty()){
			logger.createNode("Rear Axle2 Variant Number is not displayed on Thin client for the G-Class vehicle");		
		}else{
			logger.createNode("Rear Axle2 Variant Number displayed on Thin client for the G-Class vehicle" + RearAxle2Variant);		
		}
		
		String RearAxle2ObjectNumber=GclassVehicle.RearAxle2ObjectNumber();
		if(RearAxle2ObjectNumber.isEmpty()){
			logger.createNode("Rear Axle2 Object Number is not displayed on Thin client for the G-Class vehicle");	
		}else{
			logger.createNode("Rear Axle2 Object Number displayed on Thin client for the G-Class vehicle is: " + RearAxle2ObjectNumber);	
		}
		
		
		String Body=GclassVehicle.Body();
		if(Body.isEmpty()){
			logger.createNode("Body Number is not displayed on Thin client for the G-Class vehicle");		
		}else{
			logger.createNode("Body Number is displayed on Thin client for the G-Class vehicle is: " + Body);	
		}
		
		String PlatformNumber= GclassVehicle.PlatformNumber();
		if(PlatformNumber.isEmpty()){
			logger.createNode("Platform Number is not displayed on Thin client for the G-Class vehicle");		
		}else{
			logger.createNode("Platform Number displayed on Thin client for the G-Class vehicle is: " + PlatformNumber);		
		}
		
		
		String wdtransfercaseNo=GclassVehicle.wdtransfercaseNo();
		
		if(wdtransfercaseNo.isEmpty()){
			
			logger.createNode("4wd transfercaseNo. is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("4wd transfercaseNo. displayed on the ThinClient is:  " +  wdtransfercaseNo);

		}

		
		String wdtransfercaseNo_ObjectNumber=GclassVehicle.wdtransfercaseNo_ObjectNumber();

		if(wdtransfercaseNo_ObjectNumber.isEmpty()){
			
			logger.createNode("4wd transfercaseNo. Object Number is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("4wd transfercaseNo. Object Number displayed on the ThinClient is:  " +  wdtransfercaseNo_ObjectNumber);

		}
		
		String AllWheelDriveFrontAxleTransmission= GclassVehicle.AllWheelDriveFrontAxleTransmission();
		if(AllWheelDriveFrontAxleTransmission.isEmpty()){
		logger.createNode("All-wheel drive front axle transmission number is not displayed on Thin client for the G-Class vehicle");
		}else{
			logger.createNode("All-wheel drive front axle transmission number displayed on Thin client for the G-Class vehicle is: " + AllWheelDriveFrontAxleTransmission);
	
		}
		
		String Steering=GclassVehicle.Steering();
		
		if(Steering.isEmpty()){
			
			logger.createNode("Steering value is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("Steering Number displayed on the ThinClient is:  " +  Steering);

		}
		
		String Steering_ObjectNumber=GclassVehicle.Steering_ObjectNumber();
																														 
		
		if(Steering_ObjectNumber.isEmpty()){
			
			logger.createNode("Steering Object Number is not displayed on Thin client for the G-Class vehicle");
			
		}
		else{
			
			logger.createNode("Steering Object Number displayed on the ThinClient is:  " +  Steering_ObjectNumber);

		}

		
	}
	
	@Test(priority = 3)
	public void MajorAssemblyTabTest_PlantMajorAssembly(){
		
		logger = extent.createTest("U-234: Plant Major Assemblies Tab of Vehicle Data Module");
		logger.log(Status.INFO, "Fin Number entered and clicked on the Search button is: " + GclassVehicle.GlobalFin());

		
		GclassVehicle.PlantMajorAssemblies();
		logger.createNode("Plant Major Assemblies Tab is clicked on the ThinClient");
		
		GclassVehicle.PlantMajorAssemblies_EngineNumber();
		logger.createNode("Engine Number displayed for Plant Major Assembly Tab on the ThinClient is:  " +  GclassVehicle.PlantMajorAssemblies_EngineNumber());

		String PlantMajorAssemblies_EngineVariantNuber=GclassVehicle.PlantMajorAssemblies_EngineVariantNuber();
		if(PlantMajorAssemblies_EngineVariantNuber.isEmpty()){
			logger.createNode("Engine Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");	
		}else{
			logger.createNode("Engine Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_EngineVariantNuber);	
		}

		String PlantMajorAssemblies_EngineObjectNumber=GclassVehicle.PlantMajorAssemblies_EngineObjectNumber();
		if(PlantMajorAssemblies_EngineObjectNumber.isEmpty()){
			logger.createNode("Engine Object Number is not displayed for Plant Major Assembly on the ThinClient");
		}else{
		logger.createNode("Engine Object Number displayed for Plant Major Assembly Tab on the ThinClient is:  " +  PlantMajorAssemblies_EngineObjectNumber);
		}
		
		String PlantMajorAssemblies_Exhaust_AfterTreatment= GclassVehicle.PlantMajorAssemblies_Exhaust_AfterTreatment();
		
		if(PlantMajorAssemblies_Exhaust_AfterTreatment.isEmpty()){
			logger.createNode("Exhaust After Treatment Number is not displayed for Plant Major Assembly Tab on the ThinClient");	
		}else{
			logger.createNode("Exhaust After Treatment Number Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Exhaust_AfterTreatment);		
		}
		
		String PlantMajorAssemblies_Exhaust_AfterTreatment_Variant=GclassVehicle.PlantMajorAssemblies_Exhaust_AfterTreatment_Variant();
		if(PlantMajorAssemblies_Exhaust_AfterTreatment_Variant.isEmpty()){
			logger.createNode("Exhaust After Treatment Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");	
		}else{
			logger.createNode("Exhaust After Treatment Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Exhaust_AfterTreatment_Variant);	
					}
		
		String PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber=GclassVehicle.PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber();	
        if(PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber.isEmpty()){
			logger.createNode("Exhaust After Treatment Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");	
         }else{
 			logger.createNode("Exhaust After Treatment Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Exhaust_AfterTreatment_ObjectNumber);	
         }
		
         String PlantMajorAssemblies_TransmissionNumber=    GclassVehicle.PlantMajorAssemblies_TransmissionNumber();
    
         if(PlantMajorAssemblies_TransmissionNumber.isEmpty()){
 			logger.createNode("Transmission Number is not displayed for Plant Major Assembly Tab on the ThinClient");	 
         }else{
 			logger.createNode("Transmission Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_TransmissionNumber);	
         }
        
         
         String PlantMajorAssemblies_TransmissionNumber_VariantNumber=  GclassVehicle.PlantMajorAssemblies_TransmissionNumber_VariantNumber();
     
         if(PlantMajorAssemblies_TransmissionNumber_VariantNumber.isEmpty()){
  			logger.createNode("Transmission Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");	 
         }else{
  			logger.createNode("Transmission Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_TransmissionNumber_VariantNumber);	 

         }
         
       String PlantMajorAssemblies_TransmissionNumber_ObjectNumber= GclassVehicle.PlantMajorAssemblies_TransmissionNumber_ObjectNumber();
       
       if(PlantMajorAssemblies_TransmissionNumber_ObjectNumber.isEmpty()){
 			logger.createNode("Transmission Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");	   
       }else{
 			logger.createNode("Transmission Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_TransmissionNumber_ObjectNumber);
 			
       }
       
      String PlantMajorAssemblies_TransferCaseNumber=  GclassVehicle.PlantMajorAssemblies_TransferCaseNumber();
      
      if(PlantMajorAssemblies_TransferCaseNumber.isEmpty()){
    	  logger.createNode("TransferCase Number is not displayed for Plant Major Assembly Tab on the ThinClient"); 
      }else{
    	  logger.createNode("TranferCase Number displayed for Plant Major Assembly Tab on the ThinClient is: " +PlantMajorAssemblies_TransferCaseNumber );
      }
         
      
     String PlantMajorAssemblies_Transfercase_VariantNumber= GclassVehicle.PlantMajorAssemblies_Transfercase_VariantNumber();
     
     if(PlantMajorAssemblies_Transfercase_VariantNumber.isEmpty()){
   	  logger.createNode("TransferCase Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient"); 

     }else{
      	  logger.createNode("TransferCase Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Transfercase_VariantNumber); 
 
     }
      String PlantMajorAssemblies_Transfercase_ObjectNumber= GclassVehicle.PlantMajorAssemblies_Transfercase_ObjectNumber();
   
      if(PlantMajorAssemblies_Transfercase_ObjectNumber.isEmpty()){
    	  logger.createNode("TransferCase Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
      }else{
    	  logger.createNode("TransferCase Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Transfercase_ObjectNumber);   
  
      }
   
    String PlantMajorAssemblies_FrontAxle1=  GclassVehicle.PlantMajorAssemblies_FrontAxle1();
    
    if(PlantMajorAssemblies_FrontAxle1.isEmpty()){
  	  logger.createNode("Front Axle 1 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

    }else{
    	  logger.createNode("Front Axle 1 Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle1);   

    }
      
     String PlantMajorAssemblies_FrontAxle1VariantNumber=GclassVehicle.PlantMajorAssemblies_FrontAxle1VariantNumber();
     
     if(PlantMajorAssemblies_FrontAxle1VariantNumber.isEmpty()){
     	  logger.createNode("Front Axle 1 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
 
     }else{
    	  logger.createNode("Front Axle 1 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle1VariantNumber);   
 
     }
     
     
     String PlantMajorAssemblies_FrontAxle1ObjectNumber= GclassVehicle.PlantMajorAssemblies_FrontAxle1ObjectNumber();
     
     if(PlantMajorAssemblies_FrontAxle1ObjectNumber.isEmpty()){
    	  logger.createNode("Front Axle 1 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

     }else{
   	  logger.createNode("Front Axle 1 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle1ObjectNumber);   

     }
     
     
      String PlantMajorAssemblies_FrontAxle2=  GclassVehicle.PlantMajorAssemblies_FrontAxle2(); 
      
      if(PlantMajorAssemblies_FrontAxle2.isEmpty()){
    	  logger.createNode("Front Axle 2 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

      }else{
    	  logger.createNode("Front Axle 2 Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle2 );   

      }
      
     String PlantMajorAssemblies_FrontAxle2VariantNumber= GclassVehicle.PlantMajorAssemblies_FrontAxle2VariantNumber();
     
     if(PlantMajorAssemblies_FrontAxle2VariantNumber.isEmpty()){
   	  logger.createNode("Front Axle 2 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

     }else{
      	  logger.createNode("Front Axle 2 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle2VariantNumber);   
 
     }
     
    String PlantMajorAssemblies_FrontAxle2ObjectNumber= GclassVehicle.PlantMajorAssemblies_FrontAxle2ObjectNumber();
    
    if(PlantMajorAssemblies_FrontAxle2ObjectNumber.isEmpty()){
     	  logger.createNode("Front Axle 2 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

    }else{
   	  logger.createNode("Front Axle 2 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " +PlantMajorAssemblies_FrontAxle2ObjectNumber);   

    }
     
    
    String PlantMajorAssemblies_FrontAxle3=GclassVehicle.PlantMajorAssemblies_FrontAxle3();
    if(PlantMajorAssemblies_FrontAxle3.isEmpty()){
  	  logger.createNode("Front Axle 3 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

    }else{
    	  logger.createNode("Front Axle 3 Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle3);   

    }
    
    String PlantMajorAssemblies_FrontAxle3VariantNumber=GclassVehicle.PlantMajorAssemblies_FrontAxle3VariantNumber();
    
    if(PlantMajorAssemblies_FrontAxle3VariantNumber.isEmpty()){
    	  logger.createNode("Front Axle 3 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

    }else{
  	  logger.createNode("Front Axle 3 Variant Number displayed for Plant Major Assembly Tab on the ThinClient");   

    }
    
   String PlantMajorAssemblies_FrontAxle4= GclassVehicle.PlantMajorAssemblies_FrontAxle4();
   
   if(PlantMajorAssemblies_FrontAxle4.isEmpty()){
 	  logger.createNode("Front Axle 4 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
 
   }else{
	 	  logger.createNode("Front Axle 4 Number displayed for Plant Major Assembly Tab on the ThinClient " + PlantMajorAssemblies_FrontAxle4);   

   }
    
   String PlantMajorAssemblies_FrontAxle4VariantNumber=GclassVehicle.PlantMajorAssemblies_FrontAxle4VariantNumber();
   
   if(PlantMajorAssemblies_FrontAxle4VariantNumber.isEmpty()){
	 	  logger.createNode("Front Axle 4 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

   }else{
	 	  logger.createNode("Front Axle 4 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle4VariantNumber);   

   }
    
   
  String PlantMajorAssemblies_FrontAxle4ObjectNumber= GclassVehicle.PlantMajorAssemblies_FrontAxle4ObjectNumber();
  
    if(PlantMajorAssemblies_FrontAxle4ObjectNumber.isEmpty()){
	 	  logger.createNode("Front Axle 4 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

    }else{
	 	  logger.createNode("Front Axle 4 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_FrontAxle4ObjectNumber );   

    }
    
		String PlantMajorAssemblies_RearAxle1=GclassVehicle.PlantMajorAssemblies_RearAxle1();
		if(PlantMajorAssemblies_RearAxle1.isEmpty()){
		 	  logger.createNode("Rear Axle 1 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

		}
		logger.createNode("Rear Axle1 displayed for Plant Assembly on the ThinClient is:  " +  GclassVehicle.PlantMajorAssemblies_RearAxle1());

	String PlantMajorAssemblies_RearAxle1_VariantNumber=GclassVehicle.PlantMajorAssemblies_RearAxle1_VariantNumber();
	
	if(PlantMajorAssemblies_RearAxle1_VariantNumber.isEmpty()){
	 	  logger.createNode("Rear Axle 1 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

	}else{
	 	  logger.createNode("Rear Axle 1 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle1_VariantNumber);   

	}
	
	String PlantMajorAssemblies_RearAxle1_ObjectNumber=GclassVehicle.PlantMajorAssemblies_RearAxle1_ObjectNumber();
	
	if(PlantMajorAssemblies_RearAxle1_ObjectNumber.isEmpty()){
	 	  logger.createNode("Rear Axle 1 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

	}else{
	 	  logger.createNode("Rear Axle 1 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle1_ObjectNumber);   

	}
	
	String PlantMajorAssemblies_RearAxle2=GclassVehicle.PlantMajorAssemblies_RearAxle2();
	
	if(PlantMajorAssemblies_RearAxle2.isEmpty()){
	 	  logger.createNode("Rear Axle 2 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

	}else{
	 	  logger.createNode("Rear Axle 2 Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle2);   

	}
	
	String PlantMajorAssemblies_RearAxle2_VariantNumber=GclassVehicle.PlantMajorAssemblies_RearAxle2_VariantNumber();
	if(PlantMajorAssemblies_RearAxle2_VariantNumber.isEmpty()){
	 	  logger.createNode("Rear Axle 2 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
	}else{
	 	  logger.createNode("Rear Axle 2 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle2_VariantNumber);   

	}
	
	String PlantMajorAssemblies_RearAxle2_ObjectNumber= GclassVehicle.PlantMajorAssemblies_RearAxle2_ObjectNumber();
	if(PlantMajorAssemblies_RearAxle2_ObjectNumber.isEmpty()){
	 	  logger.createNode("Rear Axle 2 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
	}else{
	 	  logger.createNode("Rear Axle 2 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle2_ObjectNumber);   

	}
	
	String PlantMajorAssemblies_RearAxle3=GclassVehicle.PlantMajorAssemblies_RearAxle3();
	
	if(PlantMajorAssemblies_RearAxle3.isEmpty()){
	 	  logger.createNode("Rear Axle 3 Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
	}else{
	 	  logger.createNode("Rear Axle 3 Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle3);   

	}
	
	String PlantMajorAssemblies_RearAxle3_VariantNumber= GclassVehicle.PlantMajorAssemblies_RearAxle3_VariantNumber();
	
	if(PlantMajorAssemblies_RearAxle3_VariantNumber.isEmpty()){
	 	  logger.createNode("Rear Axle 3 Variant Number is not displayed for Plant Major Assembly Tab on the ThinClient");   

	}else{
	 	  logger.createNode("Rear Axle 3 Variant Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle3_VariantNumber);   

	}
	
	String PlantMajorAssemblies_RearAxle3_ObjectNumber=GclassVehicle.PlantMajorAssemblies_RearAxle3_ObjectNumber();
		if(PlantMajorAssemblies_RearAxle3_ObjectNumber.isEmpty()){
		 	  logger.createNode("Rear Axle 3 Object Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
		}else{
		 	  logger.createNode("Rear Axle 3 Object Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_RearAxle3_ObjectNumber);   
		}
		
		String PlantMajorAssemblies_Body=GclassVehicle.PlantMajorAssemblies_Body();
		
		if(PlantMajorAssemblies_Body.isEmpty()){
		 	  logger.createNode("Body Number is not displayed for Plant Major Assembly Tab on the ThinClient");   
		}
		else{
		 	  logger.createNode("Body Number displayed for Plant Major Assembly Tab on the ThinClient is: " + PlantMajorAssemblies_Body);   

		}
	}
	
	@Test(priority=4)
	public void MajorAssemblyTabTest_AlternativeDrive(){
		
		GclassVehicle.AlternativeDrive_ContentTab();
		
		logger.createNode("Alternative Drive contents button is clicked on the ThinClient");

		
		GclassVehicle.AlternativeDrive_Content();
		
		logger.createNode("Alternative Drive contents displayed on the ThinClient is:  " +  GclassVehicle.AlternativeDrive_Content());

	}
	
	@Test(priority = 5)
	public void ThirdParty_MajorAssemblies_Content(){
		
		logger = extent.createTest("U-002: ThirdParty MajorAssemblies Content of Major Assemblies Tab");
		logger.log(Status.INFO, "TestCaseID: TC-005");
		logger.log(Status.INFO, "Fin Number entered and clicked on the Search button is: " + GclassVehicle.GlobalFin());


		
		String ThirdParty_MajorAssemblies_Content= GclassVehicle.ThirdParty_MajorAssemblies_Content();
		
		if(ThirdParty_MajorAssemblies_Content.isEmpty()){
			logger.createNode("ThirdParty MajorAssemblies Content are not displayed for the Gclass vehicle");
	
		}else{
			logger.createNode("ThirdParty MajorAssemblies Content displayed are" +  ThirdParty_MajorAssemblies_Content);

		}
		

	}
	
	@Test(priority = 6)
	
	public void CodesTab() throws InterruptedException{
		
		GclassVehicle.CodesTab();
		logger = extent.createTest("Codes Tab values of Vehicle Data Module");
		logger.createNode("Hide Designation button is clicked, only codes are displayed on the Thin client");
		logger.createNode("Show designation button is clicked, vehicle codes and their description appears on the Thin client");
		logger.createNode("Codes are rearranged in the descending order after sorting");
		logger.createNode("Codes are rearranged to ascending order on clicking Reset Sorting button");

		
	}
	
	@Test(enabled=false)
	public void VPDandSerialNumberTab(){
		
		GclassVehicle.VPDandSerialNumberTab();
		
		logger = extent.createTest("VPD and Serial Number Tab of Vehicle Data Module");
		logger.createNode("VPD Ident Table is rearranged in the descending order after sorting");
		logger.createNode("Filter button is clicked and the data entered in the search field is 111");
		logger.createNode("Serial Number Table is reaaranged in the descending order after sorting");
		logger.createNode("Filter button is clicked and the data entered in the search field is 55");

		
	}
	
	@Test(enabled=false)
	public void ControlUnitTab(){
		
		GclassVehicle.ControlUnitTab();
		logger = extent.createTest("Control Unit Tab of Vehicle Data Module");
		logger.createNode("Control Unit contents are reaaranged in the descending order after sorting");
		logger.createNode("Control Unit Contents are rearranged in ascending order on clicking Reset Sorting button");


		
	}
	
	@Test(enabled=false)
	public void TheftRelevantDataTab(){
		
		GclassVehicle.TheftRelevantTab();
		logger = extent.createTest("Theft-relevant Data Tab of Vehicle Data Module");
		
		GclassVehicle.TheftRelevantTab_LockType();
		logger.createNode("Lock Type displayed in the Thin client is: " + GclassVehicle.TheftRelevantTab_LockType());
		
		GclassVehicle.TheftRelevantTab_CommandNumber();
		logger.createNode("COMAND device number displayed in the Thin client is: " + GclassVehicle.TheftRelevantTab_CommandNumber());

		
	}
	
	@Test(enabled=false)
	public void HistoryTab(){
		
		GclassVehicle.HistoryTab();
		
		logger = extent.createTest("History Tab of Vehicle Data module");
		logger.createNode("Technical entry button is clicked in the History tab");
		logger.createNode("History of Dependent object button is clicked in the History");
		logger.createNode("Initial State button is clicked in the History tab");

	}
	
	@Test(enabled=false)
	public void HistoryTab_CurrentState(){
		
		GclassVehicle.HistoryTab_CurrentState();
		logger.createNode("Current State button is clicked in the History tab");

		
	}
	
	@Test(enabled=false)
	public void DataValidationTab(){
		
		GclassVehicle.DataValidationTab();
		logger = extent.createTest("Data Validation Tab of Vehicle Data module");
		logger.createNode("Arrow button is clicked and navigated to the History tab");
		logger.createNode("Rule violation tab is rearranged in descending order");
		
		
		
	}
	
	@Test(enabled=false)
	public void DataValidationTab_ValidationRules(){
		
		GclassVehicle.DataValidationTab_ValidationRules();
		
		
	}
	
	@Test(enabled=false)
	public void DataValidationTab_VPDComparison(){
		
		GclassVehicle.DataValidationTab_VPDComparison();
		
	}
	
	@Test(enabled=false)
	public void SalesDataTab(){
		
		GclassVehicle.SalesDataTab();
		logger = extent.createTest("Sales Data Tab of Vehicle Data module");
		
		GclassVehicle.SalesDataTab_SalesUnit();
		
		logger.createNode("Sales Unit displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_SalesUnit() );
		
		GclassVehicle.SalesDataTab_SalesUnit_designation();
		logger.createNode("Sales Unit Designation displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_SalesUnit_designation() );

		GclassVehicle.SalesDataTab_ConsumerCountry();
		logger.createNode("Consumer Country Code displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_ConsumerCountry() );

		GclassVehicle.SalesDataTab_ConsumerCountry_Designation();
		logger.createNode("Consumer Country Designation displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_ConsumerCountry_Designation() );


		
		GclassVehicle.SalesDataTab_TechnicalStateDate();
		logger.createNode("Technical State date displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_TechnicalStateDate() );
		
		GclassVehicle.SalesDataTab_FinalAcceptanceDate();
		logger.createNode("Final Acceptance date displayed on the Thinclient is: " + GclassVehicle.SalesDataTab_FinalAcceptanceDate() );
		
	}
	
	@Test(enabled=false)
	public void CertificationTabTest() throws InterruptedException{
		
		GclassVehicle.CertificationTab_DocumentKey();
		logger = extent.createTest("Certification Tab Test of Vehicle Data module");
		logger.createNode("Document Key displayed in the Thin client is: " + GclassVehicle.CertificationTab_DocumentKey());


		String Brand=GclassVehicle.CertificationTab_Brand();
		
		if(Brand.isEmpty()){
			
			logger.createNode("Brand Name is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Brand Name displayed in the Thin client is: " + Brand);

		}

	
		String Fuel=GclassVehicle.CertificationTab_Fuel();
		
		if(Fuel.isEmpty()){
			
			logger.createNode("Fuel Type is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Fuel Type displayed in the Thin client is: " + Fuel);

		}

		
		String CertificationTab_Version= GclassVehicle.CertificationTab_Version();
		
		if(CertificationTab_Version.isEmpty()){
			
			logger.createNode("Version Number is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Version Number displayed in the Thin client is: " + CertificationTab_Version);

		}

		String CertificationTab_SalesDesignation=GclassVehicle.CertificationTab_SalesDesignation();
		
		if(CertificationTab_SalesDesignation.isEmpty()){
			
			logger.createNode("Sales Designation is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Sales Designation displayed in the Thin client is: " + CertificationTab_SalesDesignation);

		}

		
		String CertificationTab_Displayment=GclassVehicle.CertificationTab_Displayment();
		
		if(CertificationTab_Displayment.isEmpty()){
			
			logger.createNode("Displacement is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Displcement displayed in the Thin client is: " + CertificationTab_Displayment);

		}

		
	String CertificationTab_Version1=GclassVehicle.CertificationTab_Version();
		
		if(CertificationTab_Version1.isEmpty()){
			
			logger.createNode("Version is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Version displayed in the Thin client is: " + CertificationTab_Version1);

		}

		String CertificationTab_ManufacturerCode=GclassVehicle.CertificationTab_ManufacturerCode();
		
		if(CertificationTab_ManufacturerCode.isEmpty()){
			
			logger.createNode("Manufacturer Code is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Manufacturer Code displayed in the Thin client is: " + CertificationTab_ManufacturerCode);

		}
		
		

		
		String CertificationTab_OutputKW= GclassVehicle.CertificationTab_OutputKW();
		
		if(CertificationTab_OutputKW.isEmpty()){
			
			logger.createNode("OutputKW is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("OutputKW displayed in the Thin client is: " + CertificationTab_OutputKW);

		}
		

		String CertificationTab_EUapprovalNumber=GclassVehicle.CertificationTab_EUapprovalNumber();
		
		if(CertificationTab_EUapprovalNumber.isEmpty()){
			
			logger.createNode("EU Approval Number is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("EU Approval Number displayed in the Thin client is: " + CertificationTab_EUapprovalNumber);

		}

		
		String CertificationTab_IndexOfModelCodes=GclassVehicle.CertificationTab_IndexOfModelCodes();

		
		if(CertificationTab_IndexOfModelCodes.isEmpty()){
			
			logger.createNode("Index Of Model Codes is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Index Of Model Codes displayed in the Thin client is: " + CertificationTab_IndexOfModelCodes);

		}
		
		String CertificationTab_EUaprovalDate=GclassVehicle.CertificationTab_EUaprovalDate();
		
		if(CertificationTab_EUaprovalDate.isEmpty()){
			
			logger.createNode("EU approval Date is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("EU approval Date displayed in the Thin client is: " + CertificationTab_EUaprovalDate);

		}

		
		String CertificationTab_ExhaustGuidelines=GclassVehicle.CertificationTab_ExhaustGuidelines();
		
		
		if(CertificationTab_ExhaustGuidelines.isEmpty()){
			
			logger.createNode("Exhaust Guidelines is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Exhaust Guidelines displayed in the Thin client is: " + CertificationTab_ExhaustGuidelines);

		}

		
		String CertificationTab_EmissionsStandards=GclassVehicle.CertificationTab_EmissionsStandards();

		if(CertificationTab_EmissionsStandards.isEmpty()){
			
			logger.createNode("Emissions Standards is not displayed on the Thin client for the G-Class Vehicle");	
		}
		else{
			
			logger.createNode("Emissions Standards displayed in the Thin client is: " + CertificationTab_EmissionsStandards);

		}
		
		
	}
	
	@Test(enabled=false)
	public void Certification_TiresTab(){
		
		GclassVehicle.CertificationTab_TiresTab();
	}
	
	@Test(enabled=false)
	public void ModelPlateTab(){
		
	String ModelPlateTab=GclassVehicle.ModelPlateTab();
	
		logger = extent.createTest("Model Plate Tab Test of Vehicle Data module");
		
		
		if(ModelPlateTab.isEmpty()){
			
			logger.createNode("Perm Gross Vehicle Weight is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Perm Gross Vehicle Weight displayed in the Thin client is: " + ModelPlateTab);


		}
		
		String ModelPlateTab_PermGrossCombWeight=GclassVehicle.ModelPlateTab_PermGrossCombWeight();

		if(ModelPlateTab_PermGrossCombWeight.isEmpty()){
			
			logger.createNode("Perm Gross Comb Weight is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Perm Gross Comb Weight displayed in the Thin client is: " + ModelPlateTab_PermGrossCombWeight);

		}

		String ModelPlateTab_Permissible_axle_loadAxle1=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle1();

	if(ModelPlateTab_Permissible_axle_loadAxle1.isEmpty()){
			
			logger.createNode("Permissible axle loadAxle 1 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle loadAxle 1 displayed in the Thin client is: " + ModelPlateTab_Permissible_axle_loadAxle1);

		}
		
		
	String ModelPlateTab_Permissible_axle_loadAxle2=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle2();

	if(ModelPlateTab_Permissible_axle_loadAxle2.isEmpty()){
			
			logger.createNode("Permissible axle loadAxle 2 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle loadAxle 2 displayed in the Thin client is: " + GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle2());

		}
	
		
		
	String ModelPlateTab_Permissible_axle_loadAxle3=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle3();

	if(ModelPlateTab_Permissible_axle_loadAxle3.isEmpty()){
			
			logger.createNode("Permissible axle loadAxle 3 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle loadAxle 3 displayed in the Thin client is: " + ModelPlateTab_Permissible_axle_loadAxle3);

		}
	
		
		String ModelPlateTab_Permissible_axle_loadAxle4=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle4();

	if(ModelPlateTab_Permissible_axle_loadAxle4.isEmpty()){
			
			logger.createNode("Permissible axle load Axle4 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle load Axle4 displayed in the Thin client is: " + ModelPlateTab_Permissible_axle_loadAxle4);

		}
	
		
		String ModelPlateTab_Permissible_axle_loadAxle5=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle5();

	if(ModelPlateTab_Permissible_axle_loadAxle5.isEmpty()){
			
			logger.createNode("Permissible axle loadAxle5 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle loadAxle5 displayed in the Thin client is: " + ModelPlateTab_Permissible_axle_loadAxle5);

		}
	
		
		String ModelPlateTab_Permissible_axle_loadAxle6=GclassVehicle.ModelPlateTab_Permissible_axle_loadAxle6();

	if(ModelPlateTab_Permissible_axle_loadAxle6.isEmpty()){
			
			logger.createNode("Permissible axle loadAxle6 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible axle loadAxle6 displayed in the Thin client is: " + ModelPlateTab_Permissible_axle_loadAxle6);

		}
	

		String ModelPlateTab_Permissible_loadof_Axlegroup1= GclassVehicle.ModelPlateTab_Permissible_loadof_Axlegroup1();

	if(ModelPlateTab_Permissible_loadof_Axlegroup1.isEmpty()){
			
			logger.createNode("Permissible load of Axlegroup1 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible load of Axlegroup1 displayed in the Thin client is: " + ModelPlateTab_Permissible_loadof_Axlegroup1);

		}
	
		
		String ModelPlateTab_Permissible_loadof_Axlegroup2= GclassVehicle.ModelPlateTab_Permissible_loadof_Axlegroup2();

	if(ModelPlateTab_Permissible_loadof_Axlegroup2.isEmpty()){
			
			logger.createNode("Permissible load of Axlegroup2 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible load of Axlegroup2 displayed in the Thin client is: " + ModelPlateTab_Permissible_loadof_Axlegroup2);

		}
	
		
		String ModelPlateTab_Permissible_loadof_Axlegroup3=GclassVehicle.ModelPlateTab_Permissible_loadof_Axlegroup3();

	if(ModelPlateTab_Permissible_loadof_Axlegroup3.isEmpty()){
			
			logger.createNode("Permissible load of Axlegroup3 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible load of Axlegroup3 displayed in the Thin client is: " + ModelPlateTab_Permissible_loadof_Axlegroup3);

		}
	
		
	 String ModelPlateTab_Permissible_loadof_Axlegroup4=GclassVehicle.ModelPlateTab_Permissible_loadof_Axlegroup4();

	if(ModelPlateTab_Permissible_loadof_Axlegroup4.isEmpty()){
			
			logger.createNode("Permissible load of Axlegroup4 is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("Permissible load of Axlegroup4 displayed in the Thin client is: " + ModelPlateTab_Permissible_loadof_Axlegroup4);

		}
	
		

		String ModelPlateTab_Object_no_modelplate=GclassVehicle.ModelPlateTab_Object_no_modelplate();
		

		if(ModelPlateTab_Permissible_loadof_Axlegroup4.isEmpty()){
				
				logger.createNode("Object no modelplate is not displayed on the Thin client for the G-Class Vehicle ");	
			}
			else{
				
				logger.createNode("Object no modelplate displayed in the Thin client is: " + ModelPlateTab_Object_no_modelplate);

			}

		
		String ModelPlateTab_EUapprovalnumber=GclassVehicle.ModelPlateTab_EUapprovalnumber();

		if(ModelPlateTab_EUapprovalnumber.isEmpty()){
			
			logger.createNode("EU approvalnumber is not displayed on the Thin client for the G-Class Vehicle ");	
		}
		else{
			
			logger.createNode("EU approvalnumber displayed in the Thin client is: " + ModelPlateTab_EUapprovalnumber);

		}
		
		
	}
	
	@Test(enabled=false)
	public void EquipmentTab(){
		
		GclassVehicle.EquipmentTab_PaintsTable();
		logger = extent.createTest("Equipment Tab Test of Vehicle Data module");
		logger.createNode("Paint table is sorted on clicking Paints Table");
	
	}
	
	
	@Test(enabled=false)
	public void EquipmentTabTiresTable(){
		
		GclassVehicle.EquipmentsTab_TiresTable();
		logger.createNode("Tires table is sorted on clicking Paints Table");

		
	}
	
    @Test(enabled=false)
	
	public void LoggingTab(){
		
		vehicledatapage.LoggingTab();
		
		logger = extent.createTest("Logging tab of Vehicle Data Module");
		
		logger.createNode("Logging Table is rearranged in descending order ");

		
	}
	
	
	
	@AfterMethod
	public void teardown1(ITestResult result) throws IOException{
		
		if(result.getStatus()== ITestResult.SUCCESS){
			
			logger.log(Status.PASS, "Test Case passed is " + result.getName() );
			
			String screenshotPath=VehicleDataPageTest.getScreenshot(driver, result.getName());
			
			 logger.addScreenCaptureFromPath(screenshotPath);
			
			
		}
		
		else if(result.getStatus()== ITestResult.FAILURE){
			
			logger.log(Status.FAIL, "Test Case Failed is " + result.getName() );
			
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
