package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	
	public void LoginPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
  
  public void Login(String UserName1,String PassWord1) {
	  
	  	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(UserName1);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(PassWord1);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  
}
