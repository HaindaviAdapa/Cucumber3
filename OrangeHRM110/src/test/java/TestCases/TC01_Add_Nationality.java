package TestCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;
import Pages.NationalityPage;
import Pages.SkillsPage;
import ExcelUtil.ExcelApiTest4;


public class TC01_Add_Nationality {
	
	
	WebDriver driver;
	//Step1 - Declare Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName,Password;
	String NationalityText;
	
	//Core java concept
		Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();
		
	
	
  @Test
  public void NationalityTest() throws Exception {
	  
	  ExcelApiTest4 E1=new ExcelApiTest4();
	  
	  Datatable=E1.getDataTable("D:\\OrangeHRM117\\src\\test\\java\\ExcelUtil\\TestData1.xlsx", "Sheet1");
	  
	  
		UserName=Datatable.get("TC03").get("UserName");
		Password=Datatable.get("TC03").get("PassWord");
		NationalityText=Datatable.get("TC03").get("NationalityText");
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();    // driver=111222
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
		driver.get(TestURL);
		
		LoginPage L1=new LoginPage();
		L1.LoginPage(driver);
		L1.Login(UserName,Password);
		
		
		NationalityPage N1=new NationalityPage();
		N1.NationalityPage(driver);
		N1.AddNationality(NationalityText);//Step2
		
		
		HomePage h1=new HomePage();
		h1.HomePage(driver);
		h1.Logout();
		
		
	  
	  
	  
  }
  
  
  
}
