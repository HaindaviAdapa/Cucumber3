package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class NationalityPage {
	
	WebDriver driver;
	
	
	public void NationalityPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
  
  public void AddNationality(String NationalityText3) throws InterruptedException {
	  
	  driver.findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
	  driver.	findElement(By.xpath("//a[text()='Nationalities']")).click();//Nationalities
	  driver.findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Addbuttonn
	  driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(NationalityText3);
		
		Thread.sleep(5000);
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  
  
  
}
