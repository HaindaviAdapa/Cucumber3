package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class JobsPage {
	
	WebDriver driver;
	
	
	public void JobsPage(WebDriver driver1)
	{
		this.driver=driver1;
	}
	
  
  public void AddJobs(String JobTitle1,String JobDescr1,String JobNote1) throws InterruptedException {
	  
	  Thread.sleep(5000); 
		
		driver.findElement(By.xpath("//span[text()='Admin']")).click(); //Admin
		driver.findElement(By.xpath("//span[text()='Job ']")).click(); //Jobs
		driver.findElement(By.xpath("//a[text()='Job Titles']")).click(); //Job Titles
		
		Thread.sleep(5000); 
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click(); //Add button
		
		
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(JobTitle1);
		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys(JobDescr1);
		driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys(JobNote1);
		
		
		Thread.sleep(5000); //execution will be passed for 5 seconds
			
		driver.findElement(By.xpath("//button[@type='submit']")).click();  //Save
  }
  
  
}
