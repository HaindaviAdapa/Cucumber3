package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SkillsPage {
	
	WebDriver driver;
	
	public void SkillsPage(WebDriver driver1)  //driver1=111222
	{
		this.driver=driver1;
	}
	
  
	
  public void AddSkills(String SkillName1,String SkillDescr1) throws InterruptedException {
	 
		driver.findElement(By.xpath("(//a[@class='oxd-main-menu-item'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		driver.findElement(By.xpath("//a[text()='Skills']")).click();
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(SkillName1);
		driver.findElement(By.xpath("//textarea[ @placeholder='Type description here']")).sendKeys(SkillDescr1);
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=' Save ']")).click();
	  
  }
  
  
  
}
