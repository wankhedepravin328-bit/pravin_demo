package azaka_survey;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Survey_Test_Class {


       
       WebDriver driver ;
       File Myfile;
       Sheet mysheet;
       Login_Page login;
       Home_page home;
       
       @BeforeClass
       public void Launch_Browser() throws EncryptedDocumentException, InvalidFormatException, IOException {
    	   
           WebDriverManager.chromedriver().setup();

            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://azkasurvey.com/login");
            Reporter.log("Launching Azka_Survey",true);
            Myfile=new File("C:\\Users\\Ganesha\\Pictures\\Playwrite Notes\\Book1.xlsx");
            mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
            login=new Login_Page(driver);
            home=new Home_page(driver);
            
            
       }
       @BeforeMethod
       public void login_to_Azaka() {
    	   login.Enter_User_Id(mysheet.getRow(0).getCell(0).getStringCellValue());
    	   Reporter.log("Successfully enter the User_ID",true);
    	   login.Enter_Password(mysheet.getRow(0).getCell(1).getStringCellValue());
    	   Reporter.log("Successfully enter the password",true);
    	   
    	   
       }
       @Test
       public void validate_welcome_login() {
    	   String expected_wel_msg = mysheet.getRow(1).getCell(1).getStringCellValue();
    	   String actual_wel_msg = home.get_welcome_msg();
    	   Reporter.log("welcome message is showing",true);
    	   Assert.assertEquals(actual_wel_msg, expected_wel_msg, "TC failed when actual and expected user id not matched");
    	   Reporter.log("Actul and expected welcome message is same TC is passed",true);
    	   
       }
       @AfterMethod
       public void logout_application() throws InterruptedException {
    	   home.Click_Sign_On_Button();
    	   Thread.sleep(100);
    	   Reporter.log("Application successfully logout");
       }
       @AfterClass
       public void closeBrowser()
       {
    	   Reporter.log("successfully logout the browser");
    	   driver.close();
       }

	}


