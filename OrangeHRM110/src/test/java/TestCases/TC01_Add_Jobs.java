package TestCases;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ExcelUtil.ExcelApiTest4;
import Pages.HomePage;
import Pages.JobsPage;
import Pages.LoginPage;

public class TC01_Add_Jobs {
	
	
	WebDriver driver;
	
	//Step1 - Declare Global Variables
	String TestURL="https://opensource-demo.orangehrmlive.com/";
	String UserName,Password;
	String JobTitle,JobDescr,JobNote;
	
	//Core java concept
		Map<String, HashMap<String, String>> Datatable = new HashMap<String, HashMap<String, String>>();
		
	
	
  @Test
  public void JobsTest() throws Exception {
	  
	  
	  ExcelApiTest4 E1=new ExcelApiTest4();
	  Datatable=E1.getDataTable("D:\\OrangeHRM117\\src\\test\\java\\ExcelUtil\\TestData1.xlsx", "Sheet1");
	  
	  
		UserName=Datatable.get("TC02").get("UserName");
		Password=Datatable.get("TC02").get("PassWord");
		JobTitle=Datatable.get("TC02").get("JobTitle");
		JobDescr=Datatable.get("TC02").get("JobDescr");
		JobNote=Datatable.get("TC02").get("JobNote");
	  
	    System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();    // driver=111222
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.manage().window().maximize() ;	
		driver.get(TestURL);
		
		LoginPage L1=new LoginPage();
		L1.LoginPage(driver);
		L1.Login(UserName,Password);
		
		JobsPage J1=new JobsPage();
		J1.JobsPage(driver);
		J1.AddJobs(JobTitle,JobDescr,JobNote);
		
		HomePage h1=new HomePage();
		h1.HomePage(driver);
		h1.Logout();
		
		
	  
	  
	  
  }
  
  
  
}
