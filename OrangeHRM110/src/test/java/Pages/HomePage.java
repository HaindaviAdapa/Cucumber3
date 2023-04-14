package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	public void HomePage(WebDriver driver1)
	{
		this.driver=driver1;
	}

  public void Logout() {
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
			driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
			driver.findElement(By.xpath("//a[text()='Logout']")).click();  
			
	  
  }
  
  
}
